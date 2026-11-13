package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class rr3 {
    public final qr3 a;
    public final boolean b;
    public final rv2 c;
    public final if1 d;
    public final boolean e;
    public final Object f;
    public boolean g = true;

    public rr3(qr3 qr3Var, Object obj, boolean z, rv2 rv2Var, if1 if1Var, boolean z2) {
        this.a = qr3Var;
        this.b = z;
        this.c = rv2Var;
        this.d = if1Var;
        this.e = z2;
        this.f = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        l80.b("Unexpected form of a provided value");
        er1.a();
        return null;
    }
}
