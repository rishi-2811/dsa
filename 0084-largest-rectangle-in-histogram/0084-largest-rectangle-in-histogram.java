class Solution {
    public int largestRectangleArea(int[] nums2) {
        int n = nums2.length;
        int[] mp = new int[n];
        Stack<Integer> s = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && nums2[i] < nums2[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                mp[i] = n;
            } else {
                mp[i] = s.peek();
            }
            s.push(i);
        }

        int[] m = new int[n];
        Stack<Integer> s1 = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!s1.isEmpty() && nums2[i] <= nums2[s1.peek()]) {
                s1.pop();
            }
            if (s1.isEmpty()) {
                m[i] = -1;
            } else {
                m[i] = s1.peek();
            }
            s1.push(i);
        }

        int max = 0;
        for (int a = 0; a < n; a++) {
            int l = m[a];
            int r = mp[a];
            int count = r - l - 1;
            int contrib = count * nums2[a];
            max = Math.max(max, contrib);
        }

        return max;
    }
}
