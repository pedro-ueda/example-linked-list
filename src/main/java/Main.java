

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> teste = new MyLinkedList<>();

        teste.addLast("Diego");
        teste.addLast("Giuliana");
        teste.addLast("Marise");

        teste.print();

        System.out.println(teste.get(1));

        System.out.println(teste.get(3));
    }
}
