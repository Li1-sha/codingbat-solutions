public int countAbc(String str) {
  if (str.length() < 3) return 0;

  String first3 = str.substring(0, 3);
  int add = (first3.equals("abc") || first3.equals("aba")) ? 1 : 0;

  return add + countAbc(str.substring(1));
}
