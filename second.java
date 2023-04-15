import java.security.Key;
import java.util.*;

import javax.print.attribute.standard.NumberUpSupported;
public class second{
    public static void update(int marks[],int nonChangable){
         nonChangable=10;
         for (int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
         }


    }
    //linear search
    public static int linearSearch(int numbers[],int key){
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                
                return i;
            }
            
        }
        return-1;
    }



    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16,18};
        int key=18;
       int index=linearSearch(numbers, key);
       if (index==-1){
        System.out.print("Not found");
       }else{
        System.out.println("value of key "+ key +" Whose index present at "+ index);
       }
        
    }
}