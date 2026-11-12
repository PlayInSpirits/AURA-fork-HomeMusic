package defpackage;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import com.eddyizm.tempus.homemusic.SmartSession;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f31 {
    public static final byte[] A = null;
    public static final String[] B = null;
    public static final int[] C = null;
    public static final byte[] D = null;
    public static final c31 E = null;
    public static final c31[][] F = null;
    public static final c31[] G = null;
    public static final HashMap[] H = null;
    public static final HashMap[] I = null;
    public static final HashSet J = null;
    public static final HashMap K = null;
    public static final Charset L = null;
    public static final byte[] M = null;
    public static final byte[] N = null;
    public static final boolean l = false;
    public static final int[] m = null;
    public static final int[] n = null;
    public static final byte[] o = null;
    public static final byte[] p = null;
    public static final byte[] q = null;
    public static final byte[] r = null;
    public static final byte[] s = null;
    public static final byte[] t = null;
    public static final byte[] u = null;
    public static final byte[] v = null;
    public static final byte[] w = null;
    public static final byte[] x = null;
    public static final byte[] y = null;
    public static final byte[] z = null;
    public final FileDescriptor a;
    public final AssetManager.AssetInputStream b;
    public int c;
    public final HashMap[] d;
    public final HashSet e;
    public ByteOrder f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        l = Log.isLoggable("ExifInterface", 3);
        Arrays.asList(new Integer[]{1, 6, 3, 8});
        Arrays.asList(new Integer[]{2, 7, 4, 5});
        m = new int[]{8, 8, 8};
        n = new int[]{8};
        o = new byte[]{-1, -40, -1};
        p = new byte[]{102, 116, 121, 112};
        q = new byte[]{109, 105, 102, 49};
        r = new byte[]{104, 101, 105, 99};
        s = new byte[]{79, 76, 89, 77, 80, 0};
        t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        v = new byte[]{101, 88, 73, 102};
        w = new byte[]{73, 72, 68, 82};
        x = new byte[]{73, 69, 78, 68};
        y = new byte[]{82, 73, 70, 70};
        z = new byte[]{87, 69, 66, 80};
        A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        c31[] r69 = {new c31("NewSubfileType", 254, 4), new c31("SubfileType", 255, 4), new c31("ImageWidth", 256, 3, 4), new c31("ImageLength", 257, 3, 4), new c31("BitsPerSample", 258, 3), new c31("Compression", 259, 3), new c31("PhotometricInterpretation", 262, 3), new c31("ImageDescription", 270, 2), new c31("Make", 271, 2), new c31("Model", 272, 2), new c31("StripOffsets", 273, 3, 4), new c31("Orientation", 274, 3), new c31("SamplesPerPixel", 277, 3), new c31("RowsPerStrip", 278, 3, 4), new c31("StripByteCounts", 279, 3, 4), new c31("XResolution", 282, 5), new c31("YResolution", 283, 5), new c31("PlanarConfiguration", 284, 3), new c31("ResolutionUnit", 296, 3), new c31("TransferFunction", 301, 3), new c31("Software", 305, 2), new c31("DateTime", 306, 2), new c31("Artist", 315, 2), new c31("WhitePoint", 318, 5), new c31("PrimaryChromaticities", 319, 5), new c31("SubIFDPointer", 330, 4), new c31("JPEGInterchangeFormat", 513, 4), new c31("JPEGInterchangeFormatLength", 514, 4), new c31("YCbCrCoefficients", 529, 5), new c31("YCbCrSubSampling", 530, 3), new c31("YCbCrPositioning", 531, 3), new c31("ReferenceBlackWhite", 532, 5), new c31("Copyright", 33432, 2), new c31("ExifIFDPointer", 34665, 4), new c31("GPSInfoIFDPointer", 34853, 4), new c31("SensorTopBorder", 4, 4), new c31("SensorLeftBorder", 5, 4), new c31("SensorBottomBorder", 6, 4), new c31("SensorRightBorder", 7, 4), new c31("ISO", 23, 3), new c31("JpgFromRaw", 46, 7), new c31("Xmp", 700, 1)};
        c31[] r70 = {new c31("ExposureTime", 33434, 5), new c31("FNumber", 33437, 5), new c31("ExposureProgram", 34850, 3), new c31("SpectralSensitivity", 34852, 2), new c31("PhotographicSensitivity", 34855, 3), new c31("OECF", 34856, 7), new c31("SensitivityType", 34864, 3), new c31("StandardOutputSensitivity", 34865, 4), new c31("RecommendedExposureIndex", 34866, 4), new c31("ISOSpeed", 34867, 4), new c31("ISOSpeedLatitudeyyy", 34868, 4), new c31("ISOSpeedLatitudezzz", 34869, 4), new c31("ExifVersion", 36864, 2), new c31("DateTimeOriginal", 36867, 2), new c31("DateTimeDigitized", 36868, 2), new c31("OffsetTime", 36880, 2), new c31("OffsetTimeOriginal", 36881, 2), new c31("OffsetTimeDigitized", 36882, 2), new c31("ComponentsConfiguration", 37121, 7), new c31("CompressedBitsPerPixel", 37122, 5), new c31("ShutterSpeedValue", 37377, 10), new c31("ApertureValue", 37378, 5), new c31("BrightnessValue", 37379, 10), new c31("ExposureBiasValue", 37380, 10), new c31("MaxApertureValue", 37381, 5), new c31("SubjectDistance", 37382, 5), new c31("MeteringMode", 37383, 3), new c31("LightSource", 37384, 3), new c31("Flash", 37385, 3), new c31("FocalLength", 37386, 5), new c31("SubjectArea", 37396, 3), new c31("MakerNote", 37500, 7), new c31("UserComment", 37510, 7), new c31("SubSecTime", 37520, 2), new c31("SubSecTimeOriginal", 37521, 2), new c31("SubSecTimeDigitized", 37522, 2), new c31("FlashpixVersion", 40960, 7), new c31("ColorSpace", 40961, 3), new c31("PixelXDimension", 40962, 3, 4), new c31("PixelYDimension", 40963, 3, 4), new c31("RelatedSoundFile", 40964, 2), new c31("InteroperabilityIFDPointer", 40965, 4), new c31("FlashEnergy", 41483, 5), new c31("SpatialFrequencyResponse", 41484, 7), new c31("FocalPlaneXResolution", 41486, 5), new c31("FocalPlaneYResolution", 41487, 5), new c31("FocalPlaneResolutionUnit", 41488, 3), new c31("SubjectLocation", 41492, 3), new c31("ExposureIndex", 41493, 5), new c31("SensingMethod", 41495, 3), new c31("FileSource", 41728, 7), new c31("SceneType", 41729, 7), new c31("CFAPattern", 41730, 7), new c31("CustomRendered", 41985, 3), new c31("ExposureMode", 41986, 3), new c31("WhiteBalance", 41987, 3), new c31("DigitalZoomRatio", 41988, 5), new c31("FocalLengthIn35mmFilm", 41989, 3), new c31("SceneCaptureType", 41990, 3), new c31("GainControl", 41991, 3), new c31("Contrast", 41992, 3), new c31("Saturation", 41993, 3), new c31("Sharpness", 41994, 3), new c31("DeviceSettingDescription", 41995, 7), new c31("SubjectDistanceRange", 41996, 3), new c31("ImageUniqueID", 42016, 2), new c31("CameraOwnerName", 42032, 2), new c31("BodySerialNumber", 42033, 2), new c31("LensSpecification", 42034, 5), new c31("LensMake", 42035, 2), new c31("LensModel", 42036, 2), new c31("Gamma", 42240, 5), new c31("DNGVersion", 50706, 1), new c31("DefaultCropSize", 50720, 3, 4)};
        c31[] r71 = {new c31("GPSVersionID", 0, 1), new c31("GPSLatitudeRef", 1, 2), new c31("GPSLatitude", 2, 5, 10), new c31("GPSLongitudeRef", 3, 2), new c31("GPSLongitude", 4, 5, 10), new c31("GPSAltitudeRef", 5, 1), new c31("GPSAltitude", 6, 5), new c31("GPSTimeStamp", 7, 5), new c31("GPSSatellites", 8, 2), new c31("GPSStatus", 9, 2), new c31("GPSMeasureMode", 10, 2), new c31("GPSDOP", 11, 5), new c31("GPSSpeedRef", 12, 2), new c31("GPSSpeed", 13, 5), new c31("GPSTrackRef", 14, 2), new c31("GPSTrack", 15, 5), new c31("GPSImgDirectionRef", 16, 2), new c31("GPSImgDirection", 17, 5), new c31("GPSMapDatum", 18, 2), new c31("GPSDestLatitudeRef", 19, 2), new c31("GPSDestLatitude", 20, 5), new c31("GPSDestLongitudeRef", 21, 2), new c31("GPSDestLongitude", 22, 5), new c31("GPSDestBearingRef", 23, 2), new c31("GPSDestBearing", 24, 5), new c31("GPSDestDistanceRef", 25, 2), new c31("GPSDestDistance", 26, 5), new c31("GPSProcessingMethod", 27, 7), new c31("GPSAreaInformation", 28, 7), new c31("GPSDateStamp", 29, 2), new c31("GPSDifferential", 30, 3), new c31("GPSHPositioningError", 31, 5)};
        c31[] r72 = {new c31("InteroperabilityIndex", 1, 2)};
        c31[] r73 = {new c31("NewSubfileType", 254, 4), new c31("SubfileType", 255, 4), new c31("ThumbnailImageWidth", 256, 3, 4), new c31("ThumbnailImageLength", 257, 3, 4), new c31("BitsPerSample", 258, 3), new c31("Compression", 259, 3), new c31("PhotometricInterpretation", 262, 3), new c31("ImageDescription", 270, 2), new c31("Make", 271, 2), new c31("Model", 272, 2), new c31("StripOffsets", 273, 3, 4), new c31("ThumbnailOrientation", 274, 3), new c31("SamplesPerPixel", 277, 3), new c31("RowsPerStrip", 278, 3, 4), new c31("StripByteCounts", 279, 3, 4), new c31("XResolution", 282, 5), new c31("YResolution", 283, 5), new c31("PlanarConfiguration", 284, 3), new c31("ResolutionUnit", 296, 3), new c31("TransferFunction", 301, 3), new c31("Software", 305, 2), new c31("DateTime", 306, 2), new c31("Artist", 315, 2), new c31("WhitePoint", 318, 5), new c31("PrimaryChromaticities", 319, 5), new c31("SubIFDPointer", 330, 4), new c31("JPEGInterchangeFormat", 513, 4), new c31("JPEGInterchangeFormatLength", 514, 4), new c31("YCbCrCoefficients", 529, 5), new c31("YCbCrSubSampling", 530, 3), new c31("YCbCrPositioning", 531, 3), new c31("ReferenceBlackWhite", 532, 5), new c31("Copyright", 33432, 2), new c31("ExifIFDPointer", 34665, 4), new c31("GPSInfoIFDPointer", 34853, 4), new c31("DNGVersion", 50706, 1), new c31("DefaultCropSize", 50720, 3, 4)};
        E = new c31("StripOffsets", 273, 3);
        F = new c31[][]{r69, r70, r71, r72, r73, r69, new c31[]{new c31("ThumbnailImage", 256, 7), new c31("CameraSettingsIFDPointer", 8224, 4), new c31("ImageProcessingIFDPointer", 8256, 4)}, new c31[]{new c31("PreviewImageStart", 257, 4), new c31("PreviewImageLength", 258, 4)}, new c31[]{new c31("AspectFrame", 4371, 3)}, new c31[]{new c31("ColorSpace", 55, 3)}};
        G = new c31[]{new c31("SubIFDPointer", 330, 4), new c31("ExifIFDPointer", 34665, 4), new c31("GPSInfoIFDPointer", 34853, 4), new c31("InteroperabilityIFDPointer", 40965, 4), new c31("CameraSettingsIFDPointer", 8224, 1), new c31("ImageProcessingIFDPointer", 8256, 1)};
        H = new HashMap[10];
        I = new HashMap[10];
        J = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
        K = new HashMap();
        Charset r0 = Charset.forName("US-ASCII");
        L = r0;
        M = "Exif\u0000\u0000".getBytes(r0);
        N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(r0);
        Locale r1 = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", r1).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", r1).setTimeZone(TimeZone.getTimeZone("UTC"));
        int r2 = 0;
    L3:
        c31[][] r3 = F;
        if (r2 >= r3.length) goto L9;
        H[r2] = new HashMap();
        I[r2] = new HashMap();
        c31[] r4 = r3[r2];
        int r5 = r4.length;
        int r6 = 0;
    L6:
        if (r6 >= r5) goto L8;
        c31 r7 = r4[r6];
        H[r2].put(Integer.valueOf(r7.a), r7);
        I[r2].put(r7.b, r7);
        r6 = r6 + 1;
        goto L6
    L8:
        r2 = r2 + 1;
        goto L3
    L9:
        HashMap r8 = K;
        c31[] r9 = G;
        r8.put(Integer.valueOf(r9[0].a), 5);
        r8.put(Integer.valueOf(r9[1].a), 1);
        r8.put(Integer.valueOf(r9[2].a), 2);
        r8.put(Integer.valueOf(r9[3].a), 3);
        r8.put(Integer.valueOf(r9[4].a), 7);
        r8.put(Integer.valueOf(r9[5].a), 8);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    }

    public f31(InputStream r10) {
        c31[][] r0 = F;
        this.d = new HashMap[r0.length];
        this.e = new HashSet(r0.length);
        this.f = ByteOrder.BIG_ENDIAN;
        boolean r1 = r10 instanceof AssetManager.AssetInputStream;
        boolean r2 = l;
        if (r1 == false) goto L6;
        this.b = (AssetManager.AssetInputStream) r10;
        this.a = null;
    L13:
        int r4 = 0;
    L65:
    L17:
        th = move-exception;
        a();
        if (r2 == false) goto L58;
        p();
    L58:
        throw th;
    L21:
        e = e;
    L52:
        if (r2 == false) goto L59;
        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);     // Catch: Throwable -> L17
    L59:
        a();
        if (r2 == false) goto L68;
    L51:
        p();
        return;
    L68:
        return;
    L19:
        e = e;
        goto L52
    L15:
        if (r4 >= r0.length) goto L23;
        this.d[r4] = new HashMap();     // Catch: Throwable -> L17 UnsupportedOperationException -> L19 IOException -> L21
        r4 = r4 + 1;     // Catch: Throwable -> L17 UnsupportedOperationException -> L19 IOException -> L21
        goto L65
    L23:
        BufferedInputStream r3 = new BufferedInputStream(r10, SmartSession.MAX_SONGS);     // Catch: Throwable -> L17 UnsupportedOperationException -> L19 IOException -> L21
        int r11 = f(r3);     // Catch: Throwable -> L17 UnsupportedOperationException -> L19 IOException -> L21
        this.c = r11;     // Catch: Throwable -> L17 UnsupportedOperationException -> L19 IOException -> L21
        if (r11 == 4) goto L40;
        if (r11 == 9) goto L40;
        if (r11 == 13) goto L40;
        if (r11 == 14) goto L40;
        e31 r12 = new e31(r3);     // Catch: Throwable -> L17 UnsupportedOperationException -> L19 IOException -> L21
        int r5 = this.c;     // Catch: Throwable -> L17 UnsupportedOperationException -> L19 IOException -> L21
        if (r5 != 12) goto L33;
        d(r12);     // Catch: Throwable -> L17 UnsupportedOperationException -> L19 IOException -> L21
    L39:
        r12.f(this.h);     // Catch: Throwable -> L17 UnsupportedOperationException -> L19 IOException -> L21
        u(r12);     // Catch: Throwable -> L17 UnsupportedOperationException -> L19 IOException -> L21
    L49:
        a();
        if (r2 == true) goto L51;
        return;
    L33:
        if (r5 != 7) goto L36;
        g(r12);     // Catch: Throwable -> L17 UnsupportedOperationException -> L19 IOException -> L21
        goto L39
    L36:
        if (r5 != 10) goto L38;
        k(r12);     // Catch: Throwable -> L17 UnsupportedOperationException -> L19 IOException -> L21
        goto L39
    L38:
        j(r12);     // Catch: Throwable -> L17 UnsupportedOperationException -> L19 IOException -> L21
    L40:
        a31 r13 = new a31(r3);     // Catch: Throwable -> L17 UnsupportedOperationException -> L19 IOException -> L21
        int r6 = this.c;     // Catch: Throwable -> L17 UnsupportedOperationException -> L19 IOException -> L21
        if (r6 != 4) goto L43;
        e(r13, 0, 0);     // Catch: Throwable -> L17 UnsupportedOperationException -> L19 IOException -> L21
        goto L49
    L43:
        if (r6 != 13) goto L45;
        h(r13);     // Catch: Throwable -> L17 UnsupportedOperationException -> L19 IOException -> L21
        goto L49
    L45:
        if (r6 != 9) goto L47;
        i(r13);     // Catch: Throwable -> L17 UnsupportedOperationException -> L19 IOException -> L21
        goto L49
    L47:
        if (r6 != 14) goto L49;
        l(r13);     // Catch: Throwable -> L17 UnsupportedOperationException -> L19 IOException -> L21
        goto L49
    L6:
        if ((r10 instanceof FileInputStream) == false) goto L12;
        FileInputStream r7 = (FileInputStream) r10;
        h31.c(r7.getFD(), 0, OsConstants.SEEK_CUR);     // Catch: Exception -> L10
        this.b = null;
        this.a = r7.getFD();
    L10:
        if (r2 == false) goto L12;
        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
    L12:
        this.b = null;
        this.a = null;
        goto L13
    }

    public static ByteOrder q(a31 r3) {
        short r4 = r3.readShort();
        boolean r2 = l;
        if (r4 != 18761) goto L5;
        if (r2 == false) goto L15;
        Log.d("ExifInterface", "readExifSegment: Byte Align II");
    L15:
        return ByteOrder.LITTLE_ENDIAN;
    L5:
        if (r4 != 19789) goto L10;
        if (r2 == false) goto L9;
        Log.d("ExifInterface", "readExifSegment: Byte Align MM");
    L9:
        return ByteOrder.BIG_ENDIAN;
    L10:
        mj0.m(Integer.toHexString(r4), "Invalid byte order: ");
        return null;
    }

    public final void a() {
        String r0 = b("DateTimeOriginal");
        HashMap[] r2 = this.d;
        if (r0 == null) goto L8;
        if (b("DateTime") != null) goto L8;
        HashMap r4 = r2[0];
        byte[] r1 = r0.concat("\u0000").getBytes(L);
        r4.put("DateTime", new b31(r1, 2, r1.length));
    L8:
        if (b("ImageWidth") != null) goto L11;
        r2[0].put("ImageWidth", b31.a(0, this.f));
    L11:
        if (b("ImageLength") != null) goto L14;
        r2[0].put("ImageLength", b31.a(0, this.f));
    L14:
        if (b("Orientation") != null) goto L17;
        r2[0].put("Orientation", b31.a(0, this.f));
    L17:
        if (b("LightSource") != null) goto L20;
        r2[1].put("LightSource", b31.a(0, this.f));
        return;
    }

    public final String b(String r5) {
        b31 r0 = c(r5);
        if (r0 == null) goto L27;
        int r2 = r0.a;
        if (J.contains(r5) == true) goto L9;
        return r0.f(this.f);
    L9:
        if (r5.equals("GPSTimeStamp") == true) goto L11;
        return Double.toString(r0.d(this.f));
    L11:
        if (r2 != 5) goto L13;
    L16:
        d31[] r4 = (d31[]) r0.g(this.f);
        if (r4 != null) goto L19;
    L23:
        Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(r4));
        return null;
    L19:
        if (r4.length != 3) goto L23;
        d31 r6 = r4[0];
        Integer r7 = Integer.valueOf((int) (r6.a / r6.b));
        d31 r1 = r4[1];
        Integer r3 = Integer.valueOf((int) (r1.a / r1.b));
        d31 r8 = r4[2];
        return String.format("%02d:%02d:%02d", new Object[]{r7, r3, Integer.valueOf((int) (r8.a / r8.b))});
    L13:
        if (r2 == 10) goto L16;
        Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + r2);
        return null;
    L27:
        return null;
    }

    public final b31 c(String r3) {
        if ("ISOSpeedRatings".equals(r3) == true) goto L5;
    L8:
        int r0 = 0;
    L10:
        if (r0 >= F.length) goto L15;
        b31 r1 = (b31) this.d[r0].get(r3);
        if (r1 != null) goto L13;
        r0 = r0 + 1;
        goto L10
    L13:
        return r1;
    L15:
        return null;
    L5:
        if (l == false) goto L7;
        Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
    L7:
        r3 = "PhotographicSensitivity";
        goto L8
    }

    public final void d(e31 r14) {
        if (Build.VERSION.SDK_INT < 28) goto L61;
        MediaMetadataRetriever r2 = new MediaMetadataRetriever();
        i31.a(r2, new z21(r14));     // Catch: Throwable -> L8 RuntimeException -> L57
        String r3 = r2.extractMetadata(33);     // Catch: Throwable -> L8 RuntimeException -> L57
        String r4 = r2.extractMetadata(34);     // Catch: Throwable -> L8 RuntimeException -> L57
        String r5 = r2.extractMetadata(26);     // Catch: Throwable -> L8 RuntimeException -> L57
        String r6 = r2.extractMetadata(17);     // Catch: Throwable -> L8 RuntimeException -> L57
        if ("yes".equals(r5) == false) goto L11;
        String r0 = r2.extractMetadata(29);     // Catch: Throwable -> L8 RuntimeException -> L57
        String r7 = r2.extractMetadata(30);     // Catch: Throwable -> L8 RuntimeException -> L57
        String r8 = r2.extractMetadata(31);     // Catch: Throwable -> L8 RuntimeException -> L57
    L15:
        HashMap[] r9 = this.d;
        if (r0 == null) goto L18;
        r9[0].put("ImageWidth", b31.c(Integer.parseInt(r0), this.f));     // Catch: Throwable -> L8 RuntimeException -> L57
    L18:
        if (r7 == null) goto L21;
        r9[0].put("ImageLength", b31.c(Integer.parseInt(r7), this.f));     // Catch: Throwable -> L8 RuntimeException -> L57
    L21:
        if (r8 == null) goto L33;
        int r10 = Integer.parseInt(r8);     // Catch: Throwable -> L8 RuntimeException -> L57
        if (r10 != 90) goto L25;
        int r11 = 6;
    L32:
        r9[0].put("Orientation", b31.c(r11, this.f));     // Catch: Throwable -> L8 RuntimeException -> L57
        goto L33
    L25:
        if (r10 != 180) goto L27;
        r11 = 3;
        goto L32
    L27:
        if (r10 == 270) goto L29;
        r11 = 1;
        goto L32
    L29:
        r11 = 8;
    L33:
        if (r3 == null) goto L53;
        if (r4 == null) goto L53;
        int r12 = Integer.parseInt(r3);     // Catch: Throwable -> L8 RuntimeException -> L57
        int r13 = Integer.parseInt(r4);     // Catch: Throwable -> L8 RuntimeException -> L57
        if (r13 <= 6) goto L51;
        r14.f(r12);     // Catch: Throwable -> L8 RuntimeException -> L57
        byte[] r15 = new byte[6];     // Catch: Throwable -> L8 RuntimeException -> L57
        if (r14.read(r15) != 6) goto L49;
        int r16 = r12 + 6;     // Catch: Throwable -> L8 RuntimeException -> L57
        int r17 = r13 - 6;     // Catch: Throwable -> L8 RuntimeException -> L57
        if (Arrays.equals(r15, M) == false) goto L47;
        byte[] r18 = new byte[r17];     // Catch: Throwable -> L8 RuntimeException -> L57
        if (r14.read(r18) != r17) goto L45;
        this.h = r16;     // Catch: Throwable -> L8 RuntimeException -> L57
        r(0, r18);     // Catch: Throwable -> L8 RuntimeException -> L57
        goto L53
    L45:
        throw new IOException("Can't read exif");     // Catch: Throwable -> L8 RuntimeException -> L57
    L47:
        throw new IOException("Invalid identifier");     // Catch: Throwable -> L8 RuntimeException -> L57
    L49:
        throw new IOException("Can't read identifier");     // Catch: Throwable -> L8 RuntimeException -> L57
    L51:
        throw new IOException("Invalid exif length");     // Catch: Throwable -> L8 RuntimeException -> L57
    L53:
        if (l == false) goto L55;
        Log.d("ExifInterface", "Heif meta: " + r0 + "x" + r7 + ", rotation " + r8);     // Catch: Throwable -> L8 RuntimeException -> L57
    L55:
        r2.release();
        return;
    L11:
        if ("yes".equals(r6) == false) goto L14;
        r0 = r2.extractMetadata(18);     // Catch: Throwable -> L8 RuntimeException -> L57
        r7 = r2.extractMetadata(19);     // Catch: Throwable -> L8 RuntimeException -> L57
        r8 = r2.extractMetadata(24);     // Catch: Throwable -> L8 RuntimeException -> L57
        goto L15
    L14:
        r0 = null;
        r7 = null;
        r8 = null;
        goto L15
    L58:
        throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        r2.release();
        throw th;
    L61:
        er1.l("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    public final void e(a31 r23, int r24, int r25) {
        boolean r4 = l;
        if (r4 == false) goto L5;
        Log.d("ExifInterface", "getJpegAttributes starting with: " + r23);
    L5:
        r23.o = ByteOrder.BIG_ENDIAN;
        byte r5 = r23.readByte();
        byte r7 = -1;
        if (r5 == (-1)) goto L8;
        mj0.m(Integer.toHexString(r5 & 255), "Invalid marker: ");
        return;
    L8:
        if (r23.readByte() != (-40)) goto L91;
        int r6 = 2;
        int r8 = 2;
    L10:
        byte r9 = r23.readByte();
        if (r9 != r7) goto L89;
        byte r10 = r23.readByte();
        if (r4 == false) goto L16;
        Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(r10 & 255));
    L16:
        if (r10 == (-39)) goto L87;
        if (r10 == (-38)) goto L87;
        int r11 = r23.readUnsignedShort();
        int r12 = r11 - 2;
        int r13 = r8 + 4;
        if (r4 == false) goto L24;
        Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(r10 & 255) + " (length: " + r11 + ")");
    L24:
        if (r12 < 0) goto L85;
        int r14 = 0;
        HashMap[] r15 = this.d;
        if (r10 != (-31)) goto L28;
        byte[] r16 = new byte[r12];
        r23.readFully(r16);
        int r17 = r13 + r12;
        byte[] r18 = M;
        if (r18 != null) goto L55;
    L62:
        byte[] r19 = N;
        if (r19 != null) goto L66;
    L80:
        r13 = r17;
        r12 = 0;
    L81:
        if (r12 < 0) goto L83;
        r23.b(r12);
        r8 = r13 + r12;
        r6 = 2;
        r7 = -1;
        goto L10
    L83:
        mj0.i("Invalid length");
        return;
    L66:
        if (r12 < r19.length) goto L80;
        int r20 = r14;
    L70:
        if (r20 >= r19.length) goto L75;
        if (r16[r20] != r19[r20]) goto L80;
        r20 = r20 + 1;
        goto L70
    L75:
        int r21 = r13 + r19.length;
        byte[] r22 = Arrays.copyOfRange(r16, r19.length, r12);
        if (b("Xmp") != null) goto L80;
        r15[r14].put("Xmp", new b31(r21, r22, 1, r22.length));
        goto L80
    L55:
        if (r12 < r18.length) goto L62;
        int r110 = 0;
    L59:
        if (r110 >= r18.length) goto L79;
        if (r16[r110] != r18[r110]) goto L62;
        r110 = r110 + 1;
        r14 = 0;
        goto L59
    L79:
        byte[] r26 = Arrays.copyOfRange(r16, r18.length, r12);
        this.h = (r24 + r13) + r18.length;
        r(r25, r26);
        u(new a31(r26));
        goto L80
    L28:
        if (r10 == (-2)) goto L43;
        switch(r10) {
            case -64: goto L34;
            case -63: goto L34;
            case -62: goto L34;
            case -61: goto L34;
            default: goto L30;
        };
    L30:
        switch(r10) {
            case -59: goto L34;
            case -58: goto L34;
            case -57: goto L34;
            default: goto L31;
        };
    L31:
        switch(r10) {
            case -55: goto L34;
            case -54: goto L34;
            case -53: goto L34;
            default: goto L32;
        };
    L32:
        switch(r10) {
            case -51: goto L34;
            case -50: goto L34;
            case -49: goto L34;
            default: goto L81;
        };
    L34:
        r23.b(1);
        HashMap r27 = r15[r25];
        if (r25 == 4) goto L37;
        String r28 = "ImageLength";
    L38:
        r27.put(r28, b31.a(r23.readUnsignedShort(), this.f));
        HashMap r29 = r15[r25];
        if (r25 == 4) goto L41;
        String r30 = "ImageWidth";
    L42:
        r29.put(r30, b31.a(r23.readUnsignedShort(), this.f));
        r12 = r11 - 7;
        goto L81
    L41:
        r30 = "ThumbnailImageWidth";
        goto L42
    L37:
        r28 = "ThumbnailImageLength";
        goto L38
    L43:
        byte[] r31 = new byte[r12];
        if (r23.read(r31) != r12) goto L49;
        if (b("UserComment") != null) goto L48;
        HashMap r32 = r15[1];
        Charset r111 = L;
        byte[] r33 = new String(r31, r111).concat("\u0000").getBytes(r111);
        r32.put("UserComment", new b31(r33, r6, r33.length));
    L48:
        r12 = 0;
        goto L81
    L49:
        mj0.i("Invalid exif");
        return;
    L85:
        mj0.i("Invalid length");
        return;
    L87:
        r23.o = this.f;
        return;
    L89:
        mj0.m(Integer.toHexString(r9 & 255), "Invalid marker:");
        return;
    L91:
        mj0.m(Integer.toHexString(r5 & 255), "Invalid marker: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    public final int f(BufferedInputStream r19) {
        r19.mark(SmartSession.MAX_SONGS);
        byte[] r2 = new byte[SmartSession.MAX_SONGS];
        r19.read(r2);
        r19.reset();
        int r0 = 0;
    L3:
        byte[] r4 = o;
        if (r0 >= r4.length) goto L142;
        if (r2[r0] != r4[r0]) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        byte[] r1 = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        int r5 = 0;
    L9:
        if (r5 >= r1.length) goto L139;
        byte r6 = r2[r5];
        ?? r7 = r1[r5];
        if (r6 != r7) goto L12;
        r5 = r5 + 1;
        goto L9
    L12:
        ?? r8 = 0;
        a31 r9 = null;
        a31 r10 = null;
        a31 r11 = null;
        int r12 = 1;
        a31 r13 = new a31(r2);     // Catch: Throwable -> L58 Exception -> L60
        long r14 = r13.readInt();     // Catch: Throwable -> L22 Exception -> L24
        byte[] r3 = new byte[4];     // Catch: Throwable -> L22 Exception -> L24
        r13.read(r3);     // Catch: Throwable -> L22 Exception -> L24
        if (Arrays.equals(r3, p) == true) goto L18;
    L16:
        r13.close();
        int r110 = 0;
    L154:
        a31 r15 = new a31(r2);     // Catch: Throwable -> L79 Exception -> L81
    L156:
        ByteOrder r16 = q(r15);     // Catch: Throwable -> L77 Exception -> L144
        this.f = r16;     // Catch: Throwable -> L77 Exception -> L144
        r15.o = r16;     // Catch: Throwable -> L77 Exception -> L144
        short r17 = r15.readShort();     // Catch: Throwable -> L77 Exception -> L144
        goto L85
    L70:
        if (r17 != 20306) goto L72;
    L75:
        int r18 = 1;
    L76:
        r15.close();
    L88:
        if (r18 == 0) goto L152;
        return 7;
    L152:
        a31 r20 = new a31(r2);     // Catch: Throwable -> L101 Exception -> L143
        ByteOrder r21 = q(r20);     // Catch: Throwable -> L98 Exception -> L100
        this.f = r21;     // Catch: Throwable -> L98 Exception -> L100
        r20.o = r21;     // Catch: Throwable -> L98 Exception -> L100
    L94:
        if (r20.readShort() == 85) goto L97;
        r12 = r110;
    L97:
        r20.close();
    L108:
        if (r12 == 0) goto L111;
        return 10;
    L111:
        int r22 = r110;
    L112:
        byte[] r23 = u;
        if (r22 >= r23.length) goto L133;
        if (r2[r22] != r23[r22]) goto L116;
        r22 = r22 + 1;
        goto L112
    L116:
        int r24 = r110;
    L117:
        byte[] r25 = y;
        if (r24 >= r25.length) goto L123;
        if (r2[r24] != r25[r24]) goto L128;
        r24 = r24 + 1;
    L128:
        return r110;
    L123:
        int r26 = r110;
    L124:
        byte[] r27 = z;
        if (r26 >= r27.length) goto L130;
        if (r2[(r25.length + r26) + 4] != r27[r26]) goto L128;
        r26 = r26 + 1;
        goto L124
    L130:
        return 14;
    L133:
        return 13;
    L100:
        r9 = r20;
    L98:
        th = th;
        r10 = r20;
    L102:
        if (r10 == null) goto L104;
        r10.close();
    L104:
        throw th;
    L101:
        th = th;
    L105:
        if (r9 == null) goto L107;
        r9.close();
    L107:
        r12 = r110;
        goto L108
    L72:
        if (r17 == 21330) goto L75;
        r18 = r110;
    L77:
        th = th;
        r11 = r15;
    L82:
        if (r11 == null) goto L84;
        r11.close();
    L84:
        throw th;
    L85:
        if (r15 == null) goto L87;
        r15.close();
    L87:
        r18 = r110;
    L81:
        r15 = null;
    L79:
        th = th;
        goto L82
    L18:
        if (r14 != 1) goto L26;
        r14 = r13.readLong();     // Catch: Throwable -> L22 Exception -> L24
        long r111 = 16;
        if (r14 < 16) goto L16;
    L28:
        if (r14 <= 5000) goto L30;
        r14 = 5000;
    L30:
        long r28 = r14 - r111;     // Catch: Throwable -> L22 Exception -> L24
        if (r28 < 8) goto L16;
        byte[] r29 = new byte[4];     // Catch: Throwable -> L22 Exception -> L24
        long r112 = 0;
        boolean r113 = false;
        boolean r114 = false;
    L34:
        if (r112 >= (r28 / 4)) goto L57;
        r110 = 0;
    L55:
        e = e;
    L63:
        if (l == false) goto L65;
        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);     // Catch: Throwable -> L22
    L65:
        if (r13 == null) goto L154;
    L40:
        r13.close();
        goto L154
    L39:
        if (r13.read(r29) != 4) goto L40;
        if (r112 == 1) goto L54;
        if (Arrays.equals(r29, q) == false) goto L47;
        r113 = true;
    L50:
        if (r113 == false) goto L54;
        if (r114 == false) goto L54;
        r13.close();
        return 12;
    L47:
        if (Arrays.equals(r29, r) == false) goto L50;
        r114 = true;
    L54:
        r112 = r112 + 1;
        goto L34
    L57:
        r110 = 0;
        goto L40
    L26:
        r111 = 8;
    L24:
        e = e;
        r110 = 0;
        goto L63
    L22:
        th = th;
        r8 = r7;
    L135:
        if (r8 == 0) goto L137;
        r8.close();
    L137:
        throw th;
    L60:
        e = e;
        r110 = 0;
        r13 = null;
    L58:
        th = th;
        goto L135
    L139:
        return 9;
    L142:
        return 4;
    }

    public final void g(e31 r7) {
        j(r7);
        HashMap[] r8 = this.d;
        b31 r1 = (b31) r8[1].get("MakerNote");
        if (r1 == null) goto L32;
        e31 r2 = new e31(r1.d);
        r2.o = this.f;
        byte[] r3 = s;
        byte[] r4 = new byte[r3.length];
        r2.readFully(r4);
        r2.f(0);
        byte[] r5 = t;
        byte[] r6 = new byte[r5.length];
        r2.readFully(r6);
        if (Arrays.equals(r4, r3) == false) goto L8;
        r2.f(8);
    L10:
        s(r2, 6);
        b31 r9 = (b31) r8[7].get("PreviewImageStart");
        b31 r10 = (b31) r8[7].get("PreviewImageLength");
        if (r9 == null) goto L14;
        if (r10 == null) goto L14;
        r8[5].put("JPEGInterchangeFormat", r9);
        r8[5].put("JPEGInterchangeFormatLength", r10);
    L14:
        b31 r11 = (b31) r8[8].get("AspectFrame");
        if (r11 == null) goto L33;
        int[] r12 = (int[]) r11.g(this.f);
        if (r12 != null) goto L19;
    L30:
        Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(r12));
        return;
    L19:
        if (r12.length != 4) goto L30;
        int r13 = r12[2];
        int r14 = r12[0];
        if (r13 <= r14) goto L34;
        int r15 = r12[3];
        int r16 = r12[1];
        if (r15 <= r16) goto L35;
        int r17 = (r13 - r14) + 1;
        int r18 = (r15 - r16) + 1;
        if (r17 >= r18) goto L28;
        int r19 = r17 + r18;
        r18 = r19 - r18;
        r17 = r19 - r18;
    L28:
        b31 r0 = b31.c(r17, this.f);
        b31 r20 = b31.c(r18, this.f);
        r8[0].put("ImageWidth", r0);
        r8[0].put("ImageLength", r20);
        return;
    L35:
        return;
    L34:
        return;
    L33:
        return;
    L8:
        if (Arrays.equals(r6, r5) == false) goto L10;
        r2.f(12);
        goto L10
    }

    public final void h(a31 r6) {
        if (l == false) goto L5;
        Log.d("ExifInterface", "getPngAttributes starting with: " + r6);
    L5:
        r6.o = ByteOrder.BIG_ENDIAN;
        byte[] r0 = u;
        r6.b(r0.length);
        int r1 = r0.length;
    L35:
        int r2 = r6.readInt();     // Catch: EOFException -> L33
        byte[] r3 = new byte[4];     // Catch: EOFException -> L33
        if (r6.read(r3) != 4) goto L32;
        int r4 = r1 + 8;     // Catch: EOFException -> L33
        if (r4 != 16) goto L16;
        if (Arrays.equals(r3, w) == true) goto L16;
        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");     // Catch: EOFException -> L33
    L16:
        if (Arrays.equals(r3, x) == true) goto L17;
        if (Arrays.equals(r3, v) == true) goto L20;
        int r5 = r2 + 4;     // Catch: EOFException -> L33
        r6.b(r5);     // Catch: EOFException -> L33
        r1 = r4 + r5;     // Catch: EOFException -> L33
        goto L35
    L20:
        byte[] r7 = new byte[r2];     // Catch: EOFException -> L33
        if (r6.read(r7) != r2) goto L29;
        int r8 = r6.readInt();     // Catch: EOFException -> L33
        CRC32 r9 = new CRC32();     // Catch: EOFException -> L33
        r9.update(r3);     // Catch: EOFException -> L33
        r9.update(r7);     // Catch: EOFException -> L33
        if (((int) r9.getValue()) != r8) goto L27;
        this.h = r4;     // Catch: EOFException -> L33
        r(0, r7);     // Catch: EOFException -> L33
        x();     // Catch: EOFException -> L33
        u(new a31(r7));     // Catch: EOFException -> L33
        return;
    L27:
        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + r8 + ", calculated CRC value: " + r9.getValue());     // Catch: EOFException -> L33
    L29:
        throw new IOException("Failed to read given length for given PNG chunk type: " + gi1.f(r3));     // Catch: EOFException -> L33
    L17:
        return;
    L32:
        throw new IOException("Encountered invalid length while parsing PNG chunktype");     // Catch: EOFException -> L33
    L33:
        mj0.i("Encountered corrupt PNG file.");
    }

    public final void i(a31 r9) {
        boolean r1 = l;
        if (r1 == false) goto L5;
        Log.d("ExifInterface", "getRafAttributes starting with: " + r9);
    L5:
        r9.b(84);
        byte[] r3 = new byte[4];
        byte[] r4 = new byte[4];
        byte[] r2 = new byte[4];
        r9.read(r3);
        r9.read(r4);
        r9.read(r2);
        int r5 = ByteBuffer.wrap(r3).getInt();
        int r6 = ByteBuffer.wrap(r4).getInt();
        int r7 = ByteBuffer.wrap(r2).getInt();
        byte[] r8 = new byte[r6];
        r9.b(r5 - r9.p);
        r9.read(r8);
        e(new a31(r8), r5, 5);
        r9.b(r7 - r9.p);
        r9.o = ByteOrder.BIG_ENDIAN;
        int r10 = r9.readInt();
        if (r1 == false) goto L8;
        Log.d("ExifInterface", "numberOfDirectoryEntry: " + r10);
    L8:
        int r11 = 0;
    L9:
        if (r11 >= r10) goto L20;
        int r12 = r9.readUnsignedShort();
        int r13 = r9.readUnsignedShort();
        if (r12 == E.a) goto L12;
        r9.b(r13);
        r11 = r11 + 1;
        goto L9
    L12:
        short r14 = r9.readShort();
        short r15 = r9.readShort();
        b31 r16 = b31.c(r14, this.f);
        b31 r17 = b31.c(r15, this.f);
        HashMap[] r18 = this.d;
        r18[0].put("ImageLength", r16);
        r18[0].put("ImageWidth", r17);
        if (r1 == false) goto L17;
        Log.d("ExifInterface", "Updated to length: " + r14 + ", width: " + r15);
        return;
    L17:
        return;
    }

    public final void j(e31 r4) {
        o(r4);
        s(r4, 0);
        w(r4, 0);
        w(r4, 5);
        w(r4, 4);
        x();
        if (this.c != 8) goto L10;
        HashMap[] r5 = this.d;
        b31 r1 = (b31) r5[1].get("MakerNote");
        if (r1 == null) goto L11;
        e31 r2 = new e31(r1.d);
        r2.o = this.f;
        r2.b(6);
        s(r2, 9);
        b31 r3 = (b31) r5[9].get("ColorSpace");
        if (r3 == null) goto L12;
        r5[1].put("ColorSpace", r3);
        return;
    L12:
        return;
    L11:
        return;
    }

    public final void k(e31 r6) {
        if (l == false) goto L5;
        Log.d("ExifInterface", "getRw2Attributes starting with: " + r6);
    L5:
        j(r6);
        HashMap[] r7 = this.d;
        b31 r1 = (b31) r7[0].get("JpgFromRaw");
        if (r1 == null) goto L8;
        e(new a31(r1.d), (int) r1.c, 5);
    L8:
        b31 r5 = (b31) r7[0].get("ISO");
        b31 r2 = (b31) r7[1].get("PhotographicSensitivity");
        if (r5 == null) goto L13;
        if (r2 != null) goto L14;
        r7[1].put("PhotographicSensitivity", r5);
        return;
    L14:
        return;
    }

    public final void l(a31 r6) {
        if (l == false) goto L5;
        Log.d("ExifInterface", "getWebpAttributes starting with: " + r6);
    L5:
        r6.o = ByteOrder.LITTLE_ENDIAN;
        r6.b(y.length);
        int r0 = r6.readInt() + 8;
        byte[] r1 = z;
        r6.b(r1.length);
        int r2 = r1.length + 8;
    L31:
        byte[] r3 = new byte[4];     // Catch: EOFException -> L29
        if (r6.read(r3) != 4) goto L28;
        int r4 = r6.readInt();     // Catch: EOFException -> L29
        int r5 = r2 + 8;     // Catch: EOFException -> L29
        if (Arrays.equals(A, r3) == true) goto L11;
        if ((r4 % 2) != 1) goto L20;
        r4 = r4 + 1;     // Catch: EOFException -> L29
    L20:
        r2 = r5 + r4;     // Catch: EOFException -> L29
        if (r2 == r0) goto L22;
        if (r2 > r0) goto L26;
        r6.b(r4);     // Catch: EOFException -> L29
        goto L31
    L26:
        throw new IOException("Encountered WebP file with invalid chunk size");     // Catch: EOFException -> L29
    L22:
        return;
    L11:
        byte[] r7 = new byte[r4];     // Catch: EOFException -> L29
        if (r6.read(r7) != r4) goto L16;
        this.h = r5;     // Catch: EOFException -> L29
        r(0, r7);     // Catch: EOFException -> L29
        u(new a31(r7));     // Catch: EOFException -> L29
        return;
    L16:
        throw new IOException("Failed to read given length for given PNG chunk type: " + gi1.f(r3));     // Catch: EOFException -> L29
    L28:
        throw new IOException("Encountered invalid length while parsing WebP chunktype");     // Catch: EOFException -> L29
    L29:
        mj0.i("Encountered corrupt WebP file.");
    }

    public final void m(a31 r4, HashMap r5) {
        b31 r0 = (b31) r5.get("JPEGInterchangeFormat");
        b31 r6 = (b31) r5.get("JPEGInterchangeFormatLength");
        if (r0 == null) goto L19;
        if (r6 == null) goto L20;
        int r1 = r0.e(this.f);
        int r7 = r6.e(this.f);
        if (this.c != 7) goto L8;
        r1 = r1 + this.i;
    L8:
        if (r1 <= 0) goto L16;
        if (r7 <= 0) goto L16;
        if (this.b != null) goto L16;
        if (this.a != null) goto L16;
        r4.skip(r1);
        r4.read(new byte[r7]);
    L16:
        if (l == false) goto L21;
        Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + r1 + ", length: " + r7);
        return;
    L21:
        return;
    L20:
        return;
    }

    public final boolean n(HashMap r3) {
        b31 r0 = (b31) r3.get("ImageLength");
        b31 r4 = (b31) r3.get("ImageWidth");
        if (r0 == null) goto L10;
        if (r4 == null) goto L12;
        int r1 = r0.e(this.f);
        int r2 = r4.e(this.f);
        if (r1 > 512) goto L13;
        if (r2 > 512) goto L14;
        return true;
    L14:
        return false;
    L13:
        return false;
    L12:
        return false;
    L10:
        return false;
    }

    public final void o(e31 r3) {
        ByteOrder r0 = q(r3);
        this.f = r0;
        r3.o = r0;
        int r1 = r3.readUnsignedShort();
        int r2 = this.c;
        if (r2 != 7) goto L5;
    L11:
        int r4 = r3.readInt();
        if (r4 < 8) goto L17;
        int r5 = r4 - 8;
        if (r5 <= 0) goto L19;
        r3.b(r5);
        return;
    L19:
        return;
    L17:
        mj0.i(f34.f(r4, "Invalid first Ifd offset: "));
        return;
    L5:
        if (r2 == 10) goto L11;
        if (r1 == 42) goto L11;
        mj0.m(Integer.toHexString(r1), "Invalid start code: ");
    }

    public final void p() {
        int r0 = 0;
    L3:
        HashMap[] r1 = this.d;
        if (r0 >= r1.length) goto L10;
        StringBuilder r2 = f34.j(r0, "The size of tag group[", "]: ");
        r2.append(r1[r0].size());
        Log.d("ExifInterface", r2.toString());
        Iterator r3 = r1[r0].entrySet().iterator();
    L7:
        if (r3.hasNext() == false) goto L9;
        Map.Entry r4 = (Map.Entry) r3.next();
        b31 r5 = (b31) r4.getValue();
        Log.d("ExifInterface", "tagName: " + ((String) r4.getKey()) + ", tagType: " + r5.toString() + ", tagValue: '" + r5.f(this.f) + "'");
        goto L7
    L9:
        r0 = r0 + 1;
        goto L3
    }

    public final void r(int r2, byte[] r3) {
        e31 r0 = new e31(r3);
        o(r0);
        s(r0, r2);
    }

    public final void s(e31 r29, int r30) {
        Integer r3 = Integer.valueOf(r29.p);
        HashSet r4 = this.e;
        r4.add(r3);
        short r5 = r29.readShort();
        boolean r6 = l;
        if (r6 == false) goto L5;
        Log.d("ExifInterface", "numberOfDirectoryEntry: " + r5);
    L5:
        if (r5 <= 0) goto L171;
        short r8 = 0;
    L8:
        HashMap[] r11 = this.d;
        if (r8 >= r5) goto L142;
        int r13 = r29.readUnsignedShort();
        int r14 = r29.readUnsignedShort();
        int r15 = r29.readInt();
        long r9 = ((long) r29.p) + 4;
        c31 r7 = (c31) H[r30].get(Integer.valueOf(r13));
        if (r6 == false) goto L20;
        Integer r12 = Integer.valueOf(r30);
        Integer r10 = Integer.valueOf(r13);
        if (r7 == null) goto L16;
        String r16 = r7.b;
    L17:
        Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", new Object[]{r12, r10, r16, Integer.valueOf(r14), Integer.valueOf(r15)}));
        goto L20
    L16:
        r16 = null;
    L20:
        if (r7 != null) goto L24;
        if (r6 == false) goto L23;
        Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + r13);
    L23:
        long r26 = r9;
    L69:
        long r17 = 0;
    L66:
        boolean r18 = false;
    L70:
        if (r18 == true) goto L72;
        r29.f(r26);
    L141:
        r8 = (short) (r8 + 1);
        r5 = r5;
        r6 = r6;
        goto L8
    L72:
        long r19 = r26;
        if (r17 <= 4) goto L90;
        int r20 = r29.readInt();
        if (r6 == 0) goto L79;
        Log.d("ExifInterface", "seek to data offset: " + r20);
    L79:
        if (this.c != 7) goto L89;
        if ("MakerNote".equals(r7.b) == false) goto L85;
        this.i = r20;
        goto L89
    L85:
        if (r30 != 6) goto L89;
        if ("ThumbnailImage".equals(r7.b) == false) goto L89;
        this.j = r20;
        this.k = r15;
        b31 r21 = b31.c(6, this.f);
        b31 r22 = b31.a(this.j, this.f);
        b31 r110 = b31.a(this.k, this.f);
        r11[4].put("Compression", r21);
        r11[4].put("JPEGInterchangeFormat", r22);
        r11[4].put("JPEGInterchangeFormatLength", r110);
    L89:
        r29.f(r20);
    L91:
        Integer r23 = (Integer) K.get(Integer.valueOf(r13));
        if (r6 == 0) goto L94;
        Log.d("ExifInterface", "nextIfdType: " + r23 + " byteCount: " + r17);
    L94:
        if (r23 == null) goto L124;
        int r111 = r14;
        if (r111 != 3) goto L98;
        int r24 = r29.readUnsignedShort();
    L107:
        long r25 = r24;
    L111:
        if (r6 == 0) goto L114;
        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", new Object[]{Long.valueOf(r25), r7.b}));
    L114:
        if (r25 > 0) goto L116;
        if (r6 == 0) goto L123;
        Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + r25);
    L123:
        r29.f(r19);
        goto L141
    L116:
        if (r4.contains(Integer.valueOf((int) r25)) == true) goto L119;
        r29.f(r25);
        s(r29, r23.intValue());
        goto L123
    L119:
        if (r6 == 0) goto L123;
        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + r23 + " (at " + r25 + ")");
        goto L123
    L98:
        if (r111 != 4) goto L100;
        r25 = ((long) r29.readInt()) & 4294967295L;
        goto L111
    L100:
        if (r111 != 8) goto L102;
        r24 = r29.readShort();
        goto L107
    L102:
        if (r111 != 9) goto L104;
    L106:
        r24 = r29.readInt();
        goto L107
    L104:
        if (r111 == 13) goto L106;
        r25 = -1;
        goto L111
    L124:
        long r27 = r19;
        int r28 = r29.p + this.h;
        byte[] r112 = new byte[(int) r17];
        r29.readFully(r112);
        b31 r113 = new b31(r28, r112, r14, r15);
        HashMap r31 = r11[r30];
        String r32 = r7.b;
        r31.put(r32, r113);
        if ("DNGVersion".equals(r32) == false) goto L128;
        this.c = 3;
    L128:
        if ("Make".equals(r32) == true) goto L132;
        if ("Model".equals(r32) == true) goto L132;
    L134:
        if ("Compression".equals(r32) == false) goto L139;
        if (r113.e(this.f) != 65535) goto L139;
    L137:
        this.c = 8;
    L139:
        if (r29.p == r27) goto L141;
        r29.f(r27);
    L132:
        if (r113.f(this.f).contains("PENTAX") == true) goto L137;
    L90:
        r19 = r19;
        r13 = r13;
        r14 = r14;
        goto L91
    L24:
        if (r14 <= 0) goto L27;
        int[] r33 = C;
        if (r14 >= r33.length) goto L27;
        int r114 = r7.c;
        if (r114 == 7) goto L56;
        if (r14 == 7) goto L56;
        if (r114 == r14) goto L56;
        int r115 = r7.d;
        if (r115 == r14) goto L56;
        if (r114 == 4) goto L41;
        if (r115 == 4) goto L41;
    L43:
        if (r114 == 9) goto L46;
        if (r115 == 9) goto L46;
    L49:
        if (r114 == 12) goto L52;
        if (r115 == 12) goto L52;
    L54:
        if (r6 == 0) goto L23;
        Log.d("ExifInterface", "Skip the tag entry since data format (" + B[r14] + ") is unexpected for tag: " + r7.b);
    L52:
        if (r14 != 11) goto L54;
    L46:
        if (r14 != 8) goto L49;
    L41:
        if (r14 != 3) goto L43;
    L56:
        if (r14 != 7) goto L58;
        r14 = r114;
    L58:
        r26 = r9;
        r17 = ((long) r15) * ((long) r33[r14]);
        if (r17 >= 0) goto L61;
    L64:
        if (r6 == 0) goto L66;
        Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + r15);
        goto L66
    L61:
        if (r17 > 2147483647L) goto L64;
        r18 = true;
    L27:
        r26 = r9;
        if (r6 == 0) goto L69;
        Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + r14);
        goto L69
    L142:
        boolean r210 = r6;
        int r2 = r29.readInt();
        if (r210 == false) goto L145;
        Log.d("ExifInterface", String.format("nextIfdOffset: %d", new Object[]{Integer.valueOf(r2)}));
    L145:
        long r34 = r2;
        if (r34 > 0) goto L148;
        if (r210 == false) goto L170;
        Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + r2);
        return;
    L170:
        return;
    L148:
        if (r4.contains(Integer.valueOf(r2)) == true) goto L157;
        r29.f(r34);
        if (r11[4].isEmpty() == false) goto L154;
        s(r29, 4);
        return;
    L154:
        if (r11[5].isEmpty() == false) goto L168;
        s(r29, 5);
        return;
    L168:
        return;
    L157:
        if (r210 == false) goto L169;
        Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + r2);
        return;
    L169:
        return;
    }

    public final void t(int r3, String r4, String r5) {
        HashMap[] r2 = this.d;
        if (r2[r3].isEmpty() == false) goto L5;
        return;
    L5:
        if (r2[r3].get(r4) == null) goto L9;
        HashMap r0 = r2[r3];
        r0.put(r5, r0.get(r4));
        r2[r3].remove(r4);
        return;
    }

    public final void u(a31 r18) {
        HashMap r2 = this.d[4];
        b31 r3 = (b31) r2.get("Compression");
        if (r3 == null) goto L80;
        int r4 = r3.e(this.f);
        if (r4 == 1) goto L12;
        if (r4 != 6) goto L8;
        m(r18, r2);
        return;
    L8:
        if (r4 == 7) goto L12;
        return;
    L12:
        b31 r5 = (b31) r2.get("BitsPerSample");
        if (r5 == null) goto L77;
        int[] r6 = (int[]) r5.g(this.f);
        int[] r7 = m;
        if (Arrays.equals(r7, r6) == false) goto L18;
    L28:
        b31 r8 = (b31) r2.get("StripOffsets");
        b31 r9 = (b31) r2.get("StripByteCounts");
        if (r8 == null) goto L87;
        if (r9 == null) goto L88;
        long[] r10 = gi1.l(r8.g(this.f));
        long[] r11 = gi1.l(r9.g(this.f));
        if (r10 != null) goto L34;
    L74:
        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
        return;
    L34:
        if (r10.length == 0) goto L74;
        if (r11 != null) goto L38;
    L72:
        Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
        return;
    L38:
        if (r11.length == 0) goto L72;
        if (r10.length == r11.length) goto L44;
        Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
        return;
    L44:
        int r12 = r11.length;
        long r13 = 0;
        int r14 = 0;
    L45:
        if (r14 >= r12) goto L47;
        r13 = r13 + r11[r14];
        r14 = r14 + 1;
        goto L45
    L47:
        byte[] r15 = new byte[(int) r13];
        this.g = true;
        int r16 = 0;
        int r17 = 0;
        int r19 = 0;
    L49:
        if (r16 >= r10.length) goto L69;
        int r110 = (int) r10[r16];
        int r111 = (int) r11[r16];
        if (r16 < (r10.length - 1)) goto L53;
    L55:
        int r112 = r110 - r17;
        if (r112 < 0) goto L57;
        long r113 = r112;
        if (r18.skip(r113) != r113) goto L61;
        int r20 = r17 + r112;
        byte[] r114 = new byte[r111];
        if (r18.read(r114) != r111) goto L65;
        r17 = r20 + r111;
        System.arraycopy(r114, 0, r15, r19, r111);
        r19 = r19 + r111;
        r16 = r16 + 1;
        goto L49
    L65:
        Log.d("ExifInterface", "Failed to read " + r111 + " bytes.");
        return;
    L61:
        Log.d("ExifInterface", "Failed to skip " + r112 + " bytes.");
        return;
    L57:
        Log.d("ExifInterface", "Invalid strip offset value");
        return;
    L53:
        if ((r110 + r111) == r10[r16 + 1]) goto L55;
        this.g = false;
        goto L55
    L69:
        if (this.g == false) goto L89;
        long r0 = r10[0];
        return;
    L89:
        return;
    L88:
        return;
    L87:
        return;
    L18:
        if (this.c != 3) goto L77;
        b31 r21 = (b31) r2.get("PhotometricInterpretation");
        if (r21 == null) goto L77;
        int r22 = r21.e(this.f);
        if (r22 == 1) goto L24;
    L25:
        if (r22 != 6) goto L77;
        if (Arrays.equals(r6, r7) == false) goto L77;
    L24:
        if (Arrays.equals(r6, n) == true) goto L28;
    L77:
        if (l == false) goto L90;
        Log.d("ExifInterface", "Unsupported data type value");
        return;
    L90:
        return;
    L80:
        m(r18, r2);
    }

    public final void v(int r9, int r10) {
        HashMap[] r0 = this.d;
        boolean r1 = r0[r9].isEmpty();
        boolean r3 = l;
        if (r1 == false) goto L5;
    L25:
        if (r3 == false) goto L32;
        Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        return;
    L32:
        return;
    L5:
        if (r0[r10].isEmpty() == true) goto L25;
        b31 r2 = (b31) r0[r9].get("ImageLength");
        b31 r5 = (b31) r0[r9].get("ImageWidth");
        b31 r4 = (b31) r0[r10].get("ImageLength");
        b31 r6 = (b31) r0[r10].get("ImageWidth");
        if (r2 == null) goto L22;
        if (r5 == null) goto L22;
        if (r4 == null) goto L19;
        if (r6 == null) goto L19;
        int r7 = r2.e(this.f);
        int r8 = r5.e(this.f);
        int r11 = r4.e(this.f);
        int r12 = r6.e(this.f);
        if (r7 >= r11) goto L28;
        if (r8 >= r12) goto L29;
        HashMap r13 = r0[r9];
        r0[r9] = r0[r10];
        r0[r10] = r13;
        return;
    L29:
        return;
    L28:
        return;
    L19:
        if (r3 == false) goto L30;
        Log.d("ExifInterface", "Second image does not contain valid size information");
        return;
    L30:
        return;
    L22:
        if (r3 == false) goto L31;
        Log.d("ExifInterface", "First image does not contain valid size information");
        return;
    }

    public final void w(e31 r12, int r13) {
        HashMap[] r0 = this.d;
        b31 r1 = (b31) r0[r13].get("DefaultCropSize");
        b31 r2 = (b31) r0[r13].get("SensorTopBorder");
        b31 r3 = (b31) r0[r13].get("SensorLeftBorder");
        b31 r4 = (b31) r0[r13].get("SensorBottomBorder");
        b31 r5 = (b31) r0[r13].get("SensorRightBorder");
        if (r1 == null) goto L24;
        int r14 = r1.a;
        ByteOrder r6 = this.f;
        if (r14 != 5) goto L14;
        d31[] r15 = (d31[]) r1.g(r6);
        if (r15 != null) goto L9;
    L12:
        Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(r15));
        return;
    L9:
        if (r15.length != 2) goto L12;
        b31 r7 = b31.b(r15[0], this.f);
        b31 r11 = b31.b(r15[1], this.f);
    L20:
        r0[r13].put("ImageWidth", r7);
        r0[r13].put("ImageLength", r11);
        return;
    L14:
        int[] r16 = (int[]) r1.g(r6);
        if (r16 != null) goto L17;
    L22:
        Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(r16));
        return;
    L17:
        if (r16.length != 2) goto L22;
        r7 = b31.c(r16[0], this.f);
        r11 = b31.c(r16[1], this.f);
        goto L20
    L24:
        if (r2 == null) goto L33;
        if (r3 == null) goto L33;
        if (r4 == null) goto L33;
        if (r5 == null) goto L33;
        int r17 = r2.e(this.f);
        int r8 = r4.e(this.f);
        int r9 = r5.e(this.f);
        int r10 = r3.e(this.f);
        if (r8 <= r17) goto L41;
        if (r9 <= r10) goto L42;
        b31 r18 = b31.c(r8 - r17, this.f);
        b31 r19 = b31.c(r9 - r10, this.f);
        r0[r13].put("ImageLength", r18);
        r0[r13].put("ImageWidth", r19);
        return;
    L42:
        return;
    L41:
        return;
    L33:
        b31 r20 = (b31) r0[r13].get("ImageLength");
        b31 r21 = (b31) r0[r13].get("ImageWidth");
        if (r20 == null) goto L36;
        if (r21 == null) goto L36;
        return;
    L36:
        b31 r22 = (b31) r0[r13].get("JPEGInterchangeFormat");
        b31 r23 = (b31) r0[r13].get("JPEGInterchangeFormatLength");
        if (r22 == null) goto L44;
        if (r23 == null) goto L45;
        int r24 = r22.e(this.f);
        int r25 = r22.e(this.f);
        r12.f(r24);
        byte[] r26 = new byte[r25];
        r12.read(r26);
        e(new a31(r26), r24, r13);
        return;
    L45:
        return;
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] r3 = this.d;
        b31 r5 = (b31) r3[1].get("PixelXDimension");
        b31 r4 = (b31) r3[1].get("PixelYDimension");
        if (r5 == null) goto L7;
        if (r4 == null) goto L7;
        r3[0].put("ImageWidth", r5);
        r3[0].put("ImageLength", r4);
    L7:
        if (r3[4].isEmpty() == false) goto L12;
        if (n(r3[5]) == false) goto L12;
        r3[4] = r3[5];
        r3[5] = new HashMap();
    L12:
        if (n(r3[4]) == true) goto L14;
        Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    L14:
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
