package collection.collection;

import java.util.HashSet;

public class HashSetExample {
    HashSet<Integer> set = new HashSet<>();

    //Create(Adding Element in set)
    public void addElement(int element) {
        set.add(element);
    }

    //Read
    public void checkElement(int element) {
        if (set.contains(element) == true) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not in the list");
        }
    }
    //For update, we can use Add method

    // Delete
    public void deleteElement(int element) {
        set.remove(element);
    }

    public void displayList(){
        for(int element : set){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        HashSetExample hashSetExam = new HashSetExample();
        hashSetExam.addElement(22);
        hashSetExam.addElement(33);
        hashSetExam.addElement(44);
        hashSetExam.addElement(44);
        hashSetExam.addElement(55);
        hashSetExam.addElement(66);
        hashSetExam.addElement(66);
        hashSetExam.addElement(77);
        hashSetExam.displayList();

        hashSetExam.checkElement(55);

        hashSetExam.deleteElement(55);
        hashSetExam.displayList();
    }

}
