public class NonRepeat {
  public static Character nonRepeat(String str) {
    if (str.length() == 1 || str.charAt(0) != str.charAt(1)) 
      return str.charAt(0);
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) != str.charAt(i-1))
          return str.charAt(i);
    }
    return null;
  }
  public static void main(String[] args) {
    System.out.println(nonRepeat("TThe Ghost was awakened"));
    System.out.println(nonRepeat("Run them jewels fast"));
    System.out.println(nonRepeat("aabbbbcccdeefffdeiioo"));
    System.out.println(nonRepeat("aaa"));
  }
}


