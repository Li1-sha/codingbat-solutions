public String sameEnds(String string) {
  int len = string.length();
  int max = len / 2;

  for (int i = max; i > 0; i--) {
    String prefix = string.substring(0, i);
    String suffix = string.substring(len - i);
    if (prefix.equals(suffix)) {
      return prefix;
    }
  }
  return "";
}
