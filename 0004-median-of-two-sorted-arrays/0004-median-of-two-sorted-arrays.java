class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int k=(m+n)%2==0?(m+n)/2:(m+n+1)/2;
        int low=0;
        int high=Math.min(m,n);
        int mid;
        int l1=0,l2=0,r1=0,r2=0;
        while(low<=high){
            
           
            if(m>=n){
              
              mid=(low+high)/2;
              l1=mid==0?Integer.MIN_VALUE:nums2[mid-1];
              l2=mid==k?Integer.MIN_VALUE:nums1[k-mid-1];
              r1=mid==n?Integer.MAX_VALUE:nums2[mid];
              r2=mid==0 && k==m?Integer.MAX_VALUE:nums1[k-mid];
              if(l1<=r2 && l2<=r1){
                break;
              }
              else if(l1>r2){
                high=mid-1;
              }
              else{
                low=mid+1;
              }
        }
        else{
            
            mid=(low+high)/2;
              l1=mid==0?Integer.MIN_VALUE:nums1[mid-1];
              l2=mid==k?Integer.MIN_VALUE:nums2[k-mid-1];
              r1=mid==m?Integer.MAX_VALUE:nums1[mid];
              r2=mid==0 && k==n?Integer.MAX_VALUE:nums2[k-mid];
              if(l1<=r2 && l2<=r1){
                break;
              }
              else if(l1>r2){
                high=mid-1;
                
              }
              else{
                low=mid+1;
              }
        }
        
        }
        return (m+n)%2==0?(Math.max(l1,l2)+Math.min(r1,r2))/2.0:(double) Math.max(l1,l2);
    }
}