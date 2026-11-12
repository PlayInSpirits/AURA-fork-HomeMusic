package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class t23 extends r23 implements Iterable, x32 {
    public static final /* synthetic */ int A = 0;
    public final mj4 x;
    public int y;
    public String z;

    public t23(u23 r2) {
        super(r2);
        this.x = new mj4(0);
    }

    @Override // defpackage.r23
    public final p23 e(ik r2) {
        return i(r2, false, this);
    }

    @Override // defpackage.r23
    public final boolean equals(Object r5) {
        if (this == r5) goto L20;
        if (r5 != null) goto L6;
        return false;
    L6:
        if ((r5 instanceof t23) == true) goto L9;
        return false;
    L9:
        if (super.equals(r5) == false) goto L28;
        mj4 r0 = this.x;
        int r1 = r0.e();
        t23 r6 = (t23) r5;
        mj4 r2 = r6.x;
        if (r1 == r2.e()) goto L13;
        return false;
    L13:
        if (this.y != r6.y) goto L30;
        Iterator r4 = ((gb0) fa4.b0(new x0(2, r0))).iterator();
    L16:
        if (r4.hasNext() == false) goto L27;
        r23 r7 = (r23) r4.next();
        if (r7.equals(r2.b(r7.u)) == true) goto L16;
        return false;
    L27:
        return true;
    L30:
        return false;
    L28:
        return false;
    L20:
        return true;
    }

    @Override // defpackage.r23
    public final void f(Context r3, AttributeSet r4) {
        super.f(r3, r4);
        TypedArray r5 = r3.getResources().obtainAttributes(r4, zs3.d);
        r5.getClass();
        int r0 = r5.getResourceId(0, 0);
        if (r0 == this.u) goto L14;
        this.y = r0;
        this.z = null;
        if (r0 > 16777215) goto L15;
        String r6 = String.valueOf(r0);
    L11:
        this.z = r6;
        r5.recycle();
        return;
    L15:
        r6 = r3.getResources().getResourceName(r0);     // Catch: Resources.NotFoundException -> L9
    L10:
        r6.getClass();
    L9:
        r6 = String.valueOf(r0);
        goto L10
    L14:
        throw new IllegalArgumentException(("Start destination " + r0 + " cannot use the same id as the graph " + this).toString());
    }

    public final void g(r23 r5) {
        r5.getClass();
        int r0 = r5.u;
        String r1 = r5.v;
        if (r0 != 0) goto L8;
        if (r1 != null) goto L8;
        kf2.n("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        return;
    L8:
        String r2 = this.v;
        if (r2 == null) goto L16;
        if (h12.c(r1, r2) == false) goto L16;
        nz2.v("Destination ", r5, " cannot have the same route as graph ", this);
        return;
    L16:
        if (r0 == this.u) goto L28;
        mj4 r3 = this.x;
        r23 r4 = (r23) r3.b(r0);
        if (r4 != r5) goto L21;
        return;
    L21:
        if (r5.o != null) goto L26;
        if (r4 == null) goto L24;
        r4.o = null;
    L24:
        r5.o = this;
        r3.d(r5.u, r5);
        return;
    L26:
        kf2.o("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        return;
    L28:
        nz2.v("Destination ", r5, " cannot have the same id as graph ", this);
    }

    public final r23 h(int r6, r23 r7, r23 r8, boolean r9) {
        mj4 r0 = this.x;
        r23 r1 = (r23) r0.b(r6);
        if (r8 != null) goto L5;
        if (r1 == null) goto L12;
        return r1;
    L12:
        if (r9 == false) goto L25;
        Iterator r2 = ((gb0) fa4.b0(new x0(2, r0))).iterator();
    L15:
        if (r2.hasNext() == false) goto L24;
        r23 r3 = (r23) r2.next();
        if ((r3 instanceof t23) == true) goto L19;
    L21:
        r1 = null;
    L22:
        if (r1 == null) goto L15;
    L19:
        if (r3.equals(r7) == true) goto L21;
        r1 = ((t23) r3).h(r6, this, r8, true);
        goto L22
    L24:
        r1 = null;
    L25:
        if (r1 != null) goto L33;
        t23 r4 = this.o;
        if (r4 != null) goto L29;
    L32:
        return null;
    L29:
        if (r4.equals(r7) == true) goto L32;
        t23 r10 = this.o;
        r10.getClass();
        return r10.h(r6, this, r8, r9);
    L33:
        return r1;
    L5:
        if (h12.c(r1, r8) == true) goto L7;
    L9:
        r1 = null;
        goto L12
    L7:
        if (h12.c(r1.o, r8.o) == false) goto L9;
        return r1;
    }

    @Override // defpackage.r23
    public final int hashCode() {
        int r0 = this.y;
        mj4 r5 = this.x;
        int r1 = r5.e();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        int r3 = r5.c(r2);
        r0 = (((r0 * 31) + r3) * 31) + ((r23) r5.f(r2)).hashCode();
        r2 = r2 + 1;
        goto L3
    L5:
        return r0;
    }

    public final p23 i(ik r7, boolean r8, t23 r9) {
        p23 r0 = super.e(r7);
        ArrayList r1 = new ArrayList();
        s23 r2 = new s23(this);
    L3:
        p23 r4 = null;
        if (r2.hasNext() == false) goto L10;
        r23 r3 = (r23) r2.next();
        if (h12.c(r3, r9) == true) goto L8;
        r4 = r3.e(r7);
    L8:
        if (r4 == null) goto L3;
        r1.add(r4);
        goto L3
    L10:
        p23 r5 = (p23) q40.E0(r1);
        t23 r6 = this.o;
        if (r6 == null) goto L17;
        if (r8 == false) goto L17;
        if (r6.equals(r9) == true) goto L17;
        r4 = r6.i(r7, true, this);
    L17:
        return (p23) q40.E0(ti.i0(new p23[]{r0, r5, r4}));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new s23(this);
    }

    @Override // defpackage.r23
    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(super.toString());
        r23 r1 = h(this.y, this, null, false);
        r0.append(" startDestination=");
        if (r1 != null) goto L8;
        String r2 = this.z;
        if (r2 == null) goto L7;
        r0.append(r2);
    L10:
        return r0.toString();
    L7:
        r0.append("0x" + Integer.toHexString(this.y));
        goto L10
    L8:
        r0.append("{");
        r0.append(r1.toString());
        r0.append("}");
        goto L10
    }
}
