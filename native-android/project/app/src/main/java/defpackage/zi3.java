package defpackage;

import com.eddyizm.tempus.interfaces.StarCallback;
import com.eddyizm.tempus.subsonic.models.Child;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zi3 implements StarCallback {
    public final /* synthetic */ int n;
    public final /* synthetic */ Child o;
    public final /* synthetic */ aj3 p;

    public /* synthetic */ zi3(aj3 r1, Child r2, int r3) {
        this.n = r3;
        this.p = r1;
        this.o = r2;
    }

    @Override // com.eddyizm.tempus.interfaces.StarCallback
    public final void onError() {
        int r0 = this.n;
        Child r2 = this.o;
        aj3 r3 = this.p;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r3.g.J(r2.getId(), null, true, null);
        return;
    L6:
        r3.g.J(r2.getId(), null, false, null);
    }
}
