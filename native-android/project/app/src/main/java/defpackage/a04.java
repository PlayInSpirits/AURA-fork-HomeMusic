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

    public a04(View r2) {
        this.o = r2;
        this.n = new bh0(r2);
    }

    @Override // defpackage.wq4
    public final void b(cf4 r1) {
        this.n.b.remove(r1);
    }

    @Override // defpackage.wq4
    public final void c(Object r1, cx4 r2) {
    }

    @Override // defpackage.wq4
    public final void d(cf4 r7) {
        bh0 r6 = this.n;
        ArrayList r0 = r6.b;
        View r1 = r6.a;
        int r3 = r1.getPaddingRight() + r1.getPaddingLeft();
        ViewGroup.LayoutParams r2 = r1.getLayoutParams();
        int r4 = 0;
        if (r2 == null) goto L5;
        int r5 = r2.width;
    L6:
        int r8 = r6.a(r1.getWidth(), r5, r3);
        int r9 = r1.getPaddingBottom() + r1.getPaddingTop();
        ViewGroup.LayoutParams r10 = r1.getLayoutParams();
        if (r10 == null) goto L9;
        r4 = r10.height;
    L9:
        int r11 = r6.a(r1.getHeight(), r4, r9);
        if (r8 > 0) goto L12;
        if (r8 == Integer.MIN_VALUE) goto L12;
    L16:
        if (r0.contains(r7) == true) goto L19;
        r0.add(r7);
    L19:
        if (r6.c != null) goto L24;
        ViewTreeObserver r12 = r1.getViewTreeObserver();
        ah0 r13 = new ah0(r6);
        r6.c = r13;
        r12.addOnPreDrawListener(r13);
        return;
    L24:
        return;
    L12:
        if (r11 > 0) goto L22;
        if (r11 != Integer.MIN_VALUE) goto L16;
    L22:
        r7.m(r8, r11);
        return;
    L5:
        r5 = 0;
        goto L6
    }

    @Override // defpackage.wq4
    public final void e(pz3 r2) {
        this.o.setTag(R.id.glide_custom_view_target_tag, r2);
    }

    @Override // defpackage.z92
    public final void h() {
    }

    @Override // defpackage.wq4
    public final void i(Drawable r1) {
    }

    @Override // defpackage.z92
    public final void j() {
    }

    @Override // defpackage.wq4
    public final void k(Drawable r1) {
    }

    @Override // defpackage.wq4
    public final pz3 l() {
        Object r2 = this.o.getTag(R.id.glide_custom_view_target_tag);
        if (r2 != null) goto L5;
    L9:
        return null;
    L5:
        if ((r2 instanceof pz3) == true) goto L7;
        kf2.n("You must not pass non-R.id ids to setTag(id)");
        goto L9
    L7:
        return (pz3) r2;
    }

    @Override // defpackage.wq4
    public final void m(Drawable r2) {
        bh0 r1 = this.n;
        ViewTreeObserver r3 = r1.a.getViewTreeObserver();
        if (r3.isAlive() == false) goto L5;
        r3.removeOnPreDrawListener(r1.c);
    L5:
        r1.c = null;
        r1.b.clear();
    }

    @Override // defpackage.z92
    public final void n() {
    }

    public final String toString() {
        return "Target for: " + this.o;
    }
}
