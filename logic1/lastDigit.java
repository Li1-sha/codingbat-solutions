public boolean lastDigit(int a, int b, int c) {
  int aDig = a % 10;
  int bDig = b % 10;
  int cDig = c % 10;

  return aDig == bDig || aDig == cDig || bDig == cDig;
}
