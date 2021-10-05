package generics;

class Data1<K,V>{
    private K key;
    private V value;

    public Data1(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data1{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public<E,N> void display(E element , N number){
        System.out.println("Element: " +element + " number: " + number);
    }
}

public class Generics_2 {
    public static void main(String[] args) {

        Data1<Integer, String > data1 = new Data1<Integer, String>(1, "Khan");

        System.out.println("Key: " + data1.getKey() + " Value: " + data1.getValue());

        data1.display("Hello", 2);
    }
}
