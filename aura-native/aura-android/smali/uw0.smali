.class public final Luw0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lww0;


# virtual methods
.method public final c(Lsw0;Ltb1;)Lpw0;
    .locals 1

    .line 1
    iget-object p0, p2, Ltb1;->r:Low0;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    new-instance p0, Lf21;

    .line 8
    .line 9
    new-instance p1, Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    .line 10
    .line 11
    new-instance p2, Landroidx/media3/exoplayer/drm/UnsupportedDrmException;

    .line 12
    .line 13
    invoke-direct {p2}, Ljava/lang/Exception;-><init>()V

    .line 14
    .line 15
    .line 16
    const/16 v0, 0x1771

    .line 17
    .line 18
    invoke-direct {p1, p2, v0}, Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;-><init>(Ljava/lang/Throwable;I)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1}, Lf21;-><init>(Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;)V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public final e(Landroid/os/Looper;Lik3;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final f(Ltb1;)I
    .locals 0

    .line 1
    iget-object p0, p1, Ltb1;->r:Low0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method
