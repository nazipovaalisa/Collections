import java.util.HashMap;
import java.util.Random;

public class HashMapMain {

    public static void main(String[] args){
        Random r= new Random();
        int max = 150000;
        HashMap<Integer, Integer> digitals = new HashMap<Integer, Integer>();
        for(int i = 0; i<100000; i++){
            int t = r.nextInt(max);
            if(digitals.containsKey(t))
                digitals.put(t, digitals.get(t)+ 1);
            else
                digitals.put(t,1);
        }
        for(HashMap.Entry<Integer, Integer> item : digitals.entrySet()){
            System.out.printf("Key: %d  Value: %d \n", item.getKey(), item.getValue());
        }

    }
}
