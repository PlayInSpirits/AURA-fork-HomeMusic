package defpackage;

import java.lang.reflect.ParameterizedType;
import java.util.Objects;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:370)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r05 {
    public static final r05 n;
    public static final /* synthetic */ r05[] o = {new r05() { // from class: o05
        @Override // defpackage.r05
        public final Class a(Class cls) {
            return cls.getEnclosingClass();
        }
    }, new r05() { // from class: p05
        @Override // defpackage.r05
        public final Class a(Class cls) {
            if (cls.isLocalClass()) {
                return null;
            }
            return cls.getEnclosingClass();
        }
    }};

    /* JADX INFO: Fake field, exist only in values array */
    r05 EF2;

    static {
        ParameterizedType parameterizedType = (ParameterizedType) q05.class.getGenericSuperclass();
        Objects.requireNonNull(parameterizedType);
        for (r05 r05Var : values()) {
            if (r05Var.a(q05.class) == parameterizedType.getOwnerType()) {
                n = r05Var;
                return;
            }
        }
        throw new AssertionError();
    }

    public static r05 valueOf(String str) {
        return (r05) Enum.valueOf(r05.class, str);
    }

    public static r05[] values() {
        return (r05[]) o.clone();
    }

    public abstract Class a(Class cls);
}
