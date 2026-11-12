package defpackage;

import com.eddyizm.tempus.interfaces.StarCallback;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h7 implements StarCallback {
    public final /* synthetic */ int n;
    public final /* synthetic */ j7 o;

    public /* synthetic */ h7(j7 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // com.eddyizm.tempus.interfaces.StarCallback
    public final void onError() {
        int r0 = this.n;
        j7 r3 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r3.e.J(null, r3.g.getId(), true, null);
        return;
    L6:
        r3.e.J(null, r3.g.getId(), false, null);
    }
}
