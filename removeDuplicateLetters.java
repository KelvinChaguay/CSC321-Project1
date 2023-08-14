class Solution {
    public String removeDuplicateLetters(String s) {
        int [] lastIndex = new int[26];
        // Each iteratein is applied for each element
        for(int i=0; i < s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        // create a boolean array
        boolean[] visited = new boolean[26];
        // Stack for keept character.
        Stack<Integer> stack = new Stack<>();
        // Looping charaters through string 
        for(int i = 0; i < s.length(); i++){
            int c = s.charAt(i) -'a';
            if(visited[c]){   /// Main body. Check until the stack is empty and the char at stack is > than current is accesinf 
                continue;
            }
        /*
        The output needs the smallest order. If not It is pop.'Seen' is seet to false      becasue the element gets pop. 
        */
        while(!stack.isEmpty() && stack.peek() > c && i < lastIndex[stack.peek()] ){
            visited[stack.pop()] = false;
        }
        stack.push(c); // Add Charecter to stack.
        visited[c] = true;
    }

    StringBuilder sb = new StringBuilder();
    while(!stack.isEmpty()){
        sb.append((char)(stack.pop() + 'a')); // Add alll charecters.

    }
    return sb.reverse().toString(); // The output  is change to strong.
    // time is O(n)
}
}
