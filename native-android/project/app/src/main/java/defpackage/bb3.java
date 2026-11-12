package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bb3 implements Serializable {
    public static final Throwable a(Object r1) {
        if ((r1 instanceof s14) == true) goto L5;
        return null;
    L5:
        return ((s14) r1).n;
    }

    public abstract Object b(m91 r1);

    public abstract Object c();

    public abstract boolean d();
}
