package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l00 implements rn4 {
    public final ArrayDeque a;
    public final ArrayDeque b;
    public final ArrayDeque c;
    public j00 d;
    public long e;
    public long f;
    public long g;

    public l00() {
        this.a = new ArrayDeque();
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r1 >= 10) goto L6;
        this.a.add(new j00());
        r1 = r1 + 1;
        goto L4
    L6:
        this.b = new ArrayDeque();
    L8:
        if (r0 >= 2) goto L10;
        ArrayDeque r2 = this.b;
        cn r3 = new cn(1, this);
        k00 r4 = new k00();
        r4.u = r3;
        r2.add(r4);
        r0 = r0 + 1;
        goto L8
    L10:
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.zi0
    public void a() {
    }

    @Override // defpackage.zi0
    public final void b(long r1) {
        this.g = r1;
    }

    @Override // defpackage.rn4
    public final void c(long r1) {
        this.e = r1;
    }

    @Override // defpackage.zi0
    public /* bridge */ /* synthetic */ Object d() {
        return i();
    }

    @Override // defpackage.zi0
    public final Object e() {
        if (this.d != null) goto L5;
        boolean r0 = true;
    L6:
        rr2.w(r0);
        ArrayDeque r1 = this.a;
        if (r1.isEmpty() == false) goto L10;
        return null;
    L10:
        j00 r2 = (j00) r1.pollFirst();
        this.d = r2;
        return r2;
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.zi0
    public final void f(vn4 r7) {
        if (r7 != this.d) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
        j00 r8 = (j00) r7;
        if (r8.d(4) == true) goto L15;
        long r1 = r8.t;
        if (r1 == Long.MIN_VALUE) goto L15;
        long r2 = this.g;
        if (r2 == (-9223372036854775807L)) goto L15;
        if (r1 >= r2) goto L15;
        r8.r();
        this.a.add(r8);
    L16:
        this.d = null;
        return;
    L15:
        long r3 = this.f;
        this.f = 1 + r3;
        r8.y = r3;
        this.c.add(r8);
        goto L16
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.zi0
    public void flush() {
        this.f = 0;
        this.e = 0;
    L3:
        ArrayDeque r0 = this.c;
        boolean r1 = r0.isEmpty();
        ArrayDeque r2 = this.a;
        if (r1 == true) goto L6;
        j00 r3 = (j00) r0.poll();
        String r4 = f35.a;
        r3.r();
        r2.add(r3);
        goto L3
    L6:
        j00 r5 = this.d;
        if (r5 == null) goto L11;
        r5.r();
        r2.add(r5);
        this.d = null;
        return;
    }

    public abstract zh0 g();

    public abstract void h(j00 r1);

    public wn4 i() {
        ArrayDeque r0 = this.b;
        if (r0.isEmpty() == true) goto L18;
    L5:
        ArrayDeque r1 = this.c;
        if (r1.isEmpty() == true) goto L24;
        j00 r2 = (j00) r1.peek();
        String r3 = f35.a;
        if (r2.t > this.e) goto L25;
        j00 r4 = (j00) r1.poll();
        boolean r5 = r4.d(4);
        ArrayDeque r6 = this.a;
        if (r5 == true) goto L11;
        h(r4);
        if (j() == true) goto L15;
        r4.r();
        r6.add(r4);
        goto L5
    L15:
        zh0 r7 = g();
        wn4 r8 = (wn4) r0.pollFirst();
        long r9 = r4.t;
        r8.p = r9;
        r8.s = r7;
        r8.t = r9;
        r4.r();
        r6.add(r4);
        return r8;
    L11:
        wn4 r10 = (wn4) r0.pollFirst();
        r10.a(4);
        r4.r();
        r6.add(r4);
        return r10;
    L25:
        return null;
    L24:
        return null;
    L18:
        return null;
    }

    public abstract boolean j();
}
