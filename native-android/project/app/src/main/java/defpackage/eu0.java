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
    public static final byte[] c;
    public static HashMap d;
    public static final ConcurrentHashMap.KeySetView e;
    public final Context a;
    public final bi0 b;

    static {
        String str = f35.a;
        c = "\u0000homemusic:automatic".getBytes(StandardCharsets.UTF_8);
        e = ConcurrentHashMap.newKeySet();
    }

    public eu0(Context context, bi0 bi0Var, lt0 lt0Var) {
        this.a = context.getApplicationContext();
        this.b = bi0Var;
        d = new HashMap();
        try {
            ek0 ek0VarG = lt0Var.b.g(new int[0]);
            Cursor cursor = ek0VarG.n;
            while (cursor.moveToPosition(cursor.getPosition() + 1)) {
                try {
                    ns0 ns0VarE = fk0.e(cursor);
                    d.put(ns0VarE.a.n, ns0VarE);
                } catch (Throwable th) {
                    try {
                        ek0VarG.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            ek0VarG.close();
        } catch (IOException e2) {
            l93.r0("DownloaderManager", "Failed to query downloads", e2);
        }
    }

    public static Integer c(String str) {
        ns0 ns0Var = (ns0) d.get(str);
        if (ns0Var != null) {
            return Integer.valueOf(ns0Var.b);
        }
        return null;
    }

    public static boolean d(String str) {
        ns0 ns0Var = (ns0) d.get(str);
        return (ns0Var == null || ns0Var.b == 4) ? false : true;
    }

    public static void h(ns0 ns0Var) {
        new Thread(new qt0(AppDatabase.y().w(), ns0Var.a.n, 1)).start();
        HashMap map = d;
        tt0 tt0Var = ns0Var.a;
        map.put(tt0Var.n, ns0Var);
        e.remove(tt0Var.n);
    }

    public final int a(ArrayList arrayList, List list, boolean z) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (b((gn2) arrayList.get(i2), (Download) list.get(i2), z)) {
                i++;
            }
        }
        return i;
    }

    public final boolean b(gn2 gn2Var, Download download, boolean z) {
        byte[] bArrCopyOf;
        Pattern pattern = e03.a;
        int i = 0;
        if (download != null && xa3.u("audio_transcode_download", false) && !xa3.u("audio_transcode_download_priority", false)) {
            String strL = e03.l();
            String string = "0";
            if (!e03.l().equals("raw")) {
                App.b().getClass();
                string = App.c().getString("max_bitrate_download", "0");
                string.getClass();
            }
            e03.a(download, strL, string);
        }
        cn2 cn2Var = gn2Var.f;
        String str = gn2Var.a;
        download.setDownloadUri(cn2Var.a.toString());
        Context context = this.a;
        pm0 pm0Var = new pm0(context.getApplicationContext());
        pm0Var.c = 1;
        jn0 jn0Var = zs0.c;
        bn2 bn2Var = gn2Var.b;
        bn2Var.getClass();
        String str2 = bn2Var.b;
        Uri uri = bn2Var.a;
        boolean z2 = f35.J(uri, str2) == 4;
        bi0 bi0Var = this.b;
        rr2.l(z2 || bi0Var != null);
        bq bqVarD = (z2 && bi0Var == null) ? null : (f35.J(uri, str2) == 4 ? new jr3(bi0Var, new sk0()) : new dm0(bi0Var, n51.a)).d(gn2Var);
        kq[] kqVarArrB = pm0Var.b(f35.q(null), new i80(29), new om0(i), new mj0(6), new mj0(7));
        kq[] kqVarArr = (kq[]) Arrays.copyOf(kqVarArrB, kqVarArrB.length);
        for (int i2 = 0; i2 < kqVarArrB.length; i2++) {
            kq kqVar = kqVarArr[i2];
            ik3 ik3Var = ik3.c;
            kqVar.r = i2;
            kqVar.s = ik3Var;
            kqVar.t = vp4.a;
        }
        zs0 zs0Var = new zs0(gn2Var, bqVarD, jn0Var);
        str.getClass();
        byte[] bytes = z ? (byte[]) c.clone() : str.getBytes(StandardCharsets.UTF_8);
        bn2 bn2Var2 = zs0Var.a;
        bn2Var2.a.toString();
        Uri uri2 = bn2Var2.a;
        String strM = lw2.m(bn2Var2.b);
        ym2 ym2Var = bn2Var2.c;
        if (ym2Var != null) {
            byte[] bArr = ym2Var.h;
            bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        } else {
            bArrCopyOf = null;
        }
        String str3 = bn2Var2.f;
        int i3 = zs0Var.b;
        if (i3 == 2) {
            rr2.w(i3 == 2);
            rr2.w(false);
            rr2.w(false);
            new ArrayList();
            new ArrayList();
            throw null;
        }
        vw1 vw1Var = yw1.o;
        gy3 gy3Var = gy3.r;
        int iJ = f35.J(uri2, strM);
        if (iJ == 0 || iJ == 2 || iJ == 1) {
            rr2.j(iJ, "customCacheKey must be null for type: %s", str3 == null);
        }
        ArrayList arrayList = new ArrayList(gy3Var);
        Collections.sort(arrayList);
        tt0 tt0Var = new tt0(gn2Var.a, uri2, strM, Collections.unmodifiableList(arrayList), bArrCopyOf != null ? Arrays.copyOf(bArrCopyOf, bArrCopyOf.length) : null, str3, bytes != null ? Arrays.copyOf(bytes, bytes.length) : f35.b, null, null);
        ConcurrentHashMap.KeySetView keySetView = e;
        keySetView.add(str);
        try {
            HashMap map = vt0.v;
            context.startService(new Intent(context, (Class<?>) DownloaderService.class).setAction("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD").putExtra("foreground", false).putExtra("download_request", tt0Var).putExtra("stop_reason", 0));
            new Thread(new lg1(11, AppDatabase.y().w(), download)).start();
            return true;
        } catch (IllegalStateException e2) {
            keySetView.remove(str);
            l93.r0("DownloaderManager", "Download service not started for ".concat(str), e2);
            return false;
        }
    }

    public final void e(gn2 gn2Var, Download download) {
        String str = gn2Var.a;
        HashMap map = vt0.v;
        Context context = this.a;
        context.startService(new Intent(context, (Class<?>) DownloaderService.class).setAction("androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD").putExtra("foreground", false).putExtra("content_id", str));
        String id = download.getId();
        new Thread(new qt0(AppDatabase.y().w(), id, 0)).start();
        d.remove(download.getId());
    }

    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            e((gn2) list.get(i), (Download) list2.get(i));
        }
    }

    public final void g() {
        Context context = this.a;
        HashMap map = vt0.v;
        int i = 0;
        context.startService(new Intent(context, (Class<?>) DownloaderService.class).setAction("androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS").putExtra("foreground", false));
        new Thread(new g5(7, AppDatabase.y().w())).start();
        Context context2 = this.a;
        synchronized (au0.class) {
            File fileV = au0.v(context2);
            ArrayList arrayList = new ArrayList();
            au0.K(fileV, arrayList);
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((File) obj).delete();
            }
        }
    }
}
