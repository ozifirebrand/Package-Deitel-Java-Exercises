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
        //when
        player.turnOnAndOff();
        //assert
        Assertions.assertTrue(player.isOn());
    }
}