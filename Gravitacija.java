public class Gravitacija {
    public static void main(String[] args) {
        System.out.println("OIS je zakon!");
    }

    public static double izracunPospeska(double visina){
        return 6.674 * 5.972 * Math.pow(10, 13) / Math.pow(6.371 * 1000000 + visina, 2);
    }
}