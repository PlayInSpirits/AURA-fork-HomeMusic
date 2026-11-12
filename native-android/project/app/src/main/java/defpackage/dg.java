package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class dg extends n70 implements gf {
    public bg r;
    public final cg s;

    /* JADX WARN: Type inference failed for: r2v2, types: [cg] */
    public dg(Context r5, int r6) {
        if (r6 != 0) goto L5;
        TypedValue r2 = new TypedValue();
        r5.getTheme().resolveAttribute(R.attr.dialogTheme, r2, true);
        int r3 = r2.resourceId;
    L6:
        super(r5, r3);
        this.s = new cg(this);
        pf r4 = e();
        if (r6 != 0) goto L9;
        TypedValue r7 = new TypedValue();
        r5.getTheme().resolveAttribute(R.attr.dialogTheme, r7, true);
        r6 = r7.resourceId;
    L9:
        ((bg) r4).g0 = r6;
        r4.f();
        return;
    L5:
        r3 = r6;
        goto L6
    }

    @Override // defpackage.n70, android.app.Dialog
    public final void addContentView(View r3, ViewGroup.LayoutParams r4) {
        d();
        bg r2 = (bg) e();
        r2.B();
        ((ViewGroup) r2.N.findViewById(android.R.id.content)).addView(r3, r4);
        r2.z.a(r2.y.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        e().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent r3) {
        View r0 = getWindow().getDecorView();
        return fu.r(this.s, r0, this, r3);
    }

    public final pf e() {
        if (this.r != null) goto L6;
        ia4 r0 = pf.n;
        this.r = new bg(getContext(), getWindow(), this, this);
    L6:
        return this.r;
    }

    @Override // android.app.Dialog
    public final View findViewById(int r1) {
        bg r0 = (bg) e();
        r0.B();
        return r0.y.findViewById(r1);
    }

    public final boolean g(KeyEvent r1) {
        return super.dispatchKeyEvent(r1);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        e().d();
    }

    @Override // defpackage.n70, android.app.Dialog
    public void onCreate(Bundle r2) {
        e().c();
        super.onCreate(r2);
        e().f();
    }

    @Override // defpackage.n70, android.app.Dialog
    public final void onStop() {
        super.onStop();
        bg r1 = (bg) e();
        r1.G();
        l93 r2 = r1.A;
        if (r2 == null) goto L6;
        r2.j0(false);
        return;
    }

    @Override // defpackage.n70, android.app.Dialog
    public void setContentView(int r1) {
        d();
        e().k(r1);
    }

    @Override // android.app.Dialog
    public void setTitle(int r2) {
        super.setTitle(r2);
        e().p(getContext().getString(r2));
    }

    @Override // defpackage.n70, android.app.Dialog
    public void setContentView(View r1) {
        d();
        e().l(r1);
    }

    @Override // defpackage.n70, android.app.Dialog
    public void setContentView(View r1, ViewGroup.LayoutParams r2) {
        d();
        e().n(r1, r2);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence r1) {
        super.setTitle(r1);
        e().p(r1);
    }
}
