/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import defpackage.hg3;
import defpackage.l93;
import defpackage.oj2;
import defpackage.pn2;
import defpackage.pz1;
import java.util.Iterator;

public final class vj2
implements Runnable {
    public final hg3 n;
    public final int o;
    public final String p;
    public final int q;
    public final pz1 r;

    public vj2(pz1 pz12, hg3 hg32, int n16, String string, int n17, Bundle bundle) {
        this.r = pz12;
        this.n = hg32;
        this.o = n16;
        this.p = string;
        this.q = n17;
    }

    @Override
    public final void run() {
        Object object;
        pn2 pn22;
        Object object2;
        IBinder iBinder;
        hg3 hg32;
        block7: {
            Iterator iterator;
            block9: {
                oj2 oj22;
                block8: {
                    hg32 = this.n;
                    iBinder = ((Messenger)hg32.o).getBinder();
                    object2 = this.r;
                    ((pn2)((pz1)object2).o).r.remove(iBinder);
                    pn22 = (pn2)((pz1)object2).o;
                    iterator = pn22.q.iterator();
                    do {
                        boolean bl5 = iterator.hasNext();
                        object2 = null;
                        object = null;
                        if (!bl5) break block7;
                        oj22 = (oj2)iterator.next();
                    } while (oj22.c != this.o);
                    if (TextUtils.isEmpty(this.p)) break block8;
                    object2 = object;
                    if (this.q > 0) break block9;
                }
                object2 = new oj2(pn22, oj22.a, oj22.b, oj22.c, hg32);
            }
            iterator.remove();
        }
        object = object2;
        if (object2 == null) {
            int n16 = this.q;
            int n17 = this.o;
            object = new oj2(pn22, this.p, n16, n17, hg32);
        }
        pn22.r.put(iBinder, object);
        try {
            iBinder.linkToDeath((IBinder.DeathRecipient)object, 0);
            return;
        }
        catch (RemoteException remoteException) {
            l93.q0("MBServiceCompat", "IBinder is already dead.");
            return;
        }
    }
}

