package retrofit2.converter.gson;

import defpackage.bz4;
import defpackage.hu2;
import defpackage.nk1;
import defpackage.q32;
import defpackage.sv;
import defpackage.tv;
import defpackage.tz3;
import defpackage.ve5;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import retrofit2.Converter;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, tz3> {
    private static final hu2 MEDIA_TYPE = null;
    private final bz4 adapter;
    private final nk1 gson;

    static {
        MEDIA_TYPE = ve5.a("application/json; charset=UTF-8");
    }

    public GsonRequestBodyConverter(nk1 r1, bz4 r2) {
        this.gson = r1;
        this.adapter = r2;
    }

    @Override // retrofit2.Converter
    /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
    public tz3 convert2(T r5) {
        tv r0 = new tv();
        OutputStreamWriter r1 = new OutputStreamWriter(new sv(r0), StandardCharsets.UTF_8);
        q32 r2 = this.gson.i(r1);
        this.adapter.b(r2, r5);
        r2.close();
        return tz3.create(MEDIA_TYPE, r0.g(r0.o));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ tz3 convert(Object r1) {
        return convert2(r1);
    }
}
