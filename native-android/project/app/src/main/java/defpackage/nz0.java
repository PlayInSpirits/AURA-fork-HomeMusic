package defpackage;

import android.content.Context;
import android.graphics.Color;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nz0 {
    public static final int f = 0;
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    static {
        f = (int) Math.round(5.1000000000000005d);
    }

    public nz0(Context r6) {
        boolean r0 = zz1.E(r6, R.attr.elevationOverlayEnabled, false);
        int r2 = g12.s(r6, R.attr.elevationOverlayColor, 0);
        int r3 = g12.s(r6, R.attr.elevationOverlayAccentColor, 0);
        int r1 = g12.s(r6, R.attr.colorSurface, 0);
        float r7 = r6.getResources().getDisplayMetrics().density;
        this.a = r0;
        this.b = r2;
        this.c = r3;
        this.d = r1;
        this.e = r7;
    }

    public final int a(int r5, float r6) {
        float r0 = this.e;
        if (r0 > 0.0f) goto L5;
    L8:
        float r7 = 0.0f;
    L9:
        int r1 = Color.alpha(r5);
        int r8 = g12.H(v50.i(r5, 255), r7, this.b);
        if (r7 <= 0.0f) goto L15;
        int r4 = this.c;
        if (r4 == 0) goto L15;
        r8 = v50.g(v50.i(r4, f), r8);
    L15:
        return v50.i(r8, r1);
    L5:
        if (r6 <= 0.0f) goto L8;
        r7 = Math.min(((((float) Math.log1p(r6 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        goto L9
    }

    public final int b(int r3, float r4) {
        if (this.a == true) goto L5;
    L8:
        return r3;
    L5:
        if (v50.i(r3, 255) != this.d) goto L8;
        return a(r3, r4);
    }
}
