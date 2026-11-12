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

    public vj2(pz1 pz1Var, hg3 hg3Var, int i, String str, int i2, Bundle bundle) {
        this.r = pz1Var;
        this.n = hg3Var;
        this.o = i;
        this.p = str;
        this.q = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj2 oj2Var;
        hg3 hg3Var = this.n;
        IBinder binder = ((Messenger) hg3Var.o).getBinder();
        pz1 pz1Var = this.r;
        ((pn2) pz1Var.o).r.remove(binder);
        pn2 pn2Var = (pn2) pz1Var.o;
        Iterator it = pn2Var.q.iterator();
        while (true) {
            oj2Var = null;
            if (!it.hasNext()) {
                break;
            }
            oj2 oj2Var2 = (oj2) it.next();
            if (oj2Var2.c == this.o) {
                oj2Var = (TextUtils.isEmpty(this.p) || this.q <= 0) ? new oj2(pn2Var, oj2Var2.a, oj2Var2.b, oj2Var2.c, hg3Var) : null;
                it.remove();
                break;
            }
        }
        if (oj2Var == null) {
            oj2Var = new oj2(pn2Var, this.p, this.q, this.o, hg3Var);
        }
        pn2Var.r.put(binder, oj2Var);
        try {
            binder.linkToDeath(oj2Var, 0);
        } catch (RemoteException unused) {
            l93.q0("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
