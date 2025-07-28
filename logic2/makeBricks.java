public boolean makeBricks(int small, int big, int goal) {
  int maxBigBricks = goal / 5;
  int usedBigBricks = Math.min(big, maxBigBricks);
  int remaining = goal - (usedBigBricks * 5);
  return small >= remaining;
}
