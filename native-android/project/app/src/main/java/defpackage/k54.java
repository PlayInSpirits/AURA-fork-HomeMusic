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

    public k54(Application r2, j54 r3, Bundle r4) {
        this.e = r3.f();
        this.d = r3.h();
        this.c = r4;
        this.a = r2;
        if (r2 != null) goto L5;
        a75 r5 = new a75(null);
    L9:
        this.b = r5;
        return;
    L5:
        if (a75.c != null) goto L7;
        a75.c = new a75(r2);
    L7:
        r5 = a75.c;
        r5.getClass();
        goto L9
    }

    @Override // defpackage.b75
    public final x65 a(Class r2) {
        String r0 = r2.getCanonicalName();
        if (r0 != null) goto L5;
        kf2.n("Local and anonymous classes can not be ViewModels");
        return null;
    L5:
        return d(r2, r0);
    }

    @Override // defpackage.b75
    public final x65 b(Class r5, f03 r6) {
        LinkedHashMap r0 = r6.a;
        String r1 = (String) r0.get(d75.a);
        if (r1 != null) goto L5;
        kf2.o("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        return null;
    L5:
        if (r0.get(e54.a) == null) goto L23;
        if (r0.get(e54.b) == null) goto L23;
        Application r2 = (Application) r0.get(a75.d);
        boolean r3 = hd.class.isAssignableFrom(r5);
        if (r3 == false) goto L12;
        if (r2 == null) goto L12;
        Constructor r4 = l54.a(r5, l54.a);
    L13:
        if (r4 == null) goto L15;
        if (r3 == false) goto L21;
        if (r2 == null) goto L21;
        return l54.b(r5, r4, new Object[]{r2, e54.a(r6)});
    L21:
        return l54.b(r5, r4, new Object[]{e54.a(r6)});
    L15:
        return this.b.b(r5, r6);
    L12:
        r4 = l54.a(r5, l54.b);
    L23:
        if (this.d != null) goto L25;
        kf2.o("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        return null;
    L25:
        return d(r5, r1);
    }

    @Override // defpackage.b75
    public final x65 c(i30 r1, f03 r2) {
        Class r3 = r1.n;
        r3.getClass();
        return b(r3, r2);
    }

    public final x65 d(Class r6, String r7) {
        Application r0 = this.a;
        ea2 r1 = this.d;
        if (r1 == null) goto L37;
        boolean r2 = hd.class.isAssignableFrom(r6);
        if (r2 == false) goto L8;
        if (r0 == null) goto L8;
        Constructor r3 = l54.a(r6, l54.a);
    L9:
        if (r3 != null) goto L18;
        if (r0 == null) goto L14;
        return this.b.a(r6);
    L14:
        if (c75.a != null) goto L16;
        c75.a = new c75();
    L16:
        c75.a.getClass();
        return bu.h(r6);
    L18:
        rm3 r4 = this.e;
        r4.getClass();
        c54 r5 = te5.k(r4, r1, r7, this.c);
        b54 r8 = r5.o;
        if (r2 == false) goto L22;
        if (r0 == null) goto L22;
        x65 r9 = l54.b(r6, r3, new Object[]{r0, r8});
    L23:
        y65 r10 = r9.a;
        if (r10 != null) goto L26;
    L36:
        return r9;
    L26:
        if (r10.d == false) goto L28;
        y65.a(r5);
        goto L36
    L28:
        xi4 r11 = r10.a;
        monitor-enter(r11);
        AutoCloseable r12 = (AutoCloseable) r10.b.put("androidx.lifecycle.savedstate.vm.tag", r5);     // Catch: Throwable -> L33
        monitor-exit(r11);
        y65.a(r12);
    L33:
        th = move-exception;
        throw th;
    L22:
        r9 = l54.b(r6, r3, new Object[]{r8});
    L8:
        r3 = l54.a(r6, l54.b);
        goto L9
    L37:
        er1.l("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }
}
