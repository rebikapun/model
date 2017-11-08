package model;

public class Art {

    private int artID;
    private int artistID;
    private String artName;
    private String artistInfo;
    private String artDescription;

    public Art(int artID, int artistID, String artName, String artistInfo, String artDescription) {
        this.artID = artID;
        this.artistID = artistID;
        this.artName = artName;
        this.artistInfo = artistInfo;
        this.artDescription = artDescription;
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

    public String getArtName() {
        return artName;
    }

    public void setArtName(String artName) {
        this.artName = artName;
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
        return "Art{" +
                "artID=" + artID +
                ", artistID=" + artistID +
                ", artName='" + artName + '\'' +
                ", artistInfo='" + artistInfo + '\'' +
                ", artDescription='" + artDescription + '\'' +
                '}';
    }

}
