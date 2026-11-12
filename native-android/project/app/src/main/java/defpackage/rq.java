package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rq implements Runnable {
    public final /* synthetic */ int n;
    public int o;
    public final Object p;

    public rq(List r1, int r2, Throwable r3) {
        this.n = 2;
        l93.m(r1, "initCallbacks cannot be null");
        this.p = new ArrayList(r1);
        this.o = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        int r1 = 0;
        Object r3 = this.p;
        switch(r0) {
            case 0: goto L25;
            case 1: goto L21;
            case 2: goto L14;
            case 3: goto L12;
            case 4: goto L10;
            case 5: goto L8;
            case 6: goto L6;
            default: goto L4;
        };
    L4:
        ((gf5) r3).f(this.o);
        return;
    L6:
        ((RecyclerView) r3).m0(this.o);
        return;
    L8:
        this.o = ((Integer) xl.E((s24) ((ns3) r3).o, true, false, new k52(28))).intValue();
        return;
    L10:
        ((k33) r3).i(this.o);
        return;
    L12:
        ((nh2) r3).t0.m0(this.o);
        return;
    L14:
        ArrayList r4 = (ArrayList) r3;
        int r2 = r4.size();
        if (this.o == 1) goto L18;
    L16:
        if (r1 >= r2) goto L20;
        ((rz0) r4.get(r1)).a();
        r1 = r1 + 1;
        goto L16
    L20:
        return;
    L18:
        if (r1 >= r2) goto L29;
        ((rz0) r4.get(r1)).b();
        r1 = r1 + 1;
        goto L18
    L29:
        return;
    L21:
        int r5 = this.o;
        au0 r6 = (au0) ((c05) r3).n;
        if (r6 == null) goto L30;
        r6.M(r5);
        return;
    L30:
        return;
    L25:
        ((uq) r3).t.x(this.o, 4);
    }

    public rq(ns3 r2) {
        this.n = 5;
        this.o = 0;
        this.p = r2;
    }

    public rq(int r2, p75 r3) {
        this.n = 6;
        this.o = r2;
        this.p = r3;
    }

    public /* synthetic */ rq(int r1, int r2, Object r3) {
        this.n = r2;
        this.p = r3;
        this.o = r1;
    }

    public rq(uq r2) {
        this.n = 0;
        this.p = r2;
        this.o = -1;
    }
}
