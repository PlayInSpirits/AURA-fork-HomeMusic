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
import java.util.Iterator;
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

    public el0(int r2, int r3, boolean r4, qr2 r5) {
        super(true);
        this.s = r2;
        this.t = r3;
        this.r = r4;
        this.u = r5;
        this.v = new qr2(10);
    }

    @Override // defpackage.ci0
    public final long b(ii0 r27) {
        this.w = r27;
        this.C = 0;
        this.B = 0;
        q(r27);
        TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());     // Catch: IOException -> L95
        HttpURLConnection r5 = u(r27);     // Catch: IOException -> L95
        long r6 = r27.g;     // Catch: IOException -> L95
        long r8 = r27.f;     // Catch: IOException -> L95
        this.x = r5;     // Catch: IOException -> L95
        this.A = r5.getResponseCode();     // Catch: IOException -> L95
        r5.getResponseMessage();     // Catch: IOException -> L95
        int r10 = this.A;
        long r13 = -1;
        if (r10 < 200) goto L68;
        if (r10 > 299) goto L68;
        r5.getContentType();
        if (this.A == 200) goto L12;
    L14:
        r8 = 0;
    L15:
        boolean r11 = "gzip".equalsIgnoreCase(r5.getHeaderField("Content-Encoding"));
        if (r11 == false) goto L18;
        HttpURLConnection r12 = r5;
        this.B = r6;
    L101:
        this.y = r12.getInputStream();     // Catch: IOException -> L53
        if (r11 == false) goto L55;
        this.y = new GZIPInputStream(this.y);     // Catch: IOException -> L53
    L55:
        this.z = true;
        r(r27);
        w(r8);     // Catch: IOException -> L59
        return this.B;
    L59:
        e = move-exception;
        s();
        if ((e instanceof HttpDataSource$HttpDataSourceException) == false) goto L65;
        throw ((HttpDataSource$HttpDataSourceException) e);
    L65:
        throw new HttpDataSource$HttpDataSourceException(e, 2000, 1);
    L53:
        e = move-exception;
        s();
        throw new HttpDataSource$HttpDataSourceException(e, 2000, 1);
    L18:
        if (r6 == (-1)) goto L20;
        this.B = r6;
        r12 = r5;
        goto L101
    L20:
        String r7 = r5.getHeaderField("Content-Length");
        String r9 = r5.getHeaderField("Content-Range");
        Pattern r14 = ir1.a;
        if (TextUtils.isEmpty(r7) == true) goto L27;
        r13 = Long.parseLong(r7);     // Catch: NumberFormatException -> L24
    L24:
        l93.F("HttpUtil", "Unexpected Content-Length [" + r7 + "]");
    L27:
        if (TextUtils.isEmpty(r9) == true) goto L41;
        Matcher r3 = ir1.a.matcher(r9);
        if (r3.matches() == false) goto L41;
        String r15 = r3.group(2);     // Catch: NumberFormatException -> L39
        r15.getClass();     // Catch: NumberFormatException -> L39
        long r20 = Long.parseLong(r15);     // Catch: NumberFormatException -> L39
        String r4 = r3.group(1);     // Catch: NumberFormatException -> L39
        r4.getClass();     // Catch: NumberFormatException -> L39
        r12 = r5;
        long r16 = (r20 - Long.parseLong(r4)) + 1;
        if (r13 >= 0) goto L36;
        r13 = r16;
    L43:
        if (r13 == r13) goto L45;
        long r17 = r13 - r8;
    L46:
        this.B = r17;
        goto L101
    L45:
        r17 = -1;
        goto L46
    L36:
        if (r13 == r16) goto L43;
        l93.q0("HttpUtil", "Inconsistent headers [" + r7 + "] [" + r9 + "]");     // Catch: NumberFormatException -> L98
        r13 = Math.max(r13, r16);     // Catch: NumberFormatException -> L98
    L40:
        l93.F("HttpUtil", "Unexpected Content-Range [" + r9 + "]");
    L39:
        r12 = r5;
    L41:
        r12 = r5;
        goto L43
    L12:
        if (r8 == 0) goto L14;
    L68:
        Map<String, List<String>> r2 = r5.getHeaderFields();
        if (this.A != 416) goto L83;
        String r18 = r5.getHeaderField("Content-Range");
        Pattern r19 = ir1.a;
        if (TextUtils.isEmpty(r18) == false) goto L73;
        long r110 = -1;
        boolean r21 = true;
    L78:
        if (r8 != r110) goto L83;
        this.z = r21;
        r(r27);
        if (r6 == (-1)) goto L82;
        return r6;
    L82:
        return 0;
    L73:
        Matcher r22 = ir1.b.matcher(r18);
        r21 = true;
        if (r22.matches() == false) goto L76;
        String r23 = r22.group(1);
        r23.getClass();
        r110 = Long.parseLong(r23);
        goto L78
    L76:
        r110 = -1;
    L83:
        InputStream r0 = r5.getErrorStream();
        if (r0 == null) goto L86;
        xw.b(r0);     // Catch: IOException -> L88
    L109:
    L89:
        s();
        if (this.A != 416) goto L92;
        DataSourceException r1 = new DataSourceException(2008);
    L94:
        throw new HttpDataSource$InvalidResponseCodeException(this.A, r1, r2);
    L92:
        r1 = null;
        goto L94
    L86:
        String r24 = f35.a;     // Catch: IOException -> L88
    L88:
        String r25 = f35.a;
    L95:
        e = move-exception;
        s();
        throw HttpDataSource$HttpDataSourceException.a(e, 1);
    }

    @Override // defpackage.ci0
    public final void close() {
        InputStream r2 = this.y;     // Catch: Throwable -> L7
        if (r2 != null) goto L23;
    L12:
        this.y = null;
        s();
        if (this.z == false) goto L15;
        this.z = false;
        p();
    L15:
        this.x = null;
        this.w = null;
        TrafficStats.clearThreadStatsTag();
        return;
    L23:
        r2.close();     // Catch: Throwable -> L7 IOException -> L9
    L9:
        e = move-exception;
        String r4 = f35.a;     // Catch: Throwable -> L7
        throw new HttpDataSource$HttpDataSourceException(e, 2000, 3);     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        this.y = null;
        s();
        if (this.z == false) goto L20;
        this.z = false;
        p();
    L20:
        this.x = null;
        this.w = null;
        TrafficStats.clearThreadStatsTag();
        throw th;
    }

    @Override // defpackage.ci0
    public final Map j() {
        HttpURLConnection r1 = this.x;
        if (r1 != null) goto L7;
        return ly3.t;
    L7:
        return new dl0(r1.getHeaderFields());
    }

    @Override // defpackage.ci0
    public final Uri m() {
        HttpURLConnection r0 = this.x;
        if (r0 != null) goto L5;
        ii0 r1 = this.w;
        if (r1 != null) goto L9;
        return null;
    L9:
        return r1.a;
    L5:
        return Uri.parse(r0.getURL().toString());
    }

    @Override // defpackage.wh0
    public final int read(byte[] r7, int r8, int r9) {
        if (r9 != 0) goto L19;
        return 0;
    L19:
        long r0 = this.B;     // Catch: IOException -> L16
        if (r0 == (-1)) goto L11;
        long r1 = r0 - this.C;     // Catch: IOException -> L16
        if (r1 == 0) goto L13;
        r9 = (int) Math.min(r9, r1);     // Catch: IOException -> L16
    L13:
        return -1;
    L11:
        InputStream r2 = this.y;     // Catch: IOException -> L16
        String r3 = f35.a;     // Catch: IOException -> L16
        int r10 = r2.read(r7, r8, r9);     // Catch: IOException -> L16
        if (r10 == (-1)) goto L13;
        this.C += (long) r10;     // Catch: IOException -> L16
        o(r10);     // Catch: IOException -> L16
        return r10;
    L16:
        e = move-exception;
        String r11 = f35.a;
        throw HttpDataSource$HttpDataSourceException.a(e, 2);
    }

    public final void s() {
        HttpURLConnection r2 = this.x;
        if (r2 == null) goto L11;
        r2.disconnect();     // Catch: Exception -> L6
        return;
    L6:
        e = move-exception;
        l93.G("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
        return;
    }

    public final URL t(URL r4, String r5) {
        if (r5 == null) goto L24;
        URL r1 = new URL(r4, r5);     // Catch: MalformedURLException -> L20
        String r6 = r1.getProtocol();
        if ("https".equals(r6) == true) goto L13;
        if ("http".equals(r6) == true) goto L13;
        throw new HttpDataSource$HttpDataSourceException(2001, xa3.g("Unsupported protocol redirect: ", r6));
    L13:
        if (this.r == false) goto L15;
    L19:
        return r1;
    L15:
        if (r6.equals(r4.getProtocol()) == true) goto L19;
        throw new HttpDataSource$HttpDataSourceException(2001, "Disallowed cross-protocol redirect (" + r4.getProtocol() + " to " + r6 + ")");
    L20:
        e = move-exception;
        throw new HttpDataSource$HttpDataSourceException(e, 2001, 1);
    L24:
        throw new HttpDataSource$HttpDataSourceException(2001, "Null location redirect");
    }

    public final HttpURLConnection u(ii0 r17) {
        URL r1 = new URL(r17.a.toString());
        int r2 = r17.c;
        byte[] r3 = r17.d;
        long r4 = r17.f;
        long r6 = r17.g;
        int r12 = 1;
        int r9 = 0;
        if ((r17.i & 1) != 1) goto L5;
        boolean r8 = true;
    L7:
        if (this.r == false) goto L9;
    L10:
        int r13 = r9 + 1;
        if (r9 > 20) goto L42;
        HttpURLConnection r10 = v(r1, r2, r3, r4, r6, r8, false, r17.e);
        int r11 = r10.getResponseCode();
        String r14 = r10.getHeaderField("Location");
        if (r2 == r12) goto L17;
        if (r2 == 3) goto L17;
    L29:
        if (r2 != 2) goto L38;
        if (r11 != 300) goto L33;
    L37:
        r10.disconnect();
        r1 = t(r1, r14);
        r3 = null;
        r2 = 1;
    L40:
        r9 = r13;
        r12 = 1;
        goto L10
    L33:
        if (r11 == 301) goto L37;
        if (r11 == 302) goto L37;
        if (r11 == 303) goto L37;
    L38:
        return r10;
    L17:
        if (r11 != 300) goto L19;
    L39:
        r10.disconnect();
        r1 = t(r1, r14);
        goto L40
    L19:
        if (r11 == 301) goto L39;
        if (r11 == 302) goto L39;
        if (r11 == 303) goto L39;
        if (r11 == 307) goto L39;
        if (r11 != 308) goto L29;
    L42:
        throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException(f34.f(r13, "Too many redirects: ")), 2001, 1);
    L9:
        return v(r1, r2, r3, r4, r6, r8, true, r17.e);
    L5:
        r8 = false;
        goto L7
    }

    public final HttpURLConnection v(URL r4, int r5, byte[] r6, long r7, long r9, boolean r11, boolean r12, Map r13) {
        HttpURLConnection r8 = (HttpURLConnection) r4.openConnection();
        r8.setConnectTimeout(this.s);
        r8.setReadTimeout(this.t);
        HashMap r0 = new HashMap();
        qr2 r1 = this.u;
        if (r1 == null) goto L5;
        r0.putAll(r1.n());
    L5:
        r0.putAll(this.v.n());
        r0.putAll(r13);
        Iterator r3 = r0.entrySet().iterator();
    L7:
        if (r3.hasNext() == false) goto L9;
        Map.Entry r14 = (Map.Entry) r3.next();
        r8.setRequestProperty((String) r14.getKey(), (String) r14.getValue());
        goto L7
    L9:
        Pattern r10 = ir1.a;
        if (r7 == 0) goto L12;
    L14:
        StringBuilder r15 = new StringBuilder("bytes=");
        r15.append(r7);
        r15.append("-");
        if (r9 == (-1)) goto L17;
        r15.append((r7 + r9) - 1);
    L17:
        String r16 = r15.toString();
    L18:
        if (r16 == null) goto L20;
        r8.setRequestProperty("Range", r16);
    L20:
        if (r11 == false) goto L22;
        String r17 = "gzip";
    L23:
        r8.setRequestProperty("Accept-Encoding", r17);
        r8.setInstanceFollowRedirects(r12);
        if (r6 == null) goto L26;
        boolean r18 = true;
    L27:
        r8.setDoOutput(r18);
        int r19 = ii0.j;
        if (r5 != 1) goto L30;
        String r20 = "GET";
    L38:
        r8.setRequestMethod(r20);
        if (r6 == null) goto L42;
        r8.setFixedLengthStreamingMode(r6.length);
        r8.connect();
        OutputStream r21 = r8.getOutputStream();
        r21.write(r6);
        r21.close();
        return r8;
    L42:
        r8.connect();
        return r8;
    L30:
        if (r5 != 2) goto L32;
        r20 = "POST";
        goto L38
    L32:
        if (r5 != 3) goto L34;
        r20 = "HEAD";
        goto L38
    L34:
        tb4.a();
        return null;
    L26:
        r18 = false;
        goto L27
    L22:
        r17 = "identity";
        goto L23
    L12:
        if (r9 != (-1)) goto L14;
        r16 = null;
        goto L18
    }

    public final void w(long r7) {
        if (r7 == 0) goto L17;
        byte[] r2 = new byte[4096];
    L7:
        if (r7 <= 0) goto L21;
        int r3 = (int) Math.min(r7, 4096);
        InputStream r4 = this.y;
        String r5 = f35.a;
        int r6 = r4.read(r2, 0, r3);
        if (Thread.currentThread().isInterrupted() == true) goto L16;
        if (r6 == (-1)) goto L14;
        r7 = r7 - ((long) r6);
        o(r6);
        goto L7
    L14:
        throw new HttpDataSource$HttpDataSourceException();
    L16:
        throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), 2000, 1);
    L21:
        return;
    }
}
