package defpackage;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fd2 {
    public final io3 a;
    public final List b;
    public final String c;

    public fd2(Class r1, Class r2, Class r3, List r4, io3 r5) {
        this.a = r5;
        if (r4.isEmpty() == true) goto L6;
        this.b = r4;
        this.c = "Failed LoadPath{" + r1.getSimpleName() + "->" + r2.getSimpleName() + "->" + r3.getSimpleName() + "}";
        return;
    L6:
        kf2.n("Must not be empty.");
        throw null;
    }

    public final q04 a(int r14, int r15, x7 r16, yh0 r17, db3 r18) {
        io3 r1 = this.a;
        Object r0 = r1.b();
        h12.f(r0, "Argument must not be null");
        List r2 = (List) r0;
        List r3 = this.b;     // Catch: Throwable -> L19
        int r4 = r3.size();     // Catch: Throwable -> L19
        int r6 = 0;
        q04 r5 = null;
    L4:
        if (r6 >= r4) goto L14;
        r5 = ((yi0) r3.get(r6)).a(r14, r15, r16, r17, r18);     // Catch: GlideException -> L9 Throwable -> L19
    L11:
        if (r5 != null) goto L14;
        r6 = r6 + 1;
        goto L4
    L9:
        e = move-exception;
        r2.add(e);     // Catch: Throwable -> L19
    L14:
        if (r5 == null) goto L18;
        r1.a(r2);
        return r5;
    L18:
        throw new GlideException(this.c, new ArrayList(r2));     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        r1.a(r2);
        throw th;
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
