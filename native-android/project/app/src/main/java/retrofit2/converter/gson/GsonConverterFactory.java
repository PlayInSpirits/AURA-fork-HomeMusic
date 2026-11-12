package retrofit2.converter.gson;

import com.google.gson.reflect.TypeToken;
import defpackage.bz4;
import defpackage.n14;
import defpackage.nk1;
import defpackage.nz2;
import defpackage.tz3;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class GsonConverterFactory extends Converter.Factory {
    private final nk1 gson;

    private GsonConverterFactory(nk1 r1) {
        this.gson = r1;
    }

    public static GsonConverterFactory create(nk1 r1) {
        if (r1 != null) goto L4;
        nz2.n("gson == null");
        return null;
    L4:
        return new GsonConverterFactory(r1);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, tz3> requestBodyConverter(Type r1, Annotation[] r2, Annotation[] r3, Retrofit r4) {
        bz4 r5 = this.gson.g(TypeToken.get(r1));
        return new GsonRequestBodyConverter(this.gson, r5);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<n14, ?> responseBodyConverter(Type r1, Annotation[] r2, Retrofit r3) {
        bz4 r4 = this.gson.g(TypeToken.get(r1));
        return new GsonResponseBodyConverter(this.gson, r4);
    }

    public static GsonConverterFactory create() {
        return create(new nk1());
    }
}
