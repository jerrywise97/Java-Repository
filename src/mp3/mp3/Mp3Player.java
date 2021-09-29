package project.mp3;

import java.util.ArrayList;

public class Mp3Player {
    private static boolean isOn;
    private static boolean isPause;
    private static int volume;
    private static int musicControl;
    private static ArrayList<DefaultPlaylist> songs = new ArrayList<>();

    public Mp3Player(boolean isOn, boolean isPause, int volume, int musicControl, ArrayList<DefaultPlaylist> songs){
        this.isOn = isOn;
        Mp3Player.isPause = isPause;
        this.volume = volume;
        this.musicControl = musicControl;
        this.songs = songs;

    }


    public boolean getIson() {
        return isOn;
    }
}
