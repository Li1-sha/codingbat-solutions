public int[] seriesUp(int n) {
  int size = n * (n + 1) / 2;
  int[] result = new int[size];
  int index = 0;

  for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
      result[index++] = j;
    }
  }
  return result;
}
