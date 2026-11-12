package defpackage;

import android.view.View;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lp2 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ qp2 o;

    public /* synthetic */ lp2(qp2 qp2Var, int i) {
        this.n = i;
        this.o = qp2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        qp2 qp2Var = this.o;
        switch (i) {
            case 0:
                int id = view.getId();
                if (id == 16908313 || id == 16908314) {
                    if (qp2Var.w.g()) {
                        yq2 yq2Var = qp2Var.u;
                        int i2 = id == 16908313 ? 2 : 1;
                        yq2Var.getClass();
                        yq2.f(i2);
                    }
                    qp2Var.dismiss();
                } else if (id != R.id.mr_control_playback_ctrl && id == R.id.mr_close) {
                    qp2Var.dismiss();
                }
                break;
            case 1:
                qp2Var.dismiss();
                break;
            case 2:
                break;
            default:
                boolean z = qp2Var.q0;
                qp2Var.q0 = !z;
                if (!z) {
                    qp2Var.R.setVisibility(0);
                }
                qp2Var.w0 = qp2Var.q0 ? qp2Var.x0 : qp2Var.y0;
                qp2Var.w(true);
                break;
        }
    }
}
