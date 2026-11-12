package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i73 extends zg0 {
    public final /* synthetic */ int q;
    public final /* synthetic */ b13 r;

    public /* synthetic */ i73(b13 b13Var, int i) {
        this.q = i;
        this.r = b13Var;
    }

    @Override // defpackage.wq4
    public final void c(Object obj, cx4 cx4Var) {
        int i = this.q;
        b13 b13Var = this.r;
        switch (i) {
            case 0:
                b13Var.setValue((Bitmap) obj);
                break;
            default:
                b13Var.setValue((Bitmap) obj);
                break;
        }
    }

    @Override // defpackage.wq4
    public final void m(Drawable drawable) {
        switch (this.q) {
            case 0:
                this.r.setValue(null);
                break;
            default:
                this.r.setValue(null);
                break;
        }
    }
}
