public class Main {
    public static void main(String[] args) {
        int[] nums = {12,14,16,10,9,19,8,89,13,18};
        int choice = 19;
        int ans = linearSearch(nums,choice);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr,int target){
        for(int i=0;i<=arr.length;i++){
            int choice = arr[i];
            if(choice == target){
                return i;
            }
        }
        return -1;
    }
}
