package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pb3 {
    public final BitmapDrawable a;
    public float b;
    public final Rect c;
    public Interpolator d;
    public long e;
    public final Rect f;
    public int g;
    public float h;
    public long i;
    public boolean j;
    public boolean k;
    public hd5 l;

    public pb3(BitmapDrawable r2, Rect r3) {
        this.b = 1.0f;
        this.h = 1.0f;
        this.a = r2;
        this.f = r3;
        Rect r0 = new Rect(r3);
        this.c = r0;
        if (r2 == null) goto L6;
        r2.setAlpha((int) (this.b * 255.0f));
        r2.setBounds(r0);
        return;
    }
}
