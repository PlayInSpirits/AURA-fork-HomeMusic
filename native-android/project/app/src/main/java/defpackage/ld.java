package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ld implements q04 {
    public final /* synthetic */ int n;
    public final Object o;

    public ld(byte[] r2) {
        this.n = 1;
        h12.f(r2, "Argument must not be null");
        this.o = r2;
    }

    private final void a() {
    }

    private final void c() {
    }

    private final void f() {
    }

    @Override // defpackage.q04
    public final void b() {
        switch(this.n) {
            case 0: goto L5;
            case 1: goto L4;
            case 2: goto L4;
            default: goto L4;
        };
    L4:
        return;
    L5:
        i3.r((AnimatedImageDrawable) this.o);
        i3.B((AnimatedImageDrawable) this.o);
    }

    @Override // defpackage.q04
    public final int d() {
        switch(this.n) {
            case 0: goto L10;
            case 1: goto L9;
            case 2: goto L6;
            default: goto L5;
        };
    L6:
        return 1;
    L10:
        int r0 = i3.a((AnimatedImageDrawable) this.o);
        int r1 = i3.y((AnimatedImageDrawable) this.o) * r0;
        return (e35.w(Bitmap.Config.ARGB_8888) * r1) * 2;
    L5:
        return e35.v((Bitmap) this.o);
    L9:
        return ((byte[]) this.o).length;
    }

    @Override // defpackage.q04
    public final Class e() {
        switch(this.n) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L7;
            default: goto L4;
        };
    L4:
        return Bitmap.class;
    L8:
        return byte[].class;
    L10:
        return Drawable.class;
    L7:
        return ((File) this.o).getClass();
    }

    @Override // defpackage.q04
    public final Object get() {
        switch(this.n) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return (Bitmap) this.o;
    L7:
        return (File) this.o;
    L9:
        return (byte[]) this.o;
    L11:
        return (AnimatedImageDrawable) this.o;
    }

    public /* synthetic */ ld(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    public ld(File r2) {
        this.n = 2;
        h12.f(r2, "Argument must not be null");
        this.o = r2;
    }
}
