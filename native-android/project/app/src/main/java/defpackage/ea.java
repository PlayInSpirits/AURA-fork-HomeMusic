package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ea implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ jx3 o;

    public /* synthetic */ ea(int r1, jx3 r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r2) {
        int r0 = this.n;
        jx3 r1 = this.o;
        switch(r0) {
            case 0: goto L16;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        rx4 r3 = (rx4) r2;
        r3.getClass();
        q82 r4 = ((tx4) r3).B;
        List r5 = (List) r1.n;
        if (r5 == null) goto L7;
        r5.add(r4);
    L8:
        r1.n = r5;
        return qx4.o;
    L7:
        r5 = gb.Q(new q82[]{r4});
        goto L8
    L10:
        eo0 r6 = (rx4) r2;
        if (((cx2) r6).n.A == false) goto L13;
        r1.n = r6;
        boolean r7 = false;
    L15:
        return Boolean.valueOf(r7);
    L13:
        r7 = true;
        goto L15
    L16:
        r1.n = (ba1) r2;
        return Boolean.TRUE;
    }
}
