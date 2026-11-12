package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ht1 implements a83, fg1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ if1 b;

    public /* synthetic */ ht1(if1 if1Var, int i) {
        this.a = i;
        this.b = if1Var;
    }

    @Override // defpackage.fg1
    public final sf1 a() {
        int i = this.a;
        return this.b;
    }

    @Override // defpackage.a83
    public final /* synthetic */ void b(Object obj) {
        int i = this.a;
        if1 if1Var = this.b;
        switch (i) {
            case 0:
                if1Var.invoke(obj);
                break;
            case 1:
                if1Var.invoke(obj);
                break;
            default:
                if1Var.invoke(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        int i = this.a;
        if1 if1Var = this.b;
        switch (i) {
            case 0:
                if ((obj instanceof a83) && (obj instanceof fg1)) {
                    return if1Var.equals(((fg1) obj).a());
                }
                return false;
            case 1:
                if ((obj instanceof a83) && (obj instanceof fg1)) {
                    return if1Var.equals(((fg1) obj).a());
                }
                return false;
            default:
                if ((obj instanceof a83) && (obj instanceof fg1)) {
                    return if1Var.equals(((fg1) obj).a());
                }
                return false;
        }
    }

    public final int hashCode() {
        int i = this.a;
        if1 if1Var = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return if1Var.hashCode();
    }
}
