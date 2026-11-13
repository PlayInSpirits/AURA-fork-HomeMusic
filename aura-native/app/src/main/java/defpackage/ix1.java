package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ix1 extends pw1 {
    public ix1(int a0) {
        super(a0);
    }

    @Override // defpackage.qw1
    public final /* bridge */ /* synthetic */ qw1 a(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        c(obj);
    }

    public final jx1 g() {
        int i = this.b;
        if (i == 0) {
            int i2 = jx1.p;
            return ny3.w;
        }
        Object[] objArr = this.a;
        if (i != 1) {
            jx1 j = jx1.j(i, objArr);
            this.b = j.size();
            this.c = true;
            return j;
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        int i3 = jx1.p;
        return new nf4(obj);
    }
}
