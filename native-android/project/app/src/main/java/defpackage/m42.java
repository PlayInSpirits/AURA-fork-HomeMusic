package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m42 {
    public static final byte[] a = null;
    public static volatile int b;

    static {
        int r0 = 3;
        a = new byte[]{93, 0, 0};
        HashMap r1 = new HashMap();
        r1.put(".lzma", "");
        r1.put("-lzma", "");
        HashMap r2 = new HashMap();
        Collections.unmodifiableMap(r1);
        Iterator r3 = r1.entrySet().iterator();
        int r4 = Integer.MIN_VALUE;
        int r5 = Integer.MAX_VALUE;
        int r6 = Integer.MAX_VALUE;
        int r7 = Integer.MIN_VALUE;
    L4:
        if (r3.hasNext() == false) goto L19;
        Map.Entry r8 = (Map.Entry) r3.next();
        int r9 = ((String) r8.getKey()).length();
        if (r9 <= r4) goto L8;
        r4 = r9;
    L8:
        if (r9 >= r5) goto L10;
        r5 = r9;
    L10:
        String r10 = (String) r8.getValue();
        int r11 = r10.length();
        if (r11 <= 0) goto L4;
        if (r2.containsKey(r10) == true) goto L15;
        r2.put(r10, r8.getKey());
    L15:
        if (r11 <= r7) goto L17;
        r7 = r11;
    L17:
        if (r11 >= r6) goto L4;
        r6 = r11;
        goto L4
    L19:
        b = 1;
        Class.forName("org.osgi.framework.BundleEvent");     // Catch: Exception -> L22
        return;
    L23:
        if (b != 1) goto L40;
        int r12 = l42.p;     // Catch: NoClassDefFoundError -> L28
        r0 = 2;
    L26:
        b = r0;
        return;
    }
}
