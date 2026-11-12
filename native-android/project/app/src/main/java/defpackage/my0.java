package defpackage;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import com.eddyizm.tempus.homemusic.WaveOrigin;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.util.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class my0 implements lt2 {
    public final MediaService a;

    public my0(MediaService r1) {
        this.a = r1;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.media3.exoplayer.hls.HlsMediaSource$Factory] */
    @Override // defpackage.lt2
    public final bq d(gn2 r9) {
        r9.getClass();
        Bundle r0 = r9.d.I;
        String r1 = null;
        if (r0 == null) goto L5;
        String r2 = r0.getString("type", "");
    L6:
        boolean r3 = false;
        if (h12.c(r2, WaveOrigin.RADIO) == true) goto L12;
        String r4 = r9.a;
        r4.getClass();
        if (xm4.k0(r4, "ir-", false) == true) goto L12;
        boolean r5 = false;
    L13:
        long r6 = ud3.F();
        if (((int) r6) != 0) goto L17;
    L15:
        r3 = true;
    L22:
        MediaService r8 = this.a;
        if (r5 == true) goto L25;
        if (r3 == false) goto L35;
        final kx r10 = au0.E(r8);
    L38:
        bn2 r7 = r9.b;
        if (r7 == null) goto L41;
        String r11 = r7.b;
    L43:
        if (h12.c(r11, "application/x-mpegURL") == true) goto L69;
        bn2 r12 = r9.b;
        if (r12 == null) goto L53;
        Uri r13 = r12.a;
        if (r13 == null) goto L53;
        String r14 = r13.getLastPathSegment();
        if (r14 == null) goto L53;
        if (xm4.e0(r14, ".m3u8", true) == true) goto L69;
    L53:
        jr3 r15 = new jr3(r10, new sk0());
        r15.e = 262144;
        bn2 r16 = r9.b;
        if (r16 == null) goto L56;
        Uri r17 = r16.a;
    L57:
        if (r17 == null) goto L59;
        r1 = r17.getQueryParameter("format");
    L59:
        if (r1 == null) goto L67;
        if (h12.c(r17.getQueryParameter("format"), "raw") == true) goto L67;
        if (a.a("transcodeOffset") == null) goto L67;
        return new qw4(r9, r10, r15);
    L67:
        return new tv2(r15.f(r9));
    L56:
        r17 = null;
    L69:
        return new HlsMediaSource$Factory(r10).f(r9);
    L41:
        r11 = null;
        goto L43
    L35:
        monitor-enter(au0.class);
        kx r18 = new kx();     // Catch: Throwable -> L70
        r18.n = au0.B(r8);     // Catch: Throwable -> L70
        r18.p = new xi4(10);     // Catch: Throwable -> L70
        r18.r = au0.E(r8);     // Catch: Throwable -> L70
        r10 = au0.d(new wo0(new rm2(21, r18), new mj0(12)), au0.u(r8));     // Catch: Throwable -> L70
        monitor-exit(au0.class);
    L70:
        th = move-exception;
        throw th;
    L25:
        monitor-enter(au0.class);
        r10 = au0.d(new rf2(r8, au0.y()), au0.u(r8));     // Catch: Throwable -> L29
        monitor-exit(au0.class);
    L29:
        th = move-exception;
        throw th;
    L17:
        if (r6 <= 0) goto L20;
        if (r5 == true) goto L15;
    L20:
        if (r6 <= 0) goto L15;
        if (r5 == true) goto L15;
    L12:
        r5 = true;
        goto L13
    L5:
        r2 = null;
        goto L6
    }

    @Override // defpackage.lt2
    public final lt2 e(yc5 r1) {
        r1.getClass();
        throw new p63("An operation is not implemented: Not yet implemented");
    }
}
