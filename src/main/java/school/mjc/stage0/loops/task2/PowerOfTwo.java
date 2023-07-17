package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
//        Write a program that will take int power as an argument. This argument will be used to
//        calculate power of 2. The program should write to console each value for power of 2 beginning
//        from 2^0...2^power. Write the program using "while" in case of negative value print
//        "too much power":

            if (power < 0) {
                System.out.println("too much power");
                return;
            }

            int counter = 0;

            while (counter <= power) {
                System.out.println(power_of_two(counter));
                counter++;
            }
    }

    private int power_of_two(int counter) {
        if (counter == 0) {
            return 1;
        }
        int result = 1;
        int iter = 1;
        while (iter <= counter) {
            result *= 2;
            iter++;
        }
        return result;
    }
}
