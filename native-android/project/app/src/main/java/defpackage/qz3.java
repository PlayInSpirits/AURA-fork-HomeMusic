package defpackage;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qz3 extends tz3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hu2 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qz3(hu2 r1, Object r2, int r3) {
        this.a = r3;
        this.b = r1;
        this.c = r2;
    }

    @Override // defpackage.tz3
    public long contentLength() {
        switch(this.a) {
            case 0: goto L9;
            case 1: goto L5;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return super.contentLength();
    L7:
        return ((yw) this.c).d();
    L9:
        return ((File) this.c).length();
    }

    @Override // defpackage.tz3
    public final hu2 contentType() {
        switch(this.a) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return this.b;
    L7:
        return this.b;
    L9:
        return this.b;
    }

    @Override // defpackage.tz3
    public boolean isOneShot() {
        switch(this.a) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        return true;
    L5:
        return super.isOneShot();
    }

    @Override // defpackage.tz3
    public final void writeTo(ew r4) {
        int r0 = this.a;
        int r1 = 1;
        Object r3 = this.c;
        r4.getClass();
        switch(r0) {
            case 0: goto L15;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        r4.A((yw) r3);
        return;
    L6:
        FileInputStream r2 = new FileInputStream((FileDescriptor) r3);
        tv r5 = r4.a();     // Catch: Throwable -> L10
        Logger r6 = p83.a;     // Catch: Throwable -> L10
        r5.p(new tk(r1, r2, new fu4()));     // Catch: Throwable -> L10
        r2.close();
        return;
    L10:
        th = move-exception;
        throw th;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        q05.h(r2, th);
        throw th;
    L15:
        File r7 = (File) r3;
        Logger r8 = p83.a;
        r7.getClass();
        tk r9 = new tk(r1, new FileInputStream(r7), fu4.d);
        r4.p(r9);     // Catch: Throwable -> L19
        r9.close();
        return;
    L19:
        th = move-exception;
        throw th;     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        q05.h(r9, th);
        throw th;
    }
}
