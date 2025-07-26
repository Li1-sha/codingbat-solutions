public String twoChar(String str, int i) {
  if (i < 0 || i + 1 >= str.length()) 
    return str.substring(0, 2);
  return str.substring(i, i + 2);
}
