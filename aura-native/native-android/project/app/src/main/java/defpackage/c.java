package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements WildcardType, Serializable {
    public final /* synthetic */ int n;
    public final Object o;
    public final Object p;

    public c(Type[] typeArr, Type[] typeArr2, int i) {
        this.n = i;
        switch (i) {
            case 1:
                b15.b(typeArr, "lower bound for wildcard");
                b15.b(typeArr2, "upper bound for wildcard");
                x05 x05Var = x05.p;
                this.o = x05Var.c(typeArr);
                this.p = x05Var.c(typeArr2);
                break;
            default:
                vr1.d(typeArr2.length <= 1);
                vr1.d(typeArr.length == 1);
                if (typeArr2.length != 1) {
                    Objects.requireNonNull(typeArr[0]);
                    gb.i(typeArr[0]);
                    this.p = null;
                    this.o = gb.h(typeArr[0]);
                } else {
                    Objects.requireNonNull(typeArr2[0]);
                    gb.i(typeArr2[0]);
                    vr1.d(typeArr[0] == Object.class);
                    this.p = gb.h(typeArr2[0]);
                    this.o = Object.class;
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.n) {
            case 0:
                return (obj instanceof WildcardType) && gb.v(this, (WildcardType) obj);
            default:
                if (obj instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) obj;
                    if (((gy3) this.o).equals(Arrays.asList(wildcardType.getLowerBounds())) && ((gy3) this.p).equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        switch (this.n) {
            case 0:
                Type type = (Type) this.p;
                return type != null ? new Type[]{type} : gb.a;
            default:
                gy3 gy3Var = (gy3) this.o;
                c32 c32Var = b15.a;
                return (Type[]) gy3Var.toArray(new Type[0]);
        }
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        switch (this.n) {
            case 0:
                return new Type[]{(Type) this.o};
            default:
                gy3 gy3Var = (gy3) this.p;
                c32 c32Var = b15.a;
                return (Type[]) gy3Var.toArray(new Type[0]);
        }
    }

    public final int hashCode() {
        int i = this.n;
        Object obj = this.p;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                Type type = (Type) obj;
                return (((Type) obj2).hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
            default:
                return ((gy3) obj2).hashCode() ^ ((gy3) obj).hashCode();
        }
    }

    public final String toString() {
        int i = this.n;
        Object obj = this.p;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                Type type = (Type) obj2;
                Type type2 = (Type) obj;
                if (type2 != null) {
                    return "? super " + gb.e0(type2);
                }
                if (type == Object.class) {
                    return "?";
                }
                return "? extends " + gb.e0(type);
            default:
                StringBuilder sb = new StringBuilder("?");
                vw1 vw1VarListIterator = ((gy3) obj2).listIterator(0);
                while (vw1VarListIterator.hasNext()) {
                    Type type3 = (Type) vw1VarListIterator.next();
                    sb.append(" super ");
                    sb.append(x05.p.b(type3));
                }
                gy3 gy3Var = (gy3) obj;
                c32 c32Var = b15.a;
                uo3 uo3Var = new uo3(new to3());
                gy3Var.getClass();
                Iterator<E> it = gy3Var.iterator();
                it.getClass();
                h22 h22Var = new h22(it, uo3Var);
                while (h22Var.hasNext()) {
                    Type type4 = (Type) h22Var.next();
                    sb.append(" extends ");
                    sb.append(x05.p.b(type4));
                }
                return sb.toString();
        }
    }
}
