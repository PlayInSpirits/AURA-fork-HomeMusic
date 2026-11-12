package defpackage;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import app.homemusic.R;
import com.eddyizm.tempus.homemusic.SmartPlan;
import com.eddyizm.tempus.model.Chronology;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.model.LyricsCache;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.subsonic.models.Playlist;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ o(int r1, Object r2, Object r3) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v8, types: [u01] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v11, types: [si1] */
    @Override // defpackage.if1
    public final Object invoke(Object r58) {
        switch(this.n) {
            case 0: goto L239;
            case 1: goto L231;
            case 2: goto L229;
            case 3: goto L227;
            case 4: goto L225;
            case 5: goto L223;
            case 6: goto L208;
            case 7: goto L206;
            case 8: goto L204;
            case 9: goto L202;
            case 10: goto L197;
            case 11: goto L191;
            case 12: goto L189;
            case 13: goto L187;
            case 14: goto L157;
            case 15: goto L155;
            case 16: goto L154;
            case 17: goto L124;
            case 18: goto L122;
            case 19: goto L120;
            case 20: goto L118;
            case 21: goto L116;
            case 22: goto L114;
            case 23: goto L97;
            case 24: goto L95;
            case 25: goto L90;
            case 26: goto L71;
            case 27: goto L61;
            case 28: goto L59;
            default: goto L4;
        };
    L4:
        qp4 r2 = (qp4) this.o;
        String r0 = (String) this.p;
        Object r3 = r2.b;
        z34 r1 = ((x34) r58).U("SELECT p.* FROM playlist p JOIN synced_playlist s ON p.id = s.playlistId WHERE s.serverId = ?");
        r1.r(1, r0);     // Catch: Throwable -> L53
        int r4 = rr2.E(r1, "id");     // Catch: Throwable -> L53
        int r5 = rr2.E(r1, "name");     // Catch: Throwable -> L53
        int r7 = rr2.E(r1, "duration");     // Catch: Throwable -> L53
        int r8 = rr2.E(r1, "coverArt");     // Catch: Throwable -> L53
        int r9 = rr2.E(r1, "comment");     // Catch: Throwable -> L53
        int r10 = rr2.E(r1, "owner");     // Catch: Throwable -> L53
        int r11 = rr2.E(r1, "isUniversal");     // Catch: Throwable -> L53
        int r12 = rr2.E(r1, "songCount");     // Catch: Throwable -> L53
        int r13 = rr2.E(r1, "created");     // Catch: Throwable -> L53
        int r14 = rr2.E(r1, "changed");     // Catch: Throwable -> L53
        int r15 = rr2.E(r1, "lastPlayed");     // Catch: Throwable -> L53
        int r6 = rr2.E(r1, "allowedUsers");     // Catch: Throwable -> L53
        ArrayList r16 = new ArrayList();     // Catch: Throwable -> L53
    L6:
        if (r1.O() == false) goto L55;
        if (r1.isNull(r4) == false) goto L11;
        String r20 = null;
    L13:
        if (r1.isNull(r5) == false) goto L15;
        String r21 = null;
    L16:
        long r22 = r1.getLong(r7);     // Catch: Throwable -> L53
        if (r1.isNull(r8) == false) goto L19;
        String r24 = null;
    L20:
        Playlist r19 = new Playlist(r20, r21, r22, r24);     // Catch: Throwable -> L53
        if (r1.isNull(r9) == false) goto L23;
        String r17 = null;
    L24:
        r19.setComment(r17);     // Catch: Throwable -> L53
        if (r1.isNull(r10) == false) goto L27;
        String r18 = null;
    L28:
        r19.setOwner(r18);     // Catch: Throwable -> L53
        if (r1.isNull(r11) == false) goto L31;
        Integer r23 = null;
    L32:
        if (r23 != null) goto L35;
        Boolean r25 = null;
    L39:
        r19.setUniversal(r25);     // Catch: Throwable -> L53
        r19.setSongCount((int) r1.getLong(r12));     // Catch: Throwable -> L53
        if (r1.isNull(r13) == false) goto L42;
        Long r26 = null;
    L43:
        r19.setCreated(i80.B(r26));     // Catch: Throwable -> L53
        if (r1.isNull(r14) == false) goto L46;
        Long r27 = null;
    L47:
        r19.setChanged(i80.B(r27));     // Catch: Throwable -> L53
        r19.setLastPlayed(r1.getLong(r15));     // Catch: Throwable -> L53
        if (r1.isNull(r6) == false) goto L50;
        String r28 = null;
    L51:
        r19.setAllowedUsers(((si1) r2.c).E(r28));     // Catch: Throwable -> L53
        r16.add(r19);     // Catch: Throwable -> L53
        r7 = r7;
        r8 = r8;
        r4 = r4;
        goto L6
    L50:
        r28 = r1.D(r6);     // Catch: Throwable -> L53
        goto L51
    L46:
        r27 = Long.valueOf(r1.getLong(r14));     // Catch: Throwable -> L53
        goto L47
    L42:
        r26 = Long.valueOf(r1.getLong(r13));     // Catch: Throwable -> L53
        goto L43
    L35:
        if (r23.intValue() == 0) goto L37;
        boolean r29 = true;
    L38:
        r25 = Boolean.valueOf(r29);     // Catch: Throwable -> L53
        goto L39
    L37:
        r29 = false;
        goto L38
    L31:
        r23 = Integer.valueOf((int) r1.getLong(r11));     // Catch: Throwable -> L53
        goto L32
    L27:
        r18 = r1.D(r10);     // Catch: Throwable -> L53
        goto L28
    L23:
        r17 = r1.D(r9);     // Catch: Throwable -> L53
        goto L24
    L19:
        r24 = r1.D(r8);     // Catch: Throwable -> L53
        goto L20
    L15:
        r21 = r1.D(r5);     // Catch: Throwable -> L53
        goto L16
    L11:
        r20 = r1.D(r4);     // Catch: Throwable -> L53
        goto L13
    L55:
        r1.close();
        return r16;
    L53:
        th = move-exception;
        r1.close();
        throw th;
    L59:
        ig3.q((ig3) r58, (jg3) this.o, ((we4) this.p).M);
        return j15.a;
    L61:
        e74 r30 = (e74) this.o;
        g74 r31 = (g74) this.p;
        xu0 r32 = (xu0) r58;
        if (r32.b == false) goto L64;
        float r33 = -1.0f;
    L65:
        long r34 = r32.a;
        if (r31.d != hb3.o) goto L68;
        int r35 = 1;
        long r36 = g83.a(1, r34);
    L69:
        r30.a(r35, g83.f(r36, r33));
        return j15.a;
    L68:
        r35 = 1;
        r36 = g83.a(2, r34);
        goto L69
    L64:
        r33 = 1.0f;
        goto L65
    L71:
        tv3 r37 = (tv3) this.o;
        Throwable r38 = (Throwable) this.p;
        Throwable r39 = (Throwable) r58;
        Object r40 = r37.c;
        monitor-enter(r40);
        if (r38 == null) goto L83;
        if (r39 != null) goto L245;
    L84:
        r37.e = r38;     // Catch: Throwable -> L81
        nl4 r41 = r37.u;     // Catch: Throwable -> L81
        ov3 r42 = ov3.n;     // Catch: Throwable -> L81
        r41.getClass();     // Catch: Throwable -> L81
        r41.j(null, r42);     // Catch: Throwable -> L81
        monitor-exit(r40);
        return j15.a;
    L81:
        th = move-exception;
        throw th;
    L245:
        if ((r39 instanceof CancellationException) == false) goto L79;
        r39 = null;
    L79:
        if (r39 == null) goto L84;
        j51.d(r38, r39);     // Catch: Throwable -> L81
        goto L84
    L83:
        r38 = null;
        goto L84
    L90:
        z80 r43 = (z80) this.o;
        x03 r44 = (x03) this.p;
        r43.z(r58);
        if (r44 == null) goto L94;
        r44.a(r58);
    L94:
        return j15.a;
    L95:
        rm3 r45 = (rm3) this.o;
        ArrayList r46 = (ArrayList) this.p;
        ((q20) r45.o).H((x34) r58, r46);
        return null;
    L97:
        Boolean r47 = (Boolean) this.o;
        String r48 = (String) this.p;
        z34 r49 = ((x34) r58).U("UPDATE playlist SET isUniversal = ? WHERE id = ?");
        if (r47 != null) goto L243;
        Integer r50 = null;
    L101:
        if (r50 != null) goto L105;
        r49.e(1);     // Catch: Throwable -> L103
    L106:
        if (r48 != null) goto L108;
        r49.e(2);     // Catch: Throwable -> L103
    L109:
        r49.O();     // Catch: Throwable -> L103
        r49.close();
        return null;
    L103:
        th = move-exception;
        r49.close();
        throw th;
    L108:
        r49.r(2, r48);     // Catch: Throwable -> L103
        goto L109
    L105:
        r49.c(1, r50.intValue());     // Catch: Throwable -> L103
        goto L106
    L243:
        r50 = Integer.valueOf(r47.booleanValue() ? 1 : 0);     // Catch: Throwable -> L103
        goto L101
    L114:
        ml3 r51 = (ml3) this.o;
        List r52 = (List) this.p;
        ((ll3) r51.b).H((x34) r58, r52);
        return null;
    L116:
        b13 r53 = (b13) this.o;
        ig3 r54 = (ig3) r58;
        oc3 r55 = new oc3(0, (ArrayList) this.p);
        r54.n = true;
        r55.invoke(r54);
        r54.n = false;
        r53.getValue();
        return j15.a;
    L118:
        ((wf1) this.o).invoke(Integer.valueOf(((vp3) r58).a), Integer.valueOf(((qp4) this.p).e().b));
        return j15.a;
    L120:
        ((kz2) this.o).c.add(new hz2(r58, (y94) this.p));
        return j15.a;
    L122:
        rf2 r56 = (rf2) this.o;
        LyricsCache r57 = (LyricsCache) this.p;
        ((q20) r56.o).I((x34) r58, r57);
        return null;
    L124:
        oe2 r59 = (oe2) this.o;
        List r60 = (List) r58;
        List r61 = gb.O((Server) this.p);
        if (r60 == null) goto L130;
        ?? r62 = new ArrayList(r40.k0(r60, 10));
        Iterator r63 = r60.iterator();
    L128:
        if (r63.hasNext() == false) goto L131;
        Server r64 = (Server) r63.next();
        r62.add(new Server(r64.getServerId(), r64.getServerName(), r64.getUsername(), r64.getPassword(), r64.getAddress(), r64.getLocalAddress(), r64.getTimestamp(), r64.isLowSecurity(), r64.getClientCert()));
    L131:
        r59.n0 = q40.G0(r61, r62);
        Context r65 = r59.Z();
        ArrayList r66 = r59.n0;
        if (r66 == null) goto L151;
        ArrayList r67 = new ArrayList(r40.k0(r66, 10));
        int r68 = r66.size();
        int r69 = 0;
    L134:
        if (r69 >= r68) goto L136;
        Object r70 = r66.get(r69);
        r69 = r69 + 1;
        r67.add(((Server) r70).getServerName());
        goto L134
    L136:
        ArrayAdapter r71 = new ArrayAdapter(r65, R.layout.item_login_server2, r67.toArray(new String[0]));
        r71.setDropDownViewResource(R.layout.item_login_server2);
        pc1 r72 = r59.l0;
        r72.getClass();
        ((AutoCompleteTextView) r72.p).setAdapter(r71);
        if (r59.p0 == true) goto L150;
        ArrayList r73 = r59.n0;
        if (r73 != null) goto L141;
        h12.Q("serverList");
        throw null;
    L141:
        if (r73.isEmpty() == true) goto L150;
        pc1 r74 = r59.l0;
        r74.getClass();
        AutoCompleteTextView r75 = (AutoCompleteTextView) r74.p;
        ArrayList r76 = r59.n0;
        if (r76 == null) goto L145;
        r75.setText(((Server) r76.get(0)).getServerName(), false);
        pc1 r77 = r59.l0;
        r77.getClass();
        ((MaterialButton) r77.c).setText(r59.s(R.string.la_server_button_create));
        pc1 r78 = r59.l0;
        r78.getClass();
        ((MaterialButton) r78.d).setEnabled(false);
        pc1 r79 = r59.l0;
        r79.getClass();
        ((MaterialButton) r79.q).setEnabled(false);
        r59.p0 = true;
        goto L150
    L145:
        h12.Q("serverList");
        throw null;
    L150:
        return j15.a;
    L151:
        h12.Q("serverList");
        throw null;
    L130:
        r62 = u01.n;
        goto L131
    L155:
        z82 r80 = (z82) this.o;
        Object r81 = this.p;
        yr0 r82 = (yr0) r58;
        r80.p.i(r81);
        return new vy1(1, r80, r81);
    L157:
        jx3 r83 = (jx3) this.o;
        ArrayList r84 = (ArrayList) this.p;
        JSONObject r85 = (JSONObject) r58;
        r85.getClass();
        Object r86 = r83.n;
        if (r86 != null) goto L160;
    L162:
        r83.n = r85.optString("revision");
        JSONArray r87 = r85.getJSONArray("items");
        int r88 = r87.length();
        int r89 = 0;
    L163:
        if (r89 >= r88) goto L178;
        JSONObject r90 = r87.getJSONObject(r89);
        String r110 = r90.getString("id");
        r110.getClass();
        String r210 = r90.optString("title");
        String r211 = r90.optString("artist");
        String r212 = r90.optString("album");
        String r213 = r90.optString("cover");
        int r91 = r90.optInt("duration");
        String r92 = r90.optString("albumId");
        r92.getClass();
        if (qm4.u0(r92) == true) goto L167;
        String r410 = r92;
    L168:
        String r93 = r90.optString("artistId");
        r93.getClass();
        if (qm4.u0(r93) == true) goto L171;
        String r411 = r93;
    L172:
        String r94 = r90.optString("suffix");
        r94.getClass();
        if (qm4.u0(r94) == true) goto L175;
        String r310 = r94;
    L176:
        r84.add(new Child(r110, null, false, r210, r212, r211, null, null, null, r213, null, null, r310, null, null, Integer.valueOf(r91), Integer.valueOf(r90.optInt("bitrate")), null, null, null, false, null, null, null, null, null, null, r410, r411, null, null, null, null, null, null, -402756154, 7, null));
        r89 = r89 + 1;
        goto L163
    L175:
        r310 = null;
        goto L176
    L171:
        r411 = null;
        goto L172
    L167:
        r410 = null;
        goto L168
    L178:
        if (r87.length() > 0) goto L180;
    L182:
        u52.e = false;
        if (h12.c(u52.c().s, r83.n) == false) goto L186;
        u52.d = (String) r83.n;
        u52.c.k(q40.Q0(r84));
    L186:
        return j15.a;
    L180:
        if (r84.size() >= Math.min(r85.optInt("count"), SmartPlan.MAX_QUEUE)) goto L182;
        u52.n(r83, r84, r84.size());
        goto L186
    L160:
        if (r86.equals(r85.optString("revision")) == true) goto L162;
        u52.b.k(v52.a(u52.c(), 0, 0, R.string.lan_queue_changed, 536739839));
        u52.e = false;
        goto L186
    L187:
        c12 r95 = (c12) this.o;
        List r96 = (List) this.p;
        ((q20) r95.p).H((x34) r58, r96);
        return null;
    L189:
        ty1 r97 = (ty1) this.o;
        qy1 r98 = (qy1) this.p;
        yr0 r99 = (yr0) r58;
        r97.a.b(r98);
        r97.b.setValue(Boolean.TRUE);
        return new vy1(0, r97, r98);
    L191:
        fx3 r100 = (fx3) this.o;
        Runnable r101 = (Runnable) this.p;
        List r102 = (List) r58;
        if (r100.n == false) goto L194;
        r100.n = false;
    L196:
        return j15.a;
    L194:
        r101.run();
        goto L196
    L197:
        jx3 r103 = (jx3) this.o;
        si4 r104 = (si4) this.p;
        Long r105 = (Long) r58;
        if (h12.c(r105, r103.n) == true) goto L201;
        r103.n = r105;
        r104.run();
    L201:
        return j15.a;
    L202:
        fl1 r106 = (fl1) this.o;
        Throwable r107 = (Throwable) r58;
        r106.p.removeCallbacks((lg1) this.p);
        return j15.a;
    L204:
        Throwable r108 = (Throwable) r58;
        ((rm2) this.o).l((q02) this.p);
        return j15.a;
    L206:
        ss0 r109 = (ss0) this.o;
        ArrayList r111 = (ArrayList) this.p;
        ((q20) r109.q).H((x34) r58, r111);
        return null;
    L208:
        String r112 = (String) this.o;
        ArrayList r113 = (ArrayList) this.p;
        z34 r114 = ((x34) r58).U(r112);
        int r115 = r113.size();     // Catch: Throwable -> L214
        int r116 = 1;
        int r117 = 0;
    L210:
        if (r117 >= r115) goto L218;
        Object r118 = r113.get(r117);     // Catch: Throwable -> L214
        r117 = r117 + 1;     // Catch: Throwable -> L214
        String r119 = (String) r118;     // Catch: Throwable -> L214
        if (r119 != null) goto L216;
        r114.e(r116);     // Catch: Throwable -> L214
    L217:
        r116 = r116 + 1;     // Catch: Throwable -> L214
        goto L210
    L216:
        r114.r(r116, r119);     // Catch: Throwable -> L214
        goto L217
    L218:
        r114.O();     // Catch: Throwable -> L214
        r114.close();
        return null;
    L214:
        th = move-exception;
        r114.close();
        throw th;
    L223:
        ss0 r120 = (ss0) this.o;
        Download r121 = (Download) this.p;
        ((q20) r120.o).I((x34) r58, r121);
        return null;
    L225:
        r20 r122 = (r20) this.o;
        Chronology r123 = (Chronology) this.p;
        ((q20) r122.p).I((x34) r58, r123);
        return null;
    L227:
        zg5 r124 = (zg5) this.o;
        Throwable r125 = (Throwable) r58;
        ((f13) r124.n).j((cd0) this.p);
        return j15.a;
    L229:
        ig3.q((ig3) r58, (jg3) this.o, ((ft) this.p).B);
        return j15.a;
    L231:
        ho r126 = (ho) this.o;
        io r127 = (io) this.p;
        qy3 r128 = (qy3) r58;
        j15 r129 = j15.a;
        ot4 r130 = r126.B;
        if (r130 == null) goto L234;
        r130.b();
    L234:
        r126.B = null;
        x60 r131 = r127.b;
        if (r131 == null) goto L237;
        r131.Q(r129);
    L237:
        r127.b = null;
        return r129;
    L239:
        Throwable r132 = (Throwable) r58;
        ((rm2) this.o).l((aq3) this.p);
        return j15.a;
    L154:
        return new z82((x44) this.o, (Map) r58, (w44) this.p);
    }
}
