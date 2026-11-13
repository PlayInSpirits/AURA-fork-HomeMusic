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
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f31 {
    public static final byte[] A;
    public static final String[] B;
    public static final int[] C;
    public static final byte[] D;
    public static final c31 E;
    public static final c31[][] F;
    public static final c31[] G;
    public static final HashMap[] H;
    public static final HashMap[] I;
    public static final HashSet J;
    public static final HashMap K;
    public static final Charset L;
    public static final byte[] M;
    public static final byte[] N;
    public static final boolean l = Log.isLoggable("ExifInterface", 3);
    public static final int[] m;
    public static final int[] n;
    public static final byte[] o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
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
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
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
        c31[] c31VarArr = {new c31("NewSubfileType", 254, 4), new c31("SubfileType", 255, 4), new c31("ImageWidth", 256, 3, 4), new c31("ImageLength", 257, 3, 4), new c31("BitsPerSample", 258, 3), new c31("Compression", 259, 3), new c31("PhotometricInterpretation", 262, 3), new c31("ImageDescription", 270, 2), new c31("Make", 271, 2), new c31("Model", 272, 2), new c31("StripOffsets", 273, 3, 4), new c31("Orientation", 274, 3), new c31("SamplesPerPixel", 277, 3), new c31("RowsPerStrip", 278, 3, 4), new c31("StripByteCounts", 279, 3, 4), new c31("XResolution", 282, 5), new c31("YResolution", 283, 5), new c31("PlanarConfiguration", 284, 3), new c31("ResolutionUnit", 296, 3), new c31("TransferFunction", 301, 3), new c31("Software", 305, 2), new c31("DateTime", 306, 2), new c31("Artist", 315, 2), new c31("WhitePoint", 318, 5), new c31("PrimaryChromaticities", 319, 5), new c31("SubIFDPointer", 330, 4), new c31("JPEGInterchangeFormat", 513, 4), new c31("JPEGInterchangeFormatLength", 514, 4), new c31("YCbCrCoefficients", 529, 5), new c31("YCbCrSubSampling", 530, 3), new c31("YCbCrPositioning", 531, 3), new c31("ReferenceBlackWhite", 532, 5), new c31("Copyright", 33432, 2), new c31("ExifIFDPointer", 34665, 4), new c31("GPSInfoIFDPointer", 34853, 4), new c31("SensorTopBorder", 4, 4), new c31("SensorLeftBorder", 5, 4), new c31("SensorBottomBorder", 6, 4), new c31("SensorRightBorder", 7, 4), new c31("ISO", 23, 3), new c31("JpgFromRaw", 46, 7), new c31("Xmp", 700, 1)};
        c31[] c31VarArr2 = {new c31("ExposureTime", 33434, 5), new c31("FNumber", 33437, 5), new c31("ExposureProgram", 34850, 3), new c31("SpectralSensitivity", 34852, 2), new c31("PhotographicSensitivity", 34855, 3), new c31("OECF", 34856, 7), new c31("SensitivityType", 34864, 3), new c31("StandardOutputSensitivity", 34865, 4), new c31("RecommendedExposureIndex", 34866, 4), new c31("ISOSpeed", 34867, 4), new c31("ISOSpeedLatitudeyyy", 34868, 4), new c31("ISOSpeedLatitudezzz", 34869, 4), new c31("ExifVersion", 36864, 2), new c31("DateTimeOriginal", 36867, 2), new c31("DateTimeDigitized", 36868, 2), new c31("OffsetTime", 36880, 2), new c31("OffsetTimeOriginal", 36881, 2), new c31("OffsetTimeDigitized", 36882, 2), new c31("ComponentsConfiguration", 37121, 7), new c31("CompressedBitsPerPixel", 37122, 5), new c31("ShutterSpeedValue", 37377, 10), new c31("ApertureValue", 37378, 5), new c31("BrightnessValue", 37379, 10), new c31("ExposureBiasValue", 37380, 10), new c31("MaxApertureValue", 37381, 5), new c31("SubjectDistance", 37382, 5), new c31("MeteringMode", 37383, 3), new c31("LightSource", 37384, 3), new c31("Flash", 37385, 3), new c31("FocalLength", 37386, 5), new c31("SubjectArea", 37396, 3), new c31("MakerNote", 37500, 7), new c31("UserComment", 37510, 7), new c31("SubSecTime", 37520, 2), new c31("SubSecTimeOriginal", 37521, 2), new c31("SubSecTimeDigitized", 37522, 2), new c31("FlashpixVersion", 40960, 7), new c31("ColorSpace", 40961, 3), new c31("PixelXDimension", 40962, 3, 4), new c31("PixelYDimension", 40963, 3, 4), new c31("RelatedSoundFile", 40964, 2), new c31("InteroperabilityIFDPointer", 40965, 4), new c31("FlashEnergy", 41483, 5), new c31("SpatialFrequencyResponse", 41484, 7), new c31("FocalPlaneXResolution", 41486, 5), new c31("FocalPlaneYResolution", 41487, 5), new c31("FocalPlaneResolutionUnit", 41488, 3), new c31("SubjectLocation", 41492, 3), new c31("ExposureIndex", 41493, 5), new c31("SensingMethod", 41495, 3), new c31("FileSource", 41728, 7), new c31("SceneType", 41729, 7), new c31("CFAPattern", 41730, 7), new c31("CustomRendered", 41985, 3), new c31("ExposureMode", 41986, 3), new c31("WhiteBalance", 41987, 3), new c31("DigitalZoomRatio", 41988, 5), new c31("FocalLengthIn35mmFilm", 41989, 3), new c31("SceneCaptureType", 41990, 3), new c31("GainControl", 41991, 3), new c31("Contrast", 41992, 3), new c31("Saturation", 41993, 3), new c31("Sharpness", 41994, 3), new c31("DeviceSettingDescription", 41995, 7), new c31("SubjectDistanceRange", 41996, 3), new c31("ImageUniqueID", 42016, 2), new c31("CameraOwnerName", 42032, 2), new c31("BodySerialNumber", 42033, 2), new c31("LensSpecification", 42034, 5), new c31("LensMake", 42035, 2), new c31("LensModel", 42036, 2), new c31("Gamma", 42240, 5), new c31("DNGVersion", 50706, 1), new c31("DefaultCropSize", 50720, 3, 4)};
        c31[] c31VarArr3 = {new c31("GPSVersionID", 0, 1), new c31("GPSLatitudeRef", 1, 2), new c31("GPSLatitude", 2, 5, 10), new c31("GPSLongitudeRef", 3, 2), new c31("GPSLongitude", 4, 5, 10), new c31("GPSAltitudeRef", 5, 1), new c31("GPSAltitude", 6, 5), new c31("GPSTimeStamp", 7, 5), new c31("GPSSatellites", 8, 2), new c31("GPSStatus", 9, 2), new c31("GPSMeasureMode", 10, 2), new c31("GPSDOP", 11, 5), new c31("GPSSpeedRef", 12, 2), new c31("GPSSpeed", 13, 5), new c31("GPSTrackRef", 14, 2), new c31("GPSTrack", 15, 5), new c31("GPSImgDirectionRef", 16, 2), new c31("GPSImgDirection", 17, 5), new c31("GPSMapDatum", 18, 2), new c31("GPSDestLatitudeRef", 19, 2), new c31("GPSDestLatitude", 20, 5), new c31("GPSDestLongitudeRef", 21, 2), new c31("GPSDestLongitude", 22, 5), new c31("GPSDestBearingRef", 23, 2), new c31("GPSDestBearing", 24, 5), new c31("GPSDestDistanceRef", 25, 2), new c31("GPSDestDistance", 26, 5), new c31("GPSProcessingMethod", 27, 7), new c31("GPSAreaInformation", 28, 7), new c31("GPSDateStamp", 29, 2), new c31("GPSDifferential", 30, 3), new c31("GPSHPositioningError", 31, 5)};
        c31[] c31VarArr4 = {new c31("InteroperabilityIndex", 1, 2)};
        c31[] c31VarArr5 = {new c31("NewSubfileType", 254, 4), new c31("SubfileType", 255, 4), new c31("ThumbnailImageWidth", 256, 3, 4), new c31("ThumbnailImageLength", 257, 3, 4), new c31("BitsPerSample", 258, 3), new c31("Compression", 259, 3), new c31("PhotometricInterpretation", 262, 3), new c31("ImageDescription", 270, 2), new c31("Make", 271, 2), new c31("Model", 272, 2), new c31("StripOffsets", 273, 3, 4), new c31("ThumbnailOrientation", 274, 3), new c31("SamplesPerPixel", 277, 3), new c31("RowsPerStrip", 278, 3, 4), new c31("StripByteCounts", 279, 3, 4), new c31("XResolution", 282, 5), new c31("YResolution", 283, 5), new c31("PlanarConfiguration", 284, 3), new c31("ResolutionUnit", 296, 3), new c31("TransferFunction", 301, 3), new c31("Software", 305, 2), new c31("DateTime", 306, 2), new c31("Artist", 315, 2), new c31("WhitePoint", 318, 5), new c31("PrimaryChromaticities", 319, 5), new c31("SubIFDPointer", 330, 4), new c31("JPEGInterchangeFormat", 513, 4), new c31("JPEGInterchangeFormatLength", 514, 4), new c31("YCbCrCoefficients", 529, 5), new c31("YCbCrSubSampling", 530, 3), new c31("YCbCrPositioning", 531, 3), new c31("ReferenceBlackWhite", 532, 5), new c31("Copyright", 33432, 2), new c31("ExifIFDPointer", 34665, 4), new c31("GPSInfoIFDPointer", 34853, 4), new c31("DNGVersion", 50706, 1), new c31("DefaultCropSize", 50720, 3, 4)};
        E = new c31("StripOffsets", 273, 3);
        F = new c31[][]{c31VarArr, c31VarArr2, c31VarArr3, c31VarArr4, c31VarArr5, c31VarArr, new c31[]{new c31("ThumbnailImage", 256, 7), new c31("CameraSettingsIFDPointer", 8224, 4), new c31("ImageProcessingIFDPointer", 8256, 4)}, new c31[]{new c31("PreviewImageStart", 257, 4), new c31("PreviewImageLength", 258, 4)}, new c31[]{new c31("AspectFrame", 4371, 3)}, new c31[]{new c31("ColorSpace", 55, 3)}};
        G = new c31[]{new c31("SubIFDPointer", 330, 4), new c31("ExifIFDPointer", 34665, 4), new c31("GPSInfoIFDPointer", 34853, 4), new c31("InteroperabilityIFDPointer", 40965, 4), new c31("CameraSettingsIFDPointer", 8224, 1), new c31("ImageProcessingIFDPointer", 8256, 1)};
        H = new HashMap[10];
        I = new HashMap[10];
        J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        K = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        L = charsetForName;
        M = "Exif\u0000\u0000".getBytes(charsetForName);
        N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            c31[][] c31VarArr6 = F;
            if (i >= c31VarArr6.length) {
                HashMap map = K;
                c31[] c31VarArr7 = G;
                map.put(Integer.valueOf(c31VarArr7[0].a), 5);
                map.put(Integer.valueOf(c31VarArr7[1].a), 1);
                map.put(Integer.valueOf(c31VarArr7[2].a), 2);
                map.put(Integer.valueOf(c31VarArr7[3].a), 3);
                map.put(Integer.valueOf(c31VarArr7[4].a), 7);
                map.put(Integer.valueOf(c31VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            H[i] = new HashMap();
            I[i] = new HashMap();
            for (c31 c31Var : c31VarArr6[i]) {
                H[i].put(Integer.valueOf(c31Var.a), c31Var);
                I[i].put(c31Var.b, c31Var);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d8 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:14:0x004f, B:16:0x0052, B:23:0x0067, B:29:0x0084, B:31:0x008f, B:39:0x00a5, B:34:0x0096, B:37:0x009e, B:38:0x00a2, B:40:0x00af, B:42:0x00b8, B:44:0x00be, B:46:0x00c4, B:48:0x00ca, B:53:0x00d8), top: B:65:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public f31(InputStream inputStream) throws IOException {
        c31[][] c31VarArr = F;
        this.d = new HashMap[c31VarArr.length];
        this.e = new HashSet(c31VarArr.length);
        this.f = ByteOrder.BIG_ENDIAN;
        boolean z2 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z3 = l;
        if (z2) {
            this.b = (AssetManager.AssetInputStream) inputStream;
            this.a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                h31.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.b = null;
                this.a = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z3) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.b = null;
                this.a = null;
            }
        } else {
            this.b = null;
            this.a = null;
        }
        for (int i = 0; i < c31VarArr.length; i++) {
            try {
                try {
                    this.d[i] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z3) {
                        p();
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                if (z3) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z3) {
                    return;
                }
            } catch (UnsupportedOperationException e2) {
                e = e2;
                if (z3) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (!z3) {
                    return;
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, SmartSession.MAX_SONGS);
        int iF = f(bufferedInputStream);
        this.c = iF;
        if (iF == 4 || iF == 9 || iF == 13 || iF == 14) {
            a31 a31Var = new a31(bufferedInputStream);
            int i2 = this.c;
            if (i2 == 4) {
                e(a31Var, 0, 0);
            } else if (i2 == 13) {
                h(a31Var);
            } else if (i2 == 9) {
                i(a31Var);
            } else if (i2 == 14) {
                l(a31Var);
            }
        } else {
            e31 e31Var = new e31(bufferedInputStream);
            int i3 = this.c;
            if (i3 == 12) {
                d(e31Var);
            } else if (i3 == 7) {
                g(e31Var);
            } else if (i3 == 10) {
                k(e31Var);
            } else {
                j(e31Var);
            }
            e31Var.f(this.h);
            u(e31Var);
        }
        a();
        if (!z3) {
            return;
        }
        p();
    }

    public static ByteOrder q(a31 a31Var) throws IOException {
        short s2 = a31Var.readShort();
        boolean z2 = l;
        if (s2 == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 != 19789) {
            mj0.m(Integer.toHexString(s2), "Invalid byte order: ");
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.d;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat(String.valueOf((char) 0)).getBytes(L);
            map.put("DateTime", new b31(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", b31.a(0L, this.f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", b31.a(0L, this.f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", b31.a(0L, this.f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", b31.a(0L, this.f));
        }
    }

    public final String b(String str) {
        b31 b31VarC = c(str);
        if (b31VarC != null) {
            int i = b31VarC.a;
            if (!J.contains(str)) {
                return b31VarC.f(this.f);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                d31[] d31VarArr = (d31[]) b31VarC.g(this.f);
                if (d31VarArr == null || d31VarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(d31VarArr));
                    return null;
                }
                d31 d31Var = d31VarArr[0];
                Integer numValueOf = Integer.valueOf((int) (d31Var.a / d31Var.b));
                d31 d31Var2 = d31VarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (d31Var2.a / d31Var2.b));
                d31 d31Var3 = d31VarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (d31Var3.a / d31Var3.b)));
            }
            try {
                return Double.toString(b31VarC.d(this.f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final b31 c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < F.length; i++) {
            b31 b31Var = (b31) this.d[i].get(str);
            if (b31Var != null) {
                return b31Var;
            }
        }
        return null;
    }

    public final void d(e31 e31Var) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i;
        if (Build.VERSION.SDK_INT < 28) {
            er1.l("Reading EXIF from HEIF files is supported from SDK 28 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                i31.a(mediaMetadataRetriever, new z21(e31Var));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", b31.c(Integer.parseInt(strExtractMetadata), this.f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", b31.c(Integer.parseInt(strExtractMetadata2), this.f));
                }
                if (strExtractMetadata3 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata3);
                    if (i2 == 90) {
                        i = 6;
                    } else if (i2 != 180) {
                        i = i2 != 270 ? 1 : 8;
                    } else {
                        i = 3;
                    }
                    mapArr[0].put("Orientation", b31.c(i, this.f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    int i4 = Integer.parseInt(strExtractMetadata5);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    e31Var.f(i3);
                    byte[] bArr = new byte[6];
                    if (e31Var.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    if (e31Var.read(bArr2) != i6) {
                        throw new IOException("Can't read exif");
                    }
                    this.h = i5;
                    r(0, bArr2);
                }
                if (l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x013d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0144 A[LOOP:2: B:69:0x013a->B:74:0x0144, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0156  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /**
     * Reads JPEG marker segments and extracts Exif, XMP, comments and image dimensions.
     *
     * Reconstructed from AURA 0.75.1 Smali (La31;/Lb31;/Lf31; fields) and checked
     * against the corresponding AndroidX ExifInterface JPEG segment reader.
     */
    public final void e(a31 input, int offsetToJpeg, int imageType) throws IOException {
        if (l) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + input);
        }

        input.o = ByteOrder.BIG_ENDIAN;
        int bytesRead = 2;

        byte marker = input.readByte();
        if (marker != (byte) 0xFF) {
            throw new IOException("Invalid marker: " + Integer.toHexString(marker & 0xFF));
        }

        marker = input.readByte();
        if (marker != (byte) 0xD8) {
            throw new IOException("Invalid marker: " + Integer.toHexString(0xFF));
        }

        while (true) {
            byte markerPrefix = input.readByte();
            if (markerPrefix != (byte) 0xFF) {
                throw new IOException(
                        "Invalid marker:" + Integer.toHexString(markerPrefix & 0xFF));
            }

            marker = input.readByte();
            if (l) {
                Log.d("ExifInterface",
                        "Found JPEG segment indicator: " + Integer.toHexString(marker & 0xFF));
            }
            bytesRead += 4;

            // End Of Image and Start Of Scan terminate metadata parsing.
            if (marker == (byte) 0xD9 || marker == (byte) 0xDA) {
                input.o = this.f;
                return;
            }

            int segmentLength = input.readUnsignedShort();
            int remaining = segmentLength - 2;
            if (l) {
                Log.d("ExifInterface", "JPEG segment: "
                        + Integer.toHexString(marker & 0xFF)
                        + " (length: " + segmentLength + ")");
            }
            if (remaining < 0) {
                throw new IOException("Invalid length");
            }

            int markerCode = marker & 0xFF;
            if (markerCode == 0xE1) {
                // APP1 may contain either the Exif TIFF payload or an XMP packet.
                int segmentStart = bytesRead;
                byte[] segment = new byte[remaining];
                input.readFully(segment);
                int segmentEnd = bytesRead + remaining;
                remaining = 0;

                byte[] exifPrefix = M;
                boolean isExif = exifPrefix != null && segment.length >= exifPrefix.length;
                if (isExif) {
                    for (int i = 0; i < exifPrefix.length; i++) {
                        if (segment[i] != exifPrefix[i]) {
                            isExif = false;
                            break;
                        }
                    }
                }

                if (isExif) {
                    byte[] exifData = Arrays.copyOfRange(
                            segment, exifPrefix.length, segment.length);
                    this.h = offsetToJpeg + segmentStart + exifPrefix.length;
                    this.r(imageType, exifData);
                    this.u(new a31(exifData));
                } else {
                    byte[] xmpPrefix = N;
                    boolean isXmp = xmpPrefix != null && segment.length >= xmpPrefix.length;
                    if (isXmp) {
                        for (int i = 0; i < xmpPrefix.length; i++) {
                            if (segment[i] != xmpPrefix[i]) {
                                isXmp = false;
                                break;
                            }
                        }
                    }
                    if (isXmp && this.b("Xmp") == null) {
                        byte[] xmpData = Arrays.copyOfRange(
                                segment, xmpPrefix.length, segment.length);
                        this.d[0].put("Xmp", new b31(
                                (long) segmentStart + xmpPrefix.length,
                                xmpData,
                                1,
                                xmpData.length));
                    }
                }

                // The entire APP1 segment has already been consumed.
                bytesRead = segmentEnd;
            } else if (markerCode == 0xFE) {
                // JPEG COM segment: expose its content as the Exif UserComment tag.
                byte[] commentBytes = new byte[remaining];
                int read = input.read(commentBytes);
                if (read != remaining) {
                    throw new IOException("Invalid exif");
                }
                if (this.b("UserComment") == null) {
                    String comment = new String(commentBytes, L).concat("\u0000");
                    byte[] encodedComment = comment.getBytes(L);
                    this.d[1].put("UserComment",
                            new b31(encodedComment, 1, encodedComment.length));
                }
                remaining = 0;
            } else if (isJpegStartOfFrame(markerCode)) {
                // SOF payload begins with sample precision, followed by height and width.
                input.b(1);
                long imageLength = input.readUnsignedShort();
                long imageWidth = input.readUnsignedShort();
                HashMap attributes = this.d[imageType];
                boolean thumbnail = imageType == 4;
                attributes.put(
                        thumbnail ? "ThumbnailImageLength" : "ImageLength",
                        b31.a(imageLength, this.f));
                attributes.put(
                        thumbnail ? "ThumbnailImageWidth" : "ImageWidth",
                        b31.a(imageWidth, this.f));
                remaining -= 5;
            }

            if (remaining < 0) {
                throw new IOException("Invalid length");
            }
            input.b(remaining);
            bytesRead += remaining;
        }
    }

    private static boolean isJpegStartOfFrame(int markerCode) {
        return (markerCode >= 0xC0 && markerCode <= 0xC3)
                || (markerCode >= 0xC5 && markerCode <= 0xC7)
                || (markerCode >= 0xC9 && markerCode <= 0xCB)
                || (markerCode >= 0xCD && markerCode <= 0xCF);
    }

    public final int f(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        a31 a31Var;
        a31 a31Var2;
        int i2;
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        byte[] bArr2;
        int i6;
        byte[] bArr3;
        a31 a31Var3;
        short s2;
        long j;
        bufferedInputStream.mark(SmartSession.MAX_SONGS);
        byte[] bArr4 = new byte[SmartSession.MAX_SONGS];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i7 = 0;
        while (true) {
            byte[] bArr5 = o;
            if (i7 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i7] != bArr5[i7]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i8 = 0; i8 < bytes.length; i8++) {
                    byte b = bArr4[i8];
                    byte r7 = bytes[i8];
                    if (b != r7) {
                        int r4 = 0;
                        a31 a31Var4 = null;
                        a31 a31Var5 = null;
                        a31 a31Var6 = null;
                        try {
                            try {
                                try {
                                    try {
                                        a31Var = new a31(bArr4);
                                        try {
                                            long j2 = a31Var.readInt();
                                            byte[] bArr6 = new byte[4];
                                            a31Var.read(bArr6);
                                            if (Arrays.equals(bArr6, p)) {
                                                if (j2 == 1) {
                                                    j2 = a31Var.readLong();
                                                    j = 16;
                                                    if (j2 < 16) {
                                                    }
                                                } else {
                                                    j = 8;
                                                }
                                                if (j2 > 5000) {
                                                    j2 = 5000;
                                                }
                                                long j3 = j2 - j;
                                                if (j3 >= 8) {
                                                    byte[] bArr7 = new byte[4];
                                                    long j4 = 0;
                                                    boolean z2 = false;
                                                    boolean z3 = false;
                                                    while (true) {
                                                        if (j4 >= j3 / 4) {
                                                            i = 0;
                                                            break;
                                                        }
                                                        i = 0;
                                                        try {
                                                            if (a31Var.read(bArr7) != 4) {
                                                                break;
                                                            }
                                                            if (j4 != 1) {
                                                                if (Arrays.equals(bArr7, q)) {
                                                                    z2 = true;
                                                                } else if (Arrays.equals(bArr7, r)) {
                                                                    z3 = true;
                                                                }
                                                                if (z2 && z3) {
                                                                    a31Var.close();
                                                                    return 12;
                                                                }
                                                            }
                                                            j4++;
                                                        } catch (Exception e) {
                                                            e = e;
                                                            if (l) {
                                                                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                            }
                                                            if (a31Var != null) {
                                                                break;
                                                            }
                                                            a31Var2 = new a31(bArr4);
                                                            ByteOrder byteOrderQ = q(a31Var2);
                                                            this.f = byteOrderQ;
                                                            a31Var2.o = byteOrderQ;
                                                            s2 = a31Var2.readShort();
                                                            if (s2 != 20306) {
                                                                i2 = 1;
                                                            } else {
                                                                i2 = 1;
                                                            }
                                                            a31Var2.close();
                                                            if (i2 != 0) {
                                                                return 7;
                                                            }
                                                            try {
                                                                a31Var3 = new a31(bArr4);
                                                                try {
                                                                    ByteOrder byteOrderQ2 = q(a31Var3);
                                                                    this.f = byteOrderQ2;
                                                                    a31Var3.o = byteOrderQ2;
                                                                    i3 = a31Var3.readShort() != 85 ? i : 1;
                                                                    a31Var3.close();
                                                                } catch (Exception unused) {
                                                                    a31Var4 = a31Var3;
                                                                    if (a31Var4 != null) {
                                                                        a31Var4.close();
                                                                    }
                                                                    i3 = i;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    a31Var5 = a31Var3;
                                                                    if (a31Var5 != null) {
                                                                        a31Var5.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception unused2) {
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                            }
                                                            if (i3 != 0) {
                                                                return 10;
                                                            }
                                                            i4 = i;
                                                            while (true) {
                                                                bArr = u;
                                                                if (i4 < bArr.length) {
                                                                    return 13;
                                                                }
                                                                if (bArr4[i4] != bArr[i4]) {
                                                                    i5 = i;
                                                                    while (true) {
                                                                        bArr2 = y;
                                                                        if (i5 < bArr2.length) {
                                                                            i6 = i;
                                                                            while (true) {
                                                                                bArr3 = z;
                                                                                if (i6 < bArr3.length) {
                                                                                    return 14;
                                                                                }
                                                                                if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                                    break;
                                                                                }
                                                                                i6++;
                                                                            }
                                                                        } else {
                                                                            if (bArr4[i5] != bArr2[i5]) {
                                                                                break;
                                                                            }
                                                                            i5++;
                                                                        }
                                                                    }
                                                                    return i;
                                                                }
                                                                i4++;
                                                            }
                                                        }
                                                    }
                                                    a31Var.close();
                                                    a31Var2 = new a31(bArr4);
                                                    ByteOrder byteOrderQ3 = q(a31Var2);
                                                    this.f = byteOrderQ3;
                                                    a31Var2.o = byteOrderQ3;
                                                    s2 = a31Var2.readShort();
                                                    if (s2 != 20306 || s2 == 21330) {
                                                        i2 = 1;
                                                    } else {
                                                        i2 = i;
                                                    }
                                                    a31Var2.close();
                                                    if (i2 != 0) {
                                                        return 7;
                                                    }
                                                    a31Var3 = new a31(bArr4);
                                                    ByteOrder byteOrderQ4 = q(a31Var3);
                                                    this.f = byteOrderQ4;
                                                    a31Var3.o = byteOrderQ4;
                                                    if (a31Var3.readShort() != 85) {
                                                    }
                                                    a31Var3.close();
                                                    if (i3 != 0) {
                                                        return 10;
                                                    }
                                                    i4 = i;
                                                    while (true) {
                                                        bArr = u;
                                                        if (i4 < bArr.length) {
                                                            return 13;
                                                        }
                                                        if (bArr4[i4] != bArr[i4]) {
                                                            i5 = i;
                                                            while (true) {
                                                                bArr2 = y;
                                                                if (i5 < bArr2.length) {
                                                                    i6 = i;
                                                                    while (true) {
                                                                        bArr3 = z;
                                                                        if (i6 < bArr3.length) {
                                                                            return 14;
                                                                        }
                                                                        if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i6++;
                                                                    }
                                                                } else {
                                                                    if (bArr4[i5] != bArr2[i5]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i5++;
                                                                }
                                                            }
                                                            return i;
                                                        }
                                                        i4++;
                                                    }
                                                }
                                                if (l) {
                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                }
                                                if (a31Var != null) {
                                                    a31Var.close();
                                                }
                                                a31Var2 = new a31(bArr4);
                                                ByteOrder byteOrderQ5 = q(a31Var2);
                                                this.f = byteOrderQ5;
                                                a31Var2.o = byteOrderQ5;
                                                s2 = a31Var2.readShort();
                                                if (s2 != 20306) {
                                                    i2 = 1;
                                                } else {
                                                    i2 = 1;
                                                }
                                                a31Var2.close();
                                                if (i2 != 0) {
                                                    return 7;
                                                }
                                                a31Var3 = new a31(bArr4);
                                                ByteOrder byteOrderQ6 = q(a31Var3);
                                                this.f = byteOrderQ6;
                                                a31Var3.o = byteOrderQ6;
                                                if (a31Var3.readShort() != 85) {
                                                }
                                                a31Var3.close();
                                                if (i3 != 0) {
                                                    return 10;
                                                }
                                                i4 = i;
                                                while (true) {
                                                    bArr = u;
                                                    if (i4 < bArr.length) {
                                                        return 13;
                                                    }
                                                    if (bArr4[i4] != bArr[i4]) {
                                                        i5 = i;
                                                        while (true) {
                                                            bArr2 = y;
                                                            if (i5 < bArr2.length) {
                                                                i6 = i;
                                                                while (true) {
                                                                    bArr3 = z;
                                                                    if (i6 < bArr3.length) {
                                                                        return 14;
                                                                    }
                                                                    if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i6++;
                                                                }
                                                            } else {
                                                                if (bArr4[i5] != bArr2[i5]) {
                                                                    break;
                                                                    break;
                                                                }
                                                                i5++;
                                                            }
                                                        }
                                                        return i;
                                                    }
                                                    i4++;
                                                }
                                            }
                                            a31Var.close();
                                            i = 0;
                                        } catch (Exception e2) {
                                            e = e2;
                                            i = 0;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r4 = r7;
                                        if (r4 != 0) {
                                            r4.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    i = 0;
                                    a31Var = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (r4 != 0) {
                                        r4.close();
                                    }
                                    throw th;
                                }
                                ByteOrder byteOrderQ7 = q(a31Var2);
                                this.f = byteOrderQ7;
                                a31Var2.o = byteOrderQ7;
                                s2 = a31Var2.readShort();
                                if (s2 != 20306) {
                                    i2 = 1;
                                } else {
                                    i2 = 1;
                                }
                                a31Var2.close();
                            } catch (Exception unused3) {
                                if (a31Var2 != null) {
                                    a31Var2.close();
                                }
                                i2 = i;
                            } catch (Throwable th5) {
                                th = th5;
                                a31Var6 = a31Var2;
                                if (a31Var6 != null) {
                                    a31Var6.close();
                                }
                                throw th;
                            }
                            a31Var2 = new a31(bArr4);
                        } catch (Exception unused4) {
                            a31Var2 = null;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        if (i2 != 0) {
                            return 7;
                        }
                        a31Var3 = new a31(bArr4);
                        ByteOrder byteOrderQ8 = q(a31Var3);
                        this.f = byteOrderQ8;
                        a31Var3.o = byteOrderQ8;
                        if (a31Var3.readShort() != 85) {
                        }
                        a31Var3.close();
                        if (i3 != 0) {
                            return 10;
                        }
                        i4 = i;
                        while (true) {
                            bArr = u;
                            if (i4 < bArr.length) {
                                return 13;
                            }
                            if (bArr4[i4] != bArr[i4]) {
                                i5 = i;
                                while (true) {
                                    bArr2 = y;
                                    if (i5 < bArr2.length) {
                                        i6 = i;
                                        while (true) {
                                            bArr3 = z;
                                            if (i6 < bArr3.length) {
                                                return 14;
                                            }
                                            if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                break;
                                                break;
                                            }
                                            i6++;
                                        }
                                    } else {
                                        if (bArr4[i5] != bArr2[i5]) {
                                            break;
                                            break;
                                        }
                                        i5++;
                                    }
                                }
                                return i;
                            }
                            i4++;
                        }
                    }
                }
                return 9;
            }
            i7++;
        }
    }

    public final void g(e31 e31Var) throws IOException {
        int i;
        int i2;
        j(e31Var);
        HashMap[] mapArr = this.d;
        b31 b31Var = (b31) mapArr[1].get("MakerNote");
        if (b31Var != null) {
            e31 e31Var2 = new e31(b31Var.d);
            e31Var2.o = this.f;
            byte[] bArr = s;
            byte[] bArr2 = new byte[bArr.length];
            e31Var2.readFully(bArr2);
            e31Var2.f(0L);
            byte[] bArr3 = t;
            byte[] bArr4 = new byte[bArr3.length];
            e31Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                e31Var2.f(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                e31Var2.f(12L);
            }
            s(e31Var2, 6);
            b31 b31Var2 = (b31) mapArr[7].get("PreviewImageStart");
            b31 b31Var3 = (b31) mapArr[7].get("PreviewImageLength");
            if (b31Var2 != null && b31Var3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", b31Var2);
                mapArr[5].put("JPEGInterchangeFormatLength", b31Var3);
            }
            b31 b31Var4 = (b31) mapArr[8].get("AspectFrame");
            if (b31Var4 != null) {
                int[] iArr = (int[]) b31Var4.g(this.f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                b31 b31VarC = b31.c(i5, this.f);
                b31 b31VarC2 = b31.c(i6, this.f);
                mapArr[0].put("ImageWidth", b31VarC);
                mapArr[0].put("ImageLength", b31VarC2);
            }
        }
    }

    public final void h(a31 a31Var) throws IOException {
        if (l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + a31Var);
        }
        a31Var.o = ByteOrder.BIG_ENDIAN;
        byte[] bArr = u;
        a31Var.b(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = a31Var.readInt();
                byte[] bArr2 = new byte[4];
                if (a31Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, x)) {
                    return;
                }
                if (Arrays.equals(bArr2, v)) {
                    byte[] bArr3 = new byte[i];
                    if (a31Var.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + gi1.f(bArr2));
                    }
                    int i3 = a31Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.h = i2;
                        r(0, bArr3);
                        x();
                        u(new a31(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                a31Var.b(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                mj0.i("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    public final void i(a31 a31Var) throws IOException {
        boolean z2 = l;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + a31Var);
        }
        a31Var.b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        a31Var.read(bArr);
        a31Var.read(bArr2);
        a31Var.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        a31Var.b(i - a31Var.p);
        a31Var.read(bArr4);
        e(new a31(bArr4), i, 5);
        a31Var.b(i3 - a31Var.p);
        a31Var.o = ByteOrder.BIG_ENDIAN;
        int i4 = a31Var.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = a31Var.readUnsignedShort();
            int unsignedShort2 = a31Var.readUnsignedShort();
            if (unsignedShort == E.a) {
                short s2 = a31Var.readShort();
                short s3 = a31Var.readShort();
                b31 b31VarC = b31.c(s2, this.f);
                b31 b31VarC2 = b31.c(s3, this.f);
                HashMap[] mapArr = this.d;
                mapArr[0].put("ImageLength", b31VarC);
                mapArr[0].put("ImageWidth", b31VarC2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s2) + ", width: " + ((int) s3));
                    return;
                }
                return;
            }
            a31Var.b(unsignedShort2);
        }
    }

    public final void j(e31 e31Var) throws IOException {
        o(e31Var);
        s(e31Var, 0);
        w(e31Var, 0);
        w(e31Var, 5);
        w(e31Var, 4);
        x();
        if (this.c == 8) {
            HashMap[] mapArr = this.d;
            b31 b31Var = (b31) mapArr[1].get("MakerNote");
            if (b31Var != null) {
                e31 e31Var2 = new e31(b31Var.d);
                e31Var2.o = this.f;
                e31Var2.b(6);
                s(e31Var2, 9);
                b31 b31Var2 = (b31) mapArr[9].get("ColorSpace");
                if (b31Var2 != null) {
                    mapArr[1].put("ColorSpace", b31Var2);
                }
            }
        }
    }

    public final void k(e31 e31Var) throws IOException {
        if (l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + e31Var);
        }
        j(e31Var);
        HashMap[] mapArr = this.d;
        b31 b31Var = (b31) mapArr[0].get("JpgFromRaw");
        if (b31Var != null) {
            e(new a31(b31Var.d), (int) b31Var.c, 5);
        }
        b31 b31Var2 = (b31) mapArr[0].get("ISO");
        b31 b31Var3 = (b31) mapArr[1].get("PhotographicSensitivity");
        if (b31Var2 == null || b31Var3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", b31Var2);
    }

    public final void l(a31 a31Var) throws IOException {
        if (l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + a31Var);
        }
        a31Var.o = ByteOrder.LITTLE_ENDIAN;
        a31Var.b(y.length);
        int i = a31Var.readInt() + 8;
        byte[] bArr = z;
        a31Var.b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (a31Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = a31Var.readInt();
                int i3 = length + 8;
                if (Arrays.equals(A, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (a31Var.read(bArr3) == i2) {
                        this.h = i3;
                        r(0, bArr3);
                        u(new a31(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + gi1.f(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                a31Var.b(i2);
            } catch (EOFException unused) {
                mj0.i("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    public final void m(a31 a31Var, HashMap map) throws IOException {
        b31 b31Var = (b31) map.get("JPEGInterchangeFormat");
        b31 b31Var2 = (b31) map.get("JPEGInterchangeFormatLength");
        if (b31Var == null || b31Var2 == null) {
            return;
        }
        int iE = b31Var.e(this.f);
        int iE2 = b31Var2.e(this.f);
        if (this.c == 7) {
            iE += this.i;
        }
        if (iE > 0 && iE2 > 0 && this.b == null && this.a == null) {
            a31Var.skip(iE);
            a31Var.read(new byte[iE2]);
        }
        if (l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    public final boolean n(HashMap map) {
        b31 b31Var = (b31) map.get("ImageLength");
        b31 b31Var2 = (b31) map.get("ImageWidth");
        if (b31Var == null || b31Var2 == null) {
            return false;
        }
        return b31Var.e(this.f) <= 512 && b31Var2.e(this.f) <= 512;
    }

    public final void o(e31 e31Var) throws IOException {
        ByteOrder byteOrderQ = q(e31Var);
        this.f = byteOrderQ;
        e31Var.o = byteOrderQ;
        int unsignedShort = e31Var.readUnsignedShort();
        int i = this.c;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            mj0.m(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = e31Var.readInt();
        if (i2 < 8) {
            mj0.i(f34.f(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            e31Var.b(i3);
        }
    }

    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.d;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbJ = f34.j(i, "The size of tag group[", "]: ");
            sbJ.append(mapArr[i].size());
            Log.d("ExifInterface", sbJ.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                b31 b31Var = (b31) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + b31Var.toString() + ", tagValue: '" + b31Var.f(this.f) + "'");
            }
            i++;
        }
    }

    public final void r(int i, byte[] bArr) throws IOException {
        e31 e31Var = new e31(bArr);
        o(e31Var);
        s(e31Var, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0213  */
    /* JADX WARN: Code duplicated, block: B:108:0x0220  */
    /* JADX WARN: Code duplicated, block: B:109:0x0225  */
    /* JADX WARN: Code duplicated, block: B:110:0x0231  */
    /* JADX WARN: Code duplicated, block: B:112:0x0238  */
    /* JADX WARN: Code duplicated, block: B:115:0x024f  */
    /* JADX WARN: Code duplicated, block: B:117:0x025a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0267 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0269  */
    /* JADX WARN: Code duplicated, block: B:121:0x0288 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x028a  */
    /* JADX WARN: Code duplicated, block: B:124:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:131:0x02df  */
    /* JADX WARN: Code duplicated, block: B:140:0x0309  */
    /* JADX WARN: Code duplicated, block: B:167:0x030c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0152  */
    /* JADX WARN: Code duplicated, block: B:74:0x015a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0160  */
    /* JADX WARN: Code duplicated, block: B:77:0x0174  */
    /* JADX WARN: Code duplicated, block: B:80:0x017b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0185  */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    /* JADX WARN: Code duplicated, block: B:84:0x018c  */
    /* JADX WARN: Code duplicated, block: B:86:0x018f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0203  */
    /* JADX WARN: Code duplicated, block: B:97:0x0208  */
    /* JADX WARN: Code duplicated, block: B:99:0x020b  */
    /* JADX WARN: Instruction removed from duplicated block: B:120:0x0269, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:122:0x028a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0160, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01e8, please report this as an issue */
    public final void s(e31 e31Var, int i) throws IOException {
        HashMap[] mapArr;
        long j;
        long j2;
        boolean z2;
        int i2;
        long j3;
        Integer num;
        long j4;
        String str;
        int i3;
        int unsignedShort;
        long j5;
        int i4;
        Integer numValueOf = Integer.valueOf(e31Var.p);
        HashSet hashSet = this.e;
        hashSet.add(numValueOf);
        short s2 = e31Var.readShort();
        boolean z3 = l;
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s2));
        }
        if (s2 <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            mapArr = this.d;
            if (s3 >= s2) {
                break;
            }
            int unsignedShort2 = e31Var.readUnsignedShort();
            int unsignedShort3 = e31Var.readUnsignedShort();
            int i5 = e31Var.readInt();
            long j6 = ((long) e31Var.p) + 4;
            c31 c31Var = (c31) H[i].get(Integer.valueOf(unsignedShort2));
            if (z3) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), c31Var != null ? c31Var.b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i5)));
            }
            if (c31Var != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = C;
                    if (unsignedShort3 < iArr.length) {
                        int i6 = c31Var.c;
                        if (i6 == 7 || unsignedShort3 == 7 || i6 == unsignedShort3 || (i2 = c31Var.d) == unsignedShort3 || (((i6 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i6 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i6 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i6;
                            }
                            j = j6;
                            j2 = ((long) i5) * ((long) iArr[unsignedShort3]);
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i5);
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + B[unsignedShort3] + ") is unexpected for tag: " + c31Var.b);
                        }
                    }
                    if (z2) {
                        j3 = j;
                        if (j2 > 4) {
                            i4 = e31Var.readInt();
                            if (z3 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i4);
                            }
                            if (this.c == 7) {
                                if ("MakerNote".equals(c31Var.b)) {
                                    this.i = i4;
                                } else if (i != 6 && "ThumbnailImage".equals(c31Var.b)) {
                                    this.j = i4;
                                    this.k = i5;
                                    b31 b31VarC = b31.c(6, this.f);
                                    b31 b31VarA = b31.a(this.j, this.f);
                                    b31 b31VarA2 = b31.a(this.k, this.f);
                                    mapArr[4].put("Compression", b31VarC);
                                    mapArr[4].put("JPEGInterchangeFormat", b31VarA);
                                    mapArr[4].put("JPEGInterchangeFormatLength", b31VarA2);
                                }
                            }
                            e31Var.f(i4);
                        } else {
                            j3 = j3;
                            unsignedShort2 = unsignedShort2;
                            unsignedShort3 = unsignedShort3;
                        }
                        num = (Integer) K.get(Integer.valueOf(unsignedShort2));
                        if (z3 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                        }
                        if (num != null) {
                            i3 = unsignedShort3;
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    j5 = ((long) e31Var.readInt()) & 4294967295L;
                                } else if (i3 == 8) {
                                    unsignedShort = e31Var.readShort();
                                } else if (i3 != 9 || i3 == 13) {
                                    unsignedShort = e31Var.readInt();
                                } else {
                                    j5 = -1;
                                }
                                if (z3 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c31Var.b));
                                }
                                if (j5 > 0) {
                                    if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                        e31Var.f(j5);
                                        s(e31Var, num.intValue());
                                    } else if (z3 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                    }
                                } else if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                                }
                                e31Var.f(j3);
                            } else {
                                unsignedShort = e31Var.readUnsignedShort();
                            }
                            j5 = unsignedShort;
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c31Var.b));
                            }
                            if (j5 > 0) {
                                if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                    e31Var.f(j5);
                                    s(e31Var, num.intValue());
                                } else if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                }
                            } else if (z3 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                            }
                            e31Var.f(j3);
                        } else {
                            j4 = j3;
                            int i7 = e31Var.p + this.h;
                            byte[] bArr = new byte[(int) j2];
                            e31Var.readFully(bArr);
                            b31 b31Var = new b31(i7, bArr, unsignedShort3, i5);
                            HashMap map = mapArr[i];
                            str = c31Var.b;
                            map.put(str, b31Var);
                            if ("DNGVersion".equals(str)) {
                                this.c = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && b31Var.f(this.f).contains("PENTAX")) || ("Compression".equals(str) && b31Var.e(this.f) == 65535)) {
                                this.c = 8;
                            }
                            if (e31Var.p != j4) {
                                e31Var.f(j4);
                            }
                        }
                    } else {
                        e31Var.f(j);
                    }
                    s3 = (short) (s3 + 1);
                    s2 = s2;
                    z3 = z3;
                }
                j = j6;
                if (z3 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j2 = 0;
                z2 = false;
                if (z2) {
                    e31Var.f(j);
                } else {
                    j3 = j;
                    if (j2 > 4) {
                        i4 = e31Var.readInt();
                        if (z3 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i4);
                        }
                        if (this.c == 7) {
                            if ("MakerNote".equals(c31Var.b)) {
                                this.i = i4;
                            } else if (i != 6) {
                            }
                        }
                        e31Var.f(i4);
                    } else {
                        j3 = j3;
                        unsignedShort2 = unsignedShort2;
                        unsignedShort3 = unsignedShort3;
                    }
                    num = (Integer) K.get(Integer.valueOf(unsignedShort2));
                    if (z3 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                    }
                    if (num != null) {
                        i3 = unsignedShort3;
                        if (i3 != 3) {
                            if (i3 == 4) {
                                j5 = ((long) e31Var.readInt()) & 4294967295L;
                            } else if (i3 == 8) {
                                if (i3 != 9) {
                                }
                                unsignedShort = e31Var.readInt();
                            } else {
                                unsignedShort = e31Var.readShort();
                            }
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c31Var.b));
                            }
                            if (j5 > 0) {
                                if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                    e31Var.f(j5);
                                    s(e31Var, num.intValue());
                                } else if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                }
                            } else if (z3 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                            }
                            e31Var.f(j3);
                        } else {
                            unsignedShort = e31Var.readUnsignedShort();
                        }
                        j5 = unsignedShort;
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c31Var.b));
                        }
                        if (j5 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                e31Var.f(j5);
                                s(e31Var, num.intValue());
                            } else if (z3 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                            }
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                        }
                        e31Var.f(j3);
                    } else {
                        j4 = j3;
                        int i8 = e31Var.p + this.h;
                        byte[] bArr2 = new byte[(int) j2];
                        e31Var.readFully(bArr2);
                        b31 b31Var2 = new b31(i8, bArr2, unsignedShort3, i5);
                        HashMap map2 = mapArr[i];
                        str = c31Var.b;
                        map2.put(str, b31Var2);
                        if ("DNGVersion".equals(str)) {
                            this.c = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.c = 8;
                        if (e31Var.p != j4) {
                            e31Var.f(j4);
                        }
                    }
                }
                s3 = (short) (s3 + 1);
                s2 = s2;
                z3 = z3;
            } else if (z3) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j = j6;
            j2 = 0;
            z2 = false;
            if (z2) {
                e31Var.f(j);
            } else {
                j3 = j;
                if (j2 > 4) {
                    i4 = e31Var.readInt();
                    if (z3 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i4);
                    }
                    if (this.c == 7) {
                        if ("MakerNote".equals(c31Var.b)) {
                            this.i = i4;
                        } else if (i != 6) {
                        }
                    }
                    e31Var.f(i4);
                } else {
                    j3 = j3;
                    unsignedShort2 = unsignedShort2;
                    unsignedShort3 = unsignedShort3;
                }
                num = (Integer) K.get(Integer.valueOf(unsignedShort2));
                if (z3 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                }
                if (num != null) {
                    i3 = unsignedShort3;
                    if (i3 != 3) {
                        if (i3 == 4) {
                            j5 = ((long) e31Var.readInt()) & 4294967295L;
                        } else if (i3 == 8) {
                            if (i3 != 9) {
                            }
                            unsignedShort = e31Var.readInt();
                        } else {
                            unsignedShort = e31Var.readShort();
                        }
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c31Var.b));
                        }
                        if (j5 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                e31Var.f(j5);
                                s(e31Var, num.intValue());
                            } else if (z3 != 0) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                            }
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                        }
                        e31Var.f(j3);
                    } else {
                        unsignedShort = e31Var.readUnsignedShort();
                    }
                    j5 = unsignedShort;
                    if (z3 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c31Var.b));
                    }
                    if (j5 > 0) {
                        if (!hashSet.contains(Integer.valueOf((int) j5))) {
                            e31Var.f(j5);
                            s(e31Var, num.intValue());
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                        }
                    } else if (z3 != 0) {
                        Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                    }
                    e31Var.f(j3);
                } else {
                    j4 = j3;
                    int i9 = e31Var.p + this.h;
                    byte[] bArr3 = new byte[(int) j2];
                    e31Var.readFully(bArr3);
                    b31 b31Var3 = new b31(i9, bArr3, unsignedShort3, i5);
                    HashMap map3 = mapArr[i];
                    str = c31Var.b;
                    map3.put(str, b31Var3);
                    if ("DNGVersion".equals(str)) {
                        this.c = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.c = 8;
                    if (e31Var.p != j4) {
                        e31Var.f(j4);
                    }
                }
            }
            s3 = (short) (s3 + 1);
            s2 = s2;
            z3 = z3;
        }
        boolean z4 = z3;
        int i10 = e31Var.readInt();
        if (z4) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i10)));
        }
        long j7 = i10;
        if (j7 <= 0) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        if (hashSet.contains(Integer.valueOf(i10))) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i10);
                return;
            }
            return;
        }
        e31Var.f(j7);
        if (mapArr[4].isEmpty()) {
            s(e31Var, 4);
        } else if (mapArr[5].isEmpty()) {
            s(e31Var, 5);
        }
    }

    public final void t(int i, String str, String str2) {
        HashMap[] mapArr = this.d;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    public final void u(a31 a31Var) throws IOException {
        b31 b31Var;
        int iE;
        HashMap map = this.d[4];
        b31 b31Var2 = (b31) map.get("Compression");
        if (b31Var2 == null) {
            m(a31Var, map);
            return;
        }
        int iE2 = b31Var2.e(this.f);
        if (iE2 != 1) {
            if (iE2 == 6) {
                m(a31Var, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        b31 b31Var3 = (b31) map.get("BitsPerSample");
        if (b31Var3 != null) {
            int[] iArr = (int[]) b31Var3.g(this.f);
            int[] iArr2 = m;
            if (Arrays.equals(iArr2, iArr) || (this.c == 3 && (b31Var = (b31) map.get("PhotometricInterpretation")) != null && (((iE = b31Var.e(this.f)) == 1 && Arrays.equals(iArr, n)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                b31 b31Var4 = (b31) map.get("StripOffsets");
                b31 b31Var5 = (b31) map.get("StripByteCounts");
                if (b31Var4 == null || b31Var5 == null) {
                    return;
                }
                long[] jArrL = gi1.l(b31Var4.g(this.f));
                long[] jArrL2 = gi1.l(b31Var5.g(this.f));
                if (jArrL == null || jArrL.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrL2 == null || jArrL2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrL.length != jArrL2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrL2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.g = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrL.length; i3++) {
                    int i4 = (int) jArrL[i3];
                    int i5 = (int) jArrL2[i3];
                    if (i3 < jArrL.length - 1 && i4 + i5 != jArrL[i3 + 1]) {
                        this.g = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i6;
                    if (a31Var.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    if (a31Var.read(bArr2) != i5) {
                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                        return;
                    }
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                }
                if (this.g) {
                    long j4 = jArrL[0];
                    return;
                }
                return;
            }
        }
        if (l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i, int i2) {
        HashMap[] mapArr = this.d;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z2 = l;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        b31 b31Var = (b31) mapArr[i].get("ImageLength");
        b31 b31Var2 = (b31) mapArr[i].get("ImageWidth");
        b31 b31Var3 = (b31) mapArr[i2].get("ImageLength");
        b31 b31Var4 = (b31) mapArr[i2].get("ImageWidth");
        if (b31Var == null || b31Var2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (b31Var3 == null || b31Var4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iE = b31Var.e(this.f);
        int iE2 = b31Var2.e(this.f);
        int iE3 = b31Var3.e(this.f);
        int iE4 = b31Var4.e(this.f);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void w(e31 e31Var, int i) throws IOException {
        b31 b31VarC;
        b31 b31VarC2;
        HashMap[] mapArr = this.d;
        b31 b31Var = (b31) mapArr[i].get("DefaultCropSize");
        b31 b31Var2 = (b31) mapArr[i].get("SensorTopBorder");
        b31 b31Var3 = (b31) mapArr[i].get("SensorLeftBorder");
        b31 b31Var4 = (b31) mapArr[i].get("SensorBottomBorder");
        b31 b31Var5 = (b31) mapArr[i].get("SensorRightBorder");
        if (b31Var != null) {
            int i2 = b31Var.a;
            ByteOrder byteOrder = this.f;
            if (i2 == 5) {
                d31[] d31VarArr = (d31[]) b31Var.g(byteOrder);
                if (d31VarArr == null || d31VarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(d31VarArr));
                    return;
                }
                b31VarC = b31.b(d31VarArr[0], this.f);
                b31VarC2 = b31.b(d31VarArr[1], this.f);
            } else {
                int[] iArr = (int[]) b31Var.g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                b31VarC = b31.c(iArr[0], this.f);
                b31VarC2 = b31.c(iArr[1], this.f);
            }
            mapArr[i].put("ImageWidth", b31VarC);
            mapArr[i].put("ImageLength", b31VarC2);
            return;
        }
        if (b31Var2 != null && b31Var3 != null && b31Var4 != null && b31Var5 != null) {
            int iE = b31Var2.e(this.f);
            int iE2 = b31Var4.e(this.f);
            int iE3 = b31Var5.e(this.f);
            int iE4 = b31Var3.e(this.f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            b31 b31VarC3 = b31.c(iE2 - iE, this.f);
            b31 b31VarC4 = b31.c(iE3 - iE4, this.f);
            mapArr[i].put("ImageLength", b31VarC3);
            mapArr[i].put("ImageWidth", b31VarC4);
            return;
        }
        b31 b31Var6 = (b31) mapArr[i].get("ImageLength");
        b31 b31Var7 = (b31) mapArr[i].get("ImageWidth");
        if (b31Var6 == null || b31Var7 == null) {
            b31 b31Var8 = (b31) mapArr[i].get("JPEGInterchangeFormat");
            b31 b31Var9 = (b31) mapArr[i].get("JPEGInterchangeFormatLength");
            if (b31Var8 == null || b31Var9 == null) {
                return;
            }
            int iE5 = b31Var8.e(this.f);
            int iE6 = b31Var8.e(this.f);
            e31Var.f(iE5);
            byte[] bArr = new byte[iE6];
            e31Var.read(bArr);
            e(new a31(bArr), iE5, i);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] mapArr = this.d;
        b31 b31Var = (b31) mapArr[1].get("PixelXDimension");
        b31 b31Var2 = (b31) mapArr[1].get("PixelYDimension");
        if (b31Var != null && b31Var2 != null) {
            mapArr[0].put("ImageWidth", b31Var);
            mapArr[0].put("ImageLength", b31Var2);
        }
        if (mapArr[4].isEmpty() && n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
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
