package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ir0 extends q42 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ ir0(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
        super(1);
    }

    @Override // defpackage.if1
    public final Object invoke(Object r7) {
        int r0 = this.n;
        int r1 = 1;
        j15 r2 = j15.a;
        Object r6 = this.o;
        switch(r0) {
            case 0: goto L36;
            case 1: goto L34;
            case 2: goto L21;
            case 3: goto L19;
            case 4: goto L15;
            case 5: goto L10;
            default: goto L5;
        };
    L19:
        Throwable r8 = (Throwable) r7;
        ((ic2) r6).cancel(false);
        return r2;
    L21:
        sv0 r9 = (sv0) r7;
        sj1 r10 = (sj1) r6;
        nc r3 = r10.l;
        if (r10.n == true) goto L24;
    L32:
        r10.c(r9);
    L33:
        return r2;
    L24:
        if (r10.A == false) goto L32;
        if (r3 == null) goto L32;
        i61 r4 = r9.O();
        long r5 = r4.j();
        r4.g().e();
        ((i61) ((zg5) r4.o).n).g().i(r3);     // Catch: Throwable -> L29
        r10.c(r9);     // Catch: Throwable -> L29
        r4.g().k();
        r4.t(r5);
    L29:
        th = move-exception;
        r4.g().k();
        r4.t(r5);
        throw th;
    L34:
        a23 r11 = (a23) r7;
        r11.getClass();
        return new d70(r1, (rd1) r6, r11);
    L36:
        ((IOException) r7).getClass();
        tl1 r12 = ze5.a;
        ((jr0) r6).x = true;
        return r2;
    L5:
        if (r7 != ((x03) r6)) goto L8;
        return "(this)";
    L8:
        return String.valueOf(r7);
    L10:
        if (r7 != ((r03) r6)) goto L13;
        return "(this)";
    L13:
        return String.valueOf(r7);
    L15:
        if (r7 != ((q03) r6)) goto L18;
        return "(this)";
    L18:
        return String.valueOf(r7);
    }
}
