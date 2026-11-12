package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ii0 {
    public static final /* synthetic */ int j = 0;
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    static {
        hn2.a("media3.datasource");
    }

    public ii0(Uri r10, long r11, int r13, byte[] r14, Map r15, long r16, long r18, String r20, int r21) {
        boolean r5 = false;
        if ((r11 + r16) < 0) goto L5;
        boolean r4 = true;
    L6:
        rr2.l(r4);
        if (r16 < 0) goto L9;
        boolean r6 = true;
    L10:
        rr2.l(r6);
        if (r18 <= 0) goto L13;
    L14:
        r5 = true;
    L15:
        rr2.l(r5);
        r10.getClass();
        this.a = r10;
        this.b = r11;
        this.c = r13;
        if (r14 != null) goto L18;
    L20:
        byte[] r12 = null;
    L21:
        this.d = r12;
        this.e = Collections.unmodifiableMap(new HashMap(r15));
        this.f = r16;
        this.g = r18;
        this.h = r20;
        this.i = r21;
        return;
    L18:
        if (r14.length == 0) goto L20;
        r12 = r14;
        goto L21
    L13:
        if (r18 != (-1)) goto L15;
    L9:
        r6 = false;
        goto L10
    L5:
        r4 = false;
        goto L6
    }

    public final hi0 a() {
        hi0 r0 = new hi0();
        r0.a = this.a;
        r0.b = this.b;
        r0.c = this.c;
        r0.d = this.d;
        r0.e = this.e;
        r0.f = this.f;
        r0.g = this.g;
        r0.h = this.h;
        r0.i = this.i;
        return r0;
    }

    public final ii0 b(long r15, long r17) {
        if (r15 == 0) goto L5;
    L7:
        long r8 = this.f + r15;
        String r12 = this.h;
        int r13 = this.i;
        return new ii0(this.a, this.b, this.c, this.d, this.e, r8, r17, r12, r13);
    L5:
        if (this.g != r17) goto L7;
        return this;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("DataSpec[");
        int r2 = this.c;
        if (r2 != 1) goto L5;
        String r1 = "GET";
    L13:
        r0.append(r1);
        r0.append(" ");
        r0.append(this.a);
        r0.append(", ");
        r0.append(this.f);
        r0.append(", ");
        r0.append(this.g);
        r0.append(", ");
        r0.append(this.h);
        r0.append(", ");
        return f34.i(r0, this.i, "]");
    L5:
        if (r2 != 2) goto L7;
        r1 = "POST";
        goto L13
    L7:
        if (r2 != 3) goto L9;
        r1 = "HEAD";
        goto L13
    L9:
        tb4.a();
        return null;
    }

    public ii0(Uri r14, long r15, long r17) {
        this(r14, 0, 1, null, Collections.EMPTY_MAP, r15, r17, null, 0);
    }
}
