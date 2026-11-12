package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ix1 extends pw1 {
    @Override // defpackage.qw1
    public final /* bridge */ /* synthetic */ qw1 a(Object r1) {
        f(r1);
        return this;
    }

    public final void f(Object r1) {
        r1.getClass();
        c(r1);
    }

    public final jx1 g() {
        int r0 = this.b;
        if (r0 == 0) goto L10;
        Object[] r1 = this.a;
        if (r0 == 1) goto L8;
        jx1 r2 = jx1.j(r0, r1);
        this.b = r2.size();
        this.c = true;
        return r2;
    L8:
        Object r3 = r1[0];
        Objects.requireNonNull(r3);
        int r4 = jx1.p;
        return new nf4(r3);
    L10:
        int r5 = jx1.p;
        return ny3.w;
    }
}
