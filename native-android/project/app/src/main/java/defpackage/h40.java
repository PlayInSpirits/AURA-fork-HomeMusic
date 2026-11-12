package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h40 {
    public static final h40 b = null;
    public final Map a;

    static {
        b = new h40(new HashMap());
    }

    public h40(HashMap r1) {
        this.a = Collections.unmodifiableMap(r1);
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof h40) == true) goto L10;
        return false;
    L10:
        return this.a.equals(((h40) r2).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
