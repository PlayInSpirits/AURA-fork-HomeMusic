package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wz2 extends tz3 {
    public static final hu2 e = ve5.a("multipart/mixed");
    public static final hu2 f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public final yw a;
    public final List b;
    public final hu2 c;
    public long d;

    static {
        ve5.a("multipart/alternative");
        ve5.a("multipart/digest");
        ve5.a("multipart/parallel");
        f = ve5.a("multipart/form-data");
        g = new byte[]{58, 32};
        h = new byte[]{13, 10};
        i = new byte[]{45, 45};
    }

    public wz2(yw ywVar, hu2 hu2Var, List list) {
        ywVar.getClass();
        hu2Var.getClass();
        this.a = ywVar;
        this.b = list;
        this.c = ve5.a(hu2Var + "; boundary=" + ywVar.q());
        this.d = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(ew ewVar, boolean z) {
        tv tvVar;
        ew tvVar2;
        if (z) {
            tvVar2 = new tv();
            tvVar = tvVar2;
        } else {
            tvVar = 0;
            tvVar2 = ewVar;
        }
        List list = this.b;
        int size = list.size();
        long j = 0;
        int i2 = 0;
        while (true) {
            yw ywVar = this.a;
            byte[] bArr = i;
            byte[] bArr2 = h;
            if (i2 >= size) {
                tvVar2.getClass();
                tvVar2.write(bArr);
                tvVar2.A(ywVar);
                tvVar2.write(bArr);
                tvVar2.write(bArr2);
                if (!z) {
                    return j;
                }
                tvVar.getClass();
                long j2 = j + tvVar.o;
                tvVar.b();
                return j2;
            }
            vz2 vz2Var = (vz2) list.get(i2);
            tl1 tl1Var = vz2Var.a;
            tz3 tz3Var = vz2Var.b;
            tvVar2.getClass();
            tvVar2.write(bArr);
            tvVar2.A(ywVar);
            tvVar2.write(bArr2);
            if (tl1Var != null) {
                int size2 = tl1Var.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    tvVar2.y(tl1Var.b(i3)).write(g).y(tl1Var.e(i3)).write(bArr2);
                }
            }
            hu2 hu2VarContentType = tz3Var.contentType();
            if (hu2VarContentType != null) {
                tvVar2.y("Content-Type: ").y(hu2VarContentType.a).write(bArr2);
            }
            long jContentLength = tz3Var.contentLength();
            if (jContentLength == -1 && z) {
                tvVar.getClass();
                tvVar.b();
                return -1L;
            }
            tvVar2.write(bArr2);
            if (z) {
                j += jContentLength;
            } else {
                tz3Var.writeTo(tvVar2);
            }
            tvVar2.write(bArr2);
            i2++;
        }
    }

    @Override // defpackage.tz3
    public final long contentLength() {
        long j = this.d;
        if (j != -1) {
            return j;
        }
        long jA = a(null, true);
        this.d = jA;
        return jA;
    }

    @Override // defpackage.tz3
    public final hu2 contentType() {
        return this.c;
    }

    @Override // defpackage.tz3
    public final boolean isOneShot() {
        List list = this.b;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((vz2) it.next()).b.isOneShot()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tz3
    public final void writeTo(ew ewVar) {
        ewVar.getClass();
        a(ewVar, false);
    }
}
