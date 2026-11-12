package defpackage;

import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u21 implements cz4, Cloneable {
    public static final u21 p;
    public List n;
    public List o;

    static {
        u21 u21Var = new u21();
        List list = Collections.EMPTY_LIST;
        u21Var.n = list;
        u21Var.o = list;
        p = u21Var;
    }

    public static boolean c(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    @Override // defpackage.cz4
    public final bz4 a(nk1 nk1Var, TypeToken typeToken) {
        boolean z;
        boolean z2;
        boolean zC = c(typeToken.getRawType());
        if (zC) {
            z = true;
        } else {
            b(true);
            z = false;
        }
        if (zC) {
            z2 = true;
        } else {
            b(false);
            z2 = false;
        }
        if (z || z2) {
            return new t21(this, z2, z, nk1Var, typeToken);
        }
        return null;
    }

    public final void b(boolean z) {
        Iterator it = (z ? this.n : this.o).iterator();
        if (it.hasNext()) {
            throw xa3.d(it);
        }
    }

    public final Object clone() {
        try {
            return (u21) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
