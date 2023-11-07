package main.java.com.shannonmlance.definitionHelperClasses;

import java.util.ArrayList;

public class LinkedListCustom {
    ListNode head;
    LinkedListCustom() {}
    LinkedListCustom(ListNode head) { this.head = head; }

    public void addNode(ListNode node) {
        if (this.head == null) {
            this.head = node;
        } else {
            ListNode pointer = this.head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = node;
        }
    }

    public static ListNode buildLinkedList(int[] linkedListArray) {
        LinkedListCustom linkedList = new LinkedListCustom();
        for (int integer : linkedListArray) {
            ListNode node = new ListNode(integer);
            linkedList.addNode(node);
        }
        return linkedList.head;
    }

    public static void printLinkedList(ListNode node) {
        ListNode pointer = node;
        while (pointer.next != null) {
            System.out.println(pointer.val);
            pointer = pointer.next;
        }
        System.out.println(pointer.val);
    }
}
