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
        if (this.t == false) goto L5;
        return;
    L5:
        this.t = true;
        this.r.H(this);
    }

    @Override // defpackage.d5
    public final View b() {
        WeakReference r0 = this.s;
        if (r0 != null) goto L5;
        return null;
    L5:
        return (View) r0.get();
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
    public final void i(View r2) {
        this.q.setCustomView(r2);
        if (r2 == null) goto L5;
        WeakReference r0 = new WeakReference(r2);
    L6:
        this.s = r0;
        return;
    L5:
        r0 = null;
        goto L6
    }

    @Override // defpackage.d5
    public final void j(int r2) {
        k(this.p.getString(r2));
    }

    @Override // defpackage.d5
    public final void k(CharSequence r1) {
        this.q.setSubtitle(r1);
    }

    @Override // defpackage.d5
    public final void l(int r2) {
        n(this.p.getString(r2));
    }

    @Override // defpackage.ou2
    public final boolean m(qu2 r1, MenuItem r2) {
        return ((bq4) this.r.n).q(this, r2);
    }

    @Override // defpackage.d5
    public final void n(CharSequence r1) {
        this.q.setTitle(r1);
    }

    @Override // defpackage.d5
    public final void o(boolean r1) {
        this.o = r1;
        this.q.setTitleOptional(r1);
    }

    @Override // defpackage.ou2
    public final void y(qu2 r1) {
        g();
        y4 r0 = this.q.q;
        if (r0 == null) goto L6;
        r0.n();
        return;
    }
}
