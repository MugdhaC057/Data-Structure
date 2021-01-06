/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.*;
public class Serach{
    
    private int a[];
    
    public int getsize()
    {
        return a.length;
    }
    public void input()
    {
        System.out.println("Enter size:");
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        a=new int[size];
        System.out.println("Enter "+size+" elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();
        }
    }
    public void printArray()
    {
        System.out.println("Array has ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    
    public int BinarySearch(int start,int end,int key)
    {
        if(start==end)
        {
            if(key==a[start])
                return start;
            else
                return -1;
        }
        else
        {
            int mid=(start+end)/2;
            if(key==a[mid])
            {
                return mid;
            }
            else
            {
                if (key<a[mid])
                   return BinarySearch(start,mid-1,key);
                else
                    return BinarySearch(mid+1,end,key);
            }
        }
        
       }
        
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Serach obj=new Serach();
        obj.input();
        obj.printArray();//before
        System.out.println("Enter element to search:");
        int k=in.nextInt();
        int n=obj.getsize();
        int res=obj.BinarySearch(0,n-1,k);
        if (res==-1)
         System.out.println("Not found");
        else
          System.out.println("Found at"+(res+1)+" location");
 
        
    }
}
