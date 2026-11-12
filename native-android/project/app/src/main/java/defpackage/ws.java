package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import app.homemusic.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ws implements wq4 {
    public final ImageView n;
    public final x75 o;
    public Animatable p;
    public final /* synthetic */ int q;

    public ws(ImageView r1, int r2) {
        this.q = r2;
        h12.f(r1, "Argument must not be null");
        this.n = r1;
        this.o = new x75(r1);
    }

    public final void a(Object r2) {
        switch(this.q) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ImageView r1 = this.n;
        r1.setImageDrawable((Drawable) r2);
        return;
    L6:
        ImageView r3 = this.n;
        r3.setImageBitmap((Bitmap) r2);
    }

    @Override // defpackage.wq4
    public final void b(cf4 r1) {
        this.o.b.remove(r1);
    }

    @Override // defpackage.wq4
    public final void c(Object r2, cx4 r3) {
        if (r3 != null) goto L5;
    L13:
        a(r2);
        if ((r2 instanceof Animatable) == false) goto L17;
        Animatable r4 = (Animatable) r2;
        this.p = r4;
        r4.start();
        return;
    L17:
        this.p = null;
        return;
    L5:
        if (r3.l(r2, this) == false) goto L13;
        if ((r2 instanceof Animatable) == false) goto L11;
        Animatable r5 = (Animatable) r2;
        this.p = r5;
        r5.start();
        return;
    L11:
        this.p = null;
    }

    @Override // defpackage.wq4
    public final void d(cf4 r7) {
        x75 r6 = this.o;
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
        this.n.setTag(R.id.glide_custom_view_target_tag, r2);
    }

    @Override // defpackage.z92
    public final void h() {
    }

    @Override // defpackage.wq4
    public final void i(Drawable r2) {
        a(null);
        this.p = null;
        this.n.setImageDrawable(r2);
    }

    @Override // defpackage.z92
    public final void j() {
        Animatable r0 = this.p;
        if (r0 == null) goto L6;
        r0.stop();
        return;
    }

    @Override // defpackage.wq4
    public final void k(Drawable r2) {
        a(null);
        this.p = null;
        this.n.setImageDrawable(r2);
    }

    @Override // defpackage.wq4
    public final pz3 l() {
        Object r2 = this.n.getTag(R.id.glide_custom_view_target_tag);
        if (r2 != null) goto L5;
    L9:
        return null;
    L5:
        if ((r2 instanceof pz3) == true) goto L7;
        kf2.n("You must not call setTag() on a view Glide is targeting");
        goto L9
    L7:
        return (pz3) r2;
    }

    @Override // defpackage.wq4
    public final void m(Drawable r4) {
        x75 r0 = this.o;
        ViewTreeObserver r1 = r0.a.getViewTreeObserver();
        if (r1.isAlive() == false) goto L5;
        r1.removeOnPreDrawListener(r0.c);
    L5:
        r0.c = null;
        r0.b.clear();
        Animatable r2 = this.p;
        if (r2 == null) goto L8;
        r2.stop();
    L8:
        a(null);
        this.p = null;
        this.n.setImageDrawable(r4);
    }

    @Override // defpackage.z92
    public final void n() {
        Animatable r0 = this.p;
        if (r0 == null) goto L6;
        r0.start();
        return;
    }

    public final String toString() {
        return "Target for: " + this.n;
    }
}
