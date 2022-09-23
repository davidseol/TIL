public class Tird {
    public static void main(String[] args) {
        int var1, var2, var3;

        while (true) {
            var1 = (int) (Math.random() * 6 + 1);
            var2 = (int) (Math.random() * 6 + 1);
            var3 = var1 + var2;
            System.out.println("("+var1+","+var2+")");
            if(var3 == 5) {
                break;
            }
        }
    }
}