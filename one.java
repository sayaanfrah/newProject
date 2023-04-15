import java.util.*;
public class one {
    public static int largestsc(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }

        }System.out.println("The smallest number is:" + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int number[]={12,13,234,345,54,6,77,65,4353,2423,4656,76,79898,54534,65};
        System.out.println("the largest number is"+largestsc(number));
    }
    
}
