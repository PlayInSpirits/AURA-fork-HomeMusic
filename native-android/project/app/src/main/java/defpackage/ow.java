package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ow implements t04 {
    public final /* synthetic */ int a;
    public final vs b;

    public ow(int r1) {
        this.a = r1;
        switch(r1) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        this.b = new vs();
        return;
    L6:
        this.b = new vs();
    }

    @Override // defpackage.t04
    public final /* bridge */ /* synthetic */ boolean a(Object r1, db3 r2) {
        switch(this.a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        InputStream r3 = (InputStream) r1;
        return true;
    L7:
        ByteBuffer r4 = (ByteBuffer) r1;
        return true;
    }

    @Override // defpackage.t04
    public final q04 b(Object r2, int r3, int r4, db3 r5) {
        int r0 = this.a;
        vs r1 = this.b;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return r1.c(i3.e(vw.b((InputStream) r2)), r3, r4, r5);
    L7:
        return r1.c(i3.e((ByteBuffer) r2), r3, r4, r5);
    }
}
