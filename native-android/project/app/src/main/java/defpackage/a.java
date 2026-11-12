package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements GenericArrayType, Serializable {
    public final /* synthetic */ int n;
    public final Type o;

    public a(int i, Type type) {
        this.n = i;
        switch (i) {
            case 1:
                this.o = x05.p.d(type);
                break;
            default:
                Objects.requireNonNull(type);
                this.o = gb.h(type);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.n) {
            case 0:
                return (obj instanceof GenericArrayType) && gb.v(this, (GenericArrayType) obj);
            default:
                if (obj instanceof GenericArrayType) {
                    return si0.s(this.o, ((GenericArrayType) obj).getGenericComponentType());
                }
                return false;
        }
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        switch (this.n) {
            case 0:
                break;
        }
        return this.o;
    }

    public final int hashCode() {
        switch (this.n) {
            case 0:
                break;
        }
        return this.o.hashCode();
    }

    public final String toString() {
        int i = this.n;
        Type type = this.o;
        switch (i) {
            case 0:
                return gb.e0(type) + "[]";
            default:
                StringBuilder sb = new StringBuilder();
                c32 c32Var = b15.a;
                return b11.q(sb, type instanceof Class ? ((Class) type).getName() : type.toString(), "[]");
        }
    }
}
