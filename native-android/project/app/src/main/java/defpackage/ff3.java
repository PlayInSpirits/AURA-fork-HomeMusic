package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ff3 implements vy3 {
    public final Set n;
    public final f13 o = new f13(new wg1[16]);

    public ff3(Set set) {
        this.n = set;
    }

    @Override // defpackage.vy3
    public final void a() {
    }

    @Override // defpackage.vy3
    public final void c() {
    }

    @Override // defpackage.vy3
    public final void d() {
        f13 f13Var = this.o;
        Object[] objArr = f13Var.n;
        int i = f13Var.p;
        for (int i2 = 0; i2 < i; i2++) {
            vy3 vy3Var = ((wg1) objArr[i2]).a;
            this.n.remove(vy3Var);
            vy3Var.d();
        }
    }
}
