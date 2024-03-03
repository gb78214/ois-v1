public class Gravitacija {
    public static void main(String[] args) {
        System.out.println("OIS je zakon!");

        izpis(0.0);
        izpis(10.0);
        izpis(1000.0);
        izpis(100000.0);
    }
    public static void izpis(double visina){
		System.out.printf("Gravitacijski pospešek na %.2f km nadmorske višine je %.2f m/s^2\n", visina, izracunPospeska(visina*1000));
	}
    public static double izracunPospeska(double visina){
        return 6.674 * 5.972 * Math.pow(10, 13) / Math.pow(6.371 * 1000000 + visina, 2);
    }
}