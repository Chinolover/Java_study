package EE.Date_;

import java.util.Date;
import java.time.Instant;

public class Instant_ {
    public static void main(String[] args) {
        //Instant 时间戳
        Instant now = Instant.now();
        System.out.println(now);

        Date date  = Date.from(now);
        Instant instant = date.toInstant();
        System.out.println(date);
        System.out.println(instant);
    }
}
