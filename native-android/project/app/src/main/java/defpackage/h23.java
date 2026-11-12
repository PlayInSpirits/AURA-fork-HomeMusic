package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h23 extends q42 implements if1 {
    public final /* synthetic */ fx3 n;
    public final /* synthetic */ ArrayList o;
    public final /* synthetic */ hx3 p;
    public final /* synthetic */ v23 q;
    public final /* synthetic */ Bundle r;

    public h23(fx3 r1, ArrayList r2, hx3 r3, v23 r4, Bundle r5) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
        super(1);
    }

    @Override // defpackage.if1
    public final Object invoke(Object r6) {
        a23 r7 = (a23) r6;
        r7.getClass();
        this.n.n = true;
        ArrayList r0 = this.o;
        int r2 = r0.indexOf(r7);
        if (r2 == (-1)) goto L5;
        hx3 r3 = this.p;
        int r4 = r2 + 1;
        List r1 = r0.subList(r3.n, r4);
        r3.n = r4;
    L6:
        r23 r5 = r7.o;
        Bundle r8 = this.r;
        this.q.a(r5, r8, r7, r1);
        return j15.a;
    L5:
        r1 = u01.n;
        goto L6
    }
}
