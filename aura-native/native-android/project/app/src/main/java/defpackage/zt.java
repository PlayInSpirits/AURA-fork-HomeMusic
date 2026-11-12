package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class zt extends eg {
    @Override // defpackage.pp0
    public final void h0() {
        Dialog dialog = this.w0;
        if (dialog instanceof yt) {
            yt ytVar = (yt) dialog;
            if (ytVar.t == null) {
                ytVar.i();
            }
            boolean z = ytVar.t.V;
        }
        i0(false, false);
    }

    @Override // defpackage.eg, defpackage.pp0
    public final Dialog j0(Bundle bundle) {
        Context contextN = n();
        int i = this.q0;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = contextN.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        yt ytVar = new yt(contextN, i);
        ytVar.x = true;
        ytVar.y = true;
        ytVar.D = new wt(0, ytVar);
        ytVar.e().i(1);
        ytVar.B = ytVar.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
        return ytVar;
    }

    public final void n0() {
        Dialog dialog = this.w0;
        if (dialog instanceof yt) {
            yt ytVar = (yt) dialog;
            if (ytVar.t == null) {
                ytVar.i();
            }
            boolean z = ytVar.t.V;
        }
        i0(true, false);
    }
}
