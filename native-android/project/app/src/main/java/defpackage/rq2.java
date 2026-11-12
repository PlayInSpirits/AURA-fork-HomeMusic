package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rq2 {
    public static final rq2 c = null;
    public final Bundle a;
    public List b;

    static {
        c = new rq2(new Bundle(), null);
    }

    public rq2(Bundle r1, ArrayList r2) {
        this.a = r1;
        this.b = r2;
    }

    public final void a() {
        if (this.b != null) goto L10;
        ArrayList<String> r0 = this.a.getStringArrayList("controlCategories");
        this.b = r0;
        if (r0 != null) goto L7;
    L8:
        this.b = Collections.EMPTY_LIST;
        return;
    L7:
        if (r0.isEmpty() == true) goto L8;
        return;
    }

    public final ArrayList b() {
        a();
        return new ArrayList(this.b);
    }

    public final boolean c() {
        a();
        return this.b.isEmpty();
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof rq2) == false) goto L6;
        rq2 r3 = (rq2) r2;
        a();
        r3.a();
        return this.b.equals(r3.b);
    L6:
        return false;
    }

    public final int hashCode() {
        a();
        return this.b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(b().toArray()) + " }";
    }
}
