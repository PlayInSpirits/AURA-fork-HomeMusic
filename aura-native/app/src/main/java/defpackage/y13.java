package defpackage;

import android.os.Bundle;
import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class y13 {
    public final int a;
    public y23 b = null;
    public Bundle c = null;

    public y13(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof y13)) {
            y13 y13Var = (y13) obj;
            if (this.a == y13Var.a && h12.c(this.b, y13Var.b)) {
                if (!h12.c(this.c, y13Var.c)) {
                    Bundle bundle = this.c;
                    if (bundle != null && (keySet = bundle.keySet()) != null) {
                        Set<String> set = keySet;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (String str : set) {
                                Bundle bundle2 = this.c;
                                Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                                Bundle bundle3 = y13Var.c;
                                if (!h12.c(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = Integer.hashCode(this.a) * 31;
        y23 y23Var = this.b;
        int hashCode2 = hashCode + (y23Var != null ? y23Var.hashCode() : 0);
        Bundle bundle = this.c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i = hashCode2 * 31;
                Bundle bundle2 = this.c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                hashCode2 = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y13.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.a));
        sb.append(")");
        if (this.b != null) {
            sb.append(" navOptions=");
            sb.append(this.b);
        }
        return sb.toString();
    }
}
