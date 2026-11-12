package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nn1 implements pv2 {
    public final String a;
    public final String b;
    public final List c;

    public nn1(String r1, String r2, List r3) {
        this.a = r1;
        this.b = r2;
        this.c = Collections.unmodifiableList(new ArrayList(r3));
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L17:
        return false;
    L8:
        if (nn1.class != r5.getClass()) goto L17;
        nn1 r6 = (nn1) r5;
        if (TextUtils.equals(this.a, r6.a) == false) goto L17;
        if (TextUtils.equals(this.b, r6.b) == false) goto L17;
        if (this.c.equals(r6.c) == false) goto L17;
        return true;
    }

    public final int hashCode() {
        int r0 = 0;
        String r1 = this.a;
        if (r1 == null) goto L5;
        int r2 = r1.hashCode();
    L6:
        int r3 = r2 * 31;
        String r4 = this.b;
        if (r4 == null) goto L10;
        r0 = r4.hashCode();
    L10:
        return this.c.hashCode() + ((r3 + r0) * 31);
    L5:
        r2 = 0;
        goto L6
    }

    public final String toString() {
        String r0 = this.a;
        if (r0 == null) goto L5;
        String r3 = b11.q(xa3.j(" [", r0, ", "), this.b, "]");
    L7:
        return "HlsTrackMetadataEntry".concat(r3);
    L5:
        r3 = "";
        goto L7
    }
}
