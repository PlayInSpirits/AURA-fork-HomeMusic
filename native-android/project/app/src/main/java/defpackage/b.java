package defpackage;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ParameterizedType, Serializable {
    public final /* synthetic */ int n = 1;
    public final Type o;
    public final Object p;
    public final Serializable q;

    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.Serializable, java.lang.reflect.Type[]] */
    public b(Type type, Type type2, Type[] typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z = true;
            boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z2) {
                z = false;
            }
            vr1.d(z);
        }
        this.o = type == null ? null : gb.h(type);
        this.p = gb.h(type2);
        ?? r5 = (Type[]) typeArr.clone();
        this.q = r5;
        int length = r5.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(((Type[]) this.q)[i]);
            gb.i(((Type[]) this.q)[i]);
            Type[] typeArr2 = (Type[]) this.q;
            typeArr2[i] = gb.h(typeArr2[i]);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.n) {
            case 0:
                return (obj instanceof ParameterizedType) && gb.v(this, (ParameterizedType) obj);
            default:
                if (obj instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) obj;
                    if (((Class) this.q).equals(parameterizedType.getRawType()) && si0.s(this.o, parameterizedType.getOwnerType()) && Arrays.equals((Type[]) ((gy3) this.p).toArray(new Type[0]), parameterizedType.getActualTypeArguments())) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        switch (this.n) {
            case 0:
                return (Type[]) ((Type[]) this.q).clone();
            default:
                return (Type[]) ((gy3) this.p).toArray(new Type[0]);
        }
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        switch (this.n) {
            case 0:
                break;
        }
        return this.o;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        switch (this.n) {
            case 0:
                return (Type) this.p;
            default:
                return (Class) this.q;
        }
    }

    public final int hashCode() {
        int i = this.n;
        Object obj = this.q;
        Object obj2 = this.p;
        Type type = this.o;
        switch (i) {
            case 0:
                return (Arrays.hashCode((Type[]) obj) ^ ((Type) obj2).hashCode()) ^ (type != null ? type.hashCode() : 0);
            default:
                return (((gy3) obj2).hashCode() ^ (type != null ? type.hashCode() : 0)) ^ ((Class) obj).hashCode();
        }
    }

    public final String toString() {
        int i = this.n;
        int i2 = 1;
        Object obj = this.p;
        Object obj2 = this.q;
        switch (i) {
            case 0:
                Type type = (Type) obj;
                Type[] typeArr = (Type[]) obj2;
                int length = typeArr.length;
                if (length == 0) {
                    return gb.e0(type);
                }
                StringBuilder sb = new StringBuilder((length + 1) * 30);
                sb.append(gb.e0(type));
                sb.append("<");
                sb.append(gb.e0(typeArr[0]));
                while (i2 < length) {
                    sb.append(", ");
                    sb.append(gb.e0(typeArr[i2]));
                    i2++;
                }
                sb.append(">");
                return sb.toString();
            default:
                StringBuilder sb2 = new StringBuilder();
                Type type2 = this.o;
                if (type2 != null) {
                    x05 x05Var = x05.p;
                    x05Var.getClass();
                    if (!(x05Var instanceof v05)) {
                        sb2.append(x05Var.b(type2));
                        sb2.append('.');
                    }
                }
                sb2.append(((Class) obj2).getName());
                sb2.append('<');
                c32 c32Var = b15.a;
                gy3 gy3Var = (gy3) obj;
                x05 x05Var2 = x05.p;
                Objects.requireNonNull(x05Var2);
                ss2 ss2Var = new ss2(23, x05Var2);
                gy3Var.getClass();
                sb2.append(c32Var.b(new g22(gy3Var, ss2Var, i2)));
                sb2.append('>');
                return sb2.toString();
        }
    }

    public b(Type type, Class cls, Type[] typeArr) {
        cls.getClass();
        rr2.l(typeArr.length == cls.getTypeParameters().length);
        b15.b(typeArr, "type parameter");
        this.o = type;
        this.q = cls;
        this.p = x05.p.c(typeArr);
    }
}
