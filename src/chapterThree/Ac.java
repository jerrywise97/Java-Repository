package chapterThree;

public class Ac {
    private boolean isOn;
    private int temperature;

    public Ac(boolean isOn, int temperature){
        this.isOn = isOn;
        this.temperature = temperature;

    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public int getTemperature() {
        return temperature;

    }

    public void increaseTemperature() {
        if (temperature < 30) {
            temperature = temperature + 1;
        }
    }

    public void decreaseTemperature() {
        if (temperature > 16) {
            temperature = temperature - 1;
        }
    }
}
