package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xp2 implements View.OnClickListener {
    public final /* synthetic */ int n = 1;
    public final Object o;
    public final /* synthetic */ Object p;

    public xp2(gv4 gv4Var) {
        this.p = gv4Var;
        Context context = gv4Var.a.getContext();
        CharSequence charSequence = gv4Var.h;
        q4 q4Var = new q4();
        q4Var.e = 4096;
        q4Var.g = 4096;
        q4Var.l = null;
        q4Var.m = null;
        q4Var.n = false;
        q4Var.o = false;
        q4Var.p = 16;
        q4Var.i = context;
        q4Var.a = charSequence;
        this.o = q4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        Object obj = this.o;
        Object obj2 = this.p;
        switch (i) {
            case 0:
                yp2 yp2Var = (yp2) obj2;
                wq2 wq2Var = (wq2) obj;
                yp2Var.y.w.B = wq2Var;
                wq2Var.k(true);
                yp2Var.v.setVisibility(4);
                yp2Var.w.setVisibility(0);
                break;
            default:
                gv4 gv4Var = (gv4) obj2;
                Window.Callback callback = gv4Var.k;
                if (callback != null && gv4Var.l) {
                    callback.onMenuItemSelected(0, (q4) obj);
                    break;
                }
                break;
        }
    }

    public xp2(yp2 yp2Var, wq2 wq2Var) {
        this.p = yp2Var;
        this.o = wq2Var;
    }
}
