package defpackage;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract enum x05 extends Enum {
    public static final t05 n = null;
    public static final u05 o = null;
    public static final x05 p = null;
    public static final /* synthetic */ x05[] q = null;

    static {
        x05 r0 = new s05();
        t05 r1 = new t05();
        n = r1;
        u05 r2 = new u05();
        o = r2;
        v05 r3 = new v05();
        q = new x05[]{r0, r1, r2, r3};
        if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class) == false) goto L11;
        if (new w05().capture().toString().contains("java.util.Map.java.util.Map") == false) goto L8;
        p = r2;
        return;
    L8:
        p = r3;
        return;
    L11:
        if ((new w05().capture() instanceof Class) == false) goto L14;
        p = r1;
        return;
    L14:
        p = r0;
    }

    public static x05 valueOf(String r1) {
        return (x05) Enum.valueOf(x05.class, r1);
    }

    public static x05[] values() {
        return (x05[]) q.clone();
    }

    public abstract Type a(Type r1);

    public String b(Type r1) {
        c32 r0 = b15.a;
        if ((r1 instanceof Class) == false) goto L7;
        return ((Class) r1).getName();
    L7:
        return r1.toString();
    }

    public final gy3 c(Type[] r5) {
        uw1 r0 = yw1.j();
        int r1 = r5.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        r0.c(d(r5[r2]));
        r2 = r2 + 1;
        goto L3
    L6:
        return r0.f();
    }

    public abstract Type d(Type r1);
}
