package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class xx3 implements IBinder.DeathRecipient {
    public final Messenger a;
    public final b9 b;
    public final Messenger c;
    public int f;
    public int g;
    public final /* synthetic */ cy3 i;
    public int d = 1;
    public int e = 1;
    public final SparseArray h = new SparseArray();

    public xx3(cy3 cy3Var, Messenger messenger) {
        this.i = cy3Var;
        this.a = messenger;
        b9 b9Var = new b9(this);
        this.b = b9Var;
        this.c = new Messenger(b9Var);
    }

    public final void a(int i) {
        int i2 = this.d;
        this.d = i2 + 1;
        b(5, i2, i, null, null);
    }

    public final boolean b(int i, int i2, int i3, Bundle bundle, Bundle bundle2) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = bundle;
        obtain.setData(bundle2);
        obtain.replyTo = this.c;
        try {
            this.a.send(obtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e) {
            if (i == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
            return false;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.i.w.post(new wx3(this, 1));
    }

    public final void c(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.d;
        this.d = i3 + 1;
        b(7, i3, i, null, bundle);
    }

    public final void d(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.d;
        this.d = i3 + 1;
        b(8, i3, i, null, bundle);
    }
}
