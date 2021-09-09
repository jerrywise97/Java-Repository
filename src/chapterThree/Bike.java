package chapterThree;


public class Bike {
    private boolean isOn;
    private int speed;
    private int gear;


    public Bike(boolean isOn, int speed, int gear) {
        this.isOn = isOn;
        this.speed = speed;
        this.gear = gear;
    }

    public boolean getIfPowerBikeIsOn() {
        return isOn;
    }

    public void setPowerBikeIsOff(boolean isOn) {
        this.isOn = isOn;
    }

    public int getPowerBiKeSpeedometer() {
        return speed;
    }

    public void setPowerBikeSpeedometer(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }


    public void accelerate() {
        if (speed >= 41) {
            gear = 4;
            speed = speed + 4;
        }
        if (speed >= 31 && speed <= 40) {
            gear = 3;
            speed = speed + 3;

        }
        if (speed >= 21 && speed <= 30) {
            gear = 2;
            speed = speed + 2;
        }

        if (speed >= 0 && speed <= 20) {
            gear = 1;
            speed = speed + 1;
        }

    }

    public void decelerate() {

        if (speed >= 0 && speed <= 20) {
            gear = 1;
            speed = speed - 1;
        }

        if (speed >= 21 && speed <= 30) {
            gear = 2;
            speed = speed - 2;
        }
        if (speed <=40 && speed >= 30) {
            gear = 3;
            speed = speed - 3;

        }
        if (speed >= 41) {
            gear = 4;
            speed = speed - 4;
        }





    }
}


