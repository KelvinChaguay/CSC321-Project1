class Solution {
     public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(0); // Initializer
        visited.add(0);  // Initializer
        while(!queue.isEmpty()){
            int key = queue.poll(); 
          /*Line 8.The front element of the queue is retrieved using the Java ‘poll’ method.
          I iterated through a list of keys stored in ‘rooms.’
            */
            for(int k : rooms.get(key)){
                if(!visited.contains(k)){
                    queue.add(k);
                    visited.add(k);
                }
            }
        }
        return visited.size() == rooms.size();
       /* Line 20. The algorithm checks if the total number of visited rooms combined with the size method is equivalent to the total initial number of rooms. 
       If both are equal then all rooms were visited else not all rooms were visited.


         */
       

     
    }

}
