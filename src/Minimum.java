public class Minimum {
    public static void main(String[] args) {
        int[] arr = {12,14,16,10,9,19,8,89,13,18};
        System.out.println(findMinimum(arr));
    }

    static int findMinimum(int[] arrays){
        int ans = arrays[0];
        for (int i=1;i<arrays.length;i++){
            if(arrays[i]<ans){
                ans = arrays[i];
            }
        }
        return ans;
    }
}
