package defpackage;

import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class zx3 {
    public final /* synthetic */ ay3 a;

    public zx3(ay3 ay3Var) {
        this.a = ay3Var;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        ay3 ay3Var = this.a;
        ay3Var.h = string;
        ay3Var.i = bundle.getString("transferableTitle");
    }
}
