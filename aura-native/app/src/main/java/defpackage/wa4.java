package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class wa4 {
    public static final wa4 b = new wa4(new HashSet());
    public static final String c;
    public final jx1 a;

    static {
        String str = f35.a;
        c = Integer.toString(0, 36);
    }

    public wa4(HashSet hashSet) {
        this.a = jx1.k(hashSet);
    }

    public static wa4 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c);
        if (parcelableArrayList == null) {
            l93.q0("SessionCommands", "Missing commands. Creating an empty SessionCommands");
            return b;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashSet.add(va4.a((Bundle) parcelableArrayList.get(i)));
        }
        return new wa4(hashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wa4) {
            return this.a.equals(((wa4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
