package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ha5 extends d5 implements ou2 {
    public final Context p;
    public final qu2 q;
    public rm3 r;
    public WeakReference s;
    public final /* synthetic */ ia5 t;

    public ha5(ia5 ia5Var, Context context, rm3 rm3Var) {
        this.t = ia5Var;
        this.p = context;
        this.r = rm3Var;
        qu2 qu2Var = new qu2(context);
        qu2Var.l = 1;
        this.q = qu2Var;
        qu2Var.e = this;
    }

    @Override // defpackage.d5
    public final void a() {
        ia5 ia5Var = this.t;
        if (ia5Var.l != this) {
            return;
        }
        if (ia5Var.s) {
            ia5Var.m = this;
            ia5Var.n = this.r;
        } else {
            this.r.H(this);
        }
        this.r = null;
        ia5Var.u0(false);
        ActionBarContextView actionBarContextView = ia5Var.i;
        if (actionBarContextView.x == null) {
            actionBarContextView.e();
        }
        ia5Var.f.setHideOnContentScrollEnabled(ia5Var.x);
        ia5Var.l = null;
    }

    @Override // defpackage.d5
    public final View b() {
        WeakReference weakReference = this.s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.d5
    public final qu2 c() {
        return this.q;
    }

    @Override // defpackage.d5
    public final MenuInflater d() {
        return new no4(this.p);
    }

    @Override // defpackage.d5
    public final CharSequence e() {
        return this.t.i.getSubtitle();
    }

    @Override // defpackage.d5
    public final CharSequence f() {
        return this.t.i.getTitle();
    }

    @Override // defpackage.d5
    public final void g() {
        if (this.t.l != this) {
            return;
        }
        qu2 qu2Var = this.q;
        qu2Var.y();
        try {
            this.r.I(this, qu2Var);
        } finally {
            qu2Var.x();
        }
    }

    @Override // defpackage.d5
    public final boolean h() {
        return this.t.i.F;
    }

    @Override // defpackage.d5
    public final void i(View view) {
        this.t.i.setCustomView(view);
        this.s = new WeakReference(view);
    }

    @Override // defpackage.d5
    public final void j(int i) {
        k(this.t.d.getResources().getString(i));
    }

    @Override // defpackage.d5
    public final void k(CharSequence charSequence) {
        this.t.i.setSubtitle(charSequence);
    }

    @Override // defpackage.d5
    public final void l(int i) {
        n(this.t.d.getResources().getString(i));
    }

    @Override // defpackage.ou2
    public final boolean m(qu2 qu2Var, MenuItem menuItem) {
        rm3 rm3Var = this.r;
        if (rm3Var != null) {
            return ((bq4) rm3Var.n).q(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.d5
    public final void n(CharSequence charSequence) {
        this.t.i.setTitle(charSequence);
    }

    @Override // defpackage.d5
    public final void o(boolean z) {
        this.o = z;
        this.t.i.setTitleOptional(z);
    }

    @Override // defpackage.ou2
    public final void y(qu2 qu2Var) {
        if (this.r == null) {
            return;
        }
        g();
        y4 y4Var = this.t.i.q;
        if (y4Var != null) {
            y4Var.n();
        }
    }
}
