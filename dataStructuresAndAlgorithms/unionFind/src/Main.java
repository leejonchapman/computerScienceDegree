public class Main {
    public static void main(String[] args) {
        //Initialise array
        UF test = new UF(5);
        // Testing
        System.out.println(test.connected(1, 2));
        //Union ID
        test.union(0, 1);
        test.union(1, 2);
        test.union(3, 4);
        //toString component test
        System.out.println(test);
    }
}
