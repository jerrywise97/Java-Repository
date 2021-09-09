package chapterThree;

public class Television {

    private String productName;
    private int volume;
    private boolean isOn;
    private  int channel;

    public Television(String productName, int volume, boolean isOn, int channel){
        //this.productName = productName;
        this.productName = productName;
        this.volume = volume;
        this.isOn = isOn;
        this.channel = channel;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public void setIncreaseVolume() {
        volume = volume + 1;
    }

    public void setDecreaseVolume() {
        volume = volume - 1;
    }


    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel =channel;
    }

    public void setIncreaseChannel() {
        channel = channel + 1;
    }

    public void setDecreaseChannel() {
        if(channel > 0) {
            channel = channel - 1;
        }

    }
}
