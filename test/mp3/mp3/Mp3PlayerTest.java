package mp3.mp3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Mp3PlayerTest {
    Mp3Player mp3;

    @BeforeEach
    void setUp() {
        mp3 = new Mp3Player(false, false, 15, 1, new ArrayList<DefaultPlaylist>());
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    public void mp3PlayerIsOn(){
        assertFalse(mp3.getIson());
        mp3.setIsOn(true);
        assertTrue(mp3.getIson());
    }
    @Test
    public void mp3PlayerIsPaused(){
        mp3.setIsOn(true);
        assertFalse(mp3.getIspaused());
        mp3.setIspause(true);
        assertTrue(mp3.getIspaused());
    }
    @Test
    public void checkMp3CurrentVolume(){
        mp3.setIsOn(true);
        assertEquals(15, mp3.getVolume());
    }
    @Test
    public void increaseVolume(){
        mp3.setIsOn(true);
        mp3.increaseVolume();
        mp3.increaseVolume();
        assertEquals(25, mp3.getVolume());
    }
    @Test
    public void decreaseVolume(){
        mp3.setIsOn(true);
        mp3.increaseVolume();
        mp3.decreaseVolume();
        mp3.decreaseVolume();
        assertEquals(10, mp3.getVolume());
    }
    @Test
    public void nextMusic(){
        mp3.setIsOn(true);
        mp3.nextMusic();
    }
}
