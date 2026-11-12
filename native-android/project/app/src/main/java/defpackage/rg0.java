package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rg0 implements Application.ActivityLifecycleCallbacks {
    public int n;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity r1, Bundle r2) {
        if (r1.getClass() == sg0.b.o) goto L5;
        sg0.c = new WeakReference(r1);
        new Date().getTime();
        Application r0 = sg0.a;
    L5:
        Application r3 = sg0.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity r1) {
        Application r0 = sg0.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity r1) {
        Application r0 = sg0.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity r1) {
        Application r0 = sg0.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity r1, Bundle r2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity r1) {
        this.n++;
        Application r0 = sg0.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity r1) {
        this.n--;
        Application r0 = sg0.a;
    }
}
