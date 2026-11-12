package defpackage;

import java.lang.reflect.Array;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t05 extends x05 {
    public t05() {
        super("JAVA7", 1);
    }

    @Override // defpackage.x05
    public final Type a(Type type) {
        if (!(type instanceof Class)) {
            return new a(1, type);
        }
        c32 c32Var = b15.a;
        return Array.newInstance((Class<?>) type, 0).getClass();
    }

    @Override // defpackage.x05
    public final Type d(Type type) {
        type.getClass();
        return type;
    }
}
