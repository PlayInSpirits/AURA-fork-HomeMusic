package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b00 {
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
        kd3 kd3VarB = b();
        if (kd3VarB != null) {
            return (String) kd3VarB.n;
        }
        return null;
    }

    public static kd3 b() {
        String strK = ud3.K();
        if (strK != null) {
            if (qm4.u0(strK)) {
                strK = null;
            }
            if (strK != null) {
                String strQ = e35.Q();
                if (qm4.u0(strQ)) {
                    strQ = null;
                }
                if (strQ != null) {
                    return new kd3(b11.o(strQ, "\n", strK), strK);
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
        ArrayList arrayListA = ((wz) c.getValue()).a(str);
        int size = arrayListA.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListA.get(i2);
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
        kd3 kd3VarB = b();
        if (kd3VarB == null) {
            return;
        }
        c((String) kd3VarB.n);
        d(0L);
    }
}
