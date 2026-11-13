package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {
    private final LocalBinder binder = new LocalBinder();

    /* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public final class LocalBinder extends Binder {
        public LocalBinder() {
        }

        public final CredentialProviderMetadataHolder getService() {
            return CredentialProviderMetadataHolder.this;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getClass();
        return this.binder;
    }
}
