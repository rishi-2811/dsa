class Solution {
    public int sumSubarrayMins(int[] nums2) {
        int mod = 1000000007;
        Map<Integer, Integer> mp = new HashMap<>();
        Stack<Integer> s = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && nums2[i] < nums2[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                mp.put(i, nums2.length);
            } else {
                mp.put(i, s.peek());
            }
            s.push(i);
        }

        Map<Integer, Integer> m = new HashMap<>();
        Stack<Integer> s1 = new Stack<>();

        for (int i = 0; i < nums2.length; i++) {
            while (!s1.isEmpty() && nums2[i] <= nums2[s1.peek()]) {
                s1.pop();
            }

            if (s1.isEmpty()) {
                m.put(i, -1);
            } else {
                m.put(i, s1.peek());
            }
            s1.push(i);
        }

        int sum = 0;
        for (int a = 0; a < nums2.length; a++) {
            int l = m.get(a);
            int r = mp.get(a);
            long count = (long)(a - l) * (r - a) % mod;
            long contrib = (count * nums2[a]) % mod;
            sum = (int)((sum + contrib) % mod);
        }

        return sum;
    }
}
