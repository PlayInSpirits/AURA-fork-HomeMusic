package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ed2 {
    public static final AtomicLong g = null;
    public final ii0 a;
    public final Uri b;
    public final Map c;
    public final long d;
    public final long e;
    public final long f;

    static {
        g = new AtomicLong();
    }

    public ed2(ii0 r1, Uri r2, Map r3, long r4, long r6, long r8) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r6;
        this.f = r8;
    }

    public ed2(long r11, ii0 r13) {
        this(r13, r13.a, Collections.EMPTY_MAP, r11, 0, 0);
    }
}
