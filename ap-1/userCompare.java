public int userCompare(String aName, int aId, String bName, int bId) {
  String aFirst = "", aLast = aName;
  String bFirst = "", bLast = bName;

  if (aName.contains(" ")) {
    String[] aParts = aName.split(" ");
    aFirst = aParts[0];
    aLast = aParts[1];
  }

  if (bName.contains(" ")) {
    String[] bParts = bName.split(" ");
    bFirst = bParts[0];
    bLast = bParts[1];
  }

  int lastComp = aLast.compareTo(bLast);
  if (lastComp != 0) return lastComp < 0 ? -1 : 1;

  int firstComp = aFirst.compareTo(bFirst);
  if (firstComp != 0) return firstComp < 0 ? -1 : 1;

  return Integer.compare(aId, bId);
}
