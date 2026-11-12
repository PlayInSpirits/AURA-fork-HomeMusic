package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.ClippableRoundedCornerLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public d61(lo r2, boolean r3) {
        this.a = 2;
        this.c = r2;
        this.b = r3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator r2) {
        switch(this.a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationCancel(r2);
        return;
    L6:
        this.b = true;
        return;
    L8:
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator r5) {
        int r6 = this.a;
        Object r3 = this.c;
        switch(r6) {
            case 0: goto L14;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        lo r4 = (lo) r3;
        if (this.b == false) goto L7;
        float r7 = 1.0f;
    L8:
        lo.a(r4, r7);
        ClippableRoundedCornerLayout r8 = (ClippableRoundedCornerLayout) r4.c;
        r8.n = null;
        r8.o = 0.0f;
        r8.invalidate();
        return;
    L7:
        r7 = 0.0f;
        goto L8
    L10:
        m81 r9 = (m81) r3;
        r9.q = 0;
        r9.l = null;
        if (this.b == true) goto L22;
        r9.r.a(4, false);
        return;
    L22:
        return;
    L14:
        e61 r10 = (e61) r3;
        if (this.b == false) goto L18;
        this.b = false;
        return;
    L18:
        if (((Float) r10.z.getAnimatedValue()).floatValue() != 0.0f) goto L20;
        r10.A = 0;
        r10.l(0);
        return;
    L20:
        r10.A = 2;
        r10.s.invalidate();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator r4) {
        int r0 = this.a;
        Object r1 = this.c;
        switch(r0) {
            case 1: goto L12;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationStart(r4);
        return;
    L6:
        lo r2 = (lo) r1;
        if (this.b == false) goto L9;
        float r3 = 0.0f;
    L10:
        lo.a(r2, r3);
        return;
    L9:
        r3 = 1.0f;
        goto L10
    L12:
        m81 r5 = (m81) r1;
        r5.r.a(0, false);
        r5.q = 1;
        r5.l = r4;
        this.b = false;
    }

    public d61(m81 r2) {
        this.a = 1;
        this.c = r2;
    }

    public d61(e61 r2) {
        this.a = 0;
        this.c = r2;
        this.b = false;
    }
}
