package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e54 {
    public static final hh3 a = null;
    public static final hh3 b = null;
    public static final hh3 c = null;

    static {
        a = new hh3(19);
        b = new hh3(20);
        c = new hh3(21);
    }

    public static final b54 a(f03 r7) {
        LinkedHashMap r8 = r7.a;
        j54 r0 = (j54) r8.get(a);
        Bundle r1 = null;
        if (r0 == null) goto L37;
        f75 r2 = (f75) r8.get(b);
        if (r2 == null) goto L35;
        Bundle r3 = (Bundle) r8.get(c);
        String r9 = (String) r8.get(d75.a);
        if (r9 == null) goto L33;
        i54 r4 = r0.f().G("androidx.lifecycle.internal.SavedStateHandlesProvider");
        if ((r4 instanceof f54) == false) goto L11;
        f54 r5 = (f54) r4;
    L12:
        if (r5 == null) goto L31;
        LinkedHashMap r6 = c(r2).b;
        b54 r10 = (b54) r6.get(r9);
        if (r10 != null) goto L30;
        r5.b();
        Bundle r11 = r5.c;
        if (r11 != null) goto L19;
    L28:
        b54 r12 = ya4.j(r1, r3);
        r6.put(r9, r12);
        return r12;
    L19:
        if (r11.containsKey(r9) == false) goto L28;
        Bundle r13 = r11.getBundle(r9);
        if (r13 != null) goto L24;
        r13 = fh0.g((kd3[]) Arrays.copyOf(new kd3[0], 0));
    L24:
        r11.remove(r9);
        if (r11.isEmpty() == false) goto L27;
        r5.c = null;
    L27:
        r1 = r13;
        goto L28
    L30:
        return r10;
    L31:
        kf2.o("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        return null;
    L11:
        r5 = null;
        goto L12
    L33:
        kf2.n("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        return null;
    L35:
        kf2.n("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        return null;
    L37:
        kf2.n("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        return null;
    }

    public static final void b(j54 r4) {
        r92 r0 = r4.h().h;
        if (r0 == r92.o) goto L10;
        if (r0 == r92.p) goto L10;
        throw new IllegalArgumentException(("Failed to enable `SavedStateHandle` for `" + r4 + "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `" + r0 + "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.").toString());
    L10:
        if (r4.f().G("androidx.lifecycle.internal.SavedStateHandlesProvider") != null) goto L13;
        f54 r1 = new f54(r4.f(), (f75) r4);
        r4.f().L("androidx.lifecycle.internal.SavedStateHandlesProvider", r1);
        r4.h().a(new vv3(6, r1));
        return;
    }

    public static final g54 c(f75 r3) {
        d54 r0 = new d54();
        tf0 r1 = gh0.q(r3);
        r1.getClass();
        e75 r4 = r3.d();
        r4.getClass();
        return (g54) new bq4(r4, r0, r1).l(kx3.a(g54.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
