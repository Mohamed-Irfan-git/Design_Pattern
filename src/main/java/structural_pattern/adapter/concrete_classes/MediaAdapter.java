package structural_pattern.adapter.concrete_classes;

import structural_pattern.adapter.interfaces.AdvancedMediaPlayer;
import structural_pattern.adapter.interfaces.MediaPlayer;

/**
 * this is the adapter bridge between the Media player with advanced media player
 *
 */
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer mediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("mp4")){
            mediaPlayer = new Mp4Playing();

        }else if(audioType.equalsIgnoreCase("vlc")){
            mediaPlayer = new VlcPlayer();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4")){
            mediaPlayer.playMp4(fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc")){
            mediaPlayer.playVlc(fileName);
        }

    }
}
