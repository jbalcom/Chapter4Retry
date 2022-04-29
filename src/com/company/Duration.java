package com.company;

public class Duration {
    private int startHour;
    private int endHour;
    private int startMinute;
    private int endMinute;

    public Duration(int startHour, int endHour, int startMinute, int endMinute) {
        this.startHour = startHour;
        this.endHour = endHour;
        this.startMinute = startMinute;
        this.endMinute = endMinute;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getEndHour() {
        return endHour;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    public int getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }

    public int getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(int endMinute) {
        this.endMinute = endMinute;
    }

    public int getlength(){
        return ((endHour * 60) + endMinute) - ((startHour * 60) + startMinute);
    }

    @Override
    public String toString() {
        return "[" + startHour + ":" + startMinute + ", " + endHour + ":" + endMinute + "]";
    }
}
