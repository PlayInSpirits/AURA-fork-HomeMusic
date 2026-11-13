package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class zh1 extends zg0 {
    public final Handler q;
    public final int r;
    public final long s;
    public Bitmap t;

    public zh1(Handler handler, int i, long j) {
        this.q = handler;
        this.r = i;
        this.s = j;
    }

    @Override // defpackage.wq4
    public final void c(Object obj, cx4 cx4Var) {
        this.t = (Bitmap) obj;
        Handler handler = this.q;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.s);
    }

    @Override // defpackage.wq4
    public final void m(Drawable drawable) {
        this.t = null;
    }
}
