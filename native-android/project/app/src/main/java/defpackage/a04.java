package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import app.homemusic.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a04 implements wq4 {
    public final bh0 n;
    public final View o;

    public a04(View view) {
        this.o = view;
        this.n = new bh0(view);
    }

    @Override // defpackage.wq4
    public final void b(cf4 cf4Var) {
        this.n.b.remove(cf4Var);
    }

    @Override // defpackage.wq4
    public final void c(Object obj, cx4 cx4Var) {
    }

    @Override // defpackage.wq4
    public final void d(cf4 cf4Var) {
        bh0 bh0Var = this.n;
        ArrayList arrayList = bh0Var.b;
        View view = bh0Var.a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = bh0Var.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = bh0Var.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            cf4Var.m(iA, iA2);
            return;
        }
        if (!arrayList.contains(cf4Var)) {
            arrayList.add(cf4Var);
        }
        if (bh0Var.c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ah0 ah0Var = new ah0(bh0Var);
            bh0Var.c = ah0Var;
            viewTreeObserver.addOnPreDrawListener(ah0Var);
        }
    }

    @Override // defpackage.wq4
    public final void e(pz3 pz3Var) {
        this.o.setTag(R.id.glide_custom_view_target_tag, pz3Var);
    }

    @Override // defpackage.z92
    public final void h() {
    }

    @Override // defpackage.wq4
    public final void i(Drawable drawable) {
    }

    @Override // defpackage.z92
    public final void j() {
    }

    @Override // defpackage.wq4
    public final void k(Drawable drawable) {
    }

    @Override // defpackage.wq4
    public final pz3 l() {
        Object tag = this.o.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof pz3) {
                return (pz3) tag;
            }
            kf2.n("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // defpackage.wq4
    public final void m(Drawable drawable) {
        bh0 bh0Var = this.n;
        ViewTreeObserver viewTreeObserver = bh0Var.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(bh0Var.c);
        }
        bh0Var.c = null;
        bh0Var.b.clear();
    }

    @Override // defpackage.z92
    public final void n() {
    }

    public final String toString() {
        return "Target for: " + this.o;
    }
}
