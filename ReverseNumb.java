public class ReverseNumb {

    public static void main(String[] args) {

        int x = 1234;

        while(x != 0) {
            int digit = x % 10;
            x /= 10;
            System.out.println(digit);
        }

        //System.out.println(digit);
    }
}