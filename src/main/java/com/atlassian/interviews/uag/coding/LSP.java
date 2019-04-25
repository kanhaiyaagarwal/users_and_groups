package com.atlassian.interviews.uag.coding;

import java.util.ArrayList;
import java.util.Scanner;


public class LSP {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
        System.out.println(isInterLeave("aab","axy" ,"aaxaby"));



    }

    public ArrayList<Integer> rotate(ArrayList<Integer> arr, int m) {
        int n = arr.size();
        int factor = gcd(n,m);
        if (m<0){
            m = n + m%n;
        }
        for(int i=0 ; i< factor ; i++){
            int next =i;
            int temp, tempval, val;
            tempval = arr.get(next);

            do {
                next =   (next+m)%n;
                val= arr.get(next);
                arr.set(next, tempval);
                tempval =val;

            }while (next!=i);
        }
        return arr;

    }

    public int gcd(int n, int m){

        //
        return 1;
    }

    public static boolean isInterLeavearr(String a, String b, String c, int[][] arr){

        int m=a.length();
        int n=b.length();
        m--;n--;
        if(arr[m][n]==0){
            return false;
        }else
            if(arr[m][n]==1){
            return true;
        }
        if((a+b).equals(c )||(b+a).equals(c ))
            return true;
        if(a.length()+b.length()!=c.length())
            return false;
        boolean t1=false,t2=false;
        if(a.isEmpty() && b==c){
            return true;
        }else
        if(b.isEmpty() && a==c)
            return true;
        if(a.isEmpty() || b.isEmpty())
            return false;

        if(a.charAt(0)==c.charAt(0))
            t1= isInterLeavearr(a.substring(1), b, c.substring(1), arr);
        if(b.charAt(0)==c.charAt(0))
            t2 = isInterLeavearr(a, b.substring(1), c.substring(1), arr);
        System.out.println(a+" "+ b+ " " +c);

        if(t1||t2)
            arr[m][n] = 1;
        else
            arr[m][n] = 0;

        return t1||t2;

    }

    public static boolean isInterLeave(String a,String b,String c)
    {
        int m=a.length();
        int n=b.length();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=-1;
            }
        }

        return isInterLeavearr(a, b, c, arr);

        //Your code here
    }


    boolean is_k_palin(String str, int k)
    {
        if(is_palin(str))
            return true;


        // Your code here
    }

    boolean is_palin(String st){
        int length = st.length();
        String reverse= "";
        reverse.trim();
        reverse.charAt(0);
        Integer.MAX_VALUE
        toString().isEmpty()
        for (int i = length - 1 ; i >= 0 ; i--)
            reverse = reverse + st.charAt(i);
        if(st.equals(reverse))
            return true;

        return false;
    }


    public static inorder(Node root){


    }

    class Node{
        int data;
        Node left,right;
        Node (int d){
            data=d;
            left=right=null;
        }
    }

}
