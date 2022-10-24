package Set;

import java.util.*;

public class MainSet {
    public static void main(String[] args){
        TreeSet<Integer> tset = new TreeSet<>();
        HashSet<Integer> hset = new HashSet<>();
        LinkedHashSet<Integer> lset = new LinkedHashSet<>();
        Random r = new Random();
        int min = 5;
        int max = 1000;
        for(int i=0; i<50; i++){
            int t = r.nextInt(max - min) + min;
            hset.add(t);
            t = r.nextInt(max - min) + min;
            lset.add(t);
            tset.add(i+5);
        }
//        System.out.println(tset.size());
//        System.out.println(hset.size());
//        System.out.println(lset.size());
        System.out.println("TreeSet");
        MainSet.print(tset);
        System.out.println("HashSet");
        MainSet.print(hset);
        System.out.println("LinkedHashSet");
        MainSet.print(lset);
        HashSet<Integer> hashSet1 =new HashSet<>(tset.subSet(10,16));
        int count = 0;
        for(int i: hashSet1){
            if(tset.contains(i))
                count++;
        }
        if(count==hashSet1.size())
            System.out.println("TreeSet contains Hashset1");
        else
            System.out.println("TreeSet does not contain hashset1");
        for(int i: hashSet1){
            if(tset.contains(i))
                tset.remove(i);
        }
        MainSet.print(tset);
    }
    static void print(Collection<Integer> c){
        for( int i: c)
            System.out.printf("%d ",i);
        System.out.println();
    }
}
