package ClassWork.dataStructures;

public interface List {
    boolean isEmpty();

    void add(int element);

    void add(int element, int index);

    void remove(int i);

    int getSize();

    int get(int i);

    int getCapacity();
}
