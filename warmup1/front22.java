public String front22(String str) {
  int n = 2;
  if (n > str.length()) 
    n = str.length();
  String front = str.substring(0, n);
  return front + str + front;
}
