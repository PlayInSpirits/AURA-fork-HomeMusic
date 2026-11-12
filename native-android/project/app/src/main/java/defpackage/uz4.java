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

    public uz4(TypeToken r1, Constructor r2) {
        this.q = r1;
        super(r2);
        this.p = r2;
    }

    @Override // defpackage.t12
    public final TypeToken a() {
        return this.q;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        TypeToken r1 = this.q;
        r0.append(r1);
        r0.append("(");
        uc0 r2 = new uc0(", ");
        sz4 r3 = TypeToken.access$100(r1);
        Constructor r4 = this.p;
        Type[] r5 = r4.getGenericParameterTypes();
        int r6 = 0;
        if (r5.length <= 0) goto L22;
        Class r7 = r4.getDeclaringClass();
        if (r7.getEnclosingConstructor() == null) goto L7;
    L6:
        boolean r8 = true;
    L16:
        if (r8 == false) goto L22;
        Class<?>[] r9 = r4.getParameterTypes();
        if (r5.length != r9.length) goto L22;
        if (r9[0] != this.o.getDeclaringClass().getEnclosingClass()) goto L22;
        r5 = (Type[]) Arrays.copyOfRange(r5, 1, r5.length);
        goto L22
    L7:
        Method r10 = r7.getEnclosingMethod();
        if (r10 == null) goto L11;
        r8 = !Modifier.isStatic(r10.getModifiers());
        goto L16
    L11:
        if (r7.getEnclosingClass() != null) goto L13;
    L15:
        r8 = false;
        goto L16
    L13:
        if (Modifier.isStatic(r7.getModifiers()) == true) goto L15;
    L22:
        r3.getClass();
    L24:
        if (r6 >= r5.length) goto L26;
        r5[r6] = r3.b(r5[r6]);
        r6 = r6 + 1;
        goto L24
    L26:
        r0.append(r2.b(Arrays.asList(r5)));
        r0.append(")");
        return r0.toString();
    }
}
