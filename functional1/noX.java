public List<String> noX(List<String> strings) {
  strings.replaceAll(s -> s.replace("x", ""));
  return strings;
}
