package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cd implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ cd(int r1, Object r2, Object r3) {
        this.n = r1;
        this.p = r2;
        this.o = r3;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r9) {
        switch(this.n) {
            case 0: goto L26;
            case 1: goto L24;
            case 2: goto L14;
            default: goto L4;
        };
    L4:
        Throwable r10 = (Throwable) r9;
        ll r11 = (ll) this.p;
        Object r1 = r11.p;
        cz r8 = (cz) this.o;
        monitor-enter(r1);
        ((ArrayList) r11.q).remove(r8);     // Catch: Throwable -> L10
        monitor-exit(r1);
        return j15.a;
    L10:
        th = move-exception;
        throw th;
    L14:
        gh4 r5 = (gh4) r9;
        Object r12 = jh4.c;
        monitor-enter(r12);
        long r3 = jh4.e;     // Catch: Throwable -> L20
        jh4.e = 1 + r3;     // Catch: Throwable -> L20
        monitor-exit(r12);
        return new a13(r3, r5, (if1) this.p, (if1) this.o);
    L20:
        th = move-exception;
        throw th;
    L24:
        Throwable r13 = (Throwable) r9;
        ((Choreographer) ((ed) this.p).o).removeFrameCallback((dd) this.o);
        return j15.a;
    L26:
        Throwable r14 = (Throwable) r9;
        bd r15 = (bd) this.p;
        dd r16 = (dd) this.o;
        Object r2 = r15.r;
        monitor-enter(r2);
        r15.t.remove(r16);     // Catch: Throwable -> L32
        monitor-exit(r2);
        return j15.a;
    L32:
        th = move-exception;
        throw th;
    }
}
