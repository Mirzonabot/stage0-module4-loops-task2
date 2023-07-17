package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
//        Write a program that will write to console all simple
//        numbers from 0 up to input from method arguments using while loop, each on new line:
        if (printToInclusive == 0) {
            return;
        }

        int counter = 0;
        while (counter <= printToInclusive) {
            if (isPrime(counter)) {
                System.out.println(counter);

            }
            counter++;
//            number++;
        }


    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        int divider = 2;
        while (divider < number) {
            if (number % divider == 0) {
                return false;
            }
            divider++;
        }
        return true;
    }
}
