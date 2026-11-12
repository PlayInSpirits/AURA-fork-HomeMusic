package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qz4 extends rz4 {
    public final /* synthetic */ TypeVariable c;

    public qz4(AtomicInteger r1, TypeVariable r2) {
        this.c = r2;
        super(r1);
    }

    @Override // defpackage.rz4
    public final TypeVariable b(Type[] r3) {
        LinkedHashSet r0 = new LinkedHashSet(Arrays.asList(r3));
        r0.addAll(Arrays.asList(this.c.getBounds()));
        if (r0.size() <= 1) goto L6;
        r0.remove(Object.class);
    L6:
        return super.b((Type[]) r0.toArray(new Type[0]));
    }
}
