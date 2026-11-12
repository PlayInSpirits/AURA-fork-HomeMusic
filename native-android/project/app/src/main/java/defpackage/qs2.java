package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.media3.session.MediaLibraryService;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qs2 extends Binder implements su1 {
    public final WeakReference e;
    public final Handler f;
    public final Set g;

    public qs2(MediaLibraryService mediaLibraryService) {
        attachInterface(this, "androidx.media3.session.IMediaSessionService");
        this.e = new WeakReference(mediaLibraryService);
        this.f = new Handler(mediaLibraryService.getApplicationContext().getMainLooper());
        this.g = Collections.synchronizedSet(new HashSet());
    }

    public static su1 m(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSessionService");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof su1)) {
            return (su1) iInterfaceQueryLocalInterface;
        }
        ru1 ru1Var = new ru1();
        ru1Var.e = iBinder;
        return ru1Var;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.su1
    public final void k0(ju1 ju1Var, Bundle bundle) {
        if (ju1Var == null || bundle == null) {
            au0.k(ju1Var);
            return;
        }
        try {
            ja0 ja0VarA = ja0.a(bundle);
            String str = ja0VarA.c;
            MediaLibraryService mediaLibraryService = (MediaLibraryService) this.e.get();
            if (mediaLibraryService == null) {
                au0.k(ju1Var);
                return;
            }
            int callingPid = Binder.getCallingPid();
            int callingUid = Binder.getCallingUid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            if (callingPid == 0) {
                callingPid = ja0VarA.d;
            }
            if (au0.f(callingUid, mediaLibraryService, str) == 0) {
                ms2 ms2Var = new ms2(str, callingPid, callingUid);
                boolean zG = hg3.E(mediaLibraryService.getApplicationContext()).G(ms2Var);
                this.g.add(ju1Var);
                try {
                    this.f.post(new io2(this, ju1Var, ms2Var, ja0VarA, zG, 1));
                    return;
                } finally {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
            l93.q0("MSessionService", "Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
            au0.k(ju1Var);
        } catch (RuntimeException e) {
            l93.r0("MSessionService", "Ignoring malformed Bundle for ConnectionRequest", e);
            au0.k(ju1Var);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaSessionService");
            return true;
        }
        if (i != 3001) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        k0(mm2.m(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }
}
