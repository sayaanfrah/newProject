import java.util.*;
public class ler {
    public static int largestsc(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }

        }
        System.out.println("The smallest number is "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={12,34,56,78,90,54,3412,54,67,8,89,34,56};
        System.out.println("The largest number is:"+ largestsc(numbers));
    }
    
}
