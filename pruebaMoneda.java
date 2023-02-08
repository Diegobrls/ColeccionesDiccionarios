import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class pruebaMoneda {
  public static void main(String[] args) {
    ArrayList<Integer> keys = new ArrayList<>();
    ArrayList<String> values = new ArrayList<>();
    keys.add(1);
    keys.add(2);
    keys.add(3);
    values.add("A");
    values.add("B");
    values.add("C");
    HashMap<Integer, String> map = new HashMap<>();
    Random random = new Random();
    for (int i = 0; i < 6; i++) {
      int randomKeyIndex = random.nextInt(keys.size());
      int randomValueIndex = random.nextInt(values.size());
      int randomBoolean = random.nextInt(2);
      if (i == 0) {
        map.put(keys.get(randomKeyIndex), values.get(randomValueIndex));
      } else {
        if (randomBoolean == 0) {
          map.put(keys.get(randomKeyIndex), map.get(keys.get(randomKeyIndex)));
        } else {
          map.put(keys.get(randomKeyIndex), values.get(randomValueIndex));
        }
      }
    }
    System.out.println(map);
  }
}