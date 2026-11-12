package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wd1 implements a83, fg1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ if1 b;

    public /* synthetic */ wd1(if1 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.fg1
    public final sf1 a() {
        int r0 = this.a;
        if1 r1 = this.b;
        switch(r0) {
            case 0: goto L17;
            case 1: goto L15;
            case 2: goto L13;
            case 3: goto L11;
            case 4: goto L9;
            case 5: goto L7;
            default: goto L5;
        };
    L5:
        return (o) r1;
    L7:
        return (x) r1;
    L9:
        return (zr1) r1;
    L11:
        return (o) r1;
    L13:
        return (x) r1;
    L15:
        return (o) r1;
    L17:
        return (ud1) r1;
    }

    @Override // defpackage.a83
    public final /* synthetic */ void b(Object r2) {
        int r0 = this.a;
        if1 r1 = this.b;
        switch(r0) {
            case 0: goto L16;
            case 1: goto L14;
            case 2: goto L12;
            case 3: goto L10;
            case 4: goto L8;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        ((o) r1).invoke(r2);
        return;
    L6:
        ((x) r1).invoke(r2);
        return;
    L8:
        ((zr1) r1).invoke(r2);
        return;
    L10:
        ((o) r1).invoke(r2);
        return;
    L12:
        ((x) r1).invoke(r2);
        return;
    L14:
        ((o) r1).invoke(r2);
        return;
    L16:
        ((ud1) r1).invoke(r2);
    }

    public final boolean equals(Object r4) {
        int r0 = this.a;
        if1 r3 = this.b;
        switch(r0) {
            case 0: goto L53;
            case 1: goto L45;
            case 2: goto L37;
            case 3: goto L29;
            case 4: goto L21;
            case 5: goto L13;
            default: goto L5;
        };
    L5:
        if ((r4 instanceof a83) == false) goto L11;
        if ((r4 instanceof fg1) == false) goto L11;
        if (((o) r3) != ((fg1) r4).a()) goto L11;
        return true;
    L11:
        return false;
    L13:
        if ((r4 instanceof a83) == false) goto L19;
        if ((r4 instanceof fg1) == false) goto L19;
        if (((x) r3) != ((fg1) r4).a()) goto L19;
        return true;
    L19:
        return false;
    L21:
        if ((r4 instanceof a83) == false) goto L27;
        if ((r4 instanceof fg1) == false) goto L27;
        if (((zr1) r3) != ((fg1) r4).a()) goto L27;
        return true;
    L27:
        return false;
    L29:
        if ((r4 instanceof a83) == false) goto L35;
        if ((r4 instanceof fg1) == false) goto L35;
        if (((o) r3) != ((fg1) r4).a()) goto L35;
        return true;
    L35:
        return false;
    L37:
        if ((r4 instanceof a83) == false) goto L43;
        if ((r4 instanceof fg1) == false) goto L43;
        if (((x) r3) != ((fg1) r4).a()) goto L43;
        return true;
    L43:
        return false;
    L45:
        if ((r4 instanceof a83) == false) goto L51;
        if ((r4 instanceof fg1) == false) goto L51;
        if (((o) r3) != ((fg1) r4).a()) goto L51;
        return true;
    L51:
        return false;
    L53:
        if ((r4 instanceof a83) == false) goto L59;
        if ((r4 instanceof fg1) == false) goto L59;
        if (((ud1) r3) != ((fg1) r4).a()) goto L59;
        return true;
    L59:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a;
        if1 r1 = this.b;
        switch(r0) {
            case 0: goto L17;
            case 1: goto L15;
            case 2: goto L13;
            case 3: goto L11;
            case 4: goto L9;
            case 5: goto L7;
            default: goto L5;
        };
    L5:
        return ((o) r1).hashCode();
    L7:
        return ((x) r1).hashCode();
    L9:
        return ((zr1) r1).hashCode();
    L11:
        return ((o) r1).hashCode();
    L13:
        return ((x) r1).hashCode();
    L15:
        return ((o) r1).hashCode();
    L17:
        return ((ud1) r1).hashCode();
    }
}
