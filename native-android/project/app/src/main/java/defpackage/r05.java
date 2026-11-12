package defpackage;

import java.lang.reflect.ParameterizedType;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract enum r05 extends Enum {
    public static final r05 n = null;
    public static final /* synthetic */ r05[] o = null;

    static {
        int r3 = 0;
        o = new r05[]{new o05(), new p05()};
        ParameterizedType r1 = (ParameterizedType) q05.class.getGenericSuperclass();
        Objects.requireNonNull(r1);
        r05[] r2 = values();
        int r4 = r2.length;
    L3:
        if (r3 >= r4) goto L10;
        r05 r5 = r2[r3];
        if (r5.a(q05.class) == r1.getOwnerType()) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        n = r5;
        return;
    L10:
        throw new AssertionError();
    }

    public static r05 valueOf(String r1) {
        return (r05) Enum.valueOf(r05.class, r1);
    }

    public static r05[] values() {
        return (r05[]) o.clone();
    }

    public abstract Class a(Class r1);
}
