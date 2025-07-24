public String frontBack(String str) {
  if (str.length()<=1)
    return str;
  char f = str.charAt(0);
  String m = str.substring(1,str.length()-1);
  char b = str.charAt(str.length()-1);
  return b+m+f;
}
