public String mixString(String a, String b) {
  String result = "";
  int minL = Math.min(a.length(), b.length());

  for (int i = 0; i < minL; i++) {
    result += a.charAt(i);
    result += b.charAt(i);
  }

  if (a.length() > minL)
    result += a.substring(minL);
  else if (b.length() > minL)
    result += b.substring(minL);

  return result;
}
