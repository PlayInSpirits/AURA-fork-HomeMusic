package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class kq3 extends o01 {
    final /* synthetic */ lq3 this$0;

    /* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class a extends o01 {
        final /* synthetic */ lq3 this$0;

        public a(lq3 lq3Var) {
            this.this$0 = lq3Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            lq3 lq3Var = this.this$0;
            int i = lq3Var.n + 1;
            lq3Var.n = i;
            if (i == 1 && lq3Var.q) {
                lq3Var.s.d(q92.ON_START);
                lq3Var.q = false;
            }
        }
    }

    public kq3(lq3 lq3Var) {
        this.this$0 = lq3Var;
    }

    @Override // defpackage.o01, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = mz3.o;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((mz3) findFragmentByTag).n = this.this$0.u;
        }
    }

    @Override // defpackage.o01, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        lq3 lq3Var = this.this$0;
        int i = lq3Var.o - 1;
        lq3Var.o = i;
        if (i == 0) {
            Handler handler = lq3Var.r;
            handler.getClass();
            handler.postDelayed(lq3Var.t, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        yh.l(activity, new a(this.this$0));
    }

    @Override // defpackage.o01, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        lq3 lq3Var = this.this$0;
        int i = lq3Var.n - 1;
        lq3Var.n = i;
        if (i == 0 && lq3Var.p) {
            lq3Var.s.d(q92.ON_STOP);
            lq3Var.q = true;
        }
    }
}
