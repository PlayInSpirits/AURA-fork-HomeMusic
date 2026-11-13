package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class h40 {
    public static final h40 b = new h40(new HashMap());
    public final Map a;

    public h40(HashMap hashMap) {
        this.a = Collections.unmodifiableMap(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h40) {
            return this.a.equals(((h40) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
