package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qr4 extends h12 {
    public final /* synthetic */ Context e;
    public final /* synthetic */ TextPaint f;
    public final /* synthetic */ h12 g;
    public final /* synthetic */ rr4 h;

    public qr4(rr4 rr4Var, Context context, TextPaint textPaint, h12 h12Var) {
        this.h = rr4Var;
        this.e = context;
        this.f = textPaint;
        this.g = h12Var;
    }

    @Override // defpackage.h12
    public final void H(int i) {
        this.g.H(i);
    }

    @Override // defpackage.h12
    public final void I(Typeface typeface, boolean z) {
        this.h.g(this.e, this.f, typeface);
        this.g.I(typeface, z);
    }
}
