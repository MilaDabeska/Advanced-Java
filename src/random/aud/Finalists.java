package random.aud;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Finalists {
    public static List<Integer> pick(int finalists, int awards) {
        Random random = new Random();
        //random.nextInt(); kreira nareden random integer
        List<Integer> awarded = new ArrayList<>();

        while (awarded.size() != awards) {
            int finalist = random.nextInt(finalists) + 1; //odi od 0 do finalists
            if (!awarded.contains(finalist))
                awarded.add(finalist);
        }
        return awarded;
    }

    public static void main(String[] args) {
        List<Integer> awarded = pick(30, 3);
        System.out.println(awarded);
    }
}
