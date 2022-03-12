class Solution {
     public static Node copyRandomList(Node head) {
        Node dummyHead = new Node(0);
        Map<Node, Node> referenceMap = new HashMap<>();
       
        Node p1 = dummyHead; 
        Node p2 = head;
       // As a traverse to create a copy list A'-B'-C' from A-B-C create a map of with <key,value> A-A', B-B', C-C'
        while(p2 != null){
            Node newNode = new Node(p2.val);
            p1.next = newNode;
            referenceMap.put(p2,newNode);
            p1 = p1.next;
            p2 = p2.next;
        }
       
         // re iterate with 2 pointers p1-> A'-B'-C' and p2 = A-B-C
		 // and copy random pointer of A'-B'-C' using hasmap<A,A'>. or null if no random pointer exists
		 // map will dictate respective links
        p1 = dummyHead.next; 
        p2 = head;
        while(p2 != null){
            p1.random = p2.random == null ? null : referenceMap.get(p2.random);
            p1 = p1.next;
            p2 = p2.next;
        }
     return dummyHead.next;   
    }
}