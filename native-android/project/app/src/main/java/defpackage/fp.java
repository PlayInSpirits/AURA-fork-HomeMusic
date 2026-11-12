package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fp implements im {
    public gm b;
    public gm c;
    public gm d;
    public gm e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public fp() {
        ByteBuffer r0 = im.a;
        this.f = r0;
        this.g = r0;
        gm r1 = gm.e;
        this.d = r1;
        this.e = r1;
        this.b = r1;
        this.c = r1;
    }

    public abstract gm a(gm r1);

    @Override // defpackage.im
    public boolean b() {
        if (this.e == gm.e) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // defpackage.im
    public boolean c() {
        if (this.h == true) goto L5;
        return false;
    L5:
        if (this.g != im.a) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.im
    public ByteBuffer d() {
        ByteBuffer r0 = this.g;
        this.g = im.a;
        return r0;
    }

    @Override // defpackage.im
    public final gm f(gm r1) {
        this.d = r1;
        this.e = a(r1);
        if (b() == false) goto L7;
        return this.e;
    L7:
        return gm.e;
    }

    @Override // defpackage.im
    public final void flush() {
        this.g = im.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        i();
    }

    @Override // defpackage.im
    public final void g() {
        this.h = true;
        j();
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public final ByteBuffer l(int r2) {
        if (this.f.capacity() >= r2) goto L5;
        this.f = ByteBuffer.allocateDirect(r2).order(ByteOrder.nativeOrder());
    L6:
        ByteBuffer r3 = this.f;
        this.g = r3;
        return r3;
    L5:
        this.f.clear();
        goto L6
    }

    @Override // defpackage.im
    public final void reset() {
        ByteBuffer r0 = im.a;
        this.g = r0;
        this.h = false;
        this.f = r0;
        gm r1 = gm.e;
        this.d = r1;
        this.e = r1;
        this.b = r1;
        this.c = r1;
        k();
    }
}
