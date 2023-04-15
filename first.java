import java.util.*;
public class first {
    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int numbers[]={12,13,14,15,16,2,56,67,78,56,45,34,56,678,45,34,34,56,67,5464,53,43};
        int key=45;
        int index=linearSearch(numbers, key);
        if(index==-1){
            System.out.print("Not found");
        }else{
            System.out.println("index present at"+index);
        }
       

        
        
    }
    
}
