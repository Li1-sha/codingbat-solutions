public boolean groupSum6(int start, int[] nums, int target) {
  if (start >= nums.length) return target == 0;
  int val = nums[start];
  if (val == 6) {
    return groupSum6(start + 1, nums, target - val);
  } else {
    if (groupSum6(start + 1, nums, target - val)) return true;
    return groupSum6(start + 1, nums, target);
  }
}
