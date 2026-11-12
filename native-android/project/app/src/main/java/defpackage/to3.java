package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class to3 implements ro3, Serializable {
    @Override // defpackage.ro3
    public final boolean apply(Object r1) {
        return Object.class.equals(r1);
    }

    public final boolean equals(Object r1) {
        if ((r1 instanceof to3) == true) goto L5;
        return false;
    L5:
        return Object.class.equals(Object.class);
    }

    public final int hashCode() {
        return Object.class.hashCode();
    }

    public final String toString() {
        return "Predicates.equalTo(" + Object.class + ")";
    }
}
