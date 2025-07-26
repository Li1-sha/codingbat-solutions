public String stringYak(String str) {
  String out = "";
  
  for (int i=0; i<str.length(); i++) {
    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k')
      i += 2;
    else 
      out +=str.charAt(i);
  }
  return out;
}
