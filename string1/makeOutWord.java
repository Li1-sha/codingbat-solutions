public String makeOutWord(String out, String word) {
  String tag1 = out.substring(0,2);
  String tag2 = out.substring(2,4);
  return tag1+word+tag2;
}
