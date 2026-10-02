public class StandardUser extends User {
    
    public StandardUser(int userID, String name){
        super(userID, name);
        System.out.println("Standard user created with name = " + name);
    }
}
