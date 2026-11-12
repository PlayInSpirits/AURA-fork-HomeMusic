package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k70 extends Activity implements ba2, h42 {
    public final ea2 n;

    public k70() {
        this.n = new ea2(this, true);
    }

    @Override // defpackage.h42
    public final boolean c(KeyEvent r1) {
        r1.getClass();
        return super.dispatchKeyEvent(r1);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent r3) {
        r3.getClass();
        View r0 = getWindow().getDecorView();
        r0.getClass();
        if (fu.q(r0, r3) == false) goto L7;
        return true;
    L7:
        return fu.r(this, r0, this, r3);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent r2) {
        r2.getClass();
        View r0 = getWindow().getDecorView();
        r0.getClass();
        if (fu.q(r0, r2) == false) goto L7;
        return true;
    L7:
        return super.dispatchKeyShortcutEvent(r2);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle r1) {
        super.onCreate(r1);
        int r2 = mz3.o;
        kz3.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle r3) {
        r3.getClass();
        this.n.g(r92.p);
        super.onSaveInstanceState(r3);
    }
}
