package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bq2 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ lq2 o;

    public /* synthetic */ bq2(lq2 lq2Var, int i) {
        this.n = i;
        this.o = lq2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        lq2 lq2Var = this.o;
        switch (i) {
            case 0:
                lq2Var.dismiss();
                break;
            default:
                if (lq2Var.w.g()) {
                    lq2Var.t.getClass();
                    yq2.f(2);
                }
                lq2Var.dismiss();
                break;
        }
    }
}
