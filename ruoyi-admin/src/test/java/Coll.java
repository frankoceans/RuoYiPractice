import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Coll {
    public static void main(String[] args) {
        System.out.println(tt());
    }

    public static Integer tt (){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,6,6,6,6));
        HashMap<Integer,Integer> map = new HashMap<>();
        for (Integer i : list) {
            if (!map.containsKey(i)){
                map.put(i,1);
            } else {
                map.put(i,map.get(i)+1);
            }
        }
        //3-> 1
        final Integer[] maxKey = new Integer[1];
        map.forEach((key, val) -> {
            if (val > list.size()/2) {
                maxKey[0] = key;
            }
        });
        return maxKey[0];
    }
}
