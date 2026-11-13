package defpackage;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class pz4 {
    public final TypeVariable a;

    public pz4(TypeVariable typeVariable) {
        typeVariable.getClass();
        this.a = typeVariable;
    }

    public final boolean a(TypeVariable typeVariable) {
        TypeVariable typeVariable2 = this.a;
        return typeVariable2.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && typeVariable2.getName().equals(typeVariable.getName());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pz4) {
            return a(((pz4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        TypeVariable typeVariable = this.a;
        return Arrays.hashCode(new Object[]{typeVariable.getGenericDeclaration(), typeVariable.getName()});
    }

    public final String toString() {
        return this.a.toString();
    }
}
