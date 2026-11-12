package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ps0 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;

    public /* synthetic */ ps0(int r1, String r2, String r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r8) {
        int r0 = this.n;
        int r1 = 0;
        boolean r2 = false;
        Boolean r3 = null;
        String r5 = this.p;
        String r7 = this.o;
        x34 r9 = (x34) r8;
        switch(r0) {
            case 0: goto L65;
            case 1: goto L51;
            case 2: goto L29;
            case 3: goto L15;
            default: goto L4;
        };
    L4:
        z34 r10 = r9.U("INSERT OR IGNORE INTO synced_playlist (playlistId, serverId) VALUES (?, ?)");
        if (r7 != null) goto L9;
        r10.e(1);     // Catch: Throwable -> L7
    L10:
        r10.r(2, r5);     // Catch: Throwable -> L7
        r10.O();     // Catch: Throwable -> L7
        r10.close();
        return null;
    L9:
        r10.r(1, r7);     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        r10.close();
        throw th;
    L15:
        z34 r11 = r9.U("DELETE FROM synced_playlist WHERE playlistId = ? AND serverId = ?");
        if (r7 != null) goto L20;
        r11.e(1);     // Catch: Throwable -> L18
    L21:
        if (r5 != null) goto L23;
        r11.e(2);     // Catch: Throwable -> L18
    L24:
        r11.O();     // Catch: Throwable -> L18
        r11.close();
        return null;
    L23:
        r11.r(2, r5);     // Catch: Throwable -> L18
        goto L24
    L20:
        r11.r(1, r7);     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        r11.close();
        throw th;
    L29:
        z34 r12 = r9.U("SELECT EXISTS(SELECT 1 FROM synced_playlist WHERE playlistId = ? AND serverId = ?)");
        if (r7 != null) goto L34;
        r12.e(1);     // Catch: Throwable -> L32
    L35:
        r12.r(2, r5);     // Catch: Throwable -> L32
        if (r12.O() == true) goto L38;
    L47:
        r12.close();
        return r3;
    L38:
        if (r12.isNull(0) == false) goto L40;
        Integer r13 = null;
    L41:
        if (r13 == null) goto L47;
        if (r13.intValue() == 0) goto L46;
        r2 = true;
    L46:
        r3 = Boolean.valueOf(r2);     // Catch: Throwable -> L32
        goto L47
    L40:
        r13 = Integer.valueOf((int) r12.getLong(0));     // Catch: Throwable -> L32
        goto L41
    L34:
        r12.r(1, r7);     // Catch: Throwable -> L32
    L32:
        th = move-exception;
        r12.close();
        throw th;
    L51:
        z34 r14 = r9.U("UPDATE playlist SET name = ? WHERE id = ?");
        if (r7 != null) goto L56;
        r14.e(1);     // Catch: Throwable -> L54
    L57:
        if (r5 != null) goto L59;
        r14.e(2);     // Catch: Throwable -> L54
    L60:
        r14.O();     // Catch: Throwable -> L54
        r14.close();
        return null;
    L59:
        r14.r(2, r5);     // Catch: Throwable -> L54
        goto L60
    L56:
        r14.r(1, r7);     // Catch: Throwable -> L54
    L54:
        th = move-exception;
        r14.close();
        throw th;
    L65:
        z34 r15 = r9.U("SELECT COUNT(*) FROM download WHERE album_id = ? AND NULLIF(album_artist, '') IS NULL AND NULLIF(album, '') <> ? AND download_state = 1");
        if (r7 != null) goto L70;
        r15.e(1);     // Catch: Throwable -> L68
    L71:
        r15.r(2, r5);     // Catch: Throwable -> L68
        if (r15.O() == false) goto L74;
        r1 = (int) r15.getLong(0);     // Catch: Throwable -> L68
    L74:
        Integer r16 = Integer.valueOf(r1);     // Catch: Throwable -> L68
        r15.close();
        return r16;
    L70:
        r15.r(1, r7);     // Catch: Throwable -> L68
    L68:
        th = move-exception;
        r15.close();
        throw th;
    }
}
