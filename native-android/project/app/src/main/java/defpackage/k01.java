package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k01 extends rz0 implements Runnable {
    public final WeakReference n;

    public k01(EditText r2) {
        this.n = new WeakReference(r2);
    }

    @Override // defpackage.rz0
    public final void b() {
        EditText r0 = (EditText) this.n.get();
        if (r0 == null) goto L10;
        Handler r1 = r0.getHandler();
        if (r1 != null) goto L8;
        return;
    L8:
        r1.post(this);
        return;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l01.a((EditText) this.n.get(), 1);
    }
}
