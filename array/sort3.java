class Sorte {
    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 2};
        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}
