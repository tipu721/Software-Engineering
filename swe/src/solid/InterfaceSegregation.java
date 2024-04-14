package solid;

interface CowKeeper{
    void washTheCow();
    void feedTheBear();
    void petTheBear();
}

//Segregate above interface into three
interface CowCleaner{
    void washTheCow();
}
interface CowFeeder{
    void feedTheCow();
}
interface CowPetter{
    void petTheCow();
}

class CowCarer implements CowCleaner, CowFeeder{

    @Override
    public void washTheCow() {

    }

    @Override
    public void feedTheCow() {

    }
}

class CrazyPerson implements CowPetter{

    @Override
    public void petTheCow() {

    }
}


public class InterfaceSegregation {
}
