package defpackage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iu2 {
    public static final zw1 f = null;
    public static final n10 g = null;
    public static final HashMap h = null;
    public static final iu2 i = null;
    public static final pz1 j = null;
    public final String a;
    public final String b;
    public final zw1 c;
    public String d;
    public int e;

    static {
        String r0 = rr2.U(StandardCharsets.UTF_8.name());
        uc5.d("charset", r0);
        p60 r2 = p60.a();
        qw1 r3 = (qw1) r2.get("charset");
        if (r3 != null) goto L5;
        vw1 r4 = yw1.o;
        uc5.f(4, "expectedSize");
        r3 = new uw1(4);
        r2.put("charset", r3);
    L5:
        r3.a(r0);
        Collection r1 = r2.entrySet();
        int r5 = 1;
        if (((AbstractCollection) r1).isEmpty() == false) goto L8;
        zw1 r6 = s01.t;
    L13:
        f = r6;
        o10 r7 = o10.q;
        o10 r8 = o10.r;
        r8.getClass();
        t10 r9 = new t10(r8);
        r7.getClass();
        g = new n10(new n10(new n10(r7, r9), new r10(' ', 1)), u10.b("()<>@,;:\\\"/[]?=").d());
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
        j = new pz1(r5, new uc0("; "));
        return;
    L8:
        n60 r10 = (n60) r1;
        ue1 r11 = new ue1(((p60) r10.o).size());
        Iterator r12 = r10.iterator();
        int r13 = 0;
    L10:
        if (r12.hasNext() == false) goto L12;
        Map.Entry r14 = (Map.Entry) r12.next();
        Object r15 = r14.getKey();
        gy3 r16 = ((uw1) r14.getValue()).f();
        r11.x(r15, r16);
        r13 = r13 + r16.q;
        goto L10
    L12:
        r6 = new zw1(r11.d(true), r13);
        goto L13
    }

    public iu2(String r1, String r2, zw1 r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    public static void a(String r2, String r3) {
        iu2 r0 = new iu2(r2, r3, s01.t);
        h.put(r0, r0);
    }

    public static iu2 b(String r2, String r3) {
        iu2 r0 = new iu2(r2, r3, f);
        h.put(r0, r0);
        StandardCharsets.UTF_8.getClass();
        return r0;
    }

    public final kg2 c() {
        int r2 = 27;
        return new kg2(this.c.i(), new hg3(r2, new zr2(22)));
    }

    public final boolean equals(Object r3) {
        if (r3 != this) goto L5;
        return true;
    L5:
        if ((r3 instanceof iu2) == false) goto L14;
        iu2 r4 = (iu2) r3;
        if (this.a.equals(r4.a) == true) goto L9;
        return false;
    L9:
        if (this.b.equals(r4.b) == true) goto L11;
        return false;
    L11:
        if (c().equals(r4.c()) == false) goto L19;
        return true;
    L19:
        return false;
    L14:
        return false;
    }

    public final int hashCode() {
        int r0 = this.e;
        if (r0 != 0) goto L6;
        String r1 = this.b;
        kg2 r2 = c();
        int r3 = Arrays.hashCode(new Object[]{this.a, r1, r2});
        this.e = r3;
        return r3;
    L6:
        return r0;
    }

    public final String toString() {
        String r0 = this.d;
        if (r0 != null) goto L14;
        StringBuilder r1 = new StringBuilder();
        r1.append(this.a);
        r1.append('/');
        r1.append(this.b);
        zw1 r2 = this.c;
        if (r2.s == 0) goto L9;
        r1.append("; ");
        int r4 = 27;
        Collection r3 = new tz2(r2, new hg3(r4, new zr2(21))).a();
        pz1 r5 = j;
        r5.getClass();
        r5.u(r1, r3.iterator());     // Catch: IOException -> L11
    L11:
        e = move-exception;
        throw new AssertionError(e);
    L9:
        String r6 = r1.toString();
        this.d = r6;
        return r6;
    L14:
        return r0;
    }
}
