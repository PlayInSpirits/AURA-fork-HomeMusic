package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fl1 extends pe0 implements ao0 {
    public final Handler p;
    public final String q;
    public final boolean r;
    public final fl1 s;

    public fl1(Handler r2, String r3, boolean r4) {
        this.p = r2;
        this.q = r3;
        this.r = r4;
        if (r4 == false) goto L5;
        fl1 r5 = this;
    L6:
        this.s = r5;
        return;
    L5:
        r5 = new fl1(r2, r3, true);
        goto L6
    }

    @Override // defpackage.ao0
    public final as0 F(long r4, final gu4 r6, ne0 r7) {
        if (r4 <= 4611686018427387903L) goto L6;
        r4 = 4611686018427387903L;
    L6:
        if (this.p.postDelayed(r6, r4) == true) goto L8;
        a0(r7, r6);
        return k63.n;
    L8:
        return new el1(this, r6);
    }

    @Override // defpackage.ao0
    public final void H(long r5, cz r7) {
        lg1 r0 = new lg1(15, r7, this);
        if (r5 <= 4611686018427387903L) goto L6;
        r5 = 4611686018427387903L;
    L6:
        if (this.p.postDelayed(r0, r5) == false) goto L9;
        r7.w(new o(9, this, r0));
        return;
    L9:
        a0(r7.r, r0);
    }

    @Override // defpackage.pe0
    public final void W(ne0 r2, Runnable r3) {
        if (this.p.post(r3) == true) goto L6;
        a0(r2, r3);
        return;
    }

    @Override // defpackage.pe0
    public final boolean Y(ne0 r1) {
        if (this.r == true) goto L5;
        return true;
    L5:
        if (h12.c(Looper.myLooper(), this.p.getLooper()) == false) goto L11;
        return false;
    L11:
        return true;
    }

    public final void a0(ne0 r4, Runnable r5) {
        CancellationException r0 = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        s22 r3 = (s22) r4.K(fz0.h0);
        if (r3 == null) goto L5;
        r3.f(r0);
    L5:
        rm0 r6 = rr0.a;
        il0.p.W(r4, r5);
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof fl1) == false) goto L10;
        fl1 r4 = (fl1) r3;
        if (r4.p == this.p) goto L7;
        return false;
    L7:
        if (r4.r != this.r) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public final int hashCode() {
        int r0 = System.identityHashCode(this.p);
        if (this.r == false) goto L5;
        int r1 = 1231;
    L7:
        return r1 ^ r0;
    L5:
        r1 = 1237;
        goto L7
    }

    @Override // defpackage.pe0
    public final String toString() {
        rm0 r0 = rr0.a;
        fl1 r1 = uf2.a;
        if (this != r1) goto L20;
        String r2 = "Dispatchers.Main";
    L12:
        if (r2 != null) goto L22;
        String r3 = this.q;
        if (r3 != null) goto L17;
        r3 = this.p.toString();
    L17:
        if (this.r == true) goto L19;
        return r3;
    L19:
        return r3 + ".immediate";
    L22:
        return r2;
    L20:
        fl1 r4 = r1.s;     // Catch: UnsupportedOperationException -> L8
    L9:
        if (this != r4) goto L11;
        r2 = "Dispatchers.Main.immediate";
        goto L12
    L11:
        r2 = null;
    L8:
        r4 = null;
        goto L9
    }

    public fl1(Handler r3) {
        this(r3, null, false);
    }
}
