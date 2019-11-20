import java.util.Iterator;

class LinkedList<E> implements Iterable {




    static class Node<E> {
        E value;
        Node<E> next;

        Node(E value) {
            this.value = value;
        }
    }


    Node<E> head = new Node<E>(null);
    Node<E> tail = head;
    int size;

    void add(E value) {
        tail = tail.next = new Node<E>(value);
        size++;
    }

    E get(int index) {
        if(index < 0 || size <= index)
            throw new IndexOutOfBoundsException(index);

        Node<E> node = head.next;
        while(index > 0) {
            node = node.next;
            index--;
        }

        return node.value;
    }

    Node<E> current = this.head;

    @Override
    public Iterator<E> iterator() {
        //Node<E> head, tail,help = new Node<E>(null);

        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return current.next != null;
            }

            @Override
            public E next() {
                Node<E> res=current.next;
                current = current.next;
                return res.value;
            }
        };
    }



}