package defpackage;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x05 {
    public static final t05 n;
    public static final u05 o;
    public static final x05 p;
    public static final /* synthetic */ x05[] q;

    static {
        x05 x05Var = new x05() { // from class: s05
            @Override // defpackage.x05
            public final Type a(Type type) {
                return new a(1, type);
            }

            @Override // defpackage.x05
            public final Type d(Type type) {
                type.getClass();
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new a(1, cls.getComponentType()) : type;
            }
        };
        t05 t05Var = new t05();
        n = t05Var;
        u05 u05Var = new u05();
        o = u05Var;
        v05 v05Var = new v05();
        q = new x05[]{x05Var, t05Var, u05Var, v05Var};
        if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
            if (new w05().capture().toString().contains("java.util.Map.java.util.Map")) {
                p = u05Var;
                return;
            } else {
                p = v05Var;
                return;
            }
        }
        if (new w05().capture() instanceof Class) {
            p = t05Var;
        } else {
            p = x05Var;
        }
    }

    public static x05 valueOf(String str) {
        return (x05) Enum.valueOf(x05.class, str);
    }

    public static x05[] values() {
        return (x05[]) q.clone();
    }

    public abstract Type a(Type type);

    public String b(Type type) {
        c32 c32Var = b15.a;
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public final gy3 c(Type[] typeArr) {
        uw1 uw1VarJ = yw1.j();
        for (Type type : typeArr) {
            uw1VarJ.c(d(type));
        }
        return uw1VarJ.f();
    }

    public abstract Type d(Type type);
}
