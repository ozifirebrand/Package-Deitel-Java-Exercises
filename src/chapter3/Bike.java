//OKOROAFOR OZIOMA ASSIGNMENT 18/7/2021

package chapter3;

public class Bike {
    private boolean isOn = false;
    private int gearSpeed;
    private int gearLevel;

    public void switchOnOff(){
        isOn = ! isOn;
        if (isOn){
            System.out.println("Off");
        } else {
            System.out.println("On");
        }
    }

    public void accelerateGear(int gearValue, int currentSpeed) {
        gearLevel = gearValue;
        if ( gearValue == 1){
            gearSpeed = currentSpeed + 1;
        }
        if (gearValue == 2) {
            gearSpeed = currentSpeed + 2;
        }
        if (gearValue == 3) {
            gearSpeed = currentSpeed + 3;
        }
        if (gearValue == 4){
            gearSpeed = currentSpeed +4;
        }

    }
    public void decelerateGear(int gearValue, int currentSpeed){
        if (gearValue == 1){
            gearSpeed = currentSpeed - 1;
        }
        if (gearValue == 2){
           gearSpeed = currentSpeed - 2;
        }
        if (gearValue == 3){
            gearSpeed = currentSpeed - 3;
        }
        if (gearValue == 4){
            gearSpeed = currentSpeed - 4;
        }
    }

    public int currentSpeed(){
       // System.out.println(speed);
       return gearSpeed;
    }

    public void changeGear(int gearSpeed, int currentGearLevel){
        if (gearSpeed > 20 && currentGearLevel == 1){
            gearLevel = currentGearLevel + 1;
        }
        if (gearSpeed > 30 && currentGearLevel == 2){
            gearLevel = currentGearLevel + 1;
        }
        if (gearSpeed > 40 && currentGearLevel == 3){
            gearLevel = currentGearLevel + 1;
        }
        if (gearSpeed < 21 && currentGearLevel == 2){
            gearLevel = currentGearLevel - 1;
        }
        if (gearSpeed < 31 && currentGearLevel == 3){
            gearLevel = currentGearLevel - 1;
        }
        if (gearSpeed < 41 && currentGearLevel == 4){
            gearLevel = currentGearLevel - 1;
        }
    }

    public int displayGearLevel(){
        return  gearLevel;
    }
}