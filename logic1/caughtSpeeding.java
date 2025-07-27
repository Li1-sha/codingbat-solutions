public int caughtSpeeding(int speed, boolean isBirthday) {
  int allowance;
  if(isBirthday)
    allowance = 5;
  else
    allowance = 0;
  int adjSpeed = speed - allowance;
  if (adjSpeed <= 60) 
      return 0;
  else if (adjSpeed <= 80) 
      return 1;
  else 
      return 2;
}
