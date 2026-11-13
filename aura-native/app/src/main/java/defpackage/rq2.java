package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class rq2 {
    public static final rq2 c = new rq2(new Bundle(), null);
    public final Bundle a;
    public List b;

    public rq2(Bundle bundle, ArrayList arrayList) {
        this.a = bundle;
        this.b = arrayList;
    }

    public final void a() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList("controlCategories");
            this.b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList b() {
        a();
        return new ArrayList(this.b);
    }

    public final boolean c() {
        a();
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rq2)) {
            return false;
        }
        rq2 rq2Var = (rq2) obj;
        a();
        rq2Var.a();
        return this.b.equals(rq2Var.b);
    }

    public final int hashCode() {
        a();
        return this.b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(b().toArray()) + " }";
    }
}
