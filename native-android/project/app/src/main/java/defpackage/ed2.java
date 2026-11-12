package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ed2 {
    public static final AtomicLong g = new AtomicLong();
    public final ii0 a;
    public final Uri b;
    public final Map c;
    public final long d;
    public final long e;
    public final long f;

    public ed2(ii0 ii0Var, Uri uri, Map map, long j, long j2, long j3) {
        this.a = ii0Var;
        this.b = uri;
        this.c = map;
        this.d = j;
        this.e = j2;
        this.f = j3;
    }

    public ed2(long j, ii0 ii0Var) {
        this(ii0Var, ii0Var.a, Collections.EMPTY_MAP, j, 0L, 0L);
    }
}
