package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class mz3 extends Fragment {
    public static final /* synthetic */ int o = 0;
    public si1 n;

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final lz3 Companion = null;

        static {
            Companion = new lz3();
        }

        public a() {
        }

        public static final void registerIn(Activity r1) {
            Companion.getClass();
            r1.getClass();
            ek2.n(r1, new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity r1, Bundle r2) {
            r1.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity r1) {
            r1.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity r1) {
            r1.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity r1, Bundle r2) {
            r1.getClass();
            int r0 = mz3.o;
            kz3.a(r1, q92.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity r1) {
            r1.getClass();
            int r0 = mz3.o;
            kz3.a(r1, q92.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity r1) {
            r1.getClass();
            int r0 = mz3.o;
            kz3.a(r1, q92.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity r1) {
            r1.getClass();
            int r0 = mz3.o;
            kz3.a(r1, q92.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity r1) {
            r1.getClass();
            int r0 = mz3.o;
            kz3.a(r1, q92.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity r1) {
            r1.getClass();
            int r0 = mz3.o;
            kz3.a(r1, q92.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity r1) {
            r1.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity r1, Bundle r2) {
            r1.getClass();
            r2.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity r1) {
            r1.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity r1) {
            r1.getClass();
        }
    }

    public mz3() {
    }

    public final void a(q92 r3) {
        if (Build.VERSION.SDK_INT >= 29) goto L6;
        Activity r2 = getActivity();
        r2.getClass();
        kz3.a(r2, r3);
        return;
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle r1) {
        super.onActivityCreated(r1);
        a(q92.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(q92.ON_DESTROY);
        this.n = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(q92.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        si1 r0 = this.n;
        if (r0 == null) goto L5;
        ((lq3) r0.o).a();
    L5:
        a(q92.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        si1 r0 = this.n;
        if (r0 == null) goto L9;
        lq3 r1 = (lq3) r0.o;
        int r2 = r1.n + 1;
        r1.n = r2;
        if (r2 != 1) goto L9;
        if (r1.q == false) goto L9;
        r1.s.d(q92.ON_START);
        r1.q = false;
    L9:
        a(q92.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(q92.ON_STOP);
    }
}
