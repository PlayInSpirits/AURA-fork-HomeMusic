package retrofit2.converter.gson;

import defpackage.bz4;
import defpackage.hu2;
import defpackage.nk1;
import defpackage.q32;
import defpackage.sv;
import defpackage.tv;
import defpackage.tz3;
import defpackage.ve5;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import retrofit2.Converter;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, tz3> {
    private static final hu2 MEDIA_TYPE = ve5.a("application/json; charset=UTF-8");
    private final bz4 adapter;
    private final nk1 gson;

    public GsonRequestBodyConverter(nk1 nk1Var, bz4 bz4Var) {
        this.gson = nk1Var;
        this.adapter = bz4Var;
    }

    @Override // retrofit2.Converter
    public tz3 convert(T t) throws IOException {
        tv tvVar = new tv();
        q32 q32VarI = this.gson.i(new OutputStreamWriter(new sv(tvVar), StandardCharsets.UTF_8));
        this.adapter.b(q32VarI, t);
        q32VarI.close();
        return tz3.create(MEDIA_TYPE, tvVar.g(tvVar.o));
    }
}
