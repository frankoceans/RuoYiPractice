package HuaWeiExcise.A;

import java.util.Arrays;
import java.util.Scanner;

public class t2_Ipv4Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getResult(sc.nextLine()));
    }

    /**
     * @param s
     * @return
     */
    private static String getResult(String s) {
        try {
            Integer[] ip = Arrays.stream(s.split("#")).map(Integer::parseInt).toArray(Integer[]::new);
            if (ip.length != 4) return "invalid IP";
            int p1 = ip[0], p2 = ip[1], p3 = ip[2], p4 = ip[3];
            if (p1 >= 1 && p1 <= 128 && p2 >= 0 && p2 <= 255 && p3 >= 0 && p3 <= 255 && p4 >= 0 && p4 <= 255) {
                String tmp = getHexString(p1) + getHexString(p2) + getHexString(p3) + getHexString(p4);
                return Long.parseLong(tmp, 16) + "";
            } else {
                return "invalid IP";
            }
        } catch (Exception e) {
            return "invalid IP";
        }
    }

    private static String getHexString(int p) {
        String tmp = Integer.toHexString(p);
        if (tmp.length() < 2) tmp = "0" + tmp;
        return tmp;
    }

}
