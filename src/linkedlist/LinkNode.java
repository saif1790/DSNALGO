package linkedlist;

import java.util.Scanner;

public class LinkNode {

  int value;
  private LinkNode next;

  public LinkNode(int value){
    this.value = value;
  }

  public static void main(String[] args) {
    LinkNode head;
    LinkNode temp = null;
 /*   LinkNode l1 = new LinkNode(10);
    LinkNode l2 = new LinkNode(20);
    LinkNode l3 = new LinkNode(30);

    l1.next = l2;
    l2.next = l3;
    l3.next = null;
    LinkNode ptr = l1;*/

    while (true) {
      System.out.println("Please choose the operation that you want\n 1 : Inser At Begining \n 2: Insert at the End \n 3: Delete the node \n 4: Traverse the List");
      Scanner scanner = new Scanner(System.in);
      int optionSelected = scanner.nextInt();
      switch (optionSelected) {
        case 1:
          System.out.println("Enter value that you need to add");
          scanner = new Scanner(System.in);
          int newValue = scanner.nextInt();
          LinkNode newNode = new LinkNode(newValue);
          head = insertAtBegining(newNode, newValue);
          temp = head;
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          System.out.println("Traversing a list");
          traversedLinkedList(temp);
          break;
      }
    }
  }


  public static void traversedLinkedList(LinkNode head) {

    LinkNode ptr1 = head;
    while (ptr1 != null) {
      System.out.println(ptr1.value);
      ptr1 = ptr1.next;
    }
  }
    //LinkNode ptr = head;
   /* while (true) {
      System.out.println("you want to add one more node\n1: YES \n2:NO");
      Scanner scanner = new Scanner(System.in);
      int optionSelected = scanner.nextInt();
      switch (optionSelected) {
        case 1:
          System.out.println("Enter value that you need to add");
          scanner = new Scanner(System.in);
          int newValue = scanner.nextInt();
          LinkNode newNode = new LinkNode(newValue);
          LinkNode temp = head;
          while (temp.next != null) {
            temp = temp.next;
          }
          temp.next = newNode;

          // Print updated list
          LinkNode ptr1 = head;
          while (ptr1 != null) {
            System.out.println(ptr1.value);
            ptr1 = ptr1.next;
          }
          break;
        case 2:
          System.exit(0);
      }
    // Print updated list
    LinkNode ptr1 = head;
    while (ptr1 != null) {
      System.out.println(ptr1.value);
      ptr1 = ptr1.next;
    }
    }
  }*/

  public static LinkNode insertAtBegining(LinkNode head,int value){

    LinkNode newNode = new LinkNode(value);
    while (head != null)
    {
      newNode.next = head;
      head = newNode;
      return head;
    }
    newNode.next = head;
    head = newNode;
    return head;
  }
}
