class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=1;
        int high=arr.length;
        int mid;
        int pos=0;
        while(low<=high){
            mid=(low+high)/2;
            if(mid==1){
                if(arr[mid-1]-mid>=k){
                   return k;
                }
            }
            if(mid==arr.length){
                if(arr[mid-1]-mid>=k){
                   return k+mid-1;
                }
                else{
                    return k+mid;
                }
            }
            if(high-low==1){
                if(arr[mid-1]-mid>=k){
                   return k+mid-1;
                }
            }
            if(low==high){
                if(arr[mid-1]-mid>=k){
                   return k+mid-1;
                }
                else{
                    return k+mid;
                }
            }
            else if(arr[mid-1]-mid>=k){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
            
        }
        return pos;
    }
}