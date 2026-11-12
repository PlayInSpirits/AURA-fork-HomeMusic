package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class i63 {
    public final f13 a;
    public final q03 b;

    public i63() {
        this.a = new f13(new a63[16]);
        this.b = new q03(10);
    }

    public boolean a(xe2 r6, q62 r7, gp3 r8, boolean r9) {
        f13 r5 = this.a;
        Object[] r0 = r5.n;
        int r10 = r5.p;
        int r2 = 0;
        boolean r3 = false;
    L3:
        if (r2 >= r10) goto L11;
        if (((a63) r0[r2]).a(r6, r7, r8, r9) == true) goto L9;
        if (r3 == true) goto L9;
        r3 = false;
    L10:
        r2 = r2 + 1;
    L9:
        r3 = true;
        goto L10
    L11:
        return r3;
    }

    public void b(gp3 r2) {
        f13 r1 = this.a;
        int r3 = r1.p;
    L3:
        r3 = r3 - 1;
        if ((-1) >= r3) goto L9;
        if (((a63) r1.n[r3]).d.b != 0) goto L3;
        r1.k(r3);
        goto L3
    }
}
