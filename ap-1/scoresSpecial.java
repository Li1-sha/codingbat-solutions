public int scoresSpecial(int[] a, int[] b) {
  return maxSpecial(a) + maxSpecial(b);
}

public int maxSpecial(int[] scores) {
  int max = 0;

  for (int score : scores) {
    if (score % 10 == 0 && score > max) {
      max = score;
    }
  }

  return max;
}
