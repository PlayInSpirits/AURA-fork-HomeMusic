package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kz3 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, q92 q92Var) {
        ea2 ea2VarH;
        q92Var.getClass();
        if (!(activity instanceof ba2) || (ea2VarH = ((ba2) activity).h()) == null) {
            return;
        }
        ea2VarH.d(q92Var);
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            mz3.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new mz3.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new mz3(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
