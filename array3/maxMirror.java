public int maxMirror(int[] nums) {
  int max = 0;
  for (int i = 0; i < nums.length; i++) {
    for (int j = nums.length - 1; j >= 0; j--) {
      int count = 0;
      int a = i;
      int b = j;
      while (a < nums.length && b >= 0 && nums[a] == nums[b]) {
        count++;
        a++;
        b--;
      }
      max = Math.max(max, count);
    }
  }
  return max;
}
