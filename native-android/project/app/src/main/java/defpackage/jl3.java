package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jl3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ long o;
    public final /* synthetic */ String p;

    public /* synthetic */ jl3(int r1, long r2, String r4) {
        this.n = r1;
        this.o = r2;
        this.p = r4;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r8) {
        int r0 = this.n;
        String r4 = this.p;
        long r5 = this.o;
        x34 r9 = (x34) r8;
        switch(r0) {
            case 0: goto L16;
            default: goto L4;
        };
    L4:
        z34 r7 = r9.U("UPDATE queue SET last_play=? WHERE id=?");
        r7.c(1, r5);     // Catch: Throwable -> L8
        if (r4 != null) goto L10;
        r7.e(2);     // Catch: Throwable -> L8
    L11:
        r7.O();     // Catch: Throwable -> L8
        r7.close();
        return null;
    L10:
        r7.r(2, r4);     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        r7.close();
        throw th;
    L16:
        z34 r10 = r9.U("UPDATE playlist SET lastPlayed = ? WHERE id = ?");
        r10.c(1, r5);     // Catch: Throwable -> L20
        if (r4 != null) goto L22;
        r10.e(2);     // Catch: Throwable -> L20
    L23:
        r10.O();     // Catch: Throwable -> L20
        r10.close();
        return null;
    L22:
        r10.r(2, r4);     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        r10.close();
        throw th;
    }
}
