package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dq {
    public final Context a;
    public final ExtendedFloatingActionButton b;
    public final ArrayList c;
    public final d34 d;
    public zx2 e;
    public zx2 f;

    public dq(ExtendedFloatingActionButton r2, d34 r3) {
        this.c = new ArrayList();
        this.b = r2;
        this.a = r2.getContext();
        this.d = r3;
    }

    public AnimatorSet a() {
        zx2 r0 = this.f;
        if (r0 != null) goto L10;
        if (this.e != null) goto L8;
        this.e = zx2.b(this.a, c());
    L8:
        r0 = this.e;
        r0.getClass();
    L10:
        return b(r0);
    }

    public final AnimatorSet b(zx2 r5) {
        ArrayList r0 = new ArrayList();
        boolean r2 = r5.g("opacity");
        ExtendedFloatingActionButton r3 = this.b;
        if (r2 == false) goto L6;
        r0.add(r5.d("opacity", r3, View.ALPHA));
    L6:
        if (r5.g("scale") == false) goto L9;
        r0.add(r5.d("scale", r3, View.SCALE_Y));
        r0.add(r5.d("scale", r3, View.SCALE_X));
    L9:
        if (r5.g("width") == false) goto L12;
        r0.add(r5.d("width", r3, ExtendedFloatingActionButton.V));
    L12:
        if (r5.g("height") == false) goto L15;
        r0.add(r5.d("height", r3, ExtendedFloatingActionButton.W));
    L15:
        if (r5.g("paddingStart") == false) goto L18;
        r0.add(r5.d("paddingStart", r3, ExtendedFloatingActionButton.a0));
    L18:
        if (r5.g("paddingEnd") == false) goto L21;
        r0.add(r5.d("paddingEnd", r3, ExtendedFloatingActionButton.b0));
    L21:
        if (r5.g("labelOpacity") == false) goto L23;
        r0.add(r5.d("labelOpacity", r3, new cq(this)));
    L23:
        AnimatorSet r4 = new AnimatorSet();
        gi1.R(r4, r0);
        return r4;
    }

    public abstract int c();

    public void d() {
        this.d.o = null;
    }

    public abstract void e();

    public abstract void f(Animator r1);

    public abstract void g();

    public abstract boolean h();
}
