package telerikalpha.workshop.training;

public class LongSequence {
    public static void main(String[] args) {
        //int count = 0;
        for (int i = 2; i < 1002; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println(-i);
            }
            //count++;
        }

        //System.out.println(count);
    }
}
