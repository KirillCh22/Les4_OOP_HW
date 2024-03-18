package Task2;

import java.util.ArrayList;

public class DataContainer <T> {
    private ArrayList<T> arrayList = new ArrayList<>();

    // МЕТОД ДОБАВЛЕНИЯ ЭЛЕМЕНТА В КОНТЕЙНЕР
    public void add(T item) {
        arrayList.add(item);
    }

    // МЕТОД ПОЛУЧЕНИЯ ЭЛЕМЕНТА ПО ИНДЕКСУ
    public T get(int index) {

        return arrayList.get(index);
    }

    // МЕТОД УДАЛЕНИЯ ЭЛЕМЕНТА ПО ИНДЕКСУ
    public void remove(int index) {arrayList.remove(index);}

    // МЕТОД ПОЛУЧЕНИЯ РАЗМЕРА МАССИВА
    public int getSize() {

        return arrayList.size();
    }
}
