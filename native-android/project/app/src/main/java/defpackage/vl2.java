package defpackage;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vl2 implements xl2, ks2, wc0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    public /* synthetic */ vl2(Object r1, int r2, Object r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // defpackage.wc0
    public void accept(Object r5) {
        tn2 r0 = (tn2) this.o;
        fr2 r1 = (fr2) this.q;
        ab4 r6 = (ab4) ((ic2) r5).get();     // Catch: InterruptedException -> L5 ExecutionException -> L7 CancellationException -> L9
        rr2.s(r6, "SessionResult must not be null");     // Catch: InterruptedException -> L5 ExecutionException -> L7 CancellationException -> L9
    L17:
        kt2.P0(r0, r1, this.p, r6);
        return;
    L5:
        e = e;
    L11:
        l93.r0("MediaSessionStub", "Session operation failed", e);
        if ((e.getCause() instanceof UnsupportedOperationException) == false) goto L14;
        int r7 = -6;
    L15:
        r6 = new ab4(r7);
        goto L17
    L14:
        r7 = -1;
    L9:
        e = move-exception;
        l93.r0("MediaSessionStub", "Session operation cancelled", e);
        r6 = new ab4(1);
    L7:
        e = e;
        goto L11
    }

    @Override // defpackage.ks2
    public void b(fr2 r4) {
        ls2 r0 = (ls2) this.o;
        pm2 r1 = (pm2) this.q;
        if (TextUtils.isEmpty(r1.n) == false) goto L6;
        l93.q0("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
        return;
    L6:
        gn2 r2 = f92.j(r1);
        mw1 r3 = r0.g.o(r4, yw1.o(r2));
        ue1 r5 = new ue1(r0, r4, this.p);
        r3.f(new lg1(0, r3, r5), gq0.n);
    }

    @Override // defpackage.xl2
    public void d(pu1 r8, int r9) {
        int r0 = this.n;
        Object r2 = this.q;
        int r3 = this.p;
        bm2 r7 = (bm2) this.o;
        switch(r0) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        gn2 r4 = (gn2) r2;
        cb4 r1 = r7.n;
        r1.getClass();
        int r5 = r1.a.f();
        mm2 r10 = r7.c;
        if (r5 < 2) goto L7;
        r8.G0(r10, r9, r3, r4.c(true));
        return;
    L7:
        r8.D(r10, r9, r3 + 1, r4.c(true));
        r8.N(r10, r9, r3);
        return;
    L9:
        List r6 = (List) r2;
        mm2 r11 = r7.c;
        uw1 r12 = yw1.j();
        int r13 = 0;
    L11:
        if (r13 >= r6.size()) goto L13;
        r12.c(((gn2) r6.get(r13)).c(true));
        r13 = r13 + 1;
        goto L11
    L13:
        r8.Z(r11, r9, r3, new iw(r12.f()));
    }

    public /* synthetic */ vl2(Object r1, Object r2, int r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.q = r2;
        this.p = r3;
    }
}
