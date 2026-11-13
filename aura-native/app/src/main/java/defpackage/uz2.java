package defpackage;

import java.util.ArrayList;
import java.util.UUID;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class uz2 {
    public final yw a;
    public hu2 b;
    public final ArrayList c;

    public uz2() {
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        yw ywVar = yw.q;
        this.a = pa.t(uuid);
        this.b = wz2.e;
        this.c = new ArrayList();
    }

    public final void a(String str, String str2, rd0 rd0Var) {
        StringBuilder i = xa3.i("form-data; name=");
        hu2 hu2Var = wz2.e;
        l93.d(i, str);
        i.append("; filename=");
        l93.d(i, str2);
        String sb = i.toString();
        ArrayList arrayList = new ArrayList(20);
        e35.G("Content-Disposition");
        arrayList.add("Content-Disposition");
        arrayList.add(qm4.K0(sb).toString());
        tl1 tl1Var = new tl1((String[]) arrayList.toArray(new String[0]));
        if (tl1Var.a("Content-Type") != null) {
            kf2.n("Unexpected header: Content-Type");
        } else if (tl1Var.a("Content-Length") != null) {
            kf2.n("Unexpected header: Content-Length");
        } else {
            this.c.add(new vz2(tl1Var, rd0Var));
        }
    }

    public final wz2 b() {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            kf2.o("Multipart body must have at least one part.");
            return null;
        }
        return new wz2(this.a, this.b, ze5.k(arrayList));
    }

    public final void c(hu2 hu2Var) {
        hu2Var.getClass();
        if (hu2Var.b.equals("multipart")) {
            this.b = hu2Var;
        } else {
            nz2.l(hu2Var, "multipart != ");
        }
    }
}
