package structural_pattern.adapter.interfaces;


/**
 * adaptee interface which is used for advanced media player
 */
public interface AdvancedMediaPlayer {
    void playVlc(String filename);
    void playMp4(String filename);

}
