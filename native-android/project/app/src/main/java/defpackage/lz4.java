package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lz4 extends rp {
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ Type c;

    public lz4(HashMap r1, Type r2) {
        this.b = r1;
        this.c = r2;
        super(6);
    }

    @Override // defpackage.rp
    public final void p(Class r3) {
        Type r2 = this.c;
        if ((r2 instanceof WildcardType) == false) goto L5;
        return;
    L5:
        tb4.h("No type mapping from ", r3, " to ", r2);
    }

    @Override // defpackage.rp
    public final void q(GenericArrayType r5) {
        Type r0 = this.c;
        if ((r0 instanceof WildcardType) == false) goto L5;
        return;
    L5:
        Type r1 = b15.c(r0);
        if (r1 == null) goto L8;
        boolean r2 = true;
    L9:
        rr2.o(r2, "%s is not an array type.", r0);
        sz4.a(this.b, r5.getGenericComponentType(), r1);
        return;
    L8:
        r2 = false;
        goto L9
    }

    @Override // defpackage.rp
    public final void r(ParameterizedType r7) {
        Type r0 = this.c;
        if ((r0 instanceof WildcardType) == false) goto L23;
        return;
    L23:
        ParameterizedType r1 = (ParameterizedType) ParameterizedType.class.cast(r0);
        Type r2 = r7.getOwnerType();
        HashMap r6 = this.b;
        if (r2 != null) goto L10;
    L12:
        rr2.p(r7.getRawType().equals(r1.getRawType()), "Inconsistent raw type: %s vs. %s", r7, r0);
        Type[] r3 = r7.getActualTypeArguments();
        Type[] r4 = r1.getActualTypeArguments();
        int r5 = 0;
        if (r3.length != r4.length) goto L15;
        boolean r8 = true;
    L16:
        rr2.p(r8, "%s not compatible with %s", r7, r1);
    L18:
        if (r5 >= r3.length) goto L26;
        sz4.a(r6, r3[r5], r4[r5]);
        r5 = r5 + 1;
        goto L18
    L26:
        return;
    L15:
        r8 = false;
        goto L16
    L10:
        if (r1.getOwnerType() == null) goto L12;
        sz4.a(r6, r7.getOwnerType(), r1.getOwnerType());
    L22:
        throw new IllegalArgumentException(r0 + " is not a ParameterizedType");
    }

    @Override // defpackage.rp
    public final void s(TypeVariable r2) {
        pz4 r0 = new pz4(r2);
        Type r3 = this.c;
        this.b.put(r0, r3);
    }

    @Override // defpackage.rp
    public final void t(WildcardType r9) {
        Type r0 = this.c;
        if ((r0 instanceof WildcardType) == false) goto L18;
        WildcardType r1 = (WildcardType) r0;
        Type[] r2 = r9.getUpperBounds();
        Type[] r3 = r1.getUpperBounds();
        Type[] r4 = r9.getLowerBounds();
        Type[] r5 = r1.getLowerBounds();
        int r7 = 0;
        if (r2.length == r3.length) goto L8;
    L10:
        boolean r6 = false;
    L11:
        rr2.p(r6, "Incompatible type: %s vs. %s", r9, r0);
        int r10 = 0;
    L12:
        int r8 = r2.length;
        HashMap r11 = this.b;
        if (r10 >= r8) goto L16;
        sz4.a(r11, r2[r10], r3[r10]);
        r10 = r10 + 1;
    L16:
        if (r7 >= r4.length) goto L21;
        sz4.a(r11, r4[r7], r5[r7]);
        r7 = r7 + 1;
        goto L16
    L21:
        return;
    L8:
        if (r4.length != r5.length) goto L10;
        r6 = true;
        goto L11
    }
}
