//package com.atlassian.interviews.uag;//dict [ this, is , a , long, valid, validated, ate, one, senetence, sent]
////Thisisalongsentencevalidatedone
////a, ate
////this v alidated long
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.PriorityQueue;
//import java.util.Queue;
//
//public class Dictionary {
//
//    static HashSet<String> dictionary ;
//    //public void constructDictionary(ArrayList<String> dict);
//
//
//    public static String sentence(String rawSentence){
//        int n = rawSentence.length();
//        Boolean[] isSentence = new Boolean[n];
//        List<Integer> wordPoint = new ArrayList<>();
//            Collections.sort(wordPoint);
//        Queue<Integer> q = new LinkedList<>();
//        q.peek()
//        wordPoint.sort();
//        for(int i=0; i<n; i++){
//            Integer.MAX_VALUE
//           isSentence[i] = false;
//        }
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(Comparator.reverseOrder());
//
//
//
//
//        int start =0;
//        int next =0;
//        boolean flag =false;
//
//
//        while (start != n) {
//            next = isWord(start, n, rawSentence);
//            if (start == 0 && next == -1) {
//                return "";
//            }
//            if(next==-1){
//                int wordSize = wordPoint.size();
//                flag=false;
//                for(int i=wordSize; i>0;i-- ){
//                    if(isWordExtended(start,n,rawSentence,wordPoint.get(i))!=-1)
//                       flag=true;
//                }
//                if(!flag){
//                    return "";
//                }
//            }
//            wordPoint.add(next);
//
//            start=next+1;
//        }
//
//        return "true";
//    }
//
//    public static Integer isWord(int start,int end, String rawSentence) {
//        String temp;
//        for(int i=start; i<end ; i++ ){
//            temp = rawSentence.substring(start,i);
//            if(dictionary.contains(temp)){
//                start=i;
//                return start;
//            }
//        }
//        return -1;
//    }
//    public static Integer isWordExtended(int start,int end, String rawSentence,int substringstart) {
//        String temp;
//        for(int i=start; i<end ; i++ ){
//            temp = rawSentence.substring(substringstart,i);
//            if(dictionary.contains(temp)){
//                start=i;
//                return start;
//            }
//        }
//        return -1;
//    }
//
//
//
//    public static void main(String args[]){
//        dictionary = new HashSet<>();
//        dictionary.addAll( Arrays.asList("this", "is" , "a" , "long", "valid", "validated", "ate", "one", "senetence", "sent"));
//        System.out.println(sentence("Thisisalongsentencevalidatedone"));
//    }
//}
