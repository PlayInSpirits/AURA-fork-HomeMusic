package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a75 extends c75 {
    public static a75 c;
    public static final z45 d = null;
    public final Application b;

    static {
        d = new z45(2);
    }

    public a75(Application r1) {
        this.b = r1;
    }

    @Override // defpackage.c75, defpackage.b75
    public final x65 a(Class r2) {
        Application r0 = this.b;
        if (r0 != null) goto L5;
        er1.l("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    L5:
        return d(r2, r0);
    }

    @Override // defpackage.c75, defpackage.b75
    public final x65 b(Class r2, f03 r3) {
        if (this.b != null) goto L5;
        z45 r0 = d;
        Application r4 = (Application) r3.a.get(r0);
        if (r4 == null) goto L11;
        return d(r2, r4);
    L11:
        if (hd.class.isAssignableFrom(r2) == false) goto L13;
        kf2.n("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    L13:
        return bu.h(r2);
    L5:
        return a(r2);
    }

    public final x65 d(Class r3, Application r4) {
        if (hd.class.isAssignableFrom(r3) == false) goto L25;
        x65 r5 = (x65) r3.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{r4});     // Catch: InvocationTargetException -> L8 InstantiationException -> L10 IllegalAccessException -> L12 NoSuchMethodException -> L14
        r5.getClass();
        return r5;
    L12:
        e = move-exception;
        nz2.r("Cannot create an instance of ", r3, e);
        return null;
    L10:
        e = move-exception;
        nz2.r("Cannot create an instance of ", r3, e);
        return null;
    L14:
        e = move-exception;
        nz2.r("Cannot create an instance of ", r3, e);
        return null;
    L8:
        e = move-exception;
        nz2.r("Cannot create an instance of ", r3, e);
        return null;
    L25:
        return bu.h(r3);
    }
}
