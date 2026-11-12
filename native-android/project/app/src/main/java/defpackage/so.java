package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class so implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final so r = null;
    public final AtomicBoolean n;
    public final AtomicBoolean o;
    public final ArrayList p;
    public boolean q;

    static {
        r = new so();
    }

    public so() {
        this.n = new AtomicBoolean();
        this.o = new AtomicBoolean();
        this.p = new ArrayList();
        this.q = false;
    }

    public final void a(boolean r7) {
        so r0 = r;
        monitor-enter(r0);
        ArrayList r6 = this.p;     // Catch: Throwable -> L7
        int r1 = r6.size();     // Catch: Throwable -> L7
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L9;
        Object r3 = r6.get(r2);     // Catch: Throwable -> L7
        r2 = r2 + 1;     // Catch: Throwable -> L7
        zw2 r4 = ((ff5) r3).a.A;     // Catch: Throwable -> L7
        r4.sendMessage(r4.obtainMessage(1, Boolean.valueOf(r7)));     // Catch: Throwable -> L7
        goto L5
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity r3, Bundle r4) {
        boolean r5 = this.n.compareAndSet(true, false);
        this.o.set(true);
        if (r5 == false) goto L6;
        a(false);
        return;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity r1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity r1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity r4) {
        boolean r5 = this.n.compareAndSet(true, false);
        this.o.set(true);
        if (r5 == false) goto L6;
        a(false);
        return;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity r1, Bundle r2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity r1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity r1) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration r1) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int r3) {
        if (r3 == 20) goto L5;
        return;
    L5:
        if (this.n.compareAndSet(false, true) == false) goto L9;
        this.o.set(true);
        a(true);
        return;
    }
}
