public String wordAppend(String[] strings) {
  Map<String, Integer> map = new HashMap<>();
  String result = "";

  for (String s : strings) {
    int count = map.getOrDefault(s, 0) + 1;
    map.put(s, count);
    if (count % 2 == 0) 
      result += s;
  }
  return result;
}
