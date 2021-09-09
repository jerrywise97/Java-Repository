package chapterThree;

public class Mp3 {
    private boolean isOn;
    private int volume;
    private boolean play;
    private int music;


    public Mp3(boolean isOn, int volume, boolean play, int music){
        this.isOn = isOn;
        this.volume = volume;
        this.play = play;
        this.music = music;
    }


    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume > 0 && volume < 30);
        volume = volume + 1;
    }

    public void decreaseVolume() {
        if (volume > 0 && volume < 30);
        volume =  volume - 1;
    }

    public boolean getPlayMusic() {
        return play;
    }

    public void setPause(boolean play) {
        this.play = play;
    }

    public int getMusicCanBeChange() {
        return music;
    }

    public void setMusic(int music) {
        this.music = music;
    }

    public void nextMusic() {
        music = music + 1;
    }

    public void previousMusic() {
        music = music - 1;
    }
}


