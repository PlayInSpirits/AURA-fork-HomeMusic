package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sk5 implements IInterface {
    public final IBinder e;
    public final String f;

    public sk5(IBinder r1, String r2) {
        this.e = r1;
        this.f = r2;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.e;
    }
}
