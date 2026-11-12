package defpackage;

import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ss3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ vs3 o;
    public final /* synthetic */ String p;
    public final /* synthetic */ long q;

    public /* synthetic */ ss3(vs3 r1, String r2, long r3, int r5) {
        this.n = r5;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        vs3 r1 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        vs3.d((List) r1.a.c().stream().map(new bi2(28)).collect(Collectors.toList()), this.p, this.q);
        return;
    L6:
        ns3 r2 = r1.a;
        final long r3 = System.currentTimeMillis();
        s24 r4 = (s24) r2.o;
        final long r5 = this.q;
        final String r6 = this.p;
        xl.E(r4, false, true, new js3(r3, r5, r6));
    }
}
