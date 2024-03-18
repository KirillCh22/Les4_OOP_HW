package Task1;

public class Pair <T, U> {
    private T firstElement;
    private U secondElement;


    // СОЗДАНИЕ КОНСТРУКТОРА
    public Pair(T firstElement, U secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }


    // МЕТОД ПО ПОЛУЧЕНИЮ 1-го ЭЛЕМЕНТА
    public T getFirst() {return firstElement;}

    // МЕТОД ПО ПОЛУЧЕНИЮ 2-го ЭЛЕМЕНТА
    public U getSecond() {return secondElement;}


    // МЕТОД ПО ЗАДАНИЮ НОВОГО 1-го ЭЛЕМЕНТА
    public void setFirst(T firstElementNew) {firstElement = firstElementNew;}

    // МЕТОД ПО ЗАДАНИЮ НОВОГО 2-го ЭЛЕМЕНТА
    public void setSecond(U secondElementNew) {secondElement = secondElementNew;}


}
