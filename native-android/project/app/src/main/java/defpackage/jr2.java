package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jr2 extends Binder implements qu1 {
    public static final /* synthetic */ int f = 0;
    public final WeakReference e;

    public jr2(kr2 kr2Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.e = new WeakReference(kr2Var);
    }

    @Override // defpackage.qu1
    public final int V() {
        kr2 kr2Var = (kr2) this.e.get();
        if (kr2Var != null) {
            return kr2Var.k;
        }
        return -1;
    }

    @Override // defpackage.qu1
    public final boolean Y() {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.qu1
    public final void b0(lu1 lu1Var) {
        kr2 kr2Var = (kr2) this.e.get();
        if (kr2Var == null || lu1Var == null) {
            return;
        }
        kr2Var.f.unregister(lu1Var);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (kr2Var.d) {
        }
    }

    @Override // defpackage.qu1
    public final ei3 g() {
        long j;
        kr2 kr2Var = (kr2) this.e.get();
        if (kr2Var == null) {
            return null;
        }
        ei3 ei3Var = kr2Var.g;
        eo2 eo2Var = kr2Var.i;
        if (ei3Var != null) {
            float f2 = ei3Var.q;
            long j2 = ei3Var.u;
            int i = ei3Var.n;
            long j3 = ei3Var.o;
            long jA = -1;
            if (j3 != -1 && ((i == 3 || i == 4 || i == 5) && j2 > 0)) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j4 = ((long) (f2 * (jElapsedRealtime - j2))) + j3;
                if (eo2Var != null && eo2Var.n.containsKey("android.media.metadata.DURATION")) {
                    jA = eo2Var.a("android.media.metadata.DURATION");
                }
                if (jA < 0 || j4 <= jA) {
                    j = j4 < 0 ? 0L : j4;
                } else {
                    j = jA;
                }
                ArrayList arrayList = new ArrayList();
                long j5 = ei3Var.p;
                long j6 = ei3Var.r;
                int i2 = ei3Var.s;
                CharSequence charSequence = ei3Var.t;
                List list = ei3Var.v;
                if (list != null) {
                    arrayList.addAll(list);
                }
                return new ei3(ei3Var.n, j, j5, ei3Var.q, j6, i2, charSequence, jElapsedRealtime, arrayList, ei3Var.w, ei3Var.x);
            }
        }
        return ei3Var;
    }

    @Override // defpackage.qu1
    public final int h() {
        kr2 kr2Var = (kr2) this.e.get();
        if (kr2Var != null) {
            return kr2Var.j;
        }
        return -1;
    }

    @Override // defpackage.qu1
    public final void l0(lu1 lu1Var) {
        kr2 kr2Var = (kr2) this.e.get();
        if (kr2Var == null || lu1Var == null) {
            return;
        }
        kr2Var.f.register(lu1Var, new ms2("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (kr2Var.d) {
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Bundle bundle;
        lu1 lu1Var = null;
        bundle = null;
        Bundle bundle2 = null;
        lu1 lu1Var2 = null;
        if (i == 3) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof lu1)) {
                    ku1 ku1Var = new ku1();
                    ku1Var.e = strongBinder;
                    lu1Var = ku1Var;
                } else {
                    lu1Var = (lu1) iInterfaceQueryLocalInterface;
                }
            }
            l0(lu1Var);
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof lu1)) {
                    ku1 ku1Var2 = new ku1();
                    ku1Var2.e = strongBinder2;
                    lu1Var2 = ku1Var2;
                } else {
                    lu1Var2 = (lu1) iInterfaceQueryLocalInterface2;
                }
            }
            b0(lu1Var2);
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        if (i == 28) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            ei3 ei3VarG = g();
            parcel2.getClass();
            parcel2.writeNoException();
            if (ei3VarG == null) {
                parcel2.writeInt(0);
                return true;
            }
            parcel2.writeInt(1);
            ei3VarG.writeToParcel(parcel2, 1);
            return true;
        }
        if (i == 37) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            int iH = h();
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(iH);
            return true;
        }
        if (i == 45) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            Y();
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(0);
            return true;
        }
        if (i == 47) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            int iV = V();
            parcel2.getClass();
            parcel2.writeNoException();
            parcel2.writeInt(iV);
            return true;
        }
        if (i != 50) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        kr2 kr2Var = (kr2) this.e.get();
        if (kr2Var != null && (bundle = kr2Var.e) != null) {
            bundle2 = new Bundle(bundle);
        }
        parcel2.getClass();
        parcel2.writeNoException();
        if (bundle2 == null) {
            parcel2.writeInt(0);
            return true;
        }
        parcel2.writeInt(1);
        bundle2.writeToParcel(parcel2, 1);
        return true;
    }
}
