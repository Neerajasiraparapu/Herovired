import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        HashMap<Integer,Integer> hashmap=new HashMap<>();
        Scanner s=new Scanner(System.in);
        System.out.println("ArraySuperSet length: ");
        int n=s.nextInt();
        System.out.println("ArraySuperSet: ");
        int arrSup[]=new int[n];
        for(int i=0;i<n;i++){
            arrSup[i]=s.nextInt();
        }    
        System.out.println("ArraySubSet length: ");
        int m=s.nextInt();
        System.out.println("ArraySubSet: ");
        int arrSub[]=new int[m];
        for(int i=0;i<m;i++){
            arrSub[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
            hashmap.put(arrSup[i],hashmap.getOrDefault(arrSup[i],0)+1);
        for(int i=0;i<m;i++)
        {
            if(hashmap.containsKey(arrSub[i]))
                System.out.println("Frequency of "+arrSub[i]+" : "+hashmap.get(arrSub[i]));
            else
                System.out.println("Frequency of "+arrSub[i]+" : 0");
        }
        
    }
}
