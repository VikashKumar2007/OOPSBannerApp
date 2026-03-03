public class arrayinit {
   public arrayinit () {
   }

   public static void main(String[] var0) {
      String[] var1 = new String[]{String.join(" ", " * ", " ** ", " ** ", " ** "), String.join(" ", "   ", "     ", "     ", "     "), String.join(" ", "*   ", "     ", "     ", "     "), String.join(" ", "*   ", "     ", " ** ", " ** "), String.join(" ", "   ", "     ", "     * ", "     * "), String.join(" ", "   ", "     ", "     * ", "     * "), String.join(" ", " ** ", " ** ", " ** ", " *** ")};

      for(String var5 : var1) {
         System.out.println(var5);
      }

   }
}
