package defpackage;

import android.view.DragEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qb implements View.OnDragListener, nu0 {
    public final pu0 a;
    public final qi b;
    public final pb c;

    public qb() {
        pu0 r0 = new pu0();
        r0.D = 0;
        this.a = r0;
        this.b = new qi(0);
        this.c = new pb(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View r5, DragEvent r6) {
        zg5 r7 = new zg5(r6);
        int r8 = r6.getAction();
        qx4 r0 = qx4.n;
        qi r1 = this.b;
        pu0 r4 = this.a;
        switch(r8) {
            case 1: goto L19;
            case 2: goto L17;
            case 3: goto L16;
            case 4: goto L9;
            case 5: goto L7;
            case 6: goto L5;
            default: goto L4;
        };
    L4:
        return false;
    L5:
        r4.s0();
        return false;
    L7:
        r4.r0();
        return false;
    L9:
        x r9 = new x(10, r7);
        if (r9.invoke(r4) != r0) goto L13;
        gh0.J(r4, r9);
    L13:
        r1.clear();
        return false;
    L17:
        r4.t0(r7);
        return false;
    L19:
        fx3 r10 = new fx3();
        x r2 = new x(r7, r4, r10);
        if (r2.invoke(r4) != r0) goto L23;
        gh0.J(r4, r2);
    L23:
        boolean r11 = r10.n;
        r1.getClass();
        ki r12 = new ki(r1);
    L25:
        if (r12.hasNext() == false) goto L27;
        ((pu0) r12.next()).u0();
        goto L25
    L27:
        return r11;
    L16:
        return r4.q0();
    }
}
