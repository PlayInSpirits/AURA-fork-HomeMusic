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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ws implements wq4 {
    public final ImageView n;
    public final x75 o;
    public Animatable p;
    public final /* synthetic */ int q;

    public ws(ImageView imageView, int i) {
        this.q = i;
        h12.f(imageView, "Argument must not be null");
        this.n = imageView;
        this.o = new x75(imageView);
    }

    public final void a(Object obj) {
        switch (this.q) {
            case 0:
                this.n.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.n.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // defpackage.wq4
    public final void b(cf4 cf4Var) {
        this.o.b.remove(cf4Var);
    }

    @Override // defpackage.wq4
    public final void c(Object obj, cx4 cx4Var) {
        if (cx4Var != null && cx4Var.l(obj, this)) {
            if (!(obj instanceof Animatable)) {
                this.p = null;
                return;
            }
            Animatable animatable = (Animatable) obj;
            this.p = animatable;
            animatable.start();
            return;
        }
        a(obj);
        if (!(obj instanceof Animatable)) {
            this.p = null;
            return;
        }
        Animatable animatable2 = (Animatable) obj;
        this.p = animatable2;
        animatable2.start();
    }

    @Override // defpackage.wq4
    public final void d(cf4 cf4Var) {
        x75 x75Var = this.o;
        ArrayList arrayList = x75Var.b;
        View view = x75Var.a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int a = x75Var.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int a2 = x75Var.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((a > 0 || a == Integer.MIN_VALUE) && (a2 > 0 || a2 == Integer.MIN_VALUE)) {
            cf4Var.m(a, a2);
            return;
        }
        if (!arrayList.contains(cf4Var)) {
            arrayList.add(cf4Var);
        }
        if (x75Var.c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ah0 ah0Var = new ah0(x75Var);
            x75Var.c = ah0Var;
            viewTreeObserver.addOnPreDrawListener(ah0Var);
        }
    }

    @Override // defpackage.wq4
    public final void e(pz3 pz3Var) {
        this.n.setTag(R.id.glide_custom_view_target_tag, pz3Var);
    }

    @Override // defpackage.wq4
    public final void i(Drawable drawable) {
        a(null);
        this.p = null;
        this.n.setImageDrawable(drawable);
    }

    @Override // defpackage.z92
    public final void j() {
        Animatable animatable = this.p;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // defpackage.wq4
    public final void k(Drawable drawable) {
        a(null);
        this.p = null;
        this.n.setImageDrawable(drawable);
    }

    @Override // defpackage.wq4
    public final pz3 l() {
        Object tag = this.n.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof pz3) {
                return (pz3) tag;
            }
            kf2.n("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // defpackage.wq4
    public final void m(Drawable drawable) {
        x75 x75Var = this.o;
        ViewTreeObserver viewTreeObserver = x75Var.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(x75Var.c);
        }
        x75Var.c = null;
        x75Var.b.clear();
        Animatable animatable = this.p;
        if (animatable != null) {
            animatable.stop();
        }
        a(null);
        this.p = null;
        this.n.setImageDrawable(drawable);
    }

    @Override // defpackage.z92
    public final void n() {
        Animatable animatable = this.p;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final String toString() {
        return "Target for: " + this.n;
    }

    @Override // defpackage.z92
    public final void h() {
    }
}
