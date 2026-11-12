package defpackage;

import android.window.OnBackInvokedDispatcher;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a93 {
    public final Runnable a;
    public final rp4 b;

    public a93(Runnable r2) {
        this.a = r2;
        this.b = new rp4(new wc(16, this));
    }

    public final void a(ba2 r5, v83 r6) {
        r5.getClass();
        r6.getClass();
        final ea2 r0 = r5.h();
        if (r0.h != r92.n) goto L5;
        return;
    L5:
        u83 r7 = new u83(r6, new w83(r5, r6));
        r6.a.add(r7);
        r7.b(false);
        bq4 r1 = b().c;
        r1.getClass();
        if (((LinkedHashSet) r1.p).add(r7) == false) goto L12;
        w33 r2 = (w33) r1.o;
        r2.getClass();
        if (r7.c != null) goto L10;
        r2.e.addFirst(r7);
        r7.c = r1;
        r2.b();
        goto L12
    L10:
        nz2.k(r7, "' is already registered with a dispatcher", "Handler '");
        return;
    L12:
        final tl0 r3 = new tl0(r7, this, r0);
        r0.a(r3);
        AutoCloseable r4 = new x83(r0, r3);
        r6.c.add(r4);
    }

    public final y83 b() {
        return (y83) this.b.getValue();
    }

    public final void c(OnBackInvokedDispatcher r5) {
        b().c.f(new s83(r5, 0), 1);
        b().c.f(new s83(r5, 1000000), 0);
    }
}
