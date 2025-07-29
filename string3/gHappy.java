public boolean gHappy(String str) {
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'g') {
      boolean hasLeft = (i > 0 && str.charAt(i - 1) == 'g');
      boolean hasRight = (i < str.length() - 1 && str.charAt(i + 1) == 'g');
      if (!hasLeft && !hasRight)
        return false;
    }
  }
  return true;
}
