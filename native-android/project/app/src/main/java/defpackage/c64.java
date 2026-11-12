package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c64 {
    public static final String a = null;

    static {
        a = cx.i("Schedulers");
    }

    public static void a(fd5 r4, xi4 r5, ArrayList r6) {
        if (r6.size() <= 0) goto L7;
        r5.getClass();
        long r0 = System.currentTimeMillis();
        int r7 = r6.size();
        int r2 = 0;
    L5:
        if (r2 >= r7) goto L9;
        Object r3 = r6.get(r2);
        r2 = r2 + 1;
        r4.j(((dd5) r3).a, r0);
        goto L5
    L9:
        return;
    }

    public static void b(r90 r3, WorkDatabase r4, List r5) {
        if (r5 != null) goto L4;
        return;
    L4:
        if (r5.size() == 0) goto L41;
        fd5 r0 = r4.A();
        r4.c();
        ArrayList r1 = r0.d();     // Catch: Throwable -> L24
        a(r0, r3.d, r1);     // Catch: Throwable -> L24
        ArrayList r2 = r0.c(r3.k);     // Catch: Throwable -> L24
        a(r0, r3.d, r2);     // Catch: Throwable -> L24
        r2.addAll(r1);     // Catch: Throwable -> L24
        ArrayList r6 = r0.b();     // Catch: Throwable -> L24
        r4.t();     // Catch: Throwable -> L24
        r4.o();
        if (r2.size() <= 0) goto L17;
        dd5[] r7 = (dd5[]) r2.toArray(new dd5[r2.size()]);
        Iterator r8 = r5.iterator();
    L12:
        if (r8.hasNext() == false) goto L17;
        a64 r9 = (a64) r8.next();
        if (r9.c() == false) goto L12;
        r9.e(r7);
    L17:
        if (r6.size() <= 0) goto L40;
        dd5[] r10 = (dd5[]) r6.toArray(new dd5[r6.size()]);
        Iterator r11 = r5.iterator();
    L20:
        if (r11.hasNext() == false) goto L42;
        a64 r12 = (a64) r11.next();
        if (r12.c() == true) goto L20;
        r12.e(r10);
        goto L20
    L42:
        return;
    L40:
        return;
    L24:
        th = move-exception;
        r4.o();
        throw th;
    }
}
