boolean doubleX(String str) {
  int i = str.indexOf("x");
  if (i == -1) 
    return false;
  else if (i+1 >= str.length()) 
    return false;
  else
    return str.substring(i+1, i+2).equals("x");
}
