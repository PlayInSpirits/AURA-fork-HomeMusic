package defpackage;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dc {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = o83.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(o83.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(iq1.class.getName(), "okhttp.Http2");
        linkedHashMap.put(gr4.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = lg2.a0(linkedHashMap);
    }

    public static void a(String str, int i, String str2, Throwable th) {
        int iMin;
        String strJ0 = (String) b.get(str);
        if (strJ0 == null) {
            strJ0 = qm4.J0(23, str);
        }
        if (Log.isLoggable(strJ0, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int iR0 = qm4.r0(str2, '\n', i2, 4);
                if (iR0 == -1) {
                    iR0 = length;
                }
                while (true) {
                    iMin = Math.min(iR0, i2 + 4000);
                    Log.println(i, strJ0, str2.substring(i2, iMin));
                    if (iMin >= iR0) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
