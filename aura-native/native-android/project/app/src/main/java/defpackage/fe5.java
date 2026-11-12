package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fe5 {
    public static final byte[] a = {-3, 55, 122, 88, 90, 0};
    public static volatile int b;

    static {
        int i;
        HashMap map = new HashMap();
        map.put(".txz", ".tar");
        map.put(".xz", "");
        map.put("-xz", "");
        HashMap map2 = new HashMap();
        Collections.unmodifiableMap(map);
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        for (Map.Entry entry : map.entrySet()) {
            int length = ((String) entry.getKey()).length();
            if (length > i2) {
                i2 = length;
            }
            if (length < i3) {
                i3 = length;
            }
            String str = (String) entry.getValue();
            int length2 = str.length();
            if (length2 > 0) {
                if (!map2.containsKey(str)) {
                    map2.put(str, entry.getKey());
                }
                if (length2 > i5) {
                    i5 = length2;
                }
                if (length2 < i4) {
                    i4 = length2;
                }
            }
        }
        b = 1;
        try {
            Class.forName("org.osgi.framework.BundleEvent");
        } catch (Exception unused) {
            if (b == 1) {
                try {
                    ee5.f();
                    i = 2;
                } catch (NoClassDefFoundError unused2) {
                    i = 3;
                }
                b = i;
            }
        }
    }
}
