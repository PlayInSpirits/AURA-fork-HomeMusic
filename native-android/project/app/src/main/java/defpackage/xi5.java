package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xi5 extends fh5 {
    public final IBinder g;
    public final /* synthetic */ a h;

    public xi5(a r1, int r2, IBinder r3, Bundle r4) {
        this.h = r1;
        super(r1, r2, r4);
        this.g = r3;
    }

    @Override // defpackage.fh5
    public final void a(ka0 r1) {
        c05 r0 = this.h.B;
        if (r0 == null) goto L5;
        ((hj1) r0.n).m(r1);
    L5:
        System.currentTimeMillis();
    }

    @Override // defpackage.fh5
    public final boolean b() {
        IBinder r1 = this.g;
        ji2.m(r1);     // Catch: RemoteException -> L20
        String r3 = r1.getInterfaceDescriptor();     // Catch: RemoteException -> L20
        a r5 = this.h;
        if (r5.f().equals(r3) == true) goto L8;
        Log.w("GmsClient", "service descriptor mismatch: " + r5.f() + " vs. " + r3);
        return false;
    L8:
        IInterface r0 = r5.a(r1);
        if (r0 != null) goto L11;
    L19:
        return false;
    L11:
        if (a.j(r5, 2, 4, r0) == false) goto L13;
    L14:
        r5.F = null;
        oz4 r6 = r5.A;
        if (r6 == null) goto L24;
        ((gj1) r6.n).X();
        return true;
    L24:
        return true;
    L13:
        if (a.j(r5, 3, 4, r0) == false) goto L19;
    L20:
        Log.w("GmsClient", "service probably died");
        return false;
    }
}
