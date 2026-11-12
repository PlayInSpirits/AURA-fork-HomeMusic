package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class n70 extends Dialog implements ba2, j54 {
    public ea2 n;
    public final gp3 o;
    public final rp4 p;
    public final rp4 q;

    public n70(Context r2, int r3) {
        r2.getClass();
        super(r2, r3);
        this.o = new gp3(new xm2(this, new wc(22, this)));
        final int r4 = 0;
        this.p = new rp4(new m70(this, r4));
        final int r5 = 1;
        this.q = new rp4(new m70(this, r5));
    }

    public static void a(n70 r0) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View r1, ViewGroup.LayoutParams r2) {
        r1.getClass();
        d();
        super.addContentView(r1, r2);
    }

    public final ea2 b() {
        ea2 r0 = this.n;
        if (r0 != null) goto L6;
        ea2 r1 = new ea2(this, true);
        this.n = r1;
        return r1;
    L6:
        return r0;
    }

    public final a93 c() {
        return (a93) this.q.getValue();
    }

    public final void d() {
        Window r0 = getWindow();
        r0.getClass();
        View r1 = r0.getDecorView();
        r1.getClass();
        r1.setTag(R.id.view_tree_lifecycle_owner, this);
        Window r2 = getWindow();
        r2.getClass();
        View r3 = r2.getDecorView();
        r3.getClass();
        r3.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window r4 = getWindow();
        r4.getClass();
        View r5 = r4.getDecorView();
        r5.getClass();
        r5.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window r6 = getWindow();
        r6.getClass();
        View r7 = r6.getDecorView();
        r7.getClass();
        r7.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.j54
    public final rm3 f() {
        return (rm3) this.o.p;
    }

    @Override // defpackage.ba2
    public final ea2 h() {
        return b();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((iq0) this.p.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle r3) {
        super.onCreate(r3);
        if (Build.VERSION.SDK_INT < 33) goto L5;
        a93 r0 = c();
        OnBackInvokedDispatcher r1 = n3.k(this);
        r1.getClass();
        r0.c(r1);
    L5:
        this.o.s(r3);
        b().d(q92.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle r0 = super.onSaveInstanceState();
        r0.getClass();
        this.o.t(r0);
        return r0;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().d(q92.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().d(q92.ON_DESTROY);
        this.n = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View r1) {
        r1.getClass();
        d();
        super.setContentView(r1);
    }

    @Override // android.app.Dialog
    public void setContentView(int r1) {
        d();
        super.setContentView(r1);
    }

    @Override // android.app.Dialog
    public void setContentView(View r1, ViewGroup.LayoutParams r2) {
        r1.getClass();
        d();
        super.setContentView(r1, r2);
    }
}
