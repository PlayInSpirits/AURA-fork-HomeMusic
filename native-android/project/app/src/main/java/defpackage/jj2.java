package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jj2 {
    public final gj2 a;

    public jj2(Context context, ComponentName componentName, z05 z05Var, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new hj2(context, componentName, z05Var, bundle);
        } else {
            this.a = new gj2(context, componentName, z05Var, bundle);
        }
    }

    public final void a() {
        Messenger messenger;
        gj2 gj2Var = this.a;
        xc5 xc5Var = gj2Var.f;
        if (xc5Var != null && (messenger = gj2Var.g) != null) {
            try {
                xc5Var.w(7, null, messenger);
            } catch (RemoteException unused) {
                l93.K("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        gj2Var.b.disconnect();
    }
}
