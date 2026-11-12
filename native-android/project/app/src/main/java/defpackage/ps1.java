package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.PlaybackException;
import com.eddyizm.tempus.homemusic.PlayEvent;
import com.eddyizm.tempus.homemusic.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ps1 implements oi3 {
    public final qi3 n;
    public final LinkedHashMap o;
    public final zq2 p;
    public final Handler q;
    public final g5 r;
    public final qa1 s;

    public ps1(qi3 r5) {
        this.n = r5;
        this.o = new LinkedHashMap();
        this.p = new zq2(new lc(2, this));
        Handler r0 = new Handler(r5.U0());
        this.q = r0;
        g5 r6 = new g5(15, this);
        this.r = r6;
        qa1 r1 = new qa1(13, this);
        this.s = r1;
        r0.postDelayed(r6, 15000);
        r0.postDelayed(r1, 15000);
    }

    @Override // defpackage.oi3
    public final void S(PlaybackException r9) {
        r9.getClass();
        qi3 r10 = this.n;
        gn2 r0 = r10.a();
        if (r0 == null) goto L6;
        String r1 = r0.a;
    L5:
        String r2 = r1;
        Long r3 = Long.valueOf(r10.M0());
        long r4 = SystemClock.elapsedRealtime();
        this.p.c(r2, r3, r4, false, "error");
        return;
    L6:
        r1 = null;
        goto L5
    }

    @Override // defpackage.oi3
    public final void V(boolean r9) {
        if (r9 == false) goto L5;
        c();
        return;
    L5:
        qi3 r10 = this.n;
        gn2 r0 = r10.a();
        String r1 = null;
        if (r0 == null) goto L8;
        String r2 = r0.a;
    L9:
        zq2 r3 = this.p;
        oh3 r8 = (oh3) r3.r;
        if (r8 == null) goto L13;
        r1 = r8.a;
    L13:
        if (h12.c(r2, r1) == false) goto L18;
        long r4 = r10.M0();
        long r5 = SystemClock.elapsedRealtime();
        if (((oh3) r3.r) == null) goto L19;
        r3.b(r4, r5, false);
        return;
    L19:
        return;
    L18:
        return;
    L8:
        r2 = null;
        goto L9
    }

    public final void c() {
        if (this.n.h0() == true) goto L5;
        return;
    L5:
        oh3 r1 = l(this.n.a());
        if (r1 == null) goto L55;
        oh3 r4 = (oh3) this.p.r;
        Long r5 = null;
        if (r4 == null) goto L10;
        String r6 = r4.a;
    L11:
        if (r6 != null) goto L55;
        long r7 = this.n.M0();
        b00 r8 = b00.a;
        String r9 = b00.a();
        rs1 r10 = rs1.a;
        String r11 = r1.a;
        monitor-enter(r10);
        ArrayList r12 = rs1.l;     // Catch: Throwable -> L27
        int r13 = r12.size();     // Catch: Throwable -> L27
        int r14 = 0;
    L15:
        if (r14 >= r13) goto L29;
        Object r15 = r12.get(r14);     // Catch: Throwable -> L27
        r14 = r14 + 1;     // Catch: Throwable -> L27
        PlayEvent r16 = (PlayEvent) ((kd3) r15).o;     // Catch: Throwable -> L27
        rs1 r17 = rs1.a;     // Catch: Throwable -> L27
        long r18 = 0;
        String r2 = r16.getRef();     // Catch: Throwable -> L27
        if (r2 == null) goto L19;
        String r3 = "hub:".concat(r2);     // Catch: Throwable -> L27
    L21:
        if (h12.c(r3, r11) == false) goto L15;
        if (h12.c(r16.getAccount(), r9) == false) goto L15;
        if (h12.c(r16.getDeviceId(), (String) rs1.k.getValue()) == false) goto L15;
    L30:
        kd3 r19 = (kd3) r15;     // Catch: Throwable -> L27
        if (r19 == null) goto L33;
        rs1.l.remove(r19);     // Catch: Throwable -> L27
    L33:
        monitor-exit(r10);
        rs1 r20 = rs1.a;
        rs1.a(r9, r1.a);
        if (r19 == null) goto L56;
        PlayEvent r21 = (PlayEvent) r19.o;
        Double r22 = r21.getPositionS();
        if (r22 == null) goto L39;
        r5 = Long.valueOf((long) (r22.doubleValue() * 1000.0d));
    L39:
        if (r5 != null) goto L41;
    L52:
        rs1.d(r21);
        goto L56
    L41:
        if (r7 <= r18) goto L52;
        if (Math.abs(r7 - r5.longValue()) > 15000) goto L52;
        zq2 r23 = this.p;
        String r24 = r21.getPlaybackId();
        r24.getClass();
        Long r25 = r21.getListenedMs();
        r25.getClass();
        long r26 = r25.longValue();
        r23.getClass();
        if (((oh3) r23.r) != null) goto L50;
        r1.f = r24;
        if (r26 >= r18) goto L49;
        r26 = r18;
    L49:
        r1.g = r26;
        r23.r = r1;
        r23.p = false;
        this.o.put(r21.getPlaybackId(), r21.getAccount());
        goto L56
    L50:
        kf2.o("Check failed.");
        return;
    L56:
        zq2 r27 = this.p;
        if (r1 == null) goto L73;
        long r28 = this.n.M0();
        long r29 = SystemClock.elapsedRealtime();
        r27.getClass();
        oh3 r0 = (oh3) r27.r;
        if (r0 != null) goto L61;
    L63:
        oh3 r30 = (oh3) r27.r;
        if (r30 != null) goto L66;
        r27.r = r1;
        ((lc) r27.q).d(PlayEvent.START, r1, Long.valueOf(r28), Long.valueOf(r29));
    L71:
        r27.b(r28, r29, true);
        return;
    L66:
        long r31 = r1.b;
        if (r31 <= r18) goto L71;
        if (r30.b > r18) goto L71;
        r30.b = r31;
        goto L71
    L61:
        if (h12.c(r0.a, r1.a) == true) goto L63;
        r27.c(r0.a, null, r29, false, null);
        goto L63
    L73:
        r27.c(null, null, SystemClock.elapsedRealtime(), false, null);
        return;
    L19:
        r3 = r16.getNdSongId();     // Catch: Throwable -> L27
        goto L21
    L29:
        r18 = 0;
        r15 = null;
    L27:
        th = move-exception;
        throw th;
    L10:
        r6 = null;
    L55:
        r18 = 0;
        goto L56
    }

    @Override // defpackage.oi3
    public final void k(pi3 r10, pi3 r11, int r12) {
        r10.getClass();
        r11.getClass();
        gn2 r0 = r10.c;
        String r1 = null;
        if (r0 == null) goto L5;
        String r3 = r0.a;
    L6:
        if (r12 != 0) goto L9;
        boolean r13 = true;
    L8:
        boolean r7 = r13;
        if (r7 == false) goto L12;
    L33:
        this.p.c(r3, Long.valueOf(r10.f), SystemClock.elapsedRealtime(), r7, null);
        c();
        return;
    L12:
        if (r10.b != r11.b) goto L33;
        gn2 r14 = r11.c;
        if (r14 == null) goto L16;
        String r15 = r14.a;
    L18:
        if (h12.c(r3, r15) == false) goto L33;
        gn2 r16 = this.n.a();
        if (r16 == null) goto L23;
        String r17 = r16.a;
    L24:
        zq2 r2 = this.p;
        oh3 r9 = (oh3) r2.r;
        if (r9 == null) goto L28;
        r1 = r9.a;
    L28:
        if (h12.c(r17, r1) == false) goto L35;
        long r4 = r11.f;
        long r5 = SystemClock.elapsedRealtime();
        if (((oh3) r2.r) == null) goto L36;
        r2.b(r4, r5, r2.p);
        return;
    L36:
        return;
    L35:
        return;
    L23:
        r17 = null;
        goto L24
    L16:
        r15 = null;
        goto L18
    L9:
        r13 = false;
        goto L8
    L5:
        r3 = null;
        goto L6
    }

    public final oh3 l(gn2 r12) {
        qi3 r11 = this.n;
        String r0 = null;
        if (r12 == null) goto L82;
        String r2 = r12.a;
        do2 r1 = r12.d;
        Bundle r3 = r1.I;
        if (r3 == null) goto L8;
        String r4 = r3.getString("type");
    L10:
        if (h12.c(r4, "music") == false) goto L82;
        r2.getClass();
        if (r2.length() == 0) goto L82;
        if (r12.equals(r11.a()) == false) goto L17;
        long r13 = r11.getDuration();
    L19:
        if (r13 != (-9223372036854775807L)) goto L21;
    L23:
        r13 = ((long) r3.getInt("duration")) * 1000;
    L24:
        ag2 r5 = new ag2();
        CharSequence r7 = r1.a;
        if (r7 == null) goto L34;
        String r8 = r7.toString();
        if (r8 == null) goto L34;
        if (qm4.u0(r8) == false) goto L32;
        r8 = null;
    L32:
        if (r8 == null) goto L34;
        r5.put("title", r8);
    L34:
        CharSequence r9 = r1.b;
        if (r9 == null) goto L44;
        String r10 = r9.toString();
        if (r10 == null) goto L44;
        if (qm4.u0(r10) == false) goto L42;
        r10 = null;
    L42:
        if (r10 == null) goto L44;
        r5.put("artist_credit", r10);
    L44:
        String r14 = r3.getString("artistId");
        if (r14 != null) goto L47;
    L52:
        int r15 = r3.getInt("year");
        Integer r16 = Integer.valueOf(r15);
        if (1000 <= r15) goto L55;
    L57:
        r16 = null;
    L58:
        if (r16 == null) goto L60;
        r5.put("year", Integer.valueOf(r16.intValue()));
    L60:
        String r6 = r3.getString("genre");
        if (r6 != null) goto L63;
    L68:
        CharSequence r17 = r1.c;
        if (r17 == null) goto L78;
        String r18 = r17.toString();
        if (r18 == null) goto L78;
        if (qm4.u0(r18) == true) goto L75;
        r0 = r18;
    L75:
        if (r0 == null) goto L78;
        r5.put("album", r0);
    L78:
        if (r13 <= 0) goto L80;
        r5.put("duration_s", Double.valueOf(r13 / 1000.0d));
    L80:
        ag2 r19 = r5.b();
        rs1 r20 = rs1.a;
        return new oh3(r2, r13, rs1.c(r2), r19, (k62) rs1.o.get(r2));
    L63:
        if (qm4.u0(r6) == false) goto L66;
        r6 = null;
    L66:
        if (r6 == null) goto L68;
        r5.put("genre", r6);
        goto L68
    L55:
        if (r15 >= 10000) goto L57;
    L47:
        if (qm4.u0(r14) == false) goto L50;
        r14 = null;
    L50:
        if (r14 == null) goto L52;
        r5.put("primary_nd_artist_id", r14);
        goto L52
    L21:
        if (r13 <= 0) goto L23;
    L17:
        r13 = -9223372036854775807L;
        goto L19
    L8:
        r4 = null;
    L82:
        return null;
    }

    @Override // defpackage.oi3
    public final void t(int r9, gn2 r10) {
        oh3 r11 = (oh3) this.p.r;
        String r0 = null;
        if (r11 == null) goto L5;
        String r2 = r11.a;
    L6:
        if (r2 == null) goto L12;
        if (r10 == null) goto L10;
        r0 = r10.a;
    L10:
        if (h12.c(r0, r2) == true) goto L12;
        this.p.c(r2, null, SystemClock.elapsedRealtime(), false, null);
    L12:
        c();
        return;
    L5:
        r2 = null;
        goto L6
    }

    @Override // defpackage.oi3
    public final void v(int r9) {
        if (r9 != 4) goto L11;
        zq2 r1 = this.p;
        oh3 r8 = (oh3) r1.r;
        if (r8 == null) goto L8;
        String r10 = r8.a;
    L7:
        String r2 = r10;
        r1.c(r2, null, SystemClock.elapsedRealtime(), true, null);
        WeakReference r11 = b.a;
        io1.b.post(new u6(13));
        return;
    L8:
        r10 = null;
        goto L7
    }
}
