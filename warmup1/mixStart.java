public boolean mixStart(String str) {
  if (str.length() < 3) 
    return false;
  String t2 = str.substring(1, 3);
  if (t2.equals("ix")) 
    return true;
  else 
    return false;
}
