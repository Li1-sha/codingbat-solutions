public boolean catDog(String str) {
  int cats = 0;
  int dogs = 0;

  for (int i = 0; i < str.length() - 2; i++) {
      String sub = str.substring(i, i+3);
      if (sub.equals("cat")) {
          cats++;
      } else if (sub.equals("dog")) {
          dogs++;
      }
  }
  return cats == dogs;
}
