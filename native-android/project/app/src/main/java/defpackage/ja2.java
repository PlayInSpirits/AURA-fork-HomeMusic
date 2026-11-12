package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ja2 extends Service implements ba2 {
    public final qp4 n;

    public ja2() {
        this.n = new qp4(this);
    }

    @Override // defpackage.ba2
    public final ea2 h() {
        return (ea2) this.n.a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent r1) {
        r1.getClass();
        qp4 r0 = this.n;
        r0.getClass();
        r0.m(q92.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        qp4 r0 = this.n;
        r0.getClass();
        r0.m(q92.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        qp4 r0 = this.n;
        r0.getClass();
        r0.m(q92.ON_STOP);
        r0.m(q92.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent r3, int r4) {
        qp4 r0 = this.n;
        r0.getClass();
        r0.m(q92.ON_START);
        super.onStart(r3, r4);
    }
}
