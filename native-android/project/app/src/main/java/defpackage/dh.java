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

    public dh(ih r1, int r2, int r3, WeakReference r4) {
        this.J = r1;
        this.G = r2;
        this.H = r3;
        this.I = r4;
    }

    @Override // defpackage.au0
    public final void M(int r1) {
    }

    @Override // defpackage.au0
    public final void N(Typeface r4) {
        if (Build.VERSION.SDK_INT < 28) goto L11;
        int r1 = this.G;
        if (r1 == (-1)) goto L11;
        if ((this.H & 2) == 0) goto L9;
        boolean r0 = true;
    L10:
        r4 = hh.a(r4, r1, r0);
        goto L11
    L9:
        r0 = false;
    L11:
        ih r2 = this.J;
        if (r2.m == false) goto L21;
        r2.l = r4;
        TextView r3 = (TextView) this.I.get();
        if (r3 == null) goto L22;
        boolean r5 = r3.isAttachedToWindow();
        int r6 = r2.j;
        if (r5 == false) goto L19;
        r3.post(new eh(r3, r4, r6, 0));
        return;
    L19:
        r3.setTypeface(r4, r6);
        return;
    L22:
        return;
    }
}
