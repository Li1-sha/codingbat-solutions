public String plusOut(String str, String word) {
  String result = "";
  int i = 0;

  while (i < str.length()) {
    if (i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) {
      result += word;
      i += word.length();
    }else {
      result += "+";
      i++;
    }
  }
  return result;
}
