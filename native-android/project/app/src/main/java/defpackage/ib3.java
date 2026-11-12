package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ib3 extends qz0 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib3(mw3 mw3Var, int i) {
        super(mw3Var);
        this.d = i;
    }

    @Override // defpackage.qz0
    public final int d(View view) {
        int iB;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                nw3 nw3Var = (nw3) view.getLayoutParams();
                ((mw3) obj).getClass();
                iB = mw3.B(view);
                i = ((ViewGroup.MarginLayoutParams) nw3Var).rightMargin;
                break;
            default:
                nw3 nw3Var2 = (nw3) view.getLayoutParams();
                ((mw3) obj).getClass();
                iB = mw3.y(view);
                i = ((ViewGroup.MarginLayoutParams) nw3Var2).bottomMargin;
                break;
        }
        return iB + i;
    }

    @Override // defpackage.qz0
    public final int e(View view) {
        int measuredWidth;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                nw3 nw3Var = (nw3) view.getLayoutParams();
                ((mw3) obj).getClass();
                Rect rect = ((nw3) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) nw3Var).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) nw3Var).rightMargin;
                break;
            default:
                nw3 nw3Var2 = (nw3) view.getLayoutParams();
                ((mw3) obj).getClass();
                Rect rect2 = ((nw3) view.getLayoutParams()).b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) nw3Var2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) nw3Var2).bottomMargin;
                break;
        }
        return measuredWidth + i;
    }

    @Override // defpackage.qz0
    public final int f(View view) {
        int measuredHeight;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                nw3 nw3Var = (nw3) view.getLayoutParams();
                ((mw3) obj).getClass();
                Rect rect = ((nw3) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) nw3Var).topMargin;
                i = ((ViewGroup.MarginLayoutParams) nw3Var).bottomMargin;
                break;
            default:
                nw3 nw3Var2 = (nw3) view.getLayoutParams();
                ((mw3) obj).getClass();
                Rect rect2 = ((nw3) view.getLayoutParams()).b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) nw3Var2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) nw3Var2).rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // defpackage.qz0
    public final int g(View view) {
        int iA;
        int i;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                nw3 nw3Var = (nw3) view.getLayoutParams();
                ((mw3) obj).getClass();
                iA = mw3.A(view);
                i = ((ViewGroup.MarginLayoutParams) nw3Var).leftMargin;
                break;
            default:
                nw3 nw3Var2 = (nw3) view.getLayoutParams();
                ((mw3) obj).getClass();
                iA = mw3.C(view);
                i = ((ViewGroup.MarginLayoutParams) nw3Var2).topMargin;
                break;
        }
        return iA - i;
    }

    @Override // defpackage.qz0
    public final int h() {
        switch (this.d) {
            case 0:
                return ((mw3) this.b).n;
            default:
                return ((mw3) this.b).o;
        }
    }

    @Override // defpackage.qz0
    public final int i() {
        int i;
        int iG;
        int i2 = this.d;
        Object obj = this.b;
        switch (i2) {
            case 0:
                mw3 mw3Var = (mw3) obj;
                i = mw3Var.n;
                iG = mw3Var.G();
                break;
            default:
                mw3 mw3Var2 = (mw3) obj;
                i = mw3Var2.o;
                iG = mw3Var2.E();
                break;
        }
        return i - iG;
    }

    @Override // defpackage.qz0
    public final int j() {
        switch (this.d) {
            case 0:
                return ((mw3) this.b).G();
            default:
                return ((mw3) this.b).E();
        }
    }

    @Override // defpackage.qz0
    public final int k() {
        switch (this.d) {
            case 0:
                return ((mw3) this.b).l;
            default:
                return ((mw3) this.b).m;
        }
    }

    @Override // defpackage.qz0
    public final int l() {
        switch (this.d) {
            case 0:
                return ((mw3) this.b).m;
            default:
                return ((mw3) this.b).l;
        }
    }

    @Override // defpackage.qz0
    public final int m() {
        switch (this.d) {
            case 0:
                return ((mw3) this.b).F();
            default:
                return ((mw3) this.b).H();
        }
    }

    @Override // defpackage.qz0
    public final int n() {
        int iF;
        int iG;
        int i = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                mw3 mw3Var = (mw3) obj;
                iF = mw3Var.n - mw3Var.F();
                iG = mw3Var.G();
                break;
            default:
                mw3 mw3Var2 = (mw3) obj;
                iF = mw3Var2.o - mw3Var2.H();
                iG = mw3Var2.E();
                break;
        }
        return iF - iG;
    }

    @Override // defpackage.qz0
    public final int o(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((mw3) obj2).L(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) obj;
                ((mw3) obj2).L(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // defpackage.qz0
    public final int p(View view) {
        int i = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                ((mw3) obj2).L(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) obj;
                ((mw3) obj2).L(view, rect2);
                return rect2.top;
        }
    }

    @Override // defpackage.qz0
    public final void q(int i) {
        switch (this.d) {
            case 0:
                ((mw3) this.b).Q(i);
                break;
            default:
                ((mw3) this.b).R(i);
                break;
        }
    }
}
