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
    public static final byte[] a = null;
    public static final int[] b = null;

    static {
        a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
        b = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    }

    public static int e(fl0 r7, qj0 r8) {
        int r2 = r7.b();     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L29
        if ((r2 & 65496) != 65496) goto L7;
    L15:
        int r0 = g(r7);     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L29
        if (r0 == (-1)) goto L18;
        byte[] r3 = (byte[]) r8.d(r0, byte[].class);     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L29
        int r9 = h(r7, r3, r0);     // Catch: Throwable -> L25
        r8.h(r3);     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L29
        return r9;
    L25:
        th = move-exception;
        r8.h(r3);     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L29
        throw th;     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L29
    L18:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L28;
        Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L29
        return -1;
    L7:
        if (r2 == 19789) goto L15;
        if (r2 == 18761) goto L15;
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L28;
        Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + r2);     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L29
        return -1;
    L28:
        return -1;
    }

    public static ImageHeaderParser$ImageType f(fl0 r8) {
        int r0 = r8.b();     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L82
        if (r0 == 65496) goto L5;
        int r1 = (r0 << 8) | r8.d();     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L82
        if (r1 == 4671814) goto L9;
        int r2 = (r1 << 8) | r8.d();     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L82
        if (r2 != (-1991225785)) goto L22;
        r8.skip(21);     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L82
        if (r8.d() < 3) goto L18;
        return ImageHeaderParser$ImageType.PNG_A;
    L18:
        return ImageHeaderParser$ImageType.PNG;
    L20:
        return ImageHeaderParser$ImageType.PNG;
    L22:
        if (r2 != 1380533830) goto L24;
        r8.skip(4);     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L82
        if (((r8.b() << 16) | r8.b()) != 1464156752) goto L55;
        int r3 = (r8.b() << 16) | r8.b();     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L82
        if ((r3 & (-256)) != 1448097792) goto L59;
        int r4 = r3 & 255;     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L82
        if (r4 != 88) goto L73;
        r8.skip(4);     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L82
        short r9 = r8.d();     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L82
        if ((r9 & 2) == 0) goto L67;
        return ImageHeaderParser$ImageType.ANIMATED_WEBP;
    L67:
        if ((r9 & 16) == 0) goto L71;
        return ImageHeaderParser$ImageType.WEBP_A;
    L71:
        return ImageHeaderParser$ImageType.WEBP;
    L73:
        if (r4 != 76) goto L81;
        r8.skip(4);     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L82
        if ((r8.d() & 8) == 0) goto L79;
        return ImageHeaderParser$ImageType.WEBP_A;
    L79:
        return ImageHeaderParser$ImageType.WEBP;
    L81:
        return ImageHeaderParser$ImageType.WEBP;
    L59:
        return ImageHeaderParser$ImageType.UNKNOWN;
    L55:
        return ImageHeaderParser$ImageType.UNKNOWN;
    L24:
        if (((r8.b() << 16) | r8.b()) != 1718909296) goto L26;
        int r5 = (r8.b() << 16) | r8.b();     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L82
        if (r5 == 1635150195) goto L30;
        int r6 = 0;
        if (r5 != 1635150182) goto L34;
        boolean r7 = true;
    L35:
        r8.skip(4);     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L82
        int r10 = r2 - 16;     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L82
        if ((r10 % 4) == 0) goto L38;
    L47:
        if (r7 == false) goto L51;
        return ImageHeaderParser$ImageType.AVIF;
    L51:
        return ImageHeaderParser$ImageType.UNKNOWN;
    L38:
        if (r6 >= 5) goto L47;
        if (r10 <= 0) goto L47;
        int r11 = (r8.b() << 16) | r8.b();     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L82
        if (r11 == 1635150195) goto L43;
        if (r11 != 1635150182) goto L46;
        r7 = true;
    L46:
        r6 = r6 + 1;     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L82
        r10 = r10 - 4;     // Catch: DefaultImageHeaderParser$Reader$EndOfFileException -> L82
        goto L38
    L43:
        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
    L34:
        r7 = false;
        goto L35
    L30:
        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
    L26:
        return ImageHeaderParser$ImageType.UNKNOWN;
    L9:
        return ImageHeaderParser$ImageType.GIF;
    L5:
        return ImageHeaderParser$ImageType.JPEG;
    L83:
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static int g(fl0 r9) {
    L2:
        short r0 = r9.d();
        if (r0 != 255) goto L5;
        short r1 = r9.d();
        if (r1 == 218) goto L24;
        if (r1 == 217) goto L14;
        int r2 = r9.b() - 2;
        if (r1 == 225) goto L25;
        long r5 = r2;
        long r7 = r9.skip(r5);
        if (r7 == r5) goto L2;
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L24;
        StringBuilder r10 = b11.t("Unable to skip enough data, type: ", ", wanted to skip: ", r1, r2, ", but actually skipped: ");
        r10.append(r7);
        Log.d("DfltImageHeaderParser", r10.toString());
        goto L24
    L25:
        return r2;
    L14:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L24;
        Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
        return -1;
    L24:
        return -1;
    L5:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L24;
        Log.d("DfltImageHeaderParser", "Unknown segmentId=" + r0);
        return -1;
    }

    public static int h(fl0 r16, byte[] r17, int r18) {
        int r1 = r16.e(r18, r17);
        short r3 = -1;
        if (r1 != r18) goto L5;
        int r2 = 0;
        byte[] r7 = a;
        if (r17 != null) goto L12;
    L14:
        boolean r8 = false;
    L15:
        if (r8 == false) goto L23;
        int r9 = 0;
    L18:
        if (r9 >= r7.length) goto L23;
        if (r17[r9] != r7[r9]) goto L21;
        r9 = r9 + 1;
        goto L18
    L21:
        r8 = false;
    L23:
        if (r8 == false) goto L104;
        ByteBuffer r0 = (ByteBuffer) ByteBuffer.wrap(r17).order(ByteOrder.BIG_ENDIAN).limit(r18);
        if ((r0.remaining() - 6) < 2) goto L27;
        short r4 = r0.getShort(6);
    L29:
        if (r4 != 18761) goto L31;
        ByteOrder r5 = ByteOrder.LITTLE_ENDIAN;
    L38:
        r0.order(r5);
        if ((r0.remaining() - 10) < 4) goto L41;
        int r6 = r0.getInt(10);
    L42:
        int r10 = r6 + 6;
        if ((r0.remaining() - r10) < 2) goto L45;
        short r11 = r0.getShort(r10);
    L46:
        if (r2 >= r11) goto L122;
        int r12 = (r2 * 12) + (r6 + 8);
        if ((r0.remaining() - r12) < 2) goto L50;
        short r13 = r0.getShort(r12);
    L52:
        if (r13 == 274) goto L54;
    L53:
        r3 = r3;
    L102:
        r2 = r2 + 1;
        r3 = r3;
        goto L46
    L54:
        int r14 = r12 + 2;
        if ((r0.remaining() - r14) < 2) goto L57;
        short r15 = r0.getShort(r14);
    L58:
        if (r15 >= 1) goto L60;
    L61:
        r3 = r3;
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L102;
        Log.d("DfltImageHeaderParser", "Got invalid format code = " + r15);
        goto L102
    L60:
        if (r15 > 12) goto L61;
        int r19 = r12 + 4;
        if ((r0.remaining() - r19) < 4) goto L65;
        int r110 = r0.getInt(r19);
    L66:
        if (r110 >= 0) goto L71;
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L53;
        Log.d("DfltImageHeaderParser", "Negative tiff component count");
        goto L53
    L71:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L74;
        StringBuilder r20 = b11.t("Got tagIndex=", " tagType=", r2, r13, " formatCode=");
        r20.append(r15);
        r20.append(" componentCount=");
        r20.append(r110);
        Log.d("DfltImageHeaderParser", r20.toString());
    L74:
        int r111 = r110 + b[r15];
        if (r111 > 4) goto L77;
        int r112 = r12 + 8;
        if (r112 < 0) goto L97;
        if (r112 > r0.remaining()) goto L97;
        if (r111 < 0) goto L94;
        if ((r111 + r112) > r0.remaining()) goto L94;
        if ((r0.remaining() - r112) < 2) goto L92;
        return r0.getShort(r112);
    L92:
        return r3;
    L94:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L102;
        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + r13);
    L97:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L102;
        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + r112 + " tagType=" + r13);
        goto L102
    L77:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L102;
        Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + r15);
        goto L102
    L65:
        r110 = r3;
        goto L66
    L57:
        r15 = r3;
        goto L58
    L50:
        r13 = r3;
    L122:
        return r3;
    L45:
        r11 = -1;
        goto L46
    L41:
        r6 = -1;
        goto L42
    L31:
        if (r4 != 19789) goto L33;
        r5 = ByteOrder.BIG_ENDIAN;
        goto L38
    L33:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L35;
        Log.d("DfltImageHeaderParser", "Unknown endianness = " + r4);
    L35:
        r5 = ByteOrder.BIG_ENDIAN;
        goto L38
    L27:
        r4 = -1;
        goto L29
    L104:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L123;
        Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        return -1;
    L123:
        return -1;
    L12:
        if (r18 <= r7.length) goto L14;
        r8 = true;
        goto L15
    L5:
        if (Log.isLoggable("DfltImageHeaderParser", 3) == false) goto L122;
        Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + r18 + ", actually read: " + r1);
        return -1;
    }

    @Override // defpackage.wv1
    public final ImageHeaderParser$ImageType a(ByteBuffer r2) {
        h12.f(r2, "Argument must not be null");
        return f(new tw(1, r2));
    }

    @Override // defpackage.wv1
    public final int b(InputStream r1, qj0 r2) {
        zg5 r0 = new zg5(r1);
        h12.f(r2, "Argument must not be null");
        return e(r0, r2);
    }

    @Override // defpackage.wv1
    public final int c(ByteBuffer r2, qj0 r3) {
        tw r1 = new tw(1, r2);
        h12.f(r3, "Argument must not be null");
        return e(r1, r3);
    }

    @Override // defpackage.wv1
    public final ImageHeaderParser$ImageType d(InputStream r1) {
        return f(new zg5(r1));
    }
}
