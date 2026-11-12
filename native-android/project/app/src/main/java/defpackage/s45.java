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

    public s45(oi r1, oi r2, oi r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public abstract t45 a();

    public final Class b(Class r4) {
        String r0 = r4.getName();
        oi r3 = this.c;
        Class r1 = (Class) r3.get(r0);
        if (r1 != null) goto L6;
        Class<?> r2 = Class.forName(r4.getPackage().getName() + "." + r4.getSimpleName() + "Parcelizer", false, r4.getClassLoader());
        r3.put(r4.getName(), r2);
        return r2;
    L6:
        return r1;
    }

    public final Method c(String r4) {
        oi r3 = this.a;
        Method r0 = (Method) r3.get(r4);
        if (r0 != null) goto L6;
        System.currentTimeMillis();
        Method r1 = Class.forName(r4, true, s45.class.getClassLoader()).getDeclaredMethod("read", new Class[]{s45.class});
        r3.put(r4, r1);
        return r1;
    L6:
        return r0;
    }

    public final Method d(Class r4) {
        String r0 = r4.getName();
        oi r1 = this.b;
        Method r2 = (Method) r1.get(r0);
        if (r2 != null) goto L6;
        Class r3 = b(r4);
        System.currentTimeMillis();
        Method r5 = r3.getDeclaredMethod("write", new Class[]{r4, s45.class});
        r1.put(r4.getName(), r5);
        return r5;
    L6:
        return r2;
    }

    public abstract boolean e(int r1);

    public final int f(int r1, int r2) {
        if (e(r2) == true) goto L6;
        return r1;
    L6:
        return ((t45) this).e.readInt();
    }

    public final Parcelable g(Parcelable r1, int r2) {
        if (e(r2) == true) goto L5;
        return r1;
    L5:
        ClassLoader r3 = t45.class.getClassLoader();
        return ((t45) this).e.readParcelable(r3);
    }

    public final u45 h() {
        String r0 = ((t45) this).e.readString();
        if (r0 != null) goto L5;
        return null;
    L5:
        t45 r2 = a();
        return (u45) c(r0).invoke(null, new Object[]{r2});
    L8:
        e = move-exception;
        nz2.s("VersionedParcel encountered ClassNotFoundException", e);
        return null;
    L14:
        e = move-exception;
        nz2.s("VersionedParcel encountered IllegalAccessException", e);
        return null;
    L10:
        e = move-exception;
        nz2.s("VersionedParcel encountered NoSuchMethodException", e);
        return null;
    L12:
        e = move-exception;
        if ((e.getCause() instanceof RuntimeException) == true) goto L25;
        nz2.s("VersionedParcel encountered InvocationTargetException", e);
        return null;
    L25:
        throw ((RuntimeException) e.getCause());
    }

    public abstract void i(int r1);

    public final void j(int r1, int r2) {
        i(r2);
        ((t45) this).e.writeInt(r1);
    }

    public final void k(Parcelable r1, int r2) {
        i(r2);
        ((t45) this).e.writeParcelable(r1, 0);
    }

    public final void l(u45 r4) {
        if (r4 != null) goto L32;
        ((t45) this).e.writeString(null);
        return;
    L32:
        String r1 = b(r4.getClass()).getName();
        ((t45) this).e.writeString(r1);
        t45 r2 = a();
        d(r4.getClass()).invoke(null, new Object[]{r4, r2});     // Catch: ClassNotFoundException -> L13 NoSuchMethodException -> L16 InvocationTargetException -> L19 IllegalAccessException -> L26
        Parcel r3 = r2.e;
        int r5 = r2.i;
        if (r5 < 0) goto L36;
        int r6 = r2.d.get(r5);
        int r0 = r3.dataPosition();
        r3.setDataPosition(r6);
        r3.writeInt(r0 - r6);
        r3.setDataPosition(r0);
        return;
    L36:
        return;
    L13:
        e = move-exception;
        nz2.s("VersionedParcel encountered ClassNotFoundException", e);
        return;
    L26:
        e = move-exception;
        nz2.s("VersionedParcel encountered IllegalAccessException", e);
        return;
    L16:
        e = move-exception;
        nz2.s("VersionedParcel encountered NoSuchMethodException", e);
        return;
    L19:
        e = move-exception;
        if ((e.getCause() instanceof RuntimeException) == true) goto L25;
        nz2.s("VersionedParcel encountered InvocationTargetException", e);
        return;
    L25:
        throw ((RuntimeException) e.getCause());
    L29:
        e = move-exception;
        nz2.s(r4.getClass().getSimpleName().concat(" does not have a Parcelizer"), e);
    }
}
