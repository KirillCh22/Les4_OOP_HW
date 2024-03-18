package Task2;

public class Main {
    public static void main(String[] args) {
        DataContainer<String> stringContainer = new DataContainer<>();

        stringContainer.add("Apple");
        stringContainer.add("Banana");
        stringContainer.add("Orange");

        String fruit = stringContainer.get(1);
        System.out.println("Fruit at index 1: " + fruit);

        stringContainer.remove(1);

        System.out.println("Size of container: " + stringContainer.getSize());
    }
}
