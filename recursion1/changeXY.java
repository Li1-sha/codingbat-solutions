public String changeXY(String str) {
  if (str.length() == 0) return "";
  char first = str.charAt(0);
  String fixedFirst = (first == 'x') ? "y" : String.valueOf(first);
  return fixedFirst + changeXY(str.substring(1));
}
