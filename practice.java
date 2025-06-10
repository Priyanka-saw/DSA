public class practice {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 8};
        System.out.println("maximum value is : "+ max(arr));
      
    }
    public static int max(int[] arr){
        int maxval = -1, secMaxval = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxval){
              maxval = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            
       
       if(arr[i] > secMaxval && arr[i] != maxval){
        secMaxval = arr[i];
       }
    }
       return secMaxval;
    }

}
