package Structural.AdapterPattern;

// Adaptee Class for VLC Player
public class VlcPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file. Name: " + fileName);
    }
}