package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xr4 {
    public final TextPaint a;
    public final h20 b;
    public float c;
    public float d;
    public boolean e;
    public final WeakReference f;
    public rr4 g;

    public xr4(wr4 r3) {
        this.a = new TextPaint(1);
        this.b = new h20(1, this);
        this.e = true;
        this.f = new WeakReference(null);
        this.f = new WeakReference(r3);
    }

    public final float a(String r2) {
        if (this.e == false) goto L5;
        b(r2);
        return this.c;
    L5:
        return this.c;
    }

    public final void b(String r5) {
        TextPaint r1 = this.a;
        float r2 = 0.0f;
        if (r5 != null) goto L5;
        float r3 = 0.0f;
    L6:
        this.c = r3;
        if (r5 == null) goto L10;
        r2 = Math.abs(r1.getFontMetrics().ascent);
    L10:
        this.d = r2;
        this.e = false;
        return;
    L5:
        r3 = r1.measureText(r5, 0, r5.length());
        goto L6
    }

    public final void c(rr4 r5, Context r6) {
        if (this.g == r5) goto L14;
        this.g = r5;
        WeakReference r0 = this.f;
        if (r5 == null) goto L10;
        TextPaint r1 = this.a;
        h20 r2 = this.b;
        r5.f(r6, r1, r2);
        wr4 r3 = (wr4) r0.get();
        if (r3 == null) goto L9;
        r1.drawableState = r3.getState();
    L9:
        r5.e(r6, r1, r2);
        this.e = true;
    L10:
        wr4 r4 = (wr4) r0.get();
        if (r4 == null) goto L15;
        r4.a();
        r4.onStateChange(r4.getState());
        return;
    L15:
        return;
    }
}
