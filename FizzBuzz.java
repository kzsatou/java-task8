public class FizzBuzz {
    public static void main(String[] args) {
        int sumNumber;
        sumNumber = Integer.parseInt(args[0]);
        for (int i = 1; i <= sumNumber; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
