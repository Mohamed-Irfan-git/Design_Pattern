package structural_pattern.adapter.concrete_classes;

import structural_pattern.adapter.interfaces.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String filename) {
        System.out.println("VLC playing Name: " + filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}
