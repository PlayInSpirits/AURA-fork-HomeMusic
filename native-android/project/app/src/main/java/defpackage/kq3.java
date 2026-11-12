package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kq3 extends o01 {
    final /* synthetic */ lq3 this$0;

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class a extends o01 {
        final /* synthetic */ lq3 this$0;

        public a(lq3 r1) {
            this.this$0 = r1;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity r1) {
            r1.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity r2) {
            r2.getClass();
            lq3 r1 = this.this$0;
            int r3 = r1.n + 1;
            r1.n = r3;
            if (r3 == 1) goto L5;
            return;
        L5:
            if (r1.q == false) goto L9;
            r1.s.d(q92.ON_START);
            r1.q = false;
            return;
        }
    }

    public kq3(lq3 r1) {
        this.this$0 = r1;
    }

    @Override // defpackage.o01, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity r2, Bundle r3) {
        r2.getClass();
        if (Build.VERSION.SDK_INT >= 29) goto L6;
        int r4 = mz3.o;
        Fragment r5 = r2.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
        r5.getClass();
        si1 r1 = this.this$0.u;
        ((mz3) r5).n = r1;
        return;
    }

    @Override // defpackage.o01, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity r3) {
        r3.getClass();
        lq3 r2 = this.this$0;
        int r4 = r2.o - 1;
        r2.o = r4;
        if (r4 != 0) goto L6;
        Handler r5 = r2.r;
        r5.getClass();
        r5.postDelayed(r2.t, 700);
        return;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity r1, Bundle r2) {
        r1.getClass();
        yh.l(r1, new a(this.this$0));
    }

    @Override // defpackage.o01, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity r2) {
        r2.getClass();
        lq3 r1 = this.this$0;
        int r3 = r1.n - 1;
        r1.n = r3;
        if (r3 == 0) goto L5;
        return;
    L5:
        if (r1.p == false) goto L9;
        r1.s.d(q92.ON_STOP);
        r1.q = true;
        return;
    }
}
