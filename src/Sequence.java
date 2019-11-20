import java.util.Iterator;


public class Sequence<E extends Comparable> implements Iterable<E> {

    private LinkedList Container;

    Sequence(){
        Container=new LinkedList<E>();
    }

    Sequence(LinkedList c){
        Container=c;
    }


    //adds element to the list
    public void add (E element){
        this.Container.add(element);
    }

    public LinkedList<E> getContainer() {
        return Container;
    }

    //should iterate thorugh list
    public Iterator<E> iterator() {
        return Container.iterator();
    }


}
