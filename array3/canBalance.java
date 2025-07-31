public boolean canBalance(int[] nums) {
  int total = 0;
    for (int num : nums) {
        total += num;
    }
    int leftSum = 0;
    for (int i = 0; i < nums.length; i++) {
        leftSum += nums[i];
        int rightSum = total - leftSum;
        if (leftSum == rightSum) {
            return true;
        }
    }
  return false;
}
