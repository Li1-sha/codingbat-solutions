public int sumNumbers(String str) {
  int sum = 0;
  String num = "";

  for (int i = 0; i < str.length(); i++) {
    char c = str.charAt(i);

    if (Character.isDigit(c)) {
        num += c; 
    }else {
      if (!num.isEmpty()) {
          sum += Integer.parseInt(num); 
          num = "";  
      }
    }
  }
  if (!num.isEmpty())
    sum += Integer.parseInt(num);

  return sum;
}
