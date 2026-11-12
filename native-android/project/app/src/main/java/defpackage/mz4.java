package defpackage;

import com.google.common.reflect.TypeToken;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mz4 extends rp {
    public final /* synthetic */ int b;
    public final Object c;

    public mz4() {
        this.b = 0;
        super(6);
        this.c = new HashMap();
    }

    @Override // defpackage.rp
    public void p(Class r4) {
        int r0 = this.b;
        Object r1 = this.c;
        switch(r0) {
            case 0: goto L9;
            case 1: goto L4;
            case 2: goto L7;
            case 3: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        ((AtomicReference) r1).set(r4.getComponentType());
        return;
    L7:
        ((ix1) r1).c(r4);
        return;
    L9:
        o(new Type[]{r4.getGenericSuperclass()});
        o(r4.getGenericInterfaces());
    }

    @Override // defpackage.rp
    public void q(GenericArrayType r4) {
        int r0 = this.b;
        Object r2 = this.c;
        switch(r0) {
            case 1: goto L9;
            case 2: goto L7;
            case 3: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        ((AtomicReference) r2).set(r4.getGenericComponentType());
        return;
    L7:
        Class<? super Object> r3 = TypeToken.of(r4.getGenericComponentType()).getRawType();
        c32 r5 = b15.a;
        ((ix1) r2).c(Array.newInstance(r3, 0).getClass());
        return;
    L9:
        o(new Type[]{r4.getGenericComponentType()});
    }

    @Override // defpackage.rp
    public void r(ParameterizedType r15) {
        int r0 = this.b;
        Object r1 = this.c;
        switch(r0) {
            case 0: goto L9;
            case 1: goto L7;
            case 2: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        ((ix1) r1).f((Class) r15.getRawType());
        return;
    L7:
        o(r15.getActualTypeArguments());
        o(new Type[]{r15.getOwnerType()});
        return;
    L9:
        Class r2 = (Class) r15.getRawType();
        TypeVariable[] r4 = r2.getTypeParameters();
        Type[] r5 = r15.getActualTypeArguments();
        if (r4.length != r5.length) goto L12;
        boolean r6 = true;
    L13:
        rr2.w(r6);
        int r7 = 0;
    L15:
        if (r7 >= r4.length) goto L38;
        pz4 r8 = new pz4(r4[r7]);
        Type r9 = r5[r7];
        HashMap r10 = (HashMap) r1;
        if (r10.containsKey(r8) == true) goto L37;
        Type r11 = r9;
    L20:
        if (r11 == null) goto L36;
        boolean r12 = r11 instanceof TypeVariable;
        if (r12 == false) goto L24;
        boolean r13 = r8.a((TypeVariable) r11);
    L25:
        pz4 r14 = null;
        if (r13 == true) goto L27;
        if (r12 == false) goto L35;
        r14 = new pz4((TypeVariable) r11);
    L35:
        r11 = (Type) r10.get(r14);
    L27:
        if (r9 == null) goto L37;
        if ((r9 instanceof TypeVariable) == false) goto L31;
        pz4 r16 = new pz4((TypeVariable) r9);
    L32:
        r9 = (Type) r10.remove(r16);
        goto L27
    L31:
        r16 = null;
        goto L32
    L24:
        r13 = false;
        goto L25
    L36:
        r10.put(r8, r9);
    L37:
        r7 = r7 + 1;
        goto L15
    L38:
        o(new Type[]{r2});
        o(new Type[]{r15.getOwnerType()});
        return;
    L12:
        r6 = false;
        goto L13
    }

    @Override // defpackage.rp
    public final void s(TypeVariable r3) {
        int r0 = this.b;
        Object r1 = this.c;
        switch(r0) {
            case 0: goto L10;
            case 1: goto L9;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ((AtomicReference) r1).set(b15.a(r3.getBounds()));
        return;
    L6:
        o(r3.getBounds());
        return;
    L10:
        o(r3.getBounds());
        return;
    L9:
        throw new IllegalArgumentException(TypeToken.access$500((TypeToken) r1) + "contains a type variable and is not safe for the operation");
    }

    @Override // defpackage.rp
    public final void t(WildcardType r2) {
        switch(this.b) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ((AtomicReference) this.c).set(b15.a(r2.getUpperBounds()));
        return;
    L6:
        o(r2.getUpperBounds());
        return;
    L8:
        o(r2.getLowerBounds());
        o(r2.getUpperBounds());
        return;
    L10:
        o(r2.getUpperBounds());
    }

    public /* synthetic */ mz4(int r1, Object r2) {
        this.b = r1;
        this.c = r2;
        super(6);
    }
}
