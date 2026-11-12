package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dh extends au0 {
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ WeakReference I;
    public final /* synthetic */ ih J;

    public dh(ih ihVar, int i, int i2, WeakReference weakReference) {
        this.J = ihVar;
        this.G = i;
        this.H = i2;
        this.I = weakReference;
    }

    @Override // defpackage.au0
    public final void M(int i) {
    }

    @Override // defpackage.au0
    public final void N(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.G) != -1) {
            typeface = hh.a(typeface, i, (this.H & 2) != 0);
        }
        ih ihVar = this.J;
        if (ihVar.m) {
            ihVar.l = typeface;
            TextView textView = (TextView) this.I.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = ihVar.j;
                if (zIsAttachedToWindow) {
                    textView.post(new eh(textView, typeface, i2, 0));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }
}
