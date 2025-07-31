public int[] fix45(int[] nums) {
  int j = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 4 && nums[i + 1] != 5) {
        while (j < nums.length) {
          if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4)) {
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
