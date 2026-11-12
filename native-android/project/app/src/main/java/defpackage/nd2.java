package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class nd2 extends x65 {
    public static final un0 d = null;
    public final mj4 b;
    public boolean c;

    static {
        d = new un0(2);
    }

    public nd2() {
        this.b = new mj4(0);
        this.c = false;
    }

    @Override // defpackage.x65
    public final void b() {
        mj4 r9 = this.b;
        int r0 = r9.e();
        int r2 = 0;
    L4:
        if (r2 >= r0) goto L19;
        ld2 r4 = (ld2) r9.f(r2);
        og5 r5 = r4.l;
        r5.a();
        r5.c = true;
        md2 r7 = r4.n;
        if (r7 == null) goto L8;
        r4.j(r7);
    L8:
        ld2 r8 = r5.a;
        if (r8 == null) goto L17;
        if (r8 != r4) goto L15;
        r5.a = null;
        if (r7 == null) goto L14;
        boolean r3 = r7.b;
    L14:
        r5.d = true;
        r5.b = false;
        r5.c = false;
        r5.e = false;
        r2 = r2 + 1;
        goto L4
    L15:
        kf2.n("Attempting to unregister the wrong listener");
        return;
    L17:
        kf2.o("No listener register");
        return;
    L19:
        int r1 = r9.q;
        Object[] r6 = r9.p;
        int r10 = 0;
    L20:
        if (r10 >= r1) goto L22;
        r6[r10] = null;
        r10 = r10 + 1;
        goto L20
    L22:
        r9.q = 0;
        r9.n = false;
    }
}
