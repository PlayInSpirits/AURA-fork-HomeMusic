package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kq0 implements sh0 {
    public final Resources.Theme n;
    public final Resources o;
    public final jq0 p;
    public final int q;
    public Object r;

    public kq0(Resources.Theme r1, Resources r2, jq0 r3, int r4) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
    }

    @Override // defpackage.sh0
    public final Class a() {
        switch(this.p.a) {
            case 0: goto L6;
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        return InputStream.class;
    L5:
        return Drawable.class;
    L6:
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.sh0
    public final void c() {
        Object r0 = this.r;
        if (r0 == null) goto L14;
        switch(this.p.a) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L6;
        };     // Catch: IOException -> L10
    L6:
        ((InputStream) r0).close();     // Catch: IOException -> L10
    L11:
        return;
    L7:
        Drawable r1 = (Drawable) r0;     // Catch: IOException -> L10
        goto L11
    L8:
        ((AssetFileDescriptor) r0).close();     // Catch: IOException -> L10
    L15:
        return;
    }

    @Override // defpackage.sh0
    public final void cancel() {
    }

    @Override // defpackage.sh0
    public final void d(eq3 r5, rh0 r6) {
        jq0 r7 = this.p;     // Catch: Resources.NotFoundException -> L9
        Resources.Theme r0 = this.n;     // Catch: Resources.NotFoundException -> L9
        Resources r1 = this.o;     // Catch: Resources.NotFoundException -> L9
        int r2 = this.q;     // Catch: Resources.NotFoundException -> L9
        switch(r7.a) {
            case 0: goto L6;
            case 1: goto L5;
            default: goto L4;
        };     // Catch: Resources.NotFoundException -> L9
    L4:
        Object r8 = r1.openRawResource(r2);     // Catch: Resources.NotFoundException -> L9
    L7:
        this.r = r8;     // Catch: Resources.NotFoundException -> L9
        r6.f(r8);     // Catch: Resources.NotFoundException -> L9
        return;
    L5:
        Context r9 = r7.b;     // Catch: Resources.NotFoundException -> L9
        r8 = uc5.p(r9, r9, r2, r0);     // Catch: Resources.NotFoundException -> L9
        goto L7
    L6:
        r8 = r1.openRawResourceFd(r2);     // Catch: Resources.NotFoundException -> L9
    L9:
        e = move-exception;
        r6.b(e);
    }

    @Override // defpackage.sh0
    public final int e() {
        return 1;
    }
}
