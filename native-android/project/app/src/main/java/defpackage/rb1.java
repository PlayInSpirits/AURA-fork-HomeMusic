package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rb1 extends tz3 {
    public static final hu2 c = ve5.a("application/x-www-form-urlencoded");
    public final List a;
    public final List b;

    public rb1(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.a = ze5.k(arrayList);
        this.b = ze5.k(arrayList2);
    }

    public final long a(ew ewVar, boolean z) {
        tv tvVarA;
        if (z) {
            tvVarA = new tv();
        } else {
            ewVar.getClass();
            tvVarA = ewVar.a();
        }
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                tvVarA.Y(38);
            }
            tvVarA.d0((String) list.get(i));
            tvVarA.Y(61);
            tvVarA.d0((String) this.b.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = tvVarA.o;
        tvVarA.b();
        return j;
    }

    @Override // defpackage.tz3
    public final long contentLength() {
        return a(null, true);
    }

    @Override // defpackage.tz3
    public final hu2 contentType() {
        return c;
    }

    @Override // defpackage.tz3
    public final void writeTo(ew ewVar) {
        ewVar.getClass();
        a(ewVar, false);
    }
}
