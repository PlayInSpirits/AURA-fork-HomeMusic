package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qh5 extends zw2 {
    public final /* synthetic */ a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh5(a aVar, Looper looper) {
        super(looper, 4);
        this.b = aVar;
    }

    @Override // defpackage.zw2, android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        int i = this.b.I.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if (i3 == 2 || i3 == 1 || i3 == 7) {
                fh5 fh5Var = (fh5) message.obj;
                fh5Var.getClass();
                fh5Var.c();
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !this.b.c0()) {
            fh5 fh5Var2 = (fh5) message.obj;
            fh5Var2.getClass();
            fh5Var2.c();
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            a aVar = this.b;
            aVar.F = new ka0(message.arg2);
            if (!aVar.G && !TextUtils.isEmpty(aVar.f()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(aVar.f());
                    a aVar2 = this.b;
                    if (!aVar2.G) {
                        aVar2.k(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            a aVar3 = this.b;
            ka0 ka0Var = aVar3.F;
            if (ka0Var == null) {
                ka0Var = new ka0(8);
            }
            aVar3.v.k(ka0Var);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            a aVar4 = this.b;
            ka0 ka0Var2 = aVar4.F;
            if (ka0Var2 == null) {
                ka0Var2 = new ka0(8);
            }
            aVar4.v.k(ka0Var2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            this.b.v.k(new ka0(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            this.b.k(5, null);
            oz4 oz4Var = this.b.A;
            if (oz4Var != null) {
                ((gj1) oz4Var.n).U(message.arg2);
            }
            System.currentTimeMillis();
            a.j(this.b, 5, 1, null);
            return;
        }
        if (i4 == 2 && !this.b.Y()) {
            fh5 fh5Var3 = (fh5) message.obj;
            fh5Var3.getClass();
            fh5Var3.c();
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            Log.wtf("GmsClient", f34.f(i5, "Don't know how to handle message: "), new Exception());
            return;
        }
        fh5 fh5Var4 = (fh5) message.obj;
        synchronized (fh5Var4) {
            try {
                bool = fh5Var4.a;
                if (fh5Var4.b) {
                    Log.w("GmsClient", "Callback proxy " + fh5Var4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            a aVar5 = fh5Var4.f;
            int i6 = fh5Var4.d;
            if (i6 != 0) {
                aVar5.k(1, null);
                Bundle bundle = fh5Var4.e;
                fh5Var4.a(new ka0(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!fh5Var4.b()) {
                aVar5.k(1, null);
                fh5Var4.a(new ka0(8, null));
            }
        }
        synchronized (fh5Var4) {
            fh5Var4.b = true;
        }
        fh5Var4.c();
    }
}
