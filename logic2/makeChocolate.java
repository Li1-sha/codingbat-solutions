public int makeChocolate(int small, int big, int goal) {
  int maxBigBars = goal / 5;
  int bigBarsUsed = Math.min(big, maxBigBars);
  int remaining = goal - (bigBarsUsed * 5);

  if (remaining <= small) 
    return remaining;
  else 
    return -1;
}
