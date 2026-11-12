package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.PowerManager;
import app.homemusic.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w85 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ w85(int r1, Object r2, Object r3) {
        this.n = r1;
        this.p = r2;
        this.o = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.n) {
            case 0: goto L97;
            case 1: goto L83;
            case 2: goto L26;
            case 3: goto L22;
            case 4: goto L8;
            default: goto L4;
        };
    L4:
        wd5 r1 = (wd5) this.p;
        ea2 r0 = (ea2) this.o;
        if (r1.p == true) goto L108;
        r1.q = r0;
        r0.a(r1);
        return;
    L108:
        return;
    L8:
        rf2 r2 = (rf2) this.p;
        AtomicBoolean r3 = (AtomicBoolean) this.o;
        monitor-enter(r2);
    L16:
        th = move-exception;
        throw th;
    L11:
        if (r3.get() == false) goto L18;
        WifiManager.WifiLock r4 = (WifiManager.WifiLock) r2.o;     // Catch: Throwable -> L16
        if (r4 == null) goto L18;
        r4.release();     // Catch: Throwable -> L16
    L18:
        monitor-exit(r2);
        return;
    L22:
        y10 r5 = (y10) this.p;
        AtomicBoolean r6 = (AtomicBoolean) this.o;
        rf2 r7 = (rf2) r5.d;
        r7.getClass();
        if (r6.get() == false) goto L109;
        new Thread(new w85(4, r7, r6), "ExoPlayer:WifiLockManager").start();
        return;
    L109:
        return;
    L26:
        bl2 r8 = (bl2) this.p;
        Context r9 = (Context) this.o;
        if (r8.isDone() == false) goto L110;
        sk2 r10 = (sk2) r8.get();     // Catch: Throwable -> L101
        gn2 r11 = r10.a();     // Catch: Throwable -> L101
        String r12 = null;
        if (r11 == null) goto L67;
        do2 r13 = r11.d;     // Catch: Throwable -> L101
        if (r13 == null) goto L67;
        Bundle r14 = r13.I;     // Catch: Throwable -> L101
        CharSequence r15 = r13.a;     // Catch: Throwable -> L101
        if (r15 == null) goto L37;
        String r16 = r15.toString();     // Catch: Throwable -> L101
    L38:
        CharSequence r17 = r13.b;     // Catch: Throwable -> L101
        if (r17 == null) goto L41;
        String r18 = r17.toString();     // Catch: Throwable -> L101
    L42:
        CharSequence r19 = r13.c;     // Catch: Throwable -> L101
        if (r19 == null) goto L45;
        String r20 = r19.toString();     // Catch: Throwable -> L101
    L46:
        if (r14 == null) goto L66;
        if (r16 != null) goto L49;
        r12 = r14.getString("title");     // Catch: Throwable -> L101
    L50:
        if (r18 != null) goto L52;
        String r21 = r14.getString("artist");     // Catch: Throwable -> L101
    L53:
        if (r20 != null) goto L55;
        r20 = r14.getString("album");     // Catch: Throwable -> L101
    L55:
        String r22 = r14.getString("coverArtId");     // Catch: Throwable -> L101
        String r23 = r14.getString("assetLinkSong");     // Catch: Throwable -> L101
        if (r23 != null) goto L58;
        r23 = l93.i("song", r14.getString("id"));     // Catch: Throwable -> L101
    L58:
        String r110 = r14.getString("assetLinkAlbum");     // Catch: Throwable -> L101
        if (r110 != null) goto L61;
        String r24 = l93.i("album", r14.getString("albumId"));     // Catch: Throwable -> L101
    L62:
        String r111 = r14.getString("assetLinkArtist");     // Catch: Throwable -> L101
        if (r111 != null) goto L65;
        String r112 = r24;
        String r113 = l93.i("artist", r14.getString("artistId"));     // Catch: Throwable -> L101
        String r25 = r22;
        String r114 = r23;
    L68:
        long r26 = r10.M0();     // Catch: Throwable -> L101
        long r115 = r10.getDuration();     // Catch: Throwable -> L101
        if (r26 != (-9223372036854775807L)) goto L72;
        r26 = 0;
    L72:
        if (r115 != (-9223372036854775807L)) goto L74;
        long r116 = 0;
    L75:
        if (r12 == null) goto L77;
    L76:
        String r27 = r12;
        if (r21 != null) goto L81;
        r21 = r9.getString(R.string.widget_placeholder_subtitle);     // Catch: Throwable -> L101
    L81:
        String r28 = r20;
        String r29 = r21;
        ji2.T(r9, r27, r29, r28, r25, r10.h0(), r10.D0(), r10.h(), r26, r116, r114, r112, r113);     // Catch: Throwable -> L101
        r10.Y0();     // Catch: Throwable -> L101
        return;
    L77:
        r12 = r9.getString(R.string.widget_not_playing);     // Catch: Throwable -> L101
        goto L76
    L74:
        r116 = r115;
        goto L75
    L65:
        r112 = r24;
        r25 = r22;
        r114 = r23;
        r113 = r111;
        goto L68
    L61:
        r24 = r110;
        goto L62
    L52:
        r21 = r18;
        goto L53
    L49:
        r12 = r16;
        goto L50
    L66:
        r25 = null;
        r114 = null;
        r112 = null;
        r113 = null;
        r12 = r16;
        r21 = r18;
        goto L68
    L45:
        r20 = null;
        goto L46
    L41:
        r18 = null;
        goto L42
    L37:
        r16 = null;
    L67:
        r20 = null;
        r25 = null;
        r21 = null;
        r114 = null;
        r112 = null;
        r113 = null;
        goto L68
    L110:
        return;
    L111:
        return;
    L83:
        xc5 r30 = (xc5) this.p;
        AtomicBoolean r31 = (AtomicBoolean) this.o;
        monitor-enter(r30);
    L91:
        th = move-exception;
        throw th;
    L86:
        if (r31.get() == false) goto L93;
        PowerManager.WakeLock r32 = (PowerManager.WakeLock) r30.p;     // Catch: Throwable -> L91
        if (r32 == null) goto L93;
        r32.release();     // Catch: Throwable -> L91
    L93:
        monitor-exit(r30);
        return;
    L97:
        y10 r33 = (y10) this.p;
        AtomicBoolean r34 = (AtomicBoolean) this.o;
        xc5 r35 = (xc5) r33.d;
        r35.getClass();
        if (r34.get() == false) goto L112;
        new Thread(new w85(1, r35, r34), "ExoPlayer:WakeLockManager").start();
        return;
    }
}
