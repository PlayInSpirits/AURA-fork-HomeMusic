package defpackage;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l70 extends k70 implements f75, ml1, j54 {
    public final CopyOnWriteArrayList A;
    public final CopyOnWriteArrayList B;
    public boolean C;
    public boolean D;
    public final rp4 E;
    public final rp4 F;
    public final rp4 G;
    public final sd0 o;
    public final r20 p;
    public final gp3 q;
    public e75 r;
    public final i70 s;
    public final rp4 t;
    public final j70 u;
    public final CopyOnWriteArrayList v;
    public final CopyOnWriteArrayList w;
    public final CopyOnWriteArrayList x;
    public final CopyOnWriteArrayList y;
    public final CopyOnWriteArrayList z;

    public l70() {
        this.o = new sd0();
        final nc1 r2 = (nc1) this;
        final int r3 = 1;
        this.p = new r20(new b70(r2, r3));
        xm2 r0 = new xm2(this, new wc(22, this));
        gp3 r1 = new gp3(r0);
        this.q = r1;
        this.s = new i70(r2);
        this.t = new rp4(new c70(r2, r3));
        new AtomicInteger();
        this.u = new j70(r2);
        this.v = new CopyOnWriteArrayList();
        this.w = new CopyOnWriteArrayList();
        this.x = new CopyOnWriteArrayList();
        this.y = new CopyOnWriteArrayList();
        this.z = new CopyOnWriteArrayList();
        this.A = new CopyOnWriteArrayList();
        this.B = new CopyOnWriteArrayList();
        this.E = new rp4(new c70(r2, 2));
        ea2 r4 = this.n;
        if (r4 == null) goto L6;
        final int r6 = 0;
        r4.a(new e70(r2, r6));
        this.n.a(new e70(r2, r3));
        this.n.a(new vv3(r3, r2));
        r0.a();
        e54.b(this);
        ((rm3) r1.p).L("android:support:activity-result", new f70(r2, r6));
        g(new g70(r2, r6));
        this.F = new rp4(new c70(r2, 3));
        this.G = new rp4(new c70(r2, 4));
        return;
    L6:
        kf2.o("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        throw null;
    }

    public static void e(nc1 r2) {
        super.onBackPressed();     // Catch: NullPointerException -> L4 IllegalStateException -> L9
        return;
    L9:
        e = move-exception;
        if (h12.c(e.getMessage(), "Can not perform this action after onSaveInstanceState") == false) goto L13;
        return;
    L13:
        throw e;
    L4:
        e = move-exception;
        if (h12.c(e.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference") == true) goto L16;
        throw e;
    }

    @Override // defpackage.ml1
    public final b75 a() {
        return (b75) this.F.getValue();
    }

    @Override // android.app.Activity
    public void addContentView(View r3, ViewGroup.LayoutParams r4) {
        j();
        View r0 = getWindow().getDecorView();
        r0.getClass();
        this.s.a(r0);
        super.addContentView(r3, r4);
    }

    @Override // defpackage.ml1
    public final f03 b() {
        f03 r0 = new f03(0);
        Application r1 = getApplication();
        LinkedHashMap r2 = r0.a;
        if (r1 == null) goto L5;
        r2.put(a75.d, getApplication());
    L5:
        r2.put(e54.a, this);
        r2.put(e54.b, this);
        Intent r4 = getIntent();
        if (r4 == null) goto L8;
        Bundle r5 = r4.getExtras();
    L9:
        if (r5 == null) goto L11;
        r2.put(e54.c, r5);
    L11:
        return r0;
    L8:
        r5 = null;
        goto L9
    }

    @Override // defpackage.f75
    public final e75 d() {
        if (getApplication() != null) goto L5;
        kf2.o("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    L5:
        if (this.r != null) goto L12;
        h70 r0 = (h70) getLastNonConfigurationInstance();
        if (r0 == null) goto L10;
        this.r = r0.a;
    L10:
        if (this.r != null) goto L12;
        this.r = new e75();
    L12:
        e75 r1 = this.r;
        r1.getClass();
        return r1;
    }

    @Override // defpackage.j54
    public final rm3 f() {
        return (rm3) this.q.p;
    }

    public final void g(d93 r2) {
        sd0 r1 = this.o;
        r1.getClass();
        l70 r0 = (l70) r1.o;
        if (r0 == null) goto L5;
        r2.a(r0);
    L5:
        ((CopyOnWriteArraySet) r1.n).add(r2);
    }

    @Override // defpackage.ba2
    public final ea2 h() {
        return this.n;
    }

    public final a93 i() {
        return (a93) this.G.getValue();
    }

    public final void j() {
        View r0 = getWindow().getDecorView();
        r0.getClass();
        r0.setTag(R.id.view_tree_lifecycle_owner, this);
        View r1 = getWindow().getDecorView();
        r1.getClass();
        r1.setTag(R.id.view_tree_view_model_store_owner, this);
        View r2 = getWindow().getDecorView();
        r2.getClass();
        r2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View r3 = getWindow().getDecorView();
        r3.getClass();
        r3.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View r4 = getWindow().getDecorView();
        r4.getClass();
        r4.setTag(R.id.report_drawn, this);
        View r5 = getWindow().getDecorView();
        r5.getClass();
        r5.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int r2, int r3, Intent r4) {
        if (this.u.a(r2, r3, r4) == true) goto L6;
        super.onActivityResult(r2, r3, r4);
        return;
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((iq0) this.E.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration r2) {
        r2.getClass();
        super.onConfigurationChanged(r2);
        Iterator r1 = this.v.iterator();
        r1.getClass();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((xc0) r1.next()).accept(r2);
        goto L4
    }

    @Override // defpackage.k70, android.app.Activity
    public void onCreate(Bundle r3) {
        this.q.s(r3);
        sd0 r0 = this.o;
        r0.getClass();
        r0.o = this;
        Iterator r1 = ((CopyOnWriteArraySet) r0.n).iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((d93) r1.next()).a(this);
        goto L4
    L6:
        super.onCreate(r3);
        int r4 = mz3.o;
        kz3.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r2, Menu r3) {
        r3.getClass();
        if (r2 != 0) goto L8;
        super.onCreatePanelMenu(r2, r3);
        MenuInflater r4 = getMenuInflater();
        Iterator r1 = ((CopyOnWriteArrayList) this.p.p).iterator();
    L6:
        if (r1.hasNext() == false) goto L11;
        ((cd1) r1.next()).a.j(r3, r4);
        goto L6
    L11:
        return true;
    L8:
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r3, MenuItem r4) {
        r4.getClass();
        if (super.onMenuItemSelected(r3, r4) == false) goto L6;
        return true;
    L6:
        if (r3 != 0) goto L13;
        Iterator r2 = ((CopyOnWriteArrayList) this.p.p).iterator();
    L9:
        if (r2.hasNext() == false) goto L13;
        if (((cd1) r2.next()).a.o(r4) == false) goto L9;
        return true;
    L13:
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean r2, Configuration r3) {
        r3.getClass();
        this.C = true;
        super.onMultiWindowModeChanged(r2, r3);     // Catch: Throwable -> L9
        this.C = false;
        Iterator r1 = this.y.iterator();
        r1.getClass();
    L6:
        if (r1.hasNext() == false) goto L8;
        ((xc0) r1.next()).accept(new pz2(r2));
        goto L6
    L8:
        return;
    L9:
        th = move-exception;
        this.C = false;
        throw th;
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent r2) {
        r2.getClass();
        super.onNewIntent(r2);
        Iterator r1 = this.x.iterator();
        r1.getClass();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((xc0) r1.next()).accept(r2);
        goto L4
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r3, Menu r4) {
        r4.getClass();
        Iterator r0 = ((CopyOnWriteArrayList) this.p.p).iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((cd1) r0.next()).a.p();
        goto L4
    L6:
        super.onPanelClosed(r3, r4);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean r2, Configuration r3) {
        r3.getClass();
        this.D = true;
        super.onPictureInPictureModeChanged(r2, r3);     // Catch: Throwable -> L9
        this.D = false;
        Iterator r1 = this.z.iterator();
        r1.getClass();
    L6:
        if (r1.hasNext() == false) goto L8;
        ((xc0) r1.next()).accept(new eg3(r2));
        goto L6
    L8:
        return;
    L9:
        th = move-exception;
        this.D = false;
        throw th;
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState r3) {
        r3.getClass();
        super.onPictureInPictureUiStateChanged(r3);
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 35) goto L6;
        r3.isStashed();
        vk.c(r3);
        tv1 r1 = new tv1();
    L9:
        Iterator r2 = this.A.iterator();
        r2.getClass();
    L11:
        if (r2.hasNext() == false) goto L13;
        ((xc0) r2.next()).accept(r1);
        goto L11
    L13:
        return;
    L6:
        if (r0 < 31) goto L8;
        r3.isStashed();
        r1 = new tv1();
        goto L9
    L8:
        r1 = new tv1();
        goto L9
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int r1, View r2, Menu r3) {
        r3.getClass();
        if (r1 != 0) goto L8;
        super.onPreparePanel(r1, r2, r3);
        Iterator r0 = ((CopyOnWriteArrayList) this.p.p).iterator();
    L6:
        if (r0.hasNext() == false) goto L11;
        ((cd1) r0.next()).a.s();
        goto L6
    L11:
        return true;
    L8:
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int r4, String[] r5, int[] r6) {
        r5.getClass();
        r6.getClass();
        Intent r0 = new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", r5).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", r6);
        if (this.u.a(r4, -1, r0) == true) goto L6;
        super.onRequestPermissionsResult(r4, r5, r6);
        return;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        e75 r0 = this.r;
        if (r0 != null) goto L7;
        h70 r1 = (h70) getLastNonConfigurationInstance();
        if (r1 == null) goto L7;
        r0 = r1.a;
    L7:
        if (r0 != null) goto L10;
        return null;
    L10:
        h70 r2 = new h70();
        r2.a = r0;
        return r2;
    }

    @Override // defpackage.k70, android.app.Activity
    public void onSaveInstanceState(Bundle r3) {
        r3.getClass();
        ea2 r0 = this.n;
        if (r0 == null) goto L5;
        r0.g(r92.p);
    L5:
        super.onSaveInstanceState(r3);
        this.q.t(r3);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int r3) {
        super.onTrimMemory(r3);
        Iterator r2 = this.w.iterator();
        r2.getClass();
    L4:
        if (r2.hasNext() == false) goto L6;
        ((xc0) r2.next()).accept(Integer.valueOf(r3));
        goto L4
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator r1 = this.B.iterator();
        r1.getClass();
    L4:
        if (r1.hasNext() == false) goto L6;
        ((Runnable) r1.next()).run();
        goto L4
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
    L19:
        th = move-exception;
        Trace.endSection();
        throw th;
    L3:
        if (xl.y() == false) goto L5;
        Trace.beginSection(xl.N("reportFullyDrawn() for ComponentActivity"));     // Catch: Throwable -> L19
    L5:
        super.reportFullyDrawn();     // Catch: Throwable -> L19
        ff1 r5 = (ff1) this.t.getValue();     // Catch: Throwable -> L19
        Object r0 = r5.a;     // Catch: Throwable -> L19
        monitor-enter(r0);     // Catch: Throwable -> L19
        r5.b = true;     // Catch: Throwable -> L11
        ArrayList r1 = r5.c;     // Catch: Throwable -> L11
        int r2 = r1.size();     // Catch: Throwable -> L11
        int r3 = 0;
    L9:
        if (r3 >= r2) goto L13;
        Object r4 = r1.get(r3);     // Catch: Throwable -> L11
        r3 = r3 + 1;     // Catch: Throwable -> L11
        ((gf1) r4).invoke();     // Catch: Throwable -> L11
        goto L9
    L13:
        r5.c.clear();     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L19
        Trace.endSection();
        return;
    L11:
        th = move-exception;
        throw th;     // Catch: Throwable -> L19
    }

    @Override // android.app.Activity
    public void setContentView(int r3) {
        j();
        View r0 = getWindow().getDecorView();
        r0.getClass();
        this.s.a(r0);
        super.setContentView(r3);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent r1, int r2) {
        r1.getClass();
        super.startActivityForResult(r1, r2);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender r1, int r2, Intent r3, int r4, int r5, int r6) {
        r1.getClass();
        super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent r1, int r2, Bundle r3) {
        r1.getClass();
        super.startActivityForResult(r1, r2, r3);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender r1, int r2, Intent r3, int r4, int r5, int r6, Bundle r7) {
        r1.getClass();
        super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7);
    }

    @Override // android.app.Activity
    public void setContentView(View r3) {
        j();
        View r0 = getWindow().getDecorView();
        r0.getClass();
        this.s.a(r0);
        super.setContentView(r3);
    }

    @Override // android.app.Activity
    public void setContentView(View r3, ViewGroup.LayoutParams r4) {
        j();
        View r0 = getWindow().getDecorView();
        r0.getClass();
        this.s.a(r0);
        super.setContentView(r3, r4);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean r3) {
        if (this.C == true) goto L9;
        Iterator r2 = this.y.iterator();
        r2.getClass();
    L7:
        if (r2.hasNext() == false) goto L11;
        ((xc0) r2.next()).accept(new pz2(r3));
        goto L7
    L11:
        return;
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean r3) {
        if (this.D == true) goto L9;
        Iterator r2 = this.z.iterator();
        r2.getClass();
    L7:
        if (r2.hasNext() == false) goto L11;
        ((xc0) r2.next()).accept(new eg3(r3));
        goto L7
    L11:
        return;
    }
}
