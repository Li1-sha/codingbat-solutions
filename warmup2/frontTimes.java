public String frontTimes(String str, int n) {
  int fr = 3;
  if (fr > str.length()) {
    fr = str.length();
  }
  String f = str.substring(0, fr);
  
  String x = "";
  for (int i=0; i<n; i++) {
    x += f;
  }
  return x;
}
