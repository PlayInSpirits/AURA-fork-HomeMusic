package androidx.media3.datasource;

import java.io.IOException;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class DataSourceException extends IOException {
    public final int n;

    public DataSourceException(int i) {
        this.n = i;
    }

    public DataSourceException(Exception exc, int i) {
        super(exc);
        this.n = i;
    }

    public DataSourceException(int i, String str) {
        super(str);
        this.n = i;
    }

    public DataSourceException(String str, Exception exc, int i) {
        super(str, exc);
        this.n = i;
    }
}
