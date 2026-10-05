

public abstract class User {

    private int userID;
    private String name;

    public User(String name){
        this.name = name;
    }
    
    public void setUserID(int userID){
        this.userID = userID;
    }

    public String getName(){
        return name;
    }

    public int getUserID(){
        return userID;
    }
}
