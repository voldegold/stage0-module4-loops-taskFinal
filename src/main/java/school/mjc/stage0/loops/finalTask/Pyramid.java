package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        if (cathetusLength > 0) {
            for (int y = 1; y <= cathetusLength; y++) {
                for (int x = 1; x <= cathetusLength ; x++) {
                    // line choose
                    if (x > (cathetusLength - y)) {
                        System.out.print(cathetusLength-x + 1);
                    }
                    else System.out.print(" ");

                }
                for (int x2 = 2; x2 <= y; x2++) {

                    System.out.print(x2);
                }
                System.out.println();
            }
        } else System.out.print("");

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
