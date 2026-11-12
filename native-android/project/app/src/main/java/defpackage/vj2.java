package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vj2 implements Runnable {
    public final /* synthetic */ hg3 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ String p;
    public final /* synthetic */ int q;
    public final /* synthetic */ pz1 r;

    public vj2(pz1 r1, hg3 r2, int r3, String r4, int r5, Bundle r6) {
        this.r = r1;
        this.n = r2;
        this.o = r3;
        this.p = r4;
        this.q = r5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hg3 r5 = this.n;
        IBinder r6 = ((Messenger) r5.o).getBinder();
        pz1 r0 = this.r;
        ((pn2) r0.o).r.remove(r6);
        pn2 r1 = (pn2) r0.o;
        Iterator r7 = r1.q.iterator();
    L3:
        oj2 r2 = null;
        if (r7.hasNext() == false) goto L13;
        oj2 r3 = (oj2) r7.next();
        if (r3.c != this.o) goto L3;
        if (TextUtils.isEmpty(this.p) == false) goto L10;
    L11:
        r2 = new oj2(r1, r3.a, r3.b, r3.c, r5);
    L12:
        r7.remove();
        goto L13
    L10:
        if (this.q > 0) goto L12;
    L13:
        if (r2 != null) goto L15;
        int r4 = this.q;
        int r8 = this.o;
        r2 = new oj2(r1, this.p, r4, r8, r5);
    L15:
        r1.r.put(r6, r2);
        r6.linkToDeath(r2, 0);     // Catch: RemoteException -> L18
        return;
    L18:
        l93.q0("MBServiceCompat", "IBinder is already dead.");
    }
}
