package defpackage;

import com.eddyizm.tempus.homemusic.HubFragment;
import com.eddyizm.tempus.homemusic.WaveOut;
import com.eddyizm.tempus.homemusic.b;
import com.eddyizm.tempus.ui.activity.MainActivity;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zr1 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ HubFragment o;

    public /* synthetic */ zr1(HubFragment r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r5) {
        int r0 = this.n;
        j15 r2 = j15.a;
        HubFragment r4 = this.o;
        switch(r0) {
            case 0: goto L17;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        WaveOut r6 = (WaveOut) r5;
        List r1 = HubFragment.y0;
        r6.getClass();
        WeakReference r3 = b.a;
        MainActivity r7 = r4.m0;
        if (r7 == null) goto L8;
        b.i(r7, r6);
        return r2;
    L8:
        h12.Q("activity");
        throw null;
    L10:
        String r8 = (String) r5;
        List r9 = HubFragment.y0;
        if (r8 == null) goto L16;
        k03 r10 = js1.a;
        if (((String) r10.d()) == null) goto L15;
        r10.k(null);
    L15:
        r4.h0(r8, false);
    L16:
        return r2;
    L17:
        boolean r11 = ((Boolean) r5).booleanValue();
        List r12 = HubFragment.y0;
        r4.l0(!r11);
        return r2;
    }
}
