package Structural.AdapterPattern;
// Adapter Class
public class MediaAdapter implements MediaPlayer {
    private VlcPlayer vlcPlayer;

    public MediaAdapter() {
        vlcPlayer = new VlcPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            System.out.println(vlcPlayer);
            vlcPlayer.playVlc(fileName);
        } else {
            System.out.println("Invalid media type: " + audioType);
        }
    }
}
