public int countX(String str) {
  if (str.length() == 0) 
    return 0;
  int add = (str.charAt(0) == 'x') ? 1 : 0;
  return add + countX(str.substring(1));
}
