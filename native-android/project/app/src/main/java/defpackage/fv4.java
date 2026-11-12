package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fv4 extends si0 {
    public final /* synthetic */ int g;
    public boolean h;
    public int i;
    public final /* synthetic */ Object j;

    public fv4(t75 r2) {
        this.g = 1;
        this.j = r2;
        this.h = false;
        this.i = 0;
    }

    @Override // defpackage.si0, defpackage.u75
    public void a() {
        switch(this.g) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        this.h = true;
    }

    @Override // defpackage.si0, defpackage.u75
    public final void b() {
        int r0 = this.g;
        Object r1 = this.j;
        switch(r0) {
            case 0: goto L11;
            default: goto L5;
        };
    L11:
        ((gv4) r1).a.setVisibility(0);
        return;
    L5:
        if (this.h == true) goto L14;
        this.h = true;
        u75 r2 = ((t75) r1).d;
        if (r2 == null) goto L13;
        r2.b();
        return;
    L13:
        return;
    }

    @Override // defpackage.u75
    public final void c() {
        int r0 = this.g;
        Object r1 = this.j;
        switch(r0) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        int r2 = this.i + 1;
        this.i = r2;
        t75 r3 = (t75) r1;
        if (r2 != r3.a.size()) goto L15;
        u75 r4 = r3.d;
        if (r4 == null) goto L9;
        r4.c();
    L9:
        this.i = 0;
        this.h = false;
        r3.e = false;
        return;
    L15:
        return;
    L12:
        if (this.h == true) goto L16;
        ((gv4) r1).a.setVisibility(this.i);
        return;
    }

    public fv4(gv4 r2, int r3) {
        this.g = 0;
        this.j = r2;
        this.i = r3;
        this.h = false;
    }
}
