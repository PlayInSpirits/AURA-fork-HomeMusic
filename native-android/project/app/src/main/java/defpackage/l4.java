package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.eddyizm.tempus.helper.recyclerview.FastScrollbar;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l4(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator r4) {
        int r0 = this.a;
        Object r2 = this.b;
        switch(r0) {
            case 0: goto L10;
            case 6: goto L8;
            case 7: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationCancel(r4);
        return;
    L6:
        super.onAnimationCancel(r4);
        FastScrollbar r3 = (FastScrollbar) r2;
        r3.n.setVisibility(4);
        r3.r = null;
        return;
    L8:
        ((dq) r2).d();
        return;
    L10:
        ActionBarOverlayLayout r5 = (ActionBarOverlayLayout) r2;
        r5.J = null;
        r5.w = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator r6) {
        int r0 = this.a;
        int r2 = 0;
        c05 r3 = null;
        Object r4 = this.b;
        switch(r0) {
            case 0: goto L50;
            case 1: goto L46;
            case 2: goto L38;
            case 3: goto L32;
            case 4: goto L30;
            case 5: goto L28;
            case 6: goto L26;
            case 7: goto L24;
            case 8: goto L22;
            case 9: goto L20;
            case 10: goto L4;
            case 11: goto L18;
            case 12: goto L14;
            case 13: goto L8;
            case 14: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationEnd(r6);
        return;
    L6:
        ((dx4) r4).l();
        r6.removeListener(this);
        return;
    L8:
        SideSheetBehavior r5 = (SideSheetBehavior) r4;
        r5.x(5);
        WeakReference r7 = r5.C;
        if (r7 != null) goto L11;
        return;
    L11:
        if (r7.get() == null) goto L55;
        ((View) r5.C.get()).requestLayout();
        return;
    L55:
        return;
    L14:
        View r8 = (View) r4;
        if (r8 == null) goto L56;
        r8.setVisibility(0);
        return;
    L56:
        return;
    L18:
        dh2 r9 = (dh2) r4;
        r9.b.setTranslationY(0.0f);
        r9.c(0.0f);
        return;
    L20:
        ((HideBottomViewOnScrollBehavior) r4).u = null;
        return;
    L22:
        m81 r10 = (m81) r4;
        r10.q = 0;
        r10.l = null;
        return;
    L24:
        super.onAnimationEnd(r6);
        FastScrollbar r11 = (FastScrollbar) r4;
        r11.n.setVisibility(4);
        r11.r = null;
        return;
    L26:
        ((dq) r4).e();
        return;
    L28:
        ((ExpandableTransformationBehavior) r4).o = null;
        return;
    L30:
        ix0 r12 = (ix0) r4;
        r12.p();
        r12.r.start();
        return;
    L32:
        BottomSheetBehavior r13 = (BottomSheetBehavior) r4;
        r13.K(5);
        WeakReference r14 = r13.h0;
        if (r14 != null) goto L35;
        return;
    L35:
        if (r14.get() == null) goto L58;
        ((View) r13.h0.get()).requestLayout();
        return;
    L58:
        return;
    L38:
        super.onAnimationEnd(r6);
        uq r15 = (uq) r4;
        ViewGroup r16 = vr1.s(r15);
        if (r16 == null) goto L42;
        r3 = new c05(r16);
    L42:
        ArrayList r17 = r15.x;
        int r18 = r17.size();
    L43:
        if (r2 >= r18) goto L45;
        Object r1 = r17.get(r2);
        r2 = r2 + 1;
        ViewOverlay r19 = (ViewOverlay) r3.n;
        r19.remove((kv4) r1);
        goto L43
    L45:
        return;
    L46:
        qd r20 = (qd) r4;
        ArrayList r21 = new ArrayList(r20.r);
        int r22 = r21.size();
    L47:
        if (r2 >= r22) goto L49;
        ((hq) r21.get(r2)).a(r20);
        r2 = r2 + 1;
        goto L47
    L49:
        return;
    L50:
        ActionBarOverlayLayout r23 = (ActionBarOverlayLayout) r4;
        r23.J = null;
        r23.w = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator r3) {
        switch(this.a) {
            case 10: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationRepeat(r3);
        return;
    L6:
        super.onAnimationRepeat(r3);
        va2 r2 = (va2) this.b;
        r2.g = (r2.g + 1) % r2.f.c.length;
        r2.h = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator r4) {
        int r0 = this.a;
        int r1 = 0;
        Object r2 = this.b;
        switch(r0) {
            case 1: goto L10;
            case 6: goto L8;
            case 8: goto L6;
            default: goto L4;
        };
    L4:
        super.onAnimationStart(r4);
        return;
    L6:
        m81 r3 = (m81) r2;
        r3.r.a(0, false);
        r3.q = 2;
        r3.l = r4;
        return;
    L8:
        ((dq) r2).f(r4);
        return;
    L10:
        qd r5 = (qd) r2;
        ArrayList r6 = new ArrayList(r5.r);
        int r7 = r6.size();
    L11:
        if (r1 >= r7) goto L13;
        ((hq) r6.get(r1)).b(r5);
        r1 = r1 + 1;
        goto L11
    }
}
