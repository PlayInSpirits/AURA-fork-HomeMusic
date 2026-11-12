package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
@s43("navigation")
public class u23 extends t43 {
    public final u43 c;

    public u23(u43 r1) {
        this.c = r1;
    }

    @Override // defpackage.t43
    public final r23 a() {
        return new t23(this);
    }

    @Override // defpackage.t43
    public final void d(List r7, y23 r8) {
        Iterator r9 = r7.iterator();
    L4:
        if (r9.hasNext() == false) goto L23;
        a23 r0 = (a23) r9.next();
        r23 r1 = r0.o;
        r1.getClass();
        t23 r2 = (t23) r1;
        Bundle r3 = r0.c();
        int r4 = r2.y;
        if (r4 == 0) goto L7;
        r23 r5 = (r23) r2.x.b(r4);
        if (r5 == null) goto L18;
        t43 r6 = this.c.b(r5.n);
        d23 r10 = b();
        Bundle r11 = r5.a(r3);
        v23 r12 = r10.h;
        r6.d(gb.O(tv1.v(r12.a, r5, r11, r12.j(), r12.o)), r8);
        goto L4
    L18:
        if (r2.z != null) goto L20;
        r2.z = String.valueOf(r2.y);
    L20:
        String r13 = r2.z;
        r13.getClass();
        kf2.n(xa3.h("navigation destination ", r13, " is not a direct child of this NavGraph"));
        return;
    L7:
        StringBuilder r14 = new StringBuilder("no start destination defined via app:startDestination for ");
        int r15 = r2.u;
        if (r15 == 0) goto L12;
        String r16 = r2.p;
        if (r16 != null) goto L13;
        r16 = String.valueOf(r15);
    L13:
        r14.append(r16);
        throw new IllegalStateException(r14.toString().toString());
    L12:
        r16 = "the root navigation";
        goto L13
    }
}
