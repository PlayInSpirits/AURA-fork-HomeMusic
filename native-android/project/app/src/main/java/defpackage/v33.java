package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v33 {
    public bq4 a;
    public boolean b;

    public final void a() {
        bq4 r0 = this.a;
        if (r0 != null) goto L5;
        kf2.o("This input is not added to any dispatcher.");
        return;
    L5:
        if (this.b == true) goto L7;
        r0.g(this, null);
    L7:
        w33 r1 = (w33) r0.o;
        ss2 r2 = (ss2) r0.n;
        r1.getClass();
        if (equals(r1.h) == true) goto L10;
    L20:
        this.b = false;
        return;
    L10:
        if ((-1) != r1.g) goto L20;
        u83 r3 = r1.f;
        if (r3 != null) goto L15;
        r3 = r1.c(-1);
    L15:
        r1.f = null;
        r1.g = 0;
        r1.h = null;
        if (r3 != null) goto L18;
        ((a93) r2.o).a.run();
    L19:
        nl4 r4 = r1.a;
        x33 r5 = x33.p;
        r4.getClass();
        r4.j(null, r5);
        goto L20
    L18:
        r3.d.a();
        goto L19
    }

    public void b(boolean r1) {
    }
}
