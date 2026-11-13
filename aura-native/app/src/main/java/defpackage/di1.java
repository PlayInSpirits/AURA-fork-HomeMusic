package defpackage;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class di1 {
    public ByteBuffer b;
    public ci1 c;
    public final byte[] a = new byte[256];
    public int d = 0;

    public final boolean a() {
        return this.c.b != 0;
    }

    public final ci1 b() {
        byte[] bArr;
        if (this.b == null) {
            kf2.o("You must call setData() before parseHeader()");
            return null;
        }
        if (a()) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) c());
        }
        boolean startsWith = sb.toString().startsWith("GIF");
        ci1 ci1Var = this.c;
        if (startsWith) {
            ci1Var.f = this.b.getShort();
            this.c.g = this.b.getShort();
            int c = c();
            ci1 ci1Var2 = this.c;
            ci1Var2.h = (c & 128) != 0;
            ci1Var2.i = (int) Math.pow(2.0d, (c & 7) + 1);
            this.c.j = c();
            ci1 ci1Var3 = this.c;
            c();
            ci1Var3.getClass();
            if (this.c.h && !a()) {
                ci1 ci1Var4 = this.c;
                ci1Var4.a = e(ci1Var4.i);
                ci1 ci1Var5 = this.c;
                ci1Var5.k = ci1Var5.a[ci1Var5.j];
            }
        } else {
            ci1Var.b = 1;
        }
        if (!a()) {
            boolean z = false;
            while (!z && !a() && this.c.c <= Integer.MAX_VALUE) {
                int c2 = c();
                if (c2 == 33) {
                    int c3 = c();
                    if (c3 == 1) {
                        f();
                    } else if (c3 == 249) {
                        this.c.d = new yh1();
                        c();
                        int c4 = c();
                        yh1 yh1Var = this.c.d;
                        int i2 = (c4 & 28) >> 2;
                        yh1Var.g = i2;
                        if (i2 == 0) {
                            yh1Var.g = 1;
                        }
                        yh1Var.f = (c4 & 1) != 0;
                        short s = this.b.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        yh1 yh1Var2 = this.c.d;
                        yh1Var2.i = s * 10;
                        yh1Var2.h = c();
                        c();
                    } else if (c3 == 254) {
                        f();
                    } else if (c3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.a;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.c.getClass();
                                }
                                if (this.d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (c2 == 44) {
                    ci1 ci1Var6 = this.c;
                    if (ci1Var6.d == null) {
                        ci1Var6.d = new yh1();
                    }
                    ci1Var6.d.a = this.b.getShort();
                    this.c.d.b = this.b.getShort();
                    this.c.d.c = this.b.getShort();
                    this.c.d.d = this.b.getShort();
                    int c5 = c();
                    boolean z2 = (c5 & 128) != 0;
                    int pow = (int) Math.pow(2.0d, (c5 & 7) + 1);
                    yh1 yh1Var3 = this.c.d;
                    yh1Var3.e = (c5 & 64) != 0;
                    if (z2) {
                        yh1Var3.k = e(pow);
                    } else {
                        yh1Var3.k = null;
                    }
                    this.c.d.j = this.b.position();
                    c();
                    f();
                    if (!a()) {
                        ci1 ci1Var7 = this.c;
                        ci1Var7.c++;
                        ci1Var7.e.add(ci1Var7.d);
                    }
                } else if (c2 != 59) {
                    this.c.b = 1;
                } else {
                    z = true;
                }
            }
            ci1 ci1Var8 = this.c;
            if (ci1Var8.c < 0) {
                ci1Var8.b = 1;
            }
        }
        return this.c;
    }

    public final int c() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void d() {
        int c = c();
        this.d = c;
        if (c <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                i2 = this.d;
                if (i >= i2) {
                    return;
                }
                i2 -= i;
                this.b.get(this.a, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder t = b11.t("Error Reading Block n: ", " count: ", i, i2, " blockSize: ");
                    t.append(this.d);
                    Log.d("GifHeaderParser", t.toString(), e);
                }
                this.c.b = 1;
                return;
            }
        }
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.c.b = 1;
            return iArr;
        }
    }

    public final void f() {
        int c;
        do {
            c = c();
            this.b.position(Math.min(this.b.position() + c, this.b.limit()));
        } while (c > 0);
    }
}
