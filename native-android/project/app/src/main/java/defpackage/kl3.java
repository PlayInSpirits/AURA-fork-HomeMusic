package defpackage;

import com.eddyizm.tempus.subsonic.models.Playlist;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kl3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ kl3(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r24) {
        int r2 = this.n;
        boolean r3 = true;
        String r4 = null;
        Object r0 = this.o;
        switch(r2) {
            case 0: goto L93;
            case 1: goto L91;
            case 2: goto L78;
            case 3: goto L76;
            case 4: goto L74;
            case 5: goto L69;
            case 6: goto L67;
            case 7: goto L65;
            case 8: goto L63;
            case 9: goto L34;
            case 10: goto L20;
            case 11: goto L8;
            case 12: goto L6;
            default: goto L4;
        };
    L4:
        ((lu2) r0).k(r24);
        return j15.a;
    L6:
        vd r1 = (vd) r24;
        ((wf1) r0).invoke(r1.e.getValue(), ((if1) p35.a.p).invoke(r1.f));
        return j15.a;
    L8:
        pp3 r5 = (pp3) r0;
        Object r6 = r5.h;
        monitor-enter(r6);
        sh4 r7 = (sh4) r5.j;     // Catch: Throwable -> L17
        r7.getClass();     // Catch: Throwable -> L17
        Object r8 = r7.b;     // Catch: Throwable -> L17
        r8.getClass();     // Catch: Throwable -> L17
        int r9 = r7.d;     // Catch: Throwable -> L17
        p03 r10 = r7.c;     // Catch: Throwable -> L17
        if (r10 != null) goto L13;
        r10 = new p03();     // Catch: Throwable -> L17
        r7.c = r10;     // Catch: Throwable -> L17
        r7.f.l(r8, r10);     // Catch: Throwable -> L17
    L13:
        r7.b(r24, r9, r8, r10);     // Catch: Throwable -> L17
        monitor-exit(r6);
        return j15.a;
    L17:
        th = move-exception;
        throw th;
    L20:
        jf4 r11 = (jf4) r0;
        y94 r12 = r11.f;
        r12.getClass();
        if (h12.c(r11.f, r12) == true) goto L23;
        oo3.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
    L23:
        x03 r13 = r11.e;
        Object r14 = r11.c;
        if (r13 != null) goto L28;
        if (r14 != null) goto L27;
        r11.c = r24;
    L33:
        return j15.a;
    L27:
        x03 r15 = w54.a;
        x03 r16 = new x03();
        r16.a(r14);
        r16.a(r24);
        r11.e = r16;
        r11.c = null;
        goto L33
    L28:
        if (r14 == null) goto L31;
        oo3.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
    L31:
        r13.a(r24);
        goto L33
    L34:
        we4 r17 = (we4) r0;
        b24 r18 = (b24) r24;
        r18.c(r17.B);
        r18.e(r17.C);
        r18.b(r17.D);
        float r19 = r17.E;
        if (r18.t == r19) goto L38;
        r18.n |= 2048;
        r18.t = r19;
    L38:
        long r20 = r17.F;
        long r21 = r18.u;
        int r22 = tw4.b;
        if (r21 == r20) goto L42;
        r18.n |= 4096;
        r18.u = r20;
    L42:
        ac4 r23 = r17.G;
        if (h12.c(r18.v, r23) == true) goto L45;
        r18.n |= 8192;
        r18.v = r23;
    L45:
        boolean r25 = r17.H;
        if (r18.w == r25) goto L48;
        r18.n |= 16384;
        r18.w = r25;
    L48:
        long r26 = r17.I;
        if (x40.c(r18.r, r26) == true) goto L51;
        r18.n |= 64;
        r18.r = r26;
    L51:
        long r27 = r17.J;
        if (x40.c(r18.s, r27) == true) goto L54;
        r18.n |= 128;
        r18.s = r27;
    L54:
        int r28 = r17.K;
        if (r18.B == r28) goto L58;
        r18.n |= 524288;
        r18.B = r28;
    L58:
        m62 r29 = r17.L;
        if (h12.c(r18.y, r29) == true) goto L62;
        r18.n |= 1048576;
        r18.y = r29;
    L62:
        return j15.a;
    L63:
        r24.getClass();
        return ((t5) r0).invoke();
    L65:
        ((List) r24).add((Float) ((v82) r0).invoke());
        return true;
    L67:
        g74 r30 = (g74) r0;
        return new g83(r30.d(r30.k, ((g83) r24).a, r30.j));
    L69:
        x44 r31 = ((w44) r0).p;
        if (r31 == null) goto L73;
        r3 = r31.b(r24);
    L73:
        return Boolean.valueOf(r3);
    L74:
        li0 r32 = (li0) r24;
        r32.getClass();
        return ((s24) r0).f(r32);
    L76:
        we1 r33 = (we1) r24;
        r33.getClass();
        ((p24) r0).g = r33;
        return j15.a;
    L78:
        tv3 r34 = (tv3) r0;
        Throwable r35 = (Throwable) r24;
        CancellationException r36 = new CancellationException("Recomposer effect job completed");
        r36.initCause(r35);
        Object r37 = r34.c;
        monitor-enter(r37);
        s22 r38 = r34.d;     // Catch: Throwable -> L83
        if (r38 == null) goto L85;
        nl4 r39 = r34.u;     // Catch: Throwable -> L83
        ov3 r40 = ov3.o;     // Catch: Throwable -> L83
        r39.getClass();     // Catch: Throwable -> L83
        r39.j(null, r40);     // Catch: Throwable -> L83
        r38.f(r36);     // Catch: Throwable -> L83
        r34.r = null;     // Catch: Throwable -> L83
        r38.M(new o(26, r34, r35));     // Catch: Throwable -> L83
    L86:
        monitor-exit(r37);
        return j15.a;
    L85:
        r34.e = r36;     // Catch: Throwable -> L83
        nl4 r41 = r34.u;     // Catch: Throwable -> L83
        ov3 r42 = ov3.n;     // Catch: Throwable -> L83
        r41.getClass();     // Catch: Throwable -> L83
        r41.j(null, r42);     // Catch: Throwable -> L83
    L83:
        th = move-exception;
        throw th;
    L91:
        ((z80) r0).y(r24);
        return j15.a;
    L93:
        ml3 r43 = (ml3) r0;
        Object r44 = r43.c;
        z34 r45 = ((x34) r24).U("SELECT * FROM playlist");
        int r46 = rr2.E(r45, "id");     // Catch: Throwable -> L142
        int r47 = rr2.E(r45, "name");     // Catch: Throwable -> L142
        int r48 = rr2.E(r45, "duration");     // Catch: Throwable -> L142
        int r49 = rr2.E(r45, "coverArt");     // Catch: Throwable -> L142
        int r50 = rr2.E(r45, "comment");     // Catch: Throwable -> L142
        int r51 = rr2.E(r45, "owner");     // Catch: Throwable -> L142
        int r110 = rr2.E(r45, "isUniversal");     // Catch: Throwable -> L142
        int r111 = rr2.E(r45, "songCount");     // Catch: Throwable -> L142
        int r112 = rr2.E(r45, "created");     // Catch: Throwable -> L142
        int r113 = rr2.E(r45, "changed");     // Catch: Throwable -> L142
        int r114 = rr2.E(r45, "lastPlayed");     // Catch: Throwable -> L142
        int r115 = rr2.E(r45, "allowedUsers");     // Catch: Throwable -> L142
        ArrayList r52 = new ArrayList();     // Catch: Throwable -> L142
    L95:
        if (r45.O() == false) goto L144;
        if (r45.isNull(r46) == false) goto L100;
        String r116 = r4;
    L102:
        if (r45.isNull(r47) == false) goto L104;
        String r117 = r4;
    L105:
        long r210 = r45.getLong(r48);     // Catch: Throwable -> L142
        if (r45.isNull(r49) == false) goto L108;
        String r211 = r4;
    L109:
        Playlist r118 = new Playlist(r116, r117, r210, r211);     // Catch: Throwable -> L142
        if (r45.isNull(r50) == false) goto L112;
        String r53 = null;
    L113:
        r118.setComment(r53);     // Catch: Throwable -> L142
        if (r45.isNull(r51) == false) goto L116;
        String r54 = null;
    L117:
        r118.setOwner(r54);     // Catch: Throwable -> L142
        if (r45.isNull(r110) == false) goto L120;
        Integer r55 = null;
    L121:
        if (r55 != null) goto L124;
        Boolean r56 = null;
    L128:
        r118.setUniversal(r56);     // Catch: Throwable -> L142
        r118.setSongCount((int) r45.getLong(r111));     // Catch: Throwable -> L142
        if (r45.isNull(r112) == false) goto L131;
        Long r57 = null;
    L132:
        r118.setCreated(i80.B(r57));     // Catch: Throwable -> L142
        if (r45.isNull(r113) == false) goto L135;
        Long r58 = null;
    L136:
        r118.setChanged(i80.B(r58));     // Catch: Throwable -> L142
        r118.setLastPlayed(r45.getLong(r114));     // Catch: Throwable -> L142
        if (r45.isNull(r115) == false) goto L139;
        String r59 = null;
    L140:
        r118.setAllowedUsers(((si1) r43.d).E(r59));     // Catch: Throwable -> L142
        r52.add(r118);     // Catch: Throwable -> L142
        r47 = r47;
        r48 = r48;
        r4 = null;
        r46 = r46;
        goto L95
    L139:
        r59 = r45.D(r115);     // Catch: Throwable -> L142
        goto L140
    L135:
        r58 = Long.valueOf(r45.getLong(r113));     // Catch: Throwable -> L142
        goto L136
    L131:
        r57 = Long.valueOf(r45.getLong(r112));     // Catch: Throwable -> L142
        goto L132
    L124:
        if (r55.intValue() == 0) goto L126;
        boolean r60 = true;
    L127:
        r56 = Boolean.valueOf(r60);     // Catch: Throwable -> L142
        goto L128
    L126:
        r60 = false;
        goto L127
    L120:
        r55 = Integer.valueOf((int) r45.getLong(r110));     // Catch: Throwable -> L142
        goto L121
    L116:
        r54 = r45.D(r51);     // Catch: Throwable -> L142
        goto L117
    L112:
        r53 = r45.D(r50);     // Catch: Throwable -> L142
        goto L113
    L108:
        r211 = r45.D(r49);     // Catch: Throwable -> L142
        goto L109
    L104:
        r117 = r45.D(r47);     // Catch: Throwable -> L142
        goto L105
    L100:
        r116 = r45.D(r46);     // Catch: Throwable -> L142
        goto L102
    L144:
        r45.close();
        return r52;
    L142:
        th = move-exception;
        r45.close();
        throw th;
    }
}
