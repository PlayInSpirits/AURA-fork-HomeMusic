package defpackage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iu2 {
    public static final zw1 f;
    public static final n10 g;
    public static final HashMap h;
    public static final iu2 i;
    public static final pz1 j;
    public final String a;
    public final String b;
    public final zw1 c;
    public String d;
    public int e;

    static {
        zw1 zw1Var;
        String strU = rr2.U(StandardCharsets.UTF_8.name());
        uc5.d("charset", strU);
        p60 p60VarA = p60.a();
        qw1 uw1Var = (qw1) p60VarA.get("charset");
        if (uw1Var == null) {
            vw1 vw1Var = yw1.o;
            uc5.f(4, "expectedSize");
            uw1Var = new uw1(4);
            p60VarA.put("charset", uw1Var);
        }
        uw1Var.a(strU);
        Collection collectionEntrySet = p60VarA.entrySet();
        int i2 = 1;
        if (((AbstractCollection) collectionEntrySet).isEmpty()) {
            zw1Var = s01.t;
        } else {
            n60<Map.Entry> n60Var = (n60) collectionEntrySet;
            ue1 ue1Var = new ue1(((p60) n60Var.o).size());
            int i3 = 0;
            for (Map.Entry entry : n60Var) {
                Object key = entry.getKey();
                gy3 gy3VarF = ((uw1) entry.getValue()).f();
                ue1Var.x(key, gy3VarF);
                i3 += gy3VarF.q;
            }
            zw1Var = new zw1(ue1Var.d(true), i3);
        }
        f = zw1Var;
        o10 o10Var = o10.q;
        o10 o10Var2 = o10.r;
        o10Var2.getClass();
        t10 t10Var = new t10(o10Var2);
        o10Var.getClass();
        g = new n10(new n10(new n10(o10Var, t10Var), new r10(' ', 1)), u10.b("()<>@,;:\\\"/[]?=").d());
        u10.b("\"\\\r").d().getClass();
        u10.b(" \t\r\n");
        h = new HashMap();
        a("*", "*");
        a("text", "*");
        a("image", "*");
        a("audio", "*");
        a("video", "*");
        a("application", "*");
        a("font", "*");
        b("text", "cache-manifest");
        b("text", "css");
        b("text", "csv");
        b("text", "html");
        b("text", "calendar");
        b("text", "markdown");
        b("text", "plain");
        b("text", "javascript");
        b("text", "tab-separated-values");
        b("text", "vcard");
        b("text", "vnd.wap.wml");
        b("text", "xml");
        b("text", "vtt");
        a("image", "bmp");
        a("image", "x-canon-crw");
        a("image", "gif");
        a("image", "vnd.microsoft.icon");
        a("image", "jpeg");
        a("image", "png");
        a("image", "vnd.adobe.photoshop");
        b("image", "svg+xml");
        a("image", "tiff");
        a("image", "webp");
        a("image", "heif");
        a("image", "jp2");
        a("audio", "mp4");
        a("audio", "mpeg");
        a("audio", "ogg");
        a("audio", "webm");
        a("audio", "l16");
        a("audio", "l24");
        a("audio", "basic");
        a("audio", "aac");
        a("audio", "vorbis");
        a("audio", "x-ms-wma");
        a("audio", "x-ms-wax");
        a("audio", "vnd.rn-realaudio");
        a("audio", "vnd.wave");
        a("video", "mp4");
        a("video", "mpeg");
        a("video", "ogg");
        a("video", "quicktime");
        a("video", "webm");
        a("video", "x-ms-wmv");
        a("video", "x-flv");
        a("video", "3gpp");
        a("video", "3gpp2");
        b("application", "xml");
        b("application", "atom+xml");
        a("application", "x-bzip2");
        b("application", "dart");
        a("application", "vnd.apple.pkpass");
        a("application", "vnd.ms-fontobject");
        a("application", "epub+zip");
        a("application", "x-www-form-urlencoded");
        a("application", "pkcs12");
        a("application", "binary");
        a("application", "geo+json");
        a("application", "x-gzip");
        a("application", "hal+json");
        b("application", "javascript");
        a("application", "jose");
        a("application", "jose+json");
        i = b("application", "json");
        a("application", "jwt");
        b("application", "manifest+json");
        a("application", "vnd.google-earth.kml+xml");
        a("application", "vnd.google-earth.kmz");
        a("application", "mbox");
        a("application", "x-apple-aspen-config");
        a("application", "vnd.ms-excel");
        a("application", "vnd.ms-outlook");
        a("application", "vnd.ms-powerpoint");
        a("application", "msword");
        a("application", "dash+xml");
        a("application", "wasm");
        a("application", "x-nacl");
        a("application", "x-pnacl");
        a("application", "octet-stream");
        a("application", "ogg");
        a("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        a("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        a("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        a("application", "vnd.oasis.opendocument.graphics");
        a("application", "vnd.oasis.opendocument.presentation");
        a("application", "vnd.oasis.opendocument.spreadsheet");
        a("application", "vnd.oasis.opendocument.text");
        b("application", "opensearchdescription+xml");
        a("application", "pdf");
        a("application", "postscript");
        a("application", "protobuf");
        b("application", "rdf+xml");
        b("application", "rtf");
        a("application", "font-sfnt");
        a("application", "x-shockwave-flash");
        a("application", "vnd.sketchup.skp");
        b("application", "soap+xml");
        a("application", "x-tar");
        a("application", "font-woff");
        a("application", "font-woff2");
        b("application", "xhtml+xml");
        b("application", "xrd+xml");
        a("application", "zip");
        a("font", "collection");
        a("font", "otf");
        a("font", "sfnt");
        a("font", "ttf");
        a("font", "woff");
        a("font", "woff2");
        j = new pz1(i2, new uc0("; "));
    }

    public iu2(String str, String str2, zw1 zw1Var) {
        this.a = str;
        this.b = str2;
        this.c = zw1Var;
    }

    public static void a(String str, String str2) {
        iu2 iu2Var = new iu2(str, str2, s01.t);
        h.put(iu2Var, iu2Var);
    }

    public static iu2 b(String str, String str2) {
        iu2 iu2Var = new iu2(str, str2, f);
        h.put(iu2Var, iu2Var);
        StandardCharsets.UTF_8.getClass();
        return iu2Var;
    }

    public final kg2 c() {
        return new kg2(this.c.b(), new hg3(27, new zr2(22)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iu2)) {
            return false;
        }
        iu2 iu2Var = (iu2) obj;
        return this.a.equals(iu2Var.a) && this.b.equals(iu2Var.b) && c().equals(iu2Var.c());
    }

    public final int hashCode() {
        int i2 = this.e;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(new Object[]{this.a, this.b, c()});
        this.e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('/');
        sb.append(this.b);
        zw1 zw1Var = this.c;
        if (zw1Var.s != 0) {
            sb.append("; ");
            Collection collectionA = new tz2(zw1Var, new hg3(27, new zr2(21))).a();
            pz1 pz1Var = j;
            pz1Var.getClass();
            try {
                pz1Var.u(sb, collectionA.iterator());
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        String string = sb.toString();
        this.d = string;
        return string;
    }
}
