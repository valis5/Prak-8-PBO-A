public class library {
    static {
        System.out.println("Library system initialized.");
    }

    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }
}

class main {
    public static void main(String[] args) {
        // Memanggil Library.convertToUpperCase("hello") dan menampilkan hasilnya
        String result = library.convertToUpperCase("hello");
        System.out.println(result); // Output yang diharapkan: HELLO
    }
}
