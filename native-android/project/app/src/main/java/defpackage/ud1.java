package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ud1 extends q42 implements if1 {
    public final /* synthetic */ rd1 n;
    public final /* synthetic */ kc1 o;
    public final /* synthetic */ a23 p;

    public ud1(rd1 r1, kc1 r2, a23 r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        super(1);
    }

    @Override // defpackage.if1
    public final Object invoke(Object r9) {
        ba2 r10 = (ba2) r9;
        rd1 r0 = this.n;
        ArrayList r1 = r0.g;
        boolean r2 = false;
        kc1 r3 = this.o;
        if (r1 != null) goto L5;
    L7:
        int r4 = r1.size();
        int r5 = 0;
    L8:
        if (r5 >= r4) goto L12;
        Object r6 = r1.get(r5);
        r5 = r5 + 1;
        if (h12.c(((kd3) r6).n, r3.L) == false) goto L8;
        r2 = true;
    L12:
        if (r10 == null) goto L18;
        if (r2 == true) goto L18;
        le1 r11 = r3.v();
        r11.e();
        ea2 r12 = r11.r;
        if (r12.h.compareTo(r92.p) < 0) goto L18;
        r12.a((aa2) r0.i.invoke(this.p));
    L18:
        return j15.a;
    L5:
        if (r1.isEmpty() == false) goto L7;
        goto L7
    }
}
