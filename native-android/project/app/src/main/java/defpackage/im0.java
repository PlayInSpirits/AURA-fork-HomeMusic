package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class im0 implements ImageDecoder$OnHeaderDecodedListener {
    public final ll1 a;
    public final int b;
    public final int c;
    public final vi0 d;
    public final gu0 e;
    public final boolean f;
    public final tp3 g;

    public im0(int r2, int r3, db3 r4) {
        this.a = ll1.a();
        this.b = r2;
        this.c = r3;
        this.d = (vi0) r4.c(iu0.f);
        this.e = (gu0) r4.c(gu0.g);
        ab3 r5 = iu0.i;
        if (r4.c(r5) != null) goto L5;
    L7:
        boolean r6 = false;
    L8:
        this.f = r6;
        this.g = (tp3) r4.c(iu0.g);
        return;
    L5:
        if (((Boolean) r4.c(r5)).booleanValue() == false) goto L7;
        r6 = true;
        goto L8
    }

    public final void onHeaderDecoded(ImageDecoder r7, ImageDecoder.ImageInfo r8, ImageDecoder.Source r9) {
        boolean r10 = this.f;
        ll1 r1 = this.a;
        int r2 = this.b;
        int r3 = this.c;
        if (r1.c(r2, r3, r10, false) == false) goto L5;
        i3.n(r7);
    L7:
        if (this.d != vi0.o) goto L9;
        i3.D(r7);
    L9:
        i3.p(r7, new hm0());
        Size r11 = i3.i(r8);
        if (r2 != Integer.MIN_VALUE) goto L12;
        r2 = r11.getWidth();
    L12:
        if (r3 != Integer.MIN_VALUE) goto L14;
        r3 = r11.getHeight();
    L14:
        float r0 = this.e.b(r11.getWidth(), r11.getHeight(), r2, r3);
        int r4 = Math.round(r11.getWidth() * r0);
        int r5 = Math.round(r11.getHeight() * r0);
        if (Log.isLoggable("ImageDecoder", 2) == false) goto L17;
        Log.v("ImageDecoder", "Resizing from [" + r11.getWidth() + "x" + r11.getHeight() + "] to [" + r4 + "x" + r5 + "] scaleFactor: " + r0);
    L17:
        i3.o(r7, r4, r5);
        tp3 r6 = this.g;
        if (r6 == null) goto L35;
        int r12 = Build.VERSION.SDK_INT;
        if (r12 < 28) goto L32;
        if (r6 == tp3.n) goto L24;
    L28:
        ColorSpace.Named r13 = tn.A();
    L29:
        i3.q(r7, tn.e(r13));
        return;
    L24:
        if (i3.c(r8) == null) goto L28;
        if (tn.y(i3.c(r8)) == false) goto L28;
        r13 = tn.d();
        goto L29
    L32:
        if (r12 < 26) goto L36;
        tn.A();
        i3.q(r7, gm0.g());
        return;
    L36:
        return;
    L35:
        return;
    L5:
        i3.A(r7);
        goto L7
    }
}
