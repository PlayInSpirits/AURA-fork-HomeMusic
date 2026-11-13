package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class fi0 implements xs {
    public static final go4 r = au0.L(new di0(0));
    public final mx2 n;
    public final rf2 o;
    public final int p;
    public final boolean q;

    public fi0(x7 x7Var) {
        this.o = new rf2((Context) x7Var.p);
        mx2 mx2Var = (mx2) r.get();
        mx2Var.getClass();
        this.n = mx2Var;
        this.p = x7Var.o;
        this.q = false;
    }

    @Override // defpackage.xs
    public final ic2 g(Uri uri) {
        return this.n.b(new ei0(1, this, uri));
    }

    @Override // defpackage.xs
    public final ic2 j(byte[] bArr) {
        return this.n.b(new ei0(0, this, bArr));
    }
}
