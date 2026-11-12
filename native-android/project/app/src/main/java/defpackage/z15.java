package defpackage;

import android.os.Looper;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z15 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ sf1 p;

    public /* synthetic */ z15(Object r1, sf1 r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r6) {
        int r0 = this.n;
        j15 r1 = j15.a;
        sf1 r2 = this.p;
        Object r5 = this.o;
        switch(r0) {
            case 0: goto L16;
            default: goto L4;
        };
    L4:
        wd5 r7 = (wd5) r5;
        r70 r3 = (r70) r2;
        h80 r8 = (h80) r6;
        if (r7.p == true) goto L15;
        ba2 r4 = r8.d();
        View r9 = r8.a;
        ea2 r10 = r4.h();
        r7.r = r3;
        if (r7.q != null) goto L13;
        if (h12.c(Looper.myLooper(), r9.getHandler().getLooper()) == true) goto L11;
        r9.post(new w85(5, r7, r10));
        goto L15
    L11:
        r7.q = r10;
        r10.a(r7);
        goto L15
    L13:
        if (r10.h.compareTo(r92.p) < 0) goto L15;
        r7.o.A(new r70(-1723985096, true, new d90(r7, r8, r3, 3)));
    L15:
        return r1;
    L16:
        b25 r11 = (b25) r5;
        ((Long) r6).getClass();
        float r12 = r11.e;
        r11.e = 0.0f;
        ((if1) r2).invoke(Float.valueOf(r12));
        return r1;
    }
}
