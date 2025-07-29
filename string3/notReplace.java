public String notReplace(String str) {
  String result = "";
  int i = 0;

  while (i < str.length()) {
    if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) {
      boolean beforeOk = (i == 0) || !Character.isLetter(str.charAt(i - 1));
      boolean afterOk = (i + 2 == str.length()) || !Character.isLetter(str.charAt(i + 2));

      if (beforeOk && afterOk) {
        result += "is not";
        i += 2;
        continue;
      }
    }
    result += str.charAt(i);
    i++;
  }
  return result;
}
