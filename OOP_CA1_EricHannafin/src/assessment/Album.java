package assessment;

import javax.swing.*;
import java.util.Arrays;

public class Album {

    private String name;
    private Song[] tracks;
    private String producer;
    private int releaseYear;

    public Album(String name, Song[] tracks, String producer, int releaseYear) {
        setName(name);
        setTracks(tracks);
        setProducer(producer);
        setReleaseYear(releaseYear);
    }

    public void setName(String name) {
        if (name == "" || name == null){
            System.out.println("No name specified");
        }
        else{
            this.name = name;
        }
    }

    public void setTracks(Song[] tracks) {
        this.tracks = tracks;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public Song[] getTracks() {
        return tracks;
    }

    public String getProducer() {
        return producer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getNumberofTracks(Song[] songs) {
        int numofTracks = 0;
        for(int i = 0; i<songs.length; i++){
            numofTracks++;
        }

       return numofTracks;
    }

    public int getPlayingTime(Song[] songs) {
        int totalPLayTime = 0;
        for(int i = 0; i<songs.length; i++){
            totalPLayTime += songs.getDuration[i];
        }

        return totalPLayTime;
    }

    public String getPlayTrack(int track) {
        String trackPlay = "";
        if(track <1 || track > 5){
            JOptionPane.showMessageDialog(null,"An invalid track number was Supplied","Bad Track Number",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            if (track == 1){
                System.out.println("Now PLaying " + songs.getTitle[0]);
            }
            if (track == 2){
                System.out.println("Now PLaying " + songs.getTitle[1]);
            }
            if (track == 3){
                System.out.println("Now PLaying " + songs.getTitle[2]);
            }
            if (track == 4){
                System.out.println("Now PLaying " + songs.getTitle[3]);
            }
            if (track == 5){
                System.out.println("Now PLaying " + songs.getTitle[4]);
            }
        }
        return trackPlay;
    }

    @Override
    public String toString() {
        return "Album " +
                "name " + getName() +
                "tracks " + Arrays.toString(tracks) +
                "producer " + getProducer() + '\'' +
                "releaseYear " + getReleaseYear();
    }
}
