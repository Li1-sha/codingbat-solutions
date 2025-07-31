public int[] post4(int[] nums) {
  int lastIndex = -1;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4) {
      lastIndex = i;
    }
  }
  int[] result = new int[nums.length - lastIndex - 1];
  for (int i = lastIndex + 1, j = 0; i < nums.length; i++, j++) {
    result[j] = nums[i];
  }
  return result;
}
