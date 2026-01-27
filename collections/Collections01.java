package collections;

import java.util.*;

class Data{
    public Integer num;
    public String name;
    Data(int num, String name){
        this.name=name;
        this.num = num;
    }
}

public class Collections01 {
    public static void main(String[] args) {

        System.out.println("Intro to Arraylist");
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(100);
        aList.add(16);
        aList.add(20);
        System.out.println(aList);
        System.out.println(aList.size());
        System.out.println(aList.get(2));
        System.out.println(aList.remove(1));
        System.out.println(aList);
        aList.add(2,33);
        System.out.println(aList);
        System.out.println(aList.contains(100));
        System.out.println();

        System.out.println("Intro to LinkedList");

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(22);
        ll.add(33);
        System.out.println(ll);
        ll.addFirst(10);
        System.out.println(ll);
        ll.addLast(99);
        System.out.println(ll);
        System.out.println(ll.remove()); // This removes and returns first element
        System.out.println(ll.removeLast()); // removes and returns the last element
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll);
        System.out.println();

        System.out.println("Intro to Stacks");
        Stack<Integer> st = new Stack<>(); // Last In First Out (LIFO)
        st.push(55);
        st.push(74);
        st.push(79);
        System.out.println(st);
        System.out.println(st.peek()); // Gives the last element pushed
        System.out.println(st.pop()); // removes and returns the last pushed element
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println();

        System.out.println("Intro to Vector Class");
        Vector<Integer> vec = new Vector<>();
        System.out.println(vec.capacity()); // Default initial capacity - 10

        System.out.println();

        System.out.println("Set Interface");

        HashSet<Integer> hs = new HashSet<>(); // O(1)
        hs.add(1);
        hs.add(9);
        hs.add(3);
        hs.add(3);
        System.out.println(hs); // No sorting garuntee
        hs.remove(3);
        System.out.println(hs);
        for(var num: hs){
            System.out.println(num);
        }
        System.out.println();

        System.out.println("TreeSet"); //O(logn)
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(8);
        ts.add(15);
        ts.add(12);
        ts.add(-1);
        System.out.println(ts);
        System.out.println(ts.floor(9)); // <=
        System.out.println(ts.ceiling(12)); // >=
        System.out.println();

        System.out.println("Intro to Queue Interface");
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(23);
        ad.offer(12);
        ad.offer(11);
        ad.offer(2);
        System.out.println(ad);
        System.out.println(ad.peek());
        System.out.println();

        System.out.println("Intro to Priority Queue");
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(22);
        pq.offer(2);
        pq.offer(1);
        pq.offer(4);
        System.out.println(pq);
        System.out.println(pq.peek()); // gives the smallest element
        pq.poll(); // removes smallest element
        System.out.println(pq);
        System.out.println();

        System.out.println("Intro to HashMap");
        HashMap<Integer, String> hm = new HashMap<>();
        // Doesnt store keys in sorted order.

        hm.put(1,"Java");
        hm.put(2,"Python");
        hm.put(3,"Code");
        System.out.println(hm);
        System.out.println(hm.get(2));
        System.out.println(hm.size());

        TreeMap<Integer, String> tm = new TreeMap<>();
        // This stores in sorted order.
        // Doesnot stores duplicates.
        // Key value in sorted order --> TreeMap is solution

        System.out.println();
        List<Integer> al = new ArrayList<>();
        al.add(21);
        al.add(11);
        al.add(44);
        al.add(13);

        // Customer comparators
        // Sort in descending order
        Collections.sort(al,new Comparator<Integer>() {
            // [num1, num2]
            @Override
            public int compare(Integer num1, Integer num2){
                // num1 < num2
                // order is wrong
                if(num1<num2){
                    return 1;
                }
                else if (num1>num2){
                    return -1;
                }
                return 0;
            }
            
        });



        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        System.out.println(Collections.min(al));
        Collections.reverse(al);
        System.out.println(al);


        int num = (int) Math.pow(2,5);
        System.out.println(num);






        



    
    }
    
}
