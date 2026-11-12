package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u05 extends x05 {
    public u05() {
        super("JAVA8", 2);
    }

    @Override // defpackage.x05
    public final Type a(Type type) {
        return x05.n.a(type);
    }

    @Override // defpackage.x05
    public final String b(Type type) {
        try {
            return (String) Type.class.getMethod("getTypeName", null).invoke(type, null);
        } catch (IllegalAccessException e) {
            e = e;
            er1.m(e);
            return null;
        } catch (NoSuchMethodException unused) {
            throw new AssertionError("Type.getTypeName should be available in Java 8");
        } catch (InvocationTargetException e2) {
            e = e2;
            er1.m(e);
            return null;
        }
    }

    @Override // defpackage.x05
    public final Type d(Type type) {
        type.getClass();
        return type;
    }
}
