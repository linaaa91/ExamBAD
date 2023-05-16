//Maulina -2602171741
public class Satu {
    public static void main(String args[]) {
        String str = "Bina Nusantara";
        System.out.println(removeString(str, 7)); // [1]
    }

    public static String removeString(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1); // [2]
    }
}