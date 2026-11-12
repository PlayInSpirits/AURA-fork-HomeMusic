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

    public qr4(rr4 r1, Context r2, TextPaint r3, h12 r4) {
        this.h = r1;
        this.e = r2;
        this.f = r3;
        this.g = r4;
    }

    @Override // defpackage.h12
    public final void H(int r1) {
        this.g.H(r1);
    }

    @Override // defpackage.h12
    public final void I(Typeface r4, boolean r5) {
        Context r0 = this.e;
        TextPaint r1 = this.f;
        this.h.g(r0, r1, r4);
        this.g.I(r4, r5);
    }
}
