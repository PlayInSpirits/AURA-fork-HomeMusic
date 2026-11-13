package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager$AssetInputStream
 *  android.media.MediaMetadataRetriever
 *  android.os.Build$VERSION
 *  android.util.Log
 */
import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
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
    public static final boolean l;
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
        Integer n16 = 3;
        l = Log.isLoggable((String)"ExifInterface", (int)3);
        Integer n17 = 1;
        Integer n18 = 8;
        Arrays.asList(n17, 6, n16, n18);
        Integer n19 = 2;
        Integer n26 = 7;
        Integer n27 = 5;
        Arrays.asList(n19, n26, 4, n27);
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
        c31 c312 = new c31("NewSubfileType", 254, 4);
        c31 c313 = new c31("SubfileType", 255, 4);
        c31 c314 = new c31("ImageWidth", 256, 3, 4);
        c31 c315 = new c31("ImageLength", 257, 3, 4);
        c31 c316 = new c31("BitsPerSample", 258, 3);
        c31 c317 = new c31("Compression", 259, 3);
        c31 c318 = new c31("PhotometricInterpretation", 262, 3);
        c31 c319 = new c31("ImageDescription", 270, 2);
        c31[] c31Array = new c31("Make", 271, 2);
        c31 c3110 = new c31("Model", 272, 2);
        c31 c3111 = new c31("StripOffsets", 273, 3, 4);
        c31 c3112 = new c31("Orientation", 274, 3);
        c31 c3113 = new c31("SamplesPerPixel", 277, 3);
        c31 c3114 = new c31("RowsPerStrip", 278, 3, 4);
        c31 c3115 = new c31("StripByteCounts", 279, 3, 4);
        c31 c3116 = new c31("XResolution", 282, 5);
        c31 c3117 = new c31("YResolution", 283, 5);
        c31 c3118 = new c31("PlanarConfiguration", 284, 3);
        c31 c3119 = new c31("ResolutionUnit", 296, 3);
        c31 c3120 = new c31("TransferFunction", 301, 3);
        c31 c3121 = new c31("Software", 305, 2);
        c31 c3122 = new c31("DateTime", 306, 2);
        c31 c3123 = new c31("Artist", 315, 2);
        c31 c3124 = new c31("WhitePoint", 318, 5);
        c31 c3125 = new c31("PrimaryChromaticities", 319, 5);
        c31[] c31Array2 = new c31("SubIFDPointer", 330, 4);
        Object object = new c31("JPEGInterchangeFormat", 513, 4);
        c31 c3126 = new c31("JPEGInterchangeFormatLength", 514, 4);
        c31 c3127 = new c31("YCbCrCoefficients", 529, 5);
        c31 c3128 = new c31("YCbCrSubSampling", 530, 3);
        c31 c3129 = new c31("YCbCrPositioning", 531, 3);
        c31 c3130 = new c31("ReferenceBlackWhite", 532, 5);
        c31 c3131 = new c31("Copyright", 33432, 2);
        c31 c3132 = new c31("ExifIFDPointer", 34665, 4);
        c31 c3133 = new c31("GPSInfoIFDPointer", 34853, 4);
        c31[] c31Array3 = new c31("SensorTopBorder", 4, 4);
        c31 c3134 = new c31("SensorLeftBorder", 5, 4);
        c31 c3135 = new c31("SensorBottomBorder", 6, 4);
        c31 c3136 = new c31("SensorRightBorder", 7, 4);
        c31 c3137 = new c31("ISO", 23, 3);
        c31 c3138 = new c31("JpgFromRaw", 46, 7);
        c31 c3139 = new c31("Xmp", 700, 1);
        Object object2 = new c31[]{c312, c313, c314, c315, c316, c317, c318, c319, c31Array, c3110, c3111, c3112, c3113, c3114, c3115, c3116, c3117, c3118, c3119, c3120, c3121, c3122, c3123, c3124, c3125, c31Array2, object, c3126, c3127, c3128, c3129, c3130, c3131, c3132, c3133, c31Array3, c3134, c3135, c3136, c3137, c3138, c3139};
        c31 c3140 = new c31("ExposureTime", 33434, 5);
        c31 c3141 = new c31("FNumber", 33437, 5);
        c31 c3142 = new c31("ExposureProgram", 34850, 3);
        c31 c3143 = new c31("SpectralSensitivity", 34852, 2);
        c31 c3144 = new c31("PhotographicSensitivity", 34855, 3);
        c31 c3145 = new c31("OECF", 34856, 7);
        c31 c3146 = new c31("SensitivityType", 34864, 3);
        c31 c3147 = new c31("StandardOutputSensitivity", 34865, 4);
        c31 c3148 = new c31("RecommendedExposureIndex", 34866, 4);
        c31 c3149 = new c31("ISOSpeed", 34867, 4);
        c31 c3150 = new c31("ISOSpeedLatitudeyyy", 34868, 4);
        c31 c3151 = new c31("ISOSpeedLatitudezzz", 34869, 4);
        c31 c3152 = new c31("ExifVersion", 36864, 2);
        c31 c3153 = new c31("DateTimeOriginal", 36867, 2);
        c31 c3154 = new c31("DateTimeDigitized", 36868, 2);
        c31 c3155 = new c31("OffsetTime", 36880, 2);
        c31 c3156 = new c31("OffsetTimeOriginal", 36881, 2);
        c31 c3157 = new c31("OffsetTimeDigitized", 36882, 2);
        c31 c3158 = new c31("ComponentsConfiguration", 37121, 7);
        c31 c3159 = new c31("CompressedBitsPerPixel", 37122, 5);
        c31 c3160 = new c31("ShutterSpeedValue", 37377, 10);
        c31 c3161 = new c31("ApertureValue", 37378, 5);
        c31 c3162 = new c31("BrightnessValue", 37379, 10);
        c31 c3163 = new c31("ExposureBiasValue", 37380, 10);
        c31 c3164 = new c31("MaxApertureValue", 37381, 5);
        c31 c3165 = new c31("SubjectDistance", 37382, 5);
        c31 c3166 = new c31("MeteringMode", 37383, 3);
        c31 c3167 = new c31("LightSource", 37384, 3);
        c31 c3168 = new c31("Flash", 37385, 3);
        c31 c3169 = new c31("FocalLength", 37386, 5);
        c31 c3170 = new c31("SubjectArea", 37396, 3);
        c31 c3171 = new c31("MakerNote", 37500, 7);
        c31 c3172 = new c31("UserComment", 37510, 7);
        c31 c3173 = new c31("SubSecTime", 37520, 2);
        c31 c3174 = new c31("SubSecTimeOriginal", 37521, 2);
        c31 c3175 = new c31("SubSecTimeDigitized", 37522, 2);
        c31 c3176 = new c31("FlashpixVersion", 40960, 7);
        c31 c3177 = new c31("ColorSpace", 40961, 3);
        c31 c3178 = new c31("PixelXDimension", 40962, 3, 4);
        c31 c3179 = new c31("PixelYDimension", 40963, 3, 4);
        c31 c3180 = new c31("RelatedSoundFile", 40964, 2);
        c31 c3181 = new c31("InteroperabilityIFDPointer", 40965, 4);
        c31 c3182 = new c31("FlashEnergy", 41483, 5);
        c31 c3183 = new c31("SpatialFrequencyResponse", 41484, 7);
        c31 c3184 = new c31("FocalPlaneXResolution", 41486, 5);
        c31 c3185 = new c31("FocalPlaneYResolution", 41487, 5);
        c31 c3186 = new c31("FocalPlaneResolutionUnit", 41488, 3);
        c31 c3187 = new c31("SubjectLocation", 41492, 3);
        c31 c3188 = new c31("ExposureIndex", 41493, 5);
        c31 c3189 = new c31("SensingMethod", 41495, 3);
        c31 c3190 = new c31("FileSource", 41728, 7);
        c31 c3191 = new c31("SceneType", 41729, 7);
        c31 c3192 = new c31("CFAPattern", 41730, 7);
        c31 c3193 = new c31("CustomRendered", 41985, 3);
        c31 c3194 = new c31("ExposureMode", 41986, 3);
        c31 c3195 = new c31("WhiteBalance", 41987, 3);
        c31 c3196 = new c31("DigitalZoomRatio", 41988, 5);
        c31 c3197 = new c31("FocalLengthIn35mmFilm", 41989, 3);
        c31 c3198 = new c31("SceneCaptureType", 41990, 3);
        c31 c3199 = new c31("GainControl", 41991, 3);
        c31 c31100 = new c31("Contrast", 41992, 3);
        c31 c31101 = new c31("Saturation", 41993, 3);
        c31 c31102 = new c31("Sharpness", 41994, 3);
        c31 c31103 = new c31("DeviceSettingDescription", 41995, 7);
        c31 c31104 = new c31("SubjectDistanceRange", 41996, 3);
        c31 c31105 = new c31("ImageUniqueID", 42016, 2);
        c31 c31106 = new c31("CameraOwnerName", 42032, 2);
        c31 c31107 = new c31("BodySerialNumber", 42033, 2);
        c31 c31108 = new c31("LensSpecification", 42034, 5);
        c31 c31109 = new c31("LensMake", 42035, 2);
        c31 c31110 = new c31("LensModel", 42036, 2);
        c31 c31111 = new c31("Gamma", 42240, 5);
        c31 c31112 = new c31("DNGVersion", 50706, 1);
        c31[] c31Array4 = new c31("DefaultCropSize", 50720, 3, 4);
        c31 c31113 = new c31("GPSVersionID", 0, 1);
        c31 c31114 = new c31("GPSLatitudeRef", 1, 2);
        c31 c31115 = new c31("GPSLatitude", 2, 5, 10);
        c31 c31116 = new c31("GPSLongitudeRef", 3, 2);
        c31 c31117 = new c31("GPSLongitude", 4, 5, 10);
        c31[] c31Array5 = new c31("GPSAltitudeRef", 5, 1);
        c31 c31118 = new c31("GPSAltitude", 6, 5);
        c31 c31119 = new c31("GPSTimeStamp", 7, 5);
        c31 c31120 = new c31("GPSSatellites", 8, 2);
        c31 c31121 = new c31("GPSStatus", 9, 2);
        c31 c31122 = new c31("GPSMeasureMode", 10, 2);
        c31 c31123 = new c31("GPSDOP", 11, 5);
        c31 c31124 = new c31("GPSSpeedRef", 12, 2);
        c31 c31125 = new c31("GPSSpeed", 13, 5);
        c31 c31126 = new c31("GPSTrackRef", 14, 2);
        c31 c31127 = new c31("GPSTrack", 15, 5);
        c31 c31128 = new c31("GPSImgDirectionRef", 16, 2);
        c31 c31129 = new c31("GPSImgDirection", 17, 5);
        c31 c31130 = new c31("GPSMapDatum", 18, 2);
        c31 c31131 = new c31("GPSDestLatitudeRef", 19, 2);
        c31 c31132 = new c31("GPSDestLatitude", 20, 5);
        c31 c31133 = new c31("GPSDestLongitudeRef", 21, 2);
        c31 c31134 = new c31("GPSDestLongitude", 22, 5);
        c31 c31135 = new c31("GPSDestBearingRef", 23, 2);
        c31 c31136 = new c31("GPSDestBearing", 24, 5);
        c31 c31137 = new c31("GPSDestDistanceRef", 25, 2);
        c31 c31138 = new c31("GPSDestDistance", 26, 5);
        c31 c31139 = new c31("GPSProcessingMethod", 27, 7);
        c31 c31140 = new c31("GPSAreaInformation", 28, 7);
        c31 c31141 = new c31("GPSDateStamp", 29, 2);
        c31 c31142 = new c31("GPSDifferential", 30, 3);
        c31 c31143 = new c31("GPSHPositioningError", 31, 5);
        c31[] c31Array6 = new c31("InteroperabilityIndex", 1, 2);
        c3128 = new c31("NewSubfileType", 254, 4);
        c3135 = new c31("SubfileType", 255, 4);
        object = new c31("ThumbnailImageWidth", 256, 3, 4);
        c3112 = new c31("ThumbnailImageLength", 257, 3, 4);
        c3118 = new c31("BitsPerSample", 258, 3);
        c318 = new c31("Compression", 259, 3);
        c3123 = new c31("PhotometricInterpretation", 262, 3);
        c3119 = new c31("ImageDescription", 270, 2);
        c3115 = new c31("Make", 271, 2);
        c3122 = new c31("Model", 272, 2);
        c3131 = new c31("StripOffsets", 273, 3, 4);
        c3120 = new c31("ThumbnailOrientation", 274, 3);
        c3125 = new c31("SamplesPerPixel", 277, 3);
        c3137 = new c31("RowsPerStrip", 278, 3, 4);
        c312 = new c31("StripByteCounts", 279, 3, 4);
        c3139 = new c31("XResolution", 282, 5);
        c314 = new c31("YResolution", 283, 5);
        c313 = new c31("PlanarConfiguration", 284, 3);
        c3132 = new c31("ResolutionUnit", 296, 3);
        c3136 = new c31("TransferFunction", 301, 3);
        c3133 = new c31("Software", 305, 2);
        c3110 = new c31("DateTime", 306, 2);
        c3138 = new c31("Artist", 315, 2);
        c3114 = new c31("WhitePoint", 318, 5);
        c315 = new c31("PrimaryChromaticities", 319, 5);
        c3117 = new c31("SubIFDPointer", 330, 4);
        c3124 = new c31("JPEGInterchangeFormat", 513, 4);
        c3134 = new c31("JPEGInterchangeFormatLength", 514, 4);
        c317 = new c31("YCbCrCoefficients", 529, 5);
        c3111 = new c31("YCbCrSubSampling", 530, 3);
        c3113 = new c31("YCbCrPositioning", 531, 3);
        c319 = new c31("ReferenceBlackWhite", 532, 5);
        c3126 = new c31("Copyright", 33432, 2);
        c3116 = new c31("ExifIFDPointer", 34665, 4);
        c3130 = new c31("GPSInfoIFDPointer", 34853, 4);
        c3129 = new c31("DNGVersion", 50706, 1);
        c3121 = new c31("DefaultCropSize", 50720, 3, 4);
        E = new c31("StripOffsets", 273, 3);
        c31 c31144 = new c31("ThumbnailImage", 256, 7);
        c31Array3 = new c31("CameraSettingsIFDPointer", 8224, 4);
        c31 c31145 = new c31("ImageProcessingIFDPointer", 8256, 4);
        c3127 = new c31("PreviewImageStart", 257, 4);
        c316 = new c31("PreviewImageLength", 258, 4);
        c31Array = new c31("AspectFrame", 4371, 3);
        c31Array2 = new c31("ColorSpace", 55, 3);
        c31Array4 = new c31[]{c3140, c3141, c3142, c3143, c3144, c3145, c3146, c3147, c3148, c3149, c3150, c3151, c3152, c3153, c3154, c3155, c3156, c3157, c3158, c3159, c3160, c3161, c3162, c3163, c3164, c3165, c3166, c3167, c3168, c3169, c3170, c3171, c3172, c3173, c3174, c3175, c3176, c3177, c3178, c3179, c3180, c3181, c3182, c3183, c3184, c3185, c3186, c3187, c3188, c3189, c3190, c3191, c3192, c3193, c3194, c3195, c3196, c3197, c3198, c3199, c31100, c31101, c31102, c31103, c31104, c31105, c31106, c31107, c31108, c31109, c31110, c31111, c31112, c31Array4};
        c31Array5 = new c31[]{c31113, c31114, c31115, c31116, c31117, c31Array5, c31118, c31119, c31120, c31121, c31122, c31123, c31124, c31125, c31126, c31127, c31128, c31129, c31130, c31131, c31132, c31133, c31134, c31135, c31136, c31137, c31138, c31139, c31140, c31141, c31142, c31143};
        c31Array6 = new c31[]{c31Array6};
        c31Array3 = new c31[]{c31144, c31Array3, c31145};
        c31Array = new c31[]{c31Array};
        c31Array2 = new c31[]{c31Array2};
        F = new c31[][]{object2, c31Array4, c31Array5, c31Array6, {c3128, c3135, object, c3112, c3118, c318, c3123, c3119, c3115, c3122, c3131, c3120, c3125, c3137, c312, c3139, c314, c313, c3132, c3136, c3133, c3110, c3138, c3114, c315, c3117, c3124, c3134, c317, c3111, c3113, c319, c3126, c3116, c3130, c3129, c3121}, object2, c31Array3, {c3127, c316}, c31Array, c31Array2};
        G = new c31[]{new c31("SubIFDPointer", 330, 4), new c31("ExifIFDPointer", 34665, 4), new c31("GPSInfoIFDPointer", 34853, 4), new c31("InteroperabilityIFDPointer", 40965, 4), new c31("CameraSettingsIFDPointer", 8224, 1), new c31("ImageProcessingIFDPointer", 8256, 1)};
        H = new HashMap[10];
        I = new HashMap[10];
        J = new HashSet<String>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        K = new HashMap();
        object2 = Charset.forName("US-ASCII");
        L = object2;
        M = "Exif\u0000\u0000".getBytes((Charset)object2);
        N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes((Charset)object2);
        object2 = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", (Locale)object2).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", (Locale)object2).setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i16 = 0; i16 < ((c31[])(object2 = F)).length; ++i16) {
            f31.H[i16] = new HashMap();
            f31.I[i16] = new HashMap();
            object2 = object2[i16];
            int n28 = ((Object)object2).length;
            for (int i17 = 0; i17 < n28; ++i17) {
                object = object2[i17];
                H[i16].put(object.a, object);
                I[i16].put(object.b, object);
            }
        }
        object2 = K;
        object = G;
        ((HashMap)object2).put(object[0].a, n27);
        ((HashMap)object2).put(object[1].a, n17);
        ((HashMap)object2).put(object[2].a, n19);
        ((HashMap)object2).put(object[3].a, n16);
        ((HashMap)object2).put(object[4].a, n26);
        ((HashMap)object2).put(object[5].a, n18);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    }

    /*
     * Exception decompiling
     */
    public f31(InputStream var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [6, 5, 4 : 183->209)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static ByteOrder q(a31 a312) {
        short s16 = a312.readShort();
        boolean bl5 = l;
        if (s16 != 18761) {
            if (s16 == 19789) {
                if (bl5) {
                    Log.d((String)"ExifInterface", (String)"readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            mj0.m(Integer.toHexString(s16), "Invalid byte order: ");
            return null;
        }
        if (bl5) {
            Log.d((String)"ExifInterface", (String)"readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void a() {
        Object object = this.b("DateTimeOriginal");
        HashMap[] hashMapArray = this.d;
        if (object != null && this.b("DateTime") == null) {
            HashMap hashMap = hashMapArray[0];
            object = ((String)object).concat("\u0000").getBytes(L);
            hashMap.put("DateTime", new b31((byte[])object, 2, ((Object)object).length));
        }
        if (this.b("ImageWidth") == null) {
            hashMapArray[0].put("ImageWidth", b31.a(0L, this.f));
        }
        if (this.b("ImageLength") == null) {
            hashMapArray[0].put("ImageLength", b31.a(0L, this.f));
        }
        if (this.b("Orientation") == null) {
            hashMapArray[0].put("Orientation", b31.a(0L, this.f));
        }
        if (this.b("LightSource") == null) {
            hashMapArray[1].put("LightSource", b31.a(0L, this.f));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String b(String object) {
        Object object2 = this.c((String)object);
        if (object2 == null) return null;
        int n16 = ((b31)object2).a;
        if (!J.contains(object)) {
            return ((b31)object2).f(this.f);
        }
        if (((String)object).equals("GPSTimeStamp")) {
            if (n16 != 5 && n16 != 10) {
                object = new StringBuilder("GPS Timestamp format is not rational. format=");
                ((StringBuilder)object).append(n16);
                Log.w((String)"ExifInterface", (String)((StringBuilder)object).toString());
                return null;
            }
            object = (d31[])((b31)object2).g(this.f);
            if (object != null && ((Object)object).length == 3) {
                object2 = object[0];
                n16 = (int)((float)((d31)object2).a / (float)((d31)object2).b);
                object2 = object[1];
                int n17 = (int)((float)((d31)object2).a / (float)((d31)object2).b);
                object = object[2];
                return String.format("%02d:%02d:%02d", n16, n17, (int)((float)((d31)object).a / (float)((d31)object).b));
            }
            object2 = new StringBuilder("Invalid GPS Timestamp array. array=");
            ((StringBuilder)object2).append(Arrays.toString((Object[])object));
            Log.w((String)"ExifInterface", (String)((StringBuilder)object2).toString());
            return null;
        }
        try {
            return Double.toString(((b31)object2).d(this.f));
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    public final b31 c(String object) {
        String string = object;
        if ("ISOSpeedRatings".equals(object)) {
            if (l) {
                Log.d((String)"ExifInterface", (String)"getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            string = "PhotographicSensitivity";
        }
        for (int i16 = 0; i16 < F.length; ++i16) {
            object = (b31)this.d[i16].get(string);
            if (object == null) continue;
            return object;
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(e31 object) {
        Throwable throwable222222;
        MediaMetadataRetriever mediaMetadataRetriever;
        block21: {
            String string;
            String string2;
            Object object2;
            block20: {
                int n16;
                if (Build.VERSION.SDK_INT < 28) {
                    er1.l("Reading EXIF from HEIF files is supported from SDK 28 and above");
                    return;
                }
                mediaMetadataRetriever = new MediaMetadataRetriever();
                object2 = new z21((e31)object);
                i31.a(mediaMetadataRetriever, object2);
                String string3 = mediaMetadataRetriever.extractMetadata(33);
                Object object3 = mediaMetadataRetriever.extractMetadata(34);
                string2 = mediaMetadataRetriever.extractMetadata(26);
                object2 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(string2)) {
                    object2 = mediaMetadataRetriever.extractMetadata(29);
                    string2 = mediaMetadataRetriever.extractMetadata(30);
                    string = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(object2)) {
                    object2 = mediaMetadataRetriever.extractMetadata(18);
                    string2 = mediaMetadataRetriever.extractMetadata(19);
                    string = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    object2 = null;
                    string2 = null;
                    string = null;
                }
                HashMap[] hashMapArray = this.d;
                if (object2 != null) {
                    hashMapArray[0].put("ImageWidth", b31.c(Integer.parseInt((String)object2), this.f));
                }
                if (string2 != null) {
                    hashMapArray[0].put("ImageLength", b31.c(Integer.parseInt(string2), this.f));
                }
                if (string != null) {
                    n16 = Integer.parseInt(string);
                    n16 = n16 != 90 ? (n16 != 180 ? (n16 != 270 ? 1 : 8) : 3) : 6;
                    hashMapArray[0].put("Orientation", b31.c(n16, this.f));
                }
                if (string3 != null && object3 != null) {
                    n16 = Integer.parseInt(string3);
                    int n17 = Integer.parseInt((String)object3);
                    if (n17 > 6) {
                        ((e31)object).f(n16);
                        object3 = new byte[6];
                        if (((InputStream)object).read((byte[])object3) == 6) {
                            n17 -= 6;
                            if (!Arrays.equals((byte[])object3, M)) {
                                object = new IOException("Invalid identifier");
                                throw object;
                            }
                            object3 = new byte[n17];
                            if (((InputStream)object).read((byte[])object3) != n17) {
                                object = new IOException("Can't read exif");
                                throw object;
                            }
                            this.h = n16 + 6;
                            this.r(0, (byte[])object3);
                            break block20;
                        } else {
                            object = new IOException("Can't read identifier");
                            throw object;
                        }
                    }
                    object = new IOException("Invalid exif length");
                    throw object;
                }
            }
            if (!l) break block21;
            object = new StringBuilder("Heif meta: ");
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append("x");
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(", rotation ");
            ((StringBuilder)object).append(string);
            Log.d((String)"ExifInterface", (String)((StringBuilder)object).toString());
        }
        mediaMetadataRetriever.release();
        return;
        {
            catch (Throwable throwable222222) {
            }
            catch (RuntimeException runtimeException) {}
            {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                throw unsupportedOperationException;
            }
        }
        mediaMetadataRetriever.release();
        throw throwable222222;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void e(a31 var1_1, int var2_2, int var3_3) {
        block23: {
            block24: {
                var9_4 = f31.l;
                if (var9_4) {
                    var10_5 = new StringBuilder("getJpegAttributes starting with: ");
                    var10_5.append(var1_1);
                    Log.d((String)"ExifInterface", (String)var10_5.toString());
                }
                var1_1.o = ByteOrder.BIG_ENDIAN;
                var4_6 = var1_1.readByte();
                if (var4_6 != -1) break block23;
                if (var1_1.readByte() != -40) break block24;
                var4_6 = 2;
                while ((var5_7 = var1_1.readByte()) == -1) {
                    block25: {
                        block26: {
                            block29: {
                                block22: {
                                    block27: {
                                        block30: {
                                            block28: {
                                                var8_10 = var1_1.readByte();
                                                if (var9_4) {
                                                    var10_5 = new StringBuilder("Found JPEG segment indicator: ");
                                                    var10_5.append(Integer.toHexString(var8_10 & 255));
                                                    Log.d((String)"ExifInterface", (String)var10_5.toString());
                                                }
                                                if (var8_10 == -39 || var8_10 == -38) break block25;
                                                var7_9 = var1_1.readUnsignedShort();
                                                var6_8 = var7_9 - 2;
                                                var5_7 = var4_6 + 4;
                                                if (var9_4) {
                                                    var10_5 = new StringBuilder("JPEG segment: ");
                                                    var10_5.append(Integer.toHexString(var8_10 & 255));
                                                    var10_5.append(" (length: ");
                                                    var10_5.append(var7_9);
                                                    var10_5.append(")");
                                                    Log.d((String)"ExifInterface", (String)var10_5.toString());
                                                }
                                                if (var6_8 < 0) break block26;
                                                var11_11 = this.d;
                                                if (var8_10 == -31) break block27;
                                                if (var8_10 == -2) break block28;
                                                block0 : switch (var8_10) {
                                                    default: {
                                                        switch (var8_10) {
                                                            default: {
                                                                switch (var8_10) {
                                                                    default: {
                                                                        switch (var8_10) {
                                                                            default: {
                                                                                var4_6 = var6_8;
                                                                                break block0;
                                                                            }
                                                                            case -51: 
                                                                            case -50: 
                                                                            case -49: 
                                                                        }
                                                                    }
                                                                    case -55: 
                                                                    case -54: 
                                                                    case -53: 
                                                                }
                                                            }
                                                            case -59: 
                                                            case -58: 
                                                            case -57: 
                                                        }
                                                    }
                                                    case -64: 
                                                    case -63: 
                                                    case -62: 
                                                    case -61: {
                                                        var1_1.b(1);
                                                        var12_12 /* !! */  = (byte[])var11_11[var3_3];
                                                        var10_5 = var3_3 != 4 ? "ImageLength" : "ThumbnailImageLength";
                                                        var12_12 /* !! */ .put(var10_5, b31.a(var1_1.readUnsignedShort(), this.f));
                                                        var11_11 = var11_11[var3_3];
                                                        var10_5 = var3_3 != 4 ? "ImageWidth" : "ThumbnailImageWidth";
                                                        var11_11.put(var10_5, b31.a(var1_1.readUnsignedShort(), this.f));
                                                        var4_6 = var7_9 - 7;
                                                        break;
                                                    }
                                                }
                                                break block29;
                                            }
                                            var10_5 = new byte[var6_8];
                                            if (var1_1.read((byte[])var10_5) != var6_8) break block30;
                                            if (this.b("UserComment") == null) {
                                                var11_11 = var11_11[1];
                                                var12_12 /* !! */  = (byte[])f31.L;
                                                var10_5 = new String((byte[])var10_5, (Charset)var12_12 /* !! */ ).concat("\u0000").getBytes((Charset)var12_12 /* !! */ );
                                                var11_11.put("UserComment", new b31((byte[])var10_5, 2, ((Object)var10_5).length));
                                            }
                                            var4_6 = 0;
                                            break block29;
                                        }
                                        mj0.i("Invalid exif");
                                        return;
                                    }
                                    var12_12 /* !! */  = new byte[var6_8];
                                    var1_1.readFully(var12_12 /* !! */ );
                                    var10_5 = f31.M;
                                    if (var10_5 == null || var6_8 < ((Object)var10_5).length) ** GOTO lbl88
                                    for (var4_6 = 0; var4_6 < ((Object)var10_5).length; ++var4_6) {
                                        if (var12_12 /* !! */ [var4_6] == var10_5[var4_6]) continue;
lbl88:
                                        // 2 sources

                                        if ((var10_5 = (Object)f31.N) == null || var6_8 < ((Object)var10_5).length) break block22;
                                        for (var4_6 = 0; var4_6 < ((Object)var10_5).length; ++var4_6) {
                                            if (var12_12 /* !! */ [var4_6] == var10_5[var4_6]) {
                                                continue;
                                            }
                                            break block22;
                                        }
                                        var7_9 = ((Object)var10_5).length;
                                        var10_5 = Arrays.copyOfRange(var12_12 /* !! */ , ((Object)var10_5).length, var6_8);
                                        if (this.b("Xmp") == null) {
                                            var11_11 = var11_11[0];
                                            var4_6 = ((Object)var10_5).length;
                                            var11_11.put("Xmp", new b31(var5_7 + var7_9, (byte[])var10_5, 1, var4_6));
                                            ** GOTO lbl106
                                        }
                                        break block22;
                                    }
                                    var11_11 = Arrays.copyOfRange(var12_12 /* !! */ , ((Object)var10_5).length, var6_8);
                                    this.h = var2_2 + var5_7 + ((Object)var10_5).length;
                                    this.r(var3_3, (byte[])var11_11);
                                    this.u(new a31((byte[])var11_11));
                                }
                                var5_7 += var6_8;
                                var4_6 = 0;
                            }
                            if (var4_6 >= 0) {
                                var1_1.b(var4_6);
                                var4_6 = var5_7 + var4_6;
                                continue;
                            }
                            mj0.i("Invalid length");
                            return;
                        }
                        mj0.i("Invalid length");
                        return;
                    }
                    var1_1.o = this.f;
                    return;
                }
                mj0.m(Integer.toHexString(var5_7 & 255), "Invalid marker:");
                return;
            }
            mj0.m(Integer.toHexString(var4_6 & 255), "Invalid marker: ");
            return;
        }
        mj0.m(Integer.toHexString(var4_6 & 255), "Invalid marker: ");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int f(BufferedInputStream var1_1) {
        block62: {
            block66: {
                block61: {
                    block60: {
                        block65: {
                            block59: {
                                block58: {
                                    block57: {
                                        block51: {
                                            block55: {
                                                block54: {
                                                    block52: {
                                                        block53: {
                                                            block47: {
                                                                var1_1.mark(5000);
                                                                var19_8 = new byte[5000];
                                                                var1_1.read(var19_8);
                                                                var1_1.reset();
                                                                var2_9 = 0;
                                                                while (var2_9 < ((Object)(var1_1 = (Object)f31.o)).length) {
                                                                    if (var19_8[var2_9] == var1_1[var2_9]) {
                                                                        ++var2_9;
                                                                        continue;
                                                                    }
                                                                    break block47;
                                                                }
                                                                return 4;
                                                            }
                                                            var1_1 = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                                                            var2_9 = 0;
                                                            while (var2_9 < ((Object)var1_1).length) {
                                                                block63: {
                                                                    block64: {
                                                                        block48: {
                                                                            block50: {
                                                                                block49: {
                                                                                    if (var19_8[var2_9] == var1_1[var2_9]) break block63;
                                                                                    var16_10 = null;
                                                                                    var17_11 = null;
                                                                                    var14_12 = null;
                                                                                    var18_18 = null;
                                                                                    var6_19 = 1;
                                                                                    var14_12 = var1_1 = new a31(var19_8);
                                                                                    var8_20 = var1_1.readInt();
                                                                                    var14_12 = var1_1;
                                                                                    var15_21 = new byte[4];
                                                                                    var14_12 = var1_1;
                                                                                    var1_1.read(var15_21);
                                                                                    var14_12 = var1_1;
                                                                                    var7_26 = Arrays.equals(var15_21, f31.p);
                                                                                    if (!var7_26) break block48;
                                                                                    if (var8_20 != 1L) break block49;
                                                                                    var14_12 = var1_1;
                                                                                    var12_28 = var1_1.readLong();
                                                                                    var10_27 = 16L;
                                                                                    var8_20 = var12_28;
                                                                                    if (var12_28 >= 16L) break block50;
                                                                                    break block48;
                                                                                }
                                                                                var10_27 = 8L;
                                                                            }
                                                                            var12_28 = var8_20;
                                                                            if (var8_20 > 5000L) {
                                                                                var12_28 = 5000L;
                                                                            }
                                                                            if ((var10_27 = var12_28 - var10_27) >= 8L) break block64;
                                                                        }
                                                                        var1_1.close();
                                                                        break block51;
                                                                    }
                                                                    var14_12 = var1_1;
                                                                    var15_21 = new byte[4];
                                                                    var8_20 = 0L;
                                                                    var2_9 = 0;
                                                                    var3_29 = false;
                                                                    break block52;
                                                                    catch (Throwable var1_3) {
                                                                        break block53;
                                                                    }
                                                                    catch (Exception var15_24) {
                                                                        var1_1 = null;
                                                                        break block54;
                                                                    }
                                                                }
                                                                ++var2_9;
                                                            }
                                                            return 9;
                                                            catch (Throwable var1_2) {
                                                                break block53;
                                                            }
                                                            catch (Exception var15_22) {
                                                                break block54;
                                                            }
                                                        }
                                                        if (var14_12 == null) throw var1_6;
                                                        var14_12.close();
                                                        throw var1_6;
                                                    }
                                                    while (true) lbl-1000:
                                                    // 2 sources

                                                    {
                                                        var14_12 = var1_1;
                                                        var12_28 = var10_27 / 4L;
                                                        if (var8_20 >= var12_28) break block55;
                                                        var14_12 = var1_1;
                                                        var4_30 = var1_1.read(var15_21);
                                                        if (var4_30 != 4) break block55;
                                                        if (var8_20 == 1L) {
                                                            var5_31 = var3_29;
                                                            break block56;
                                                        }
                                                        var14_12 = var1_1;
                                                        if (Arrays.equals(var15_21, f31.q)) {
                                                            var4_30 = 1;
                                                        } else {
                                                            var14_12 = var1_1;
                                                            var7_26 = Arrays.equals(var15_21, f31.r);
                                                            var4_30 = var2_9;
                                                            if (var7_26) {
                                                                var3_29 = true;
                                                                var4_30 = var2_9;
                                                            }
                                                        }
                                                        var2_9 = var4_30;
                                                        var5_31 = var3_29;
                                                        if (var4_30 == 0) break block56;
                                                        var2_9 = var4_30;
                                                        var5_31 = var3_29;
                                                        if (!var3_29) break block56;
                                                        break;
                                                    }
                                                    catch (Exception var15_23) {}
                                                    {
                                                        block56: {
                                                            var1_1.close();
                                                            return 12;
                                                        }
                                                        ++var8_20;
                                                        var3_29 = var5_31;
                                                        ** while (true)
                                                    }
                                                }
                                                var14_12 = var1_1;
                                                {
                                                    if (f31.l) {
                                                        var14_12 = var1_1;
                                                        Log.d((String)"ExifInterface", (String)"Exception parsing HEIF file type box.", (Throwable)var15_21);
                                                    }
                                                    if (var1_1 == null) break block51;
                                                }
                                            }
                                            var1_1.close();
                                        }
                                        var1_1 = new a31(var19_8);
                                        try {
                                            this.f = var14_12 = f31.q((a31)var1_1);
                                            var1_1.o = var14_12;
                                            var2_9 = var1_1.readShort();
                                            if (var2_9 != 20306 && var2_9 != 21330) {
                                                var2_9 = 0;
                                                break block57;
                                            }
                                            var2_9 = 1;
                                        }
                                        catch (Throwable var15_25) {
                                            var14_12 = var1_1;
                                            var1_1 = var15_25;
                                            break block58;
                                        }
                                    }
                                    var1_1.close();
                                    break block65;
                                    catch (Throwable var1_4) {
                                        var14_12 = var18_18;
                                    }
                                    catch (Exception var1_5) {
                                        var1_1 = null;
                                        break block59;
                                    }
                                }
                                if (var14_12 == null) throw var1_1;
                                var14_12.close();
                                throw var1_1;
                                catch (Exception var14_17) {}
                            }
                            if (var1_1 != null) {
                                var1_1.close();
                            }
                            var2_9 = 0;
                        }
                        if (var2_9 != 0) {
                            return 7;
                        }
                        var1_1 = new a31(var19_8);
                        try {
                            this.f = var14_12 = f31.q((a31)var1_1);
                            var1_1.o = var14_12;
                            var2_9 = var1_1.readShort();
                            var2_9 = var2_9 == 85 ? var6_19 : 0;
                        }
                        catch (Throwable var14_13) {
                            break block60;
                        }
                        catch (Exception var14_14) {
                            break block61;
                        }
                        var1_1.close();
                        break block66;
                        catch (Throwable var14_15) {
                            var1_1 = var16_10;
                        }
                    }
                    if (var1_1 == null) throw var14_16;
                    var1_1.close();
                    throw var14_16;
                    catch (Exception var1_7) {
                        var1_1 = var17_11;
                    }
                }
                if (var1_1 != null) {
                    var1_1.close();
                }
                var2_9 = 0;
            }
            if (var2_9 != 0) {
                return 10;
            }
            var2_9 = 0;
            while (var2_9 < ((Object)(var1_1 = (Object)f31.u)).length) {
                if (var19_8[var2_9] != var1_1[var2_9]) {
                    break block62;
                }
                ++var2_9;
            }
            return 13;
        }
        for (var2_9 = 0; var2_9 < ((Object)(var14_12 = (Object)f31.y)).length; ++var2_9) {
            if (var19_8[var2_9] == var14_12[var2_9]) continue;
            return 0;
        }
        var2_9 = 0;
        while (var2_9 < ((Object)(var1_1 = (Object)f31.z)).length) {
            if (var19_8[((Object)var14_12).length + var2_9 + 4] != var1_1[var2_9]) {
                return 0;
            }
            ++var2_9;
        }
        return 14;
    }

    public final void g(e31 object) {
        this.j((e31)object);
        object = this.d;
        Object object2 = (b31)((HashMap)object[1]).get("MakerNote");
        if (object2 != null) {
            e31 e312 = new e31(((b31)object2).d);
            e312.o = this.f;
            object2 = s;
            Object object3 = new byte[((Object)object2).length];
            e312.readFully((byte[])object3);
            e312.f(0L);
            byte[] byArray = t;
            byte[] byArray2 = new byte[byArray.length];
            e312.readFully(byArray2);
            if (Arrays.equals(object3, (byte[])object2)) {
                e312.f(8L);
            } else if (Arrays.equals(byArray2, byArray)) {
                e312.f(12L);
            }
            this.s(e312, 6);
            object2 = (b31)((HashMap)object[7]).get("PreviewImageStart");
            object3 = (b31)((HashMap)object[7]).get("PreviewImageLength");
            if (object2 != null && object3 != null) {
                ((HashMap)object[5]).put("JPEGInterchangeFormat", object2);
                ((HashMap)object[5]).put("JPEGInterchangeFormatLength", object3);
            }
            if ((object2 = (b31)((HashMap)object[8]).get("AspectFrame")) != null) {
                if ((object2 = (Object)((int[])((b31)object2).g(this.f))) != null && ((Object)object2).length == 4) {
                    Object object4;
                    Object object5;
                    Object object6 = object2[2];
                    Object object7 = object2[0];
                    if (object6 > object7 && (object5 = object2[3]) > (object4 = object2[1])) {
                        reference var3_14;
                        reference var2_17;
                        reference var4_10 = object6 - object7 + true;
                        reference var5_8 = object5 - object4 + true;
                        reference var3_12 = var4_10;
                        reference var2_16 = var5_8;
                        if (var4_10 < var5_8) {
                            reference var3_13 = var4_10 + var5_8;
                            var2_17 = var3_13 - var5_8;
                            var3_14 = var3_13 - var2_17;
                        }
                        object3 = b31.c((int)var3_14, this.f);
                        object2 = b31.c((int)var2_17, this.f);
                        ((HashMap)object[0]).put("ImageWidth", object3);
                        ((HashMap)object[0]).put("ImageLength", object2);
                        return;
                    }
                } else {
                    object = new StringBuilder("Invalid aspect frame values. frame=");
                    ((StringBuilder)object).append(Arrays.toString((int[])object2));
                    Log.w((String)"ExifInterface", (String)((StringBuilder)object).toString());
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(a31 object) {
        Object object2;
        if (l) {
            object2 = new StringBuilder("getPngAttributes starting with: ");
            ((StringBuilder)object2).append(object);
            Log.d((String)"ExifInterface", (String)((StringBuilder)object2).toString());
        }
        ((a31)object).o = ByteOrder.BIG_ENDIAN;
        object2 = u;
        ((a31)object).b(((Object)object2).length);
        int n16 = ((Object)object2).length;
        try {
            while (true) {
                int n17 = ((a31)object).readInt();
                object2 = new byte[4];
                if (((InputStream)object).read((byte[])object2) != 4) break;
                if ((n16 += 8) == 16 && !Arrays.equals((byte[])object2, w)) {
                    object = new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    throw object;
                }
                if (Arrays.equals((byte[])object2, x)) {
                    return;
                }
                if (Arrays.equals((byte[])object2, v)) {
                    byte[] byArray = new byte[n17];
                    if (((InputStream)object).read(byArray) != n17) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed to read given length for given PNG chunk type: ");
                        stringBuilder.append(gi1.f((byte[])object2));
                        object = new IOException(stringBuilder.toString());
                        throw object;
                    }
                    n17 = ((a31)object).readInt();
                    object = new CRC32();
                    object.update((byte[])object2);
                    object.update(byArray);
                    if ((int)((CRC32)object).getValue() == n17) {
                        this.h = n16;
                        this.r(0, byArray);
                        this.x();
                        object = new a31(byArray);
                        this.u((a31)object);
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ");
                    stringBuilder.append(n17);
                    stringBuilder.append(", calculated CRC value: ");
                    stringBuilder.append(((CRC32)object).getValue());
                    object2 = new IOException(stringBuilder.toString());
                    throw object2;
                }
                ((a31)object).b(n17 += 4);
                n16 += n17;
            }
            object = new IOException("Encountered invalid length while parsing PNG chunktype");
            throw object;
        }
        catch (EOFException eOFException) {
            mj0.i("Encountered corrupt PNG file.");
            return;
        }
    }

    public final void i(a31 object) {
        Object object2;
        boolean bl5 = l;
        if (bl5) {
            object2 = new StringBuilder("getRafAttributes starting with: ");
            ((StringBuilder)object2).append(object);
            Log.d((String)"ExifInterface", (String)((StringBuilder)object2).toString());
        }
        ((a31)object).b(84);
        byte[] byArray = new byte[4];
        Object[] objectArray = new byte[4];
        object2 = new byte[4];
        ((InputStream)object).read(byArray);
        ((InputStream)object).read((byte[])objectArray);
        ((InputStream)object).read((byte[])object2);
        int n16 = ByteBuffer.wrap(byArray).getInt();
        int n17 = ByteBuffer.wrap(objectArray).getInt();
        int n18 = ByteBuffer.wrap((byte[])object2).getInt();
        object2 = new byte[n17];
        ((a31)object).b(n16 - ((a31)object).p);
        ((InputStream)object).read((byte[])object2);
        this.e(new a31((byte[])object2), n16, 5);
        ((a31)object).b(n18 - ((a31)object).p);
        ((a31)object).o = ByteOrder.BIG_ENDIAN;
        n16 = ((a31)object).readInt();
        if (bl5) {
            object2 = new StringBuilder("numberOfDirectoryEntry: ");
            ((StringBuilder)object2).append(n16);
            Log.d((String)"ExifInterface", (String)((StringBuilder)object2).toString());
        }
        for (n18 = 0; n18 < n16; ++n18) {
            n17 = ((a31)object).readUnsignedShort();
            int n19 = ((a31)object).readUnsignedShort();
            if (n17 == f31.E.a) {
                n18 = ((a31)object).readShort();
                n16 = ((a31)object).readShort();
                object2 = b31.c(n18, this.f);
                object = b31.c(n16, this.f);
                objectArray = this.d;
                objectArray[0].put("ImageLength", object2);
                objectArray[0].put("ImageWidth", object);
                if (!bl5) break;
                object = new StringBuilder("Updated to length: ");
                ((StringBuilder)object).append(n18);
                ((StringBuilder)object).append(", width: ");
                ((StringBuilder)object).append(n16);
                Log.d((String)"ExifInterface", (String)((StringBuilder)object).toString());
                return;
            }
            ((a31)object).b(n19);
        }
    }

    public final void j(e31 hashMapArray) {
        Object object;
        this.o((e31)hashMapArray);
        this.s((e31)hashMapArray, 0);
        this.w((e31)hashMapArray, 0);
        this.w((e31)hashMapArray, 5);
        this.w((e31)hashMapArray, 4);
        this.x();
        if (this.c == 8 && (object = (b31)(hashMapArray = this.d)[1].get("MakerNote")) != null) {
            object = new e31(((b31)object).d);
            ((a31)object).o = this.f;
            ((a31)object).b(6);
            this.s((e31)object, 9);
            object = (b31)hashMapArray[9].get("ColorSpace");
            if (object != null) {
                hashMapArray[1].put("ColorSpace", object);
            }
        }
    }

    public final void k(e31 hashMapArray) {
        Object object;
        if (l) {
            object = new StringBuilder("getRw2Attributes starting with: ");
            ((StringBuilder)object).append(hashMapArray);
            Log.d((String)"ExifInterface", (String)((StringBuilder)object).toString());
        }
        this.j((e31)hashMapArray);
        hashMapArray = this.d;
        object = (b31)hashMapArray[0].get("JpgFromRaw");
        if (object != null) {
            this.e(new a31(((b31)object).d), (int)((b31)object).c, 5);
        }
        object = (b31)hashMapArray[0].get("ISO");
        b31 b312 = (b31)hashMapArray[1].get("PhotographicSensitivity");
        if (object != null && b312 == null) {
            hashMapArray[1].put("PhotographicSensitivity", object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(a31 object) {
        Object object2;
        if (l) {
            object2 = new StringBuilder("getWebpAttributes starting with: ");
            ((StringBuilder)object2).append(object);
            Log.d((String)"ExifInterface", (String)((StringBuilder)object2).toString());
        }
        ((a31)object).o = ByteOrder.LITTLE_ENDIAN;
        ((a31)object).b(y.length);
        int n16 = ((a31)object).readInt() + 8;
        object2 = z;
        ((a31)object).b(((Object)object2).length);
        int n17 = ((Object)object2).length + 8;
        try {
            while (((InputStream)object).read((byte[])(object2 = (Object)new byte[4])) == 4) {
                int n18 = ((a31)object).readInt();
                int n19 = n17 + 8;
                if (Arrays.equals(A, (byte[])object2)) {
                    byte[] byArray = new byte[n18];
                    if (((InputStream)object).read(byArray) == n18) {
                        this.h = n19;
                        this.r(0, byArray);
                        object = new a31(byArray);
                        this.u((a31)object);
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to read given length for given PNG chunk type: ");
                    stringBuilder.append(gi1.f((byte[])object2));
                    object = new IOException(stringBuilder.toString());
                    throw object;
                }
                n17 = n18;
                if (n18 % 2 == 1) {
                    n17 = n18 + 1;
                }
                if ((n18 = n19 + n17) == n16) {
                    return;
                }
                if (n18 <= n16) {
                    ((a31)object).b(n17);
                    n17 = n18;
                    continue;
                }
                object = new IOException("Encountered WebP file with invalid chunk size");
                throw object;
            }
            object = new IOException("Encountered invalid length while parsing WebP chunktype");
            throw object;
        }
        catch (EOFException eOFException) {
            mj0.i("Encountered corrupt WebP file.");
            return;
        }
    }

    public final void m(a31 object, HashMap object2) {
        b31 b312 = (b31)((HashMap)object2).get("JPEGInterchangeFormat");
        object2 = (b31)((HashMap)object2).get("JPEGInterchangeFormatLength");
        if (b312 != null && object2 != null) {
            int n16 = b312.e(this.f);
            int n17 = ((b31)object2).e(this.f);
            int n18 = n16;
            if (this.c == 7) {
                n18 = n16 + this.i;
            }
            if (n18 > 0 && n17 > 0 && this.b == null && this.a == null) {
                object2 = new byte[n17];
                ((InputStream)object).skip(n18);
                ((InputStream)object).read((byte[])object2);
            }
            if (l) {
                object = new StringBuilder("Setting thumbnail attributes with offset: ");
                ((StringBuilder)object).append(n18);
                ((StringBuilder)object).append(", length: ");
                ((StringBuilder)object).append(n17);
                Log.d((String)"ExifInterface", (String)((StringBuilder)object).toString());
            }
        }
    }

    public final boolean n(HashMap object) {
        b31 b312 = (b31)((HashMap)object).get("ImageLength");
        object = (b31)((HashMap)object).get("ImageWidth");
        if (b312 != null && object != null) {
            int n16 = b312.e(this.f);
            int n17 = ((b31)object).e(this.f);
            if (n16 <= 512 && n17 <= 512) {
                return true;
            }
        }
        return false;
    }

    public final void o(e31 e312) {
        ByteOrder byteOrder;
        this.f = byteOrder = f31.q(e312);
        e312.o = byteOrder;
        int n16 = e312.readUnsignedShort();
        int n17 = this.c;
        if (n17 != 7 && n17 != 10 && n16 != 42) {
            mj0.m(Integer.toHexString(n16), "Invalid start code: ");
            return;
        }
        n16 = e312.readInt();
        if (n16 >= 8) {
            if ((n16 -= 8) > 0) {
                e312.b(n16);
            }
            return;
        }
        mj0.i(f34.f(n16, "Invalid first Ifd offset: "));
    }

    public final void p() {
        HashMap[] hashMapArray;
        for (int i16 = 0; i16 < (hashMapArray = this.d).length; ++i16) {
            StringBuilder stringBuilder = f34.j(i16, "The size of tag group[", "]: ");
            stringBuilder.append(hashMapArray[i16].size());
            Log.d((String)"ExifInterface", (String)stringBuilder.toString());
            for (Map.Entry entry : hashMapArray[i16].entrySet()) {
                b31 b312 = (b31)entry.getValue();
                StringBuilder stringBuilder2 = new StringBuilder("tagName: ");
                stringBuilder2.append((String)entry.getKey());
                stringBuilder2.append(", tagType: ");
                stringBuilder2.append(b312.toString());
                stringBuilder2.append(", tagValue: '");
                stringBuilder2.append(b312.f(this.f));
                stringBuilder2.append("'");
                Log.d((String)"ExifInterface", (String)stringBuilder2.toString());
            }
        }
    }

    public final void r(int n16, byte[] object) {
        object = new e31((byte[])object);
        this.o((e31)object);
        this.s((e31)object, n16);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void s(e31 object, int n16) {
        long l16;
        Object object2;
        Object object3;
        int n17 = ((a31)object).p;
        HashSet hashSet = this.e;
        hashSet.add(n17);
        short s16 = ((a31)object).readShort();
        boolean bl5 = l;
        if (bl5) {
            object3 = new StringBuilder("numberOfDirectoryEntry: ");
            ((StringBuilder)object3).append(s16);
            Log.d((String)"ExifInterface", (String)((StringBuilder)object3).toString());
        }
        if (s16 <= 0) {
            return;
        }
        short s17 = 0;
        while (true) {
            block36: {
                int n18;
                Object object4;
                long l17;
                int n19;
                int n26;
                block37: {
                    block45: {
                        block44: {
                            block42: {
                                block43: {
                                    block38: {
                                        block39: {
                                            block40: {
                                                block41: {
                                                    Object object5;
                                                    int n27;
                                                    block35: {
                                                        block33: {
                                                            block34: {
                                                                block29: {
                                                                    block30: {
                                                                        long l18;
                                                                        block32: {
                                                                            block31: {
                                                                                block28: {
                                                                                    object2 = this.d;
                                                                                    if (s17 >= s16) break;
                                                                                    n27 = ((a31)object).readUnsignedShort();
                                                                                    n26 = ((a31)object).readUnsignedShort();
                                                                                    n19 = ((a31)object).readInt();
                                                                                    l17 = (long)((a31)object).p + 4L;
                                                                                    object4 = (c31)H[n16].get(n27);
                                                                                    if (bl5) {
                                                                                        object3 = object4 != null ? ((c31)object4).b : null;
                                                                                        Log.d((String)"ExifInterface", (String)String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", n16, n27, object3, n26, n19));
                                                                                    }
                                                                                    if (object4 != null) break block28;
                                                                                    if (bl5) {
                                                                                        object3 = new StringBuilder("Skip the tag entry since tag number is not defined: ");
                                                                                        ((StringBuilder)object3).append(n27);
                                                                                        Log.d((String)"ExifInterface", (String)((StringBuilder)object3).toString());
                                                                                    }
                                                                                    break block29;
                                                                                }
                                                                                if (n26 <= 0 || n26 >= ((Object)(object3 = (Object)C)).length) break block30;
                                                                                n18 = ((c31)object4).c;
                                                                                if (n18 == 7 || n26 == 7 || n18 == n26 || (n17 = ((c31)object4).d) == n26 || (n18 == 4 || n17 == 4) && n26 == 3 || (n18 == 9 || n17 == 9) && n26 == 8 || (n18 == 12 || n17 == 12) && n26 == 11) break block31;
                                                                                if (bl5) {
                                                                                    object3 = new StringBuilder("Skip the tag entry since data format (");
                                                                                    ((StringBuilder)object3).append(B[n26]);
                                                                                    ((StringBuilder)object3).append(") is unexpected for tag: ");
                                                                                    ((StringBuilder)object3).append(((c31)object4).b);
                                                                                    Log.d((String)"ExifInterface", (String)((StringBuilder)object3).toString());
                                                                                }
                                                                                break block29;
                                                                            }
                                                                            n17 = n26;
                                                                            if (n26 == 7) {
                                                                                n17 = n18;
                                                                            }
                                                                            if ((l18 = (long)n19 * (long)object3[n17]) < 0L || l18 > Integer.MAX_VALUE) break block32;
                                                                            n18 = 1;
                                                                            l16 = l18;
                                                                            break block33;
                                                                        }
                                                                        l16 = l18;
                                                                        n26 = n17;
                                                                        if (bl5) {
                                                                            object3 = new StringBuilder("Skip the tag entry since the number of components is invalid: ");
                                                                            ((StringBuilder)object3).append(n19);
                                                                            Log.d((String)"ExifInterface", (String)((StringBuilder)object3).toString());
                                                                            n26 = n17;
                                                                            l16 = l18;
                                                                        }
                                                                        break block34;
                                                                    }
                                                                    if (bl5) {
                                                                        object3 = new StringBuilder("Skip the tag entry since data format is invalid: ");
                                                                        ((StringBuilder)object3).append(n26);
                                                                        Log.d((String)"ExifInterface", (String)((StringBuilder)object3).toString());
                                                                    }
                                                                }
                                                                l16 = 0L;
                                                            }
                                                            n18 = 0;
                                                            n17 = n26;
                                                        }
                                                        if (n18 != 0) break block35;
                                                        ((e31)object).f(l17);
                                                        break block36;
                                                    }
                                                    if (l16 > 4L) {
                                                        n26 = ((a31)object).readInt();
                                                        if (bl5) {
                                                            object3 = new StringBuilder("seek to data offset: ");
                                                            ((StringBuilder)object3).append(n26);
                                                            Log.d((String)"ExifInterface", (String)((StringBuilder)object3).toString());
                                                        }
                                                        if (this.c == 7) {
                                                            if ("MakerNote".equals(((c31)object4).b)) {
                                                                this.i = n26;
                                                            } else if (n16 == 6 && "ThumbnailImage".equals(((c31)object4).b)) {
                                                                this.j = n26;
                                                                this.k = n19;
                                                                object3 = b31.c(6, this.f);
                                                                object5 = b31.a(this.j, this.f);
                                                                b31 b312 = b31.a(this.k, this.f);
                                                                ((HashMap)object2[4]).put("Compression", object3);
                                                                ((HashMap)object2[4]).put("JPEGInterchangeFormat", object5);
                                                                ((HashMap)object2[4]).put("JPEGInterchangeFormatLength", b312);
                                                            }
                                                        }
                                                        ((e31)object).f(n26);
                                                    }
                                                    object3 = (Integer)K.get(n27);
                                                    if (bl5) {
                                                        object5 = new StringBuilder("nextIfdType: ");
                                                        ((StringBuilder)object5).append(object3);
                                                        ((StringBuilder)object5).append(" byteCount: ");
                                                        ((StringBuilder)object5).append(l16);
                                                        Log.d((String)"ExifInterface", (String)((StringBuilder)object5).toString());
                                                    }
                                                    if (object3 == null) break block37;
                                                    if (n17 == 3) break block38;
                                                    if (n17 == 4) break block39;
                                                    if (n17 == 8) break block40;
                                                    if (n17 == 9 || n17 == 13) break block41;
                                                    l16 = -1L;
                                                    break block42;
                                                }
                                                n17 = ((a31)object).readInt();
                                                break block43;
                                            }
                                            n17 = ((a31)object).readShort();
                                            break block43;
                                        }
                                        l16 = (long)((a31)object).readInt() & 0xFFFFFFFFL;
                                        break block42;
                                    }
                                    n17 = ((a31)object).readUnsignedShort();
                                }
                                l16 = n17;
                            }
                            if (bl5) {
                                Log.d((String)"ExifInterface", (String)String.format("Offset: %d, tagName: %s", l16, ((c31)object4).b));
                            }
                            if (l16 <= 0L) break block44;
                            if (!hashSet.contains((int)l16)) {
                                ((e31)object).f(l16);
                                this.s((e31)object, (Integer)object3);
                                break block45;
                            } else if (bl5) {
                                object4 = new StringBuilder("Skip jump into the IFD since it has already been read: IfdType ");
                                ((StringBuilder)object4).append(object3);
                                ((StringBuilder)object4).append(" (at ");
                                ((StringBuilder)object4).append(l16);
                                ((StringBuilder)object4).append(")");
                                Log.d((String)"ExifInterface", (String)((StringBuilder)object4).toString());
                            }
                            break block45;
                        }
                        if (bl5) {
                            object3 = new StringBuilder("Skip jump into the IFD since its offset is invalid: ");
                            ((StringBuilder)object3).append(l16);
                            Log.d((String)"ExifInterface", (String)((StringBuilder)object3).toString());
                        }
                    }
                    ((e31)object).f(l17);
                    break block36;
                }
                n26 = ((a31)object).p;
                n18 = this.h;
                object3 = new byte[(int)l16];
                ((a31)object).readFully((byte[])object3);
                object3 = new b31(n26 + n18, (byte[])object3, n17, n19);
                object2 = object2[n16];
                object4 = ((c31)object4).b;
                ((HashMap)object2).put(object4, object3);
                if ("DNGVersion".equals(object4)) {
                    this.c = 3;
                }
                if (("Make".equals(object4) || "Model".equals(object4)) && ((b31)object3).f(this.f).contains("PENTAX") || "Compression".equals(object4) && ((b31)object3).e(this.f) == 65535) {
                    this.c = 8;
                }
                if ((long)((a31)object).p != l17) {
                    ((e31)object).f(l17);
                }
            }
            s17 = (short)(s17 + 1);
        }
        n16 = ((a31)object).readInt();
        if (bl5) {
            Log.d((String)"ExifInterface", (String)String.format("nextIfdOffset: %d", n16));
        }
        if ((l16 = (long)n16) <= 0L) {
            if (!bl5) return;
            object = new StringBuilder("Stop reading file since a wrong offset may cause an infinite loop: ");
            ((StringBuilder)object).append(n16);
            Log.d((String)"ExifInterface", (String)((StringBuilder)object).toString());
            return;
        }
        if (hashSet.contains(n16)) {
            if (!bl5) return;
            object = new StringBuilder("Stop reading file since re-reading an IFD may cause an infinite loop: ");
            ((StringBuilder)object).append(n16);
            Log.d((String)"ExifInterface", (String)((StringBuilder)object).toString());
            return;
        }
        ((e31)object).f(l16);
        if (object2[4].isEmpty()) {
            this.s((e31)object, 4);
            return;
        }
        if (!object2[5].isEmpty()) return;
        this.s((e31)object, 5);
    }

    public final void t(int n16, String string, String string2) {
        HashMap[] hashMapArray = this.d;
        if (!hashMapArray[n16].isEmpty() && hashMapArray[n16].get(string) != null) {
            HashMap hashMap = hashMapArray[n16];
            hashMap.put(string2, hashMap.get(string));
            hashMapArray[n16].remove(string);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void u(a31 object) {
        Object object2 = this.d[4];
        Object object3 = (b31)((HashMap)object2).get("Compression");
        if (object3 != null) {
            Object object4;
            int[] nArray;
            int n16 = ((b31)object3).e(this.f);
            if (n16 != 1) {
                if (n16 != 6) {
                    if (n16 != 7) {
                        return;
                    }
                } else {
                    this.m((a31)object, (HashMap)object2);
                    return;
                }
            }
            if ((object3 = (b31)((HashMap)object2).get("BitsPerSample")) != null && (Arrays.equals(nArray = m, (int[])(object3 = (Object)((int[])((b31)object3).g(this.f)))) || this.c == 3 && (object4 = (b31)((HashMap)object2).get("PhotometricInterpretation")) != null && ((n16 = ((b31)object4).e(this.f)) == 1 && Arrays.equals((int[])object3, n) || n16 == 6 && Arrays.equals((int[])object3, nArray)))) {
                b31 b312 = (b31)((HashMap)object2).get("StripOffsets");
                object3 = (b31)((HashMap)object2).get("StripByteCounts");
                if (b312 == null || object3 == null) return;
                object2 = gi1.l(b312.g(this.f));
                object3 = gi1.l(((b31)object3).g(this.f));
                if (object2 != null && ((Object)object2).length != 0) {
                    if (object3 != null && ((Object)object3).length != 0) {
                        if (((Object)object2).length != ((Object)object3).length) {
                            Log.w((String)"ExifInterface", (String)"stripOffsets and stripByteCounts should have same length.");
                            return;
                        }
                        int n17 = ((Object)object3).length;
                        long l16 = 0L;
                        for (n16 = 0; n16 < n17; ++n16) {
                            l16 += object3[n16];
                        }
                        object4 = new byte[(int)l16];
                        this.g = true;
                        n16 = n17 = 0;
                        for (int i16 = 0; i16 < ((Object)object2).length; ++i16) {
                            int n18 = (int)object2[i16];
                            int n19 = (int)object3[i16];
                            if (i16 < ((Object)object2).length - 1 && (long)(n18 + n19) != object2[i16 + 1]) {
                                this.g = false;
                            }
                            if ((n18 -= n17) < 0) {
                                Log.d((String)"ExifInterface", (String)"Invalid strip offset value");
                                return;
                            }
                            l16 = n18;
                            if (((InputStream)object).skip(l16) != l16) {
                                object = new StringBuilder("Failed to skip ");
                                ((StringBuilder)object).append(n18);
                                ((StringBuilder)object).append(" bytes.");
                                Log.d((String)"ExifInterface", (String)((StringBuilder)object).toString());
                                return;
                            }
                            byte[] byArray = new byte[n19];
                            if (((InputStream)object).read(byArray) != n19) {
                                object = new StringBuilder("Failed to read ");
                                ((StringBuilder)object).append(n19);
                                ((StringBuilder)object).append(" bytes.");
                                Log.d((String)"ExifInterface", (String)((StringBuilder)object).toString());
                                return;
                            }
                            n17 = n17 + n18 + n19;
                            System.arraycopy(byArray, 0, object4, n16, n19);
                            n16 += n19;
                        }
                        if (!this.g) return;
                        l16 = (long)object2[0];
                        return;
                    }
                    Log.w((String)"ExifInterface", (String)"stripByteCounts should not be null or have zero length.");
                    return;
                }
                Log.w((String)"ExifInterface", (String)"stripOffsets should not be null or have zero length.");
                return;
            }
            if (!l) return;
            Log.d((String)"ExifInterface", (String)"Unsupported data type value");
            return;
        }
        this.m((a31)object, (HashMap)object2);
    }

    public final void v(int n16, int n17) {
        HashMap[] hashMapArray = this.d;
        boolean bl5 = hashMapArray[n16].isEmpty();
        boolean bl6 = l;
        if (!bl5 && !hashMapArray[n17].isEmpty()) {
            Object object = (b31)hashMapArray[n16].get("ImageLength");
            b31 b312 = (b31)hashMapArray[n16].get("ImageWidth");
            b31 b313 = (b31)hashMapArray[n17].get("ImageLength");
            b31 b314 = (b31)hashMapArray[n17].get("ImageWidth");
            if (object != null && b312 != null) {
                if (b313 != null && b314 != null) {
                    int n18 = ((b31)object).e(this.f);
                    int n19 = b312.e(this.f);
                    int n26 = b313.e(this.f);
                    int n27 = b314.e(this.f);
                    if (n18 < n26 && n19 < n27) {
                        object = hashMapArray[n16];
                        hashMapArray[n16] = hashMapArray[n17];
                        hashMapArray[n17] = object;
                        return;
                    }
                } else if (bl6) {
                    Log.d((String)"ExifInterface", (String)"Second image does not contain valid size information");
                    return;
                }
            } else if (bl6) {
                Log.d((String)"ExifInterface", (String)"First image does not contain valid size information");
                return;
            }
        } else if (bl6) {
            Log.d((String)"ExifInterface", (String)"Cannot perform swap since only one image data exists");
        }
    }

    public final void w(e31 object, int n16) {
        b31 b312;
        b31 b313;
        b31 b314;
        b31 b315;
        Object object2;
        Object object3;
        block9: {
            block13: {
                block12: {
                    block10: {
                        block11: {
                            object3 = this.d;
                            object2 = (d31[])object3[n16].get("DefaultCropSize");
                            b315 = (b31)object3[n16].get("SensorTopBorder");
                            b314 = (b31)object3[n16].get("SensorLeftBorder");
                            b313 = (b31)object3[n16].get("SensorBottomBorder");
                            b312 = (b31)object3[n16].get("SensorRightBorder");
                            if (object2 == null) break block9;
                            int n17 = object2.a;
                            object = this.f;
                            if (n17 != 5) break block10;
                            if ((object2 = (d31[])object2.g((ByteOrder)object)) == null || ((d31[])object2).length != 2) break block11;
                            object = b31.b(object2[0], this.f);
                            object2 = b31.b(object2[1], this.f);
                            break block12;
                        }
                        object = new StringBuilder("Invalid crop size values. cropSize=");
                        ((StringBuilder)object).append(Arrays.toString(object2));
                        Log.w((String)"ExifInterface", (String)((StringBuilder)object).toString());
                        return;
                    }
                    if ((object2 = (Object)((int[])object2.g((ByteOrder)object))) == null || ((d31[])object2).length != 2) break block13;
                    object = b31.c((int)object2[0], this.f);
                    object2 = b31.c((int)object2[1], this.f);
                }
                object3[n16].put("ImageWidth", object);
                object3[n16].put("ImageLength", object2);
                return;
            }
            object = new StringBuilder("Invalid crop size values. cropSize=");
            ((StringBuilder)object).append(Arrays.toString((int[])object2));
            Log.w((String)"ExifInterface", (String)((StringBuilder)object).toString());
            return;
        }
        if (b315 != null && b314 != null && b313 != null && b312 != null) {
            int n18 = b315.e(this.f);
            int n19 = b313.e(this.f);
            int n26 = b312.e(this.f);
            int n27 = b314.e(this.f);
            if (n19 > n18 && n26 > n27) {
                object = b31.c(n19 - n18, this.f);
                object2 = b31.c(n26 - n27, this.f);
                object3[n16].put("ImageLength", object);
                object3[n16].put("ImageWidth", object2);
                return;
            }
        } else {
            object2 = (b31)object3[n16].get("ImageLength");
            b314 = (b31)object3[n16].get("ImageWidth");
            if (object2 == null || b314 == null) {
                object2 = (b31)object3[n16].get("JPEGInterchangeFormat");
                object3 = (b31)object3[n16].get("JPEGInterchangeFormatLength");
                if (object2 != null && object3 != null) {
                    int n28 = object2.e(this.f);
                    int n29 = object2.e(this.f);
                    ((e31)object).f(n28);
                    object2 = new byte[n29];
                    ((InputStream)object).read((byte[])object2);
                    this.e(new a31((byte[])object2), n28, n16);
                }
            }
        }
    }

    public final void x() {
        this.v(0, 5);
        this.v(0, 4);
        this.v(5, 4);
        HashMap[] hashMapArray = this.d;
        b31 b312 = (b31)hashMapArray[1].get("PixelXDimension");
        b31 b313 = (b31)hashMapArray[1].get("PixelYDimension");
        if (b312 != null && b313 != null) {
            hashMapArray[0].put("ImageWidth", b312);
            hashMapArray[0].put("ImageLength", b313);
        }
        if (hashMapArray[4].isEmpty() && this.n(hashMapArray[5])) {
            hashMapArray[4] = hashMapArray[5];
            hashMapArray[5] = new HashMap();
        }
        if (!this.n(hashMapArray[4])) {
            Log.d((String)"ExifInterface", (String)"No image meets the size requirements of a thumbnail image.");
        }
        this.t(0, "ThumbnailOrientation", "Orientation");
        this.t(0, "ThumbnailImageLength", "ImageLength");
        this.t(0, "ThumbnailImageWidth", "ImageWidth");
        this.t(5, "ThumbnailOrientation", "Orientation");
        this.t(5, "ThumbnailImageLength", "ImageLength");
        this.t(5, "ThumbnailImageWidth", "ImageWidth");
        this.t(4, "Orientation", "ThumbnailOrientation");
        this.t(4, "ImageLength", "ThumbnailImageLength");
        this.t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}

