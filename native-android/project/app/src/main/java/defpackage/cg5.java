package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cg5 {
    public final int a;

    public cg5(int r1) {
        this.a = r1;
    }

    public static Status e(RemoteException r3) {
        return new Status(19, r3.getClass().getSimpleName() + ": " + r3.getLocalizedMessage(), null, null);
    }

    public abstract void a(Status r1);

    public abstract void b(Exception r1);

    public abstract void c(gf5 r1);

    public abstract void d(xc5 r1, boolean r2);
}
