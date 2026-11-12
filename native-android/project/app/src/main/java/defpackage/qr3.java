package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qr3 {
    public final c92 a;

    public qr3(gf1 r2) {
        this.a = new c92(r2);
    }

    public abstract rr3 a(Object r1);

    public j35 b() {
        return this.a;
    }

    public final rr3 c(if1 r8) {
        return new rr3(this, null, false, null, r8, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j35 d(rr3 r6, j35 r7) {
        if1 r5 = r6.d;
        Object r0 = r6.f;
        boolean r1 = r6.e;
        ny0 r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        if ((r7 instanceof ny0) == false) goto L7;
        if (r1 == false) goto L20;
        r3 = (ny0) r7;
        r3.a.setValue(r6.a());
    L20:
        if (r3 != 0) goto L32;
        if (r1 == false) goto L27;
        rv2 r8 = r6.c;
        if (r8 != null) goto L26;
        r8 = rv2.D;
    L26:
        return new ny0(new zd3(r0, r8));
    L27:
        if (r5 == null) goto L31;
        return new m90(r5);
    L31:
        return new xl4(r6.a());
    L32:
        return r3;
    L7:
        if ((r7 instanceof xl4) == false) goto L16;
        if (r6.b == true) goto L11;
        if (r0 == null) goto L20;
    L11:
        if (r1 == true) goto L20;
        xl4 r9 = (xl4) r7;
        boolean r2 = h12.c(r6.a(), r9.a);
        Object r10 = r9;
        if (r2 == false) goto L20;
    L14:
        r3 = r10;
        goto L20
    L16:
        if ((r7 instanceof m90) == false) goto L20;
        m90 r11 = (m90) r7;
        if1 r4 = r11.a;
        r10 = r11;
        if (r5 != r4) goto L20;
        goto L20
    }
}
