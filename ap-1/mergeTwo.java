public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] result = new String[n];
  int i = 0, j = 0, index = 0;

  while (index < n) {
    int cmp = a[i].compareTo(b[j]);
    
    if (cmp < 0) {
      result[index++] = a[i++];
    } else if (cmp > 0) {
      result[index++] = b[j++];
    } else {  
      result[index++] = a[i];
      i++;
      j++;
    }
  }

  return result;
}
