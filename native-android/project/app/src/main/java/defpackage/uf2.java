package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uf2 {
    public static final fl1 a = null;

    static {
        int r1 = eq4.a;
        Object r2 = null;
        String r0 = System.getProperty("kotlinx.coroutines.fast.service.loader");     // Catch: SecurityException -> L5
    L6:
        if (r0 == null) goto L31;
        Boolean.parseBoolean(r0);
    L31:
        Iterator r3 = fa4.f0(fa4.b0(Arrays.asList(new ob[]{new ob()}).iterator())).iterator();
        if (r3.hasNext() == false) goto L19;
        r2 = r3.next();
        if (r3.hasNext() == false) goto L19;
        ((ob) r2).getClass();
    L16:
        ((ob) r3.next()).getClass();
        if (r3.hasNext() == true) goto L16;
    L19:
        if (((ob) r2) == null) goto L26;
        Looper r4 = Looper.getMainLooper();
        if (r4 == null) goto L24;
        a = new fl1(gl1.a(r4));
        return;
    L24:
        kf2.o("The main looper is not available");
        return;
    L26:
        kf2.o("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        return;
    L28:
        th = move-exception;
        throw new ServiceConfigurationError(th.getMessage(), th);
    L5:
        r0 = null;
        goto L6
    }
}
