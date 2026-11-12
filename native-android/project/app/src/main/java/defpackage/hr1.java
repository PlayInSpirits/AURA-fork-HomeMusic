package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hr1 implements sh0 {
    public final qi1 n;
    public final int o;
    public HttpURLConnection p;
    public InputStream q;
    public volatile boolean r;

    static {
    }

    public hr1(qi1 r1, int r2) {
        this.n = r1;
        this.o = r2;
    }

    public static int b(HttpURLConnection r2) {
        return r2.getResponseCode();
    L4:
        e = move-exception;
        if (Log.isLoggable("HttpUrlFetcher", 3) == false) goto L12;
        Log.d("HttpUrlFetcher", "Failed to get a response code", e);
        return -1;
    L12:
        return -1;
    }

    @Override // defpackage.sh0
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.sh0
    public final void c() {
        InputStream r0 = this.q;
        if (r0 != null) goto L11;
    L5:
        HttpURLConnection r1 = this.p;
        if (r1 == null) goto L8;
        r1.disconnect();
    L8:
        this.p = null;
        return;
    L11:
        r0.close();     // Catch: IOException -> L10
        goto L5
    }

    @Override // defpackage.sh0
    public final void cancel() {
        this.r = true;
    }

    @Override // defpackage.sh0
    public final void d(eq3 r9, rh0 r10) {
        qi1 r11 = this.n;
        int r2 = ee2.b;
        long r3 = SystemClock.elapsedRealtimeNanos();
        r10.f(f(r11.d(), 0, null, r11.b.a()));     // Catch: Throwable -> L8 IOException -> L10
    L5:
        if (Log.isLoggable("HttpUrlFetcher", 2) == false) goto L26;
        Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + ee2.a(r3));
        return;
    L26:
        return;
    L8:
        th = move-exception;
        if (Log.isLoggable("HttpUrlFetcher", 2) == false) goto L23;
        Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + ee2.a(r3));
    L23:
        throw th;
    L10:
        e = move-exception;
        if (Log.isLoggable("HttpUrlFetcher", 3) == false) goto L15;
        Log.d("HttpUrlFetcher", "Failed to load data for url", e);     // Catch: Throwable -> L8
    L15:
        r10.b(e);     // Catch: Throwable -> L8
        if (Log.isLoggable("HttpUrlFetcher", 2) == false) goto L27;
        Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + ee2.a(r3));
        return;
    }

    @Override // defpackage.sh0
    public final int e() {
        return 2;
    }

    public final InputStream f(URL r8, int r9, URL r10, Map r11) {
        if (r9 >= 5) goto L63;
        if (r10 != null) goto L70;
    L10:
        int r12 = this.o;
        HttpURLConnection r3 = (HttpURLConnection) r8.openConnection();     // Catch: IOException -> L59
        Iterator r4 = r11.entrySet().iterator();
    L14:
        if (r4.hasNext() == false) goto L16;
        Map.Entry r5 = (Map.Entry) r4.next();
        r3.addRequestProperty((String) r5.getKey(), (String) r5.getValue());
        goto L14
    L16:
        r3.setConnectTimeout(r12);
        r3.setReadTimeout(r12);
        r3.setUseCaches(false);
        r3.setDoInput(true);
        r3.setInstanceFollowRedirects(false);
        this.p = r3;
        r3.connect();     // Catch: IOException -> L56
        this.q = this.p.getInputStream();     // Catch: IOException -> L56
        if (this.r == false) goto L21;
        return null;
    L21:
        int r0 = b(this.p);
        int r6 = r0 / 100;
        if (r6 != 2) goto L37;
        HttpURLConnection r13 = this.p;
    L27:
        e = move-exception;
        throw new HttpException(b(r13), e, "Failed to obtain InputStream");
    L25:
        if (TextUtils.isEmpty(r13.getContentEncoding()) == false) goto L30;
        this.q = new md0(r13.getInputStream(), r13.getContentLength());     // Catch: IOException -> L27
    L34:
        return this.q;
    L30:
        if (Log.isLoggable("HttpUrlFetcher", 3) == false) goto L32;
        Log.d("HttpUrlFetcher", "Got non empty content encoding: " + r13.getContentEncoding());     // Catch: IOException -> L27
    L32:
        this.q = r13.getInputStream();     // Catch: IOException -> L27
        goto L34
    L37:
        if (r6 != 3) goto L48;
        String r1 = this.p.getHeaderField("Location");
        if (TextUtils.isEmpty(r1) == true) goto L47;
        URL r2 = new URL(r8, r1);     // Catch: MalformedURLException -> L43
        c();
        return f(r2, r9 + 1, r8, r11);
    L43:
        e = move-exception;
        throw new HttpException(r0, e, xa3.g("Bad redirect url: ", r1));
    L47:
        throw new HttpException(r0, null, "Received empty or null redirect url");
    L48:
        if (r0 == (-1)) goto L50;
    L53:
        e = move-exception;
        throw new HttpException(r0, e, "Failed to get a response message");
    L52:
        throw new HttpException(r0, null, this.p.getResponseMessage());     // Catch: IOException -> L53
    L50:
        throw new HttpException(r0, null, "Http request failed");
    L56:
        e = move-exception;
        throw new HttpException(b(this.p), e, "Failed to connect or obtain data");
    L59:
        e = move-exception;
        throw new HttpException(0, e, "URL.openConnection threw");
    L70:
        if (r8.toURI().equals(r10.toURI()) == false) goto L10;
        throw new HttpException(-1, null, "In re-direct loop");     // Catch: URISyntaxException -> L64
    L63:
        throw new HttpException(-1, null, "Too many (> 5) redirects!");
    }
}
