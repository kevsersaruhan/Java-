package day24;

public class Accord implements HondaAc, HondaEngine, HondaSecurity {

    @Override
    public void cool() {
        System.out.println("Accord uses digital AC");
    }

    @Override
    public void run() {
        System.out.println("Accord runs well");
    }

}
