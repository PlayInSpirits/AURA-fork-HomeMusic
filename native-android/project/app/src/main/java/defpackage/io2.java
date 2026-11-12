package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.session.MediaLibraryService;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class io2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ io2(Object r1, Object r2, Object r3, Object r4, boolean r5, int r6) {
        this.n = r6;
        this.p = r1;
        this.q = r2;
        this.r = r3;
        this.s = r4;
        this.o = r5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        Object r2 = this.s;
        Object r3 = this.r;
        Object r4 = this.q;
        Object r5 = this.p;
        switch(r0) {
            case 0: goto L21;
            default: goto L4;
        };
    L4:
        qs2 r6 = (qs2) r5;
        ju1 r7 = (ju1) r4;
        ms2 r8 = (ms2) r3;
        ja0 r9 = (ja0) r2;
        boolean r10 = this.o;
        r6.g.remove(r7);
        MediaLibraryService r1 = (MediaLibraryService) r6.e.get();     // Catch: Throwable -> L13 Exception -> L15
        if (r1 != null) goto L8;
    L7:
        au0.k(r7);
        return;
    L8:
        int r11 = r9.a;     // Catch: Throwable -> L13 Exception -> L15
        int r12 = r9.b;     // Catch: Throwable -> L13 Exception -> L15
        fr2 r13 = new fr2(r8, r11, r12, r10, new ft2(r7, r12), r9.e);     // Catch: Throwable -> L13 Exception -> L15
        kn2 r14 = r1.i(r13);     // Catch: Throwable -> L13 Exception -> L15
        if (r14 == null) goto L7;
        r1.c(r14);     // Catch: Throwable -> L13 Exception -> L15
        r14.a.g.m(r7, r13);     // Catch: Throwable -> L13 Exception -> L15
    L191:
        return;
    L15:
        e = move-exception;
        l93.r0("MSessionService", "Failed to add a session to session service", e);     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        au0.k(r7);
        throw th;
    L21:
        lo2 r15 = (lo2) r5;
        kn2 r16 = (kn2) r4;
        yw1 r17 = (yw1) r3;
        vl2 r18 = (vl2) r2;
        yl0 r19 = r15.u;
        x7 r20 = r15.o;
        Context r21 = r19.a;
        NotificationManager r22 = r19.c;
        int r23 = Build.VERSION.SDK_INT;
        if (r23 >= 26) goto L24;
    L30:
        qi3 r24 = r16.a();
        tn2 r25 = r16.a;
        s63 r110 = new s63(r21, "default_channel_id");
        eu2 r111 = new eu2(r16);
        mi3 r112 = r24.o();
        boolean r113 = f35.d0(r24, r25.p);
        gy3 r26 = j60.j(r17, true, true);
        boolean r114 = j60.c(r26, 2);
        boolean r115 = j60.c(r26, 3);
        uw1 r116 = new uw1(4);
        if (r114 == false) goto L35;
        r116.c((j60) r26.get(0));
        int r117 = 1;
    L39:
        if (r112.a(1) == false) goto L44;
        if (r113 == true) goto L42;
        i60 r118 = new i60(57396);
        r118.c(1);
        r118.f = r21.getString(R.string.media3_controls_pause_description);
        r116.c(r118.a());
        goto L44
    L42:
        i60 r27 = new i60(57399);
        r27.c(1);
        r27.f = r21.getString(R.string.media3_controls_play_description);
        r116.c(r27.a());
    L44:
        if (r115 == false) goto L47;
        r116.c((j60) r26.get(r117));
        r117 = r117 + 1;
    L50:
        if (r117 >= r26.q) goto L52;
        r116.c((j60) r26.get(r117));
        r117 = r117 + 1;
        goto L50
    L52:
        gy3 r28 = r116.f();
        int[] r119 = new int[3];
        int[] r120 = new int[3];
        Arrays.fill(r119, -1);
        Arrays.fill(r120, -1);
        int r29 = 0;
        boolean r121 = false;
    L53:
        int[] r122 = r120;
        if (r29 >= r28.q) goto L117;
        j60 r123 = (j60) r28.get(r29);
        va4 r124 = r123.a;
        Context r210 = r21;
        int r30 = r123.b;
        int r211 = r29;
        CharSequence r31 = r123.f;
        gy3 r212 = r28;
        int r32 = r123.d;
        boolean r213 = r121;
        tw1 r125 = r123.h;
        lo2 r214 = r15;
        ArrayList r33 = r110.b;
        if (r124 == null) goto L63;
        MediaLibraryService r34 = (MediaLibraryService) r20.p;
        if (r124.a != 0) goto L60;
        boolean r35 = true;
    L61:
        rr2.l(r35);
        PorterDuff.Mode r215 = IconCompat.k;
        IconCompat r36 = IconCompat.b(r34.getResources(), r34.getPackageName(), r32);
        String r37 = r124.b;
        Bundle r126 = r124.c;
        Intent r127 = new Intent("androidx.media3.session.CUSTOM_NOTIFICATION_ACTION");
        r127.setData(r25.b);
        r127.setComponent(new ComponentName(r34, r34.getClass()));
        r127.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION", r37);
        r127.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS", r126);
        int r38 = r20.o + 1;
        r20.o = r38;
        r33.add(new q63(r36, r31, PendingIntent.getService(r34, r38, r127, 201326592)));
    L100:
        int r39 = r123.g.getInt("androidx.media3.session.command.COMPACT_VIEW_INDEX", -1);
        if (r39 < 0) goto L106;
        if (r39 >= 3) goto L106;
        r119[r39] = r211;
        r121 = true;
    L116:
        r29 = r211 + 1;
        r120 = r122;
        r21 = r210;
        r28 = r212;
        r15 = r214;
        r18 = r18;
        r19 = r19;
        r110 = r110;
        r24 = r24;
        r25 = r25;
    L106:
        if (r125.a(0) != 2) goto L110;
        r122[0] = r211;
    L115:
        r121 = r213;
        goto L116
    L110:
        if (r125.a(0) != 1) goto L113;
        r122[1] = r211;
        goto L115
    L113:
        if (r125.a(0) != 3) goto L115;
        r122[2] = r211;
        goto L115
    L60:
        r35 = false;
        goto L61
    L63:
        if (r30 == (-1)) goto L65;
        boolean r40 = true;
    L66:
        rr2.w(r40);
        PorterDuff.Mode r41 = IconCompat.k;
        r210.getClass();
        IconCompat r42 = IconCompat.b(r210.getResources(), r210.getPackageName(), r32);
        long r43 = r30;
        MediaLibraryService r44 = (MediaLibraryService) r20.p;
        if (r43 != 8) goto L69;
    L90:
        int r45 = 87;
    L91:
        Intent r128 = r20.b(r16, r45);
        if (Build.VERSION.SDK_INT >= 26) goto L94;
    L98:
        PendingIntent r46 = PendingIntent.getService(r44, r45, r128, 67108864);
    L99:
        r33.add(new q63(r42, r31, r46));
        goto L100
    L94:
        if (r43 != 1) goto L98;
        if (r16.a().q() == true) goto L98;
        r46 = tn.c(r44, r45, r128);
        goto L99
    L69:
        if (r43 == 9) goto L90;
        if (r43 != 6) goto L74;
    L89:
        r45 = 88;
        goto L91
    L74:
        if (r43 == 7) goto L89;
        if (r43 != 3) goto L80;
        r45 = 86;
        goto L91
    L80:
        if (r43 != 12) goto L83;
        r45 = 90;
        goto L91
    L83:
        if (r43 != 11) goto L86;
        r45 = 89;
        goto L91
    L86:
        if (r43 != 1) goto L88;
        r45 = 85;
        goto L91
    L88:
        r45 = 0;
        goto L91
    L65:
        r40 = false;
        goto L66
    L117:
        vl2 r216 = r18;
        yl0 r217 = r19;
        lo2 r218 = r15;
        qi3 r219 = r24;
        tn2 r310 = r25;
        s63 r220 = r110;
        int r129 = 3;
        if (r121 == true) goto L126;
        int r47 = 0;
        int r48 = 0;
    L120:
        if (r47 >= r129) goto L126;
        int r49 = r122[r47];
        if (r49 == (-1)) goto L125;
        r119[r48] = r49;
        r48 = r48 + 1;
    L125:
        r47 = r47 + 1;
        r129 = 3;
    L126:
        int r50 = 0;
    L127:
        if (r50 >= 3) goto L132;
        if (r119[r50] == (-1)) goto L130;
        r50 = r50 + 1;
        goto L127
    L130:
        r119 = Arrays.copyOf(r119, r50);
    L132:
        r111.c = r119;
        if (r219.S0(18) == false) goto L153;
        do2 r51 = r219.K0();
        s63 r52 = r220;
        r52.e = s63.b(r51.a);
        r52.f = s63.b(r51.b);
        tn2 r53 = r310;
        x7 r54 = r53.m;
        yl0 r55 = r217;
        if (r55.g != null) goto L137;
    L138:
        r55.f = r54;
        r55.g = new xc5(4, new x7(((Integer) yl0.h.get()).intValue(), 12, r54));
    L139:
        ic2 r56 = r55.g.i(r51);
        if (r56 == null) goto L155;
        mf4 r57 = r55.d;
        if (r57 == null) goto L145;
        r57.o = true;
    L145:
        if (r56.isDone() == true) goto L179;
        mf4 r58 = new mf4(r52, r216);
        r55.d = r58;
        Handler r59 = r53.l;
        Objects.requireNonNull(r59);
        r56.f(new lg1(0, r56, r58), new ym(r59, 1));
        goto L155
    L179:
        r52.d((Bitmap) hw.j(r56));     // Catch: Throwable -> L148 CancellationException -> L150
    L148:
        e = move-exception;
        l93.q0("NotificationProvider", "Failed to load bitmap: " + e.getMessage());
    L155:
        if (r219.h0() == true) goto L157;
    L163:
        long r130 = -9223372036854775807L;
    L165:
        if (r130 == (-9223372036854775807L)) goto L167;
        boolean r131 = true;
    L168:
        if (r131 == true) goto L171;
        r130 = 0;
    L171:
        Notification r60 = r52.v;
        r60.when = r130;
        r52.j = r131;
        r52.k = r131;
        if (Build.VERSION.SDK_INT < 31) goto L174;
        r52.t = 1;
    L174:
        r52.g = r53.t;
        r60.deleteIntent = PendingIntent.getService((MediaLibraryService) r20.p, 86, r20.b(r16, 86).putExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", true), 67108864);
        r52.c(8, true);
        r60.icon = r55.e;
        r52.e(r111);
        r52.r = 1;
        r52.c(2, false);
        r52.o = "media3_group_key";
        rm2 r61 = new rm2(r52.a());
        r218.r.execute(new b41(r218, r16, r61, this.o, 2));
        return;
    L167:
        r131 = false;
        goto L168
    L157:
        if (r219.k() == true) goto L163;
        if (r219.T0() == true) goto L163;
        if (r219.i().a != 1.0f) goto L163;
        r130 = System.currentTimeMillis() - r219.Z();
        goto L165
    L137:
        if (r54.equals(r55.f) == true) goto L139;
    L153:
        r55 = r217;
        r52 = r220;
        r53 = r310;
        goto L155
    L47:
        if (r112.a.a(new int[]{9, 8}) == false) goto L50;
        i60 r132 = new i60(57412);
        r132.c(8);
        r132.f = r21.getString(R.string.media3_controls_seek_to_next_description);
        r116.c(r132.a());
        goto L50
    L35:
        if (r112.a.a(new int[]{7, 6}) == false) goto L37;
        i60 r133 = new i60(57413);
        r133.c(6);
        r133.f = r21.getString(R.string.media3_controls_seek_to_previous_description);
        r116.c(r133.a());
    L37:
        r117 = 0;
        goto L39
    L24:
        if (tn.a(r22) != null) goto L30;
        NotificationChannel r134 = tn.b(r21.getString(r19.b));
        if (r23 > 27) goto L29;
        tn.o(r134);
    L29:
        tn.p(r22, r134);
        goto L30
    }
}
