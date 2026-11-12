package defpackage;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.eddyizm.tempus.service.MediaService;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wo2 extends oq2 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ wo2(int r1, Object r2, Object r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override // defpackage.oq2
    public void e() {
        switch(this.a) {
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        hd5 r0 = ((s25) this.b).w;
        if (r0 == null) goto L11;
        MediaService r1 = (MediaService) r0.o;
        g25 r5 = (g25) this.c;
        q25 r2 = r1.x;
        f25 r3 = (f25) r0.p;
        Looper r4 = r1.getMainLooper();
        r4.getClass();
        q25 r6 = new q25(r3, r5, r4, r1);
        r1.x = r6;
        r1.q(r6);
        r1.s(r1.p().a(), r6);
        if (r2 == null) goto L12;
        r2.A1();
        return;
    L12:
        return;
    }

    @Override // defpackage.oq2
    public void f(int r6) {
        switch(this.a) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        String r0 = (String) this.b;
        if (r0 == null) goto L25;
        vo2 r5 = (vo2) this.c;
        if (r5 == null) goto L28;
        Messenger r1 = r5.h;
        MediaRouter2.RoutingController r2 = r5.g;
        if (r2 != null) goto L13;
        return;
    L13:
        if (to2.w(r2) == true) goto L27;
        if (r1 == null) goto L29;
        int r3 = r5.l.getAndIncrement();
        Message r4 = Message.obtain();
        r4.what = 7;
        r4.arg1 = r3;
        Bundle r7 = new Bundle();
        r7.putInt("volume", r6);
        r7.putString("routeId", r0);
        r4.setData(r7);
        r4.replyTo = r5.i;
        r1.send(r4);     // Catch: RemoteException -> L19 DeadObjectException -> L22
        goto L31
    L30:
        return;
    L19:
        e = move-exception;
        Log.e("MR2Provider", "Could not send control request to service.", e);
        return;
    L31:
        return;
    L29:
        return;
    L27:
        return;
    L28:
        return;
    }

    @Override // defpackage.oq2
    public void h(int r3) {
        switch(this.a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.h(r3);
        return;
    L6:
        hd5 r4 = ((s25) this.b).w;
        if (r4 == null) goto L16;
        g25 r2 = (g25) this.c;
        MediaService r5 = (MediaService) r4.o;
        q25 r0 = r5.x;
        if (r0 != null) goto L12;
        return;
    L12:
        if (h12.c(r0.k, r2) == false) goto L18;
        r5.x = null;
        r5.s(r0, r5.o());
        r0.A1();
        return;
    L18:
        return;
    }

    @Override // defpackage.oq2
    public void i(int r6) {
        switch(this.a) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        String r0 = (String) this.b;
        if (r0 == null) goto L25;
        vo2 r5 = (vo2) this.c;
        if (r5 == null) goto L28;
        Messenger r1 = r5.h;
        MediaRouter2.RoutingController r2 = r5.g;
        if (r2 != null) goto L13;
        return;
    L13:
        if (to2.w(r2) == true) goto L27;
        if (r1 == null) goto L29;
        int r3 = r5.l.getAndIncrement();
        Message r4 = Message.obtain();
        r4.what = 8;
        r4.arg1 = r3;
        Bundle r7 = new Bundle();
        r7.putInt("volume", r6);
        r7.putString("routeId", r0);
        r4.setData(r7);
        r4.replyTo = r5.i;
        r1.send(r4);     // Catch: RemoteException -> L19 DeadObjectException -> L22
        goto L31
    L30:
        return;
    L19:
        e = move-exception;
        Log.e("MR2Provider", "Could not send control request to service.", e);
        return;
    L31:
        return;
    L29:
        return;
    L27:
        return;
    L28:
        return;
    }
}
