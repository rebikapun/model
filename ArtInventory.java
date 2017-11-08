package model;

public class ArtInventory {

    private int userID;
    private int loginID;
    private int workerID;
    private int artID;
    private int artistID;
    private String firstName;
    private String lastName;
    private String password;
    private String artName;
    private String artistName;
    private String artistInfo;
    private String artDescription;

    public ArtInventory(int userID, int loginID, int workerID, int artID, int artistID, String firstName, String lastName, String password, String artName, String artistName, String artistInfo, String artDescription) {
        this.userID = userID;
        this.loginID = loginID;
        this.workerID = workerID;
        this.artID = artID;
        this.artistID = artistID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.artName = artName;
        this.artistName = artistName;
        this.artistInfo = artistInfo;
        this.artDescription = artDescription;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getLoginID() {
        return loginID;
    }

    public void setLoginID(int loginID) {
        this.loginID = loginID;
    }

    public int getWorkerID() {
        return workerID;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    public int getArtID() {
        return artID;
    }

    public void setArtID(int artID) {
        this.artID = artID;
    }

    public int getArtistID() {
        return artistID;
    }

    public void setArtistID(int artistID) {
        this.artistID = artistID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getArtName() {
        return artName;
    }

    public void setArtName(String artName) {
        this.artName = artName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getArtistInfo() {
        return artistInfo;
    }

    public void setArtistInfo(String artistInfo) {
        this.artistInfo = artistInfo;
    }

    public String getArtDescription() {
        return artDescription;
    }

    public void setArtDescription(String artDescription) {
        this.artDescription = artDescription;
    }

    @Override
    public String toString() {
        return "ArtInventory{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", artName='" + artName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", artistInfo='" + artistInfo + '\'' +
                ", artDescription='" + artDescription + '\'' +
                '}';
    }
}
