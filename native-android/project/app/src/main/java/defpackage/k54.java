package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k54 implements b75 {
    public final Application a;
    public final a75 b;
    public final Bundle c;
    public final ea2 d;
    public final rm3 e;

    public k54(Application application, j54 j54Var, Bundle bundle) {
        a75 a75Var;
        this.e = j54Var.f();
        this.d = j54Var.h();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (a75.c == null) {
                a75.c = new a75(application);
            }
            a75Var = a75.c;
            a75Var.getClass();
        } else {
            a75Var = new a75(null);
        }
        this.b = a75Var;
    }

    @Override // defpackage.b75
    public final x65 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.b75
    public final x65 b(Class cls, f03 f03Var) {
        LinkedHashMap linkedHashMap = f03Var.a;
        String str = (String) linkedHashMap.get(d75.a);
        if (str == null) {
            kf2.o("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(e54.a) == null || linkedHashMap.get(e54.b) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            kf2.o("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(a75.d);
        boolean zIsAssignableFrom = hd.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? l54.a(cls, l54.b) : l54.a(cls, l54.a);
        if (constructorA == null) {
            return this.b.b(cls, f03Var);
        }
        return (!zIsAssignableFrom || application == null) ? l54.b(cls, constructorA, e54.a(f03Var)) : l54.b(cls, constructorA, application, e54.a(f03Var));
    }

    @Override // defpackage.b75
    public final x65 c(i30 i30Var, f03 f03Var) {
        Class cls = i30Var.n;
        cls.getClass();
        return b(cls, f03Var);
    }

    public final x65 d(Class cls, String str) {
        AutoCloseable autoCloseable;
        Application application = this.a;
        ea2 ea2Var = this.d;
        if (ea2Var == null) {
            er1.l("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = hd.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? l54.a(cls, l54.b) : l54.a(cls, l54.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            if (c75.a == null) {
                c75.a = new c75();
            }
            c75.a.getClass();
            return bu.h(cls);
        }
        rm3 rm3Var = this.e;
        rm3Var.getClass();
        c54 c54VarK = te5.k(rm3Var, ea2Var, str, this.c);
        b54 b54Var = c54VarK.o;
        x65 x65VarB = (!zIsAssignableFrom || application == null) ? l54.b(cls, constructorA, b54Var) : l54.b(cls, constructorA, application, b54Var);
        y65 y65Var = x65VarB.a;
        if (y65Var != null) {
            if (y65Var.d) {
                y65.a(c54VarK);
            } else {
                synchronized (y65Var.a) {
                    autoCloseable = (AutoCloseable) y65Var.b.put("androidx.lifecycle.savedstate.vm.tag", c54VarK);
                }
                y65.a(autoCloseable);
            }
        }
        return x65VarB;
    }
}
