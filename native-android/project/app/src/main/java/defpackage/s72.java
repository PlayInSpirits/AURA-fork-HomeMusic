package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s72 {
    public static final Map a = null;

    static {
        String r0 = System.getProperty("http.agent");
        if (TextUtils.isEmpty(r0) == true) goto L17;
        int r1 = r0.length();
        StringBuilder r2 = new StringBuilder(r0.length());
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L16;
        char r4 = r0.charAt(r3);
        if (r4 > 31) goto L12;
        if (r4 == '\t') goto L12;
    L14:
        r2.append('?');
    L15:
        r3 = r3 + 1;
    L12:
        if (r4 >= 127) goto L14;
        r2.append(r4);
        goto L15
    L16:
        r0 = r2.toString();
    L17:
        HashMap r5 = new HashMap(2);
        if (TextUtils.isEmpty(r0) == true) goto L20;
        r5.put("User-Agent", Collections.singletonList(new t72(r0)));
    L20:
        a = Collections.unmodifiableMap(r5);
    }
}
