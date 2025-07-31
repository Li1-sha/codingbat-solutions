public int[] zeroFront(int[] nums) {
  int[] result = new int[nums.length];
  int zeroIndex = 0;
  int nonZeroIndex = nums.length - 1;

  for (int num : nums) {
    if (num == 0)
      result[zeroIndex++] = 0;
    else
      result[nonZeroIndex--] = num;
  }
  int left = zeroIndex;
  int right = nums.length - 1;
  while (left < right) {
    int temp = result[left];
    result[left] = result[right];
    result[right] = temp;
    left++;
    right--;
  }
  return result;
}
