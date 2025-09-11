package structural_pattern.adapter;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import structural_pattern.adapter.concrete_classes.AudioPlayer;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class AdapterPatternTest {
    private AudioPlayer audioPlayer;
    private ByteArrayOutputStream outputStream;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Testing started......");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("New test started......");
        audioPlayer = new AudioPlayer();
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    private String getOutput(){
        return outputStream.toString().trim();
    }


    @Test
    void audioPlayerTest(){
        audioPlayer.play("mp3","kabali.mp3");
        assertEquals("Playing mp3 file Name: kabali.mp3", getOutput(),"out put should be equal");

    }

    @Test
    void mp4PlayerTest(){
        audioPlayer.play("mp4","pappu.mp4");
        assertEquals("MP4 playing Name: pappu.mp4", getOutput(),"output should be equal");
    }

    @Test
    void vlcPlayerTest(){
        audioPlayer.play("vlc","pappu.vlc");
        assertEquals("VLC playing Name: pappu.vlc", getOutput(),"output should be equal");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Testing ended......");
    }


}
