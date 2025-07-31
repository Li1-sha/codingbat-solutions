public int[] evenOdd(int[] nums) {
  int[] result = new int[nums.length];
  int evenIndex = 0;
  int oddIndex = nums.length - 1;

  for (int num : nums) {
    if (num % 2 == 0) 
      result[evenIndex++] = num;
    else
      result[oddIndex--] = num;
  }

  int left = evenIndex;
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
