package defpackage;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class ah2 {
    public OnBackInvokedCallback a;

    public OnBackInvokedCallback a(zg2 r2) {
        Objects.requireNonNull(r2);
        return new vf(1, r2);
    }

    public void b(zg2 r2, View r3, boolean r4) {
        if (this.a != null) goto L14;
        OnBackInvokedDispatcher r5 = n3.m(r3);
        if (r5 != null) goto L8;
        return;
    L8:
        OnBackInvokedCallback r6 = a(r2);
        this.a = r6;
        if (r4 == false) goto L11;
        int r1 = 1000000;
    L12:
        n3.u(r5, r1, r6);
        return;
    L11:
        r1 = 0;
        goto L12
    }

    public void c(View r2) {
        OnBackInvokedDispatcher r3 = n3.m(r2);
        if (r3 != null) goto L5;
        return;
    L5:
        n3.C(r3, this.a);
        this.a = null;
    }
}
