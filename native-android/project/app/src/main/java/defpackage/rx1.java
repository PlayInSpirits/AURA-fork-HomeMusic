package defpackage;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rx1 {
    public Object a;
    public Object b;
    public final Serializable c;

    public rx1(Class r36) {
        UUID r1 = UUID.randomUUID();
        r1.getClass();
        this.a = r1;
        String r3 = ((UUID) this.a).toString();
        r3.getClass();
        this.b = new dd5(r3, 0, r36.getName(), null, null, null, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, false, 0, 0, 0, 0, 0, null, 16777210);
        String[] r2 = {r36.getName()};
        LinkedHashSet r4 = new LinkedHashSet(lg2.W(1));
        r4.add(r2[0]);
        this.c = r4;
    }

    public df1 a() {
        s24 r0 = (s24) this.a;
        r0.a();
        if (((AtomicBoolean) this.b).compareAndSet(false, true) == true) goto L5;
        String r4 = e();
        r0.getClass();
        r0.a();
        r0.b();
        return r0.j().z().j(r4);
    L5:
        return (df1) ((rp4) this.c).getValue();
    }

    public bd5 b() {
        bd5 r1 = c();
        mc0 r2 = ((dd5) this.b).j;
        if (r2.i.isEmpty() == true) goto L5;
    L12:
        boolean r3 = true;
    L13:
        dd5 r4 = (dd5) this.b;
        if (r4.q == false) goto L25;
        if (r3 == false) goto L18;
        kf2.n("Expedited jobs only support network and storage constraints");
        return null;
    L18:
        if (r4.g <= 0) goto L25;
        kf2.n("Expedited jobs cannot be delayed");
        return null;
    L25:
        if (r4.x != null) goto L35;
        List r5 = qm4.C0(r4.c, new String[]{"."}, 6);
        if (r5.size() != 1) goto L29;
        String r6 = (String) r5.get(0);
    L31:
        if (r6.length() <= 127) goto L34;
        r6 = qm4.J0(127, r6);
    L34:
        r4.x = r6;
        goto L35
    L29:
        r6 = (String) q40.C0(r5);
    L35:
        UUID r7 = UUID.randomUUID();
        r7.getClass();
        this.a = r7;
        String r8 = r7.toString();
        r8.getClass();
        dd5 r9 = (dd5) this.b;
        r9.getClass();
        this.b = new dd5(r8, r9.b, r9.c, r9.d, new oh0(r9.e), new oh0(r9.f), r9.g, r9.h, r9.i, new mc0(r9.j), r9.k, r9.l, r9.m, r9.n, r9.o, r9.p, r9.q, r9.r, r9.s, r9.u, r9.v, r9.w, r9.x, 524288);
        return r1;
    L5:
        if (r2.e == true) goto L12;
        if (r2.c == true) goto L12;
        if (r2.d == true) goto L12;
        r3 = false;
        goto L13
    }

    public abstract bd5 c();

    public abstract void d();

    public abstract String e();

    public abstract void f();

    public abstract void g(hq r1);

    public void h(df1 r2) {
        r2.getClass();
        if (r2 != ((df1) ((rp4) this.c).getValue())) goto L6;
        ((AtomicBoolean) this.b).set(false);
        return;
    }

    public abstract void i();

    public abstract void j();

    public abstract void k();

    /* JADX WARN: Type inference failed for: r2v1, types: [int[], java.io.Serializable] */
    public rx1(int r2) {
        this.b = new float[r2 * 2];
        this.c = new int[r2];
    }

    public rx1(s24 r2) {
        r2.getClass();
        this.a = r2;
        this.b = new AtomicBoolean(false);
        this.c = new rp4(new wc(25, this));
    }
}
