package solid;


interface KeyBoard{

}

class StandardKeyboard implements KeyBoard{
    String name;
    Integer noOfKey;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNoOfKey() {
        return noOfKey;
    }

    public void setNoOfKey(Integer noOfKey) {
        this.noOfKey = noOfKey;
    }
}
class Monitor{
    String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

class Windows98Machine {
    private final KeyBoard keyboard;
    private final Monitor monitor;

    public KeyBoard getKeyboard() {
        return keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    Windows98Machine(KeyBoard keyBoard, Monitor monitor){
        this.keyboard = keyBoard;
        this.monitor = monitor;
    }
}

public class DependencyInversion {
    public static void main(String[] args) {
        Windows98Machine machine = new Windows98Machine(new StandardKeyboard(), new Monitor());
        System.out.println(machine.getKeyboard());
        System.out.println(machine.getMonitor().getBrand());
    }
}
