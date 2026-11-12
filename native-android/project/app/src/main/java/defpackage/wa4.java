package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wa4 {
    public static final wa4 b = null;
    public static final String c = null;
    public final jx1 a;

    static {
        b = new wa4(new HashSet());
        String r0 = f35.a;
        c = Integer.toString(0, 36);
    }

    public wa4(HashSet r1) {
        this.a = jx1.k(r1);
    }

    public static wa4 a(Bundle r3) {
        ArrayList r4 = r3.getParcelableArrayList(c);
        if (r4 != null) goto L6;
        l93.q0("SessionCommands", "Missing commands. Creating an empty SessionCommands");
        return b;
    L6:
        HashSet r0 = new HashSet();
        int r1 = 0;
    L8:
        if (r1 >= r4.size()) goto L11;
        r0.add(va4.a((Bundle) r4.get(r1)));
        r1 = r1 + 1;
        goto L8
    L11:
        return new wa4(r0);
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof wa4) == true) goto L10;
        return false;
    L10:
        return this.a.equals(((wa4) r2).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }
}
