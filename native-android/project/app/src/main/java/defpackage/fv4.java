package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fv4 extends si0 {
    public final /* synthetic */ int g;
    public boolean h;
    public int i;
    public final /* synthetic */ Object j;

    public fv4(t75 t75Var) {
        this.g = 1;
        this.j = t75Var;
        this.h = false;
        this.i = 0;
    }

    @Override // defpackage.si0, defpackage.u75
    public void a() {
        switch (this.g) {
            case 0:
                this.h = true;
                break;
        }
    }

    @Override // defpackage.si0, defpackage.u75
    public final void b() {
        int i = this.g;
        Object obj = this.j;
        switch (i) {
            case 0:
                ((gv4) obj).a.setVisibility(0);
                break;
            default:
                if (!this.h) {
                    this.h = true;
                    u75 u75Var = ((t75) obj).d;
                    if (u75Var != null) {
                        u75Var.b();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.u75
    public final void c() {
        int i = this.g;
        Object obj = this.j;
        switch (i) {
            case 0:
                if (!this.h) {
                    ((gv4) obj).a.setVisibility(this.i);
                }
                break;
            default:
                int i2 = this.i + 1;
                this.i = i2;
                t75 t75Var = (t75) obj;
                if (i2 == t75Var.a.size()) {
                    u75 u75Var = t75Var.d;
                    if (u75Var != null) {
                        u75Var.c();
                    }
                    this.i = 0;
                    this.h = false;
                    t75Var.e = false;
                }
                break;
        }
    }

    public fv4(gv4 gv4Var, int i) {
        this.g = 0;
        this.j = gv4Var;
        this.i = i;
        this.h = false;
    }
}
