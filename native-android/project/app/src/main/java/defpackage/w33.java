package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w33 {
    public final nl4 a = ya4.a(x33.p);
    public final nl4 b;
    public final vu3 c;
    public final ii d;
    public final ii e;
    public u83 f;
    public int g;
    public v33 h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public w33() {
        nl4 nl4VarA = ya4.a(new u33());
        this.b = nl4VarA;
        this.c = new vu3(nl4VarA);
        this.d = new ii();
        this.e = new ii();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(bq4 bq4Var, v33 v33Var, int i) {
        LinkedHashSet linkedHashSet;
        boolean z;
        bq4Var.getClass();
        if (v33Var.a != null) {
            StringBuilder sb = new StringBuilder("Input '");
            sb.append(v33Var);
            bq4 bq4Var2 = v33Var.a;
            sb.append("' is already added to dispatcher ");
            sb.append(bq4Var2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (i != 0) {
            linkedHashSet = i != 1 ? this.i : this.j;
        } else {
            linkedHashSet = this.k;
        }
        linkedHashSet.add(v33Var);
        v33Var.a = bq4Var;
        ((u33) this.c.n.getValue()).getClass();
        if (i != 0) {
            z = i != 1 ? this.n : this.l;
        } else {
            z = this.m;
        }
        v33Var.b(z);
    }

    public final void b() {
        boolean z;
        boolean z2;
        u33 u33Var;
        ii iiVar = this.d;
        if (iiVar != null && iiVar.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = iiVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((u83) it.next()).b) {
                z = true;
                break;
            }
        }
        ii iiVar2 = this.e;
        if (iiVar2 != null && iiVar2.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it2 = iiVar2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            } else if (((u83) it2.next()).b) {
                z2 = true;
                break;
            }
        }
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        LinkedHashSet linkedHashSet = this.k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((v33) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((v33) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((v33) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        u83 u83VarC = this.f;
        if (u83VarC == null) {
            u83VarC = c(0);
        }
        u83 u83VarC2 = this.f;
        if (u83VarC2 == null) {
            u83VarC2 = c(0);
        }
        if (h12.c(u83VarC2, u83VarC)) {
            if (u83VarC2 == null) {
                u33Var = new u33();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = iiVar.iterator();
                while (it6.hasNext()) {
                    ((u83) it6.next()).getClass();
                }
                Iterator<E> it7 = iiVar2.iterator();
                while (it7.hasNext()) {
                    ((u83) it7.next()).getClass();
                }
                w83 w83Var = u83VarC2.a;
                qb2 qb2VarR = gb.r();
                v40.n0(arrayList, qb2VarR);
                qb2VarR.add(w83Var);
                v40.n0(u01.n, qb2VarR);
                u33Var = new u33(gb.f(qb2VarR), arrayList.size());
            }
            nl4 nl4Var = this.b;
            if (h12.c((u33) nl4Var.getValue(), u33Var)) {
                return;
            }
            nl4Var.j(null, u33Var);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((v33) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((v33) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((v33) it10.next()).getClass();
            }
        }
    }

    public final u83 c(int i) {
        Object next;
        Object next2;
        ii iiVar = this.e;
        ii iiVar2 = this.d;
        Object obj = null;
        if (i == -1) {
            Iterator it = iiVar2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((u83) next).b);
            u83 u83Var = (u83) next;
            if (u83Var != null) {
                return u83Var;
            }
            for (Object obj2 : iiVar) {
                if (((u83) obj2).b) {
                    obj = obj2;
                    break;
                }
            }
            return (u83) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it2 = iiVar2.iterator();
            while (it2.hasNext()) {
                ((u83) it2.next()).getClass();
            }
            Iterator it3 = iiVar.iterator();
            while (it3.hasNext()) {
                ((u83) it3.next()).getClass();
            }
            return null;
        }
        Iterator it4 = iiVar2.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!((u83) next2).b);
        u83 u83Var2 = (u83) next2;
        if (u83Var2 != null) {
            return u83Var2;
        }
        for (Object obj3 : iiVar) {
            if (((u83) obj3).b) {
                obj = obj3;
                break;
            }
        }
        return (u83) obj;
    }
}
