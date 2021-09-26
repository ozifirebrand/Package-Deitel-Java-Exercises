package ClassWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MP3PlayerTest {
    MP3Player player;
    @BeforeEach
    public void setPlayer(){
        player = new MP3Player();
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
}