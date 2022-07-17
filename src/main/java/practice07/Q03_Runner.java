package practice07;

public class Q03_Runner {
    public static void main(String[] args) {
        Q03_Volume q = new Q03_Volume();
        double vol = 0;
        vol=q.calculateVolume(3);
        System.out.println(vol);
        vol=q.calculateVolume(3,4);
        System.out.println(vol);
        vol=q.calculateVolume(3,4,5);
        System.out.println(vol);
    }
}
