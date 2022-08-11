import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            arrayList.add(random.nextInt(1, 100));
        }
        for (int i : arrayList) {
            System.out.println(i);
        }


        List<Integer> integerListEven = new ArrayList<>();
        List<Integer> integerListOdd = new ArrayList<>();
//fori use
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 ==1) {
                integerListEven.add(arrayList.get(i));
            }  else {
                integerListOdd.add(arrayList.get(i));
            }
        }

        System.out.println("even numbers: " + integerListEven);
        System.out.println("odd numbers: " + integerListOdd);

    }
}