package assessment;

import javax.swing.*;
import java.awt.*;

public class TestAlbum {

    public static void main(String[] args) {

        Song song1 = new Song("Sugar Baby Love","Rubettes","Pop",136,1977);
        Song song2 = new Song("Living on a Prayer","Bon Jovi","Rock",184,1985);
        Song song3 = new Song("Blue Suede Shoes","Elvis Presley","Pop",157,1963);
        Song song4 = new Song("Someone Like You","Adele","Pop",223,2013);
        Song song5 = new Song("House of Fun","Madness","Pop",178,1984);

        Song songs[] = new Song[5];

        songs[0] = song1;
        songs[1] = song2;
        songs[2] = song3;
        songs[3] = song4;
        songs[4] = song5;

        Album album = new Album("Now that's what I Call Music 98", songs,"Universal Music",2016);

        JTextArea textArea = new JTextArea();
        Font fond = new Font("Monospaced",Font.PLAIN,12);
        textArea.setFont(fond);

        textArea.setText(String.format("%-25s%-9s%-25s%-9s%-25s", "Name","Producer","ReleaseYear",
                "Number of Tracks", "Total PLaying Time"));

        String output = "";
//
//        for(int i = 0; i<songs.length;i++){
//
//            output += "Array Contents " + songs[i];
//        }


//        output += String.format("%-25s%-9s%-25s%-9s%-25s",album.getName(),album.getProducer(),album.getReleaseYear(),
//                album.getNumberofTracks(),getTotalPlayingTime);

      //  output += String.format("%-25s%-9s%-25s%-9s%-25s", album);

        textArea.append(output);

        JOptionPane.showMessageDialog(null,textArea,"Album Information",JOptionPane.INFORMATION_MESSAGE);

        String trackSelection = JOptionPane.showInputDialog("Which Tracks would you like to play? ");

        if (trackSelection == "1"){
            output += "Now Playing the track - details are as follows " + songs[0];
        }
        if (trackSelection == "2"){
            output += "Now Playing the track - details are as follows " + songs[1];
        }
        if (trackSelection == "3"){
            output += "Now Playing the track - details are as follows " + songs[2];
        }
        if (trackSelection == "4"){
            output += "Now Playing the track - details are as follows " + songs[3];
        }
        if (trackSelection == "5"){
            output += "Now Playing the track - details are as follows " + songs[4];
        }
        JOptionPane.showMessageDialog(null,output,"Album Tracks",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }
}
