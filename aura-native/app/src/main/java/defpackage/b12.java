package defpackage;

import com.eddyizm.tempus.model.InternetRadioStationCache;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class b12 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ c12 o;
    public final /* synthetic */ InternetRadioStationCache p;

    public /* synthetic */ b12(c12 c12Var, InternetRadioStationCache internetRadioStationCache, int i) {
        this.n = i;
        this.o = c12Var;
        this.p = internetRadioStationCache;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) {
        int i = this.n;
        InternetRadioStationCache internetRadioStationCache = this.p;
        c12 c12Var = this.o;
        x34 x34Var = (x34) obj;
        switch (i) {
            case 0:
                ((h61) c12Var.q).y(x34Var, internetRadioStationCache);
                break;
            default:
                ((q20) c12Var.p).I(x34Var, internetRadioStationCache);
                break;
        }
        return null;
    }
}
