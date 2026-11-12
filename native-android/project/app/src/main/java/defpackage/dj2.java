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

    public dj2(z05 z05Var) {
        this.a = z05Var;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        qu1 qu1Var;
        qu1 qu1Var2;
        z05 z05Var = this.a;
        gj2 gj2Var = (gj2) z05Var.p;
        int i = 0;
        if (gj2Var != null) {
            cj2 cj2Var = gj2Var.d;
            MediaBrowser mediaBrowser = gj2Var.b;
            try {
                Bundle bundleN = f35.n(mediaBrowser.getExtras());
                if (bundleN != null) {
                    bundleN.getInt("extra_service_version", 0);
                    IBinder binder = bundleN.getBinder("extra_messenger");
                    if (binder != null) {
                        xc5 xc5Var = new xc5(binder, gj2Var.c);
                        gj2Var.f = xc5Var;
                        Messenger messenger = new Messenger(cj2Var);
                        gj2Var.g = messenger;
                        cj2Var.getClass();
                        cj2Var.c = new WeakReference(messenger);
                        try {
                            Context context = gj2Var.a;
                            Bundle bundle = new Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", Process.myPid());
                            bundle.putBundle("data_root_hints", (Bundle) xc5Var.p);
                            xc5Var.w(6, bundle, messenger);
                        } catch (RemoteException unused) {
                            l93.K("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    IBinder binder2 = bundleN.getBinder("extra_session_binder");
                    int i2 = jr2.f;
                    if (binder2 == null) {
                        qu1Var2 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof qu1)) {
                            mu1 mu1Var = new mu1();
                            mu1Var.e = binder2;
                            qu1Var2 = mu1Var;
                        } else {
                            qu1Var = (qu1) iInterfaceQueryLocalInterface;
                        }
                    }
                    if (qu1Var2 != null) {
                        qu1Var2 = qu1Var;
                        gj2Var.h = new pr2(mediaBrowser.getSessionToken(), qu1Var2);
                    }
                }
            } catch (IllegalStateException e) {
                l93.G("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }
        qu1Var2 = qu1Var;
        im2 im2Var = (im2) z05Var.q;
        jj2 jj2Var = im2Var.j;
        if (jj2Var != null) {
            gj2 gj2Var2 = jj2Var.a;
            if (gj2Var2.h == null) {
                gj2Var2.h = new pr2(gj2Var2.b.getSessionToken(), null);
            }
            im2Var.a1().a1(new ws1(13, im2Var, gj2Var2.h));
            im2Var.a1().f.postDelayed(new dm2(im2Var, i), 500L);
        }
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        ((im2) this.a.q).a1().Y0();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        z05 z05Var = this.a;
        gj2 gj2Var = (gj2) z05Var.p;
        if (gj2Var != null) {
            gj2Var.f = null;
            gj2Var.g = null;
            gj2Var.h = null;
            cj2 cj2Var = gj2Var.d;
            cj2Var.getClass();
            cj2Var.c = new WeakReference(null);
        }
        ((im2) z05Var.q).a1().Y0();
    }
}
