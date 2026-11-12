package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zh1 extends zg0 {
    public final Handler q;
    public final int r;
    public final long s;
    public Bitmap t;

    public zh1(Handler r1, int r2, long r3) {
        this.q = r1;
        this.r = r2;
        this.s = r3;
    }

    @Override // defpackage.wq4
    public final void c(Object r3, cx4 r4) {
        this.t = (Bitmap) r3;
        Handler r5 = this.q;
        r5.sendMessageAtTime(r5.obtainMessage(1, this), this.s);
    }

    @Override // defpackage.wq4
    public final void m(Drawable r1) {
        this.t = null;
    }
}
