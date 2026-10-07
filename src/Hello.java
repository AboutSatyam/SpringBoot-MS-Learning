public class Hello {
    public static void main(String[] args) {
        int a = 110;
        int b = 212;
        try {
            if (a == 10 || b == 12) {
                System.out.println("Hello World , " + " a= " + a + " , b= " + b);
            } else
                System.out.println("FNF");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
