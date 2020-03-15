//Student name: Zachary Flahaut
//Student number: 30056316
//Course code: ITI1121
//Lab section: Z-01

public interface Queue<E> {

    public abstract void enqueue( E obj );
    public abstract E dequeue();
    public abstract boolean isEmpty();
    public abstract int size();

}
