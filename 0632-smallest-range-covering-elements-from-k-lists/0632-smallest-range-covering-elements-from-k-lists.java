class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        List<int[]> order = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            for (int n : nums.get(i)) {
                order.add(new int[] { n, i });
            }
        }
        Collections.sort(order, (a, b) -> Integer.compare(a[0], b[0]));
        int i = 0, k = 0;
        int[] ans = new int[0];
        Map<Integer, Integer> count = new HashMap<>();
        for (int j = 0; j < order.size(); ++j) {
            if (count.getOrDefault(order.get(j)[1], 0) == 0) ++k;
            count.put(order.get(j)[1], count.getOrDefault(order.get(j)[1], 0) + 1);

            if (k == nums.size()) {
                while (count.get(order.get(i)[1]) > 1) {
                    count.put(order.get(i)[1], count.get(order.get(i)[1]) - 1);
                    ++i;
                }

                if (ans.length == 0 || ans[1] - ans[0] > order.get(j)[0] - order.get(i)[0]) {
                    ans = new int[] { order.get(i)[0], order.get(j)[0] };
                }
            }
        }
        return ans;
    }
}