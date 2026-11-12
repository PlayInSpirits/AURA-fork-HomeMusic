package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.navigation.NavigationView;
import com.skydoves.colorpickerview.ColorPickerView;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sg implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ sg(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int r0 = this.n;
        boolean r1 = true;
        int r2 = 0;
        Object r3 = this.o;
        switch(r0) {
            case 0: goto L128;
            case 1: goto L121;
            case 2: goto L105;
            case 3: goto L89;
            case 4: goto L73;
            case 5: goto L16;
            default: goto L4;
        };
    L4:
        wk4 r4 = (wk4) r3;
        ev2 r9 = r4.u;
        if (r4.b() == true) goto L7;
        return;
    L7:
        if (r9.L == true) goto L142;
        View r5 = r4.z;
        if (r5 != null) goto L11;
    L14:
        r4.dismiss();
        return;
    L11:
        if (r5.isShown() == false) goto L14;
        r9.f();
        return;
    L142:
        return;
    L16:
        NavigationView r6 = (NavigationView) r3;
        int[] r10 = r6.y;
        r6.getLocationOnScreen(r10);
        if (r10[1] != 0) goto L19;
        boolean r7 = true;
    L20:
        l43 r8 = r6.v;
        if (r8.K == r7) goto L30;
        r8.K = r7;
        if (r8.o.getChildCount() <= 0) goto L26;
    L28:
        int r11 = 0;
    L29:
        NavigationMenuView r12 = r8.n;
        r12.setPadding(0, r11, 0, r12.getPaddingBottom());
        goto L30
    L26:
        if (r8.K == false) goto L28;
        r11 = r8.M;
    L30:
        if (r7 == true) goto L32;
    L34:
        boolean r13 = false;
    L35:
        r6.setDrawTopInsetForeground(r13);
        int r14 = r10[0];
        if (r14 != 0) goto L38;
    L41:
        boolean r15 = true;
    L42:
        r6.setDrawLeftInsetForeground(r15);
        Context r16 = r6.getContext();
    L44:
        if ((r16 instanceof ContextWrapper) == false) goto L49;
        if ((r16 instanceof Activity) == true) goto L47;
        r16 = ((ContextWrapper) r16).getBaseContext();
        goto L44
    L47:
        Activity r17 = (Activity) r16;
    L50:
        if (r17 == null) goto L144;
        Rect r18 = ya4.u(r17);
        if ((r18.height() - r6.getHeight()) != r10[1]) goto L54;
        boolean r19 = true;
    L56:
        if (Color.alpha(r17.getWindow().getNavigationBarColor()) == 0) goto L58;
        boolean r20 = true;
    L59:
        if (r19 == false) goto L64;
        if (r20 == false) goto L64;
        if (r6.C == false) goto L64;
        boolean r21 = true;
    L65:
        r6.setDrawBottomInsetForeground(r21);
        if (r18.width() != r10[0]) goto L68;
    L71:
        r6.setDrawRightInsetForeground(r1);
        return;
    L68:
        if ((r18.width() - r6.getWidth()) == r10[0]) goto L71;
        r1 = false;
    L64:
        r21 = false;
        goto L65
    L58:
        r20 = false;
        goto L59
    L54:
        r19 = false;
        goto L56
    L144:
        return;
    L49:
        r17 = null;
        goto L50
    L38:
        if ((r6.getWidth() + r14) == 0) goto L41;
        r15 = false;
        goto L42
    L32:
        if (r6.B == false) goto L34;
        r13 = true;
        goto L35
    L19:
        r7 = false;
        goto L20
    L73:
        qp2 r22 = (qp2) r3;
        r22.R.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet r23 = r22.U;
        if (r23 != null) goto L76;
    L87:
        r22.n(true);
        return;
    L76:
        if (r23.size() == 0) goto L87;
        gp2 r24 = new gp2(r2, r22);
        int r25 = r22.R.getFirstVisiblePosition();
        boolean r26 = false;
    L79:
        if (r2 >= r22.R.getChildCount()) goto L145;
        View r27 = r22.R.getChildAt(r2);
        if (r22.U.contains((wq2) r22.S.getItem(r25 + r2)) == false) goto L86;
        AlphaAnimation r28 = new AlphaAnimation(0.0f, 1.0f);
        r28.setDuration(r22.u0);
        r28.setFillEnabled(true);
        r28.setFillAfter(true);
        if (r26 == true) goto L85;
        r28.setAnimationListener(r24);
        r26 = true;
    L85:
        r27.clearAnimation();
        r27.startAnimation(r28);
    L86:
        r2 = r2 + 1;
        goto L79
    L145:
        return;
    L89:
        ColorPickerView r29 = (ColorPickerView) r3;
        r29.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        hg3 r30 = r29.G;
        if (r29.getParent() == null) goto L95;
        if ((r29.getParent() instanceof ViewGroup) == false) goto L95;
        ((ViewGroup) r29.getParent()).setClipChildren(false);
    L95:
        if (r29.getPreferenceName() == null) goto L103;
        r30.getClass();
        SharedPreferences r31 = (SharedPreferences) r30.o;
        if (r29.getPreferenceName() == null) goto L99;
        String r32 = r29.getPreferenceName();
        r29.setPureColor(r31.getInt(r32 + "_COLOR", -1));
        Point r33 = new Point(r29.getWidth() / 2, r29.getMeasuredHeight() / 2);
        int r34 = r30.D(r32, r33).x;
        int r35 = r30.D(r32, r33).y;
        int r36 = r31.getInt(r32 + "_COLOR", -1);
        r29.n = r36;
        r29.o = r36;
        r29.p = new Point(r34, r35);
        r29.i(r34, r35);
        r29.a(r29.getColor());
        r29.f(r29.p);
    L99:
        int r37 = r31.getInt(r29.getPreferenceName() + "_COLOR", -1);
        if ((r29.q.getDrawable() instanceof b50) == false) goto L146;
        if (r37 == (-1)) goto L147;
        r29.post(new g50(r29, r37, 1));
        return;
    L147:
        return;
    L146:
        return;
    L103:
        Point r38 = kb4.z(r29, new Point(r29.getWidth() / 2, r29.getMeasuredHeight() / 2));
        int r39 = r29.d(r38.x, r38.y);
        r29.n = r39;
        r29.o = r39;
        r29.p = new Point(r38.x, r38.y);
        r29.i(r38.x, r38.y);
        r29.a(r29.getColor());
        r29.f(r29.p);
        r29.e();
        return;
    L105:
        uz r40 = (uz) r3;
        ArrayList r41 = r40.u;
        if (r40.b() == true) goto L108;
        return;
    L108:
        if (r41.size() > 0) goto L110;
        return;
    L110:
        if (((tz) r41.get(0)).a.L == true) goto L151;
        View r42 = r40.B;
        if (r42 != null) goto L114;
    L119:
        r40.dismiss();
        return;
    L114:
        if (r42.isShown() == false) goto L119;
        int r43 = r41.size();
    L117:
        if (r2 >= r43) goto L152;
        Object r44 = r41.get(r2);
        r2 = r2 + 1;
        ((tz) r44).a.f();
        goto L117
    L152:
        return;
    L151:
        return;
    L121:
        yg r45 = (yg) r3;
        bh r46 = r45.T;
        if (r46.isAttachedToWindow() == true) goto L124;
    L126:
        r45.dismiss();
        return;
    L124:
        if (r46.getGlobalVisibleRect(r45.R) == false) goto L126;
        r45.s();
        r45.f();
        return;
    L128:
        bh r47 = (bh) r3;
        if (r47.getInternalPopup().b() == true) goto L131;
        r47.s.n(r47.getTextDirection(), r47.getTextAlignment());
    L131:
        ViewTreeObserver r48 = r47.getViewTreeObserver();
        if (r48 == null) goto L154;
        r48.removeOnGlobalLayoutListener(this);
        return;
    }
}
