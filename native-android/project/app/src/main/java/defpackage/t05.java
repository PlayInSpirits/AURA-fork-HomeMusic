package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum t05 extends x05 {
    public t05() {
        super("JAVA7", 1);
    }

    @Override // defpackage.x05
    public final Type a(Type r2) {
        if ((r2 instanceof Class) == false) goto L7;
        c32 r1 = b15.a;
        return Array.newInstance((Class) r2, 0).getClass();
    L7:
        return new a(1, r2);
    }

    @Override // defpackage.x05
    public final Type d(Type r1) {
        r1.getClass();
        return r1;
    }
}
