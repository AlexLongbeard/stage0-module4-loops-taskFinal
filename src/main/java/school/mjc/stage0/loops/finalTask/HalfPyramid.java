package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        if (cathetusLength==0) {
            System.out.print(" ");
        }
        else {
for (int i=1; i<=cathetusLength; i++) {
    for (int j=1; j<=(cathetusLength-i); j++) {
        System.out.print(" ");
    }
    for (int t=0; t<=(i-1); t++) {
        System.out.print("*");
    }
    System.out.println("*");
}
    }
    }
}
