package defpackage;

import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gp extends q42 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public gp(a23 r1, d23 r2, rd1 r3, kc1 r4) {
        this.n = 3;
        this.o = r2;
        this.p = r4;
        super(0);
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r1 = 4;
        switch(this.n) {
            case 0: goto L81;
            case 1: goto L79;
            case 2: goto L77;
            case 3: goto L68;
            case 4: goto L66;
            case 5: goto L101;
            case 6: goto L6;
            default: goto L4;
        };
    L4:
        ((d23) this.o).e((a23) this.p);
        return j15.a;
    L6:
        mq1 r0 = (mq1) this.o;
        pb4 r12 = (pb4) this.p;
        jx3 r2 = new jx3();
        rq1 r3 = r0.o;
        zq1 r4 = r3.J;
        monitor-enter(r4);
        monitor-enter(r3);     // Catch: Throwable -> L35
        pb4 r5 = r3.E;     // Catch: Throwable -> L28
        pb4 r6 = new pb4();     // Catch: Throwable -> L28
        r5.getClass();     // Catch: Throwable -> L28
        int r7 = 0;
        int r8 = 0;
    L11:
        if (r8 >= 10) goto L16;
        if (((1 << r8) & r5.a) == 0) goto L15;
        r6.b(r8, r5.b[r8]);     // Catch: Throwable -> L28
    L15:
        r8 = r8 + 1;     // Catch: Throwable -> L28
        goto L11
    L16:
        int r9 = 0;
    L17:
        if (r9 >= 10) goto L22;
        if (((1 << r9) & r12.a) == 0) goto L21;
        r6.b(r9, r12.b[r9]);     // Catch: Throwable -> L28
    L21:
        r9 = r9 + 1;     // Catch: Throwable -> L28
        goto L17
    L22:
        r2.n = r6;     // Catch: Throwable -> L28
        long r10 = ((long) r6.a()) - ((long) r5.a());     // Catch: Throwable -> L28
        if (r10 != 0) goto L25;
    L30:
        yq1[] r11 = null;
    L31:
        pb4 r13 = (pb4) r2.n;     // Catch: Throwable -> L28
        r13.getClass();     // Catch: Throwable -> L28
        r3.E = r13;     // Catch: Throwable -> L28
        fr4.c(r3.w, r3.p + " onSettings", new gp(r1, r3, r2));     // Catch: Throwable -> L28
        monitor-exit(r3);     // Catch: Throwable -> L35
        r3.J.b((pb4) r2.n);     // Catch: Throwable -> L35 IOException -> L37
    L39:
        monitor-exit(r4);
        if (r11 == null) goto L54;
        int r14 = r11.length;
    L42:
        if (r7 >= r14) goto L54;
        yq1 r15 = r11[r7];
        monitor-enter(r15);
        r15.e += r10;     // Catch: Throwable -> L50
        if (r10 <= 0) goto L48;
        r15.notifyAll();     // Catch: Throwable -> L50
    L48:
        monitor-exit(r15);
        r7 = r7 + 1;
    L50:
        th = move-exception;
        throw th;
    L54:
        return j15.a;
    L37:
        e = move-exception;
        r3.f(e);     // Catch: Throwable -> L35
        goto L39
    L25:
        if (r3.o.isEmpty() == true) goto L30;
        r11 = (yq1[]) r3.o.values().toArray(new yq1[0]);     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        throw th;     // Catch: Throwable -> L35
    L35:
        th = move-exception;
        throw th;
    L66:
        rq1 r16 = (rq1) this.o;
        r16.n.c(r16, (pb4) ((jx3) this.p).n);
        return j15.a;
    L68:
        d23 r17 = (d23) this.o;
        kc1 r18 = (kc1) this.p;
        Iterator r19 = ((Iterable) r17.f.n.getValue()).iterator();
    L70:
        if (r19.hasNext() == false) goto L76;
        a23 r20 = (a23) r19.next();
        if (rd1.n() == false) goto L74;
        Log.v("FragmentNavigator", "Marking transition complete for entry " + r20 + " due to fragment " + r18 + " viewmodel being cleared");
    L74:
        r17.b(r20);
        goto L70
    L76:
        return j15.a;
    L77:
        String r21 = (String) this.o;
        sc5 r110 = (sc5) this.p;
        WorkDatabase r22 = r110.c;
        r22.getClass();
        r22.s(new v6(r22, r21, r110, r1));
        c64.b(r110.b, r22, r110.e);
        return j15.a;
    L79:
        sc5 r23 = (sc5) this.o;
        WorkDatabase r24 = r23.c;
        r24.getClass();
        r24.s(new k6(13, r23, (UUID) this.p));
        c64.b(r23.b, r23.c, r23.e);
        return j15.a;
    L81:
        xb0 r25 = ((ip) this.o).a;
        hp r111 = (hp) this.p;
        r25.getClass();
        Object r26 = r25.c;
        monitor-enter(r26);
    L89:
        th = move-exception;
        throw th;
    L84:
        if (r25.d.remove(r111) == true) goto L86;
    L91:
        monitor-exit(r26);
        return j15.a;
    L86:
        if (r25.d.isEmpty() == false) goto L91;
        r25.d();     // Catch: Throwable -> L89
        goto L91
    L101:
        ((rq1) this.o).n.d((yq1) this.p);     // Catch: IOException -> L61
    L65:
        return j15.a;
    L61:
        e = move-exception;
        qg3 r27 = qg3.a;
        qg3 r28 = qg3.a;
        String r29 = "Http2Connection.Listener failure for " + ((rq1) this.o).p;
        r28.getClass();
        qg3.i(r29, 4, e);
        ((yq1) this.p).c(b21.q, e);     // Catch: IOException -> L96
        goto L65
    }

    public /* synthetic */ gp(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        super(0);
    }

    public gp(d23 r1, a23 r2, boolean r3) {
        this.n = 7;
        this.o = r1;
        this.p = r2;
        super(0);
    }
}
