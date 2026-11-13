package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class k01 extends rz0 implements Runnable {
    public final WeakReference n;

    public k01(EditText editText) {
        this.n = new WeakReference(editText);
    }

    @Override // defpackage.rz0
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.n.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        l01.a((EditText) this.n.get(), 1);
    }
}
