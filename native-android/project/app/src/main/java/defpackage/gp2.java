package defpackage;

import android.view.animation.Animation;
import androidx.mediarouter.app.OverlayListView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gp2 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gp2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }

    private final void e(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((qp2) obj).n(true);
                break;
            case 1:
                break;
            default:
                lq2 lq2Var = ((jq2) obj).z;
                lq2Var.M = false;
                lq2Var.q();
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                qp2 qp2Var = (qp2) obj;
                OverlayListView overlayListView = qp2Var.R;
                ArrayList arrayList = overlayListView.n;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    pb3 pb3Var = (pb3) obj2;
                    if (!pb3Var.j) {
                        pb3Var.i = overlayListView.getDrawingTime();
                        pb3Var.j = true;
                    }
                }
                qp2Var.R.postDelayed(qp2Var.A0, qp2Var.t0);
                break;
            default:
                ((jq2) obj).z.M = true;
                break;
        }
    }
}
