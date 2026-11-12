package defpackage;

import com.google.common.reflect.TypeToken;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a05 extends yb1 implements Serializable {
    public transient jx1 u;
    public final /* synthetic */ TypeToken v;

    public a05(TypeToken r2) {
        super(10);
        this.v = r2;
    }

    @Override // defpackage.yb1
    public final jx1 W() {
        jx1 r0 = this.u;
        if (r0 != null) goto L23;
        rv2 r1 = rv2.G;
        gy3 r2 = yw1.o(this.v);
        HashMap r3 = new HashMap();
        int r4 = 0;
        vw1 r5 = r2.m(0);
    L6:
        if (r5.hasNext() == false) goto L8;
        r1.g(r5.next(), r3);
        goto L6
    L8:
        gy3 r6 = yw1.q(new wz4(r3), r3.keySet());
        l91 r7 = new l91(r6, r6);
        Iterable r8 = (Iterable) r7.n.b(r7);
        r8.getClass();
        Iterable r9 = new g22(r8, zz4.n, r4);
        int r10 = jx1.p;
        if ((r9 instanceof Collection) == false) goto L11;
        r0 = jx1.k((Collection) r9);
    L22:
        this.u = r0;
        goto L23
    L11:
        Iterator r11 = r9.iterator();
        if (r11.hasNext() == true) goto L14;
        r0 = ny3.w;
        goto L22
    L14:
        Object r12 = r11.next();
        if (r11.hasNext() == true) goto L17;
        r0 = new nf4(r12);
        goto L22
    L17:
        ix1 r13 = new ix1(4);
        r13.f(r12);
    L19:
        if (r11.hasNext() == false) goto L21;
        r13.f(r11.next());
        goto L19
    L21:
        r0 = r13.g();
    L23:
        return r0;
    }
}
