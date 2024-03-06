import java.util.Scanner;

public class SearchByRange {
    public static void main(String[] args) {
        int[] numbers = {12,14,16,10,9,19,8,89,13,18};
        Scanner yourTake = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int var1 = yourTake.nextInt();
        Scanner start = new Scanner(System.in);
        System.out.print("Enter where to start: ");
        int var2 = start.nextInt();
        Scanner end = new Scanner(System.in);
        System.out.print("Enter where to end: ");
        int var3 = end.nextInt();
        int ans = rangeSearch(numbers,var1,var2,var3);
        System.out.println();
        System.out.println(" Result:: ");
        System.out.println(ans);
    }
    static int rangeSearch(int[] arr,int target, int range1,int range2){
        for(int i=range1;i<=range2;i++){
            System.out.println(arr[i]);
            int choice = arr[i];
            if(choice == target){
                return i;
            }
        }
        return -1;
    }
}
