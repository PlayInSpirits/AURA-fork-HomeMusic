package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wd0 extends jp {
    private final ne0 _context;
    private transient vd0<Object> intercepted;

    public wd0(vd0 vd0Var) {
        this(vd0Var, vd0Var != null ? vd0Var.getContext() : null);
    }

    @Override // defpackage.vd0
    public ne0 getContext() {
        ne0 ne0Var = this._context;
        ne0Var.getClass();
        return ne0Var;
    }

    public final vd0<Object> intercepted() {
        vd0<Object> vd0Var = this.intercepted;
        if (vd0Var != null) {
            return vd0Var;
        }
        pe0 pe0Var = (pe0) getContext().K(fz0.R);
        vd0<Object> mr0Var = pe0Var != null ? new mr0(pe0Var, this) : this;
        this.intercepted = mr0Var;
        return mr0Var;
    }

    @Override // defpackage.jp
    public void releaseIntercepted() {
        vd0<Object> vd0Var = this.intercepted;
        if (vd0Var != null && vd0Var != this) {
            le0 le0VarK = getContext().K(fz0.R);
            le0VarK.getClass();
            mr0 mr0Var = (mr0) vd0Var;
            mr0Var.i();
            cz czVarL = mr0Var.l();
            if (czVarL != null) {
                czVarL.m();
            }
        }
        this.intercepted = z60.o;
    }

    public wd0(vd0 vd0Var, ne0 ne0Var) {
        super(vd0Var);
        this._context = ne0Var;
    }
}
