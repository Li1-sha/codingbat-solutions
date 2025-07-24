public String endUp(String str) {
  if (str.length() <= 3) 
    return str.toUpperCase();
  int c = str.length() - 3;
  String f = str.substring(0, c);
  String b  = str.substring(c); 
  return f + b.toUpperCase();
}
