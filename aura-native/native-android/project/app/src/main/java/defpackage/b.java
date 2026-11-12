package defpackage;

/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

public final class b
implements ParameterizedType,
Serializable {
    public final int n;
    public final Type o;
    public final Object p;
    public final Serializable q;

    public b(Type type2, Class clazz, Type[] typeArray) {
        boolean bl5 = true;
        this.n = 1;
        clazz.getClass();
        if (typeArray.length != clazz.getTypeParameters().length) {
            bl5 = false;
        }
        rr2.l(bl5);
        b15.b(typeArray, "type parameter");
        this.o = type2;
        this.q = clazz;
        this.p = x05.p.c(typeArray);
    }

    public b(Type object, Type type2, Type[] typeArray) {
        int n16;
        int n17 = 0;
        this.n = 0;
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class clazz = (Class)type2;
            boolean bl5 = Modifier.isStatic(clazz.getModifiers());
            boolean bl6 = true;
            n16 = !bl5 && clazz.getEnclosingClass() != null ? 0 : 1;
            bl5 = bl6;
            if (object == null) {
                bl5 = n16 != 0 ? bl6 : false;
            }
            vr1.d(bl5);
        }
        object = object == null ? null : gb.h((Type)object);
        this.o = object;
        this.p = gb.h(type2);
        this.q = object = (Type[])typeArray.clone();
        int n18 = ((Type[])object).length;
        for (n16 = n17; n16 < n18; ++n16) {
            Objects.requireNonNull(((Type[])this.q)[n16]);
            gb.i(((Type[])this.q)[n16]);
            object = (Type[])this.q;
            object[n16] = gb.h(object[n16]);
        }
    }

    public final boolean equals(Object object) {
        int n16 = this.n;
        boolean bl5 = true;
        boolean bl6 = true;
        switch (n16) {
            default: {
                if (!(object instanceof ParameterizedType && ((Class)this.q).equals((object = (ParameterizedType)object).getRawType()) && si0.s(this.o, object.getOwnerType()) && Arrays.equals((Type[])((gy3)this.p).toArray(new Type[0]), object.getActualTypeArguments()))) {
                    bl6 = false;
                }
                return bl6;
            }
            case 0: 
        }
        bl6 = object instanceof ParameterizedType && gb.v(this, (ParameterizedType)object) ? bl5 : false;
        return bl6;
    }

    @Override
    public final Type[] getActualTypeArguments() {
        switch (this.n) {
            default: {
                return (Type[])((gy3)this.p).toArray(new Type[0]);
            }
            case 0: 
        }
        return (Type[])((Type[])this.q).clone();
    }

    @Override
    public final Type getOwnerType() {
        switch (this.n) {
            default: {
                return this.o;
            }
            case 0: 
        }
        return this.o;
    }

    @Override
    public final Type getRawType() {
        switch (this.n) {
            default: {
                return (Class)this.q;
            }
            case 0: 
        }
        return (Type)this.p;
    }

    public final int hashCode() {
        int n16 = this.n;
        Serializable serializable = this.q;
        Object object = this.p;
        int n17 = 0;
        int n18 = 0;
        Type type2 = this.o;
        switch (n16) {
            default: {
                n17 = type2 == null ? n18 : type2.hashCode();
                return ((gy3)object).hashCode() ^ n17 ^ ((Class)serializable).hashCode();
            }
            case 0: 
        }
        n18 = Arrays.hashCode((Type[])serializable);
        n16 = ((Type)object).hashCode();
        if (type2 != null) {
            n17 = type2.hashCode();
        }
        return n18 ^ n16 ^ n17;
    }

    public final String toString() {
        int n16 = this.n;
        Object object = this.p;
        Object object2 = this.q;
        switch (n16) {
            default: {
                Object object3;
                StringBuilder stringBuilder = new StringBuilder();
                Type type2 = this.o;
                if (type2 != null) {
                    object3 = x05.p;
                    ((Object)object3).getClass();
                    if (!(object3 instanceof v05)) {
                        stringBuilder.append(object3.b(type2));
                        stringBuilder.append('.');
                    }
                }
                stringBuilder.append(((Class)object2).getName());
                stringBuilder.append('<');
                object2 = b15.a;
                object = (gy3)object;
                object3 = x05.p;
                Objects.requireNonNull(object3);
                object3 = new ss2(23, object3);
                object.getClass();
                stringBuilder.append(((uc0)object2).b(new g22((Iterable)object, object3, 1)));
                stringBuilder.append('>');
                return stringBuilder.toString();
            }
            case 0: 
        }
        Object object4 = (Type)object;
        object2 = (Type[])object2;
        n16 = ((Type[])object2).length;
        if (n16 == 0) {
            object4 = gb.e0((Type)object4);
        } else {
            object = new StringBuilder((n16 + 1) * 30);
            ((StringBuilder)object).append(gb.e0((Type)object4));
            ((StringBuilder)object).append("<");
            ((StringBuilder)object).append(gb.e0(object2[0]));
            for (int i16 = 1; i16 < n16; ++i16) {
                ((StringBuilder)object).append(", ");
                ((StringBuilder)object).append(gb.e0((Type)object2[i16]));
            }
            ((StringBuilder)object).append(">");
            object4 = ((StringBuilder)object).toString();
        }
        return object4;
    }
}

