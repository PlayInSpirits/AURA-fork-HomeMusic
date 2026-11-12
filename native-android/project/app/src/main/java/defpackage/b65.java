package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b65 {
    public static pb5 a(View r2) {
        WindowInsets r0 = r2.getRootWindowInsets();
        if (r0 != null) goto L5;
        return null;
    L5:
        pb5 r1 = pb5.g(r0, null);
        mb5 r3 = r1.a;
        r3.w(r1);
        View r4 = r2.getRootView();
        r3.d(r4);
        r3.o(r4);
        r3.p();
        return r1;
    }
}
