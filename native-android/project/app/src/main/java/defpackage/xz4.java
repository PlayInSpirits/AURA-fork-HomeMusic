package defpackage;

import com.google.common.reflect.TypeToken;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final enum xz4 extends zz4 {
    public xz4() {
        super("IGNORE_TYPE_VARIABLE_OR_WILDCARD", 0);
    }

    @Override // defpackage.ro3
    public final boolean apply(Object r1) {
        TypeToken r2 = (TypeToken) r1;
        if ((TypeToken.access$500(r2) instanceof TypeVariable) == false) goto L5;
        return false;
    L5:
        if ((TypeToken.access$500(r2) instanceof WildcardType) == true) goto L10;
        return true;
    L10:
        return false;
    }
}
