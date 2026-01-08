public class Magic {

    public static void main(String[] args) {

        int myNumber = 5;

        if (myNumber == 0) {
            System.out.println("Number cannot be zero.");
            return;
        }

        int result = ((myNumber * myNumber + myNumber) / myNumber + 17 - myNumber) / 6;

        System.out.println("The magic number is: " + result);
    }
}
