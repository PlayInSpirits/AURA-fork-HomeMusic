package defpackage;

import com.google.common.reflect.TypeToken;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vz4 {
    public final Type[] a;
    public final boolean b;

    public vz4(Type[] typeArr, boolean z) {
        this.a = typeArr;
        this.b = z;
    }

    public final boolean a(Type type) {
        Type[] typeArr = this.a;
        int length = typeArr.length;
        int i = 0;
        while (true) {
            boolean z = this.b;
            if (i >= length) {
                return !z;
            }
            if (TypeToken.of(typeArr[i]).isSubtypeOf(type) == z) {
                return z;
            }
            i++;
        }
    }
}
