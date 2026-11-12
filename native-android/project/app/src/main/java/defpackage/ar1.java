package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ar1 implements uw2 {
    public static final ab3 b = null;
    public final si1 a;

    static {
        b = ab3.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    }

    public ar1(si1 r1) {
        this.a = r1;
    }

    @Override // defpackage.uw2
    public final /* bridge */ /* synthetic */ boolean a(Object r1) {
        qi1 r2 = (qi1) r1;
        return true;
    }

    @Override // defpackage.uw2
    public final tw2 b(Object r2, int r3, int r4, db3 r5) {
        qi1 r6 = (qi1) r2;
        si1 r1 = this.a;
        if (r1 == null) goto L16;
        rw2 r7 = (rw2) r1.o;
        sw2 r8 = sw2.a(r6);
        Object r9 = r7.a(r8);
        ArrayDeque r0 = sw2.b;
        monitor-enter(r0);
        r0.offer(r8);     // Catch: Throwable -> L12
        monitor-exit(r0);     // Catch: Throwable -> L12
        qi1 r10 = (qi1) r9;
        if (r10 != null) goto L11;
        r7.d(sw2.a(r6), r6);
        goto L16
    L11:
        r6 = r10;
    L12:
        th = move-exception;
        throw th;
    L16:
        return new tw2(r6, new hr1(r6, ((Integer) r5.c(b)).intValue()));
    }
}
