package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s12 {
    public final s24 a;
    public final jy4 b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final e90 e;
    public final e90 f;
    public final hd5 g;
    public final Object h;

    public s12(s24 r11, HashMap r12, HashMap r13, String... r14) {
        this.a = r11;
        int r1 = 1;
        Class<s12> r3 = s12.class;
        String r4 = "notifyInvalidatedObservers";
        String r5 = "notifyInvalidatedObservers(Ljava/util/Set;)V";
        jy4 r8 = new jy4(r11, r12, r13, r14, r11.j, new q(r1, this, r3, r4, r5, 0, 6));
        this.b = r8;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new e90(this, 22);
        this.f = new e90(this, 23);
        this.g = new hd5(r11);
        this.h = new Object();
        r8.k = new wc(9, this);
    }

    public final t24 a(String[] r3, if1 r4) {
        this.b.g(r3);
        hd5 r2 = this.g;
        r2.getClass();
        return new t24((s24) r2.o, r2, r3, r4);
    }

    public final Object b(ep4 r3) {
        s24 r0 = this.a;
        if (r0.m() == true) goto L5;
    L7:
        Object r2 = this.b.f(r3);
        if (r2 != xe0.n) goto L11;
        return r2;
    L11:
        return j15.a;
    L5:
        if (r0.q() == true) goto L7;
        goto L7
    }
}
