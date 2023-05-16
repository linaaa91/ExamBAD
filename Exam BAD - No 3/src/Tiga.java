//Maulina - 2602171741

import java.text.SimpleDateFormat;
import java.util.Date;
public class Tiga {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
        String formattedDate = formatter.format(date);
        System.out.println("Tanggal dalam format 'dd MM yyyy': " + formattedDate);
    }
}