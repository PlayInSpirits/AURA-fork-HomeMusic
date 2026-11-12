package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lp2 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ qp2 o;

    public /* synthetic */ lp2(qp2 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r4) {
        int r0 = this.n;
        int r1 = 1;
        qp2 r3 = this.o;
        switch(r0) {
            case 0: goto L15;
            case 1: goto L13;
            case 2: goto L34;
            default: goto L4;
        };
    L4:
        boolean r5 = r3.q0;
        r3.q0 = !r5;
        if (r5 == true) goto L8;
        r3.R.setVisibility(0);
    L8:
        if (r3.q0 == false) goto L10;
        Interpolator r6 = r3.x0;
    L11:
        r3.w0 = r6;
        r3.w(true);
        return;
    L10:
        r6 = r3.y0;
        goto L11
    L13:
        r3.dismiss();
        return;
    L15:
        int r7 = r4.getId();
        if (r7 == 16908313) goto L27;
        if (r7 == 16908314) goto L27;
        if (r7 != R.id.mr_control_playback_ctrl) goto L24;
        return;
    L24:
        if (r7 != R.id.mr_close) goto L35;
        r3.dismiss();
        return;
    L35:
        return;
    L27:
        if (r3.w.g() == false) goto L32;
        yq2 r2 = r3.u;
        if (r7 != 16908313) goto L31;
        r1 = 2;
    L31:
        r2.getClass();
        yq2.f(r1);
    L32:
        r3.dismiss();
        return;
    }
}
