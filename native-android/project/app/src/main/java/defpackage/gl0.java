package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gl0 implements wv1 {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(fl0 fl0Var, qj0 qj0Var) {
        try {
            int iB = fl0Var.b();
            if ((iB & 65496) == 65496 || iB == 19789 || iB == 18761) {
                int iG = g(fl0Var);
                if (iG != -1) {
                    byte[] bArr = (byte[]) qj0Var.d(iG, byte[].class);
                    try {
                        return h(fl0Var, bArr, iG);
                    } finally {
                        qj0Var.h(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iB);
                return -1;
            }
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType f(fl0 fl0Var) {
        try {
            int iB = fl0Var.b();
            if (iB == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iD = (iB << 8) | fl0Var.d();
            if (iD == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iD2 = (iD << 8) | fl0Var.d();
            if (iD2 == -1991225785) {
                fl0Var.skip(21L);
                try {
                    return fl0Var.d() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iD2 == 1380533830) {
                fl0Var.skip(4L);
                if (((fl0Var.b() << 16) | fl0Var.b()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iB2 = (fl0Var.b() << 16) | fl0Var.b();
                if ((iB2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iB2 & 255;
                if (i != 88) {
                    if (i != 76) {
                        return ImageHeaderParser$ImageType.WEBP;
                    }
                    fl0Var.skip(4L);
                    return (fl0Var.d() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                fl0Var.skip(4L);
                short sD = fl0Var.d();
                if ((sD & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                return (sD & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((fl0Var.b() << 16) | fl0Var.b()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iB3 = (fl0Var.b() << 16) | fl0Var.b();
            if (iB3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iB3 == 1635150182;
            fl0Var.skip(4L);
            int i3 = iD2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iB4 = (fl0Var.b() << 16) | fl0Var.b();
                    if (iB4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iB4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int g(fl0 fl0Var) {
        short sD;
        int iB;
        long j;
        long jSkip;
        do {
            short sD2 = fl0Var.d();
            if (sD2 == 255) {
                sD = fl0Var.d();
                if (sD != 218) {
                    if (sD != 217) {
                        iB = fl0Var.b() - 2;
                        if (sD == 225) {
                            return iB;
                        }
                        j = iB;
                        jSkip = fl0Var.skip(j);
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                        return -1;
                    }
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) sD2));
                return -1;
            }
            return -1;
        } while (jSkip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sbT = b11.t("Unable to skip enough data, type: ", ", wanted to skip: ", sD, iB, ", but actually skipped: ");
            sbT.append(jSkip);
            Log.d("DfltImageHeaderParser", sbT.toString());
        }
        return -1;
    }

    public static int h(fl0 fl0Var, byte[] bArr, int i) {
        ByteOrder byteOrder;
        int iE = fl0Var.e(i, bArr);
        short s = -1;
        if (iE == i) {
            int i2 = 0;
            byte[] bArr2 = a;
            boolean z = bArr != null && i > bArr2.length;
            if (z) {
                for (int i3 = 0; i3 < bArr2.length; i3++) {
                    if (bArr[i3] != bArr2[i3]) {
                        z = false;
                        break;
                    }
                }
            }
            if (!z) {
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                return -1;
            }
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
            short s2 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s2 != 18761) {
                if (s2 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s2));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i4 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i5 = i4 + 6;
            short s3 = byteBuffer.remaining() - i5 >= 2 ? byteBuffer.getShort(i5) : (short) -1;
            while (i2 < s3) {
                int i6 = (i2 * 12) + i4 + 8;
                short s4 = byteBuffer.remaining() - i6 >= 2 ? byteBuffer.getShort(i6) : s;
                if (s4 != 274) {
                    s = s;
                } else {
                    int i7 = i6 + 2;
                    short s5 = byteBuffer.remaining() - i7 >= 2 ? byteBuffer.getShort(i7) : s;
                    if (s5 < 1 || s5 > 12) {
                        s = s;
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s5));
                        }
                    } else {
                        int i8 = i6 + 4;
                        int i9 = byteBuffer.remaining() - i8 >= 4 ? byteBuffer.getInt(i8) : s;
                        if (i9 < 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                            s = s;
                        } else {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder sbT = b11.t("Got tagIndex=", " tagType=", i2, s4, " formatCode=");
                                sbT.append((int) s5);
                                sbT.append(" componentCount=");
                                sbT.append(i9);
                                Log.d("DfltImageHeaderParser", sbT.toString());
                            }
                            int i10 = i9 + b[s5];
                            if (i10 <= 4) {
                                int i11 = i6 + 8;
                                if (i11 >= 0 && i11 <= byteBuffer.remaining()) {
                                    if (i10 >= 0 && i10 + i11 <= byteBuffer.remaining()) {
                                        return byteBuffer.remaining() - i11 >= 2 ? byteBuffer.getShort(i11) : s;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s4));
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i11 + " tagType=" + ((int) s4));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s5));
                            }
                        }
                    }
                }
                i2++;
                s = s;
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iE);
            return -1;
        }
        return s;
    }

    @Override // defpackage.wv1
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        h12.f(byteBuffer, "Argument must not be null");
        return f(new tw(1, byteBuffer));
    }

    @Override // defpackage.wv1
    public final int b(InputStream inputStream, qj0 qj0Var) {
        zg5 zg5Var = new zg5(inputStream);
        h12.f(qj0Var, "Argument must not be null");
        return e(zg5Var, qj0Var);
    }

    @Override // defpackage.wv1
    public final int c(ByteBuffer byteBuffer, qj0 qj0Var) {
        tw twVar = new tw(1, byteBuffer);
        h12.f(qj0Var, "Argument must not be null");
        return e(twVar, qj0Var);
    }

    @Override // defpackage.wv1
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return f(new zg5(inputStream));
    }
}
