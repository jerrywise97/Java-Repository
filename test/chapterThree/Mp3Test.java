package chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Mp3Test {
    Mp3 beatBox;

    @BeforeEach
    void setUp() {
        beatBox = new Mp3(false, 8, true, 17);
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    public void beatBoxIsOn(){
        assertFalse(beatBox.getIsOn());
        beatBox.setIsOn(true);
        assertTrue(beatBox.getIsOn());
    }
    @Test
    public void checkForVolume(){
        beatBox.setIsOn(true);
        assertEquals(8, beatBox.getVolume());
        beatBox.setVolume(27);
        assertEquals(27, beatBox.getVolume());
    }
    @Test
    public void volumeCanBeIncrease(){
        beatBox.setIsOn(true);
        beatBox.increaseVolume();
        beatBox.increaseVolume();
        beatBox.increaseVolume();
        beatBox.increaseVolume();
        assertEquals(12, beatBox.getVolume());
    }
    @Test
    public void volumeCanBeDecrease(){
        beatBox.setIsOn(true);
        beatBox.decreaseVolume();
        beatBox.decreaseVolume();
        beatBox.decreaseVolume();
        assertEquals(5, beatBox.getVolume());
    }
    @Test
    public void beatBoxMusicCaBePlayed(){
        beatBox.setIsOn(true);
        assertTrue(beatBox.getPlayMusic());
        beatBox.setPause(false);
        assertFalse(beatBox.getPlayMusic());
    }
    @Test
    public void musicCanBeChange(){
        beatBox.setIsOn(true);
        assertEquals(17, beatBox.getMusicCanBeChange());
        beatBox.setMusic(10);
        assertEquals(10, beatBox.getMusicCanBeChange());
    }
    @Test
    public void musicCanBeIncrease(){
        beatBox.setIsOn(true);
        beatBox.nextMusic();
        beatBox.nextMusic();
        beatBox.nextMusic();
        beatBox.nextMusic();
        assertEquals(21, beatBox.getMusicCanBeChange());
    }
    @Test
    public void musicCanBeDecrease(){
        beatBox.setIsOn(true);
        beatBox.previousMusic();
        beatBox.previousMusic();
        beatBox.previousMusic();
        beatBox.previousMusic();
        beatBox.previousMusic();
        assertEquals(12, beatBox.getMusicCanBeChange());


    }

}