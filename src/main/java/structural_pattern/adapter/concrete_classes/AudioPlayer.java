package structural_pattern.adapter.concrete_classes;

import structural_pattern.adapter.interfaces.MediaPlayer;

/**
 * this class only client know aparrt from this client doent know
 *
 * we can add an example that is if a manager comes and says to developer
 * we need to change our player type so change to ne one
 * then old users use the old player so their usage should not effected
 * at the same time need to add new player for this kine f scenario we can use this pattern
 */
//client facing audio player
public class AudioPlayer implements MediaPlayer {

    //this Media Adapter is the our actual adaptor
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file Name: " + fileName);
        }
        else if (audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);

        } else if (audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid audio type"+audioType + "format not supported");
        }

    }
}
