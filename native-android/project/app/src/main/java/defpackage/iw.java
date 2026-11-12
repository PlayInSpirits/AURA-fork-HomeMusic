package defpackage;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iw extends Binder {
    public static final int f = 0;
    public final yw1 e;

    static {
        if (Build.VERSION.SDK_INT < 30) goto L5;
        int r0 = l3.a();
    L6:
        f = r0;
        return;
    L5:
        r0 = 65536;
        goto L6
    }

    public iw(List r1) {
        this.e = yw1.k(r1);
    }

    public static yw1 a(IBinder r7) {
        if ((r7 instanceof iw) == true) goto L5;
        uw1 r0 = yw1.j();
        int r4 = 0;
        int r3 = 1;
    L7:
        if (r3 == 0) goto L24;
        Parcel r5 = Parcel.obtain();
        Parcel r6 = Parcel.obtain();
        r5.writeInt(r4);     // Catch: Throwable -> L15
        r7.transact(1, r5, r6, 0);     // Catch: Throwable -> L15 RemoteException -> L18
    L11:
        int r8 = r6.readInt();     // Catch: Throwable -> L15
        if (r8 != 1) goto L17;
        Bundle r9 = r6.readBundle();     // Catch: Throwable -> L15
        r9.getClass();     // Catch: Throwable -> L15
        r0.c(r9);     // Catch: Throwable -> L15
        r4 = r4 + 1;
        goto L11
    L17:
        r6.recycle();
        r5.recycle();
        r3 = r8;
        goto L7
    L18:
        e = move-exception;
        throw new RuntimeException(e);     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        r6.recycle();
        r5.recycle();
        throw th;
    L24:
        return r0.f();
    L5:
        return ((iw) r7).e;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int r4, Parcel r5, Parcel r6, int r7) {
        if (r4 != 1) goto L5;
        int r8 = 0;
        if (r6 != null) goto L9;
        return false;
    L9:
        yw1 r3 = this.e;
        int r9 = r3.size();
        int r10 = r5.readInt();
    L10:
        if (r10 >= r9) goto L14;
        if (r6.dataSize() >= f) goto L14;
        r6.writeInt(1);
        r6.writeBundle((Bundle) r3.get(r10));
        r10 = r10 + 1;
    L14:
        if (r10 >= r9) goto L16;
        r8 = 2;
    L16:
        r6.writeInt(r8);
        return true;
    L5:
        return super.onTransact(r4, r5, r6, r7);
    }
}
