package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xx3 implements IBinder.DeathRecipient {
    public final Messenger a;
    public final b9 b;
    public final Messenger c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final SparseArray h;
    public final /* synthetic */ cy3 i;

    public xx3(cy3 r1, Messenger r2) {
        this.i = r1;
        this.d = 1;
        this.e = 1;
        this.h = new SparseArray();
        this.a = r2;
        b9 r3 = new b9(this);
        this.b = r3;
        this.c = new Messenger(r3);
    }

    public final void a(int r7) {
        int r2 = this.d;
        this.d = r2 + 1;
        b(5, r2, r7, null, null);
    }

    public final boolean b(int r2, int r3, int r4, Bundle r5, Bundle r6) {
        Message r0 = Message.obtain();
        r0.what = r2;
        r0.arg1 = r3;
        r0.arg2 = r4;
        r0.obj = r5;
        r0.setData(r6);
        r0.replyTo = this.c;
        this.a.send(r0);     // Catch: RemoteException -> L6 DeadObjectException -> L12
        return true;
    L6:
        e = move-exception;
        if (r2 == 2) goto L15;
        Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
        return false;
    L15:
        return false;
    L16:
        return false;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.i.w.post(new wx3(this, 1));
    }

    public final void c(int r7, int r8) {
        Bundle r5 = new Bundle();
        r5.putInt("volume", r8);
        int r2 = this.d;
        this.d = r2 + 1;
        b(7, r2, r7, null, r5);
    }

    public final void d(int r7, int r8) {
        Bundle r5 = new Bundle();
        r5.putInt("volume", r8);
        int r2 = this.d;
        this.d = r2 + 1;
        b(8, r2, r7, null, r5);
    }
}
