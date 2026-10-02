
public class StartLibraryTest {

    public static void main(String[] args){
        System.out.println("Started library simulation...");
        Library lib = new Library();
        lib.loadBooks();
        lib.printBooks();
        lib.borrowBooks();
        lib.printBooks();
        lib.returnBooks();
        lib.printBooks();
        System.out.println("Ending Simulation...");
    }
}

