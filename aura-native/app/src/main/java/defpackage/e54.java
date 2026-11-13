package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class e54 {
    public static final hh3 a = new hh3(19);
    public static final hh3 b = new hh3(20);
    public static final hh3 c = new hh3(21);

    public static final b54 a(f03 f03Var) {
        LinkedHashMap linkedHashMap = f03Var.a;
        j54 j54Var = (j54) linkedHashMap.get(a);
        Bundle bundle = null;
        if (j54Var == null) {
            kf2.n("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        f75 f75Var = (f75) linkedHashMap.get(b);
        if (f75Var == null) {
            kf2.n("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(c);
        String str = (String) linkedHashMap.get(d75.a);
        if (str == null) {
            kf2.n("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        i54 G = j54Var.f().G("androidx.lifecycle.internal.SavedStateHandlesProvider");
        f54 f54Var = G instanceof f54 ? (f54) G : null;
        if (f54Var == null) {
            kf2.o("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = c(f75Var).b;
        b54 b54Var = (b54) linkedHashMap2.get(str);
        if (b54Var != null) {
            return b54Var;
        }
        f54Var.b();
        Bundle bundle3 = f54Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = fh0.g((kd3[]) Arrays.copyOf(new kd3[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                f54Var.c = null;
            }
            bundle = bundle4;
        }
        b54 j = ya4.j(bundle, bundle2);
        linkedHashMap2.put(str, j);
        return j;
    }

    public static final void b(j54 j54Var) {
        r92 r92Var = j54Var.h().h;
        if (r92Var == r92.o || r92Var == r92.p) {
            if (j54Var.f().G("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
                f54 f54Var = new f54(j54Var.f(), (f75) j54Var);
                j54Var.f().L("androidx.lifecycle.internal.SavedStateHandlesProvider", f54Var);
                j54Var.h().a(new vv3(6, f54Var));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Failed to enable `SavedStateHandle` for `" + j54Var + "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `" + r92Var + "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.").toString());
    }

    public static final g54 c(f75 f75Var) {
        d54 d54Var = new d54();
        tf0 q = gh0.q(f75Var);
        q.getClass();
        e75 d = f75Var.d();
        d.getClass();
        return (g54) new bq4(d, d54Var, q).l(kx3.a(g54.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
