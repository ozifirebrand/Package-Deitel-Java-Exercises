package ClassWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
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
        //whem
        player.playMusic();
        //assert
        assertTrue(player.musicIsPlaying());
    }
}