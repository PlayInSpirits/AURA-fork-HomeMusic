package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class l72 extends z62 {
    public final /* synthetic */ o72 a;
    public final /* synthetic */ wf1 b;

    public l72(o72 r1, wf1 r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.ui2
    public final vi2 a(cf2 r7, List r8, long r9) {
        o72 r2 = this.a;
        j72 r10 = r2.u;
        r10.n = r7.getLayoutDirection();
        r10.o = r7.g();
        r10.p = r7.J();
        boolean r11 = r7.K();
        wf1 r6 = this.b;
        if (r11 == false) goto L5;
    L8:
        r2.q = 0;
        vi2 r1 = (vi2) r6.invoke(r10, new nc0(r9));
        return new k72(r1, r2, r2.q, r1, 1);
    L5:
        if (r2.n.u == null) goto L8;
        r2.r = 0;
        vi2 r3 = (vi2) r6.invoke(r2.v, new nc0(r9));
        return new k72(r3, r2, r2.r, r3, 0);
    }
}
