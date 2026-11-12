package defpackage;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.homemusic.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yt extends dg {
    public xt A;
    public boolean B;
    public qp4 C;
    public wt D;
    public BottomSheetBehavior t;
    public FrameLayout u;
    public CoordinatorLayout v;
    public FrameLayout w;
    public boolean x;
    public boolean y;
    public boolean z;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.t != null) goto L5;
        i();
    L5:
        super.cancel();
    }

    public final void i() {
        if (this.u != null) goto L6;
        FrameLayout r0 = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
        this.u = r0;
        this.v = (CoordinatorLayout) r0.findViewById(R.id.coordinator);
        FrameLayout r1 = (FrameLayout) this.u.findViewById(R.id.design_bottom_sheet);
        this.w = r1;
        BottomSheetBehavior r2 = BottomSheetBehavior.C(r1);
        this.t = r2;
        r2.w(this.D);
        this.t.H(this.x);
        this.C = new qp4(this.t, this.w);
        return;
    }

    public final FrameLayout j(View r4, int r5, ViewGroup.LayoutParams r6) {
        i();
        CoordinatorLayout r0 = (CoordinatorLayout) this.u.findViewById(R.id.coordinator);
        if (r5 == 0) goto L7;
        if (r4 != null) goto L7;
        r4 = getLayoutInflater().inflate(r5, r0, false);
    L7:
        if (this.B == false) goto L9;
        FrameLayout r7 = this.w;
        d34 r1 = new d34(11, this);
        WeakHashMap r2 = j65.a;
        a65.c(r7, r1);
    L9:
        this.w.removeAllViews();
        FrameLayout r8 = this.w;
        if (r6 != null) goto L12;
        r8.addView(r4);
    L13:
        r0.findViewById(R.id.touch_outside).setOnClickListener(new i4(3, this));
        j65.o(this.w, new ar(1, this));
        this.w.setOnTouchListener(new dr(1));
        return this.u;
    L12:
        r8.addView(r4, r6);
        goto L13
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window r0 = getWindow();
        if (r0 != null) goto L5;
    L19:
        qp4 r1 = this.C;
        if (r1 == null) goto L32;
        View r2 = (View) r1.c;
        boolean r6 = this.x;
        ah2 r3 = (ah2) r1.a;
        if (r6 == false) goto L27;
        if (r3 == null) goto L30;
        r3.b((zg2) r1.b, r2, false);
        return;
    L30:
        return;
    L27:
        if (r3 == null) goto L31;
        r3.c(r2);
        return;
    L31:
        return;
    L32:
        return;
    L5:
        if (this.B == true) goto L7;
    L9:
        boolean r4 = false;
    L10:
        FrameLayout r5 = this.u;
        if (r5 == null) goto L13;
        r5.setFitsSystemWindows(!r4);
    L13:
        CoordinatorLayout r7 = this.v;
        if (r7 == null) goto L16;
        r7.setFitsSystemWindows(!r4);
    L16:
        l93.d0(r0, !r4);
        xt r8 = this.A;
        if (r8 == null) goto L19;
        r8.e(r0);
        goto L19
    L7:
        if (Color.alpha(r0.getNavigationBarColor()) >= 255) goto L9;
        r4 = true;
        goto L10
    }

    @Override // defpackage.dg, defpackage.n70, android.app.Dialog
    public final void onCreate(Bundle r1) {
        super.onCreate(r1);
        Window r0 = getWindow();
        if (r0 == null) goto L6;
        r0.setStatusBarColor(0);
        r0.addFlags(Integer.MIN_VALUE);
        r0.setLayout(-1, -1);
        return;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        xt r0 = this.A;
        if (r0 == null) goto L5;
        r0.e(null);
    L5:
        qp4 r2 = this.C;
        if (r2 == null) goto L11;
        ah2 r1 = (ah2) r2.a;
        if (r1 == null) goto L12;
        r1.c((View) r2.c);
        return;
    L12:
        return;
    }

    @Override // defpackage.n70, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior r2 = this.t;
        if (r2 != null) goto L5;
        return;
    L5:
        if (r2.Y != 5) goto L9;
        r2.J(4);
        return;
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean r3) {
        super.setCancelable(r3);
        if (this.x == r3) goto L20;
        this.x = r3;
        BottomSheetBehavior r0 = this.t;
        if (r0 == null) goto L8;
        r0.H(r3);
    L8:
        if (getWindow() == null) goto L21;
        qp4 r4 = this.C;
        if (r4 == null) goto L24;
        View r1 = (View) r4.c;
        boolean r2 = this.x;
        ah2 r5 = (ah2) r4.a;
        if (r2 == false) goto L17;
        if (r5 == null) goto L22;
        r5.b((zg2) r4.b, r1, false);
        return;
    L22:
        return;
    L17:
        if (r5 == null) goto L23;
        r5.c(r1);
        return;
    L23:
        return;
    L24:
        return;
    L21:
        return;
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean r3) {
        super.setCanceledOnTouchOutside(r3);
        if (r3 == true) goto L5;
    L7:
        this.y = r3;
        this.z = true;
        return;
    L5:
        if (this.x == true) goto L7;
        this.x = true;
        goto L7
    }

    @Override // defpackage.dg, defpackage.n70, android.app.Dialog
    public final void setContentView(View r3) {
        super.setContentView(j(r3, 0, null));
    }

    @Override // defpackage.dg, defpackage.n70, android.app.Dialog
    public final void setContentView(int r2) {
        super.setContentView(j(null, r2, null));
    }

    @Override // defpackage.dg, defpackage.n70, android.app.Dialog
    public final void setContentView(View r2, ViewGroup.LayoutParams r3) {
        super.setContentView(j(r2, 0, r3));
    }
}
