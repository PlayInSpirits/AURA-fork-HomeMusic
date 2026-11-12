package defpackage;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum u05 extends x05 {
    public u05() {
        super("JAVA8", 2);
    }

    @Override // defpackage.x05
    public final Type a(Type r1) {
        return x05.n.a(r1);
    }

    @Override // defpackage.x05
    public final String b(Type r3) {
        return (String) Type.class.getMethod("getTypeName", null).invoke(r3, null);
    L5:
        e = e;
    L8:
        er1.m(e);
        return null;
    L7:
        e = e;
    L11:
        throw new AssertionError("Type.getTypeName should be available in Java 8");
    }

    @Override // defpackage.x05
    public final Type d(Type r1) {
        r1.getClass();
        return r1;
    }
}
