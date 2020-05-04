package chapters.common;

public class ListUtilityFunctions {



    public static void printList(Node head) {
        if (head == null) {
            return;
        }
        Node n = head;
        while (n != null) {
            System.out.print(n.value + " ");
            n = n.next;
        }
        System.out.println();
    }
}
