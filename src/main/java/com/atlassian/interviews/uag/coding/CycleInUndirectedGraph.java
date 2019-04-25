//package com.atlassian.interviews.uag.coding;
//
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.Set;
//
//public class CycleInUndirectedGraph {
//
//        Set<Integer> isVisited;
//
//        Boolean isCyclic(int V, LinkedList<Integer>[] alist)
//        {
//            isVisited= new HashSet<>();
//            for(int i=0;i<V;i++){
//                if(!isVisited.contains(i)){
//                    isVisited.add(i);
//                    if(isCyclicUtil(alist,-1, i)==true){
//                        return true;
//                    }
//                }
//            }
//            //add code here.
//            return false;
//        }
//
//        Boolean isCyclicUtil(LinkedList<Integer>[] alist, int parent, int var){
//            if(isVisited.contains(var)&& var!=parent){
//                return true;
//            }
//            isVisited.add(var);
//            for(Integer i : alist[var]){
//               if( isCyclicUtil(alist, i, var)==true)
//                   return true;
//            }
//            int petrol[];
////            petrol.length
//            return false;
//        }
//
//        int minStep(int x, int y , int x1, int y1, int n){
//
//        }
//
//}
