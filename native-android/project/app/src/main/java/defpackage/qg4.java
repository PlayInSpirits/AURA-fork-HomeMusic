package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.homemusic.R;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qg4 extends fr {
    public static final int[] E = null;
    public final AccessibilityManager C;
    public boolean D;

    static {
        E = new int[]{R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    }

    public qg4(Context r1, ViewGroup r2, SnackbarContentLayout r3, SnackbarContentLayout r4) {
        super(r1, r2, r3, r4);
        this.C = (AccessibilityManager) r2.getContext().getSystemService("accessibility");
    }

    public static qg4 h(View r7, CharSequence r8, int r9) {
        ViewGroup r1 = null;
    L4:
        if ((r7 instanceof CoordinatorLayout) == true) goto L5;
        if ((r7 instanceof FrameLayout) == true) goto L9;
    L12:
        if (r7 == null) goto L17;
        Object r10 = r7.getParent();
        if ((r10 instanceof View) == false) goto L16;
        r7 = (View) r10;
        goto L17
    L16:
        r7 = null;
    L17:
        if (r7 != null) goto L4;
        ViewGroup r11 = r1;
    L19:
        if (r11 == null) goto L27;
        Context r0 = r11.getContext();
        LayoutInflater r2 = LayoutInflater.from(r0);
        TypedArray r3 = r0.obtainStyledAttributes(E);
        int r5 = r3.getResourceId(0, -1);
        int r6 = r3.getResourceId(1, -1);
        r3.recycle();
        if (r5 == (-1)) goto L24;
        if (r6 == (-1)) goto L24;
        int r4 = R.layout.mtrl_layout_snackbar_include;
    L25:
        SnackbarContentLayout r12 = (SnackbarContentLayout) r2.inflate(r4, r11, false);
        qg4 r13 = new qg4(r0, r11, r12, r12);
        ((SnackbarContentLayout) r13.i.getChildAt(0)).getMessageView().setText(r8);
        r13.k = r9;
        return r13;
    L24:
        r4 = R.layout.design_layout_snackbar_include;
        goto L25
    L27:
        kf2.n("No suitable parent found from the given view. Please provide a valid view.");
        return null;
    L9:
        if (r7.getId() == 16908290) goto L10;
        r1 = (ViewGroup) r7;
        goto L12
    L10:
        r11 = (ViewGroup) r7;
        goto L19
    L5:
        r11 = (ViewGroup) r7;
        goto L19
    }

    public final void i(int r4, View.OnClickListener r5) {
        CharSequence r6 = this.h.getText(r4);
        Button r0 = ((SnackbarContentLayout) this.i.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(r6) == true) goto L6;
        this.D = true;
        r0.setVisibility(0);
        r0.setText(r6);
        r0.setOnClickListener(new j8(23, this, r5));
        return;
    L6:
        r0.setVisibility(8);
        r0.setOnClickListener(null);
        this.D = false;
    }

    public final void j() {
        na4 r0 = na4.z();
        AccessibilityManager r1 = this.C;
        int r2 = this.k;
        boolean r3 = false;
        if (r2 != (-2)) goto L5;
    L4:
        r2 = -2;
    L15:
        br r9 = this.v;
        Object r4 = r0.n;
        monitor-enter(r4);
    L22:
        th = move-exception;
        throw th;
    L18:
        if (r0.G(r9) == false) goto L24;
        rg4 r10 = (rg4) r0.p;     // Catch: Throwable -> L22
        r10.b = r2;     // Catch: Throwable -> L22
        ((Handler) r0.o).removeCallbacksAndMessages(r10);     // Catch: Throwable -> L22
        r0.P((rg4) r0.p);     // Catch: Throwable -> L22
        monitor-exit(r4);     // Catch: Throwable -> L22
        return;
    L24:
        rg4 r5 = (rg4) r0.q;     // Catch: Throwable -> L22
        if (r5 != null) goto L27;
    L29:
        if (r3 == false) goto L31;
        ((rg4) r0.q).b = r2;     // Catch: Throwable -> L22
    L32:
        rg4 r11 = (rg4) r0.p;     // Catch: Throwable -> L22
        if (r11 != null) goto L35;
    L38:
        r0.p = null;     // Catch: Throwable -> L22
        r0.Q();     // Catch: Throwable -> L22
        monitor-exit(r4);     // Catch: Throwable -> L22
        return;
    L35:
        if (r0.j(r11, 4) == false) goto L38;
        monitor-exit(r4);     // Catch: Throwable -> L22
        return;
    L31:
        r0.q = new rg4(r2, r9);     // Catch: Throwable -> L22
        goto L32
    L27:
        if (r5.a.get() != r9) goto L29;
        r3 = true;
        goto L29
    L5:
        int r6 = Build.VERSION.SDK_INT;
        boolean r7 = this.D;
        if (r6 < 29) goto L11;
        if (r7 == false) goto L9;
        int r8 = 4;
    L10:
        r2 = ek2.d(r1, r2, r8 | 3);
        goto L15
    L9:
        r8 = 0;
        goto L10
    L11:
        if (r7 == false) goto L15;
        if (r1.isTouchExplorationEnabled() == false) goto L15;
        goto L15
    }
}
