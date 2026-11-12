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
    public final ArrayList c = new ArrayList();
    public final d34 d;
    public zx2 e;
    public zx2 f;

    public dq(ExtendedFloatingActionButton extendedFloatingActionButton, d34 d34Var) {
        this.b = extendedFloatingActionButton;
        this.a = extendedFloatingActionButton.getContext();
        this.d = d34Var;
    }

    public AnimatorSet a() {
        zx2 zx2Var = this.f;
        if (zx2Var == null) {
            if (this.e == null) {
                this.e = zx2.b(this.a, c());
            }
            zx2Var = this.e;
            zx2Var.getClass();
        }
        return b(zx2Var);
    }

    public final AnimatorSet b(zx2 zx2Var) {
        ArrayList arrayList = new ArrayList();
        boolean zG = zx2Var.g("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        if (zG) {
            arrayList.add(zx2Var.d("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (zx2Var.g("scale")) {
            arrayList.add(zx2Var.d("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(zx2Var.d("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (zx2Var.g("width")) {
            arrayList.add(zx2Var.d("width", extendedFloatingActionButton, ExtendedFloatingActionButton.V));
        }
        if (zx2Var.g("height")) {
            arrayList.add(zx2Var.d("height", extendedFloatingActionButton, ExtendedFloatingActionButton.W));
        }
        if (zx2Var.g("paddingStart")) {
            arrayList.add(zx2Var.d("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.a0));
        }
        if (zx2Var.g("paddingEnd")) {
            arrayList.add(zx2Var.d("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.b0));
        }
        if (zx2Var.g("labelOpacity")) {
            arrayList.add(zx2Var.d("labelOpacity", extendedFloatingActionButton, new cq(this)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        gi1.R(animatorSet, arrayList);
        return animatorSet;
    }

    public abstract int c();

    public void d() {
        this.d.o = null;
    }

    public abstract void e();

    public abstract void f(Animator animator);

    public abstract void g();

    public abstract boolean h();
}
