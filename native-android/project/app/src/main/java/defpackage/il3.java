package defpackage;

import com.eddyizm.tempus.subsonic.models.Playlist;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class il3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ ml3 o;
    public final /* synthetic */ String p;

    public /* synthetic */ il3(ml3 r1, String r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r25) {
        int r1 = this.n;
        String r15 = this.p;
        ml3 r0 = this.o;
        switch(r1) {
            case 0: goto L83;
            default: goto L4;
        };
    L4:
        Object r13 = r0.c;
        z34 r2 = ((x34) r25).U("SELECT p.*, (pp.playlistId IS NOT NULL) AS isPinned FROM playlist p LEFT JOIN pinned_playlist pp ON p.id = pp.playlistId ORDER BY CASE WHEN ? = 'ORDER_BY_RANDOM' THEN RANDOM() END ASC, CASE WHEN ? = 'ORDER_BY_PINNED' THEN pp.playlistId IS NOT NULL END DESC, CASE WHEN ? = 'ORDER_BY_NAME' THEN p.name END ASC, CASE WHEN ? = 'ORDER_BY_DATE' THEN p.created END DESC, CASE WHEN ? = 'ORDER_BY_SONGS' THEN p.songCount END DESC, CASE WHEN ? = 'ORDER_BY_LAST_PLAYED' THEN p.lastPlayed END DESC, CASE WHEN ? = 'ORDER_BY_LAST_UPDATED' THEN p.changed END DESC, CASE WHEN ? = 'ORDER_BY_BOTH' THEN MAX(p.lastPlayed, IFNULL(p.changed, 0)) END DESC");
        if (r15 != null) goto L9;
        r2.e(1);     // Catch: Throwable -> L7
    L10:
        if (r15 != null) goto L12;
        r2.e(2);     // Catch: Throwable -> L7
    L13:
        if (r15 != null) goto L15;
        r2.e(3);     // Catch: Throwable -> L7
    L16:
        if (r15 != null) goto L18;
        r2.e(4);     // Catch: Throwable -> L7
    L19:
        if (r15 != null) goto L21;
        r2.e(5);     // Catch: Throwable -> L7
    L22:
        if (r15 != null) goto L24;
        r2.e(6);     // Catch: Throwable -> L7
    L25:
        if (r15 != null) goto L27;
        r2.e(7);     // Catch: Throwable -> L7
    L28:
        if (r15 != null) goto L30;
        r2.e(8);     // Catch: Throwable -> L7
    L31:
        int r12 = rr2.E(r2, "id");     // Catch: Throwable -> L7
        int r11 = rr2.E(r2, "name");     // Catch: Throwable -> L7
        int r10 = rr2.E(r2, "duration");     // Catch: Throwable -> L7
        int r9 = rr2.E(r2, "coverArt");     // Catch: Throwable -> L7
        int r8 = rr2.E(r2, "comment");     // Catch: Throwable -> L7
        int r7 = rr2.E(r2, "owner");     // Catch: Throwable -> L7
        int r6 = rr2.E(r2, "isUniversal");     // Catch: Throwable -> L7
        int r5 = rr2.E(r2, "songCount");     // Catch: Throwable -> L7
        int r4 = rr2.E(r2, "created");     // Catch: Throwable -> L7
        int r3 = rr2.E(r2, "changed");     // Catch: Throwable -> L7
        int r14 = rr2.E(r2, "lastPlayed");     // Catch: Throwable -> L7
        int r16 = rr2.E(r2, "allowedUsers");     // Catch: Throwable -> L7
        ArrayList r17 = new ArrayList();     // Catch: Throwable -> L7
    L32:
        if (r2.O() == false) goto L79;
        if (r2.isNull(r12) == false) goto L37;
        String r19 = null;
    L39:
        if (r2.isNull(r11) == false) goto L41;
        String r20 = null;
    L42:
        long r21 = r2.getLong(r10);     // Catch: Throwable -> L7
        if (r2.isNull(r9) == false) goto L45;
        String r23 = null;
    L46:
        Playlist r18 = new Playlist(r19, r20, r21, r23);     // Catch: Throwable -> L7
        if (r2.isNull(r8) == false) goto L49;
        String r22 = null;
    L50:
        r18.setComment(r22);     // Catch: Throwable -> L7
        if (r2.isNull(r7) == false) goto L53;
        String r24 = null;
    L54:
        r18.setOwner(r24);     // Catch: Throwable -> L7
        if (r2.isNull(r6) == false) goto L57;
        Integer r26 = null;
    L58:
        if (r26 != null) goto L61;
        Boolean r27 = null;
    L65:
        r18.setUniversal(r27);     // Catch: Throwable -> L7
        r18.setSongCount((int) r2.getLong(r5));     // Catch: Throwable -> L7
        if (r2.isNull(r4) == false) goto L68;
        Long r28 = null;
    L69:
        r18.setCreated(i80.B(r28));     // Catch: Throwable -> L7
        if (r2.isNull(r3) == false) goto L72;
        Long r29 = null;
    L73:
        r18.setChanged(i80.B(r29));     // Catch: Throwable -> L7
        r18.setLastPlayed(r2.getLong(r14));     // Catch: Throwable -> L7
        if (r2.isNull(r16) == false) goto L76;
        String r30 = null;
    L77:
        r18.setAllowedUsers(((si1) r0.d).E(r30));     // Catch: Throwable -> L7
        r17.add(r18);     // Catch: Throwable -> L7
        r8 = r8;
        r7 = r7;
        goto L32
    L76:
        r30 = r2.D(r16);     // Catch: Throwable -> L7
        goto L77
    L72:
        r29 = Long.valueOf(r2.getLong(r3));     // Catch: Throwable -> L7
        goto L73
    L68:
        r28 = Long.valueOf(r2.getLong(r4));     // Catch: Throwable -> L7
        goto L69
    L61:
        if (r26.intValue() == 0) goto L63;
        boolean r31 = true;
    L64:
        r27 = Boolean.valueOf(r31);     // Catch: Throwable -> L7
        goto L65
    L63:
        r31 = false;
        goto L64
    L57:
        r26 = Integer.valueOf((int) r2.getLong(r6));     // Catch: Throwable -> L7
        goto L58
    L53:
        r24 = r2.D(r7);     // Catch: Throwable -> L7
        goto L54
    L49:
        r22 = r2.D(r8);     // Catch: Throwable -> L7
        goto L50
    L45:
        r23 = r2.D(r9);     // Catch: Throwable -> L7
        goto L46
    L41:
        r20 = r2.D(r11);     // Catch: Throwable -> L7
        goto L42
    L37:
        r19 = r2.D(r12);     // Catch: Throwable -> L7
        goto L39
    L79:
        r2.close();
        return r17;
    L30:
        r2.r(8, r15);     // Catch: Throwable -> L7
        goto L31
    L27:
        r2.r(7, r15);     // Catch: Throwable -> L7
        goto L28
    L24:
        r2.r(6, r15);     // Catch: Throwable -> L7
        goto L25
    L21:
        r2.r(5, r15);     // Catch: Throwable -> L7
        goto L22
    L18:
        r2.r(4, r15);     // Catch: Throwable -> L7
        goto L19
    L15:
        r2.r(3, r15);     // Catch: Throwable -> L7
        goto L16
    L12:
        r2.r(2, r15);     // Catch: Throwable -> L7
        goto L13
    L9:
        r2.r(1, r15);     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        r2.close();
        throw th;
    L83:
        Object r110 = r0.c;
        z34 r32 = ((x34) r25).U("SELECT p.*, (pp.playlistId IS NOT NULL) AS isPinned FROM playlist p LEFT JOIN pinned_playlist pp ON p.id = pp.playlistId ORDER BY CASE WHEN ? = 'ORDER_BY_RANDOM' THEN RANDOM() END ASC, CASE WHEN ? = 'ORDER_BY_PINNED' THEN pp.playlistId IS NOT NULL END DESC, CASE WHEN ? = 'ORDER_BY_NAME' THEN p.name END ASC, CASE WHEN ? = 'ORDER_BY_DATE' THEN p.created END DESC, CASE WHEN ? = 'ORDER_BY_SONGS' THEN p.songCount END DESC, CASE WHEN ? = 'ORDER_BY_LAST_PLAYED' THEN p.lastPlayed END DESC, CASE WHEN ? = 'ORDER_BY_LAST_UPDATED' THEN p.changed END DESC, CASE WHEN ? = 'ORDER_BY_BOTH' THEN MAX(p.lastPlayed, IFNULL(p.changed, 0)) END DESC LIMIT ?");
        if (r15 == null) goto L86;
        r32.r(1, r15);     // Catch: Throwable -> L87
    L90:
        if (r15 != null) goto L92;
        r32.e(2);     // Catch: Throwable -> L87
    L93:
        if (r15 != null) goto L95;
        r32.e(3);     // Catch: Throwable -> L87
    L96:
        if (r15 != null) goto L98;
        r32.e(4);     // Catch: Throwable -> L87
    L99:
        if (r15 != null) goto L101;
        r32.e(5);     // Catch: Throwable -> L87
    L102:
        if (r15 != null) goto L104;
        r32.e(6);     // Catch: Throwable -> L87
    L105:
        if (r15 != null) goto L107;
        r32.e(7);     // Catch: Throwable -> L87
    L108:
        if (r15 != null) goto L110;
        r32.e(8);     // Catch: Throwable -> L87
    L111:
        r32.c(9, 20);     // Catch: Throwable -> L87
        int r33 = rr2.E(r32, "id");     // Catch: Throwable -> L87
        int r34 = rr2.E(r32, "name");     // Catch: Throwable -> L87
        int r111 = rr2.E(r32, "duration");     // Catch: Throwable -> L87
        int r35 = rr2.E(r32, "coverArt");     // Catch: Throwable -> L87
        int r36 = rr2.E(r32, "comment");     // Catch: Throwable -> L87
        int r37 = rr2.E(r32, "owner");     // Catch: Throwable -> L87
        int r38 = rr2.E(r32, "isUniversal");     // Catch: Throwable -> L87
        int r39 = rr2.E(r32, "songCount");     // Catch: Throwable -> L87
        int r40 = rr2.E(r32, "created");     // Catch: Throwable -> L87
        int r112 = rr2.E(r32, "changed");     // Catch: Throwable -> L87
        int r113 = rr2.E(r32, "lastPlayed");     // Catch: Throwable -> L87
        int r114 = rr2.E(r32, "allowedUsers");     // Catch: Throwable -> L87
        ArrayList r115 = new ArrayList();     // Catch: Throwable -> L87
    L112:
        if (r32.O() == false) goto L159;
        if (r32.isNull(r33) == false) goto L117;
        String r116 = null;
    L119:
        if (r32.isNull(r34) == false) goto L121;
        String r210 = null;
    L122:
        long r211 = r32.getLong(r111);     // Catch: Throwable -> L87
        if (r32.isNull(r35) == false) goto L125;
        String r212 = null;
    L126:
        Playlist r117 = new Playlist(r116, r210, r211, r212);     // Catch: Throwable -> L87
        if (r32.isNull(r36) == false) goto L129;
        String r41 = null;
    L130:
        r117.setComment(r41);     // Catch: Throwable -> L87
        if (r32.isNull(r37) == false) goto L133;
        String r42 = null;
    L134:
        r117.setOwner(r42);     // Catch: Throwable -> L87
        if (r32.isNull(r38) == false) goto L137;
        Integer r43 = null;
    L138:
        if (r43 != null) goto L141;
        Boolean r44 = null;
    L145:
        r117.setUniversal(r44);     // Catch: Throwable -> L87
        r117.setSongCount((int) r32.getLong(r39));     // Catch: Throwable -> L87
        if (r32.isNull(r40) == false) goto L148;
        Long r45 = null;
    L149:
        r117.setCreated(i80.B(r45));     // Catch: Throwable -> L87
        if (r32.isNull(r112) == false) goto L152;
        Long r46 = null;
    L153:
        r117.setChanged(i80.B(r46));     // Catch: Throwable -> L87
        r117.setLastPlayed(r32.getLong(r113));     // Catch: Throwable -> L87
        if (r32.isNull(r114) == false) goto L156;
        String r47 = null;
    L157:
        r117.setAllowedUsers(((si1) r0.d).E(r47));     // Catch: Throwable -> L87
        r115.add(r117);     // Catch: Throwable -> L87
        r33 = r33;
        r34 = r34;
        goto L112
    L156:
        r47 = r32.D(r114);     // Catch: Throwable -> L87
        goto L157
    L152:
        r46 = Long.valueOf(r32.getLong(r112));     // Catch: Throwable -> L87
        goto L153
    L148:
        r45 = Long.valueOf(r32.getLong(r40));     // Catch: Throwable -> L87
        goto L149
    L141:
        if (r43.intValue() == 0) goto L143;
        boolean r48 = true;
    L144:
        r44 = Boolean.valueOf(r48);     // Catch: Throwable -> L87
        goto L145
    L143:
        r48 = false;
        goto L144
    L137:
        r43 = Integer.valueOf((int) r32.getLong(r38));     // Catch: Throwable -> L87
        goto L138
    L133:
        r42 = r32.D(r37);     // Catch: Throwable -> L87
        goto L134
    L129:
        r41 = r32.D(r36);     // Catch: Throwable -> L87
        goto L130
    L125:
        r212 = r32.D(r35);     // Catch: Throwable -> L87
        goto L126
    L121:
        r210 = r32.D(r34);     // Catch: Throwable -> L87
        goto L122
    L117:
        r116 = r32.D(r33);     // Catch: Throwable -> L87
        goto L119
    L159:
        r32.close();
        return r115;
    L110:
        r32.r(8, r15);     // Catch: Throwable -> L87
        goto L111
    L107:
        r32.r(7, r15);     // Catch: Throwable -> L87
        goto L108
    L104:
        r32.r(6, r15);     // Catch: Throwable -> L87
        goto L105
    L101:
        r32.r(5, r15);     // Catch: Throwable -> L87
        goto L102
    L98:
        r32.r(4, r15);     // Catch: Throwable -> L87
        goto L99
    L95:
        r32.r(3, r15);     // Catch: Throwable -> L87
        goto L96
    L92:
        r32.r(2, r15);     // Catch: Throwable -> L87
        goto L93
    L86:
        r32.e(1);     // Catch: Throwable -> L87
    L87:
        th = move-exception;
        r32.close();
        throw th;
    }
}
