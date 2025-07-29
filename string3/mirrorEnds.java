public String mirrorEnds(String string) {
  int len = string.length();
  int i = 0;

  while (i < len && string.charAt(i) == string.charAt(len - 1 - i))
    i++;

  return string.substring(0, i);
}
