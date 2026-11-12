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
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
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
    private final nz3 requestBuilder = new nz3();

    @Nullable
    private fr1 urlBuilder;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern PATH_TRAVERSAL = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static class ContentTypeOverridingRequestBody extends tz3 {
        private final hu2 contentType;
        private final tz3 delegate;

        public ContentTypeOverridingRequestBody(tz3 tz3Var, hu2 hu2Var) {
            this.delegate = tz3Var;
            this.contentType = hu2Var;
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
        public void writeTo(ew ewVar) {
            this.delegate.writeTo(ewVar);
        }
    }

    public RequestBuilder(String str, gr1 gr1Var, @Nullable String str2, @Nullable tl1 tl1Var, @Nullable hu2 hu2Var, boolean z, boolean z2, boolean z3) {
        this.method = str;
        this.baseUrl = gr1Var;
        this.relativeUrl = str2;
        this.contentType = hu2Var;
        this.hasBody = z;
        if (tl1Var != null) {
            this.headersBuilder = tl1Var.d();
        } else {
            this.headersBuilder = new sl1();
        }
        if (z2) {
            this.formBuilder = new qb1();
        } else if (z3) {
            uz2 uz2Var = new uz2();
            this.multipartBuilder = uz2Var;
            uz2Var.c(wz2.f);
        }
    }

    private static void canonicalizeForPath(tv tvVar, String str, int i, int i2, boolean z) {
        tv tvVar2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (tvVar2 == null) {
                        tvVar2 = new tv();
                    }
                    tvVar2.f0(iCodePointAt);
                    while (!tvVar2.l()) {
                        byte b = tvVar2.readByte();
                        tvVar.Y(37);
                        char[] cArr = HEX_DIGITS;
                        tvVar.Y(cArr[((b & 255) >> 4) & 15]);
                        tvVar.Y(cArr[b & 15]);
                    }
                } else {
                    tvVar.f0(iCodePointAt);
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    public void addFormField(String str, String str2, boolean z) {
        qb1 qb1Var = this.formBuilder;
        if (z) {
            qb1Var.getClass();
            str.getClass();
            str2.getClass();
            qb1Var.a.add(fu.i(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            qb1Var.b.add(fu.i(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        qb1Var.getClass();
        str.getClass();
        str2.getClass();
        qb1Var.a.add(fu.i(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        qb1Var.b.add(fu.i(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public void addHeader(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                str2.getClass();
                this.contentType = ve5.a(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(xa3.g("Malformed content type: ", str2), e);
            }
        }
        sl1 sl1Var = this.headersBuilder;
        if (!z) {
            sl1Var.a(str, str2);
            return;
        }
        sl1Var.getClass();
        str.getClass();
        str2.getClass();
        e35.G(str);
        e35.p(sl1Var, str, str2);
    }

    public void addHeaders(tl1 tl1Var) {
        sl1 sl1Var = this.headersBuilder;
        sl1Var.getClass();
        tl1Var.getClass();
        int size = tl1Var.size();
        for (int i = 0; i < size; i++) {
            e35.p(sl1Var, tl1Var.b(i), tl1Var.e(i));
        }
    }

    public void addPart(tl1 tl1Var, tz3 tz3Var) {
        uz2 uz2Var = this.multipartBuilder;
        uz2Var.getClass();
        tz3Var.getClass();
        if ((tl1Var != null ? tl1Var.a("Content-Type") : null) != null) {
            kf2.n("Unexpected header: Content-Type");
            return;
        }
        if ((tl1Var != null ? tl1Var.a("Content-Length") : null) == null) {
            uz2Var.c.add(new vz2(tl1Var, tz3Var));
        } else {
            kf2.n("Unexpected header: Content-Length");
        }
    }

    public void addPathParam(String str, String str2, boolean z) {
        if (this.relativeUrl == null) {
            throw new AssertionError();
        }
        String strCanonicalizeForPath = canonicalizeForPath(str2, z);
        String strReplace = this.relativeUrl.replace("{" + str + "}", strCanonicalizeForPath);
        if (PATH_TRAVERSAL.matcher(strReplace).matches()) {
            kf2.n(xa3.g("@Path parameters shouldn't perform path traversal ('.' or '..'): ", str2));
        } else {
            this.relativeUrl = strReplace;
        }
    }

    public void addQueryParam(String str, @Nullable String str2, boolean z) {
        fr1 fr1Var;
        String str3 = this.relativeUrl;
        if (str3 != null) {
            gr1 gr1Var = this.baseUrl;
            gr1Var.getClass();
            try {
                fr1Var = new fr1();
                fr1Var.e(gr1Var, str3);
            } catch (IllegalArgumentException unused) {
                fr1Var = null;
            }
            this.urlBuilder = fr1Var;
            if (fr1Var == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.baseUrl);
                String str4 = this.relativeUrl;
                sb.append(", Relative: ");
                sb.append(str4);
                throw new IllegalArgumentException(sb.toString());
            }
            this.relativeUrl = null;
        }
        fr1 fr1Var2 = this.urlBuilder;
        if (!z) {
            fr1Var2.a(str, str2);
            return;
        }
        fr1Var2.getClass();
        str.getClass();
        if (fr1Var2.g == null) {
            fr1Var2.g = new ArrayList();
        }
        ArrayList arrayList = fr1Var2.g;
        arrayList.getClass();
        arrayList.add(fu.g(str, 0, 0, " \"'<>#&=", 83));
        ArrayList arrayList2 = fr1Var2.g;
        arrayList2.getClass();
        arrayList2.add(str2 != null ? fu.g(str2, 0, 0, " \"'<>#&=", 83) : null);
    }

    public <T> void addTag(Class<T> cls, @Nullable T t) {
        this.requestBuilder.c(cls, t);
    }

    public nz3 get() {
        fr1 fr1Var;
        gr1 gr1VarB;
        fr1 fr1Var2 = this.urlBuilder;
        if (fr1Var2 != null) {
            gr1VarB = fr1Var2.b();
        } else {
            gr1 gr1Var = this.baseUrl;
            String str = this.relativeUrl;
            gr1Var.getClass();
            str.getClass();
            try {
                fr1Var = new fr1();
                fr1Var.e(gr1Var, str);
            } catch (IllegalArgumentException unused) {
                fr1Var = null;
            }
            gr1VarB = fr1Var != null ? fr1Var.b() : null;
            if (gr1VarB == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.baseUrl);
                String str2 = this.relativeUrl;
                sb.append(", Relative: ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        tz3 contentTypeOverridingRequestBody = this.body;
        if (contentTypeOverridingRequestBody == null) {
            qb1 qb1Var = this.formBuilder;
            if (qb1Var != null) {
                contentTypeOverridingRequestBody = new rb1(qb1Var.a, qb1Var.b);
            } else {
                uz2 uz2Var = this.multipartBuilder;
                if (uz2Var != null) {
                    contentTypeOverridingRequestBody = uz2Var.b();
                } else if (this.hasBody) {
                    contentTypeOverridingRequestBody = tz3.create((hu2) null, new byte[0]);
                }
            }
        }
        hu2 hu2Var = this.contentType;
        if (hu2Var != null) {
            if (contentTypeOverridingRequestBody != null) {
                contentTypeOverridingRequestBody = new ContentTypeOverridingRequestBody(contentTypeOverridingRequestBody, hu2Var);
            } else {
                this.headersBuilder.a("Content-Type", hu2Var.a);
            }
        }
        nz3 nz3Var = this.requestBuilder;
        nz3Var.getClass();
        nz3Var.a = gr1VarB;
        nz3Var.c = this.headersBuilder.c().d();
        nz3Var.b(this.method, contentTypeOverridingRequestBody);
        return nz3Var;
    }

    public void setBody(tz3 tz3Var) {
        this.body = tz3Var;
    }

    public void setRelativeUrl(Object obj) {
        this.relativeUrl = obj.toString();
    }

    public void addPart(vz2 vz2Var) {
        uz2 uz2Var = this.multipartBuilder;
        uz2Var.getClass();
        vz2Var.getClass();
        uz2Var.c.add(vz2Var);
    }

    private static String canonicalizeForPath(String str, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt < 127 && PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(iCodePointAt) == -1 && (z || (iCodePointAt != 47 && iCodePointAt != 37))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                tv tvVar = new tv();
                tvVar.e0(str, 0, iCharCount);
                canonicalizeForPath(tvVar, str, iCharCount, length, z);
                return tvVar.M();
            }
        }
        return str;
    }
}
