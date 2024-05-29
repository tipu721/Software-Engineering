package solid;

class ByCycle{
    private String weel;
    private String handle;
    private Integer spreed;

    public String getWeel() {
        return weel;
    }

    public void setWeel(String weel) {
        this.weel = weel;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public Integer getSpreed() {
        return spreed;
    }

    public void setSpreed(Integer spreed) {
        this.spreed = spreed;
    }
}

class MotorBike extends ByCycle{
    String engine;
    Integer gear;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Integer getGear() {
        return gear;
    }

    public void setGear(Integer gear) {
        this.gear = gear;
    }
}

public class OpenClose {

    public static void main(String[] args) {
        ByCycle motorBike = new MotorBike();
        motorBike.setSpreed(150);
        System.out.println(motorBike.getSpreed());
    }
}
