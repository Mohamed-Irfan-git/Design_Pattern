package structural_pattern.adapter.interfaces;

/**
 * target interface what client expect from system
 */
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
