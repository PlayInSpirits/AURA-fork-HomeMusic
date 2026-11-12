package defpackage;

import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class el0 extends kp {
    public int A;
    public long B;
    public long C;
    public final boolean r;
    public final int s;
    public final int t;
    public final qr2 u;
    public final qr2 v;
    public ii0 w;
    public HttpURLConnection x;
    public InputStream y;
    public boolean z;

    public el0(int i, int i2, boolean z, qr2 qr2Var) {
        super(true);
        this.s = i;
        this.t = i2;
        this.r = z;
        this.u = qr2Var;
        this.v = new qr2(10);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0112  */
    @Override // defpackage.ci0
    public final long b(ii0 ii0Var) throws HttpDataSource$HttpDataSourceException {
        boolean z;
        long j;
        HttpURLConnection httpURLConnection;
        this.w = ii0Var;
        this.C = 0L;
        this.B = 0L;
        q(ii0Var);
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            HttpURLConnection httpURLConnectionU = u(ii0Var);
            long j2 = ii0Var.g;
            long j3 = ii0Var.f;
            this.x = httpURLConnectionU;
            this.A = httpURLConnectionU.getResponseCode();
            httpURLConnectionU.getResponseMessage();
            int i = this.A;
            long jMax = -1;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionU.getHeaderFields();
                if (this.A == 416) {
                    String headerField = httpURLConnectionU.getHeaderField("Content-Range");
                    Pattern pattern = ir1.a;
                    if (TextUtils.isEmpty(headerField)) {
                        j = -1;
                        z = true;
                    } else {
                        Matcher matcher = ir1.b.matcher(headerField);
                        z = true;
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            j = Long.parseLong(strGroup);
                        } else {
                            j = -1;
                        }
                    }
                    if (j3 == j) {
                        this.z = z;
                        r(ii0Var);
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionU.getErrorStream();
                try {
                    if (errorStream != null) {
                        xw.b(errorStream);
                    } else {
                        String str = f35.a;
                    }
                } catch (IOException unused) {
                    String str2 = f35.a;
                }
                s();
                throw new HttpDataSource$InvalidResponseCodeException(this.A, this.A == 416 ? new DataSourceException(2008) : null, headerFields);
            }
            httpURLConnectionU.getContentType();
            if (this.A != 200 || j3 == 0) {
                j3 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionU.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase) {
                httpURLConnection = httpURLConnectionU;
                this.B = j2;
            } else if (j2 != -1) {
                this.B = j2;
                httpURLConnection = httpURLConnectionU;
            } else {
                String headerField2 = httpURLConnectionU.getHeaderField("Content-Length");
                String headerField3 = httpURLConnectionU.getHeaderField("Content-Range");
                Pattern pattern2 = ir1.a;
                if (!TextUtils.isEmpty(headerField2)) {
                    try {
                        jMax = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        l93.F("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                    }
                }
                if (TextUtils.isEmpty(headerField3)) {
                    httpURLConnection = httpURLConnectionU;
                } else {
                    Matcher matcher2 = ir1.a.matcher(headerField3);
                    if (matcher2.matches()) {
                        try {
                            String strGroup2 = matcher2.group(2);
                            strGroup2.getClass();
                            long j4 = Long.parseLong(strGroup2);
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            httpURLConnection = httpURLConnectionU;
                            long j5 = (j4 - Long.parseLong(strGroup3)) + 1;
                            if (jMax < 0) {
                                jMax = j5;
                            } else if (jMax != j5) {
                                try {
                                    l93.q0("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                    jMax = Math.max(jMax, j5);
                                } catch (NumberFormatException unused3) {
                                    l93.F("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            httpURLConnection = httpURLConnectionU;
                        }
                    } else {
                        httpURLConnection = httpURLConnectionU;
                    }
                }
                this.B = jMax != jMax ? jMax - j3 : -1L;
            }
            try {
                this.y = httpURLConnection.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.y = new GZIPInputStream(this.y);
                }
                this.z = true;
                r(ii0Var);
                try {
                    w(j3);
                    return this.B;
                } catch (IOException e) {
                    s();
                    if (e instanceof HttpDataSource$HttpDataSourceException) {
                        throw ((HttpDataSource$HttpDataSourceException) e);
                    }
                    throw new HttpDataSource$HttpDataSourceException(e, 2000, 1);
                }
            } catch (IOException e2) {
                s();
                throw new HttpDataSource$HttpDataSourceException(e2, 2000, 1);
            }
        } catch (IOException e3) {
            s();
            throw HttpDataSource$HttpDataSourceException.a(e3, 1);
        }
    }

    @Override // defpackage.ci0
    public final void close() {
        try {
            InputStream inputStream = this.y;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = f35.a;
                    throw new HttpDataSource$HttpDataSourceException(e, 2000, 3);
                }
            }
            this.y = null;
            s();
            if (this.z) {
                this.z = false;
                p();
            }
            this.x = null;
            this.w = null;
            TrafficStats.clearThreadStatsTag();
        } catch (Throwable th) {
            this.y = null;
            s();
            if (this.z) {
                this.z = false;
                p();
            }
            this.x = null;
            this.w = null;
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    @Override // defpackage.ci0
    public final Map j() {
        HttpURLConnection httpURLConnection = this.x;
        return httpURLConnection == null ? ly3.t : new dl0(httpURLConnection.getHeaderFields());
    }

    @Override // defpackage.ci0
    public final Uri m() {
        HttpURLConnection httpURLConnection = this.x;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        ii0 ii0Var = this.w;
        if (ii0Var != null) {
            return ii0Var.a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // defpackage.wh0
    public final int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.B;
            if (j != -1) {
                long j2 = j - this.C;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.y;
                    String str = f35.a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.C += (long) i3;
                        o(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.y;
                String str2 = f35.a;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.C += (long) i3;
                    o(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            String str3 = f35.a;
            throw HttpDataSource$HttpDataSourceException.a(e, 2);
        }
    }

    public final void s() {
        HttpURLConnection httpURLConnection = this.x;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                l93.G("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    public final URL t(URL url, String str) throws HttpDataSource$HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource$HttpDataSourceException(2001, "Null location redirect");
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource$HttpDataSourceException(2001, xa3.g("Unsupported protocol redirect: ", protocol));
            }
            if (this.r || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new HttpDataSource$HttpDataSourceException(2001, "Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")");
        } catch (MalformedURLException e) {
            throw new HttpDataSource$HttpDataSourceException(e, 2001, 1);
        }
    }

    public final HttpURLConnection u(ii0 ii0Var) throws IOException {
        URL url = new URL(ii0Var.a.toString());
        int i = ii0Var.c;
        byte[] bArr = ii0Var.d;
        long j = ii0Var.f;
        long j2 = ii0Var.g;
        int i2 = 1;
        int i3 = 0;
        boolean z = (ii0Var.i & 1) == 1;
        if (!this.r) {
            return v(url, i, bArr, j, j2, z, true, ii0Var.e);
        }
        while (true) {
            int i4 = i3 + 1;
            if (i3 > 20) {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException(f34.f(i4, "Too many redirects: ")), 2001, 1);
            }
            HttpURLConnection httpURLConnectionV = v(url, i, bArr, j, j2, z, false, ii0Var.e);
            int responseCode = httpURLConnectionV.getResponseCode();
            String headerField = httpURLConnectionV.getHeaderField("Location");
            if ((i == i2 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionV.disconnect();
                url = t(url, headerField);
            } else {
                if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionV;
                }
                httpURLConnectionV.disconnect();
                url = t(url, headerField);
                bArr = null;
                i = 1;
            }
            i3 = i4;
            i2 = 1;
        }
    }

    public final HttpURLConnection v(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.s);
        httpURLConnection.setReadTimeout(this.t);
        HashMap map2 = new HashMap();
        qr2 qr2Var = this.u;
        if (qr2Var != null) {
            map2.putAll(qr2Var.n());
        }
        map2.putAll(this.v.n());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = ir1.a;
        if (j == 0 && j2 == -1) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(j);
            sb.append("-");
            if (j2 != -1) {
                sb.append((j + j2) - 1);
            }
            string = sb.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i2 = ii0.j;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                tb4.a();
                return null;
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void w(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096L);
            InputStream inputStream = this.y;
            String str = f35.a;
            int i = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), 2000, 1);
            }
            if (i == -1) {
                throw new HttpDataSource$HttpDataSourceException();
            }
            j -= (long) i;
            o(i);
        }
    }
}
