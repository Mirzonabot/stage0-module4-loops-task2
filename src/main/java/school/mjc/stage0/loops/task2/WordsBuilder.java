package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int length = chars.length;
        int counter = 0;
        while (counter < length) {
            System.out.print(chars[counter]);
            counter++;
        }
    }
}
