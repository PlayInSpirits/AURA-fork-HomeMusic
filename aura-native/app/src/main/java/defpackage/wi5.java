package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wi5 implements ServiceConnection {
    public final int n;
    public final /* synthetic */ a o;

    public wi5(a aVar, int i) {
        this.o = aVar;
        this.n = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        a aVar = this.o;
        if (iBinder == null) {
            synchronized (aVar.s) {
                i = aVar.z;
            }
            if (i == 3) {
                aVar.G = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            qh5 qh5Var = aVar.r;
            qh5Var.sendMessage(qh5Var.obtainMessage(i2, aVar.I.get(), 16));
            return;
        }
        synchronized (aVar.t) {
            try {
                a aVar2 = this.o;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.u = (queryLocalInterface == null || !(queryLocalInterface instanceof ih5)) ? new ih5(iBinder) : (ih5) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        a aVar3 = this.o;
        int i3 = this.n;
        fj5 fj5Var = new fj5(aVar3, 0);
        qh5 qh5Var2 = aVar3.r;
        qh5Var2.sendMessage(qh5Var2.obtainMessage(7, i3, -1, fj5Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a aVar;
        synchronized (this.o.t) {
            aVar = this.o;
            aVar.u = null;
        }
        int i = this.n;
        qh5 qh5Var = aVar.r;
        qh5Var.sendMessage(qh5Var.obtainMessage(6, i, 1));
    }
}
