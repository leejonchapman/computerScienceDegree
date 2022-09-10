public class Main {
    public static void main(String[] args) {
        QF test = new QF(10);
        test.union(4, 3);
        test.union(3, 8);
        test.union(6, 5);
        test.union(9, 4);
        test.union(2, 1);
        System.out.println(test);
    }
}
