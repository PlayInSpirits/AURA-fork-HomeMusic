package defpackage;

import android.content.Context;
import android.graphics.Color;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nz0 {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public nz0(Context context) {
        boolean zE = zz1.E(context, R.attr.elevationOverlayEnabled, false);
        int iS = g12.s(context, R.attr.elevationOverlayColor, 0);
        int iS2 = g12.s(context, R.attr.elevationOverlayAccentColor, 0);
        int iS3 = g12.s(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = zE;
        this.b = iS;
        this.c = iS2;
        this.d = iS3;
        this.e = f2;
    }

    public final int a(int i, float f2) {
        int i2;
        float f3 = this.e;
        float fMin = (f3 <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / f3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iH = g12.H(v50.i(i, 255), fMin, this.b);
        if (fMin > 0.0f && (i2 = this.c) != 0) {
            iH = v50.g(v50.i(i2, f), iH);
        }
        return v50.i(iH, iAlpha);
    }

    public final int b(int i, float f2) {
        return (this.a && v50.i(i, 255) == this.d) ? a(i, f2) : i;
    }
}
