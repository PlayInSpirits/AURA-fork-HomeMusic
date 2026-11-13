package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class fm {
    public final yw1 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public fm(yw1 yw1Var) {
        this.a = yw1Var;
        gm gmVar = gm.e;
        this.d = false;
    }

    public final void a() {
        hm hmVar = hm.b;
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        long j = hmVar.a;
        int i = 0;
        while (true) {
            yw1 yw1Var = this.a;
            if (i >= yw1Var.size()) {
                break;
            }
            im imVar = (im) yw1Var.get(i);
            new hm(j);
            imVar.flush();
            if (imVar.b()) {
                j = imVar.h(j);
                rr2.w(j >= 0);
                arrayList.add(imVar);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= b(); i2++) {
            this.c[i2] = ((im) arrayList.get(i2)).d();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        return this.d && ((im) this.b.get(b())).c() && !this.c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= b()) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    im imVar = (im) arrayList.get(i);
                    if (!imVar.c()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : im.a;
                        long remaining = byteBuffer2.remaining();
                        imVar.e(byteBuffer2);
                        this.c[i] = imVar.d();
                        z |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < b()) {
                        ((im) arrayList.get(i + 1)).g();
                    }
                }
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm)) {
            return false;
        }
        yw1 yw1Var = ((fm) obj).a;
        yw1 yw1Var2 = this.a;
        if (yw1Var2.size() != yw1Var.size()) {
            return false;
        }
        for (int i = 0; i < yw1Var2.size(); i++) {
            if (yw1Var2.get(i) != yw1Var.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
