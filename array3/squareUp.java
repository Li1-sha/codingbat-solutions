public int[] squareUp(int n) {
  int[] result = new int[n * n];
    for (int i = 1; i <= n; i++) {
        int groupStart = n * i;
        for (int j = 1; j <= i; j++) {
            result[groupStart - j] = j;
        }
    }
  return result;
}
