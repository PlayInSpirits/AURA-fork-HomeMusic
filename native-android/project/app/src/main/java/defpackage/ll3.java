package defpackage;

import com.eddyizm.tempus.subsonic.models.Playlist;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ll3 extends au0 {
    public final /* synthetic */ int G;
    public final /* synthetic */ ml3 H;

    public /* synthetic */ ll3(ml3 r1, int r2) {
        this.G = r2;
        this.H = r1;
    }

    @Override // defpackage.au0
    public final void c(z34 r18, Object r19) {
        int r2 = this.G;
        ml3 r0 = this.H;
        switch(r2) {
            case 0: goto L44;
            default: goto L4;
        };
    L4:
        Playlist r3 = (Playlist) r19;
        if (r3.getId() != null) goto L7;
        r18.e(1);
    L9:
        if (r3.getName() != null) goto L11;
        r18.e(2);
    L12:
        r18.c(3, r3.getDuration());
        if (r3.getCoverArtId() != null) goto L15;
        r18.e(4);
    L17:
        if (r3.getComment() != null) goto L19;
        r18.e(5);
    L21:
        if (r3.getOwner() != null) goto L23;
        r18.e(6);
    L25:
        if (r3.isUniversal() != null) goto L27;
        Integer r5 = null;
    L28:
        if (r5 != null) goto L30;
        r18.e(7);
    L31:
        r18.c(8, r3.getSongCount());
        Long r4 = i80.j(r3.getCreated());
        if (r4 != null) goto L34;
        r18.e(9);
    L35:
        Long r6 = i80.j(r3.getChanged());
        if (r6 != null) goto L38;
        r18.e(10);
    L39:
        r18.c(11, r3.getLastPlayed());
        si1 r1 = (si1) r0.d;
        String r7 = ((nk1) r1.o).j(r3.getAllowedUsers());
        if (r7 != null) goto L42;
        r18.e(12);
        return;
    L42:
        r18.r(12, r7);
        return;
    L38:
        r18.c(10, r6.longValue());
        goto L39
    L34:
        r18.c(9, r4.longValue());
        goto L35
    L30:
        r18.c(7, r5.intValue());
        goto L31
    L27:
        r5 = Integer.valueOf(r3.isUniversal().booleanValue() ? 1 : 0);
        goto L28
    L23:
        r18.r(6, r3.getOwner());
        goto L25
    L19:
        r18.r(5, r3.getComment());
        goto L21
    L15:
        r18.r(4, r3.getCoverArtId());
        goto L17
    L11:
        r18.r(2, r3.getName());
        goto L12
    L7:
        r18.r(1, r3.getId());
        goto L9
    L44:
        Playlist r8 = (Playlist) r19;
        if (r8.getId() != null) goto L47;
        r18.e(1);
    L49:
        if (r8.getName() != null) goto L51;
        r18.e(2);
    L52:
        r18.c(3, r8.getDuration());
        if (r8.getCoverArtId() != null) goto L55;
        r18.e(4);
    L57:
        if (r8.getComment() != null) goto L59;
        r18.e(5);
    L61:
        if (r8.getOwner() != null) goto L63;
        r18.e(6);
    L65:
        if (r8.isUniversal() != null) goto L67;
        Integer r9 = null;
    L68:
        if (r9 != null) goto L70;
        r18.e(7);
    L71:
        r18.c(8, r8.getSongCount());
        Long r10 = i80.j(r8.getCreated());
        if (r10 != null) goto L74;
        r18.e(9);
    L75:
        Long r11 = i80.j(r8.getChanged());
        if (r11 != null) goto L78;
        r18.e(10);
    L79:
        r18.c(11, r8.getLastPlayed());
        si1 r12 = (si1) r0.d;
        String r13 = ((nk1) r12.o).j(r8.getAllowedUsers());
        if (r13 != null) goto L82;
        r18.e(12);
        return;
    L82:
        r18.r(12, r13);
        return;
    L78:
        r18.c(10, r11.longValue());
        goto L79
    L74:
        r18.c(9, r10.longValue());
        goto L75
    L70:
        r18.c(7, r9.intValue());
        goto L71
    L67:
        r9 = Integer.valueOf(r8.isUniversal().booleanValue() ? 1 : 0);
        goto L68
    L63:
        r18.r(6, r8.getOwner());
        goto L65
    L59:
        r18.r(5, r8.getComment());
        goto L61
    L55:
        r18.r(4, r8.getCoverArtId());
        goto L57
    L51:
        r18.r(2, r8.getName());
        goto L52
    L47:
        r18.r(1, r8.getId());
        goto L49
    }

    @Override // defpackage.au0
    public final String i() {
        switch(this.G) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return "INSERT OR IGNORE INTO `playlist` (`id`,`name`,`duration`,`coverArt`,`comment`,`owner`,`isUniversal`,`songCount`,`created`,`changed`,`lastPlayed`,`allowedUsers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    L6:
        return "INSERT OR REPLACE INTO `playlist` (`id`,`name`,`duration`,`coverArt`,`comment`,`owner`,`isUniversal`,`songCount`,`created`,`changed`,`lastPlayed`,`allowedUsers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
