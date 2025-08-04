public int powerN(int base, int n) {
  if (n == 1) 
    return 1 * base;
  return base * powerN(base, n - 1);
}
