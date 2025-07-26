public String lastChars(String a, String b) {
  char first;
  char last;
  if(a.length() > 0)
    first = a.charAt(0);
  else
    first = '@';
  if(b.length() > 0)
    last = b.charAt(b.length() - 1);
  else
    last = '@';
  return "" + first + last;
}
