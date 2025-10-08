import java.util.ArrayList;

public class GenericDemo1<T> {
    ArrayList<T> al = new ArrayList<>();

    public void add(T no) {
        al.add(no);
    }

    public void display() {
        for (T t : al) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        GenericDemo1<Integer> intList = new GenericDemo1<>();
        intList.add(10);
        intList.add(20);
        intList.display();

        GenericDemo1<String> strList = new GenericDemo1<>();
        strList.add("Hello");
        strList.add("World");
        strList.display();
    }
}
