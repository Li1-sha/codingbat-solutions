public String startWord(String str, String word) {
  if (word.length() > str.length())
      return "";
  String strPart = str.substring(1, word.length());
  String wordPart = word.substring(1);
  if (strPart.equals(wordPart))
      return str.substring(0, word.length());
  return "";
}
