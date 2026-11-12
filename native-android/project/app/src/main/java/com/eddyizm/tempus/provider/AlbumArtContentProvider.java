package com.eddyizm.tempus.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import defpackage.t6;
import defpackage.ud3;
import defpackage.wg0;
import defpackage.xt3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class AlbumArtContentProvider extends ContentProvider {
    public static final /* synthetic */ int o = 0;
    public ExecutorService n;

    static {
        new UriMatcher(-1).addURI("app.homemusic.albumart.provider", "albumArt/*", 1);
    }

    public static Uri a(String str) {
        return new Uri.Builder().scheme("content").authority("app.homemusic.albumart.provider").appendPath("albumArt").appendPath(str).build();
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return "";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        this.n = Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors() / 2));
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        Uri uri2;
        File fileE;
        Context context = getContext();
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null || !lastPathSegment.startsWith("rl_")) {
            uri2 = (lastPathSegment == null || !lastPathSegment.startsWith("ir_")) ? Uri.parse(wg0.b(ud3.t(), lastPathSegment)) : Uri.parse(new String(Base64.decode(lastPathSegment.substring(3), 10)));
            fileE = null;
        } else {
            fileE = xt3.e(lastPathSegment.substring(3));
            uri2 = null;
        }
        try {
            ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
            this.n.execute(new t6(parcelFileDescriptorArrCreatePipe[1], fileE, context, uri2, 0));
            return parcelFileDescriptor;
        } catch (IOException e) {
            throw new FileNotFoundException("Could not create pipe: " + e.getMessage());
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        ExecutorService executorService = this.n;
        if (executorService != null) {
            executorService.shutdown();
            try {
                if (this.n.awaitTermination(5L, TimeUnit.SECONDS)) {
                    return;
                }
                this.n.shutdownNow();
            } catch (InterruptedException unused) {
                this.n.shutdownNow();
            }
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
