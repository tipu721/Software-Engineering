package solid;


class Engine{
    void on(){
        System.out.println("Engine on");
    }
    void powerOn(Integer power){
        System.out.println("Power on with power:" + power);
    }
}

interface Car{
    void turnOnEngine();
    void accelerate();
}

class MotorCar implements Car{

    private Engine engine = new Engine();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void turnOnEngine() {
        engine.on();
    }

    @Override
    public void accelerate() {
        engine.powerOn(200);
    }
}

class ElectrilCar implements Car{

    @Override //violation of liskov substitution
    public void turnOnEngine() {
        throw new AssertionError("I don't have an engine !");
    }

    @Override
    public void accelerate() {
        System.out.println("ElectricCar accelerate crazyly");
    }
}
public class LiskovSubstitution {

    public static void main(String[] args) {
        Car motorCar = new MotorCar();
        motorCar.turnOnEngine();
        motorCar.accelerate();

        Car electricCar = new ElectrilCar();
        electricCar.accelerate();
        electricCar.turnOnEngine();

    }

}
