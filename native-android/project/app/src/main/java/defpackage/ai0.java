package defpackage;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ai0 extends kp {
    public ii0 r;
    public byte[] s;
    public int t;
    public int u;

    @Override // defpackage.ci0
    public final long b(ii0 r10) {
        q(r10);
        this.r = r10;
        Uri r0 = r10.a;
        long r1 = r10.g;
        Uri r2 = r0.normalizeScheme();
        String r3 = r2.getScheme();
        rr2.o("data".equals(r3), "Unsupported scheme: %s", r3);
        String r4 = r2.getSchemeSpecificPart();
        String r5 = f35.a;
        String[] r6 = r4.split(",", -1);
        if (r6.length != 2) goto L25;
        String r7 = r6[1];
        if (r6[0].contains(";base64") == true) goto L26;
        this.s = URLDecoder.decode(r7, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
    L12:
        long r8 = r10.f;
        byte[] r9 = this.s;
        if (r8 > r9.length) goto L22;
        int r11 = (int) r8;
        this.t = r11;
        int r12 = r9.length - r11;
        this.u = r12;
        if (r1 == (-1)) goto L17;
        this.u = (int) Math.min(r12, r1);
    L17:
        r(r10);
        if (r1 == (-1)) goto L21;
        return r1;
    L21:
        return this.u;
    L22:
        this.s = null;
        throw new DataSourceException(2008);
    L26:
        this.s = Base64.decode(r7, 0);     // Catch: IllegalArgumentException -> L8
    L8:
        e = move-exception;
        throw new ParserException(xa3.g("Error while parsing Base64 encoded string: ", r7), e, true, 0);
    L25:
        throw new ParserException("Unexpected URI format: " + r2, null, true, 0);
    }

    @Override // defpackage.ci0
    public final void close() {
        if (this.s == null) goto L5;
        this.s = null;
        p();
    L5:
        this.r = null;
    }

    @Override // defpackage.ci0
    public final Uri m() {
        ii0 r0 = this.r;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.a;
    }

    @Override // defpackage.wh0
    public final int read(byte[] r3, int r4, int r5) {
        if (r5 != 0) goto L5;
        return 0;
    L5:
        int r0 = this.u;
        if (r0 != 0) goto L9;
        return -1;
    L9:
        int r6 = Math.min(r5, r0);
        byte[] r1 = this.s;
        String r2 = f35.a;
        System.arraycopy(r1, this.t, r3, r4, r6);
        this.t += r6;
        this.u -= r6;
        o(r6);
        return r6;
    }
}
