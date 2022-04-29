package com.company;

public class LightBulb {
    private boolean onOffSwitch;

    public LightBulb(){
        this.onOffSwitch = false;
    }

    public boolean turnOnLight(){
        onOffSwitch = true;
        return onOffSwitch;
    }

    public boolean turnOffLight(){
        onOffSwitch = false;
        return onOffSwitch;
    }

    public String toString() {
        if (onOffSwitch == true) {
            return " is currently on.";
        }else{
            return " is currently off.";
        }
    }
}
