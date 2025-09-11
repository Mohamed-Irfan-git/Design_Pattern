package structural_pattern.adapter;

import structural_pattern.adapter.concrete_classes.AudioPlayer;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp4","movie mp4");
    }
}
