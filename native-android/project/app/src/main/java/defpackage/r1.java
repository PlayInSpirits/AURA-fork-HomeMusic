package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r1 implements Map.Entry {
    public r1() {
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object r4) {
        if ((r4 instanceof Map.Entry) == false) goto L10;
        Map.Entry r5 = (Map.Entry) r4;
        if (si0.s(getKey(), r5.getKey()) == false) goto L10;
        if (si0.s(getValue(), r5.getValue()) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object r0 = getKey();
        Object r2 = getValue();
        int r1 = 0;
        if (r0 != null) goto L5;
        int r3 = 0;
    L6:
        if (r2 == null) goto L10;
        r1 = r2.hashCode();
    L10:
        return r3 ^ r1;
    L5:
        r3 = r0.hashCode();
        goto L6
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object r1) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
