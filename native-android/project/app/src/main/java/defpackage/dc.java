package defpackage;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dc {
    public static final CopyOnWriteArraySet a = null;
    public static final Map b = null;

    static {
        a = new CopyOnWriteArraySet();
        LinkedHashMap r0 = new LinkedHashMap();
        Package r2 = o83.class.getPackage();
        if (r2 == null) goto L5;
        String r3 = r2.getName();
    L6:
        if (r3 == null) goto L8;
        r0.put(r3, "OkHttp");
    L8:
        r0.put(o83.class.getName(), "okhttp.OkHttpClient");
        r0.put(iq1.class.getName(), "okhttp.Http2");
        r0.put(gr4.class.getName(), "okhttp.TaskRunner");
        r0.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = lg2.a0(r0);
        return;
    L5:
        r3 = null;
        goto L6
    }

    public static void a(String r4, int r5, String r6, Throwable r7) {
        String r0 = (String) b.get(r4);
        if (r0 != null) goto L6;
        r0 = qm4.J0(23, r4);
    L6:
        if (Log.isLoggable(r0, r5) == true) goto L8;
        return;
    L8:
        if (r7 == null) goto L10;
        r6 = r6 + '\n' + Log.getStackTraceString(r7);
    L10:
        int r8 = r6.length();
        int r1 = 0;
    L11:
        if (r1 >= r8) goto L24;
        int r2 = qm4.r0(r6, '\n', r1, 4);
        if (r2 != (-1)) goto L16;
        r2 = r8;
    L16:
        int r3 = Math.min(r2, r1 + 4000);
        Log.println(r5, r0, r6.substring(r1, r3));
        if (r3 >= r2) goto L18;
        r1 = r3;
        goto L16
    L18:
        r1 = r3 + 1;
        goto L11
    }
}
