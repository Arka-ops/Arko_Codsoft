
import java.util.*;
public class grade_calculator_ {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,cnt=0,n,Total_marks;
        System.out.println("How many subject you want to calculated");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter mark for subject out of 100"+(i+1));
            arr[i]=sc.nextInt();
            
        }
         for(int i=0;i<n;i++){
             sum+=arr[i];
             cnt++;
         }
         Total_marks=sum;
         double avg=(sum/cnt);
         System.out.println("The Total marks is :"+Total_marks);
         System.out.println("The avg percentile of the marks is :"+avg);
         int avg1=(int)avg;
         if(avg1>80 && avg1<=100)
         {
             System.out.println("The coresponding grade is:"+"A");
         }
         else if(avg1>60 && avg1<=80)
         {
             System.out.println("The coresponding grade is:"+"B");
         }
         else if(avg1>40 && avg1<=60)
         {
             System.out.println("The coresponding grade is:"+"C");
         }
         else if(avg1>20 && avg1<=40)
         {
             System.out.println("The coresponding grade is:"+"D");
         }
         else
         {
          System.out.println("The coresponding grade is:"+"F");   
         }
         
         

    }
}
