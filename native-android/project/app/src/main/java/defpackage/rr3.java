package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rr3 {
    public final qr3 a;
    public final boolean b;
    public final rv2 c;
    public final if1 d;
    public final boolean e;
    public final Object f;
    public boolean g;

    public rr3(qr3 r1, Object r2, boolean r3, rv2 r4, if1 r5, boolean r6) {
        this.a = r1;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r6;
        this.f = r2;
        this.g = true;
    }

    public final Object a() {
        if (this.b == false) goto L6;
        return null;
    L6:
        Object r1 = this.f;
        if (r1 == null) goto L9;
        return r1;
    L9:
        l80.b("Unexpected form of a provided value");
        er1.a();
        return null;
    }
}
