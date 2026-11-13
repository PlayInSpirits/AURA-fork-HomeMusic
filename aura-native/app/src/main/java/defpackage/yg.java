package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import app.homemusic.R;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class yg extends bc2 implements ah {
    public CharSequence P;
    public vg Q;
    public final Rect R;
    public int S;
    public final /* synthetic */ bh T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(bh bhVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, app.homemusic.R.attr.spinnerStyle, 0);
        this.T = bhVar;
        this.R = new Rect();
        this.B = bhVar;
        this.L = true;
        this.M.setFocusable(true);
        this.C = new wg(0, this);
    }

    @Override // defpackage.ah
    public final CharSequence e() {
        return this.P;
    }

    @Override // defpackage.ah
    public final void h(CharSequence charSequence) {
        this.P = charSequence;
    }

    @Override // defpackage.ah
    public final void m(int i) {
        this.S = i;
    }

    @Override // defpackage.ah
    public final void n(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        lg lgVar = this.M;
        boolean isShowing = lgVar.isShowing();
        s();
        lgVar.setInputMethodMode(2);
        f();
        cx0 cx0Var = this.p;
        int i3 = 1;
        cx0Var.setChoiceMode(1);
        cx0Var.setTextDirection(i);
        cx0Var.setTextAlignment(i2);
        bh bhVar = this.T;
        int selectedItemPosition = bhVar.getSelectedItemPosition();
        cx0 cx0Var2 = this.p;
        if (lgVar.isShowing() && cx0Var2 != null) {
            cx0Var2.setListSelectionHidden(false);
            cx0Var2.setSelection(selectedItemPosition);
            if (cx0Var2.getChoiceMode() != 0) {
                cx0Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = bhVar.getViewTreeObserver()) == null) {
            return;
        }
        sg sgVar = new sg(i3, this);
        viewTreeObserver.addOnGlobalLayoutListener(sgVar);
        lgVar.setOnDismissListener(new xg(this, sgVar));
    }

    @Override // defpackage.bc2, defpackage.ah
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.Q = (vg) listAdapter;
    }

    public final void s() {
        int i;
        lg lgVar = this.M;
        Drawable background = lgVar.getBackground();
        bh bhVar = this.T;
        Rect rect = bhVar.u;
        if (background != null) {
            background.getPadding(rect);
            boolean z = e85.a;
            i = bhVar.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = bhVar.getPaddingLeft();
        int paddingRight = bhVar.getPaddingRight();
        int width = bhVar.getWidth();
        int i2 = bhVar.t;
        if (i2 == -2) {
            int a = bhVar.a(this.Q, lgVar.getBackground());
            int i3 = (bhVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i3) {
                a = i3;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = e85.a;
        this.s = bhVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.r) - this.S) + i : paddingLeft + this.S + i;
    }
}
