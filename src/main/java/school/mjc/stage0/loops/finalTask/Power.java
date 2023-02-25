package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int result = 1;
        if (power < 0) {
            System.out.println("power is negative");
        }
        else if (power == 0) {
            System.out.println("1");
        }
        else {
            for (int i = 1; i <= power; i++) {
                result = result * numberToPrint;
            }
            System.out.println(result);
        }
    }
}
