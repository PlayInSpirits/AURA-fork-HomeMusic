package retrofit2.converter.gson;

import com.google.gson.reflect.TypeToken;
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

    private GsonConverterFactory(nk1 nk1Var) {
        this.gson = nk1Var;
    }

    public static GsonConverterFactory create(nk1 nk1Var) {
        if (nk1Var != null) {
            return new GsonConverterFactory(nk1Var);
        }
        nz2.n("gson == null");
        return null;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, tz3> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new GsonRequestBodyConverter(this.gson, this.gson.g(TypeToken.get(type)));
    }

    @Override // retrofit2.Converter.Factory
    public Converter<n14, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new GsonResponseBodyConverter(this.gson, this.gson.g(TypeToken.get(type)));
    }

    public static GsonConverterFactory create() {
        return create(new nk1());
    }
}
