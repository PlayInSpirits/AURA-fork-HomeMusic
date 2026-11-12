package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
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

    public qs2(MediaLibraryService r2) {
        attachInterface(this, "androidx.media3.session.IMediaSessionService");
        this.e = new WeakReference(r2);
        this.f = new Handler(r2.getApplicationContext().getMainLooper());
        this.g = Collections.synchronizedSet(new HashSet());
    }

    public static su1 m(IBinder r2) {
        if (r2 != null) goto L5;
        return null;
    L5:
        IInterface r0 = r2.queryLocalInterface("androidx.media3.session.IMediaSessionService");
        if (r0 != null) goto L8;
    L11:
        ru1 r1 = new ru1();
        r1.e = r2;
        return r1;
    L8:
        if ((r0 instanceof su1) == false) goto L11;
        return (su1) r0;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.su1
    public final void k0(ju1 r12, Bundle r13) {
        if (r12 == null) goto L29;
        if (r13 == null) goto L29;
        ja0 r6 = ja0.a(r13);     // Catch: RuntimeException -> L26
        String r14 = r6.c;
        MediaLibraryService r0 = (MediaLibraryService) this.e.get();
        if (r0 != null) goto L11;
        au0.k(r12);
        return;
    L11:
        int r2 = Binder.getCallingPid();
        int r3 = Binder.getCallingUid();
        long r9 = Binder.clearCallingIdentity();
        if (r2 != 0) goto L16;
        r2 = r6.d;
    L16:
        if (au0.f(r3, r0, r14) == 0) goto L19;
        l93.q0("MSessionService", "Ignoring connection from invalid package name " + r14 + " (uid=" + r3 + ")");
        au0.k(r12);
        return;
    L19:
        ms2 r5 = new ms2(r14, r2, r3);
        boolean r7 = hg3.E(r0.getApplicationContext()).G(r5);
        this.g.add(r12);
        this.f.post(new io2(this, r12, r5, r6, r7, 1));     // Catch: Throwable -> L23
        Binder.restoreCallingIdentity(r9);
        return;
    L23:
        th = move-exception;
        Binder.restoreCallingIdentity(r9);
        throw th;
    L26:
        e = move-exception;
        l93.r0("MSessionService", "Ignoring malformed Bundle for ConnectionRequest", e);
        au0.k(r12);
        return;
    L29:
        au0.k(r12);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel r5, Parcel r6, int r7) {
        if (r4 < 1) goto L8;
        if (r4 > 16777215) goto L8;
        r5.enforceInterface("androidx.media3.session.IMediaSessionService");
    L8:
        if (r4 != 1598968902) goto L12;
        r6.writeString("androidx.media3.session.IMediaSessionService");
        return true;
    L12:
        if (r4 != 3001) goto L14;
        ju1 r8 = mm2.m(r5.readStrongBinder());
        Parcelable.Creator r9 = Bundle.CREATOR;
        if (r5.readInt() == 0) goto L18;
        Object r10 = r9.createFromParcel(r5);
    L19:
        k0(r8, (Bundle) r10);
        return true;
    L18:
        r10 = null;
        goto L19
    L14:
        return super.onTransact(r4, r5, r6, r7);
    }
}
