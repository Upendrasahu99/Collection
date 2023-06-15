package collection.collection;
import java.util.ArrayList;

public class ArraylistExample {
    private ArrayList <Integer> list = new ArrayList<>();

    // Create ( Add an element in arraylist)
    public void addElement(int input){
        list.add(input);
    }

    // Read
    public void findElement(int index){
        if(index >= 0 && index < list.size()){
            System.out.println("index " + index + " element : " + list.get(index));
        }
        else {
            System.out.println("Wrong index");
        }
    }
    //Update
    public void updateElement(int index, int newElement){
        if(index >= 0 && index < list.size()){
            list.add(index,newElement);
        }
        else {
            System.out.println("Wrong index value ");
        }
    }
    //Delete
    public  void deleteElement(int index){
        if(index >= 0 && index < list.size()){
            list.remove(index);
        }
    }
    // Display all the list element
    public void display(){
        System.out.print("list : [");
        for(int element : list){
            System.out.print(element + " ");
        }
        System.out.println("]");
    }
    // Use all the CRUD operation method
    public static void main(String[] args) {
        ArraylistExample arraylistEx = new ArraylistExample();

        arraylistEx.addElement(22);
        arraylistEx.addElement(33);
        arraylistEx.addElement(44);
        arraylistEx.addElement(55);
        arraylistEx.display();


        arraylistEx.findElement(2); //read

        arraylistEx.updateElement(2,66);
        arraylistEx.display();

        arraylistEx.deleteElement(3);
        arraylistEx.display();
    }
}
