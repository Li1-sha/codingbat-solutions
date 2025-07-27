public boolean squirrelPlay(int temp, boolean isSummer) {
  int lim;
  if(isSummer)
    lim = 100;
  else
    lim = 90;
  if(temp >= 60 && temp <= lim)
    return true;
  return false;
}
