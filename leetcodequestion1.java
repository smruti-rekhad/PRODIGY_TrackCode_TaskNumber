// mergesort leetcode question
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
import java.util.*;
class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       int i= m-1;
       int j=n-1;
       int k=m+n-1;
       while(i>=0 && j>=0){
          if(nums1[i]>nums2[j]){
            nums1[k--]=nums1[i--];
            
          }
          else{
            nums1[k--]=nums2[j--];
          }
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
          }
       
        }
    public static void main(String[]args){
    int[] nums1 = {1,2,3,0,0,0};
    int[] nums2 = {2,5,6};
    int m=3,n =3;

     merge(nums1 ,m ,nums2 ,n);

     System.out.println("SORTED ARRAY IS"+ Arrays.toString(nums1));

       
            
        
    }
}
