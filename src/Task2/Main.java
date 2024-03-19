package Task2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        DataContainer<String> stringContainer = new DataContainer<>(3);

        stringContainer.add("Apple");
        stringContainer.add("Banana");
        stringContainer.add("Orange");

        String fruit = stringContainer.get(1);
        System.out.println("Fruit at index 1: " + fruit);
        System.out.println("Size of container: " + stringContainer.getSize());

        stringContainer.remove(1);

        System.out.println("\\\\\\\\\\\\\\\\\\\\");

        stringContainer.showList();
        System.out.println("\\\\\\\\\\\\\\\\\\\\");
        String fruit1 = stringContainer.get(1);
        System.out.println("Fruit at index 1: " + fruit1);
        System.out.println("Size of container: " + stringContainer.getSize());

    }
}
