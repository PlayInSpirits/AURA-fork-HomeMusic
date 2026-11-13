package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class gz {
    public gz() {
        super();
    }

    public boolean a;
    public fz b;
    public boolean c;

    public final void a(fz fzVar) {
        synchronized (this) {
            while (this.c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.b == fzVar) {
                return;
            }
            this.b = fzVar;
            if (this.a) {
                fzVar.onCancel();
            }
        }
    }
}
