package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ls3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ns3 o;
    public final /* synthetic */ List p;

    public /* synthetic */ ls3(ns3 r1, List r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r5) {
        int r0 = this.n;
        List r1 = this.p;
        ns3 r4 = this.o;
        x34 r6 = (x34) r5;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((q20) r4.p).H(r6, r1);
        return null;
    L6:
        s24 r7 = (s24) r4.o;
        xl.E(r7, false, true, new k52(29));
        xl.E(r7, false, true, new ls3(r4, r1, 1));
        return j15.a;
    }
}
