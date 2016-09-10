import java.util.Scanner;

public class JavaProgram
{
public static void main(String args[])
    {
        int countp=0, countn=0, countz=0, i;
        int arr[] = new int[5];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter 5 Numbers : ");
        for(i=0; i<5; i++)
        {
            arr[i] = scan.nextInt();
        }
        for(i=0; i<5; i++)
        {
            if(arr[i] < 0)
            {
               countn++;
            }
            else if(arr[i] == 0)
            {
                countz++;
            }
            else
            {
                countp++;
            }
        }
		
        System.out.print("\n" +countp + " Positive Numbers");
        System.out.print("\n" +countn + " Negative Numbers");
        System.out.print("\n" +countz + " Zero");
    }
}
