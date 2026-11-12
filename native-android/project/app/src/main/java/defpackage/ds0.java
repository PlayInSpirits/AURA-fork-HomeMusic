package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ds0 implements gf1 {
    public final /* synthetic */ boolean n;
    public final /* synthetic */ rm3 o;
    public final /* synthetic */ String p;

    public /* synthetic */ ds0(boolean r1, rm3 r2, String r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        boolean r0 = this.n;
        rm3 r1 = this.o;
        String r2 = this.p;
        if (r0 == false) goto L13;
        xm2 r3 = (xm2) r1.n;
        xi4 r4 = (xi4) r3.f;
        monitor-enter(r4);
        i54 r5 = (i54) ((LinkedHashMap) r3.g).remove(r2);     // Catch: Throwable -> L9
        monitor-exit(r4);
    L9:
        th = move-exception;
        throw th;
    L13:
        return j15.a;
    }
}
