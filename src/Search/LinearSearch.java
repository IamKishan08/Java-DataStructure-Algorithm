package Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {23,5,53,44,50};

        int key = 50;

        for (int i = 0; i < arr.length ; i++) {
            if (key == arr[i]) {
                System.out.println("Element is found at index : " +i);
            }


        }
    }
}
