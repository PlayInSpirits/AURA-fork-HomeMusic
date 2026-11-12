package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i73 extends zg0 {
    public final /* synthetic */ int q;
    public final /* synthetic */ b13 r;

    public /* synthetic */ i73(b13 r1, int r2) {
        this.q = r2;
        this.r = r1;
    }

    @Override // defpackage.wq4
    public final void c(Object r1, cx4 r2) {
        int r3 = this.q;
        b13 r0 = this.r;
        switch(r3) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r0.setValue((Bitmap) r1);
        return;
    L6:
        r0.setValue((Bitmap) r1);
    }

    @Override // defpackage.wq4
    public final void m(Drawable r1) {
        switch(this.q) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.r.setValue(null);
        return;
    L6:
        this.r.setValue(null);
    }
}
