package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class v14 implements Parcelable {
    public static final Parcelable.Creator<v14> CREATOR = null;
    public final boolean n;
    public final Handler o;
    public ev1 p;

    static {
        CREATOR = new b23(29);
    }

    public v14(Parcel r3) {
        this.n = false;
        ev1 r0 = null;
        this.o = null;
        IBinder r4 = r3.readStrongBinder();
        int r1 = u14.f;
        if (r4 == null) goto L11;
        IInterface r2 = r4.queryLocalInterface(ev1.d);
        if (r2 != null) goto L8;
    L10:
        dv1 r5 = new dv1();
        r5.e = r4;
        r0 = r5;
        goto L11
    L8:
        if ((r2 instanceof ev1) == false) goto L10;
        r0 = (ev1) r2;
    L11:
        this.p = r0;
    }

    public void a(int r1, Bundle r2) {
    }

    public final void b(int r3, Bundle r4) {
        if (this.n == false) goto L10;
        Handler r0 = this.o;
        if (r0 == null) goto L8;
        r0.post(new eh(this, r3, r4));
        return;
    L8:
        a(r3, r4);
        return;
    L10:
        ev1 r2 = this.p;
        if (r2 == null) goto L17;
        r2.J0(r3, r4);     // Catch: RemoteException -> L14
        return;
    L18:
        return;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (this.p != null) goto L8;
        this.p = new u14(this);     // Catch: Throwable -> L6
    L8:
        r1.writeStrongBinder(this.p.asBinder());     // Catch: Throwable -> L6
        monitor-exit(this);     // Catch: Throwable -> L6
    }

    public v14(Handler r2) {
        this.n = true;
        this.o = r2;
    }
}
