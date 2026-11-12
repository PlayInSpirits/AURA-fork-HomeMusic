package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mx4 {
    public final HashMap a;
    public final View b;
    public final ArrayList c;

    public mx4(View r2) {
        this.a = new HashMap();
        this.c = new ArrayList();
        this.b = r2;
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof mx4) == false) goto L10;
        mx4 r4 = (mx4) r3;
        View r0 = r4.b;
        if (this.b == r0) goto L7;
        return false;
    L7:
        if (this.a.equals(r4.a) == false) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public final int hashCode() {
        int r0 = this.b.hashCode() * 31;
        return this.a.hashCode() + r0;
    }

    public final String toString() {
        StringBuilder r0 = b11.s("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        r0.append(this.b);
        r0.append("\n");
        String r1 = r0.toString().concat("    values:");
        HashMap r5 = this.a;
        Iterator r2 = r5.keySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        String r3 = (String) r2.next();
        r1 = r1 + "    " + r3 + ": " + r5.get(r3) + "\n";
        goto L4
    L6:
        return r1;
    }
}
