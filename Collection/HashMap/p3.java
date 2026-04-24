import java.util.*;

class Demo {
    public static void main(String[] args) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 10);
        hm.put(2, 20);
        hm.put(3, 20);
        hm.put(2, 20);

        System.out.println(hm.containsKey(1));
        System.out.println(hm.containsValue(10));
        System.out.println(hm.get(1));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());

        System.out.println(hm.putIfAbsent(4, 100));
        System.out.println(hm);
        System.out.println(hm.entrySet());
        System.out.println(hm.getOrDefault(1, 0));

        System.out.println(hm);
    }
}

/*

Output:

true
true
10
[1, 2, 3]
[10, 20, 20]
3
false
null
{1=10, 2=20, 3=20, 4=100}
[1=10, 2=20, 3=20, 4=100]
10
{1=10, 2=20, 3=20, 4=100}

*/