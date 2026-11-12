package defpackage;

import android.app.Activity;
import android.widget.TextView;
import com.eddyizm.tempus.homemusic.HubUpdater;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rt1 implements wf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ rt1(gf1 r1, dx2 r2, q82 r3, pc3 r4, int r5) {
        this.n = 1;
        this.o = r1;
        this.p = r2;
        this.q = r3;
        this.r = r4;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r11, Object r12) {
        int r0 = this.n;
        Object r1 = this.r;
        Object r2 = this.q;
        Object r3 = this.p;
        Object r10 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((Integer) r12).getClass();
        su3.b((gf1) r10, (dx2) r3, (q82) r2, (pc3) r1, (rg1) r11, xl.O(1));
        return j15.a;
    L6:
        long r4 = ((Long) r11).longValue();
        long r5 = ((Long) r12).longValue();
        return HubUpdater.b(r4, (LinearProgressIndicator) r10, (TextView) r3, r5, (HubUpdater) r2, (Activity) r1);
    }

    public /* synthetic */ rt1(LinearProgressIndicator r2, TextView r3, HubUpdater r4, Activity r5) {
        this.n = 0;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
    }
}
