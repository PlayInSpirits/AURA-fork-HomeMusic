package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e60 implements ne0, Serializable {
    public final ne0 n;
    public final le0 o;

    public e60(le0 le0Var, ne0 ne0Var) {
        ne0Var.getClass();
        le0Var.getClass();
        this.n = ne0Var;
        this.o = le0Var;
    }

    @Override // defpackage.ne0
    public final ne0 J(ne0 ne0Var) {
        ne0Var.getClass();
        return ne0Var == q01.n ? this : (ne0) ne0Var.s(new d60(9, (byte) 0), this);
    }

    @Override // defpackage.ne0
    public final le0 K(me0 me0Var) {
        me0Var.getClass();
        while (true) {
            le0 le0VarK = this.o.K(me0Var);
            if (le0VarK != null) {
                return le0VarK;
            }
            ne0 ne0Var = this.n;
            if (!(ne0Var instanceof e60)) {
                return ne0Var.K(me0Var);
            }
            this = (e60) ne0Var;
        }
    }

    public final boolean equals(Object obj) {
        boolean zC;
        if (this == obj) {
            return true;
        }
        if (obj instanceof e60) {
            e60 e60Var = (e60) obj;
            int i = 2;
            e60 e60Var2 = e60Var;
            int i2 = 2;
            while (true) {
                ne0 ne0Var = e60Var2.n;
                e60Var2 = ne0Var instanceof e60 ? (e60) ne0Var : null;
                if (e60Var2 == null) {
                    break;
                }
                i2++;
            }
            e60 e60Var3 = this;
            while (true) {
                ne0 ne0Var2 = e60Var3.n;
                e60Var3 = ne0Var2 instanceof e60 ? (e60) ne0Var2 : null;
                if (e60Var3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    le0 le0Var = this.o;
                    if (!h12.c(e60Var.K(le0Var.getKey()), le0Var)) {
                        zC = false;
                        break;
                    }
                    ne0 ne0Var3 = this.n;
                    if (!(ne0Var3 instanceof e60)) {
                        ne0Var3.getClass();
                        le0 le0Var2 = (le0) ne0Var3;
                        zC = h12.c(e60Var.K(le0Var2.getKey()), le0Var2);
                        break;
                    }
                    this = (e60) ne0Var3;
                }
                if (zC) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.o.hashCode() + this.n.hashCode();
    }

    @Override // defpackage.ne0
    public final Object s(wf1 wf1Var, Object obj) {
        return wf1Var.invoke(this.n.s(wf1Var, obj), this.o);
    }

    public final String toString() {
        return "[" + ((String) s(new d60(0, (byte) 0), "")) + ']';
    }

    @Override // defpackage.ne0
    public final ne0 u(me0 me0Var) {
        me0Var.getClass();
        le0 le0Var = this.o;
        le0 le0VarK = le0Var.K(me0Var);
        ne0 ne0Var = this.n;
        if (le0VarK != null) {
            return ne0Var;
        }
        ne0 ne0VarU = ne0Var.u(me0Var);
        if (ne0VarU == ne0Var) {
            return this;
        }
        return ne0VarU == q01.n ? le0Var : new e60(le0Var, ne0VarU);
    }
}
