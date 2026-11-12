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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi5(a aVar, int i, IBinder iBinder, Bundle bundle) {
        super(aVar, i, bundle);
        this.h = aVar;
        this.g = iBinder;
    }

    @Override // defpackage.fh5
    public final void a(ka0 ka0Var) {
        c05 c05Var = this.h.B;
        if (c05Var != null) {
            ((hj1) c05Var.n).m(ka0Var);
        }
        System.currentTimeMillis();
    }

    @Override // defpackage.fh5
    public final boolean b() {
        IBinder iBinder = this.g;
        try {
            ji2.m(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            a aVar = this.h;
            if (!aVar.f().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + aVar.f() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceA = aVar.a(iBinder);
            if (iInterfaceA == null || !(a.j(aVar, 2, 4, iInterfaceA) || a.j(aVar, 3, 4, iInterfaceA))) {
                return false;
            }
            aVar.F = null;
            oz4 oz4Var = aVar.A;
            if (oz4Var == null) {
                return true;
            }
            ((gj1) oz4Var.n).X();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
