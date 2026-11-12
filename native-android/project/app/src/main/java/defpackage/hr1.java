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
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hr1 implements sh0 {
    public final qi1 n;
    public final int o;
    public HttpURLConnection p;
    public InputStream q;
    public volatile boolean r;

    public hr1(qi1 qi1Var, int i) {
        this.n = qi1Var;
        this.o = i;
    }

    public static int b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    @Override // defpackage.sh0
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.sh0
    public final void c() {
        InputStream inputStream = this.q;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.p;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.p = null;
    }

    @Override // defpackage.sh0
    public final void cancel() {
        this.r = true;
    }

    @Override // defpackage.sh0
    public final void d(eq3 eq3Var, rh0 rh0Var) {
        qi1 qi1Var = this.n;
        int i = ee2.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            rh0Var.f(f(qi1Var.d(), 0, null, qi1Var.b.a()));
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            rh0Var.b(e);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + ee2.a(jElapsedRealtimeNanos));
            }
        }
    }

    @Override // defpackage.sh0
    public final int e() {
        return 2;
    }

    public final InputStream f(URL url, int i, URL url2, Map map) throws HttpException {
        if (i >= 5) {
            throw new HttpException(-1, null, "Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException(-1, null, "In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i2 = this.o;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.p = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.q = this.p.getInputStream();
                if (this.r) {
                    return null;
                }
                int iB = b(this.p);
                int i3 = iB / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.p;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.q = new md0(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.q = httpURLConnection2.getInputStream();
                        }
                        return this.q;
                    } catch (IOException e) {
                        throw new HttpException(b(httpURLConnection2), e, "Failed to obtain InputStream");
                    }
                }
                if (i3 != 3) {
                    if (iB == -1) {
                        throw new HttpException(iB, null, "Http request failed");
                    }
                    try {
                        throw new HttpException(iB, null, this.p.getResponseMessage());
                    } catch (IOException e2) {
                        throw new HttpException(iB, e2, "Failed to get a response message");
                    }
                }
                String headerField = this.p.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException(iB, null, "Received empty or null redirect url");
                }
                try {
                    URL url3 = new URL(url, headerField);
                    c();
                    return f(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new HttpException(iB, e3, xa3.g("Bad redirect url: ", headerField));
                }
            } catch (IOException e4) {
                throw new HttpException(b(this.p), e4, "Failed to connect or obtain data");
            }
        } catch (IOException e5) {
            throw new HttpException(0, e5, "URL.openConnection threw");
        }
    }
}
