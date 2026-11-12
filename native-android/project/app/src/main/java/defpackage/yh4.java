package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yh4 extends sg3 {
    public View b;
    public WindowInsetsController c;

    /* JADX WARN: Type inference failed for: r3v0, types: [xh4] */
    @Override // defpackage.sg3
    public final void a() {
        View r0 = this.b;
        WindowInsetsController r1 = this.c;
        if (r1 != null) goto L8;
        if (r0 == null) goto L7;
        r1 = xq2.m(r0);
        goto L8
    L7:
        r1 = null;
    L8:
        if (r1 == null) goto L15;
        final AtomicBoolean r5 = new AtomicBoolean(false);
        ?? r3 = new xh4(r5);
        xq2.w(r1, r3);
        if (r5.get() == true) goto L13;
        if (r0 == null) goto L13;
        ((InputMethodManager) r0.getContext().getSystemService("input_method")).hideSoftInputFromWindow(r0.getWindowToken(), 0);
    L13:
        xq2.C(r1, r3);
        xq2.B(r1, xq2.b());
        return;
    L15:
        super.a();
    }

    @Override // defpackage.sg3
    public final void b() {
        View r0 = this.b;
        if (r0 != null) goto L5;
    L7:
        WindowInsetsController r1 = this.c;
        if (r1 != null) goto L13;
        if (r0 == null) goto L12;
        r1 = xq2.m(r0);
        goto L13
    L12:
        r1 = null;
    L13:
        if (r1 == null) goto L15;
        xq2.v(r1, xq2.b());
    L15:
        super.b();
        return;
    L5:
        if (Build.VERSION.SDK_INT >= 33) goto L7;
        ((InputMethodManager) r0.getContext().getSystemService("input_method")).isActive();
        goto L7
    }
}
