//package com.atlassian.interviews.uag.coding;
//
//import java.io.InputStream;
//import java.util.Scanner;
//import java.util.Stack;
//
//public class SpecialStack {
//
//    int mini = Integer.MAX_VALUE;
//    public void push(int a, Stack<Integer> s)
//    {
//        s.empty()
//            s.contains()
//        if(s.isEmpty()){
//            mini=a;
//            s.push(a);
//            return;
//        }
//        if(a > mini){
//            s.push(a);
//            return;
//        }
//        int temp = mini;
//        mini=a;
//        temp = 2*a - temp;
//        s.push(temp);
//    }
//    public int pop(Stack<Integer> s)
//    {
//        Scanner s = new Scanner(System.in);
//
//        s.nextLine();
//        s.nextInt()
//        if(s.isEmpty()){
//            return 0;
//        }
//        int temp = s.pop();
//        if(temp>mini)
//            return temp;
//        int mini2 = 2*mini - temp;
//        temp=mini;
//        mini=mini2;
//        return temp;
//        //add code here.
//    }
//    public int min(Stack<Integer> s)
//    {
//        return mini;
//        //add code here.
//    }
//    public boolean isFull(Stack<Integer>s, int n)
//    {
//        if(s.size()>=n)
//            return true;
//        return false;
//        //add code here.
//    }
//    public boolean isEmpty(Stack<Integer>s)
//    {
//        return s.isEmpty();
//        //add code here.
//    }
//}