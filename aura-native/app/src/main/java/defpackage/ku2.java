package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ku2 implements a83 {
    public final ad2 a;
    public final ht1 b;
    public int c = -1;

    public ku2(ad2 ad2Var, ht1 ht1Var) {
        this.a = ad2Var;
        this.b = ht1Var;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.b(obj);
        }
    }
}
