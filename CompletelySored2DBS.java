import java.util.*;
public class CompletelySored2DBS {
    public static void main(String[] args) {
        int[][]arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println(Arrays);
    }
    static int[] binarySearch(int[][] matrix , int row , int cStart , int cEnd , int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cStart=mid+1;
            }else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix , int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        if(rows==1){
            return binarySearch(matrix,0,0,cols-1,target);
        }
        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;
        //run till two rows are remaining 
        while(rStart<rEnd){
            //while true--> more than 2 rows
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
        }
       
    }
}
