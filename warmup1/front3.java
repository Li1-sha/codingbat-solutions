public String front3(String str) {
  String f;
  if(str.length()>=3)
    f = str.substring(0,3);
  else
    f = str;
  return f+f+f;
}
