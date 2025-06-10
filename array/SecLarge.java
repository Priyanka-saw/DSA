public class SecLarge {
    
    public static void main(String[] args){

        int[] arr = {1, 3, 5, 6};
        System.out.println("Second largest number" + " : " + seclarge(arr));
    }

    public static int seclarge(int[] arr){
        int largest = -1 , seclargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
       
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > seclargest && arr[i] != largest){
                seclargest = arr[i];
            }
        }
        return seclargest;
    }
}
