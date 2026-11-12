package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class af5 implements IInterface {
    public final /* synthetic */ int e;
    public final IBinder f;
    public final String g;

    public /* synthetic */ af5(IBinder r1, String r2, int r3) {
        this.e = r3;
        this.f = r1;
        this.g = r2;
    }

    public void U(Parcel r3, int r4) {
        Parcel r0 = Parcel.obtain();
        this.f.transact(r4, r3, r0, 0);     // Catch: Throwable -> L6
        r0.readException();     // Catch: Throwable -> L6
        r3.recycle();
        r0.recycle();
        return;
    L6:
        th = move-exception;
        r3.recycle();
        r0.recycle();
        throw th;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch(this.e) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f;
    L7:
        return this.f;
    }

    public Parcel m() {
        Parcel r0 = Parcel.obtain();
        r0.writeInterfaceToken(this.g);
        return r0;
    }
}
