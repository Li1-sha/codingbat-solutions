public boolean split53(int[] nums) {
  return helper(0, 0, 0, nums);
}
public boolean helper(int i, int sum1, int sum2, int[] nums) {
  if (i == nums.length) return sum1 == sum2;
  int val= nums[i];
  if (val % 5 == 0) {
    return helper(i + 1, sum1 + val, sum2, nums);
  } else if (val % 3 == 0) {
    return helper(i + 1, sum1, sum2 + val, nums);
  } else {
    if (helper(i + 1, sum1 + val, sum2, nums)) return true;
    return helper(i + 1, sum1, sum2 + val, nums);
  }
}
