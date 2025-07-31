public int[] withoutTen(int[] nums) {
  int[] result = new int[nums.length];
  int index = 0;
  for (int num : nums) {
    if (num != 10) 
      result[index++] = num;
  }
  return result;
}
