public class Main {
    public static void main(String[] args) {
        //create all the folders
        Folder demo1 = new Folder("php_demo1");
        Folder sourceFiles = new Folder("Source Files");
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");


        //set up folder/file structure

        //level 1
        demo1.addSubFolder(sourceFiles);
        demo1.addSubFolder(includePath);
        demo1.addSubFolder(remoteFiles);

        //level 2
        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);

        //level 3
        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(views);

        publicFolder.addFile(".htaccess");
        publicFolder.addFile(".htrouter.php");
        publicFolder.addFile("index.html");

        //print out php_demo1
        System.out.println("Printing out php_demo1");
        demo1.print();


        //remove app subfolder
        System.out.println("\n\n\n Removed app");
        sourceFiles.removeSubFolder(app);
        demo1.print();

        //remove public folder
        System.out.println("\n\n\n Removed public");
        sourceFiles.removeSubFolder(publicFolder);
        demo1.print();


    }
}