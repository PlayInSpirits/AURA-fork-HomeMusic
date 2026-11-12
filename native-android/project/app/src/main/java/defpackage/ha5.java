package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ha5 extends d5 implements ou2 {
    public final Context p;
    public final qu2 q;
    public rm3 r;
    public WeakReference s;
    public final /* synthetic */ ia5 t;

    public ha5(ia5 r1, Context r2, rm3 r3) {
        this.t = r1;
        this.p = r2;
        this.r = r3;
        qu2 r4 = new qu2(r2);
        r4.l = 1;
        this.q = r4;
        r4.e = this;
    }

    @Override // defpackage.d5
    public final void a() {
        ia5 r0 = this.t;
        if (r0.l == this) goto L6;
        return;
    L6:
        if (r0.s == false) goto L8;
        r0.m = this;
        r0.n = this.r;
    L9:
        this.r = null;
        r0.u0(false);
        ActionBarContextView r3 = r0.i;
        if (r3.x != null) goto L12;
        r3.e();
    L12:
        r0.f.setHideOnContentScrollEnabled(r0.x);
        r0.l = null;
        return;
    L8:
        this.r.H(this);
        goto L9
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
        if (this.t.l == this) goto L5;
        return;
    L5:
        qu2 r0 = this.q;
        r0.y();
        this.r.I(this, r0);     // Catch: Throwable -> L9
        r0.x();
        return;
    L9:
        th = move-exception;
        r0.x();
        throw th;
    }

    @Override // defpackage.d5
    public final boolean h() {
        return this.t.i.F;
    }

    @Override // defpackage.d5
    public final void i(View r2) {
        this.t.i.setCustomView(r2);
        this.s = new WeakReference(r2);
    }

    @Override // defpackage.d5
    public final void j(int r2) {
        k(this.t.d.getResources().getString(r2));
    }

    @Override // defpackage.d5
    public final void k(CharSequence r1) {
        this.t.i.setSubtitle(r1);
    }

    @Override // defpackage.d5
    public final void l(int r2) {
        n(this.t.d.getResources().getString(r2));
    }

    @Override // defpackage.ou2
    public final boolean m(qu2 r1, MenuItem r2) {
        rm3 r3 = this.r;
        if (r3 != null) goto L5;
        return false;
    L5:
        return ((bq4) r3.n).q(this, r2);
    }

    @Override // defpackage.d5
    public final void n(CharSequence r1) {
        this.t.i.setTitle(r1);
    }

    @Override // defpackage.d5
    public final void o(boolean r1) {
        this.o = r1;
        this.t.i.setTitleOptional(r1);
    }

    @Override // defpackage.ou2
    public final void y(qu2 r1) {
        if (this.r == null) goto L10;
        g();
        y4 r0 = this.t.i.q;
        if (r0 == null) goto L9;
        r0.n();
        return;
    L9:
        return;
    }
}
