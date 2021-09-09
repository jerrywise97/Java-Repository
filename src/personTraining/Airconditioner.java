package personTraining;

public class Airconditioner {

    private boolean isOn;
    private boolean isoff;
    private int temperature;

    public void setOn(boolean ison) {
        this.isOn =ison;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setOff(boolean isoff) {
    this.isoff = isoff;

    }

    public boolean getisoff() {
        return isoff;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    public int getTemperature() {
        return temperature;
    }
    public void increaseTemperatue() {
            this.temperature++;

    }


        public void decreaseTemperature(){
            this.temperature--;


    }
}




