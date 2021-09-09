package chapterThree;

public class Time {
    private int seconds;
    private int minutes;
    private int hours;

    public Time(int seconds, int minutes, int hours){
        if(seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        }
        if(minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        }
        if(hours >= 0 && hours < 24) {
            this.hours = hours;
        }


    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if(seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        }
    }

    public int getMinutes() {
        return  minutes;
    }

    public void setMinutes(int minutes) {
        if(minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        }
    }

    public int getHours(){
        return hours;
    }

    public void setHours(int hours) {
        if(hours >= 0 && hours < 24) {
            this.hours = hours;
        }
    }

    public void displayTime() {
        System.out.printf("%d/%d/%d", hours,minutes,seconds);
    }
}
