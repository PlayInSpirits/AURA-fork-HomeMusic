package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kv implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ kv(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r6) {
        switch(this.n) {
            case 0: goto L20;
            case 1: goto L11;
            case 2: goto L9;
            default: goto L4;
        };
    L4:
        Throwable r7 = (Throwable) r6;
        hp4 r5 = (hp4) this.o;
        cz r0 = r5.p;
        if (r0 == null) goto L7;
        r0.r(r7);
    L7:
        r5.p = null;
        return j15.a;
    L9:
        Throwable r8 = (Throwable) r6;
        cz r9 = (cz) this.o;
        j15 r10 = j15.a;
        r9.resumeWith(r10);
        return r10;
    L11:
        gh4 r11 = (gh4) r6;
        Object r1 = jh4.c;
        monitor-enter(r1);
        long r2 = jh4.e;     // Catch: Throwable -> L17
        jh4.e = 1 + r2;     // Catch: Throwable -> L17
        monitor-exit(r1);
        return new uu3(r2, r11, (if1) this.o);
    L17:
        th = move-exception;
        throw th;
    L20:
        Throwable r12 = (Throwable) r6;
        ((ez) this.o).cancel();
        return j15.a;
    }
}
