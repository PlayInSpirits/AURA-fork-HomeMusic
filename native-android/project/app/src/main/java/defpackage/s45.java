package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s45 {
    public final oi a;
    public final oi b;
    public final oi c;

    public s45(oi oiVar, oi oiVar2, oi oiVar3) {
        this.a = oiVar;
        this.b = oiVar2;
        this.c = oiVar3;
    }

    public abstract t45 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        oi oiVar = this.c;
        Class cls2 = (Class) oiVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        oiVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        oi oiVar = this.a;
        Method method = (Method) oiVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, s45.class.getClassLoader()).getDeclaredMethod("read", s45.class);
        oiVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        oi oiVar = this.b;
        Method method = (Method) oiVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, s45.class);
        oiVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((t45) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((t45) this).e.readParcelable(t45.class.getClassLoader());
    }

    public final u45 h() {
        String string = ((t45) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (u45) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            nz2.s("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            nz2.s("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            nz2.s("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            nz2.s("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((t45) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((t45) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(u45 u45Var) {
        if (u45Var == null) {
            ((t45) this).e.writeString(null);
            return;
        }
        try {
            ((t45) this).e.writeString(b(u45Var.getClass()).getName());
            t45 t45VarA = a();
            try {
                d(u45Var.getClass()).invoke(null, u45Var, t45VarA);
                Parcel parcel = t45VarA.e;
                int i = t45VarA.i;
                if (i >= 0) {
                    int i2 = t45VarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                nz2.s("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                nz2.s("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                nz2.s("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                nz2.s("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            nz2.s(u45Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
