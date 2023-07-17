package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
//        Write a program that will write to console all numbers from factorial row, from 0 up to input
//        from method arguments using while loop, each on new line:

        int counter = 0;

        while (counter <= printToInclusive) {
            System.out.println(factorial(counter));
            counter++;
        }


    }

    private int factorial(int counter) {

        if (counter == 0 || counter == 1) {
            return 1;
        }

        int result = 1;
        int iter = 1;
        while (iter <= counter) {
            result *= iter;
            iter++;
        }
        return result;

    }
}
