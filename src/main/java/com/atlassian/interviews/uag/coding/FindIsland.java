//package com.atlassian.interviews.uag.coding;
//
//public class FindIsland {
//
//    public static int findisland(int[][]a,int n,int m)
//    {
//        int count=0;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if(a[i][j]==1){
//                    count++;
//                    visit(a,n,m,i,j);
//                }
//
//            }
//
//        }
//        //Add your code here.
//        return count;
//    }
//
//    public static void visit(int[][] a, int n, int m, int i, int j){
//        if(i>=n || i<0 || j >=m || j<0){
//            return;
//        }
//        //Math.min
//
//        if(a[i][j]==1){
//            a[i][j]=-1;
//            visit(a,n,m,i-1,j-1);
//            visit(a,n,m,i,j-1);
//            visit(a,n,m,i+1,j-1);
//            visit(a,n,m,i-1,j);
//            visit(a,n,m,i-1,j+1);
//            visit(a,n,m,i,j+1);
//            visit(a,n,m,i+1,j);
//            visit(a,n,m,i+1,j+1);
//        }
//
//        return;
//
//    }
//
//}
//
//    public static int msis(int[] arr, int n){
//        int[] sum = new int[n];
//        sum[0]=arr[0];
//        for(int i=1;i<n;i++){
//            sum[i]=arr[i];
//        }
//        int max=sum[0];
//
//        for(int i=1;i<n;i++){
//            for(int j=i-1;j>=0;j--){
//                if(arr[i]>arr[j]){
//                    sum[i]= Math.max(sum[j]+arr[i], sum[i]);
//                }
//            }
//            max=Math.max(max, sum[i]);
//        }
//        return max;
//    }
//
//    public static int lsp(String s){
//        int n = s.length();
//        int arr[][] = new int[n+1][n+1];
//        int max=0;
//        for(int i=0;i<n+1;i++){
//            arr[0][i]=0;
//            arr[i][0]=0;
//        }
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i==j)
//                    arr[i][j]=1;
//                else {
//                    if(s.charAt(i-1)==s.charAt(j-1)){
//                        arr[i][j]=2+ arr[i+1][j-1];
//                    }else{
//                        arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1] );
//                    }
//                }
//                if(max<arr[i][j])
//                    max=arr[i][j];
//            }
//        }
//        return max;
//    }
//
//}
