package Search;

public class binarySearch {
    public static int binarySearching(int[] arr, int first, int last, int key){
        if (last>=first){
            int mid = first + (last - first)/2;
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid] > key){
                return binarySearching(arr, first, mid-1, key);//search in left subarray
            }else{
                return binarySearching(arr, mid+1, last, key);//search in right subarray
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int key = 5;
        int last=arr.length-1;
        int result = binarySearching(arr,0,last,key);
        if (result == -1)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: "+result);
    }
}
