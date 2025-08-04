public boolean groupSum5(int start, int[] nums, int target) {
  if (start >= nums.length) return target == 0;
  int val = nums[start];
  if (val % 5 == 0) {
    if (start + 1 < nums.length && nums[start + 1] == 1) {
      return groupSum5(start + 2, nums, target - val);
    } else {
      return groupSum5(start + 1, nums, target - val);
    }
  } else {
    if (groupSum5(start + 1, nums, target - val)) return true;
    return groupSum5(start + 1, nums, target);
  }
}
