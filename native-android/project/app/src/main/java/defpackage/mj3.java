package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import app.homemusic.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mj3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ qj3 o;

    public /* synthetic */ mj3(qj3 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        int r4 = 0;
        qj3 r11 = this.o;
        switch(r0) {
            case 0: goto L92;
            case 1: goto L48;
            case 2: goto L12;
            case 3: goto L10;
            case 4: goto L8;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        r11.i(2);
        return;
    L6:
        r11.m.start();
        r11.e(r11.v, 2000);
        return;
    L8:
        r11.n.start();
        return;
    L10:
        r11.o.start();
        return;
    L12:
        ValueAnimator r1 = r11.s;
        View r2 = r11.l;
        PlayerControlView r3 = r11.a;
        ViewGroup r6 = r11.h;
        ViewGroup r7 = r11.g;
        if (r7 == null) goto L113;
        if (r6 == null) goto L118;
        int r8 = (r3.getWidth() - r3.getPaddingLeft()) - r3.getPaddingRight();
    L18:
        if (r6.getChildCount() <= 1) goto L20;
        int r5 = r6.getChildCount() - 2;
        View r9 = r6.getChildAt(r5);
        r6.removeViewAt(r5);
        r7.addView(r9, 0);
        goto L18
    L20:
        if (r2 == null) goto L22;
        r2.setVisibility(8);
    L22:
        int r10 = qj3.c(r11.j);
        int r12 = r7.getChildCount() - 1;
        int r13 = 0;
    L23:
        if (r13 >= r12) goto L25;
        r10 = r10 + qj3.c(r7.getChildAt(r13));
        r13 = r13 + 1;
        goto L23
    L25:
        if (r10 <= r8) goto L40;
        if (r2 == null) goto L28;
        r2.setVisibility(0);
        r10 = r10 + qj3.c(r2);
    L28:
        ArrayList r14 = new ArrayList();
        int r15 = 0;
    L29:
        if (r15 >= r12) goto L35;
        View r16 = r7.getChildAt(r15);
        r10 = r10 - qj3.c(r16);
        r14.add(r16);
        if (r10 <= r8) goto L35;
        r15 = r15 + 1;
    L35:
        if (r14.isEmpty() == true) goto L114;
        r7.removeViews(0, r14.size());
    L38:
        if (r4 >= r14.size()) goto L119;
        r6.addView((View) r14.get(r4), r6.getChildCount() - 1);
        r4 = r4 + 1;
        goto L38
    L119:
        return;
    L114:
        return;
    L40:
        ViewGroup r17 = r11.i;
        if (r17 != null) goto L43;
        return;
    L43:
        if (r17.getVisibility() == 0) goto L45;
        return;
    L45:
        if (r1.isStarted() == true) goto L117;
        r11.r.cancel();
        r1.start();
        return;
    L117:
        return;
    L118:
        return;
    L113:
        return;
    L48:
        View r18 = r11.k;
        ViewGroup r19 = r11.f;
        if (r19 != null) goto L51;
    L55:
        if (r18 == null) goto L81;
        int r20 = r11.a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
        ViewGroup.MarginLayoutParams r21 = (ViewGroup.MarginLayoutParams) r18.getLayoutParams();
        if (r21 == null) goto L63;
        if (r11.B == false) goto L61;
        r20 = 0;
    L61:
        r21.bottomMargin = r20;
        r18.setLayoutParams(r21);
    L63:
        if ((r18 instanceof DefaultTimeBar) == false) goto L81;
        DefaultTimeBar r22 = (DefaultTimeBar) r18;
        Rect r23 = r22.n;
        ValueAnimator r24 = r22.R;
        if (r11.B == true) goto L67;
        int r25 = r11.A;
        if (r25 == 1) goto L73;
        if (r25 == 3) goto L81;
        if (r24.isStarted() == false) goto L80;
        r24.cancel();
    L80:
        r22.T = false;
        r22.S = 1.0f;
        r22.invalidate(r23);
        goto L81
    L73:
        if (r24.isStarted() == false) goto L75;
        r24.cancel();
    L75:
        r22.T = false;
        r22.S = 0.0f;
        r22.invalidate(r23);
        goto L81
    L67:
        if (r24.isStarted() == false) goto L69;
        r24.cancel();
    L69:
        r22.T = true;
        r22.S = 0.0f;
        r22.invalidate(r23);
    L81:
        ArrayList r26 = r11.z;
        int r27 = r26.size();
        int r28 = 0;
    L82:
        if (r28 >= r27) goto L90;
        Object r29 = r26.get(r28);
        r28 = r28 + 1;
        View r30 = (View) r29;
        if (r11.B == true) goto L86;
    L88:
        int r31 = 0;
    L89:
        r30.setVisibility(r31);
        goto L82
    L86:
        if (qj3.j(r30) == false) goto L88;
        r31 = 4;
        goto L89
    L90:
        return;
    L51:
        if (r11.B == false) goto L53;
        int r32 = 0;
    L54:
        r19.setVisibility(r32);
        goto L55
    L53:
        r32 = 4;
        goto L54
    L92:
        if (r11.D == true) goto L94;
        r11.i(0);
        r11.g();
        return;
    L94:
        int r33 = r11.A;
        if (r33 == 1) goto L102;
        if (r33 == 2) goto L101;
        if (r33 == 3) goto L100;
        if (r33 == 4) goto L121;
    L103:
        r11.g();
        return;
    L121:
        return;
    L100:
        r11.C = true;
        goto L103
    L101:
        r11.q.start();
        goto L103
    L102:
        r11.p.start();
        goto L103
    }
}
