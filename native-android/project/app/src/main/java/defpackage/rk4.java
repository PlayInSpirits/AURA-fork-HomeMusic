package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rk4 extends d5 implements ou2 {
    public Context p;
    public ActionBarContextView q;
    public rm3 r;
    public WeakReference s;
    public boolean t;
    public qu2 u;

    @Override // defpackage.d5
    public final void a() {
        if (this.t) {
            return;
        }
        this.t = true;
        this.r.H(this);
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
        return this.u;
    }

    @Override // defpackage.d5
    public final MenuInflater d() {
        return new no4(this.q.getContext());
    }

    @Override // defpackage.d5
    public final CharSequence e() {
        return this.q.getSubtitle();
    }

    @Override // defpackage.d5
    public final CharSequence f() {
        return this.q.getTitle();
    }

    @Override // defpackage.d5
    public final void g() {
        this.r.I(this, this.u);
    }

    @Override // defpackage.d5
    public final boolean h() {
        return this.q.F;
    }

    @Override // defpackage.d5
    public final void i(View view) {
        this.q.setCustomView(view);
        this.s = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.d5
    public final void j(int i) {
        k(this.p.getString(i));
    }

    @Override // defpackage.d5
    public final void k(CharSequence charSequence) {
        this.q.setSubtitle(charSequence);
    }

    @Override // defpackage.d5
    public final void l(int i) {
        n(this.p.getString(i));
    }

    @Override // defpackage.ou2
    public final boolean m(qu2 qu2Var, MenuItem menuItem) {
        return ((bq4) this.r.n).q(this, menuItem);
    }

    @Override // defpackage.d5
    public final void n(CharSequence charSequence) {
        this.q.setTitle(charSequence);
    }

    @Override // defpackage.d5
    public final void o(boolean z) {
        this.o = z;
        this.q.setTitleOptional(z);
    }

    @Override // defpackage.ou2
    public final void y(qu2 qu2Var) {
        g();
        y4 y4Var = this.q.q;
        if (y4Var != null) {
            y4Var.n();
        }
    }
}
