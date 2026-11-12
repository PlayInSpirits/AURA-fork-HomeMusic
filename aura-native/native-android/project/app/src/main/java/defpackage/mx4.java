package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mx4 {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public mx4(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mx4)) {
            return false;
        }
        mx4 mx4Var = (mx4) obj;
        return this.b == mx4Var.b && this.a.equals(mx4Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbS = b11.s("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbS.append(this.b);
        sbS.append("\n");
        String strConcat = sbS.toString().concat("    values:");
        HashMap map = this.a;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }
}
