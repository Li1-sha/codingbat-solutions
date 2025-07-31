public int sum67(int[] nums) {
  int sum = 0;
  boolean inSection = false;

  for (int num : nums) {
    if (num == 6) {
      inSection = true;
    } else if (num == 7 && inSection) {
      inSection = false;
    } else if (!inSection) {
      sum += num;
    }
  }

  return sum;
}
