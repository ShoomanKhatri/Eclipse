
public class NullPointerException {
    public static void main(String[] args) {
        String str = null; // str is not initialized
        System.out.println(str.length()); // This line will throw NullPointerException
    }
}
