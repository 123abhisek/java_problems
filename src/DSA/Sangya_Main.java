package DSA;

class Sangya_Main{
    public static void main(String[]args){
        System.out.println("prefix_sum minimum value find");
//        int[] array = { -2, -5, 4, 7, -10, 1, -3, 8, 0, -6 };
        int[] array = { -6, 3, 4, -10 };
        int n = array.length;
      int prefix_sum = 0;
        for(int i = 0;i<n;i++){
            prefix_sum+=array[i];
        }
        System.out.println(prefix_sum);
        int []result_array =new int[array.length];
        int resultIndex = 0;
        //copy the positive elements TO RESULT_ARRAY
       for (int element : array) {
        if(element>0){
            result_array[resultIndex++] = element; 
        }
       }
       //copy the negative elements to resulT_ARRAY
       for (int element : array) {
        if(element<=0){
            result_array[resultIndex++] = element;
        }
       }
       for(int k =0;k<result_array.length;k++){
        System.out.print(result_array[k] +" ");
       }
       System.out.println(" ");

    //    now prefix sum of array 
    int oftersum = 0;
    int positive_value = 0;
    for(int m = 0;m<result_array.length;m++){
        oftersum+=result_array[m];
        System.out.println(oftersum);
        if(oftersum>0){
            positive_value++;
        }
       
    }
    System.out.println("Ofter separate the nagative positive value prefix sum of the array : "+oftersum);
    
    System.out.println("The positive value is : "+positive_value);
    }
}