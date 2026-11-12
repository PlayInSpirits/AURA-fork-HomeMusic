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

    public t23(u23 u23Var) {
        super(u23Var);
        this.x = new mj4(0);
    }

    @Override // defpackage.r23
    public final p23 e(ik ikVar) {
        return i(ikVar, false, this);
    }

    @Override // defpackage.r23
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t23) || !super.equals(obj)) {
            return false;
        }
        mj4 mj4Var = this.x;
        int iE = mj4Var.e();
        t23 t23Var = (t23) obj;
        mj4 mj4Var2 = t23Var.x;
        if (iE != mj4Var2.e() || this.y != t23Var.y) {
            return false;
        }
        for (r23 r23Var : (gb0) fa4.b0(new x0(2, mj4Var))) {
            if (!r23Var.equals(mj4Var2.b(r23Var.u))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.r23
    public final void f(Context context, AttributeSet attributeSet) {
        String strValueOf;
        super.f(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, zs3.d);
        typedArrayObtainAttributes.getClass();
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        if (resourceId == this.u) {
            throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + this).toString());
        }
        this.y = resourceId;
        this.z = null;
        if (resourceId <= 16777215) {
            strValueOf = String.valueOf(resourceId);
        } else {
            try {
                strValueOf = context.getResources().getResourceName(resourceId);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(resourceId);
            }
            strValueOf.getClass();
        }
        this.z = strValueOf;
        typedArrayObtainAttributes.recycle();
    }

    public final void g(r23 r23Var) {
        r23Var.getClass();
        int i = r23Var.u;
        String str = r23Var.v;
        if (i == 0 && str == null) {
            kf2.n("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            return;
        }
        String str2 = this.v;
        if (str2 != null && h12.c(str, str2)) {
            nz2.v("Destination ", r23Var, " cannot have the same route as graph ", this);
            return;
        }
        if (i == this.u) {
            nz2.v("Destination ", r23Var, " cannot have the same id as graph ", this);
            return;
        }
        mj4 mj4Var = this.x;
        r23 r23Var2 = (r23) mj4Var.b(i);
        if (r23Var2 == r23Var) {
            return;
        }
        if (r23Var.o != null) {
            kf2.o("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            return;
        }
        if (r23Var2 != null) {
            r23Var2.o = null;
        }
        r23Var.o = this;
        mj4Var.d(r23Var.u, r23Var);
    }

    public final r23 h(int i, r23 r23Var, r23 r23Var2, boolean z) {
        mj4 mj4Var = this.x;
        r23 r23VarH = (r23) mj4Var.b(i);
        if (r23Var2 != null) {
            if (h12.c(r23VarH, r23Var2) && h12.c(r23VarH.o, r23Var2.o)) {
                return r23VarH;
            }
            r23VarH = null;
        } else if (r23VarH != null) {
            return r23VarH;
        }
        if (z) {
            Iterator it = ((gb0) fa4.b0(new x0(2, mj4Var))).iterator();
            do {
                if (!it.hasNext()) {
                    r23VarH = null;
                    break;
                }
                r23 r23Var3 = (r23) it.next();
                r23VarH = (!(r23Var3 instanceof t23) || r23Var3.equals(r23Var)) ? null : ((t23) r23Var3).h(i, this, r23Var2, true);
            } while (r23VarH == null);
        }
        if (r23VarH != null) {
            return r23VarH;
        }
        t23 t23Var = this.o;
        if (t23Var == null || t23Var.equals(r23Var)) {
            return null;
        }
        t23 t23Var2 = this.o;
        t23Var2.getClass();
        return t23Var2.h(i, this, r23Var2, z);
    }

    @Override // defpackage.r23
    public final int hashCode() {
        int iC = this.y;
        mj4 mj4Var = this.x;
        int iE = mj4Var.e();
        for (int i = 0; i < iE; i++) {
            iC = (((iC * 31) + mj4Var.c(i)) * 31) + ((r23) mj4Var.f(i)).hashCode();
        }
        return iC;
    }

    public final p23 i(ik ikVar, boolean z, t23 t23Var) {
        p23 p23VarI;
        p23 p23VarE = super.e(ikVar);
        ArrayList arrayList = new ArrayList();
        s23 s23Var = new s23(this);
        while (true) {
            p23VarI = null;
            if (!s23Var.hasNext()) {
                break;
            }
            r23 r23Var = (r23) s23Var.next();
            p23VarI = h12.c(r23Var, t23Var) ? null : r23Var.e(ikVar);
            if (p23VarI != null) {
                arrayList.add(p23VarI);
            }
        }
        p23 p23Var = (p23) q40.E0(arrayList);
        t23 t23Var2 = this.o;
        if (t23Var2 != null && z && !t23Var2.equals(t23Var)) {
            p23VarI = t23Var2.i(ikVar, true, this);
        }
        return (p23) q40.E0(ti.i0(new p23[]{p23VarE, p23Var, p23VarI}));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new s23(this);
    }

    @Override // defpackage.r23
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        r23 r23VarH = h(this.y, this, null, false);
        sb.append(" startDestination=");
        if (r23VarH == null) {
            String str = this.z;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x" + Integer.toHexString(this.y));
            }
        } else {
            sb.append("{");
            sb.append(r23VarH.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
