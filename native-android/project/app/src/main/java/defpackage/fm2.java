package defpackage;

import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fm2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ fm2(ls2 r2, va4 r3, int r4, ms2 r5, ks2 r6) {
        this.n = 1;
        this.p = r2;
        this.q = r3;
        this.o = r4;
        this.r = r5;
        this.s = r6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        int r1 = this.o;
        Object r2 = this.s;
        Object r3 = this.r;
        Object r4 = this.q;
        Object r5 = this.p;
        switch(r0) {
            case 0: goto L29;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        Pair r6 = (Pair) r4;
        ((nj0) ((zt2) r5).o.i).U(((Integer) r6.first).intValue(), (mt2) r6.second, (ed2) r3, (un2) r2, this.o);
        return;
    L6:
        ls2 r7 = (ls2) r5;
        va4 r8 = (va4) r4;
        ms2 r9 = (ms2) r3;
        ks2 r10 = (ks2) r2;
        if (r7.g.l() == false) goto L10;
        return;
    L10:
        if (((kr2) r7.m.o).a.isActive() == true) goto L16;
        StringBuilder r12 = new StringBuilder("Ignore incoming session command before initialization. command=");
        if (r8 != null) goto L14;
        Object r11 = Integer.valueOf(r1);
    L15:
        r12.append(r11);
        r12.append(", pid=");
        r12.append(r9.a.b);
        l93.q0("MediaSessionLegacyStub", r12.toString());
        return;
    L14:
        r11 = r8.b;
        goto L15
    L16:
        fr2 r13 = r7.M(r9);
        na4 r14 = r7.f;
        if (r8 == null) goto L22;
        if (r14.J(r13, r8) == false) goto L54;
    L45:
        r10.b(r13);     // Catch: RemoteException -> L26
        return;
    L26:
        e = move-exception;
        l93.r0("MediaSessionLegacyStub", "Exception in " + r13, e);
        return;
    L54:
        return;
    L22:
        if (r14.I(r13, r1) == true) goto L45;
        return;
    L29:
        im2 r15 = (im2) r5;
        List r16 = (List) r3;
        ArrayList r17 = (ArrayList) r2;
        if (((AtomicInteger) r4).incrementAndGet() != r16.size()) goto L44;
        int r18 = 0;
    L33:
        if (r18 >= r17.size()) goto L57;
        ic2 r19 = (ic2) r17.get(r18);
        if (r19 != null) goto L47;
    L42:
        Bitmap r20 = null;
    L43:
        r15.i.a(f92.i((gn2) r16.get(r18), r20), r1 + r18);
        r18 = r18 + 1;
        goto L33
    L47:
        r20 = (Bitmap) hw.j(r19);     // Catch: ExecutionException -> L38 Throwable -> L40
    L40:
        e = move-exception;
        l93.B("MCImplLegacy", "Failed to get bitmap", e);
        goto L42
    L57:
        return;
    }

    public /* synthetic */ fm2(Object r1, Object r2, Object r3, Object r4, int r5, int r6) {
        this.n = r6;
        this.p = r1;
        this.q = r2;
        this.r = r3;
        this.s = r4;
        this.o = r5;
    }
}
