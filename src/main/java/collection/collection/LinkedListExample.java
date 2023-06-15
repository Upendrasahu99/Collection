package collection.collection;

import java.util.LinkedList;

public class LinkedListExample {
    private LinkedList<String> list = new LinkedList<>();

    // Create ( Add an element in list)
    public void addElement(String input) {
        list.add(input);
    }

    // Read
    public void readIndex(int index) {
        if (index >= 0 && index < list.size()) {
            System.out.println("index " + index + " element : " + list.get(index));
        } else {
            System.out.println("Wrong index");
        }
    }

    //Update
    public void updateElement(int index, String newElement) {
        if (index >= 0 && index < list.size()) {
            list.add(index, newElement);
        } else {
            System.out.println("Wrong index value ");
        }
    }

    //Delete
    public void deleteElement(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        }
    }

    // Display all the list element
    public void display() {
        System.out.print("list : [");
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println("]");
    }

    // Use all the CRUD operation method
    public static void main(String[] args) {
        LinkedListExample linkedListExam = new LinkedListExample();

        linkedListExam.addElement("Ram");
        linkedListExam.addElement("Rohan");
        linkedListExam.addElement("Ajay");
        linkedListExam.display();

        linkedListExam.readIndex(2);

        linkedListExam.updateElement(2, "Manoj");
        linkedListExam.display();

        linkedListExam.deleteElement(2);
        linkedListExam.display();
    }
}


