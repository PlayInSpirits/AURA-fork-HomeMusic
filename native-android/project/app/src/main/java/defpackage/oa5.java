package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import app.homemusic.R;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oa5 implements View.OnApplyWindowInsetsListener {
    public final ma5 a;
    public pb5 b;

    public oa5(View r2, ma5 r3) {
        this.a = r3;
        WeakHashMap r4 = j65.a;
        pb5 r5 = b65.a(r2);
        if (r5 == null) goto L24;
        int r6 = Build.VERSION.SDK_INT;
        if (r6 < 36) goto L8;
        bb5 r7 = new ab5(r5);
    L23:
        pb5 r8 = r7.b();
    L25:
        this.b = r8;
        return;
    L8:
        if (r6 < 35) goto L11;
        r7 = new za5(r5);
        goto L23
    L11:
        if (r6 < 34) goto L14;
        r7 = new ya5(r5);
        goto L23
    L14:
        if (r6 < 31) goto L17;
        r7 = new xa5(r5);
        goto L23
    L17:
        if (r6 < 30) goto L20;
        r7 = new wa5(r5);
        goto L23
    L20:
        if (r6 < 29) goto L22;
        r7 = new va5(r5);
        goto L23
    L22:
        r7 = new ua5(r5);
        goto L23
    L24:
        r8 = null;
        goto L25
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View r21, WindowInsets r22) {
        if (r21.isLaidOut() == true) goto L9;
        this.b = pb5.g(r22, r21);
        if (r21.getTag(R.id.tag_on_apply_window_listener) == null) goto L8;
        return r22;
    L8:
        return r21.onApplyWindowInsets(r22);
    L9:
        pb5 r3 = pb5.g(r22, r21);
        mb5 r1 = r3.a;
        if (this.b != null) goto L13;
        WeakHashMap r2 = j65.a;
        this.b = b65.a(r21);
    L13:
        if (this.b != null) goto L19;
        this.b = r3;
        if (r21.getTag(R.id.tag_on_apply_window_listener) == null) goto L18;
    L77:
        return r22;
    L18:
        return r21.onApplyWindowInsets(r22);
    L19:
        ma5 r4 = pa5.j(r21);
        if (r4 != null) goto L22;
    L28:
        int[] r5 = new int[1];
        int[] r6 = new int[1];
        pb5 r9 = this.b;
        int r10 = 1;
    L30:
        if (r10 > 512) goto L51;
        vz1 r11 = r1.h(r10);
        vz1 r13 = r9.a.h(r10);
        int r14 = r11.a;
        int r15 = r11.d;
        int r7 = r11.c;
        int r12 = r11.b;
        int r16 = r13.a;
        int r8 = r13.d;
        int[] r18 = r5;
        int r17 = r13.c;
        int r19 = r13.b;
        if (r14 > r16) goto L38;
        if (r12 > r19) goto L38;
        if (r7 > r17) goto L38;
        if (r15 > r8) goto L38;
        boolean r20 = false;
    L39:
        if (r14 < r16) goto L45;
        if (r12 < r19) goto L45;
        if (r7 < r17) goto L45;
        if (r15 < r8) goto L45;
        boolean r23 = false;
    L46:
        if (r20 == r23) goto L50;
        if (r20 == false) goto L49;
        r18[0] = r18[0] | r10;
        goto L50
    L49:
        r6[0] = r6[0] | r10;
    L50:
        r10 = r10 << 1;
        r5 = r18;
        r6 = r6;
    L45:
        r23 = true;
    L38:
        r20 = true;
        goto L39
    L51:
        boolean r110 = false;
        int r24 = r5[0];
        int r25 = r6[0];
        int r26 = r24 | r25;
        if (r26 != 0) goto L58;
        this.b = r3;
        if (r21.getTag(R.id.tag_on_apply_window_listener) != null) goto L77;
        return r21.onApplyWindowInsets(r22);
    L58:
        pb5 r27 = this.b;
        if ((r24 & 8) == 0) goto L62;
        Interpolator r28 = pa5.e;
    L72:
        if ((r26 & 8) == 0) goto L74;
        long r29 = 160;
    L75:
        ta5 r30 = new ta5(r26, r28, r29);
        r30.a.e(0.0f);
        ValueAnimator r31 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(r30.a.b());
        vz1 r32 = r1.h(r26);
        vz1 r33 = r27.a.h(r26);
        int r111 = Math.min(r32.a, r33.a);
        int r112 = r32.b;
        int r113 = r33.b;
        int r114 = Math.min(r112, r113);
        int r115 = r32.c;
        int r116 = r33.c;
        int r34 = Math.min(r115, r116);
        int r35 = r32.d;
        int r36 = r33.d;
        qr2 r37 = new qr2(vz1.b(r111, r114, r34, Math.min(r35, r36)), vz1.b(Math.max(r32.a, r33.a), Math.max(r112, r113), Math.max(r115, r116), Math.max(r35, r36)), r110, 21);
        pa5.g(r21, r30, r3, false);
        r31.addUpdateListener(new na5(r30, r3, r27, r26, r21));
        r31.addListener(new kw0(3, r21, r30));
        h93.a(r21, new sz(r21, r30, r37, r31));
        this.b = r3;
        if (r21.getTag(R.id.tag_on_apply_window_listener) != null) goto L77;
        return r21.onApplyWindowInsets(r22);
    L74:
        r29 = 250;
        goto L75
    L62:
        if ((r25 & 8) == 0) goto L65;
        r28 = pa5.f;
        goto L72
    L65:
        if ((r24 & 519) == 0) goto L68;
        r28 = pa5.g;
        goto L72
    L68:
        if ((r25 & 519) == 0) goto L70;
        r28 = pa5.h;
        goto L72
    L70:
        r28 = null;
        goto L72
    L22:
        if (Objects.equals(r4.n, r3) == false) goto L28;
        if (r21.getTag(R.id.tag_on_apply_window_listener) != null) goto L77;
        return r21.onApplyWindowInsets(r22);
    }
}
