import java.util.HashSet;
import java.util.Iterator;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class CheckIntersection {
    public static void main(String args[]) {
        String s1 = "0.1";
        String s2 = "0.01";
        int ans = compareVersion(s1, s2);
        if (ans == 0)
            System.out.println("V1=V2");
        if (ans == 1)
            System.out.println("V1>V2");
        if (ans == -1)
            System.out.println("V1<V2");
    }

    private static int compareVersion(String version1, String version2) {
        if (version1.isEmpty() && version2.isEmpty()) return 0;

        int ind1 = version1.indexOf('.'), n1 = 0, n2 = 0;
        if (ind1 != -1) {
            n1 = Integer.parseInt(version1.substring(0, ind1));
            version1 = version1.substring(ind1 + 1);
        } else if (!version1.isEmpty()) {
            n1 = Integer.parseInt(version1);
            version1 = "";
        }

        int ind2 = version2.indexOf('.');
        if (ind2 != -1) {
            n2 = Integer.parseInt(version2.substring(0, ind2));
            version2 = version2.substring(ind2 + 1);
        } else if (!version2.isEmpty()) {
            n2 = Integer.parseInt(version2);
            version2 = "";
        }

        return n1 > n2 ? 1 : (n1 < n2 ? -1 : compareVersion(version1, version2));

    }
}