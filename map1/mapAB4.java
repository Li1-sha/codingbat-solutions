public Map<String, String> mapAB4(Map<String, String> map) {
  if (map.containsKey("a") && map.containsKey("b")) {
    String aV = map.get("a");
    String bV = map.get("b");

    if (aV.length() == bV.length()) {
      map.put("a", "");
      map.put("b", "");
    } else {
      String longer = (aV.length() > bV.length()) ? aV : bV;
      map.put("c", longer);
    }
  }
  return map;
}
