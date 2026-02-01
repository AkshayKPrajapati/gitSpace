public class TestConflict {
    public static void main(String[] args) {
        System.out.println("This is a test for merge conflict.");
        System.out.println("Line from branch A");
<<<<<<< HEAD
        System.out.println("Line from branch A");
=======
        System.out.println("Line from branch B");
>>>>>>> 0640d48ea33437aca0d3f47ba4520cfe868f32bf
        System.out.println("Line from branch C");
        System.out.println("Line from branch D");
        System.out.println("Line from branch E");
    }
}