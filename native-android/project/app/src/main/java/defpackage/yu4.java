package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yu4 implements gv2 {
    public qu2 n;
    public tu2 o;
    public final /* synthetic */ Toolbar p;

    public yu4(Toolbar r1) {
        this.p = r1;
    }

    @Override // defpackage.gv2
    public final void a(qu2 r1, boolean r2) {
    }

    @Override // defpackage.gv2
    public final void c(boolean r4) {
        if (this.o == null) goto L16;
        qu2 r5 = this.n;
        if (r5 == null) goto L12;
        int r6 = r5.f.size();
        int r0 = 0;
    L7:
        if (r0 >= r6) goto L12;
        if (this.n.getItem(r0) == this.o) goto L17;
        r0 = r0 + 1;
        goto L7
    L17:
        return;
    L12:
        g(this.o);
        return;
    }

    @Override // defpackage.gv2
    public final boolean d(en4 r1) {
        return false;
    }

    @Override // defpackage.gv2
    public final boolean e() {
        return false;
    }

    @Override // defpackage.gv2
    public final boolean g(tu2 r7) {
        Toolbar r0 = this.p;
        KeyEvent.Callback r1 = r0.v;
        if ((r1 instanceof j40) == false) goto L5;
        ((j40) r1).onActionViewCollapsed();
    L5:
        r0.removeView(r0.v);
        r0.removeView(r0.u);
        r0.v = null;
        ArrayList r2 = r0.R;
        int r3 = r2.size() - 1;
    L6:
        if (r3 < 0) goto L8;
        r0.addView((View) r2.get(r3));
        r3 = r3 - 1;
        goto L6
    L8:
        r2.clear();
        this.o = null;
        r0.requestLayout();
        r7.C = false;
        r7.n.p(false);
        r0.w();
        return true;
    }

    @Override // defpackage.gv2
    public final int getId() {
        return 0;
    }

    @Override // defpackage.gv2
    public final void h(Parcelable r1) {
    }

    @Override // defpackage.gv2
    public final boolean j(tu2 r6) {
        Toolbar r0 = this.p;
        r0.c();
        ViewParent r1 = r0.u.getParent();
        if (r1 != r0) goto L5;
    L8:
        View r2 = r6.getActionView();
        r0.v = r2;
        this.o = r6;
        ViewParent r5 = r2.getParent();
        if (r5 != r0) goto L11;
    L14:
        int r7 = r0.getChildCount() - 1;
    L15:
        if (r7 < 0) goto L22;
        View r3 = r0.getChildAt(r7);
        if (((zu4) r3.getLayoutParams()).b == 2) goto L21;
        if (r3 == r0.n) goto L21;
        r0.removeViewAt(r7);
        r0.R.add(r3);
    L21:
        r7 = r7 - 1;
        goto L15
    L22:
        r0.requestLayout();
        r6.C = true;
        r6.n.p(false);
        KeyEvent.Callback r8 = r0.v;
        if ((r8 instanceof j40) == false) goto L25;
        ((j40) r8).onActionViewExpanded();
    L25:
        r0.w();
        return true;
    L11:
        if ((r5 instanceof ViewGroup) == false) goto L13;
        ((ViewGroup) r5).removeView(r0.v);
    L13:
        zu4 r9 = Toolbar.h();
        r9.a = (r0.A & 112) | 8388611;
        r9.b = 2;
        r0.v.setLayoutParams(r9);
        r0.addView(r0.v);
        goto L14
    L5:
        if ((r1 instanceof ViewGroup) == false) goto L7;
        ((ViewGroup) r1).removeView(r0.u);
    L7:
        r0.addView(r0.u);
        goto L8
    }

    @Override // defpackage.gv2
    public final void l(Context r2, qu2 r3) {
        qu2 r4 = this.n;
        if (r4 == null) goto L7;
        tu2 r0 = this.o;
        if (r0 == null) goto L7;
        r4.d(r0);
    L7:
        this.n = r3;
    }

    @Override // defpackage.gv2
    public final Parcelable m() {
        return null;
    }
}
