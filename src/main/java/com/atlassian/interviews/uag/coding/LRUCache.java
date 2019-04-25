//import java.util.ArrayList;
//import java.util.Deque;
//import java.util.HashMap;
//import java.util.PriorityQueue;
//
//class LRUCache {
//    HashMap<Integer, Integer> map = new HashMap<>();
//    Deque<Integer> priorityQueue;
//    int size ;
//    /*Inititalize an LRU cache with size N */
//    public LRUCache(int N) {
//        priorityQueue = new PriorityQueue<>();
//        size = N;
//    }
//
//    /*Returns the value of the key x if
//     present else returns -1 */
//    public int get(int x) {
//        if (map.containsKey(x)) {
//            priorityQueue.remove(x);
//            priorityQueue.add(x);
//            return map.get(x);
//        }
//        return -1;
//    }
//
//    /*Sets the key x with value y in the LRU cache */
//    public void set(int x, int y) {
//        if(map.containsKey(x)){
//            priorityQueue.remove(x);
//        }
//        if(priorityQueue.size()>=size){
//            int c = priorityQueue.peek();
//            map.remove(c);
//        }
//        map.put(x,y);
//        priorityQueue.add(x);
//        //Your code here
//    }
//}
