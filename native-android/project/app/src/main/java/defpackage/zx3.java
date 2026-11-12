package defpackage;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zx3 {
    public final /* synthetic */ ay3 a;

    public zx3(ay3 r1) {
        this.a = r1;
    }

    public static void a(String r2, Bundle r3) {
        Log.d("MediaRouteProviderProxy", "Error: " + r2 + ", data: " + r3);
    }

    public final void b(Bundle r2) {
        String r0 = r2.getString("groupableTitle");
        ay3 r1 = this.a;
        r1.h = r0;
        r1.i = r2.getString("transferableTitle");
    }
}
