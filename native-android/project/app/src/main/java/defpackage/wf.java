package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wf {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, bg bgVar) {
        Objects.requireNonNull(bgVar);
        vf vfVar = new vf(0, bgVar);
        n3.n(obj).registerOnBackInvokedCallback(1000000, vfVar);
        return vfVar;
    }

    public static void c(Object obj, Object obj2) {
        n3.n(obj).unregisterOnBackInvokedCallback(n3.i(obj2));
    }
}
