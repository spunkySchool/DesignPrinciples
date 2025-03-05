package Structural.FacadePattern;

// DVD Player
class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is on.");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void stop() {
        System.out.println("Stopping the DVD Player.");
    }

    public void off() {
        System.out.println("DVD Player is off.");
    }
}

// Projector
class Projector {
    public void on() {
        System.out.println("Projector is on.");
    }

    public void setInput(String input) {
        System.out.println("Projector input set to: " + input);
    }

    public void off() {
        System.out.println("Projector is off.");
    }
}

// Sound System
class SoundSystem {
    public void on() {
        System.out.println("Sound System is on.");
    }

    public void setVolume(int level) {
        System.out.println("Setting volume to: " + level);
    }

    public void off() {
        System.out.println("Sound System is off.");
    }
}

// Lights
class Lights {
    public void dim(int level) {
        System.out.println("Dimming lights to: " + level + "%");
    }

    public void on() {
        System.out.println("Lights are on.");
    }
}