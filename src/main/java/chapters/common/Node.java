package chapters.common;

public class Node {

    public Node next;
    public int value;

    public Node(int value) {
        this.value = value;
    }

    /**
     * Create single linked list from int array
     * @param array
     */
   public Node (int[] array){
        value = array[0];
        Node current = this;
        for(int i = 1; i < array.length; i++){
            current.next = new Node(array[i]);
            current = current.next;
        }
   }



}
