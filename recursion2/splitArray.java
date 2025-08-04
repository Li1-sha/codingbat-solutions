public boolean splitArray(int[] nums) {
  return helper(0, nums, 0, 0);
}

public boolean helper(int i, int[] nums, int sum1, int sum2) {
  if (i == nums.length) return sum1 == sum2;

  if (helper(i + 1, nums, sum1 + nums[i], sum2)) return true;

  return helper(i + 1, nums, sum1, sum2 + nums[i]);
}
