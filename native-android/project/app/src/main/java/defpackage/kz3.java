package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kz3 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity r1, q92 r2) {
        r2.getClass();
        if ((r1 instanceof ba2) == false) goto L8;
        ea2 r3 = ((ba2) r1).h();
        if (r3 == null) goto L9;
        r3.d(r2);
        return;
    L9:
        return;
    }

    public static void b(Activity r3) {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        mz3.a.Companion.getClass();
        ek2.n(r3, new mz3.a());
    L5:
        FragmentManager r4 = r3.getFragmentManager();
        if (r4.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") != null) goto L9;
        r4.beginTransaction().add(new mz3(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
        r4.executePendingTransactions();
        return;
    }
}
