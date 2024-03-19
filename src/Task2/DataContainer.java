package Task2;

import java.util.ArrayList;
import java.util.Iterator;

public class DataContainer <T> {
    private int size;
    private ArrayList<T> arrayList = new ArrayList<>();

    public DataContainer(int size) {this.size = size;}

    // МЕТОД ДОБАВЛЕНИЯ ЭЛЕМЕНТА В КОНТЕЙНЕР
    public void add(T item) {
        if(size > 0) arrayList.add(item);
        else System.out.println("Вы вышли за границы массива!");
        size--;
    }

    // МЕТОД ПОЛУЧЕНИЯ ЭЛЕМЕНТА ПО ИНДЕКСУ
    public T get(int index) {

        return arrayList.get(index);
    }

    // МЕТОД УДАЛЕНИЯ ЭЛЕМЕНТА ПО ИНДЕКСУ
    public void remove(int index) {arrayList.remove(index);}

    // МЕТОД ПОЛУЧЕНИЯ РАЗМЕРА МАССИВА
    public int getSize() {return arrayList.size();}


    // Метод по выводу массива
    public void showList()
    {
        Iterator<T> iter = arrayList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }


}
