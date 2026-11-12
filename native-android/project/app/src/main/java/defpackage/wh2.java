package defpackage;

import android.widget.Button;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wh2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc1 b;

    public /* synthetic */ wh2(int r1, kc1 r2) {
        this.a = r1;
        this.b = r2;
    }

    public final void a() {
        int r0 = this.a;
        kc1 r1 = this.b;
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        Iterator r2 = ((ii2) r1).l0.iterator();
    L6:
        if (r2.hasNext() == false) goto L8;
        ((wh2) r2.next()).a();
        goto L6
    L8:
        return;
    L9:
        ((xh2) r1).W0.setEnabled(false);
    }

    public final void b(Object r2) {
        int r0 = this.a;
        kc1 r1 = this.b;
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        Iterator r3 = ((ii2) r1).l0.iterator();
    L6:
        if (r3.hasNext() == false) goto L8;
        ((wh2) r3.next()).b(r2);
        goto L6
    L8:
        return;
    L9:
        xh2 r4 = (xh2) r1;
        r4.s0(r4.o0());
        Button r5 = r4.W0;
        if (r4.n0().n == null) goto L12;
        boolean r6 = true;
    L13:
        r5.setEnabled(r6);
        return;
    L12:
        r6 = false;
        goto L13
    }
}
