class Solution {
    public int trap(int[] nums2) {
        int n = nums2.length;
        int[] mp = new int[n];
        Stack<Integer> s = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && nums2[i] >= nums2[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                mp[i] = 0;
            } else {
                mp[i] = nums2[s.peek()];
            }

            if (s.isEmpty() || nums2[i] > nums2[s.peek()]) {
                s.push(i);
            }
        }

        int[] m = new int[n];
        Stack<Integer> s1 = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!s1.isEmpty() && nums2[i] >= nums2[s1.peek()]) {
                s1.pop();
            }

            if (s1.isEmpty()) {
                m[i] = 0;
            } else {
                m[i] = nums2[s1.peek()];
            }

            if (s1.isEmpty() || nums2[i] > nums2[s1.peek()]) {
                s1.push(i);
            }
        }

        int sum = 0;
        for (int a = 0; a < n; a++) {
            int l = m[a];
            int r = mp[a];
            int min = Math.min(l, r);
            if (min > nums2[a]) {
                sum += min - nums2[a];
            }
        }

        return sum;
    }
}
