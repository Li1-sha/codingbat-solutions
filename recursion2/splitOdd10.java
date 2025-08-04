public boolean splitOdd10(int[] nums) {
  return helper(0, 0, 0, nums);
}

public boolean helper(int i, int sum1, int sum2, int[] nums) {
  if (i == nums.length) {
    boolean g1ok = sum1 % 10 == 0 && sum2 % 2 == 1;
    boolean g2ok = sum2 % 10 == 0 && sum1 % 2 == 1;
    return g1ok || g2ok;
  }
  if (helper(i + 1, sum1 + nums[i], sum2, nums)) return true;
  return helper(i + 1, sum1, sum2 + nums[i], nums);
}
