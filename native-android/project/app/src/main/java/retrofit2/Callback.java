package retrofit2;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface Callback<T> {
    void onFailure(Call<T> r1, Throwable r2);

    void onResponse(Call<T> r1, Response<T> r2);
}
