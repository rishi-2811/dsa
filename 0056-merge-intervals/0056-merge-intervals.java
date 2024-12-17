import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        
        int k = 0;
        while(k < intervals.length) {
            int start = intervals[k][0];
            int end = intervals[k][1];
            int i = k;
            int j = k + 1;
            
            while(j < intervals.length && end >= intervals[j][0]) {
                end = Math.max(end, intervals[j][1]);
                i++;
                j++;
            }
            
            merged.add(new int[]{start, end});
            k = i + 1;
        }
        
        return merged.toArray(new int[merged.size()][]);
    }
}