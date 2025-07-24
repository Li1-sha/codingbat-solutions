public boolean startHi(String str) {
  if (str.length() < 2) 
    return false;
  String f2 = str.substring(0, 2);
  if (f2.equals("hi")) 
    return true;
  else
    return false;
}
