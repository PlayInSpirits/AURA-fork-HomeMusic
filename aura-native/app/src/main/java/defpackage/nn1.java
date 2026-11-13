package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class nn1 implements pv2 {
    public final String a;
    public final String b;
    public final List c;

    public nn1(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nn1.class == obj.getClass()) {
            nn1 nn1Var = (nn1) obj;
            if (TextUtils.equals(this.a, nn1Var.a) && TextUtils.equals(this.b, nn1Var.b) && this.c.equals(nn1Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        return "HlsTrackMetadataEntry".concat(str != null ? b11.q(xa3.j(" [", str, ", "), this.b, "]") : "");
    }
}
