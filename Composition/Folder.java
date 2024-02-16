import java.util.ArrayList;

public class Folder {

    //File class (private to ensure we can't create file outside of folder
    private class File {

        private String name;

        public File(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void print() {
            System.out.println("Name: " + this.name);
        }
    }


    private String name;
    private ArrayList<Folder> subFolders;
    private ArrayList<File> files;

    public Folder(String name) {
        this.name = name;
        this.subFolders = new ArrayList<Folder>();
        this.files = new ArrayList<File>();
    }

    //getter and setter for folder name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getters for arraylists
    public ArrayList<Folder> getSubFolders() {
        return subFolders;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    //setters for arraylists
    public void setSubFolders(ArrayList<Folder> subFolders) {
        this.subFolders = subFolders;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }


    //Add file method
    public void addFile(String fileName) {

        //if file name is unique, add the file, otherwise dont
        for (File file : this.files) {
            if (file.getName().equals(fileName)) {
                return;
            }
        }
        this.files.add(new File((fileName)));
    }

    //remove file based on name
    public void removeFile(String fileName) {

        File targetFile = null;
        for (File file : this.files) {
            if (file.getName().equals(fileName)) {
                targetFile = file;
                break;
            }
        }

        //if targetFile was found, remove it
        if (targetFile != null) {
            this.files.remove(targetFile);
        }
    }


    //Add subfolder
    public void addSubFolder(Folder subfolder) {
        this.subFolders.add(subfolder);
    }

    //Remove subfolder
    public void removeSubFolder(Folder subfolder) {
        this.subFolders.remove(subfolder);
    }


    //method for printing out folder/file structure starting from this folder as a parent
    public void print() {
        System.out.println("--" + this.name);

        //iterate through each subfolder and call print method with increased level
        for (Folder subfolder : this.subFolders) {
            subfolder.print(2);
        }

        //iterate through files and print them
        if (!this.files.isEmpty()) {
            System.out.println("--Files: ");
            for (File file : this.files) {
                System.out.println("-- " + file.getName());
            }
        }

    }


    //method for printing out folder/file structure starting from this folder
    //but with provided int that represents the current nest level
    public void print(int level) {
        String indent = "--";

        //print current folder name
        for (int i = 0; i < level; i++) {
            System.out.print(indent);
        }
        System.out.println(this.name);
        //print out subfolders with increased level
        for (Folder subfolder : this.subFolders) {
            subfolder.print(level + 1);
        }

        //if there are files
        if (!this.files.isEmpty()) {
            //print "Files" with this level indent + 1
            for (int i = 0; i < level + 1; i++) {
                System.out.print(indent);
            }
            System.out.println("Files: ");

            //then go through each file and print out their names with level indent + 1
            for (File file : this.files) {
                for (int i = 0; i < level + 1; i++) {
                    System.out.print(indent);
                }
                System.out.println(" " + file.getName());
            }
        }


    }


}
