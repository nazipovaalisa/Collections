package HashMap;

import java.util.HashMap;
import java.util.Random;

public class HashMapMain {

    public static void main(String[] args){
        Random r= new Random();
        int max = 1500;
        HashMap<Integer, Integer> digitals = new HashMap<Integer, Integer>();
        for(int i = 0; i<100000; i++){
            int t = r.nextInt(max);
            if(digitals.containsKey(t))
                digitals.put(t, digitals.get(t)+ 1);
            else
                digitals.put(t,1);
        }
//        int count = 0;
        for(HashMap.Entry<Integer, Integer> item : digitals.entrySet()){
//            count += item.getValue();
            System.out.printf("Key: %d  Value: %d \n", item.getKey(), item.getValue());
        }
//        System.out.println(count);
    }
}
