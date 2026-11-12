package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rr extends ip {
    public final /* synthetic */ int b;
    public final int c;

    public rr(xb0 r2, int r3) {
        this.b = r3;
        r2.getClass();
        switch(r3) {
            case 2: goto L10;
            case 3: goto L8;
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        super(r2);
        this.c = 6;
        return;
    L6:
        super(r2);
        this.c = 9;
        return;
    L8:
        super(r2);
        this.c = 7;
        return;
    L10:
        super(r2);
        this.c = 7;
    }

    @Override // defpackage.jb0
    public final boolean c(dd5 r4) {
        int r3 = this.b;
        r4.getClass();
        switch(r3) {
            case 0: goto L23;
            case 1: goto L21;
            case 2: goto L16;
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        int r5 = r4.j.a;
        if (r5 != 3) goto L9;
        return true;
    L9:
        if (Build.VERSION.SDK_INT < 30) goto L14;
        if (r5 != 6) goto L14;
        return true;
    L14:
        return false;
    L5:
        return r4.j.f;
    L16:
        if (r4.j.a != 2) goto L19;
        return true;
    L19:
        return false;
    L21:
        return r4.j.e;
    L23:
        return r4.j.c;
    }

    @Override // defpackage.ip
    public final int d() {
        switch(this.b) {
            case 0: goto L13;
            case 1: goto L11;
            case 2: goto L9;
            case 3: goto L7;
            default: goto L5;
        };
    L5:
        return this.c;
    L7:
        return this.c;
    L9:
        return this.c;
    L11:
        return this.c;
    L13:
        return this.c;
    }

    @Override // defpackage.ip
    public final boolean e(Object r5) {
        switch(this.b) {
            case 0: goto L23;
            case 1: goto L22;
            case 2: goto L13;
            case 3: goto L7;
            default: goto L4;
        };
    L4:
        boolean r4 = ((Boolean) r5).booleanValue();
    L6:
        return !r4;
    L7:
        q53 r6 = (q53) r5;
        r6.getClass();
        if (r6.a == false) goto L12;
        if (r6.c == true) goto L12;
        return false;
    L12:
        return true;
    L13:
        q53 r7 = (q53) r5;
        r7.getClass();
        int r8 = Build.VERSION.SDK_INT;
        boolean r2 = r7.a;
        if (r8 < 26) goto L19;
        if (r2 == false) goto L21;
        if (r7.b == false) goto L21;
        return false;
    L21:
        return true;
    L19:
        if (r2 == false) goto L21;
        return false;
    L22:
        r4 = ((Boolean) r5).booleanValue();
        goto L6
    L23:
        r4 = ((Boolean) r5).booleanValue();
        goto L6
    }

    public rr(sr r2) {
        this.b = 1;
        r2.getClass();
        super(r2);
        this.c = 5;
    }
}
