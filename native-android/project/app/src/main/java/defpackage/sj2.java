package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class sj2 extends bq4 {
    public final /* synthetic */ pn2 s;

    public sj2(pn2 r1) {
        this.s = r1;
        super(r1);
    }

    @Override // defpackage.bq4
    public final void p(String r1, Bundle r2) {
        if (r2 == null) goto L5;
        qj2 r0 = (qj2) this.o;
        r0.getClass();
        r0.notifyChildrenChanged(r1, r2);
        return;
    L5:
        super.p(r1, r2);
    }

    @Override // defpackage.bq4
    public final void r() {
        rj2 r0 = new rj2(this, this.s);
        this.o = r0;
        r0.onCreate();
    }
}
