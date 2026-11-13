package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class b00 {
    public b00() {
        super();
    }

    public static String g;
    public static boolean i;
    public static final b00 a = new b00();
    public static final rp4 b = new rp4(new t5(8));
    public static final rp4 c = new rp4(new t5(9));
    public static final ScheduledExecutorService d = Executors.newSingleThreadScheduledExecutor();
    public static final rp4 e = new rp4(new t5(10));
    public static final LinkedHashMap f = new LinkedHashMap();
    public static long h = -1;

    public static String a() {
        kd3 b2 = b();
        if (b2 != null) {
            return (String) b2.n;
        }
        return null;
    }

    public static kd3 b() {
        String K = ud3.K();
        if (K != null) {
            if (qm4.u0(K)) {
                K = null;
            }
            if (K != null) {
                String Q = e35.Q();
                if (qm4.u0(Q)) {
                    Q = null;
                }
                if (Q != null) {
                    return new kd3(b11.o(Q, "\n", K), K);
                }
            }
        }
        return null;
    }

    public final synchronized void c(String str) {
        if (h12.c(g, str) && h == n61.d()) {
            return;
        }
        f.clear();
        ArrayList a2 = ((wz) c.getValue()).a(str);
        int size = a2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = a2.get(i2);
            i2++;
            vz vzVar = (vz) obj;
            f.put(vzVar.f, new a00("hub:" + vzVar.c, vzVar.e, vzVar.d, vzVar.f, vzVar.g, true));
        }
        g = str;
        h = n61.d();
    }

    public final synchronized void d(long j) {
        if (i) {
            return;
        }
        i = true;
        d.schedule(new u6(2), j, TimeUnit.MILLISECONDS);
    }

    public final synchronized void e() {
        kd3 b2 = b();
        if (b2 == null) {
            return;
        }
        c((String) b2.n);
        d(0L);
    }
}
