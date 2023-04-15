import java.util.*;
public class smalest {
    public static int smallestsc(int numbers[]){
        int smallest=Integer.MAX_VALUE;// + infinity
       

        for(int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }return smallest;
    }
    public static int largestsc(int numbers[]){
        int largest=Integer.MIN_VALUE; //- infinity
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
           
        } return largest;
    }
    public static void main(String[] args) {
        int numbers[]={12,23,43,54345,234,2354,345,34,534,53243245,456,56,7,6,345,6,567,567,45,643,54,567,567,545,345,34,5,464};
        System.out.println("the smallest number  is"+smallestsc(numbers));
        System.out.println("the laregst number is:"+largestsc(numbers));

    }
    
}
