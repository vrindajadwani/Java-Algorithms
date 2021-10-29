public class Main {
    static int binarySearchIterative(int arr[],int n, int key){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
                high = mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
    static int binarySearchRecursive(int arr[],int low, int high,int key){
        if(low>high)
            return -1;
        int mid = low + (high-low)/2;
        if(arr[mid]==key)
            return mid;
        if(arr[mid]>key)
            return binarySearchRecursive(arr,low,mid-1,key);
        return binarySearchRecursive(arr,mid+1,high,data);
    }
    public static void main(String[] args) {
        int key=5;
        int arr[] = {4,6,1,4,8,5,10,9};
        int n = arr.length;
        System.out.println("Key found at : " + binarySearchIterative(arr,n,key));
        System.out.println("Key found at : " + binarySearchRecursive(arr,n,key));
    }
}
