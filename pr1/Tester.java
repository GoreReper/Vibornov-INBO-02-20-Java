package pr1;


public class Tester {
    public static void main(String[] args) {
        var b1 = new Book("War and Peace","Pushkin",5000);
        b1.setAuthor("Tolstoy");
        System.out.println(b1);
        var b2 = new Ball("Wilson",10);
        b2.setWeight(350);
        System.out.println(b2);
    }
}
