package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j71 implements pe1 {
    public final Set n;
    public volatile boolean o;

    public j71() {
        this.n = Collections.newSetFromMap(new WeakHashMap());
    }

    @Override // defpackage.pe1
    public final void i(nc1 r3) {
        if (this.o == false) goto L6;
        return;
    L6:
        if (this.n.add(r3) == true) goto L8;
        return;
    L8:
        View r4 = r3.getWindow().getDecorView();
        r4.getViewTreeObserver().addOnDrawListener(new i71(this, r4));
    }
}
