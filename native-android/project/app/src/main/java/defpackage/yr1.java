package defpackage;

import android.os.SystemClock;
import com.eddyizm.tempus.homemusic.HubFragment;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yr1 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ HubFragment o;

    public /* synthetic */ yr1(HubFragment r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r0 = this.n;
        j15 r1 = j15.a;
        int r2 = 1;
        HubFragment r10 = this.o;
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        List r3 = HubFragment.y0;
        long r4 = SystemClock.elapsedRealtime();
        if ((r4 - r10.q0) < 30000) goto L8;
        r10.q0 = r4;
        hw.i = null;
        r10.h0(r10.o0, true);
    L8:
        return r1;
    L9:
        List r5 = HubFragment.y0;
        WeakReference r6 = lr1.a;
        MainActivity r11 = r10.m0;
        if (r11 == null) goto L20;
        bl2 r7 = r11.P;
        if (r7 == null) goto L15;
        r7.f(new jr1(r7, 0), ud3.w(r11));
    L15:
        bl2 r8 = r11.P;
        if (r8 == null) goto L19;
        r8.f(new jr1(r8, r2), ud3.w(r11));
    L19:
        return r1;
    L20:
        h12.Q("activity");
        throw null;
    }
}
