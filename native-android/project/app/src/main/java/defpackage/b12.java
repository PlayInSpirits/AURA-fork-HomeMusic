package defpackage;

import com.eddyizm.tempus.model.InternetRadioStationCache;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b12 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ c12 o;
    public final /* synthetic */ InternetRadioStationCache p;

    public /* synthetic */ b12(c12 r1, InternetRadioStationCache r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r4) {
        int r0 = this.n;
        InternetRadioStationCache r2 = this.p;
        c12 r3 = this.o;
        x34 r5 = (x34) r4;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((q20) r3.p).I(r5, r2);
        return null;
    L6:
        ((h61) r3.q).y(r5, r2);
        return null;
    }
}
