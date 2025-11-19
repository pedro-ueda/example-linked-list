public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public void addLast(E element) {
        Node<E> nodeToAdd = new Node<>(element);

        if(size == 0) {
            head = nodeToAdd;
        }else {
            tail.setNext(nodeToAdd);
        }

        tail = nodeToAdd;
        size++;
    }

    public E get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<E> current = head;

        for(int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getValue();
    }

    public void print() {
        Node<E> current = head;

        while(current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public void add(int index, E element) {
        if((index - 1) < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<E> nodeAnterior = new Node<>(get(index - 1));

        Node<E> oldNode = new Node<>(get(index));

        Node<E> nodeToAdd = new Node<>(element);

        nodeAnterior.setNext(nodeToAdd);

        nodeToAdd.setNext(oldNode);
    }
}
