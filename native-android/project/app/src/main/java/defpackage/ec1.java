package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ec1 extends ic1 {
    public final /* synthetic */ kc1 a;

    public ec1(kc1 r1) {
        this.a = r1;
    }

    @Override // defpackage.ic1
    public final void a() {
        kc1 r2 = this.a;
        ((xm2) r2.g0.o).a();
        e54.b(r2);
        Bundle r0 = r2.o;
        if (r0 == null) goto L5;
        Bundle r1 = r0.getBundle("registryState");
    L6:
        r2.g0.s(r1);
        return;
    L5:
        r1 = null;
        goto L6
    }
}
