package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nm0 {
    public static final di0 h = null;
    public static final Random i = null;
    public final bu4 a;
    public final zt4 b;
    public final HashMap c;
    public ho2 d;
    public cu4 e;
    public String f;
    public long g;

    static {
        h = new di0(2);
        i = new Random();
    }

    public nm0() {
        this.a = new bu4();
        this.b = new zt4();
        this.c = new HashMap();
        this.e = cu4.a;
        this.g = -1;
    }

    public final void a(mm0 r5) {
        long r0 = r5.c;
        if (r0 != (-1)) goto L5;
    L7:
        this.f = null;
        return;
    L5:
        if (r5.e == false) goto L7;
        this.g = r0;
        goto L7
    }

    public final mm0 b(int r19, mt2 r20) {
        HashMap r3 = this.c;
        Iterator r4 = r3.values().iterator();
        mm0 r5 = null;
        long r6 = Long.MAX_VALUE;
    L4:
        if (r4.hasNext() == false) goto L50;
        mm0 r8 = (mm0) r4.next();
        long r9 = r8.c;
        mt2 r11 = r8.d;
        if (r9 == (-1)) goto L8;
    L19:
        long r16 = -1;
    L20:
        if (r20 == null) goto L38;
        long r10 = r20.d;
        if (r10 == r16) goto L38;
        if (r11 == null) goto L26;
        if (r10 != r11.d) goto L4;
        if (r20.b != r11.b) goto L4;
        if (r20.c != r11.c) goto L4;
    L39:
        long r12 = r8.c;
        if (r12 == r16) goto L49;
        if (r12 < r6) goto L49;
        if (r12 != r6) goto L4;
        String r13 = f35.a;
        if (r5.d == null) goto L4;
        if (r11 == null) goto L4;
        r5 = r8;
    L49:
        r5 = r8;
        r6 = r12;
        goto L4
    L26:
        if (r20.b() == true) goto L4;
        if (r10 != r8.c) goto L4;
    L38:
        if (r19 != r8.b) goto L4;
    L8:
        if (r19 != r8.b) goto L19;
        if (r20 == null) goto L19;
        long r14 = r20.d;
        nm0 r15 = r8.g;
        r16 = -1;
        mm0 r17 = (mm0) r15.c.get(r15.f);
        if (r17 == null) goto L15;
        long r18 = r17.c;
        if (r18 == (-1)) goto L15;
    L17:
        if (r14 < r18) goto L20;
        r8.c = r14;
    L15:
        r18 = r15.g + 1;
        goto L17
    L50:
        if (r5 != null) goto L83;
        String r7 = (String) h.get();
        mm0 r21 = new mm0(this, r7, r19, r20);
        r3.put(r7, r21);
        return r21;
    L83:
        return r5;
    }

    public final synchronized String c(cu4 r3, mt2 r4) {
        monitor-enter(this);
        String r5 = b(r3.g(r4.a, this.b).c, r4).a;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r5;
    L6:
        th = move-exception;
        throw th;
    }

    public final void d(q9 r8) {
        cu4 r0 = r8.b;
        int r1 = r8.c;
        mt2 r2 = r8.d;
        boolean r3 = r0.p();
        String r4 = this.f;
        HashMap r5 = this.c;
        if (r3 == false) goto L7;
        if (r4 == null) goto L22;
        mm0 r9 = (mm0) r5.get(r4);
        r9.getClass();
        a(r9);
        return;
    L22:
        return;
    L7:
        mm0 r6 = (mm0) r5.get(r4);
        this.f = b(r1, r2).a;
        e(r8);
        if (r2 == null) goto L23;
        long r7 = r2.d;
        if (r2.b() == false) goto L24;
        if (r6 != null) goto L13;
    L20:
        b(r1, new mt2(r7, r2.a));
        this.d.getClass();
        return;
    L13:
        if (r6.c != r7) goto L20;
        mt2 r10 = r6.d;
        if (r10 == null) goto L20;
        if (r10.b != r2.b) goto L20;
        if (r10.c != r2.c) goto L20;
        return;
    L24:
        return;
    }

    public final synchronized void e(q9 r9) {
        monitor-enter(this);
        this.d.getClass();     // Catch: Throwable -> L30
        if (r9.b.p() == false) goto L7;
        monitor-exit(this);
        return;
    L7:
        mt2 r0 = r9.d;     // Catch: Throwable -> L30
        if (r0 == null) goto L32;
        long r1 = r0.d;     // Catch: Throwable -> L30
        if (r1 == (-1)) goto L22;
        mm0 r4 = (mm0) this.c.get(this.f);     // Catch: Throwable -> L30
        if (r4 == null) goto L17;
        long r5 = r4.c;     // Catch: Throwable -> L30
        if (r5 == (-1)) goto L17;
    L19:
        if (r1 >= r5) goto L22;
        monitor-exit(this);
        return;
    L17:
        r5 = this.g + 1;
    L22:
        mm0 r2 = (mm0) this.c.get(this.f);     // Catch: Throwable -> L30
        if (r2 == null) goto L32;
        if (r2.c != (-1)) goto L32;
        if (r2.b == r9.c) goto L32;
        monitor-exit(this);
        return;
    L32:
        mm0 r3 = b(r9.c, r9.d);     // Catch: Throwable -> L30
        if (this.f != null) goto L35;
        this.f = r3.a;     // Catch: Throwable -> L30
    L35:
        mt2 r6 = r9.d;     // Catch: Throwable -> L30
        if (r6 == null) goto L43;
        if (r6.b() == false) goto L43;
        mt2 r7 = r9.d;     // Catch: Throwable -> L30
        mt2 r8 = new mt2(r7.a, r7.d, r7.b);     // Catch: Throwable -> L30
        mm0 r10 = b(r9.c, r8);     // Catch: Throwable -> L30
        if (r10.e == true) goto L43;
        r10.e = true;     // Catch: Throwable -> L30
        r9.b.g(r9.d.a, this.b);     // Catch: Throwable -> L30
        Math.max(0, f35.i0(this.b.d(r9.d.b)) + f35.i0(this.b.e));     // Catch: Throwable -> L30
        this.d.getClass();     // Catch: Throwable -> L30
    L43:
        if (r3.e == true) goto L46;
        r3.e = true;     // Catch: Throwable -> L30
        this.d.getClass();     // Catch: Throwable -> L30
    L46:
        if (r3.a.equals(this.f) == true) goto L48;
    L55:
        monitor-exit(this);
        return;
    L48:
        if (r3.f == true) goto L55;
        r3.f = true;     // Catch: Throwable -> L30
        ho2 r11 = this.d;     // Catch: Throwable -> L30
        String r12 = r3.a;     // Catch: Throwable -> L30
        r11.getClass();     // Catch: Throwable -> L30
        mt2 r13 = r9.d;     // Catch: Throwable -> L30
        if (r13 != null) goto L52;
    L54:
        r11.b();     // Catch: Throwable -> L30
        r11.j = r12;     // Catch: Throwable -> L30
        r11.k = fo2.v(fo2.g(hd0.j()));     // Catch: Throwable -> L30
        r11.c(r9.b, r9.d);     // Catch: Throwable -> L30
        goto L55
    L52:
        if (r13.b() == false) goto L54;
    L30:
        th = move-exception;
        throw th;
    }
}
