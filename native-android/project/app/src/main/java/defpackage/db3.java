package defpackage;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class db3 implements f42 {
    public final yx b;

    public db3() {
        this.b = new yx(0);
    }

    @Override // defpackage.f42
    public final void b(MessageDigest r7) {
        int r0 = 0;
    L3:
        yx r1 = this.b;
        if (r0 >= r1.p) goto L9;
        ab3 r2 = (ab3) r1.f(r0);
        Object r3 = this.b.j(r0);
        za3 r4 = r2.b;
        if (r2.d != null) goto L8;
        r2.d = r2.c.getBytes(f42.a);
    L8:
        r4.e(r2.d, r3, r7);
        r0 = r0 + 1;
        goto L3
    }

    public final Object c(ab3 r2) {
        yx r1 = this.b;
        if (r1.containsKey(r2) == false) goto L7;
        return r1.get(r2);
    L7:
        return r2.a;
    }

    @Override // defpackage.f42
    public final boolean equals(Object r2) {
        if ((r2 instanceof db3) == true) goto L5;
        return false;
    L5:
        return this.b.equals(((db3) r2).b);
    }

    @Override // defpackage.f42
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
