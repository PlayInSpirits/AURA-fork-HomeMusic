package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w5 extends r5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j70 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ su3 d;

    public /* synthetic */ w5(j70 r1, String r2, su3 r3, int r4) {
        this.a = r4;
        this.b = r1;
        this.c = r2;
        this.d = r3;
    }

    @Override // defpackage.r5
    public final void a(Object r8) {
        int r0 = this.a;
        su3 r4 = this.d;
        String r5 = this.c;
        j70 r7 = this.b;
        switch(r0) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        ArrayList r1 = r7.d;
        Object r6 = r7.b.get(r5);
        if (r6 == null) goto L12;
        int r2 = ((Number) r6).intValue();
        r1.add(r5);
        r7.b(r2, r4, r8);     // Catch: Exception -> L9
        return;
    L9:
        e = move-exception;
        r1.remove(r5);
        throw e;
    L12:
        nz2.p("Attempting to launch an unregistered ActivityResultLauncher with contract ", r4, " and input ", r8, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        return;
    L14:
        ArrayList r3 = r7.d;
        Object r9 = r7.b.get(r5);
        if (r9 == null) goto L22;
        int r10 = ((Number) r9).intValue();
        r3.add(r5);
        r7.b(r10, r4, r8);     // Catch: Exception -> L19
        return;
    L19:
        e = move-exception;
        r3.remove(r5);
        throw e;
    L22:
        nz2.p("Attempting to launch an unregistered ActivityResultLauncher with contract ", r4, " and input ", r8, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }

    public void b() {
        this.b.e(this.c);
    }
}
