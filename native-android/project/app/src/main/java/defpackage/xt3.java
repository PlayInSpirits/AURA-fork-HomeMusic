package defpackage;

import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.a;
import com.eddyizm.tempus.App;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xt3 {
    public static final ExecutorService a = null;

    static {
        a = Executors.newFixedThreadPool(2);
    }

    public static vz3 a(vz3 r3, Uri r4) {
        if (r4 != null) goto L4;
        return r3;
    L4:
        if ("file".equals(r4.getScheme()) == true) goto L6;
        return r3;
    L6:
        if (r4.getPath() != null) goto L8;
        return r3;
    L8:
        return (vz3) r3.w(new s73(Long.valueOf(new File(r4.getPath()).lastModified())));
    }

    public static void b(String r2, String r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        if (r3.isEmpty() == true) goto L9;
        ur2 r0 = new ur2(15, r2, r3);
        a.execute(r0);
        return;
    }

    public static void c(File r6, String r7) {
        HttpURLConnection r2 = null;
        HttpURLConnection r3 = (HttpURLConnection) new URL(r7).openConnection();     // Catch: Throwable -> L41 Exception -> L43
        r3.setConnectTimeout(15000);     // Catch: Throwable -> L10 Exception -> L12
        r3.setReadTimeout(15000);     // Catch: Throwable -> L10 Exception -> L12
        r3.setInstanceFollowRedirects(true);     // Catch: Throwable -> L10 Exception -> L12
        int r4 = r3.getResponseCode();     // Catch: Throwable -> L10 Exception -> L12
        if (r4 == 200) goto L14;
        Log.w("RadioCoverArtDownloader", "HTTP " + r4 + " downloading cover from " + r7);     // Catch: Throwable -> L10 Exception -> L12
        r3.disconnect();
        return;
    L14:
        InputStream r1 = r3.getInputStream();     // Catch: Throwable -> L10 Exception -> L12
        FileOutputStream r5 = new FileOutputStream(r6);     // Catch: Throwable -> L28
        byte[] r8 = new byte[8192];     // Catch: Throwable -> L22
    L18:
        int r9 = r1.read(r8);     // Catch: Throwable -> L22
        if (r9 == (-1)) goto L24;
        r5.write(r8, 0, r9);     // Catch: Throwable -> L22
    L24:
        r5.close();     // Catch: Throwable -> L28
        r1.close();     // Catch: Throwable -> L10 Exception -> L12
        r3.disconnect();
        return;
    L22:
        th = move-exception;
        r5.close();     // Catch: Throwable -> L32
    L34:
        throw th;     // Catch: Throwable -> L28
    L32:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        if (r1 != null) goto L57;
    L40:
        throw th;     // Catch: Throwable -> L10 Exception -> L12
    L57:
        r1.close();     // Catch: Throwable -> L38
    L38:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L10 Exception -> L12
    L12:
        e = e;
        r2 = r3;
    L44:
        Log.e("RadioCoverArtDownloader", "Failed to download cover from " + r7, e);     // Catch: Throwable -> L41
        if (r2 == null) goto L65;
        r2.disconnect();
        return;
    L65:
        return;
    L10:
        th = th;
        r2 = r3;
    L48:
        if (r2 == null) goto L50;
        r2.disconnect();
    L50:
        throw th;
    L41:
        th = th;
    L43:
        e = e;
        goto L44
    }

    public static void d(File r4, String r5) {
        File r0 = (File) ((vz3) a.c(App.a()).p().P(r5).e(xq0.d)).R(Integer.MIN_VALUE, Integer.MIN_VALUE).get();     // Catch: Exception -> L19
        if (r0 != null) goto L5;
        return;
    L5:
        if (r0.exists() == false) goto L46;
        FileInputStream r1 = new FileInputStream(r0);     // Catch: Exception -> L19
        FileOutputStream r2 = new FileOutputStream(r4);     // Catch: Throwable -> L21
        byte[] r6 = new byte[8192];     // Catch: Throwable -> L14
    L10:
        int r3 = r1.read(r6);     // Catch: Throwable -> L14
        if (r3 == (-1)) goto L16;
        r2.write(r6, 0, r3);     // Catch: Throwable -> L14
    L16:
        r2.close();     // Catch: Throwable -> L21
        r1.close();     // Catch: Exception -> L19
        return;
    L14:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L25
    L27:
        throw th;     // Catch: Throwable -> L21
    L25:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L30
    L32:
        throw th;     // Catch: Exception -> L19
    L30:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Exception -> L19
        goto L32
    L46:
        return;
    L19:
        e = move-exception;
        Log.e("RadioCoverArtDownloader", "Failed to download cover via Glide from ".concat(r5), e);
    }

    public static File e(String r4) {
        File r2 = new File(App.a().getFilesDir(), "radio_covers");
        if (r2.exists() == true) goto L6;
        r2.mkdirs();
    L6:
        return new File(r2, r4);
    }
}
