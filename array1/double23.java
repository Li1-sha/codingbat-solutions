public boolean double23(int[] nums) {
  if(nums.length>1)
    if(nums[0]==2 && nums[1]==2 || nums[0]==3 && nums[1]==3)
      return true;
  return false;
}
