package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kp2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Map n;
    public final /* synthetic */ Map o;
    public final /* synthetic */ qp2 p;

    public kp2(qp2 r1, HashMap r2, HashMap r3) {
        this.p = r1;
        this.n = r2;
        this.o = r3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        qp2 r1 = this.p;
        r1.R.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet r2 = r1.U;
        if (r2 != null) goto L5;
        return;
    L5:
        if (r1.V == null) goto L39;
        int r3 = r2.size() - r1.V.size();
        boolean r4 = true;
        gp2 r5 = new gp2(1 == true ? 1 : 0, r1);
        int r6 = r1.R.getFirstVisiblePosition();
        int r7 = 0;
        boolean r8 = false;
    L8:
        int r9 = r1.R.getChildCount();
        Map r10 = this.n;
        Map r11 = this.o;
        if (r7 >= r9) goto L24;
        View r12 = r1.R.getChildAt(r7);
        wq2 r13 = (wq2) r1.S.getItem(r6 + r7);
        Rect r14 = (Rect) r10.get(r13);
        int r15 = r12.getTop();
        if (r14 == null) goto L13;
        int r16 = r14.top;
    L14:
        AnimationSet r17 = new AnimationSet(r4);
        HashSet r18 = r1.U;
        if (r18 == null) goto L20;
        if (r18.contains(r13) == false) goto L20;
        AlphaAnimation r19 = new AlphaAnimation(0.0f, 0.0f);
        r19.setDuration(r1.u0);
        r17.addAnimation(r19);
        r16 = r15;
    L20:
        TranslateAnimation r20 = new TranslateAnimation(0.0f, 0.0f, r16 - r15, 0.0f);
        r20.setDuration(r1.t0);
        r17.addAnimation(r20);
        r4 = true;
        r17.setFillAfter(true);
        r17.setFillEnabled(true);
        r17.setInterpolator(r1.w0);
        if (r8 == true) goto L23;
        r17.setAnimationListener(r5);
        r8 = true;
    L23:
        r12.clearAnimation();
        r12.startAnimation(r17);
        r10.remove(r13);
        r11.remove(r13);
        r7 = r7 + 1;
        goto L8
    L13:
        r16 = (r1.b0 * r3) + r15;
        goto L14
    L24:
        Iterator r0 = r11.entrySet().iterator();
    L26:
        if (r0.hasNext() == false) goto L40;
        Map.Entry r21 = (Map.Entry) r0.next();
        wq2 r22 = (wq2) r21.getKey();
        BitmapDrawable r23 = (BitmapDrawable) r21.getValue();
        Rect r24 = (Rect) r10.get(r22);
        if (r1.V.contains(r22) == false) goto L30;
        pb3 r25 = new pb3(r23, r24);
        r25.h = 0.0f;
        r25.e = r1.v0;
        r25.d = r1.w0;
    L31:
        r1.R.n.add(r25);
        goto L26
    L30:
        int r26 = r1.b0 * r3;
        pb3 r27 = new pb3(r23, r24);
        r27.g = r26;
        r27.e = r1.t0;
        r27.d = r1.w0;
        r27.l = new hd5(r1, r22, false, 14);
        r1.W.add(r22);
        r25 = r27;
        goto L31
    L40:
        return;
    }
}
