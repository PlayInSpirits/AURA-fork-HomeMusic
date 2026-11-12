package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.database.AppDatabase;
import com.eddyizm.tempus.model.Download;
import com.eddyizm.tempus.service.DownloaderService;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eu0 {
    public static final byte[] c = null;
    public static HashMap d;
    public static final ConcurrentHashMap.KeySetView e = null;
    public final Context a;
    public final bi0 b;

    static {
        String r0 = f35.a;
        c = "\u0000homemusic:automatic".getBytes(StandardCharsets.UTF_8);
        e = ConcurrentHashMap.newKeySet();
    }

    public eu0(Context r2, bi0 r3, lt0 r4) {
        this.a = r2.getApplicationContext();
        this.b = r3;
        d = new HashMap();
        ek0 r1 = r4.b.g(new int[0]);     // Catch: IOException -> L18
        Cursor r5 = r1.n;
    L24:
    L9:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L15
    L17:
        throw th;     // Catch: IOException -> L18
    L15:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L18
        goto L17
    L6:
        if (r5.moveToPosition(r5.getPosition() + 1) == false) goto L11;
        ns0 r6 = fk0.e(r5);     // Catch: Throwable -> L9
        d.put(r6.a.n, r6);     // Catch: Throwable -> L9
    L11:
        r1.close();     // Catch: IOException -> L18
        return;
    L18:
        e = move-exception;
        l93.r0("DownloaderManager", "Failed to query downloads", e);
    }

    public static Integer c(String r1) {
        ns0 r2 = (ns0) d.get(r1);
        if (r2 != null) goto L5;
        return null;
    L5:
        return Integer.valueOf(r2.b);
    }

    public static boolean d(String r1) {
        ns0 r2 = (ns0) d.get(r1);
        if (r2 != null) goto L5;
        return false;
    L5:
        if (r2.b == 4) goto L10;
        return true;
    L10:
        return false;
    }

    public static void h(ns0 r4) {
        String r0 = r4.a.n;
        new Thread(new qt0(AppDatabase.y().w(), r0, 1)).start();
        HashMap r1 = d;
        tt0 r2 = r4.a;
        r1.put(r2.n, r4);
        e.remove(r2.n);
    }

    public final int a(ArrayList r5, List r6, boolean r7) {
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r0 >= r5.size()) goto L9;
        if (b((gn2) r5.get(r0), (Download) r6.get(r0), r7) == false) goto L8;
        r1 = r1 + 1;
    L8:
        r0 = r0 + 1;
        goto L4
    L9:
        return r1;
    }

    public final boolean b(gn2 r26, Download r27, boolean r28) {
        Pattern r3 = e03.a;
        int r4 = 0;
        if (r27 != null) goto L6;
    L15:
        cn2 r5 = r26.f;
        String r6 = r26.a;
        r27.setDownloadUri(r5.a.toString());
        Context r7 = this.a;
        pm0 r8 = new pm0(r7.getApplicationContext());
        boolean r12 = true;
        r8.c = 1;
        jn0 r13 = zs0.c;
        bn2 r9 = r26.b;
        r9.getClass();
        String r10 = r9.b;
        Uri r11 = r9.a;
        if (f35.J(r11, r10) != 4) goto L18;
        boolean r14 = true;
    L19:
        bi0 r0 = this.b;
        if (r14 == true) goto L24;
        if (r0 != null) goto L24;
        boolean r15 = false;
    L25:
        rr2.l(r15);
        if (r14 == false) goto L30;
        if (r0 != null) goto L30;
        bq r1 = null;
    L34:
        kq[] r16 = r8.b(f35.q(null), new i80(29), new om0(r4), new mj0(6), new mj0(7));
        kq[] r17 = (kq[]) Arrays.copyOf(r16, r16.length);
        int r18 = 0;
    L36:
        if (r18 >= r16.length) goto L38;
        kq r19 = r17[r18];
        ik3 r110 = ik3.c;
        r19.r = r18;
        r19.s = r110;
        r19.t = vp4.a;
        r18 = r18 + 1;
        goto L36
    L38:
        zs0 r111 = new zs0(r26, r1, r13);
        r6.getClass();
        if (r28 == false) goto L41;
        byte[] r2 = (byte[]) c.clone();
    L42:
        bn2 r20 = r111.a;
        r20.a.toString();
        Uri r21 = r20.a;
        String r22 = lw2.m(r20.b);
        ym2 r23 = r20.c;
        if (r23 == null) goto L48;
        byte[] r24 = r23.h;
        if (r24 == null) goto L47;
        byte[] r25 = Arrays.copyOf(r24, r24.length);
    L49:
        String r29 = r20.f;
        int r112 = r111.b;
        if (r112 == 2) goto L74;
        vw1 r113 = yw1.o;
        gy3 r114 = gy3.r;
        int r115 = f35.J(r21, r22);
        if (r115 == 0) goto L55;
        if (r115 == 2) goto L55;
        if (r115 == 1) goto L55;
    L59:
        ArrayList r116 = new ArrayList(r114);
        Collections.sort(r116);
        List r117 = Collections.unmodifiableList(r116);
        if (r25 == null) goto L62;
        byte[] r210 = Arrays.copyOf(r25, r25.length);
    L63:
        if (r2 == null) goto L66;
        byte[] r30 = Arrays.copyOf(r2, r2.length);
    L67:
        tt0 r118 = new tt0(r26.a, r21, r22, r117, r210, r29, r30, null, null);
        ConcurrentHashMap.KeySetView r31 = e;
        r31.add(r6);
        HashMap r32 = vt0.v;     // Catch: IllegalStateException -> L71
        r7.startService(new Intent(r7, DownloaderService.class).setAction("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD").putExtra("foreground", false).putExtra("download_request", r118).putExtra("stop_reason", 0));     // Catch: IllegalStateException -> L71
        new Thread(new lg1(11, AppDatabase.y().w(), r27)).start();
        return true;
    L71:
        e = move-exception;
        r31.remove(r6);
        l93.r0("DownloaderManager", "Download service not started for ".concat(r6), e);
        return false;
    L66:
        r30 = f35.b;
        goto L67
    L62:
        r210 = null;
    L55:
        if (r29 != null) goto L57;
        boolean r119 = true;
    L58:
        rr2.j(r115, "customCacheKey must be null for type: %s", r119);
        goto L59
    L57:
        r119 = false;
        goto L58
    L74:
        if (r112 == 2) goto L77;
        r12 = false;
    L77:
        rr2.w(r12);
        rr2.w(false);
        rr2.w(false);
        new ArrayList();
        new ArrayList();
        throw null;
    L47:
        r25 = null;
        goto L49
    L48:
        r25 = null;
        goto L49
    L41:
        r2 = r6.getBytes(StandardCharsets.UTF_8);
    L30:
        if (f35.J(r11, r10) != 4) goto L32;
        lt2 r33 = new jr3(r0, new sk0());
    L33:
        r1 = r33.d(r26);
        goto L34
    L32:
        r33 = new dm0(r0, n51.a);
    L24:
        r15 = true;
        goto L25
    L18:
        r14 = false;
        goto L19
    L6:
        if (xa3.u("audio_transcode_download", false) == false) goto L15;
        if (xa3.u("audio_transcode_download_priority", false) == true) goto L15;
        String r34 = e03.l();
        String r35 = "0";
        if (e03.l().equals("raw") == true) goto L14;
        App.b().getClass();
        r35 = App.c().getString("max_bitrate_download", "0");
        r35.getClass();
    L14:
        e03.a(r27, r34, r35);
        goto L15
    }

    public final void e(gn2 r4, Download r5) {
        String r6 = r4.a;
        HashMap r0 = vt0.v;
        Context r3 = this.a;
        r3.startService(new Intent(r3, DownloaderService.class).setAction("androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD").putExtra("foreground", false).putExtra("content_id", r6));
        String r7 = r5.getId();
        ss0 r8 = AppDatabase.y().w();
        new Thread(new qt0(r8, r7, 0)).start();
        d.remove(r5.getId());
    }

    public final void f(List r4, List r5) {
        int r0 = 0;
    L4:
        if (r0 >= r4.size()) goto L6;
        e((gn2) r4.get(r0), (Download) r5.get(r0));
        r0 = r0 + 1;
        goto L4
    }

    public final void g() {
        Context r0 = this.a;
        HashMap r2 = vt0.v;
        Intent r1 = new Intent(r0, DownloaderService.class).setAction("androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS");
        int r3 = 0;
        r0.startService(r1.putExtra("foreground", false));
        new Thread(new g5(7, AppDatabase.y().w())).start();
        Context r4 = this.a;
        monitor-enter(au0.class);
        File r5 = au0.v(r4);     // Catch: Throwable -> L8
        ArrayList r6 = new ArrayList();     // Catch: Throwable -> L8
        au0.K(r5, r6);     // Catch: Throwable -> L8
        int r7 = r6.size();     // Catch: Throwable -> L8
    L5:
        if (r3 >= r7) goto L10;
        Object r8 = r6.get(r3);     // Catch: Throwable -> L8
        r3 = r3 + 1;     // Catch: Throwable -> L8
        ((File) r8).delete();     // Catch: Throwable -> L8
        goto L5
    L10:
        monitor-exit(au0.class);
        return;
    L8:
        th = move-exception;
        throw th;
    }
}
