package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.session.MediaLibraryService;
import java.util.HashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class ps2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ MediaLibraryService o;
    public final /* synthetic */ kn2 p;

    public /* synthetic */ ps2(MediaLibraryService mediaLibraryService, kn2 kn2Var, int i) {
        this.n = i;
        this.o = mediaLibraryService;
        this.p = kn2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.n;
        MediaLibraryService mediaLibraryService = this.o;
        switch (i) {
            case 0:
                kn2 kn2Var = this.p;
                tn2 tn2Var = kn2Var.a;
                int i2 = MediaLibraryService.t;
                lo2 d = mediaLibraryService.d();
                MediaLibraryService mediaLibraryService2 = d.n;
                HashMap hashMap = d.t;
                if (!hashMap.containsKey(kn2Var)) {
                    ko2 ko2Var = new ko2(d, mediaLibraryService2, kn2Var);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("androidx.media3.session.MediaNotificationManager", true);
                    cb4 cb4Var = tn2Var.j;
                    cb4Var.getClass();
                    Bundle bundle2 = Bundle.EMPTY;
                    f35.x();
                    Bundle bundle3 = new Bundle(bundle);
                    Looper mainLooper = Looper.getMainLooper();
                    mainLooper.getClass();
                    bl2 bl2Var = new bl2(mainLooper);
                    f35.W(new Handler(mainLooper), new pk2(bl2Var, new sk2(mediaLibraryService2, cb4Var, bundle3, ko2Var, mainLooper, bl2Var, cb4Var.a.e() ? new xc5(4, new fi0(new x7((Context) mediaLibraryService2))) : null), 0));
                    hashMap.put(kn2Var, new jo2(bl2Var));
                    bl2Var.f(new t6(d, bl2Var, ko2Var, kn2Var, 18), d.r);
                }
                tn2Var.v = new rm2(2, mediaLibraryService);
                break;
            default:
                int i3 = MediaLibraryService.t;
                HashMap hashMap2 = mediaLibraryService.d().t;
                kn2 kn2Var2 = this.p;
                jo2 jo2Var = (jo2) hashMap2.remove(kn2Var2);
                if (jo2Var != null) {
                    sk2.Z0(jo2Var.a);
                }
                kn2Var2.a.v = null;
                break;
        }
    }
}
