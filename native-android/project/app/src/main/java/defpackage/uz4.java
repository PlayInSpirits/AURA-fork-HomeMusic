package defpackage;

import com.google.common.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uz4 extends t12 {
    public final Constructor p;
    public final /* synthetic */ TypeToken q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz4(TypeToken typeToken, Constructor constructor) {
        super(constructor);
        this.q = typeToken;
        this.p = constructor;
    }

    @Override // defpackage.t12
    public final TypeToken a() {
        return this.q;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002f  */
    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        TypeToken typeToken = this.q;
        sb.append(typeToken);
        sb.append("(");
        uc0 uc0Var = new uc0(", ");
        sz4 invariantTypeResolver = typeToken.getInvariantTypeResolver();
        Constructor constructor = this.p;
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        if (genericParameterTypes.length > 0) {
            Class declaringClass = constructor.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() == null) {
                Method enclosingMethod = declaringClass.getEnclosingMethod();
                if (enclosingMethod != null) {
                    z = !Modifier.isStatic(enclosingMethod.getModifiers());
                } else if (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
            if (z) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == this.o.getDeclaringClass().getEnclosingClass()) {
                    genericParameterTypes = (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length);
                }
            }
        }
        invariantTypeResolver.getClass();
        for (int i = 0; i < genericParameterTypes.length; i++) {
            genericParameterTypes[i] = invariantTypeResolver.b(genericParameterTypes[i]);
        }
        sb.append(uc0Var.b(Arrays.asList(genericParameterTypes)));
        sb.append(")");
        return sb.toString();
    }
}
