package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fv3 extends n14 {
    public final /* synthetic */ int n;
    public final long o;
    public final Object p;
    public final fw q;

    public /* synthetic */ fv3(Object obj, long j, fw fwVar, int i) {
        this.n = i;
        this.p = obj;
        this.o = j;
        this.q = fwVar;
    }

    @Override // defpackage.n14
    public final long contentLength() {
        switch (this.n) {
            case 0:
                break;
        }
        return this.o;
    }

    @Override // defpackage.n14
    public final hu2 contentType() {
        int i = this.n;
        Object obj = this.p;
        switch (i) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                try {
                    return ve5.a(str);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            default:
                return (hu2) obj;
        }
    }

    @Override // defpackage.n14
    public final fw source() {
        int i = this.n;
        fw fwVar = this.q;
        switch (i) {
            case 0:
                return (xu3) fwVar;
            default:
                return fwVar;
        }
    }
}
