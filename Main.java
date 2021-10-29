public class Main
{
    public static int findMajority(int[] nums)
    {
        int major=0;
        int count=1;
        for(int i=1;i<n;i++){
            if(arr[major]==arr[i])
                count++;
            else
                count--;
            if(count==0){
                major=i;
                count=1;
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 1, 6, 2, 3, 4,1,1};
        int majority = findMajority(arr);
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==majority)
                count++;
        }
        if(count>n/2)
            System.out.println(" The majority element is : " + majority);
    }
}
