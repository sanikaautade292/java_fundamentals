class Sort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 5, 2};
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {   
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
}
