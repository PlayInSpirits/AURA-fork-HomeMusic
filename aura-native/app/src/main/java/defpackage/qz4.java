package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class qz4 extends rz4 {
    public final /* synthetic */ TypeVariable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz4(AtomicInteger atomicInteger, TypeVariable typeVariable) {
        super(atomicInteger);
        this.c = typeVariable;
    }

    @Override // defpackage.rz4
    public final TypeVariable b(Type[] typeArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
        linkedHashSet.addAll(Arrays.asList(this.c.getBounds()));
        if (linkedHashSet.size() > 1) {
            linkedHashSet.remove(Object.class);
        }
        return super.b((Type[]) linkedHashSet.toArray(new Type[0]));
    }
}
