public int scoresAverage(int[] scores) {
  int mid = scores.length / 2;
  int firstAvg = average(scores, 0, mid);
  int secondAvg = average(scores, mid, scores.length);
  return Math.max(firstAvg, secondAvg);
}

public int average(int[] scores, int start, int end) {
  int sum = 0;
  for (int i = start; i < end; i++) {
    sum += scores[i];
  }
  return sum / (end - start);
}
