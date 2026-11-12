package defpackage;

import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mj2 extends uj2 {
    public final /* synthetic */ oj2 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Bundle g;
    public final /* synthetic */ Bundle h;
    public final /* synthetic */ pn2 i;

    public mj2(pn2 r1, String r2, oj2 r3, String r4, Bundle r5, Bundle r6) {
        this.i = r1;
        this.e = r3;
        this.f = r4;
        this.g = r5;
        this.h = r6;
        super(r2);
    }

    @Override // defpackage.uj2
    public final void d(Object r7) {
        List r8 = (List) r7;
        oi r0 = this.i.r;
        oj2 r1 = this.e;
        hg3 r2 = r1.e;
        String r3 = r1.a;
        r2.getClass();
        Object r4 = r0.get(((Messenger) r2.o).getBinder());
        String r5 = this.f;
        if (r4 == r1) goto L10;
        l93.A("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + r3 + " id=" + r5);
        return;
    L10:
        r2.H(r5, r8, this.g, this.h);     // Catch: RemoteException -> L8
        return;
    L8:
        l93.q0("MBServiceCompat", "Calling onLoadChildren() failed for id=" + r5 + " package=" + r3);
    }
}
