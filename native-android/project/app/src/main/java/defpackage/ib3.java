package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ib3 extends qz0 {
    public final /* synthetic */ int d;

    public /* synthetic */ ib3(mw3 r1, int r2) {
        this.d = r2;
        super(r1);
    }

    @Override // defpackage.qz0
    public final int d(View r2) {
        int r0 = this.d;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        nw3 r3 = (nw3) r2.getLayoutParams();
        ((mw3) r1).getClass();
        int r4 = mw3.y(r2);
        int r5 = ((ViewGroup.MarginLayoutParams) r3).bottomMargin;
    L6:
        return r4 + r5;
    L7:
        nw3 r6 = (nw3) r2.getLayoutParams();
        ((mw3) r1).getClass();
        r4 = mw3.B(r2);
        r5 = ((ViewGroup.MarginLayoutParams) r6).rightMargin;
        goto L6
    }

    @Override // defpackage.qz0
    public final int e(View r3) {
        int r0 = this.d;
        Object r2 = this.b;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        nw3 r1 = (nw3) r3.getLayoutParams();
        ((mw3) r2).getClass();
        Rect r4 = ((nw3) r3.getLayoutParams()).b;
        int r5 = ((r3.getMeasuredHeight() + r4.top) + r4.bottom) + ((ViewGroup.MarginLayoutParams) r1).topMargin;
        int r6 = ((ViewGroup.MarginLayoutParams) r1).bottomMargin;
    L6:
        return r5 + r6;
    L7:
        nw3 r7 = (nw3) r3.getLayoutParams();
        ((mw3) r2).getClass();
        Rect r8 = ((nw3) r3.getLayoutParams()).b;
        r5 = ((r3.getMeasuredWidth() + r8.left) + r8.right) + ((ViewGroup.MarginLayoutParams) r7).leftMargin;
        r6 = ((ViewGroup.MarginLayoutParams) r7).rightMargin;
        goto L6
    }

    @Override // defpackage.qz0
    public final int f(View r3) {
        int r0 = this.d;
        Object r2 = this.b;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        nw3 r1 = (nw3) r3.getLayoutParams();
        ((mw3) r2).getClass();
        Rect r4 = ((nw3) r3.getLayoutParams()).b;
        int r5 = ((r3.getMeasuredWidth() + r4.left) + r4.right) + ((ViewGroup.MarginLayoutParams) r1).leftMargin;
        int r6 = ((ViewGroup.MarginLayoutParams) r1).rightMargin;
    L6:
        return r5 + r6;
    L7:
        nw3 r7 = (nw3) r3.getLayoutParams();
        ((mw3) r2).getClass();
        Rect r8 = ((nw3) r3.getLayoutParams()).b;
        r5 = ((r3.getMeasuredHeight() + r8.top) + r8.bottom) + ((ViewGroup.MarginLayoutParams) r7).topMargin;
        r6 = ((ViewGroup.MarginLayoutParams) r7).bottomMargin;
        goto L6
    }

    @Override // defpackage.qz0
    public final int g(View r2) {
        int r0 = this.d;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        nw3 r3 = (nw3) r2.getLayoutParams();
        ((mw3) r1).getClass();
        int r4 = mw3.C(r2);
        int r5 = ((ViewGroup.MarginLayoutParams) r3).topMargin;
    L6:
        return r4 - r5;
    L7:
        nw3 r6 = (nw3) r2.getLayoutParams();
        ((mw3) r1).getClass();
        r4 = mw3.A(r2);
        r5 = ((ViewGroup.MarginLayoutParams) r6).leftMargin;
        goto L6
    }

    @Override // defpackage.qz0
    public final int h() {
        switch(this.d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((mw3) this.b).o;
    L7:
        return ((mw3) this.b).n;
    }

    @Override // defpackage.qz0
    public final int i() {
        int r0 = this.d;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        mw3 r2 = (mw3) r1;
        int r3 = r2.o;
        int r4 = r2.E();
    L6:
        return r3 - r4;
    L7:
        mw3 r5 = (mw3) r1;
        r3 = r5.n;
        r4 = r5.G();
        goto L6
    }

    @Override // defpackage.qz0
    public final int j() {
        switch(this.d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((mw3) this.b).E();
    L7:
        return ((mw3) this.b).G();
    }

    @Override // defpackage.qz0
    public final int k() {
        switch(this.d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((mw3) this.b).m;
    L7:
        return ((mw3) this.b).l;
    }

    @Override // defpackage.qz0
    public final int l() {
        switch(this.d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((mw3) this.b).l;
    L7:
        return ((mw3) this.b).m;
    }

    @Override // defpackage.qz0
    public final int m() {
        switch(this.d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((mw3) this.b).H();
    L7:
        return ((mw3) this.b).F();
    }

    @Override // defpackage.qz0
    public final int n() {
        int r0 = this.d;
        Object r2 = this.b;
        switch(r0) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        mw3 r3 = (mw3) r2;
        int r1 = r3.o - r3.H();
        int r4 = r3.E();
    L6:
        return r1 - r4;
    L7:
        mw3 r5 = (mw3) r2;
        r1 = r5.n - r5.F();
        r4 = r5.G();
        goto L6
    }

    @Override // defpackage.qz0
    public final int o(View r3) {
        int r0 = this.d;
        Object r1 = this.c;
        Object r2 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        Rect r4 = (Rect) r1;
        ((mw3) r2).L(r3, r4);
        return r4.bottom;
    L6:
        Rect r5 = (Rect) r1;
        ((mw3) r2).L(r3, r5);
        return r5.right;
    }

    @Override // defpackage.qz0
    public final int p(View r3) {
        int r0 = this.d;
        Object r1 = this.c;
        Object r2 = this.b;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        Rect r4 = (Rect) r1;
        ((mw3) r2).L(r3, r4);
        return r4.top;
    L6:
        Rect r5 = (Rect) r1;
        ((mw3) r2).L(r3, r5);
        return r5.left;
    }

    @Override // defpackage.qz0
    public final void q(int r2) {
        switch(this.d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((mw3) this.b).R(r2);
        return;
    L6:
        ((mw3) this.b).Q(r2);
    }
}
