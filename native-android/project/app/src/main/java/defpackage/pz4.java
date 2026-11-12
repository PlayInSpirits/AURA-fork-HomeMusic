package defpackage;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pz4 {
    public final TypeVariable a;

    public pz4(TypeVariable r1) {
        r1.getClass();
        this.a = r1;
    }

    public final boolean a(TypeVariable r3) {
        TypeVariable r2 = this.a;
        if (r2.getGenericDeclaration().equals(r3.getGenericDeclaration()) == true) goto L5;
        return false;
    L5:
        if (r2.getName().equals(r3.getName()) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof pz4) == true) goto L5;
        return false;
    L5:
        return a(((pz4) r2).a);
    }

    public final int hashCode() {
        TypeVariable r1 = this.a;
        return Arrays.hashCode(new Object[]{r1.getGenericDeclaration(), r1.getName()});
    }

    public final String toString() {
        return this.a.toString();
    }
}
