package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xe implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xe(int r1, Object r2, Object r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r5) {
        int r0 = this.a;
        Object r1 = this.c;
        Object r4 = this.b;
        switch(r0) {
            case 0: goto L17;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((View) ((ia5) ((oz4) r4).n).g.getParent()).invalidate();
        return;
    L6:
        fi2 r2 = (fi2) r1;
        int r3 = AppBarLayout.L;
        int r6 = (int) ((Float) r5.getAnimatedValue()).floatValue();
        r2.setAlpha(r6);
        ArrayList r7 = ((AppBarLayout) r4).E;
        int r8 = r7.size();
        int r9 = 0;
    L7:
        if (r9 >= r8) goto L29;
        Object r10 = r7.get(r9);
        r9 = r9 + 1;
        if (r10 != null) goto L15;
        ColorStateList r11 = r2.n.c;
        if (r11 == null) goto L7;
        r11.withAlpha(r6).getDefaultColor();
        throw null;
    L15:
        kf2.k();
        return;
    L29:
        return;
    L17:
        AppBarLayout r12 = (AppBarLayout) r4;
        int r13 = AppBarLayout.L;
        float r14 = ((Float) r5.getAnimatedValue()).floatValue();
        ((fi2) r1).l(r14);
        Drawable r15 = r12.I;
        if ((r15 instanceof fi2) == false) goto L20;
        ((fi2) r15).l(r14);
    L20:
        Iterator r16 = r12.E.iterator();
        if (r16.hasNext() == true) goto L24;
        return;
    L24:
        throw xa3.d(r16);
    }
}
