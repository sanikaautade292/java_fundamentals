class Arm {
    public static void main(String[] args) {

        int num = 153;
        int original = num;   // save original number

        int count = 0;
        int rem;
        int armst = 0;

        // Step 1: Count digits
        while (num > 0) {
            count++;
            num = num / 10;
        }

        num = original;   // restore number

        // Step 2: Armstrong calculation
        while (num > 0) {
            rem = num % 10;
            armst = armst + (int) Math.pow(rem, count);
            num = num / 10;
        }

        // Step 3: Compare
        if (original == armst) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
