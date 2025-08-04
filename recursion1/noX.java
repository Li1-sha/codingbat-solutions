public String noX(String str) {
  if (str.length() == 0) return "";
  char first = str.charAt(0);
  if (first == 'x') {
    return noX(str.substring(1));
  }
  return first + noX(str.substring(1));
}
