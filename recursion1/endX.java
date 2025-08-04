public String endX(String str) {
  if (str.length() == 0) return "";
  char first = str.charAt(0);
  String rest = endX(str.substring(1));
  if (first == 'x') {
    return rest + 'x';
  } else {
    return first + rest;
  }
}
