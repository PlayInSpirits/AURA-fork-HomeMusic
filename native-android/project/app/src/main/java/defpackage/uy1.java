package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.lan.LanReceiverService;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uy1 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ uy1(Float r2, qy1 r3, Float r4, py1 r5) {
        this.n = 0;
        this.o = r2;
        this.q = r3;
        this.p = r4;
        this.r = r5;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        SharedPreferences r4 = null;
        switch(this.n) {
            case 0: goto L198;
            case 1: goto L24;
            default: goto L4;
        };
    L4:
        qc5 r1 = (qc5) this.o;
        UUID r2 = (UUID) this.p;
        mb1 r3 = (mb1) this.q;
        Context r0 = (Context) this.r;
        String r5 = r2.toString();
        dd5 r6 = r1.c.h(r5);
        if (r6 != null) goto L7;
    L22:
        kf2.o("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
    L23:
        return null;
    L7:
        if (f34.c(r6.b) == true) goto L22;
        pq3 r7 = r1.b;
        Object r8 = r7.k;
        monitor-enter(r8);
        cx.f().g(pq3.l, "Moving WorkSpec (" + r5 + ") to the foreground");     // Catch: Throwable -> L15
        td5 r9 = (td5) r7.g.remove(r5);     // Catch: Throwable -> L15
        if (r9 != null) goto L13;
    L18:
        monitor-exit(r8);     // Catch: Throwable -> L15
        rc5 r10 = q05.m(r6);
        String r11 = wp4.w;
        Intent r12 = new Intent(r0, SystemForegroundService.class);
        r12.setAction("ACTION_NOTIFY");
        r12.putExtra("KEY_NOTIFICATION_ID", r3.a);
        r12.putExtra("KEY_FOREGROUND_SERVICE_TYPE", r3.b);
        r12.putExtra("KEY_NOTIFICATION", r3.c);
        r12.putExtra("KEY_WORKSPEC_ID", r10.a);
        r12.putExtra("KEY_GENERATION", r10.b);
        r0.startService(r12);
        goto L23
    L13:
        if (r7.a != null) goto L17;
        PowerManager.WakeLock r13 = y85.a(r7.b, "ProcessorForegroundLck");     // Catch: Throwable -> L15
        r7.a = r13;     // Catch: Throwable -> L15
        r13.acquire();     // Catch: Throwable -> L15
    L17:
        r7.f.put(r5, r9);     // Catch: Throwable -> L15
        ud3.G0(r7.b, wp4.c(r7.b, q05.m(r9.a), r3));     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        throw th;
    L24:
        LanReceiverService r14 = (LanReceiverService) this.o;
        String r15 = (String) this.p;
        String r16 = (String) this.q;
        JSONObject r17 = (JSONObject) this.r;
        if (r14.o == false) goto L196;
        boolean r18 = LanReceiverService.y;
        if (kb4.a0(r14).contains(r15) == false) goto L196;
        bl2 r19 = r14.v;
        if (r19 == null) goto L194;
        bj2 r20 = (bj2) r19.get();
        if (r16 != null) goto L33;
    L193:
        kf2.o("Unknown command");
        return null;
    L33:
        switch(r16.hashCode()) {
            case -1273775369: goto L190;
            case -934531685: goto L183;
            case -892481550: goto L180;
            case -885581533: goto L168;
            case -810883302: goto L165;
            case -555126813: goto L104;
            case 3377907: goto L101;
            case 3443508: goto L98;
            case 3526264: goto L91;
            case 99162322: goto L88;
            case 106440182: goto L85;
            case 109641799: goto L69;
            case 110364485: goto L39;
            case 2072332025: goto L36;
            default: goto L193;
        };
    L36:
        if (r16.equals("shuffle") == false) goto L193;
        r20.s(r17.getBoolean("enabled"));
    L192:
        r20.getClass();
        return r14.f(r20);
    L39:
        if (r16.equals("timer") == false) goto L193;
        yf4 r21 = yf4.c();
        String r22 = r17.getString("mode");
        if (r22 == null) goto L67;
        int r23 = r22.hashCode();
        if (r23 == (-1367724422)) goto L65;
        if (r23 == 100571) goto L62;
        if (r23 != 1064901855) goto L67;
        if (r22.equals("minutes") == false) goto L67;
        int r24 = r17.getInt("minutes");
        if (1 <= r24) goto L53;
    L60:
        kf2.n("Failed requirement.");
        return null;
    L53:
        if (r24 >= 1441) goto L60;
        r21.a(false);
        r21.g = false;
        r21.e = (((long) r24) * 60000) + System.currentTimeMillis();
        r21.f = true;
        App.b().getClass();     // Catch: Exception -> L205
        r4 = App.c();     // Catch: Exception -> L205
    L56:
        if (r4 == null) goto L59;
        r4.edit().putLong("sleep_timer_end_time_ms", r21.e).putBoolean("sleep_timer_end_of_track", r21.g).apply();
    L59:
        jq3 r25 = new jq3(8, r21);
        r21.b = r25;
        r21.a.postDelayed(r25, 1000);
        goto L192
    L62:
        if (r22.equals("end") == false) goto L67;
        r21.e();
        goto L192
    L65:
        if (r22.equals("cancel") == false) goto L67;
        r21.a(true);
    L67:
        kf2.o("Unknown timer mode");
        return null;
    L69:
        if (r16.equals("speed") == false) goto L193;
        float r26 = (float) r17.getDouble("speed");
        float r27 = (float) r17.getDouble("pitch");
        if (Math.abs(r26) <= Float.MAX_VALUE) goto L73;
    L83:
        kf2.n("Failed requirement.");
        return null;
    L73:
        if (Math.abs(r27) > Float.MAX_VALUE) goto L83;
        if (0.1f > r26) goto L83;
        if (r26 > 5.0f) goto L83;
        if (0.1f > r27) goto L83;
        if (r27 > 5.0f) goto L83;
        r20.d(new qh3(r26, r27));
        goto L192
    L85:
        if (r16.equals("pause") == false) goto L193;
        r20.c();
        goto L192
    L88:
        if (r16.equals("hello") == false) goto L193;
    L91:
        if (r16.equals("seek") == false) goto L193;
        long r28 = r17.getLong("position");
        long r29 = r20.getDuration();
        if (r29 >= 0) goto L95;
        long r110 = 0;
    L96:
        r20.O(gb.n(r28, 0, r110));
        goto L192
    L95:
        r110 = r29;
        goto L96
    L98:
        if (r16.equals("play") == false) goto L193;
        r20.m0();
        goto L192
    L101:
        if (r16.equals("next") == false) goto L193;
        r20.c0();
        goto L192
    L104:
        if (r16.equals("queue_state") == false) goto L193;
        r20.getClass();
        int r30 = r17.optInt("offset", 0);
        if (r30 >= 0) goto L108;
    L163:
        kf2.n("Failed requirement.");
        return null;
    L108:
        if (r30 > r20.Q0()) goto L163;
        JSONArray r31 = new JSONArray();
        int r111 = Math.min(20, r20.Q0() - r30) + r30;
    L110:
        if (r30 >= r111) goto L162;
        do2 r112 = r20.Y(r30).d;
        r112.getClass();
        Bundle r113 = r112.I;
        JSONObject r32 = new JSONObject().put("id", r20.Y(r30).a);
        CharSequence r114 = r112.c;
        if (r114 == null) goto L116;
        String r115 = r114.toString();
        if (r115 == null) goto L116;
        String r116 = qm4.J0(256, r115);
    L117:
        JSONObject r33 = r32.put("album", r116);
        if (r113 == null) goto L122;
        String r34 = r113.getString("coverArtId");
        if (r34 == null) goto L122;
        String r35 = qm4.J0(512, r34);
    L123:
        JSONObject r36 = r33.put("cover", r35);
        if (r113 == null) goto L128;
        String r37 = r113.getString("albumId");
        if (r37 == null) goto L128;
        String r38 = qm4.J0(512, r37);
    L129:
        JSONObject r39 = r36.put("albumId", r38);
        if (r113 == null) goto L134;
        String r40 = r113.getString("artistId");
        if (r40 == null) goto L134;
        String r41 = qm4.J0(512, r40);
    L135:
        JSONObject r42 = r39.put("artistId", r41);
        if (r113 == null) goto L140;
        String r43 = r113.getString("suffix");
        if (r43 == null) goto L140;
        String r44 = qm4.J0(32, r43);
    L141:
        JSONObject r45 = r42.put("suffix", r44);
        if (r113 == null) goto L144;
        int r46 = r113.getInt("bitrate");
    L145:
        JSONObject r47 = r45.put("bitrate", r46);
        if (r113 == null) goto L148;
        int r48 = r113.getInt("duration");
    L149:
        JSONObject r49 = r47.put("duration", r48);
        CharSequence r117 = r112.a;
        if (r117 == null) goto L154;
        String r118 = r117.toString();
        if (r118 == null) goto L154;
        int r119 = 256;
        String r120 = qm4.J0(256, r118);
    L155:
        JSONObject r50 = r49.put("title", r120);
        CharSequence r121 = r112.b;
        if (r121 == null) goto L160;
        String r122 = r121.toString();
        if (r122 == null) goto L160;
        String r123 = qm4.J0(r119, r122);
    L161:
        r31.put(r50.put("artist", r123));
        r30 = r30 + 1;
    L160:
        r123 = "";
    L154:
        r119 = 256;
        r120 = "";
        goto L155
    L148:
        r48 = 0;
        goto L149
    L144:
        r46 = 0;
    L140:
        r44 = "";
    L134:
        r41 = "";
    L128:
        r38 = "";
    L122:
        r35 = "";
    L116:
        r116 = "";
        goto L117
    L162:
        JSONObject r51 = new JSONObject().put("ok", true).put("items", r31).put("index", r20.o0()).put("count", r20.Q0()).put("revision", LanReceiverService.e(r20));
        r51.getClass();
        return r51;
    L165:
        if (r16.equals("volume") == false) goto L193;
        r20.R(gb.l((float) r17.getDouble("value"), 0.0f, 1.0f));
        goto L192
    L168:
        if (r16.equals("device_volume") == false) goto L193;
        AudioManager r52 = (AudioManager) r14.getSystemService(AudioManager.class);
        if (r17.has("direction") == false) goto L178;
        int r53 = r17.getInt("direction");
        if (r53 == 1) goto L177;
        if (r53 == (-1)) goto L177;
        kf2.n("Failed requirement.");
        return null;
    L177:
        r52.adjustStreamVolume(3, r53, 0);
        goto L192
    L178:
        r52.setStreamVolume(3, gb.m(r17.getInt("level"), 0, r52.getStreamMaxVolume(3)), 0);
        goto L192
    L180:
        if (r16.equals("status") == false) goto L193;
    L183:
        if (r16.equals("repeat") == false) goto L193;
        int r54 = r17.getInt("mode");
        if (r54 < 0) goto L188;
        if (r54 >= 3) goto L188;
        r20.p0(r54);
    L188:
        kf2.n("Failed requirement.");
        return null;
    L190:
        if (r16.equals("previous") == false) goto L193;
        r20.S();
        goto L192
    L194:
        h12.Q("browserFuture");
        throw null;
    L196:
        kf2.n("Failed requirement.");
        return null;
    L198:
        Float r55 = (Float) this.o;
        qy1 r56 = (qy1) this.q;
        Float r57 = (Float) this.p;
        py1 r58 = (py1) this.r;
        if (r55.equals(r56.n) == true) goto L201;
    L202:
        r56.n = r55;
        r56.o = r57;
        r56.q = new yq4(r58, r55, r57, null);
        r56.u.b.setValue(Boolean.TRUE);
        r56.r = false;
        r56.s = true;
    L204:
        return j15.a;
    L201:
        if (r57.equals(r56.o) == true) goto L204;
        goto L202
    }

    public /* synthetic */ uy1(Object r1, Object r2, Object r3, Object r4, int r5) {
        this.n = r5;
        this.o = r1;
        this.p = r2;
        this.q = r3;
        this.r = r4;
    }
}
