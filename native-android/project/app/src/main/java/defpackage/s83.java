package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s83 extends v33 {
    public final OnBackInvokedDispatcher c;
    public final int d;
    public final OnBackInvokedCallback e;
    public boolean f;

    public s83(OnBackInvokedDispatcher r1, int r2) {
        this.c = r1;
        this.d = r2;
        if (Build.VERSION.SDK_INT != 33) goto L5;
        OnBackInvokedCallback r3 = new vf(2, this);
    L6:
        this.e = r3;
        return;
    L5:
        r3 = new t83(this);
        goto L6
    }

    @Override // defpackage.v33
    public final void b(boolean r3) {
        OnBackInvokedCallback r0 = this.e;
        if (r3 == true) goto L5;
    L8:
        if (r3 == false) goto L10;
        return;
    L10:
        if (this.f == false) goto L14;
        n3.C(this.c, r0);
        this.f = false;
        return;
    L14:
        return;
    L5:
        if (this.f == true) goto L8;
        n3.u(this.c, this.d, r0);
        this.f = true;
    }
}
