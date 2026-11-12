package defpackage;

import com.google.gson.JsonSyntaxException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class n73 extends bz4 {
    public static final m73 b = null;
    public final int a;

    static {
        b = new m73(new n73(2), 0);
    }

    public n73(int r1) {
        this.a = r1;
    }

    @Override // defpackage.bz4
    public final Object a(l32 r4) {
        int r0 = r4.e0();
        int r1 = xa3.w(r0);
        if (r1 == 5) goto L13;
        if (r1 == 6) goto L13;
        if (r1 != 8) goto L11;
        r4.a0();
        return null;
    L11:
        throw new JsonSyntaxException("Expecting number, got: " + b11.x(r0) + "; at path " + r4.v());
    L13:
        return f34.b(this.a, r4);
    }

    @Override // defpackage.bz4
    public final void b(q32 r1, Object r2) {
        r1.T((Number) r2);
    }
}
