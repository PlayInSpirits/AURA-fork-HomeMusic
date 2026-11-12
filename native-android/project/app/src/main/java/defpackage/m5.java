package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class m5 implements Application.ActivityLifecycleCallbacks {
    public Object n;
    public Activity o;
    public final int p;
    public boolean q;
    public boolean r;
    public boolean s;

    public m5(Activity r2) {
        this.q = false;
        this.r = false;
        this.s = false;
        this.o = r2;
        this.p = r2.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity r1, Bundle r2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity r2) {
        if (this.o != r2) goto L6;
        this.o = null;
        this.r = true;
        return;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity r5) {
        if (this.r == true) goto L5;
        return;
    L5:
        if (this.s == false) goto L7;
        return;
    L7:
        if (this.q == true) goto L25;
        Object r0 = this.n;
        Object r1 = n5.c.get(r5);     // Catch: Throwable -> L18
        if (r1 == r0) goto L13;
        return;
    L13:
        if (r5.hashCode() != this.p) goto L27;
        Object r6 = n5.b.get(r5);     // Catch: Throwable -> L18
        n5.g.postAtFrontOfQueue(new lg1(4, r6, r1));     // Catch: Throwable -> L18
        this.s = true;
        this.n = null;
        return;
    L27:
        return;
    L18:
        th = move-exception;
        Log.e("ActivityRecreator", "Exception while fetching field values", th);
        return;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity r1) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity r1, Bundle r2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity r2) {
        if (this.o != r2) goto L6;
        this.q = true;
        return;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity r1) {
    }
}
