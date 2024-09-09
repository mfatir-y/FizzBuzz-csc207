public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int c = 0;
        while (i != 0) {
            if (i % 2 == 0) {
                i = i / 2;
                c++;
            } else {
                i--;
                c++;
            }
        }
        System.out.println(c);
    }
}
