package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.session.MediaLibraryService;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ps2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ MediaLibraryService o;
    public final /* synthetic */ kn2 p;

    public /* synthetic */ ps2(MediaLibraryService r1, kn2 r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r1 = this.n;
        xc5 r2 = null;
        MediaLibraryService r3 = this.o;
        switch(r1) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        int r4 = MediaLibraryService.t;
        HashMap r5 = r3.d().t;
        kn2 r0 = this.p;
        jo2 r6 = (jo2) r5.remove(r0);
        if (r6 == null) goto L7;
        sk2.Z0(r6.a);
    L7:
        r0.a.v = null;
        return;
    L9:
        kn2 r8 = this.p;
        tn2 r7 = r8.a;
        int r9 = MediaLibraryService.t;
        lo2 r10 = r3.d();
        MediaLibraryService r11 = r10.n;
        HashMap r12 = r10.t;
        if (r12.containsKey(r8) == true) goto L16;
        ko2 r13 = new ko2(r10, r11, r8);
        Bundle r14 = new Bundle();
        r14.putBoolean("androidx.media3.session.MediaNotificationManager", true);
        cb4 r15 = r7.j;
        r15.getClass();
        Bundle r16 = Bundle.EMPTY;
        f35.x();
        Bundle r17 = new Bundle(r14);
        Looper r18 = Looper.getMainLooper();
        r18.getClass();
        bl2 r19 = new bl2(r18);
        if (r15.a.e() == false) goto L15;
        r2 = new xc5(4, new fi0(new x7(r11)));
    L15:
        sk2 r20 = new sk2(r11, r15, r17, r13, r18, r19, r2);
        f35.W(new Handler(r18), new pk2(r19, r20, 0));
        r12.put(r8, new jo2(r19));
        r19.f(new t6(r10, r19, r13, r8, 18), r10.r);
    L16:
        r7.v = new rm2(2, r3);
    }
}
