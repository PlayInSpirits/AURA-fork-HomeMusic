package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.eddyizm.tempus.homemusic.HubAssistantTask;
import com.eddyizm.tempus.homemusic.HubFavoriteSnapshot;
import com.eddyizm.tempus.homemusic.HubUpload;
import com.eddyizm.tempus.model.Favorite;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k2 implements if1 {
    public final /* synthetic */ int n;

    public /* synthetic */ k2(int r1) {
        this.n = 19;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r19) {
        c72 r2 = null;
        int r3 = 1;
        int r4 = 0;
        switch(this.n) {
            case 0: goto L148;
            case 1: goto L146;
            case 2: goto L145;
            case 3: goto L143;
            case 4: goto L140;
            case 5: goto L139;
            case 6: goto L133;
            case 7: goto L131;
            case 8: goto L129;
            case 9: goto L120;
            case 10: goto L118;
            case 11: goto L114;
            case 12: goto L112;
            case 13: goto L111;
            case 14: goto L94;
            case 15: goto L87;
            case 16: goto L76;
            case 17: goto L48;
            case 18: goto L46;
            case 19: goto L45;
            case 20: goto L31;
            case 21: goto L26;
            case 22: goto L21;
            case 23: goto L16;
            case 24: goto L14;
            case 25: goto L12;
            case 26: goto L10;
            case 27: goto L8;
            case 28: goto L6;
            default: goto L4;
        };
    L4:
        k14 r0 = (k14) r19;
        r0.getClass();
        rr1 r1 = rr1.a;
        return (HubAssistantTask) rr1.p(r0, HubAssistantTask.class);
    L6:
        k14 r5 = (k14) r19;
        r5.getClass();
        rr1 r6 = rr1.a;
        return rr1.q(r5, HubUpload.class);
    L8:
        k14 r7 = (k14) r19;
        r7.getClass();
        rr1 r8 = rr1.a;
        return (HubAssistantTask) rr1.p(r7, HubAssistantTask.class);
    L10:
        k14 r9 = (k14) r19;
        r9.getClass();
        rr1 r10 = rr1.a;
        return rr1.q(r9, HubAssistantTask.class);
    L12:
        String r11 = (String) r19;
        nz3 r12 = b11.f(r11);
        r12.d(r11.concat("/api/assistant/tasks"));
        return new oz3(r12);
    L14:
        k14 r13 = (k14) r19;
        r13.getClass();
        rr1 r14 = rr1.a;
        return (HubFavoriteSnapshot) rr1.p(r13, HubFavoriteSnapshot.class);
    L16:
        Child r15 = (Child) r19;
        r15.getClass();
        String r16 = r15.getTitle();
        if (r16 != null) goto L167;
        return "";
    L167:
        return r16;
    L21:
        Child r17 = (Child) r19;
        r17.getClass();
        Integer r18 = r17.getTrack();
        if (r18 == null) goto L25;
        return r18;
    L25:
        return 0;
    L26:
        Child r20 = (Child) r19;
        r20.getClass();
        Integer r21 = r20.getDiscNumber();
        if (r21 == null) goto L30;
        return r21;
    L30:
        return 0;
    L31:
        Object r22 = jh4.c;
        monitor-enter(r22);
        List r23 = jh4.i;     // Catch: Throwable -> L37
        int r24 = r23.size();     // Catch: Throwable -> L37
    L34:
        if (r4 >= r24) goto L39;
        ((if1) r23.get(r4)).invoke(r19);     // Catch: Throwable -> L37
        r4 = r4 + 1;
        goto L34
    L39:
        monitor-exit(r22);
        return j15.a;
    L37:
        th = move-exception;
        throw th;
    L46:
        xy r25 = (xy) r19;
        return j15.a;
    L48:
        z34 r26 = ((x34) r19).U("SELECT * FROM favorite");
        int r27 = rr2.E(r26, "timestamp");     // Catch: Throwable -> L70
        int r28 = rr2.E(r26, "songId");     // Catch: Throwable -> L70
        int r29 = rr2.E(r26, "albumId");     // Catch: Throwable -> L70
        int r30 = rr2.E(r26, "artistId");     // Catch: Throwable -> L70
        int r31 = rr2.E(r26, "toStar");     // Catch: Throwable -> L70
        ArrayList r32 = new ArrayList();     // Catch: Throwable -> L70
    L50:
        if (r26.O() == false) goto L72;
        long r110 = r26.getLong(r27);     // Catch: Throwable -> L70
        if (r26.isNull(r28) == false) goto L55;
        String r111 = null;
    L57:
        if (r26.isNull(r29) == false) goto L59;
        String r112 = null;
    L61:
        if (r26.isNull(r30) == false) goto L63;
        String r113 = null;
    L65:
        if (((int) r26.getLong(r31)) == 0) goto L67;
        boolean r114 = true;
    L68:
        r32.add(new Favorite(r110, r111, r112, r113, r114));     // Catch: Throwable -> L70
        goto L50
    L67:
        r114 = false;
        goto L68
    L63:
        r113 = r26.D(r30);     // Catch: Throwable -> L70
        goto L65
    L59:
        r112 = r26.D(r29);     // Catch: Throwable -> L70
        goto L61
    L55:
        r111 = r26.D(r28);     // Catch: Throwable -> L70
        goto L57
    L72:
        r26.close();
        return r32;
    L70:
        th = move-exception;
        r26.close();
        throw th;
    L76:
        z34 r33 = ((x34) r19).U("SELECT COUNT(*) FROM download WHERE download_state = 1");
    L80:
        th = move-exception;
        r33.close();
        throw th;
    L78:
        if (r33.O() == false) goto L82;
        r4 = (int) r33.getLong(0);     // Catch: Throwable -> L80
    L82:
        Integer r34 = Integer.valueOf(r4);     // Catch: Throwable -> L80
        r33.close();
        return r34;
    L87:
        z34 r35 = ((x34) r19).U("DELETE FROM download");
        r35.O();     // Catch: Throwable -> L91
        r35.close();
        return null;
    L91:
        th = move-exception;
        r35.close();
        throw th;
    L94:
        z34 r36 = ((x34) r19).U("SELECT DISTINCT album_id FROM download WHERE NULLIF(album_artist, '') IS NULL AND NULLIF(album_id, '') IS NOT NULL AND download_state = 1");
        ArrayList r37 = new ArrayList();     // Catch: Throwable -> L104
    L96:
        if (r36.O() == false) goto L106;
        if (r36.isNull(0) == false) goto L101;
        String r38 = null;
    L102:
        r37.add(r38);     // Catch: Throwable -> L104
        goto L96
    L101:
        r38 = r36.D(0);     // Catch: Throwable -> L104
        goto L102
    L106:
        r36.close();
        return r37;
    L104:
        th = move-exception;
        r36.close();
        throw th;
    L112:
        List r39 = (List) r19;
        Object r40 = r39.get(0);
        r40.getClass();
        int r41 = ((Integer) r40).intValue();
        Object r42 = r39.get(1);
        r42.getClass();
        return new lm0(r41, ((Float) r42).floatValue(), new km0(r39, r4));
    L114:
        le0 r43 = (le0) r19;
        if ((r43 instanceof pe0) == true) goto L117;
        return null;
    L117:
        return (pe0) r43;
    L118:
        bx2 r44 = (bx2) r19;
        return Boolean.TRUE;
    L120:
        e80 r45 = (e80) r19;
        if ((r45 instanceof c72) == false) goto L123;
        r2 = (c72) r45;
    L123:
        if (r2 == null) goto L128;
        if (r2.Z != true) goto L128;
        cz1.b("Apply is called on deactivated node " + r45);
    L128:
        return j15.a;
    L129:
        vz r46 = (vz) r19;
        r46.getClass();
        rr1 r47 = rr1.a;
        rr1.B(r46.a, new wc(r3, r46));
        return j15.a;
    L131:
        String r48 = (String) r19;
        r48.getClass();
        b00 r49 = b00.a;
        return Boolean.valueOf(((SharedPreferences) b00.b.getValue()).edit().putString("queue", r48).commit());
    L133:
        mf3 r50 = (mf3) r19;
        wl4 r51 = hb.b;
        r50.getClass();
        if (((Context) vr1.C(r50, r51)).getPackageManager().hasSystemFeature("android.software.leanback") == true) goto L137;
        fv.a.getClass();
        return ev.c;
    L137:
        return hv.b;
    L140:
        mf3 r52 = (mf3) r19;
        l90 r53 = hb.a;
        r52.getClass();
        vr1.C(r52, r53);
        return ((Context) vr1.C(r52, hb.b)).getResources();
    L146:
        ba1 r54 = (ba1) r19;
        Class r55 = ra.U0;
        return Boolean.TRUE;
    L148:
        un3 r56 = (un3) r19;
        return Boolean.valueOf(!false);
    L45:
        return Boolean.valueOf(((ba1) r19).q0());
    L111:
        return Boolean.valueOf(te5.f(r19));
    L139:
        return Boolean.valueOf(fh0.p((i94) r19));
    L143:
        return (js4) r19;
    L145:
        return Boolean.valueOf(fh0.p((i94) r19));
    }

    public /* synthetic */ k2(int r1, byte r2) {
        this.n = r1;
    }
}
