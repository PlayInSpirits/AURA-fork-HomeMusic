package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qs0 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;

    public /* synthetic */ qs0(String r1, String r2, String r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r5) {
        int r0 = this.n;
        String r1 = this.q;
        String r2 = this.p;
        String r4 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        String r6 = (String) r5;
        r6.getClass();
        String r7 = r6.concat("/api/dislikes");
        fr1 r3 = new fr1();
        r3.e(null, r7);
        fr1 r8 = r3.b().g();
        r8.a(r4, r2);
        r8.a("client", r1);
        gr1 r9 = r8.b();
        nz3 r10 = new nz3();
        r10.a = r9;
        r10.b("DELETE", xe5.d);
        return new oz3(r10);
    L6:
        x34 r11 = (x34) r5;
        z34 r12 = r11.U("UPDATE download SET album_artist = ? WHERE album_id = ? AND album = ? AND NULLIF(album_artist, '') IS NULL");
        r12.r(1, r4);     // Catch: Throwable -> L10
        if (r2 != null) goto L12;
        r12.e(2);     // Catch: Throwable -> L10
    L13:
        r12.r(3, r1);     // Catch: Throwable -> L10
        r12.O();     // Catch: Throwable -> L10
        Integer r13 = Integer.valueOf(ji2.x(r11));     // Catch: Throwable -> L10
        r12.close();
        return r13;
    L12:
        r12.r(2, r2);     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        r12.close();
        throw th;
    }
}
