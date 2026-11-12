package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class av1 implements cv1, IInterface {
    public final IBinder e;

    public av1(IBinder r1) {
        this.e = r1;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.e;
    }
}
