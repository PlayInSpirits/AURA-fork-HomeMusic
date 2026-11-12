package defpackage;

import com.eddyizm.tempus.model.Server;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ma4 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ na4 o;
    public final /* synthetic */ Server p;

    public /* synthetic */ ma4(na4 r1, Server r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r4) {
        int r0 = this.n;
        Server r2 = this.p;
        na4 r3 = this.o;
        x34 r5 = (x34) r4;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((h61) r3.q).y(r5, r2);
        return null;
    L6:
        ((h61) r3.p).y(r5, r2);
        return null;
    L8:
        ((q20) r3.o).I(r5, r2);
        return null;
    }
}
