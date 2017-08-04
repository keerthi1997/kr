import java.io.*;
import java.util.*;
import java.lang.*;
class Array{
  public static void main(String[] args)throws IOException
  {
  Scanner sc=new Scanner(System.in);
  int i;
   int n[]=new int[10];
   int m[]=new int[10];
   for(i=0;i<7;i++)
   {
     n[i]=sc.nextInt();
     }
     m[0]=n[6];
     m[1]=n[0];
     m[2]=n[5];
     m[3]=n[1];
     m[4]=n[4];
     m[5]=n[2];
     m[6]=n[3];
     for(i=0;i<7;i++)
     {
     System.out.print(m[i]+"\t");
     }
     }
     }
