public String repeatEnd(String str, int n) {
  String end = str.substring(str.length() - n);
  String result = "";
  
  for (int i = 0; i < n; i++)
    result += end;
  return result;
}
