package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class z72 extends cx2 implements u62 {
    public static final x72 E = null;
    public dc3 B;
    public hg3 C;
    public hb3 D;

    static {
        E = new x72();
    }

    public final boolean q0(v72 r5, int r6) {
        if (r6 == 5) goto L8;
        if (r6 == 6) goto L8;
        if (r6 == 3) goto L16;
        if (r6 == 4) goto L16;
        if (r6 == 1) goto L23;
        if (r6 == 2) goto L23;
        kf2.o("Lazy list does not support beyond bounds layout for the specified direction");
        return false;
    L23:
        if (r0(r6) == false) goto L28;
        if (r5.b < (this.B.a.n() - 1)) goto L29;
    L30:
        return false;
    L29:
        return true;
    L28:
        if (r5.a <= 0) goto L30;
    L16:
        if (this.D != hb3.n) goto L23;
    L8:
        if (this.D != hb3.o) goto L23;
        goto L30
    }

    @Override // defpackage.u62
    public final vi2 r(cf2 r2, pi2 r3, long r4) {
        jg3 r1 = r3.r(r4);
        int r5 = r1.n;
        int r6 = r1.o;
        la r7 = new la(r1, 2);
        return r2.v(r5, r6, v01.n, r7);
    }

    public final boolean r0(int r4) {
        if (r4 != 1) goto L6;
        return false;
    L6:
        if (r4 != 2) goto L9;
        return true;
    L9:
        if (r4 != 5) goto L12;
        return false;
    L12:
        if (r4 != 6) goto L15;
        return true;
    L15:
        if (r4 != 3) goto L25;
        int r3 = j51.O(this).K.ordinal();
        if (r3 == 0) goto L23;
        if (r3 != 1) goto L20;
        return true;
    L20:
        er1.n();
        return false;
    L23:
        return false;
    L25:
        if (r4 != 4) goto L32;
        int r5 = j51.O(this).K.ordinal();
        if (r5 == 0) goto L31;
        if (r5 != 1) goto L30;
        return false;
    L30:
        er1.n();
        return false;
    L31:
        return true;
    L32:
        kf2.o("Lazy list does not support beyond bounds layout for the specified direction");
        return false;
    }
}
