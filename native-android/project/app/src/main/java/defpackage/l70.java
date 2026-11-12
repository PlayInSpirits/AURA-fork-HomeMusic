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
import android.view.Window;
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
    public final sd0 o = new sd0();
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
        final nc1 nc1Var = (nc1) this;
        final int i = 1;
        this.p = new r20(new b70(nc1Var, i));
        xm2 xm2Var = new xm2(this, new wc(22, this));
        gp3 gp3Var = new gp3(xm2Var);
        this.q = gp3Var;
        this.s = new i70(nc1Var);
        this.t = new rp4(new c70(nc1Var, i));
        new AtomicInteger();
        this.u = new j70(nc1Var);
        this.v = new CopyOnWriteArrayList();
        this.w = new CopyOnWriteArrayList();
        this.x = new CopyOnWriteArrayList();
        this.y = new CopyOnWriteArrayList();
        this.z = new CopyOnWriteArrayList();
        this.A = new CopyOnWriteArrayList();
        this.B = new CopyOnWriteArrayList();
        this.E = new rp4(new c70(nc1Var, 2));
        ea2 ea2Var = this.n;
        if (ea2Var == null) {
            kf2.o("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i2 = 0;
        ea2Var.a(new w92() { // from class: e70
            @Override // defpackage.w92
            public final void b(ba2 ba2Var, q92 q92Var) {
                Window window;
                View viewPeekDecorView;
                int i3 = i2;
                nc1 nc1Var2 = nc1Var;
                switch (i3) {
                    case 0:
                        if (q92Var == q92.ON_STOP && (window = nc1Var2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (q92Var == q92.ON_DESTROY) {
                            nc1Var2.o.o = null;
                            if (!nc1Var2.isChangingConfigurations()) {
                                nc1Var2.d().a();
                            }
                            i70 i70Var = nc1Var2.s;
                            nc1 nc1Var3 = i70Var.q;
                            nc1Var3.getWindow().getDecorView().removeCallbacks(i70Var);
                            nc1Var3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(i70Var);
                        }
                        break;
                }
            }
        });
        this.n.a(new w92() { // from class: e70
            @Override // defpackage.w92
            public final void b(ba2 ba2Var, q92 q92Var) {
                Window window;
                View viewPeekDecorView;
                int i3 = i;
                nc1 nc1Var2 = nc1Var;
                switch (i3) {
                    case 0:
                        if (q92Var == q92.ON_STOP && (window = nc1Var2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (q92Var == q92.ON_DESTROY) {
                            nc1Var2.o.o = null;
                            if (!nc1Var2.isChangingConfigurations()) {
                                nc1Var2.d().a();
                            }
                            i70 i70Var = nc1Var2.s;
                            nc1 nc1Var3 = i70Var.q;
                            nc1Var3.getWindow().getDecorView().removeCallbacks(i70Var);
                            nc1Var3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(i70Var);
                        }
                        break;
                }
            }
        });
        this.n.a(new vv3(i, nc1Var));
        xm2Var.a();
        e54.b(this);
        ((rm3) gp3Var.p).L("android:support:activity-result", new f70(nc1Var, i2));
        g(new g70(nc1Var, i2));
        this.F = new rp4(new c70(nc1Var, 3));
        this.G = new rp4(new c70(nc1Var, 4));
    }

    public static void e(nc1 nc1Var) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!h12.c(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!h12.c(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.ml1
    public final b75 a() {
        return (b75) this.F.getValue();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.s.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.ml1
    public final f03 b() {
        f03 f03Var = new f03(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = f03Var.a;
        if (application != null) {
            linkedHashMap.put(a75.d, getApplication());
        }
        linkedHashMap.put(e54.a, this);
        linkedHashMap.put(e54.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(e54.c, extras);
        }
        return f03Var;
    }

    @Override // defpackage.f75
    public final e75 d() {
        if (getApplication() == null) {
            kf2.o("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.r == null) {
            h70 h70Var = (h70) getLastNonConfigurationInstance();
            if (h70Var != null) {
                this.r = h70Var.a;
            }
            if (this.r == null) {
                this.r = new e75();
            }
        }
        e75 e75Var = this.r;
        e75Var.getClass();
        return e75Var;
    }

    @Override // defpackage.j54
    public final rm3 f() {
        return (rm3) this.q.p;
    }

    public final void g(d93 d93Var) {
        sd0 sd0Var = this.o;
        sd0Var.getClass();
        l70 l70Var = (l70) sd0Var.o;
        if (l70Var != null) {
            d93Var.a(l70Var);
        }
        ((CopyOnWriteArraySet) sd0Var.n).add(d93Var);
    }

    @Override // defpackage.ba2
    public final ea2 h() {
        return this.n;
    }

    public final a93 i() {
        return (a93) this.G.getValue();
    }

    public final void j() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.u.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((iq0) this.E.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.v.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((xc0) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.k70, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.q.s(bundle);
        sd0 sd0Var = this.o;
        sd0Var.getClass();
        sd0Var.o = this;
        Iterator it = ((CopyOnWriteArraySet) sd0Var.n).iterator();
        while (it.hasNext()) {
            ((d93) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = mz3.o;
        kz3.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.p.p).iterator();
        while (it.hasNext()) {
            ((cd1) it.next()).a.j(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.p.p).iterator();
            while (it.hasNext()) {
                if (((cd1) it.next()).a.o(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.C = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.C = false;
            Iterator it = this.y.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((xc0) it.next()).accept(new pz2(z));
            }
        } catch (Throwable th) {
            this.C = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.x.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((xc0) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.p.p).iterator();
        while (it.hasNext()) {
            ((cd1) it.next()).a.p();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.D = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.D = false;
            Iterator it = this.z.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((xc0) it.next()).accept(new eg3(z));
            }
        } catch (Throwable th) {
            this.D = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        tv1 tv1Var;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            tv1Var = new tv1();
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            tv1Var = new tv1();
        } else {
            tv1Var = new tv1();
        }
        Iterator it = this.A.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((xc0) it.next()).accept(tv1Var);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.p.p).iterator();
        while (it.hasNext()) {
            ((cd1) it.next()).a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.u.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        h70 h70Var;
        e75 e75Var = this.r;
        if (e75Var == null && (h70Var = (h70) getLastNonConfigurationInstance()) != null) {
            e75Var = h70Var.a;
        }
        if (e75Var == null) {
            return null;
        }
        h70 h70Var2 = new h70();
        h70Var2.a = e75Var;
        return h70Var2;
    }

    @Override // defpackage.k70, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        ea2 ea2Var = this.n;
        if (ea2Var != null) {
            ea2Var.g(r92.p);
        }
        super.onSaveInstanceState(bundle);
        this.q.t(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.w.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((xc0) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.B.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (xl.y()) {
                Trace.beginSection(xl.N("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            ff1 ff1Var = (ff1) this.t.getValue();
            synchronized (ff1Var.a) {
                try {
                    ff1Var.b = true;
                    ArrayList arrayList = ff1Var.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((gf1) obj).invoke();
                    }
                    ff1Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        j();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.s.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        j();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.s.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.s.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.C) {
            return;
        }
        Iterator it = this.y.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((xc0) it.next()).accept(new pz2(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.D) {
            return;
        }
        Iterator it = this.z.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((xc0) it.next()).accept(new eg3(z));
        }
    }
}
