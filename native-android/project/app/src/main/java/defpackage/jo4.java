package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jo4 extends ActionMode {
    public final Context a;
    public final d5 b;

    public jo4(Context r1, d5 r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        qu2 r1 = this.b.c();
        return new jv2(this.a, r1);
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.n;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.o;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View r1) {
        this.b.i(r1);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence r1) {
        this.b.k(r1);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object r1) {
        this.b.n = r1;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence r1) {
        this.b.n(r1);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean r1) {
        this.b.o(r1);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int r1) {
        this.b.j(r1);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int r1) {
        this.b.l(r1);
    }
}
