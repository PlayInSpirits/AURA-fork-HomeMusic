package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class zt extends eg {
    public zt() {
    }

    @Override // defpackage.pp0
    public final void h0() {
        Dialog r0 = this.w0;
        if ((r0 instanceof yt) == false) goto L8;
        yt r1 = (yt) r0;
        if (r1.t != null) goto L7;
        r1.i();
    L7:
        boolean r2 = r1.t.V;
    L8:
        i0(false, false);
    }

    @Override // defpackage.eg, defpackage.pp0
    public final Dialog j0(Bundle r5) {
        Context r0 = n();
        int r4 = this.q0;
        if (r4 != 0) goto L8;
        TypedValue r6 = new TypedValue();
        if (r0.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, r6, true) == false) goto L7;
        r4 = r6.resourceId;
        goto L8
    L7:
        r4 = R.style.Theme_Design_Light_BottomSheetDialog;
    L8:
        yt r7 = new yt(r0, r4);
        r7.x = true;
        r7.y = true;
        r7.D = new wt(0, r7);
        r7.e().i(1);
        r7.B = r7.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
        return r7;
    }

    public final void n0() {
        Dialog r0 = this.w0;
        if ((r0 instanceof yt) == false) goto L8;
        yt r1 = (yt) r0;
        if (r1.t != null) goto L7;
        r1.i();
    L7:
        boolean r2 = r1.t.V;
    L8:
        i0(true, false);
    }
}
