package defpackage;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class db3 implements f42 {
    public final yx b = new yx(0);

    @Override // defpackage.f42
    public final void b(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            yx yxVar = this.b;
            if (i >= yxVar.p) {
                return;
            }
            ab3 ab3Var = (ab3) yxVar.f(i);
            Object objJ = this.b.j(i);
            za3 za3Var = ab3Var.b;
            if (ab3Var.d == null) {
                ab3Var.d = ab3Var.c.getBytes(f42.a);
            }
            za3Var.e(ab3Var.d, objJ, messageDigest);
            i++;
        }
    }

    public final Object c(ab3 ab3Var) {
        yx yxVar = this.b;
        return yxVar.containsKey(ab3Var) ? yxVar.get(ab3Var) : ab3Var.a;
    }

    @Override // defpackage.f42
    public final boolean equals(Object obj) {
        if (obj instanceof db3) {
            return this.b.equals(((db3) obj).b);
        }
        return false;
    }

    @Override // defpackage.f42
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
