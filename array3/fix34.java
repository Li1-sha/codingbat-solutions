public int[] fix34(int[] nums) {
  int j = 0;
  for (int i = 0; i < nums.length - 1; i++) {
    if (nums[i] == 3 && nums[i + 1] != 4) {
      while (j < nums.length) {
        if (nums[j] == 4 && (j == 0 || nums[j - 1] != 3)) {
          int temp = nums[i + 1];
          nums[i + 1] = nums[j];
          nums[j] = temp;
          break;
        }
        j++;
      }
    }
  }
  return nums;
}
