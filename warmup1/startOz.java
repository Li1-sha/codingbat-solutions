public String startOz(String str) {
  String out = "";
  if (str.length()>=1 && str.charAt(0)=='o')
    out += str.charAt(0);
  if (str.length()>=2 && str.charAt(1)=='z')
    out += str.charAt(1);
  return out;
}
