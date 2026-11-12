package defpackage;

import android.os.Looper;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y24 extends q12 {
    public final /* synthetic */ t24 b;

    public y24(String[] r1, t24 r2) {
        this.b = r2;
        super(r1);
    }

    @Override // defpackage.q12
    public final void a(Set r3) {
        r3.getClass();
        ei r4 = ei.V();
        jq3 r0 = new jq3(5, this.b);
        r4.j.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) goto L5;
        boolean r2 = true;
    L6:
        if (r2 == false) goto L9;
        r0.run();
        return;
    L9:
        r4.W(r0);
        return;
    L5:
        r2 = false;
        goto L6
    }
}
