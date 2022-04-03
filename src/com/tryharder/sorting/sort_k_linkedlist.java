package com.tryharder.sorting;
/*
Given k linked lists where each one is sorted in the ascending order, merge all of them into a single sorted linked list.
        Constraints:

        0 <= k <= 104
        0 <= length of one given linked list <= 103
        -109 <= node value <= 109
        Sum of the lengths of all given lists won't exceed 105*/

import java.util.ArrayList;

public class sort_k_linkedlist {



/*    For your reference:*/
static class LinkedListNode {
        Integer value;
        LinkedListNode next;

        LinkedListNode(Integer value) {
            this.value = value;
            this.next = null;
        }

        void add(LinkedListNode node)
        {
            this.next = node;
        }
        void append(LinkedListNode node)
        {
            LinkedListNode pointer =this;
            while (pointer.next != null) {
                    pointer=pointer.next;
            }
            pointer.next=node;


        }
    }

    static LinkedListNode sort_2_lists(LinkedListNode first, LinkedListNode second)
    {
        LinkedListNode sorted_list=null;

        LinkedListNode first_pointer = first;
        LinkedListNode second_pointer =  second;

        if(first_pointer.value<=second_pointer.value)
        {
            sorted_list = new LinkedListNode(first_pointer.value);
            first_pointer =first_pointer.next;
        }
        else
        {
            sorted_list = new LinkedListNode(second_pointer.value);
           second_pointer =second_pointer.next;
        }
        LinkedListNode reference_node = sorted_list;
        while(first_pointer.next!=null && second_pointer.next!=null)
        {
            LinkedListNode node =null;
            if(first_pointer.value<=second_pointer.value)
            {
                node = new LinkedListNode(first_pointer.value);
                sorted_list.append(node);
                first_pointer =first_pointer.next;
            }
            else {
                node = new LinkedListNode(second_pointer.value);
                sorted_list.append(node);
                second_pointer=second_pointer.next;
            }
            sorted_list =sorted_list.next;

        }
        while(first_pointer.next!=null)
        {
            LinkedListNode node = new LinkedListNode(first_pointer.value);
            sorted_list.next=node;
        }
        while(second_pointer.next!=null)
        {
            LinkedListNode node = new LinkedListNode(second_pointer.value);
            sorted_list.next=node;
        }



        return sorted_list;
    }
    static LinkedListNode merge_k_lists(ArrayList<LinkedListNode> lists) {
        // Write your code here.



        LinkedListNode result =lists.get(0);
        for( int counter=1;counter< lists.size();counter++)
        {
            sort_2_lists(result, lists.get(counter));

        }
        return null;
    }



    public static void main(String[] args) {


        LinkedListNode first = new LinkedListNode(3);
        first.append(new LinkedListNode(4));
        first.append(new LinkedListNode(2));
        first.append(new LinkedListNode(8));


        LinkedListNode second = new LinkedListNode(6);
        second.append(new LinkedListNode(3));
        second.append(new LinkedListNode(9));

        LinkedListNode node =first;
        while(node!=null)
        {
            System.out.println(node.value);
            node =node.next;
        }
    }

}
