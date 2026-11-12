package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yg extends bc2 implements ah {
    public CharSequence P;
    public vg Q;
    public final Rect R;
    public int S;
    public final /* synthetic */ bh T;

    public yg(bh r3, Context r4, AttributeSet r5) {
        this.T = r3;
        super(r4, r5, R.attr.spinnerStyle, 0);
        this.R = new Rect();
        this.B = r3;
        this.L = true;
        this.M.setFocusable(true);
        this.C = new wg(0, this);
    }

    @Override // defpackage.ah
    public final CharSequence e() {
        return this.P;
    }

    @Override // defpackage.ah
    public final void h(CharSequence r1) {
        this.P = r1;
    }

    @Override // defpackage.ah
    public final void m(int r1) {
        this.S = r1;
    }

    @Override // defpackage.ah
    public final void n(int r6, int r7) {
        lg r0 = this.M;
        boolean r1 = r0.isShowing();
        s();
        r0.setInputMethodMode(2);
        f();
        cx0 r2 = this.p;
        int r3 = 1;
        r2.setChoiceMode(1);
        r2.setTextDirection(r6);
        r2.setTextAlignment(r7);
        bh r8 = this.T;
        int r9 = r8.getSelectedItemPosition();
        cx0 r4 = this.p;
        if (r0.isShowing() == false) goto L8;
        if (r4 == null) goto L8;
        r4.setListSelectionHidden(false);
        r4.setSelection(r9);
        if (r4.getChoiceMode() == 0) goto L8;
        r4.setItemChecked(r9, true);
    L8:
        if (r1 == true) goto L15;
        ViewTreeObserver r10 = r8.getViewTreeObserver();
        if (r10 == null) goto L14;
        sg r11 = new sg(r3, this);
        r10.addOnGlobalLayoutListener(r11);
        r0.setOnDismissListener(new xg(this, r11));
        return;
    L14:
        return;
    }

    @Override // defpackage.bc2, defpackage.ah
    public final void p(ListAdapter r1) {
        super.p(r1);
        this.Q = (vg) r1;
    }

    public final void s() {
        lg r0 = this.M;
        Drawable r1 = r0.getBackground();
        bh r2 = this.T;
        Rect r3 = r2.u;
        if (r1 == null) goto L8;
        r1.getPadding(r3);
        boolean r4 = e85.a;
        if (r2.getLayoutDirection() != 1) goto L7;
        int r5 = r3.right;
    L9:
        int r6 = r2.getPaddingLeft();
        int r7 = r2.getPaddingRight();
        int r8 = r2.getWidth();
        int r9 = r2.t;
        if (r9 != (-2)) goto L16;
        int r10 = r2.a(this.Q, r0.getBackground());
        int r11 = (r2.getContext().getResources().getDisplayMetrics().widthPixels - r3.left) - r3.right;
        if (r10 <= r11) goto L14;
        r10 = r11;
    L14:
        r(Math.max(r10, (r8 - r6) - r7));
    L19:
        boolean r12 = e85.a;
        if (r2.getLayoutDirection() != 1) goto L22;
        int r13 = (((r8 - r7) - this.r) - this.S) + r5;
    L23:
        this.s = r13;
        return;
    L22:
        r13 = (r6 + this.S) + r5;
        goto L23
    L16:
        if (r9 != (-1)) goto L18;
        r((r8 - r6) - r7);
        goto L19
    L18:
        r(r9);
        goto L19
    L7:
        r5 = -r3.left;
        goto L9
    L8:
        r5 = 0;
        r3.right = 0;
        r3.left = 0;
        goto L9
    }
}
