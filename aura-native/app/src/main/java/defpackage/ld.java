/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import defpackage.e35;
import defpackage.h12;
import defpackage.i3;
import defpackage.q04;
import java.io.File;

public final class ld
implements q04 {
    public final int n;
    public final Object o;

    public ld(int n16, Object object) {
        this.n = n16;
        this.o = object;
    }

    public ld(File file) {
        this.n = 2;
        h12.f(file, "Argument must not be null");
        this.o = file;
    }

    public ld(byte[] byArray) {
        this.n = 1;
        h12.f(byArray, "Argument must not be null");
        this.o = byArray;
    }

    private final void a() {
    }

    private final void c() {
    }

    private final void f() {
    }

    @Override
    public final void b() {
        switch (this.n) {
            default: {
                return;
            }
            case 0: 
        }
        i3.r((AnimatedImageDrawable)this.o);
        i3.B((AnimatedImageDrawable)this.o);
    }

    @Override
    public final int d() {
        switch (this.n) {
            default: {
                return e35.v((Bitmap)this.o);
            }
            case 2: {
                return 1;
            }
            case 1: {
                return ((byte[])this.o).length;
            }
            case 0: 
        }
        int n16 = i3.a((AnimatedImageDrawable)this.o);
        int n17 = i3.y((AnimatedImageDrawable)this.o);
        return e35.w(Bitmap.Config.ARGB_8888) * (n17 * n16) * 2;
    }

    @Override
    public final Class e() {
        switch (this.n) {
            default: {
                return Bitmap.class;
            }
            case 2: {
                return ((File)this.o).getClass();
            }
            case 1: {
                return byte[].class;
            }
            case 0: 
        }
        return Drawable.class;
    }

    @Override
    public final Object get() {
        switch (this.n) {
            default: {
                return (Bitmap)this.o;
            }
            case 2: {
                return (File)this.o;
            }
            case 1: {
                return (byte[])this.o;
            }
            case 0: 
        }
        return (AnimatedImageDrawable)this.o;
    }
}

