import java.util.Scanner;
public class BubbleShortExample05 {
    public static void main( String [] args){
        int [] intData = {43, 34, 87, 72, 32, 54, 18};
        int temp = 0;

        for (int i=0; i < intData.length; i++){
         for (int j=1; j < intData.length-1; j++) {
          if (intData[j-1] < intData [j] ){
                temp = intData[j];
                intData[j] = intData[j-1];
                intData[j-1] = temp;

            }
          }
       }
        System.out.println("Hasil Pengurutan :");
    for (int i=0; i < intData.length; i++){
        System.out.println(intData[i]);

    }
    }
    
    
}
