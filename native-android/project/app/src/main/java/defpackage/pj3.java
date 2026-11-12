package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.media3.ui.PlayerControlView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pj3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerControlView b;
    public final /* synthetic */ qj3 c;

    public /* synthetic */ pj3(qj3 r1, PlayerControlView r2, int r3) {
        this.a = r3;
        this.c = r1;
        this.b = r2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r4) {
        int r5 = this.a;
        PlayerControlView r2 = this.b;
        qj3 r3 = this.c;
        switch(r5) {
            case 0: goto L12;
            case 1: goto L8;
            default: goto L4;
        };
    L4:
        r3.i(2);
        if (r3.C == false) goto L16;
        r2.post(r3.t);
        r3.C = false;
        return;
    L16:
        return;
    L8:
        r3.i(2);
        if (r3.C == false) goto L17;
        r2.post(r3.t);
        r3.C = false;
        return;
    L17:
        return;
    L12:
        r3.i(1);
        if (r3.C == false) goto L18;
        r2.post(r3.t);
        r3.C = false;
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator r2) {
        int r3 = this.a;
        qj3 r1 = this.c;
        switch(r3) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        r1.i(3);
        return;
    L6:
        r1.i(3);
        return;
    L8:
        r1.i(3);
    }
}
