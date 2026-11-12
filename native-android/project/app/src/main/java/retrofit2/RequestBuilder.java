package retrofit2;

import defpackage.e35;
import defpackage.ew;
import defpackage.fr1;
import defpackage.fu;
import defpackage.gr1;
import defpackage.hu2;
import defpackage.kf2;
import defpackage.nz3;
import defpackage.qb1;
import defpackage.rb1;
import defpackage.sl1;
import defpackage.tl1;
import defpackage.tv;
import defpackage.tz3;
import defpackage.uz2;
import defpackage.ve5;
import defpackage.vz2;
import defpackage.wz2;
import defpackage.xa3;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class RequestBuilder {
    private static final char[] HEX_DIGITS = null;
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private static final Pattern PATH_TRAVERSAL = null;
    private final gr1 baseUrl;

    @Nullable
    private tz3 body;

    @Nullable
    private hu2 contentType;

    @Nullable
    private qb1 formBuilder;
    private final boolean hasBody;
    private final sl1 headersBuilder;
    private final String method;

    @Nullable
    private uz2 multipartBuilder;

    @Nullable
    private String relativeUrl;
    private final nz3 requestBuilder;

    @Nullable
    private fr1 urlBuilder;

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static class ContentTypeOverridingRequestBody extends tz3 {
        private final hu2 contentType;
        private final tz3 delegate;

        public ContentTypeOverridingRequestBody(tz3 r1, hu2 r2) {
            this.delegate = r1;
            this.contentType = r2;
        }

        @Override // defpackage.tz3
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // defpackage.tz3
        public hu2 contentType() {
            return this.contentType;
        }

        @Override // defpackage.tz3
        public void writeTo(ew r1) {
            this.delegate.writeTo(r1);
        }
    }

    static {
        HEX_DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        PATH_TRAVERSAL = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    }

    public RequestBuilder(String r1, gr1 r2, @Nullable String r3, @Nullable tl1 r4, @Nullable hu2 r5, boolean r6, boolean r7, boolean r8) {
        this.method = r1;
        this.baseUrl = r2;
        this.relativeUrl = r3;
        this.requestBuilder = new nz3();
        this.contentType = r5;
        this.hasBody = r6;
        if (r4 == null) goto L5;
        this.headersBuilder = r4.d();
    L6:
        if (r7 == false) goto L9;
        this.formBuilder = new qb1();
        return;
    L9:
        if (r8 == false) goto L12;
        uz2 r9 = new uz2();
        this.multipartBuilder = r9;
        r9.c(wz2.f);
        return;
    L12:
        return;
    L5:
        this.headersBuilder = new sl1();
        goto L6
    }

    private static void canonicalizeForPath(tv r6, String r7, int r8, int r9, boolean r10) {
        tv r0 = null;
    L3:
        if (r8 >= r9) goto L34;
        int r1 = r7.codePointAt(r8);
        if (r10 == false) goto L16;
        if (r1 == 9) goto L33;
        if (r1 == 10) goto L33;
        if (r1 == 12) goto L33;
        if (r1 != 13) goto L16;
    L33:
        r8 = r8 + Character.charCount(r1);
    L16:
        if (r1 >= 32) goto L18;
    L27:
        if (r0 != null) goto L29;
        r0 = new tv();
    L29:
        r0.f0(r1);
    L31:
        if (r0.l() == true) goto L33;
        byte r2 = r0.readByte();
        r6.Y(37);
        char[] r5 = HEX_DIGITS;
        r6.Y(r5[((r2 & 255) >> 4) & 15]);
        r6.Y(r5[r2 & 15]);
        goto L31
    L18:
        if (r1 >= 127) goto L27;
        if (PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(r1) != (-1)) goto L27;
        if (r10 == false) goto L23;
    L26:
        r6.f0(r1);
        goto L33
    L23:
        if (r1 == 47) goto L27;
        if (r1 != 37) goto L26;
    }

    public void addFormField(String r10, String r11, boolean r12) {
        qb1 r9 = this.formBuilder;
        if (r12 == false) goto L6;
        r9.getClass();
        r10.getClass();
        r11.getClass();
        r9.a.add(fu.i(r10, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
        r9.b.add(fu.i(r11, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
        return;
    L6:
        r9.getClass();
        r10.getClass();
        r11.getClass();
        r9.a.add(fu.i(r10, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        r9.b.add(fu.i(r11, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public void addHeader(String r2, String r3, boolean r4) {
        if ("Content-Type".equalsIgnoreCase(r2) == true) goto L15;
        sl1 r1 = this.headersBuilder;
        if (r4 == false) goto L13;
        r1.getClass();
        r2.getClass();
        r3.getClass();
        e35.G(r2);
        e35.p(r1, r2, r3);
        return;
    L13:
        r1.a(r2, r3);
        return;
    L15:
        r3.getClass();     // Catch: IllegalArgumentException -> L6
        this.contentType = ve5.a(r3);     // Catch: IllegalArgumentException -> L6
        return;
    L6:
        e = move-exception;
        throw new IllegalArgumentException(xa3.g("Malformed content type: ", r3), e);
    }

    public void addHeaders(tl1 r5) {
        sl1 r4 = this.headersBuilder;
        r4.getClass();
        r5.getClass();
        int r0 = r5.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        e35.p(r4, r5.b(r1), r5.e(r1));
        r1 = r1 + 1;
        goto L3
    }

    public void addPart(tl1 r3, tz3 r4) {
        uz2 r2 = this.multipartBuilder;
        r2.getClass();
        r4.getClass();
        String r0 = null;
        if (r3 == null) goto L5;
        String r1 = r3.a("Content-Type");
    L6:
        if (r1 != null) goto L14;
        if (r3 == null) goto L9;
        r0 = r3.a("Content-Length");
    L9:
        if (r0 != null) goto L12;
        r2.c.add(new vz2(r3, r4));
        return;
    L12:
        kf2.n("Unexpected header: Content-Length");
        return;
    L14:
        kf2.n("Unexpected header: Content-Type");
        return;
    L5:
        r1 = null;
        goto L6
    }

    public void addPathParam(String r4, String r5, boolean r6) {
        if (this.relativeUrl == null) goto L11;
        String r7 = canonicalizeForPath(r5, r6);
        String r8 = this.relativeUrl.replace("{" + r4 + "}", r7);
        if (PATH_TRAVERSAL.matcher(r8).matches() == true) goto L8;
        this.relativeUrl = r8;
        return;
    L8:
        kf2.n(xa3.g("@Path parameters shouldn't perform path traversal ('.' or '..'): ", r5));
        return;
    L11:
        throw new AssertionError();
    }

    public void addQueryParam(String r5, @Nullable String r6, boolean r7) {
        String r0 = this.relativeUrl;
        String r1 = null;
        if (r0 == null) goto L13;
        gr1 r2 = this.baseUrl;
        r2.getClass();
        fr1 r3 = new fr1();     // Catch: IllegalArgumentException -> L7
        r3.e(r2, r0);     // Catch: IllegalArgumentException -> L7
    L8:
        this.urlBuilder = r3;
        if (r3 == null) goto L11;
        this.relativeUrl = null;
        goto L13
    L11:
        StringBuilder r8 = new StringBuilder("Malformed URL. Base: ");
        r8.append(this.baseUrl);
        String r4 = this.relativeUrl;
        r8.append(", Relative: ");
        r8.append(r4);
        throw new IllegalArgumentException(r8.toString());
    L7:
        r3 = null;
    L13:
        fr1 r9 = this.urlBuilder;
        if (r7 == false) goto L23;
        r9.getClass();
        r5.getClass();
        if (r9.g != null) goto L18;
        r9.g = new ArrayList();
    L18:
        ArrayList r10 = r9.g;
        r10.getClass();
        r10.add(fu.g(r5, 0, 0, " \"'<>#&=", 83));
        ArrayList r11 = r9.g;
        r11.getClass();
        if (r6 == null) goto L21;
        r1 = fu.g(r6, 0, 0, " \"'<>#&=", 83);
    L21:
        r11.add(r1);
        return;
    L23:
        r9.a(r5, r6);
    }

    public <T> void addTag(Class<T> r1, @Nullable T r2) {
        this.requestBuilder.c(r1, r2);
    }

    public nz3 get() {
        fr1 r0 = this.urlBuilder;
        if (r0 == null) goto L5;
        gr1 r1 = r0.b();
    L13:
        tz3 r2 = this.body;
        if (r2 != null) goto L24;
        qb1 r3 = this.formBuilder;
        if (r3 == null) goto L18;
        r2 = new rb1(r3.a, r3.b);
        goto L24
    L18:
        uz2 r4 = this.multipartBuilder;
        if (r4 == null) goto L22;
        r2 = r4.b();
        goto L24
    L22:
        if (this.hasBody == false) goto L24;
        r2 = tz3.create(null, new byte[0]);
    L24:
        hu2 r5 = this.contentType;
        if (r5 == null) goto L29;
        if (r2 == null) goto L28;
        r2 = new ContentTypeOverridingRequestBody(r2, r5);
        goto L29
    L28:
        this.headersBuilder.a("Content-Type", r5.a);
    L29:
        nz3 r6 = this.requestBuilder;
        r6.getClass();
        r6.a = r1;
        r6.c = this.headersBuilder.c().d();
        r6.b(this.method, r2);
        return r6;
    L5:
        gr1 r7 = this.baseUrl;
        String r8 = this.relativeUrl;
        r7.getClass();
        r8.getClass();
        fr1 r9 = new fr1();     // Catch: IllegalArgumentException -> L8
        r9.e(r7, r8);     // Catch: IllegalArgumentException -> L8
    L9:
        if (r9 == null) goto L11;
        r1 = r9.b();
    L12:
        if (r1 != null) goto L13;
        StringBuilder r10 = new StringBuilder("Malformed URL. Base: ");
        r10.append(this.baseUrl);
        String r11 = this.relativeUrl;
        r10.append(", Relative: ");
        r10.append(r11);
        throw new IllegalArgumentException(r10.toString());
    L11:
        r1 = null;
    L8:
        r9 = null;
        goto L9
    }

    public void setBody(tz3 r1) {
        this.body = r1;
    }

    public void setRelativeUrl(Object r1) {
        this.relativeUrl = r1.toString();
    }

    public void addPart(vz2 r1) {
        uz2 r0 = this.multipartBuilder;
        r0.getClass();
        r1.getClass();
        r0.c.add(r1);
    }

    private static String canonicalizeForPath(String r6, boolean r7) {
        int r0 = r6.length();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L27;
        int r3 = r6.codePointAt(r2);
        if (r3 < 32) goto L17;
        if (r3 >= 127) goto L17;
        if (PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(r3) != (-1)) goto L17;
        if (r7 == true) goto L16;
        if (r3 == 47) goto L17;
        if (r3 == 37) goto L17;
    L16:
        r2 = r2 + Character.charCount(r3);
    L17:
        tv r4 = new tv();
        r4.e0(r6, 0, r2);
        canonicalizeForPath(r4, r6, r2, r0, r7);
        return r4.M();
    L27:
        return r6;
    }
}
