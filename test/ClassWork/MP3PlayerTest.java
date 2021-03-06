package ClassWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MP3PlayerTest {
    MP3Player player;
    ArrayList<Playlist> lists;
    Playlist list;
//    Playlist myPlaylist;
    @BeforeEach
    public void setPlayer(){
        player = new MP3Player();
        list = new Playlist();
        lists = new ArrayList<>();
    }

    @Test
    public void mp3CanBeTurnedOn(){
        //given ...
        //when
        player.turnOnAndOff();
        //assert
        assertTrue(player.isOn());
    }

    @Test
    public void mp3CanBeTurnedOff(){
        //given ...
        player.turnOnAndOff();
        //when
        player.turnOnAndOff();
        //assert
        Assertions.assertFalse(player.isOn());
    }

    @Test
    public void testThatMP3CanPlayMusic(){
        //given ...
        player.turnOnAndOff();
        //when
        player.playMusic();
        //assert
        assertTrue(player.musicIsPlaying());
    }

    @Test
    @DisplayName("Test that MP3 volume can be increased in increments of 5%")
    public void testThatVolumeCanBeIncreased(){
        //given ...
        player.turnOnAndOff();
        player.playMusic();
        //when
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        //assert
        Assertions.assertEquals(100, player.viewVolumeLevel());
    }

    @Test
    @DisplayName("Test that MP3 volume can be increased in increments of 5%")
    public void testThatVolumeCanBeDecreased(){
        //given
        player.turnOnAndOff();
        player.turnVolumeUp();
        player.turnVolumeUp();
        player.turnVolumeUp();
        //when
        player.turnVolumeDown();
        player.turnVolumeDown();
        player.turnVolumeDown();
        player.turnVolumeDown();
        //assert
        Assertions.assertEquals(0, player.viewVolumeLevel());
    }

    @Test
    @DisplayName("Test that mp3 can pause music")
    public void testThatMp3CanPauseMusic() {
        //given ...
        player.turnOnAndOff();
        player.playMusic();
        //when
        player.playMusic();
        Assertions.assertFalse(player.musicIsPlaying());
    }

    @Test
    void testThatMp3CanNextMusic(){
        //given
        player.turnOnAndOff();
        player.playMusic();
        //when
        player.nextMusic();
        Assertions.assertEquals(2, player.showNextMusic());
    }
}