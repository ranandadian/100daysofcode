class fr3{
  public static void main(String[] args){
  }
  public String front3(String str) {
    int i = 0;
    String s;
    if(str.length() >= 3){
      str = str.substring(0,3);
      s = str;
      while (i < 2){
        str = s.concat(str);
        i++;
      }
      return str;
    }else{
      String t = str;
      while(i < 2){
        str = t.concat(str);
        i++;
      }
      return str;
    }
  }
}
