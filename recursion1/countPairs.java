public int countPairs(String str) {
  if (str.length() < 3) return 0;
  int add = (str.charAt(0) == str.charAt(2)) ? 1 : 0;
  return add + countPairs(str.substring(1));
}
