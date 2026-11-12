package defpackage;

import android.view.Surface;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hl2 implements xl2, wc0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    public /* synthetic */ hl2(Object r1, Object r2, int r3, int r4, int r5) {
        this.n = r5;
        this.o = r1;
        this.r = r2;
        this.p = r3;
        this.q = r4;
    }

    @Override // defpackage.wc0
    public void accept(Object r5) {
        kt2 r0 = (kt2) this.o;
        Surface r1 = (Surface) this.r;
        al3 r6 = (al3) r5;
        ((tn2) r0.e.get()).getClass();
        if (r1 != null) goto L6;
        r6.Q(null);
        r0.j = null;
        return;
    L6:
        jt2 r2 = new jt2(r1, this.p, this.q);
        r0.j = r2;
        r6.Q(r2);
    }

    @Override // defpackage.xl2
    public void d(pu1 r9, int r10) {
        int r1 = this.n;
        Object r2 = this.r;
        Object r3 = this.o;
        switch(r1) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        int r5 = this.q;
        mm2 r4 = ((bm2) r3).c;
        r9.z0(r4, r10, (Surface) r2, this.p, r5);
        return;
    L6:
        bm2 r6 = (bm2) r3;
        List r7 = (List) r2;
        uw1 r8 = yw1.j();
        int r11 = 0;
    L8:
        if (r11 >= r7.size()) goto L10;
        r8.c(((gn2) r7.get(r11)).c(true));
        r11 = r11 + 1;
        goto L8
    L10:
        iw r12 = new iw(r8.f());
        cb4 r13 = r6.n;
        r13.getClass();
        int r14 = r13.a.f();
        mm2 r15 = r6.c;
        int r16 = this.p;
        int r17 = this.q;
        if (r14 < 2) goto L13;
        r9.P(r15, r10, r16, r17, r12);
        return;
    L13:
        r9.Z(r15, r10, r17, r12);
        r9.M(r6.c, r10, r16, r17);
    }
}
