package collection.map;

import java.util.HashMap;

public class HashMapExample {
    HashMap<String, Integer> map = new HashMap<>();

    //create(Adding Value in map)
    public void addElement(String fruit, int number) {
        map.put(fruit, number);
    }
    //Read(knowing number of fruit)
    public void checkNumberOfFruit(String fruit){
        if(map.containsKey(fruit)) {
            System.out.println("Number of " + fruit + " is " + map.get(fruit));
        }
        else{
            System.out.println(fruit + "Not fruit found");
        }
    }
    //Update
    public void updateNumberOfFruit(String fruit, int number){
        if(map.containsKey(fruit)){
            map.put(fruit, number);
        }
    }
    //Delete
    public void removeFruit(String fruit){
        if(map.containsKey(fruit)){
            map.remove(fruit);
        }
    }
    public void displayFruit(){
        System.out.println(map);
    }

    public static void main(String[] args) {
        HashMapExample hashMapExam = new HashMapExample();
        hashMapExam.addElement("Orange", 5);
        hashMapExam.addElement("Apple", 9);
        hashMapExam.addElement("Banana", 2);
        hashMapExam.addElement("Pineapple", 7);
        hashMapExam.displayFruit();

        hashMapExam.checkNumberOfFruit("Orange");

        hashMapExam.updateNumberOfFruit("Banana",16);
        hashMapExam.displayFruit();

        hashMapExam.removeFruit("Banana");
        hashMapExam.displayFruit();

    }
}
