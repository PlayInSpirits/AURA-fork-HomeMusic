package defpackage;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xu4 {
    public static OnBackInvokedDispatcher a(View r0) {
        return r0.findOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Runnable r2) {
        Objects.requireNonNull(r2);
        return new vf(3, r2);
    }

    public static void c(Object r1, Object r2) {
        ((OnBackInvokedDispatcher) r1).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) r2);
    }

    public static void d(Object r0, Object r1) {
        ((OnBackInvokedDispatcher) r0).unregisterOnBackInvokedCallback((OnBackInvokedCallback) r1);
    }
}
