package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mw implements uw2 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ mw(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // defpackage.uw2
    public final boolean a(Object r2) {
        switch(this.a) {
            case 0: goto L15;
            case 1: goto L14;
            case 2: goto L11;
            default: goto L4;
        };
    L4:
        String r3 = (String) r2;
        if (r3.startsWith("http://") == false) goto L7;
        return true;
    L7:
        if (r3.startsWith("https://") == true) goto L18;
        return false;
    L18:
        return true;
    L11:
        File r4 = (File) r2;
        return true;
    L15:
        byte[] r5 = (byte[]) r2;
        return true;
    L14:
        return r2.toString().startsWith("data:image");
    }

    @Override // defpackage.uw2
    public final tw2 b(Object r2, int r3, int r4, db3 r5) {
        int r6 = this.a;
        Object r1 = this.b;
        switch(r6) {
            case 0: goto L16;
            case 1: goto L15;
            case 2: goto L12;
            default: goto L4;
        };
    L4:
        String r7 = (String) r2;
        if (r7.startsWith("http://") == true) goto L11;
        if (r7.startsWith("https://") == true) goto L11;
        return null;
    L11:
        return new tw2(new s73(r7), new zu1((o83) r1, r7));
    L12:
        File r8 = (File) r2;
        int r0 = 0;
        return new tw2(new s73(r8), new y61(r0, r8, (y41) r1));
    L16:
        byte[] r9 = (byte[]) r2;
        return new tw2(new s73(r9), new cu2(1, r9, (pa) r1));
    L15:
        return new tw2(new s73(r2), new cu2(r2.toString(), (i80) r1));
    }
}
