package defpackage;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pa1 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final String f;
    public final String g;

    public pa1(String r1, List r2, String r3, String r4, String r5, String r6) {
        r1.getClass();
        this.a = r1;
        r3.getClass();
        this.b = r3;
        this.c = r4;
        r2.getClass();
        this.d = r2;
        this.e = r5;
        this.f = r6;
        this.g = r1 + "-" + r3 + "-" + r4 + "-" + r5 + "-" + r6;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mSystemFont: " + this.e + ", mVariationSettings: " + this.f + ", mCertificates:");
        int r2 = 0;
    L3:
        List r3 = this.d;
        if (r2 >= r3.size()) goto L10;
        r0.append(" [");
        List r4 = (List) r3.get(r2);
        int r5 = 0;
    L7:
        if (r5 >= r4.size()) goto L9;
        r0.append(" \"");
        r0.append(Base64.encodeToString((byte[]) r4.get(r5), 0));
        r0.append("\"");
        r5 = r5 + 1;
        goto L7
    L9:
        r0.append(" ]");
        r2 = r2 + 1;
        goto L3
    L10:
        r0.append("}mCertificatesArray: 0");
        return r0.toString();
    }
}
