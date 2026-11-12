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
    public final long b(ii0 ii0Var) throws ParserException, DataSourceException {
        q(ii0Var);
        this.r = ii0Var;
        Uri uri = ii0Var.a;
        long j = ii0Var.g;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        rr2.o("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = f35.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.s = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw new ParserException(xa3.g("Error while parsing Base64 encoded string: ", str2), e, true, 0);
            }
        } else {
            this.s = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = ii0Var.f;
        byte[] bArr = this.s;
        if (j2 > bArr.length) {
            this.s = null;
            throw new DataSourceException(2008);
        }
        int i = (int) j2;
        this.t = i;
        int length = bArr.length - i;
        this.u = length;
        if (j != -1) {
            this.u = (int) Math.min(length, j);
        }
        r(ii0Var);
        return j != -1 ? j : this.u;
    }

    @Override // defpackage.ci0
    public final void close() {
        if (this.s != null) {
            this.s = null;
            p();
        }
        this.r = null;
    }

    @Override // defpackage.ci0
    public final Uri m() {
        ii0 ii0Var = this.r;
        if (ii0Var != null) {
            return ii0Var.a;
        }
        return null;
    }

    @Override // defpackage.wh0
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.u;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.s;
        String str = f35.a;
        System.arraycopy(bArr2, this.t, bArr, i, iMin);
        this.t += iMin;
        this.u -= iMin;
        o(iMin);
        return iMin;
    }
}
