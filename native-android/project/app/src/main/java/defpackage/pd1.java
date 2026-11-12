package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pd1 implements w92 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ pd1(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.w92
    public final void b(ba2 r6, q92 r7) {
        int r0 = this.n;
        int r1 = 0;
        Object r5 = this.o;
        switch(r0) {
            case 0: goto L21;
            case 1: goto L15;
            case 2: goto L8;
            default: goto L4;
        };
    L4:
        b0 r8 = (b0) r5;
        if (r7 != q92.ON_DESTROY) goto L42;
        r8.d();
        return;
    L42:
        return;
    L8:
        xm2 r9 = (xm2) r5;
        if (r7 != q92.ON_START) goto L12;
        r9.c = true;
        return;
    L12:
        if (r7 != q92.ON_STOP) goto L44;
        r9.c = false;
        return;
    L44:
        return;
    L15:
        v23 r10 = (v23) r5;
        r10.q = r7.a();
        if (r10.c == null) goto L20;
        ArrayList r11 = q40.R0(r10.g);
        int r12 = r11.size();
    L18:
        if (r1 >= r12) goto L45;
        Object r2 = r11.get(r1);
        r1 = r1 + 1;
        a23 r3 = (a23) r2;
        r3.getClass();
        r3.q = r7.a();
        r3.e();
        goto L18
    L45:
        return;
    L20:
        return;
    L21:
        rd1 r13 = (rd1) r5;
        if (r7 != q92.ON_DESTROY) goto L46;
        kc1 r14 = (kc1) r6;
        Iterator r4 = ((Iterable) r13.b().f.n.getValue()).iterator();
        Object r15 = null;
    L25:
        if (r4.hasNext() == false) goto L29;
        Object r16 = r4.next();
        if (h12.c(((a23) r16).s, r14.L) == false) goto L25;
        r15 = r16;
        goto L25
    L29:
        a23 r17 = (a23) r15;
        if (r17 != null) goto L32;
        return;
    L32:
        if (rd1.n() == false) goto L34;
        Log.v("FragmentNavigator", "Marking transition complete for entry " + r17 + " due to fragment " + r6 + " lifecycle reaching DESTROYED");
    L34:
        r13.b().b(r17);
        return;
    }
}
