package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
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

    public ii0(Uri uri, long j2, int i, byte[] bArr, Map map, long j3, long j4, String str, int i2) {
        rr2.l(j2 + j3 >= 0);
        rr2.l(j3 >= 0);
        rr2.l(j4 > 0 || j4 == -1);
        uri.getClass();
        this.a = uri;
        this.b = j2;
        this.c = i;
        this.d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j3;
        this.g = j4;
        this.h = str;
        this.i = i2;
    }

    public final hi0 a() {
        hi0 hi0Var = new hi0();
        hi0Var.a = this.a;
        hi0Var.b = this.b;
        hi0Var.c = this.c;
        hi0Var.d = this.d;
        hi0Var.e = this.e;
        hi0Var.f = this.f;
        hi0Var.g = this.g;
        hi0Var.h = this.h;
        hi0Var.i = this.i;
        return hi0Var;
    }

    public final ii0 b(long j2, long j3) {
        if (j2 == 0 && this.g == j3) {
            return this;
        }
        return new ii0(this.a, this.b, this.c, this.d, this.e, this.f + j2, j3, this.h, this.i);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i = this.c;
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
        sb.append(str);
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return f34.i(sb, this.i, "]");
    }

    public ii0(Uri uri, long j2, long j3) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j2, j3, null, 0);
    }
}
