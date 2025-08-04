public int count8(int n) {
  if (n == 0) return 0;

  int last = n % 10;
  int rest = n / 10;

  if (last == 8) {
    if (rest % 10 == 8) {
      return 2 + count8(rest);
    } else {
      return 1 + count8(rest);
    }
  }
  return count8(rest);
}
