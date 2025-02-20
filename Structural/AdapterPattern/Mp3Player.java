package Structural.AdapterPattern;

// Concrete Class for MP3 Player
public class Mp3Player implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file. Name: " + fileName);
        } else {
            System.out.println("Invalid media type: " + audioType);
        }
    }
}