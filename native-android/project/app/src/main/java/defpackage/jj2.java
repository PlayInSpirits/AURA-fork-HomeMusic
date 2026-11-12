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

    public jj2(Context r3, ComponentName r4, z05 r5, Bundle r6) {
        if (Build.VERSION.SDK_INT < 26) goto L6;
        this.a = new hj2(r3, r4, r5, r6);
        return;
    L6:
        this.a = new gj2(r3, r4, r5, r6);
    }

    public final void a() {
        gj2 r4 = this.a;
        xc5 r0 = r4.f;
        if (r0 == null) goto L10;
        Messenger r1 = r4.g;
        if (r1 == null) goto L10;
        r0.w(7, null, r1);     // Catch: RemoteException -> L9
    L9:
        l93.K("MediaBrowserCompat", "Remote error unregistering client messenger.");
    L10:
        r4.b.disconnect();
    }
}
