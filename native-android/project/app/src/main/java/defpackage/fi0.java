package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fi0 implements xs {
    public static final go4 r = null;
    public final mx2 n;
    public final rf2 o;
    public final int p;
    public final boolean q;

    static {
        r = au0.L(new di0(0));
    }

    public fi0(x7 r3) {
        this.o = new rf2((Context) r3.p);
        mx2 r0 = (mx2) r.get();
        r0.getClass();
        this.n = r0;
        this.p = r3.o;
        this.q = false;
    }

    @Override // defpackage.xs
    public final ic2 g(Uri r3) {
        ei0 r0 = new ei0(1, this, r3);
        return this.n.b(r0);
    }

    @Override // defpackage.xs
    public final ic2 j(byte[] r3) {
        ei0 r0 = new ei0(0, this, r3);
        return this.n.b(r0);
    }
}
