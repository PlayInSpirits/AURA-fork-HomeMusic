package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import app.homemusic.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rf implements r83, fv2 {
    public final /* synthetic */ bg n;

    public /* synthetic */ rf(bg r1) {
        this.n = r1;
    }

    @Override // defpackage.fv2
    public void a(qu2 r9, boolean r10) {
        qu2 r0 = r9.k();
        int r1 = 0;
        if (r0 == r9) goto L5;
        boolean r3 = true;
    L6:
        if (r3 == false) goto L8;
        r9 = r0;
    L8:
        bg r8 = this.n;
        ag[] r4 = r8.Y;
        if (r4 == null) goto L11;
        int r5 = r4.length;
    L12:
        if (r1 >= r5) goto L19;
        ag r6 = r4[r1];
        if (r6 == null) goto L18;
        if (r6.h != r9) goto L18;
    L20:
        if (r6 == null) goto L31;
        if (r3 == false) goto L24;
        r8.u(r6.a, r6, r0);
        r8.w(r6, true);
        return;
    L24:
        r8.w(r6, r10);
        return;
    L31:
        return;
    L18:
        r1 = r1 + 1;
        goto L12
    L19:
        r6 = null;
        goto L20
    L11:
        r5 = 0;
        goto L12
    L5:
        r3 = false;
        goto L6
    }

    @Override // defpackage.fv2
    public boolean w(qu2 r2) {
        if (r2 != r2.k()) goto L13;
        bg r1 = this.n;
        if (r1.S == false) goto L14;
        Window.Callback r0 = r1.y.getCallback();
        if (r0 != null) goto L9;
        return true;
    L9:
        if (r1.d0 == true) goto L16;
        r0.onMenuOpened(108, r2);
        return true;
    L16:
        return true;
    L14:
        return true;
    L13:
        return true;
    }

    @Override // defpackage.r83
    public pb5 x(View r17, pb5 r18) {
        int r3 = r18.d();
        bg r4 = this.n;
        Context r5 = r4.x;
        int r6 = r18.d();
        ActionBarContextView r0 = r4.H;
        if (r0 != null) goto L5;
    L80:
        int r7 = 0;
        int r8 = 8;
        boolean r1 = false;
    L81:
        View r9 = r4.P;
        if (r9 == null) goto L86;
        if (r1 == false) goto L85;
        r8 = r7;
    L85:
        r9.setVisibility(r8);
    L86:
        if (r3 == r6) goto L107;
        int r2 = r18.b();
        int r10 = r18.c();
        int r11 = r18.a();
        int r12 = Build.VERSION.SDK_INT;
        if (r12 < 36) goto L91;
        bb5 r13 = new ab5(r18);
    L106:
        r13.h(vz1.b(r2, r6, r10, r11));
        pb5 r14 = r13.b();
    L108:
        WeakHashMap r15 = j65.a;
        WindowInsets r16 = r14.f();
        if (r16 == null) goto L118;
        WindowInsets r19 = r17.onApplyWindowInsets(r16);
        if (r19.equals(r16) == false) goto L113;
        return r14;
    L113:
        return pb5.g(r19, r17);
    L118:
        return r14;
    L91:
        if (r12 < 35) goto L94;
        r13 = new za5(r18);
        goto L106
    L94:
        if (r12 < 34) goto L97;
        r13 = new ya5(r18);
        goto L106
    L97:
        if (r12 < 31) goto L100;
        r13 = new xa5(r18);
        goto L106
    L100:
        if (r12 < 30) goto L103;
        r13 = new wa5(r18);
        goto L106
    L103:
        if (r12 < 29) goto L105;
        r13 = new va5(r18);
        goto L106
    L105:
        r13 = new ua5(r18);
        goto L106
    L107:
        r14 = r18;
        goto L108
    L5:
        if ((r0.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) == false) goto L80;
        ViewGroup.MarginLayoutParams r110 = (ViewGroup.MarginLayoutParams) r4.H.getLayoutParams();
        boolean r111 = true;
        if (r4.H.isShown() == true) goto L9;
        r8 = 8;
        r7 = 0;
        if (r110.topMargin == 0) goto L77;
        r110.topMargin = 0;
        r1 = false;
    L78:
        if (r111 == false) goto L81;
        r4.H.setLayoutParams(r110);
        goto L81
    L77:
        r1 = false;
        r111 = false;
        goto L78
    L9:
        if (r4.p0 != null) goto L11;
        r4.p0 = new Rect();
        r4.q0 = new Rect();
    L11:
        Rect r112 = r4.p0;
        Rect r20 = r4.q0;
        r112.set(r18.b(), r18.d(), r18.c(), r18.a());
        ViewGroup r21 = r4.N;
        if (Build.VERSION.SDK_INT < 29) goto L15;
        boolean r113 = e85.a;
        a85.a(r21, r112, r20);
    L28:
        int r22 = r112.top;
        int r23 = r112.left;
        int r24 = r112.right;
        ViewGroup r25 = r4.N;
        WeakHashMap r114 = j65.a;
        pb5 r26 = b65.a(r25);
        if (r26 != null) goto L31;
        int r115 = 0;
    L32:
        if (r26 != null) goto L34;
        int r27 = 0;
    L36:
        if (r110.topMargin == r22) goto L38;
    L43:
        r110.topMargin = r22;
        r110.leftMargin = r23;
        r110.rightMargin = r24;
        boolean r28 = true;
    L44:
        if (r22 > 0) goto L46;
    L48:
        r8 = 8;
        View r29 = r4.P;
        if (r29 == null) goto L57;
        ViewGroup.MarginLayoutParams r30 = (ViewGroup.MarginLayoutParams) r29.getLayoutParams();
        int r116 = r30.height;
        int r117 = r110.topMargin;
        if (r116 == r117) goto L53;
    L56:
        r30.height = r117;
        r30.leftMargin = r115;
        r30.rightMargin = r27;
        r4.P.setLayoutParams(r30);
        goto L57
    L53:
        if (r30.leftMargin != r115) goto L56;
        if (r30.rightMargin != r27) goto L56;
    L57:
        View r31 = r4.P;
        if (r31 != null) goto L61;
        r111 = false;
    L61:
        if (r111 == false) goto L70;
        if (r31.getVisibility() == 0) goto L70;
        View r32 = r4.P;
        if ((r32.getWindowSystemUiVisibility() & 8192) == 0) goto L67;
        int r33 = r5.getColor(R.color.abc_decor_view_status_guard_light);
    L68:
        r32.setBackgroundColor(r33);
        goto L70
    L67:
        r33 = r5.getColor(R.color.abc_decor_view_status_guard);
    L70:
        if (r4.U == true) goto L73;
        if (r111 == false) goto L73;
        r6 = 0;
    L73:
        r7 = 0;
        r1 = r111;
        r111 = r28;
        goto L78
    L46:
        if (r4.P != null) goto L48;
        View r34 = new View(r5);
        r4.P = r34;
        r8 = 8;
        r34.setVisibility(8);
        FrameLayout.LayoutParams r35 = new FrameLayout.LayoutParams(-1, r110.topMargin, 51);
        r35.leftMargin = r115;
        r35.rightMargin = r27;
        r4.N.addView(r4.P, -1, r35);
        goto L57
    L38:
        if (r110.leftMargin != r23) goto L43;
        if (r110.rightMargin != r24) goto L43;
        r28 = false;
        goto L44
    L34:
        r27 = r26.c();
        goto L36
    L31:
        r115 = r26.b();
        goto L32
    L15:
        if (e85.a == true) goto L22;
        e85.a = true;
        Method r36 = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});     // Catch: NoSuchMethodException -> L21
        e85.b = r36;     // Catch: NoSuchMethodException -> L21
        if (r36.isAccessible() == true) goto L22;
        e85.b.setAccessible(true);     // Catch: NoSuchMethodException -> L21
    L21:
        Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
    L22:
        Method r37 = e85.b;
        if (r37 == null) goto L28;
        r37.invoke(r21, new Object[]{r112, r20});     // Catch: Exception -> L26
    L26:
        e = move-exception;
        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
        goto L28
    }
}
