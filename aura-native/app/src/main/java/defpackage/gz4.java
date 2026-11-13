package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.security.PrivilegedAction;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class gz4 implements PrivilegedAction {
    public final /* synthetic */ Class a;

    public gz4(Class cls) {
        this.a = cls;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        Field[] declaredFields = this.a.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            if (field.isEnumConstant()) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
        AccessibleObject.setAccessible(fieldArr, true);
        return fieldArr;
    }
}
