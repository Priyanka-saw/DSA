public class practice {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 8};
        System.out.println(maxVal(arr));
    }
    public static int maxVal(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max){
                max = arr[i];
            }

        }
        return max;
    }
}
