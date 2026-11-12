package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uz2 {
    public final yw a;
    public hu2 b;
    public final ArrayList c;

    public uz2() {
        String r0 = UUID.randomUUID().toString();
        r0.getClass();
        yw r1 = yw.q;
        this.a = pa.t(r0);
        this.b = wz2.e;
        this.c = new ArrayList();
    }

    public final void a(String r3, String r4, rd0 r5) {
        StringBuilder r0 = xa3.i("form-data; name=");
        hu2 r1 = wz2.e;
        l93.d(r0, r3);
        r0.append("; filename=");
        l93.d(r0, r4);
        String r6 = r0.toString();
        ArrayList r7 = new ArrayList(20);
        e35.G("Content-Disposition");
        r7.add("Content-Disposition");
        r7.add(qm4.K0(r6).toString());
        tl1 r8 = new tl1((String[]) r7.toArray(new String[0]));
        if (r8.a("Content-Type") == null) goto L5;
        kf2.n("Unexpected header: Content-Type");
        return;
    L5:
        if (r8.a("Content-Length") != null) goto L8;
        vz2 r9 = new vz2(r8, r5);
        this.c.add(r9);
        return;
    L8:
        kf2.n("Unexpected header: Content-Length");
    }

    public final wz2 b() {
        ArrayList r0 = this.c;
        if (r0.isEmpty() == true) goto L6;
        hu2 r2 = this.b;
        List r1 = ze5.k(r0);
        return new wz2(this.a, r2, r1);
    L6:
        kf2.o("Multipart body must have at least one part.");
        return null;
    }

    public final void c(hu2 r3) {
        r3.getClass();
        if (r3.b.equals("multipart") == false) goto L6;
        this.b = r3;
        return;
    L6:
        nz2.l(r3, "multipart != ");
    }
}
