package defpackage;

import com.google.gson.reflect.TypeToken;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u21 implements cz4, Cloneable {
    public static final u21 p = null;
    public List n;
    public List o;

    static {
        u21 r0 = new u21();
        List r1 = Collections.EMPTY_LIST;
        r0.n = r1;
        r0.o = r1;
        p = r0;
    }

    public static boolean c(Class r1) {
        if (Enum.class.isAssignableFrom(r1) == false) goto L5;
        return false;
    L5:
        if ((r1.getModifiers() & 8) == 0) goto L8;
        return false;
    L8:
        if (r1.isAnonymousClass() == false) goto L10;
        return true;
    L10:
        if (r1.isLocalClass() == false) goto L16;
        return true;
    L16:
        return false;
    }

    @Override // defpackage.cz4
    public final bz4 a(nk1 r10, TypeToken r11) {
        boolean r0 = c(r11.getRawType());
        if (r0 == true) goto L5;
        b(true);
        boolean r6 = false;
    L6:
        if (r0 == true) goto L8;
        b(false);
        boolean r5 = false;
    L9:
        if (r6 == true) goto L14;
        if (r5 == true) goto L14;
        return null;
    L14:
        return new t21(this, r5, r6, r10, r11);
    L8:
        r5 = true;
        goto L9
    L5:
        r6 = true;
        goto L6
    }

    public final void b(boolean r1) {
        if (r1 == false) goto L4;
        List r0 = this.n;
    L5:
        Iterator r2 = r0.iterator();
        if (r2.hasNext() == true) goto L9;
        return;
    L9:
        throw xa3.d(r2);
    L4:
        r0 = this.o;
        goto L5
    }

    public final Object clone() {
        return (u21) super.clone();
    L4:
        e = move-exception;
        throw new AssertionError(e);
    }
}
