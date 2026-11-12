package defpackage;

import android.view.animation.Animation;
import androidx.mediarouter.app.OverlayListView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gp2 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gp2(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    private final void a(Animation r1) {
    }

    private final void b(Animation r1) {
    }

    private final void c(Animation r1) {
    }

    private final void d(Animation r1) {
    }

    private final void e(Animation r1) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation r1) {
        int r2 = this.a;
        Object r0 = this.b;
        switch(r2) {
            case 0: goto L6;
            case 1: goto L8;
            default: goto L4;
        };
    L4:
        lq2 r3 = ((jq2) r0).z;
        r3.M = false;
        r3.q();
        return;
    L6:
        ((qp2) r0).n(true);
        return;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation r1) {
        int r0 = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation r8) {
        int r9 = this.a;
        Object r7 = this.b;
        switch(r9) {
            case 0: goto L18;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((jq2) r7).z.M = true;
        return;
    L6:
        qp2 r10 = (qp2) r7;
        OverlayListView r11 = r10.R;
        ArrayList r1 = r11.n;
        int r2 = r1.size();
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L11;
        Object r4 = r1.get(r3);
        r3 = r3 + 1;
        pb3 r5 = (pb3) r4;
        if (r5.j == true) goto L7;
        r5.i = r11.getDrawingTime();
        r5.j = true;
        goto L7
    L11:
        r10.R.postDelayed(r10.A0, r10.t0);
        return;
    }
}
