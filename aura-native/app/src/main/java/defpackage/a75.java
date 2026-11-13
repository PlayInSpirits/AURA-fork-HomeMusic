package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class a75 extends c75 {
    public static a75 c;
    public static final z45 d = new z45(2);
    public final Application b;

    public a75(Application application) {
        this.b = application;
    }

    @Override // defpackage.c75, defpackage.b75
    public final x65 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        er1.l("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.c75, defpackage.b75
    public final x65 b(Class cls, f03 f03Var) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) f03Var.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!hd.class.isAssignableFrom(cls)) {
            return bu.h(cls);
        }
        kf2.n("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final x65 d(Class cls, Application application) {
        if (!hd.class.isAssignableFrom(cls)) {
            return bu.h(cls);
        }
        try {
            x65 x65Var = (x65) cls.getConstructor(Application.class).newInstance(application);
            x65Var.getClass();
            return x65Var;
        } catch (IllegalAccessException e) {
            nz2.r("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            nz2.r("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            nz2.r("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            nz2.r("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
