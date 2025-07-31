public boolean twoTwo(int[] nums) {
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 2) {
      boolean hasNeighbor = (i > 0 && nums[i - 1] == 2) || (i < nums.length - 1 && nums[i + 1] == 2);
      if (!hasNeighbor) {
        return false;
      }
    }
  }
  return true;
}
