package structural_pattern.adapter.concrete_classes;

import structural_pattern.adapter.interfaces.AdvancedMediaPlayer;

public class Mp4Playing implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("MP4 playing Name: " + filename);
    }
}
