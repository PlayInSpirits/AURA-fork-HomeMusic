package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gz4 implements PrivilegedAction {
    public final /* synthetic */ Class a;

    public gz4(Class r1) {
        this.a = r1;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Field[] r6 = this.a.getDeclaredFields();
        ArrayList r0 = new ArrayList(r6.length);
        int r1 = r6.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        Field r4 = r6[r3];
        if (r4.isEnumConstant() == false) goto L7;
        r0.add(r4);
    L7:
        r3 = r3 + 1;
        goto L3
    L8:
        Field[] r7 = (Field[]) r0.toArray(new Field[0]);
        AccessibleObject.setAccessible(r7, true);
        return r7;
    }
}
