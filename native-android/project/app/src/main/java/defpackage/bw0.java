package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ cw0 b;

    public /* synthetic */ bw0(cw0 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator r4) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationEnd(r4);
        return;
    L6:
        super.onAnimationEnd(r4);
        cw0 r3 = this.b;
        cw0.a(r3);
        ArrayList r5 = r3.s;
        if (r5 != null) goto L9;
        return;
    L9:
        if (r3.t == true) goto L15;
        int r0 = r5.size();
        int r1 = 0;
    L11:
        if (r1 >= r0) goto L16;
        Object r2 = r5.get(r1);
        r1 = r1 + 1;
        ((hq) r2).a(r3);
        goto L11
    L16:
        return;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator r4) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationStart(r4);
        return;
    L6:
        super.onAnimationStart(r4);
        cw0 r3 = this.b;
        ArrayList r5 = r3.s;
        if (r5 != null) goto L9;
        return;
    L9:
        if (r3.t == true) goto L15;
        int r0 = r5.size();
        int r1 = 0;
    L11:
        if (r1 >= r0) goto L16;
        Object r2 = r5.get(r1);
        r1 = r1 + 1;
        ((hq) r2).b(r3);
        goto L11
    L16:
        return;
    }
}
