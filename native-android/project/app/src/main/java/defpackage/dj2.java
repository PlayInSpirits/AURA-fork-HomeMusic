package defpackage;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dj2 extends MediaBrowser.ConnectionCallback {
    public final /* synthetic */ z05 a;

    public dj2(z05 r1) {
        this.a = r1;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        z05 r11 = this.a;
        gj2 r0 = (gj2) r11.p;
        int r1 = 0;
        if (r0 == null) goto L27;
        cj2 r4 = r0.d;
        MediaBrowser r5 = r0.b;
        Bundle r6 = f35.n(r5.getExtras());     // Catch: IllegalStateException -> L25
        if (r6 == null) goto L27;
        r6.getInt("extra_service_version", 0);
        IBinder r7 = r6.getBinder("extra_messenger");
        if (r7 == null) goto L14;
        xc5 r8 = new xc5(r7, r0.c);
        r0.f = r8;
        Messenger r9 = new Messenger(r4);
        r0.g = r9;
        r4.getClass();
        r4.c = new WeakReference(r9);
        Context r10 = r0.a;     // Catch: RemoteException -> L13
        Bundle r12 = new Bundle();     // Catch: RemoteException -> L13
        r12.putString("data_package_name", r10.getPackageName());     // Catch: RemoteException -> L13
        r12.putInt("data_calling_pid", Process.myPid());     // Catch: RemoteException -> L13
        r12.putBundle("data_root_hints", (Bundle) r8.p);     // Catch: RemoteException -> L13
        r8.w(6, r12, r9);     // Catch: RemoteException -> L13
    L13:
        l93.K("MediaBrowserCompat", "Remote error registering client messenger.");
    L14:
        IBinder r3 = r6.getBinder("extra_session_binder");
        int r13 = jr2.f;
        if (r3 != null) goto L17;
        qu1 r14 = null;
    L23:
        if (r14 == null) goto L27;
        r0.h = new pr2(r5.getSessionToken(), r14);
        goto L27
    L17:
        IInterface r15 = r3.queryLocalInterface("android.support.v4.media.session.IMediaSession");
        if (r15 != null) goto L20;
    L22:
        mu1 r16 = new mu1();
        r16.e = r3;
        r14 = r16;
        goto L23
    L20:
        if ((r15 instanceof qu1) == false) goto L22;
        r14 = (qu1) r15;
    L25:
        e = move-exception;
        l93.G("MediaBrowserCompat", "Unexpected IllegalStateException", e);
    L27:
        im2 r17 = (im2) r11.q;
        jj2 r2 = r17.j;
        if (r2 == null) goto L38;
        gj2 r18 = r2.a;
        if (r18.h != null) goto L32;
        r18.h = new pr2(r18.b.getSessionToken(), null);
    L32:
        r17.a1().a1(new ws1(13, r17, r18.h));
        r17.a1().f.postDelayed(new dm2(r17, r1), 500);
        return;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        ((im2) this.a.q).a1().Y0();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        z05 r3 = this.a;
        gj2 r0 = (gj2) r3.p;
        if (r0 == null) goto L5;
        r0.f = null;
        r0.g = null;
        r0.h = null;
        cj2 r1 = r0.d;
        r1.getClass();
        r1.c = new WeakReference(null);
    L5:
        ((im2) r3.q).a1().Y0();
    }
}
