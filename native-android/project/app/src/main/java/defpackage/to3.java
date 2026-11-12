package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class to3 implements ro3, Serializable {
    @Override // defpackage.ro3
    public final boolean apply(Object obj) {
        return Object.class.equals(obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof to3) {
            return Object.class.equals(Object.class);
        }
        return false;
    }

    public final int hashCode() {
        return Object.class.hashCode();
    }

    public final String toString() {
        return "Predicates.equalTo(" + Object.class + ")";
    }
}
