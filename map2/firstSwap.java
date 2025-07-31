public String[] firstSwap(String[] strings) {
  Map<String, Integer> map = new HashMap<>();
  Set<String> swapped = new HashSet<>();

  for (int i = 0; i < strings.length; i++) {
    String key = strings[i].substring(0, 1);
    if (map.containsKey(key) && !swapped.contains(key)) {
      int j = map.get(key);
      String temp = strings[i];
      strings[i] = strings[j];
      strings[j] = temp;
      swapped.add(key);
    } else if (!map.containsKey(key)) {
      map.put(key, i);
    }
  }
  return strings;
}
