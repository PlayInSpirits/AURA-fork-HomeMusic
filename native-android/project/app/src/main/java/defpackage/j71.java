package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j71 implements pe1 {
    public final Set n = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean o;

    @Override // defpackage.pe1
    public final void i(nc1 nc1Var) {
        if (!this.o && this.n.add(nc1Var)) {
            View decorView = nc1Var.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new i71(this, decorView));
        }
    }
}
