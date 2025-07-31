public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<>();
  for (String s : strings) {
    if (s.length() > 0)
      map.put(s.substring(0, 1), s.substring(s.length() - 1));
  }
  return map;
}
