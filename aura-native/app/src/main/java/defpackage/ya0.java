package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class ya0 {
    public static final i03 a;

    static {
        k24 k24Var = s50.e;
        int i = k24Var.c;
        va0 va0Var = new va0(k24Var, k24Var, 1);
        int i2 = k24Var.c;
        q83 q83Var = s50.x;
        int i3 = (q83Var.c << 6) | i2;
        xa0 xa0Var = new xa0(k24Var, q83Var, 0);
        int i4 = (i2 << 6) | q83Var.c;
        xa0 xa0Var2 = new xa0(q83Var, k24Var, 0);
        i03 i03Var = f02.a;
        i03 i03Var2 = new i03();
        i03Var2.i(i | (i << 6), va0Var);
        i03Var2.i(i3, xa0Var);
        i03Var2.i(i4, xa0Var2);
        a = i03Var2;
    }
}
