package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wf {
    public static OnBackInvokedDispatcher a(Activity r0) {
        return n3.l(r0);
    }

    public static OnBackInvokedCallback b(Object r2, bg r3) {
        Objects.requireNonNull(r3);
        vf r0 = new vf(0, r3);
        n3.v(n3.n(r2), r0);
        return r0;
    }

    public static void c(Object r0, Object r1) {
        OnBackInvokedCallback r2 = n3.i(r1);
        n3.w(n3.n(r0), r2);
    }
}
