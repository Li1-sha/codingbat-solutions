public boolean modThree(int[] nums) {
  for (int i = 0; i < nums.length - 2; i++) {
    boolean allEven = nums[i] % 2 == 0 && nums[i+1] % 2 == 0 && nums[i+2] % 2 == 0;
    boolean allOdd = nums[i] % 2 != 0 && nums[i+1] % 2 != 0 && nums[i+2] % 2 != 0;
    if (allEven || allOdd) 
      return true;
  }
  return false;
}
