package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pr4 extends au0 {
    public final /* synthetic */ h12 G;
    public final /* synthetic */ rr4 H;

    public pr4(rr4 rr4Var, h12 h12Var) {
        this.H = rr4Var;
        this.G = h12Var;
    }

    @Override // defpackage.au0
    public final void M(int i) {
        this.H.m = true;
        this.G.H(i);
    }

    @Override // defpackage.au0
    public final void N(Typeface typeface) {
        rr4 rr4Var = this.H;
        Typeface typefaceCreate = Typeface.create(typeface, rr4Var.c);
        rr4Var.n = typefaceCreate;
        rr4Var.m = true;
        this.G.I(typefaceCreate, false);
    }
}
