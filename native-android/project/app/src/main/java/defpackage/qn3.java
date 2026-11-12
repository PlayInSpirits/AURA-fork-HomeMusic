package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qn3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public qn3(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn3)) {
            return false;
        }
        qn3 qn3Var = (qn3) obj;
        return vr1.n(this.a, qn3Var.a) && this.b == qn3Var.b && g83.b(this.c, qn3Var.c) && g83.b(this.d, qn3Var.d) && this.e == qn3Var.e && Float.compare(this.f, qn3Var.f) == 0 && this.g == qn3Var.g && this.h == qn3Var.h && this.i.equals(qn3Var.i) && g83.b(this.j, qn3Var.j) && Float.compare(this.k, qn3Var.k) == 0 && g83.b(this.l, qn3Var.l) && g83.b(this.m, qn3Var.m);
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + xa3.b(b11.d(xa3.b((this.i.hashCode() + xa3.c(f34.d(this.g, b11.d(xa3.c(xa3.b(xa3.b(xa3.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31), 31), 31, this.h)) * 31, 31, this.j), this.k, 31), 31, this.l);
    }

    public final String toString() {
        String strH = vr1.H(this.a);
        String strG = g83.g(this.c);
        String strG2 = g83.g(this.d);
        String strA = un3.a(this.g);
        String strG3 = g83.g(this.j);
        String strG4 = g83.g(this.l);
        String strG5 = g83.g(this.m);
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append(strH);
        sb.append(", uptime=");
        sb.append(this.b);
        f34.n(sb, ", positionOnScreen=", strG, ", position=", strG2);
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(strA);
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append(strG3);
        sb.append(", scaleGestureFactor=");
        sb.append(this.k);
        sb.append(", panGestureOffset=");
        sb.append(strG4);
        sb.append(", originalEventPosition=");
        sb.append(strG5);
        sb.append(")");
        return sb.toString();
    }
}
