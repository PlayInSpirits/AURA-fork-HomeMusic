package defpackage;

import com.google.common.reflect.TypeToken;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vz4 {
    public final Type[] a;
    public final boolean b;

    public vz4(Type[] r1, boolean r2) {
        this.a = r1;
        this.b = r2;
    }

    public final boolean a(Type r6) {
        Type[] r0 = this.a;
        int r1 = r0.length;
        int r2 = 0;
    L3:
        boolean r3 = this.b;
        if (r2 >= r1) goto L10;
        if (TypeToken.of(r0[r2]).isSubtypeOf(r6) == r3) goto L7;
        r2 = r2 + 1;
        goto L3
    L7:
        return r3;
    L10:
        return !r3;
    }
}
