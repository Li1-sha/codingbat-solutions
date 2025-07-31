public int[] pre4(int[] nums) {
  int i = 0;
  while (nums[i] != 4) {
    i++;
  }
  int[] result = new int[i];
  for (int j = 0; j < i; j++) {
    result[j] = nums[j];
  }
  return result;
}
