public class maxVal{

    public static void main(String[] args) {
        int[] arr = {1, 2, 13, 4, 5};
        System.out.println(max(arr));
    }

    public static int max(int[] arr){
        int maxValue = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}