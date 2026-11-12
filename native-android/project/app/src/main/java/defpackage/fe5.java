package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fe5 {
    public static final byte[] a = null;
    public static volatile int b;

    static {
        a = new byte[]{-3, 55, 122, 88, 90, 0};
        HashMap r0 = new HashMap();
        r0.put(".txz", ".tar");
        r0.put(".xz", "");
        r0.put("-xz", "");
        HashMap r1 = new HashMap();
        Collections.unmodifiableMap(r0);
        Iterator r2 = r0.entrySet().iterator();
        int r3 = Integer.MIN_VALUE;
        int r4 = Integer.MAX_VALUE;
        int r5 = Integer.MAX_VALUE;
        int r6 = Integer.MIN_VALUE;
    L4:
        if (r2.hasNext() == false) goto L19;
        Map.Entry r7 = (Map.Entry) r2.next();
        int r8 = ((String) r7.getKey()).length();
        if (r8 <= r3) goto L8;
        r3 = r8;
    L8:
        if (r8 >= r4) goto L10;
        r4 = r8;
    L10:
        String r9 = (String) r7.getValue();
        int r10 = r9.length();
        if (r10 <= 0) goto L4;
        if (r1.containsKey(r9) == true) goto L15;
        r1.put(r9, r7.getKey());
    L15:
        if (r10 <= r6) goto L17;
        r6 = r10;
    L17:
        if (r10 >= r5) goto L4;
        r5 = r10;
        goto L4
    L19:
        b = 1;
        Class.forName("org.osgi.framework.BundleEvent");     // Catch: Exception -> L22
        return;
    L23:
        if (b != 1) goto L40;
        ee5.f();     // Catch: NoClassDefFoundError -> L26
        int r11 = 2;
    L27:
        b = r11;
        return;
    L26:
        r11 = 3;
        goto L27
    }
}
