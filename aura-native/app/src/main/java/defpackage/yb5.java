package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class yb5 {
    public static final i03 a;
    public static final wb5[] b;

    static {
        i03 i03Var = new i03(8);
        wb5.a.getClass();
        xb5 xb5Var = vb5.g;
        i03Var.i(1, xb5Var);
        xb5 xb5Var2 = vb5.f;
        i03Var.i(2, xb5Var2);
        xb5 xb5Var3 = vb5.b;
        i03Var.i(4, xb5Var3);
        xb5 xb5Var4 = vb5.d;
        i03Var.i(8, xb5Var4);
        xb5 xb5Var5 = vb5.h;
        i03Var.i(16, xb5Var5);
        xb5 xb5Var6 = vb5.e;
        i03Var.i(32, xb5Var6);
        xb5 xb5Var7 = vb5.i;
        i03Var.i(64, xb5Var7);
        xb5 xb5Var8 = vb5.c;
        i03Var.i(128, xb5Var8);
        a = i03Var;
        b = new wb5[]{xb5Var, xb5Var2, xb5Var3, xb5Var7, xb5Var5, xb5Var6, xb5Var4, vb5.j, xb5Var8};
    }

    public static final void a(af2 af2Var, jz1 jz1Var, long j, int i, int i2) {
        if (te5.o(j, -1L)) {
            return;
        }
        af2Var.a(jz1Var.b(), (int) ((j >>> 48) & 65535));
        af2Var.a(jz1Var.d(), (int) ((j >>> 32) & 65535));
        af2Var.a(jz1Var.c(), i - ((int) ((j >>> 16) & 65535)));
        af2Var.a(jz1Var.a(), i2 - ((int) (j & 65535)));
    }
}
