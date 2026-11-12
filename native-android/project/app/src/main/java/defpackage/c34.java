package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c34 extends z62 {
    public static final c34 b = null;
    public final /* synthetic */ int a;

    static {
        b = new c34(0);
    }

    public /* synthetic */ c34(int r1) {
        this.a = r1;
    }

    @Override // defpackage.ui2
    public final vi2 a(cf2 r9, List r10, long r11) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        int r8 = r10.size();
        v01 r0 = v01.n;
        if (r8 == 0) goto L16;
        int r2 = 0;
        if (r8 == 1) goto L14;
        ArrayList r12 = new ArrayList(r10.size());
        int r3 = r10.size();
        int r4 = 0;
        int r5 = 0;
    L11:
        if (r2 >= r3) goto L18;
        jg3 r6 = ((pi2) r10.get(r2)).r(r11);
        r4 = Math.max(r6.n, r4);
        r5 = Math.max(r6.o, r5);
        r12.add(r6);
        r2 = r2 + 1;
        goto L11
    L18:
        return r9.v(qc0.f(r4, r11), qc0.e(r5, r11), r0, new oc3(1, r12));
    L14:
        jg3 r13 = ((pi2) r10.get(0)).r(r11);
        return r9.v(qc0.f(r13.n, r11), qc0.e(r13.o, r11), r0, new la(r13, 4));
    L16:
        return r9.v(nc0.j(r11), nc0.i(r11), r0, new or1(24));
    L5:
        throw new IllegalStateException("Undefined measure and it is required");
    }
}
