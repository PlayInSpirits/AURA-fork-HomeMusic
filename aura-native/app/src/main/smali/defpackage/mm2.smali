.class public final Ldefpackage/mm2;
.super Landroid/os/Binder;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/ju1;


# instance fields
.field public final e:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ldefpackage/bm2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "androidx.media3.session.IMediaController"

    .line 5
    .line 6
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ldefpackage/mm2;->e:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    return-void
.end method

.method public static m(Landroid/os/IBinder;)Ldefpackage/ju1;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string v0, "androidx.media3.session.IMediaController"

    .line 6
    .line 7
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    instance-of v1, v0, Ldefpackage/ju1;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast v0, Ldefpackage/ju1;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_1
    new-instance v0, Ldefpackage/iu1;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p0, v0, Ldefpackage/iu1;->e:Landroid/os/IBinder;

    .line 26
    .line 27
    return-object v0
.end method


# virtual methods
.method public final C(ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    invoke-static {p2}, Ldefpackage/za4;->b(Landroid/os/Bundle;)Ldefpackage/za4;

    .line 5
    .line 6
    .line 7
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    new-instance p2, Ldefpackage/cn;

    .line 9
    .line 10
    const/16 v0, 0x1a

    .line 11
    .line 12
    invoke-direct {p2, v0, p1}, Ldefpackage/cn;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p2}, Ldefpackage/mm2;->U(Ldefpackage/lm2;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catch_0
    move-exception p0

    .line 20
    const-string p1, "MediaControllerStub"

    .line 21
    .line 22
    const-string p2, "Ignoring malformed Bundle for SessionPositionInfo"

    .line 23
    .line 24
    invoke-static {p1, p2, p0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final E(ILandroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "MediaControllerStub"

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    invoke-static {p2}, Ldefpackage/va4;->a(Landroid/os/Bundle;)Ldefpackage/va4;

    .line 9
    .line 10
    .line 11
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    new-instance v0, Ldefpackage/q31;

    .line 13
    .line 14
    invoke-direct {v0, p1, p2, p3}, Ldefpackage/q31;-><init>(ILdefpackage/va4;Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ldefpackage/mm2;->U(Ldefpackage/lm2;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception p0

    .line 22
    const-string p1, "Ignoring malformed Bundle for SessionCommand"

    .line 23
    .line 24
    invoke-static {v0, p1, p0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :goto_0
    const-string p0, "Ignoring custom command with null args."

    .line 29
    .line 30
    invoke-static {v0, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final I(ILandroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    const-string p1, "MediaControllerStub"

    .line 2
    .line 3
    if-eqz p2, :cond_2

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ldefpackage/mm2;->X()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, -0x1

    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    invoke-static {v0, p2}, Ldefpackage/lk3;->r(ILandroid/os/Bundle;)Ldefpackage/lk3;

    .line 17
    .line 18
    .line 19
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 20
    :try_start_1
    new-instance v0, Ldefpackage/jk3;

    .line 21
    .line 22
    sget-object v1, Ldefpackage/jk3;->d:Ljava/lang/String;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-virtual {p3, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    sget-object v3, Ldefpackage/jk3;->e:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p3, v3, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    invoke-direct {v0, v1, p3}, Ldefpackage/jk3;-><init>(ZZ)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 36
    .line 37
    .line 38
    new-instance p1, Ldefpackage/ef0;

    .line 39
    .line 40
    const/16 p3, 0x12

    .line 41
    .line 42
    invoke-direct {p1, p3, p2, v0}, Ldefpackage/ef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1}, Ldefpackage/mm2;->U(Ldefpackage/lm2;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catch_0
    move-exception p0

    .line 50
    const-string p2, "Ignoring malformed Bundle for BundlingExclusions"

    .line 51
    .line 52
    invoke-static {p1, p2, p0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catch_1
    move-exception p0

    .line 57
    const-string p2, "Ignoring malformed Bundle for PlayerInfo"

    .line 58
    .line 59
    invoke-static {p1, p2, p0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    :goto_0
    return-void
.end method

.method public final I0(ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    invoke-static {p2}, Ldefpackage/ab4;->a(Landroid/os/Bundle;)Ldefpackage/ab4;

    .line 5
    .line 6
    .line 7
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    invoke-virtual {p0, p1, p2}, Ldefpackage/mm2;->K0(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception p0

    .line 13
    const-string p1, "MediaControllerStub"

    .line 14
    .line 15
    const-string p2, "Ignoring malformed Bundle for SessionResult"

    .line 16
    .line 17
    invoke-static {p1, p2, p0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final K0(ILjava/lang/Object;)V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    :try_start_0
    iget-object p0, p0, Ldefpackage/mm2;->e:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ldefpackage/bm2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    :try_start_1
    iget-object v2, p0, Ldefpackage/bm2;->b:Ldefpackage/yk;

    .line 20
    .line 21
    invoke-virtual {v2, p1, p2}, Ldefpackage/yk;->y(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    new-instance v2, Ldefpackage/ul;

    .line 29
    .line 30
    const/4 v3, 0x4

    .line 31
    invoke-direct {v2, p1, v3, p0}, Ldefpackage/ul;-><init>(IILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, v2}, Ldefpackage/sk2;->a1(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 43
    .line 44
    .line 45
    throw p0
.end method

.method public final O(ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    invoke-static {p2}, Ldefpackage/m92;->a(Landroid/os/Bundle;)Ldefpackage/m92;

    .line 5
    .line 6
    .line 7
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    invoke-virtual {p0, p1, p2}, Ldefpackage/mm2;->K0(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception p0

    .line 13
    const-string p1, "MediaControllerStub"

    .line 14
    .line 15
    const-string p2, "Ignoring malformed Bundle for LibraryResult"

    .line 16
    .line 17
    invoke-static {p1, p2, p0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final U(Ldefpackage/lm2;)V
    .locals 5

    .line 1
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    :try_start_0
    iget-object p0, p0, Ldefpackage/mm2;->e:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Ldefpackage/bm2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Ldefpackage/bm2;->f1()Ldefpackage/sk2;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v2, v2, Ldefpackage/sk2;->f:Landroid/os/Handler;

    .line 24
    .line 25
    new-instance v3, Ldefpackage/ws1;

    .line 26
    .line 27
    const/16 v4, 0xe

    .line 28
    .line 29
    invoke-direct {v3, v4, p0, p1}, Ldefpackage/ws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v3}, Ldefpackage/f35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    invoke-static {v0, v1}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 41
    .line 42
    .line 43
    throw p0
.end method

.method public final X()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/mm2;->e:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/bm2;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p0, p0, Ldefpackage/bm2;->n:Ldefpackage/cb4;

    .line 13
    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    :goto_0
    const/4 p0, -0x1

    .line 17
    return p0

    .line 18
    :cond_1
    iget-object p0, p0, Ldefpackage/cb4;->a:Ldefpackage/bb4;

    .line 19
    .line 20
    invoke-interface {p0}, Ldefpackage/bb4;->f()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final c()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/er1;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldefpackage/er1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ldefpackage/mm2;->U(Ldefpackage/lm2;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final e(I)V
    .locals 1

    .line 1
    new-instance p1, Ldefpackage/er1;

    .line 2
    .line 3
    const/16 v0, 0x16

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ldefpackage/er1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldefpackage/mm2;->U(Ldefpackage/lm2;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final i(III)V
    .locals 1

    .line 1
    new-instance p1, Ldefpackage/v31;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-direct {p1, p2, p3, v0}, Ldefpackage/v31;-><init>(III)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ldefpackage/mm2;->U(Ldefpackage/lm2;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final n(Ljava/util/List;I)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ldefpackage/mm2;->X()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, -0x1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    :goto_0
    return-void

    .line 12
    :cond_1
    invoke-static {}, Ldefpackage/yw1;->j()Ldefpackage/uw1;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-ge v2, v3, :cond_2

    .line 22
    .line 23
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Landroid/os/Bundle;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v3}, Ldefpackage/j60;->i(ILandroid/os/Bundle;)Ldefpackage/j60;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v1, v3}, Ldefpackage/pw1;->c(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-virtual {v1}, Ldefpackage/uw1;->f()Ldefpackage/gy3;

    .line 43
    .line 44
    .line 45
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    new-instance v0, Ldefpackage/q31;

    .line 47
    .line 48
    const/4 v1, 0x2

    .line 49
    invoke-direct {v0, p2, p1, v1}, Ldefpackage/q31;-><init>(ILdefpackage/gy3;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, Ldefpackage/mm2;->U(Ldefpackage/lm2;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catch_0
    move-exception p0

    .line 57
    const-string p1, "MediaControllerStub"

    .line 58
    .line 59
    const-string p2, "Ignoring malformed Bundle for CommandButton"

    .line 60
    .line 61
    invoke-static {p1, p2, p0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 4

    .line 1
    const-string v0, "androidx.media3.session.IMediaController"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-lt p1, v1, :cond_0

    .line 5
    .line 6
    const v2, 0xffffff

    .line 7
    .line 8
    .line 9
    if-gt p1, v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const v2, 0x5f4e5446

    .line 15
    .line 16
    .line 17
    if-ne p1, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return v1

    .line 23
    :cond_1
    const/16 v0, 0xfa1

    .line 24
    .line 25
    if-eq p1, v0, :cond_c

    .line 26
    .line 27
    const/16 v0, 0xfa2

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const-string v3, "MediaControllerStub"

    .line 31
    .line 32
    if-eq p1, v0, :cond_7

    .line 33
    .line 34
    packed-switch p1, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0

    .line 42
    :pswitch_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    invoke-virtual {p0, p1, p3, p2}, Ldefpackage/mm2;->i(III)V

    .line 55
    .line 56
    .line 57
    return v1

    .line 58
    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    sget-object p3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 63
    .line 64
    invoke-static {p2, p3}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p4

    .line 68
    check-cast p4, Landroid/os/Bundle;

    .line 69
    .line 70
    invoke-static {p2, p3}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, Landroid/os/Bundle;

    .line 75
    .line 76
    invoke-static {p2, p3}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    check-cast p2, Landroid/os/Bundle;

    .line 81
    .line 82
    if-eqz p4, :cond_3

    .line 83
    .line 84
    if-nez v0, :cond_2

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    :try_start_0
    invoke-static {p4}, Ldefpackage/va4;->a(Landroid/os/Bundle;)Ldefpackage/va4;

    .line 88
    .line 89
    .line 90
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    new-instance p4, Ldefpackage/ij0;

    .line 92
    .line 93
    invoke-direct {p4, p1, p3, v0, p2}, Ldefpackage/ij0;-><init>(ILdefpackage/va4;Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, p4}, Ldefpackage/mm2;->U(Ldefpackage/lm2;)V

    .line 97
    .line 98
    .line 99
    goto/16 :goto_2

    .line 100
    .line 101
    :catch_0
    move-exception p0

    .line 102
    const-string p1, "Ignoring malformed Bundle for SessionCommand"

    .line 103
    .line 104
    invoke-static {v3, p1, p0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_2

    .line 108
    .line 109
    :cond_3
    :goto_0
    const-string p0, "Ignoring custom command progress update with null args."

    .line 110
    .line 111
    invoke-static {v3, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto/16 :goto_2

    .line 115
    .line 116
    :pswitch_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    sget-object p3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 121
    .line 122
    invoke-virtual {p2, p3}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-virtual {p0, p2, p1}, Ldefpackage/mm2;->n(Ljava/util/List;I)V

    .line 127
    .line 128
    .line 129
    return v1

    .line 130
    :pswitch_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 131
    .line 132
    .line 133
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 134
    .line 135
    invoke-static {p2, p1}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    check-cast p1, Landroid/os/Bundle;

    .line 140
    .line 141
    :try_start_1
    invoke-static {p1}, Ldefpackage/xa4;->a(Landroid/os/Bundle;)Ldefpackage/xa4;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 142
    .line 143
    .line 144
    new-instance p1, Ldefpackage/er1;

    .line 145
    .line 146
    const/16 p2, 0x15

    .line 147
    .line 148
    invoke-direct {p1, p2}, Ldefpackage/er1;-><init>(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, p1}, Ldefpackage/mm2;->U(Ldefpackage/lm2;)V

    .line 152
    .line 153
    .line 154
    goto/16 :goto_2

    .line 155
    .line 156
    :catch_1
    move-exception p0

    .line 157
    const-string p1, "Ignoring malformed Bundle for SessionError"

    .line 158
    .line 159
    invoke-static {v3, p1, p0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 160
    .line 161
    .line 162
    goto/16 :goto_2

    .line 163
    .line 164
    :pswitch_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    sget-object p3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 169
    .line 170
    invoke-static {p2, p3}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    check-cast p2, Landroid/app/PendingIntent;

    .line 175
    .line 176
    new-instance p3, Ldefpackage/cn;

    .line 177
    .line 178
    invoke-direct {p3, p1, p2}, Ldefpackage/cn;-><init>(ILandroid/app/PendingIntent;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0, p3}, Ldefpackage/mm2;->U(Ldefpackage/lm2;)V

    .line 182
    .line 183
    .line 184
    return v1

    .line 185
    :pswitch_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    sget-object p3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 190
    .line 191
    invoke-static {p2, p3}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p4

    .line 195
    check-cast p4, Landroid/os/Bundle;

    .line 196
    .line 197
    invoke-static {p2, p3}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    check-cast p2, Landroid/os/Bundle;

    .line 202
    .line 203
    invoke-virtual {p0, p1, p4, p2}, Ldefpackage/mm2;->I(ILandroid/os/Bundle;Landroid/os/Bundle;)V

    .line 204
    .line 205
    .line 206
    return v1

    .line 207
    :pswitch_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 208
    .line 209
    .line 210
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 211
    .line 212
    invoke-static {p2, p1}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    check-cast p1, Landroid/os/Bundle;

    .line 217
    .line 218
    invoke-static {p1}, Ldefpackage/f35;->n(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    if-nez p1, :cond_4

    .line 223
    .line 224
    const-string p0, "Ignoring null Bundle for extras"

    .line 225
    .line 226
    invoke-static {v3, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    return v1

    .line 230
    :cond_4
    new-instance p2, Ldefpackage/cn;

    .line 231
    .line 232
    const/16 p3, 0x1c

    .line 233
    .line 234
    invoke-direct {p2, p3, p1}, Ldefpackage/cn;-><init>(ILjava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0, p2}, Ldefpackage/mm2;->U(Ldefpackage/lm2;)V

    .line 238
    .line 239
    .line 240
    return v1

    .line 241
    :pswitch_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    invoke-virtual {p0, p1}, Ldefpackage/mm2;->e(I)V

    .line 246
    .line 247
    .line 248
    return v1

    .line 249
    :pswitch_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 250
    .line 251
    .line 252
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 253
    .line 254
    invoke-static {p2, p1}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p3

    .line 258
    check-cast p3, Landroid/os/Bundle;

    .line 259
    .line 260
    invoke-static {p2, p1}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    check-cast p1, Landroid/os/Bundle;

    .line 265
    .line 266
    if-eqz p3, :cond_b

    .line 267
    .line 268
    if-nez p1, :cond_5

    .line 269
    .line 270
    goto/16 :goto_2

    .line 271
    .line 272
    :cond_5
    :try_start_2
    invoke-static {p3}, Ldefpackage/wa4;->a(Landroid/os/Bundle;)Ldefpackage/wa4;

    .line 273
    .line 274
    .line 275
    move-result-object p2
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3

    .line 276
    :try_start_3
    invoke-static {p1}, Ldefpackage/mi3;->b(Landroid/os/Bundle;)Ldefpackage/mi3;

    .line 277
    .line 278
    .line 279
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2

    .line 280
    new-instance p3, Ldefpackage/ef0;

    .line 281
    .line 282
    const/16 p4, 0x13

    .line 283
    .line 284
    invoke-direct {p3, p4, p2, p1}, Ldefpackage/ef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p0, p3}, Ldefpackage/mm2;->U(Ldefpackage/lm2;)V

    .line 288
    .line 289
    .line 290
    goto/16 :goto_2

    .line 291
    .line 292
    :catch_2
    move-exception p0

    .line 293
    const-string p1, "Ignoring malformed Bundle for Commands"

    .line 294
    .line 295
    invoke-static {v3, p1, p0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 296
    .line 297
    .line 298
    goto/16 :goto_2

    .line 299
    .line 300
    :catch_3
    move-exception p0

    .line 301
    const-string p1, "Ignoring malformed Bundle for SessionCommands"

    .line 302
    .line 303
    invoke-static {v3, p1, p0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 304
    .line 305
    .line 306
    goto/16 :goto_2

    .line 307
    .line 308
    :pswitch_9
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 309
    .line 310
    .line 311
    move-result p1

    .line 312
    sget-object p3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 313
    .line 314
    invoke-static {p2, p3}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object p2

    .line 318
    check-cast p2, Landroid/os/Bundle;

    .line 319
    .line 320
    invoke-virtual {p0, p1, p2}, Ldefpackage/mm2;->z(ILandroid/os/Bundle;)V

    .line 321
    .line 322
    .line 323
    return v1

    .line 324
    :pswitch_a
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 325
    .line 326
    .line 327
    move-result p1

    .line 328
    sget-object p3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 329
    .line 330
    invoke-static {p2, p3}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object p2

    .line 334
    check-cast p2, Landroid/os/Bundle;

    .line 335
    .line 336
    invoke-virtual {p0, p1, p2}, Ldefpackage/mm2;->C(ILandroid/os/Bundle;)V

    .line 337
    .line 338
    .line 339
    return v1

    .line 340
    :pswitch_b
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 341
    .line 342
    .line 343
    move-result p1

    .line 344
    sget-object p3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 345
    .line 346
    invoke-static {p2, p3}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object p3

    .line 350
    check-cast p3, Landroid/os/Bundle;

    .line 351
    .line 352
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 353
    .line 354
    .line 355
    move-result p2

    .line 356
    if-eqz p2, :cond_6

    .line 357
    .line 358
    move v2, v1

    .line 359
    :cond_6
    invoke-virtual {p0, p1, p3, v2}, Ldefpackage/mm2;->u0(ILandroid/os/Bundle;Z)V

    .line 360
    .line 361
    .line 362
    return v1

    .line 363
    :pswitch_c
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 364
    .line 365
    .line 366
    invoke-virtual {p0}, Ldefpackage/mm2;->c()V

    .line 367
    .line 368
    .line 369
    return v1

    .line 370
    :pswitch_d
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 371
    .line 372
    .line 373
    move-result p1

    .line 374
    sget-object p3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 375
    .line 376
    invoke-static {p2, p3}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object p4

    .line 380
    check-cast p4, Landroid/os/Bundle;

    .line 381
    .line 382
    invoke-static {p2, p3}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object p2

    .line 386
    check-cast p2, Landroid/os/Bundle;

    .line 387
    .line 388
    invoke-virtual {p0, p1, p4, p2}, Ldefpackage/mm2;->E(ILandroid/os/Bundle;Landroid/os/Bundle;)V

    .line 389
    .line 390
    .line 391
    return v1

    .line 392
    :pswitch_e
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 393
    .line 394
    .line 395
    move-result p1

    .line 396
    sget-object p3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 397
    .line 398
    invoke-virtual {p2, p3}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 399
    .line 400
    .line 401
    move-result-object p2

    .line 402
    invoke-virtual {p0, p2, p1}, Ldefpackage/mm2;->s0(Ljava/util/List;I)V

    .line 403
    .line 404
    .line 405
    return v1

    .line 406
    :pswitch_f
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 407
    .line 408
    .line 409
    move-result p1

    .line 410
    sget-object p3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 411
    .line 412
    invoke-static {p2, p3}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object p2

    .line 416
    check-cast p2, Landroid/os/Bundle;

    .line 417
    .line 418
    invoke-virtual {p0, p1, p2}, Ldefpackage/mm2;->O(ILandroid/os/Bundle;)V

    .line 419
    .line 420
    .line 421
    return v1

    .line 422
    :pswitch_10
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 423
    .line 424
    .line 425
    move-result p1

    .line 426
    sget-object p3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 427
    .line 428
    invoke-static {p2, p3}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object p2

    .line 432
    check-cast p2, Landroid/os/Bundle;

    .line 433
    .line 434
    invoke-virtual {p0, p1, p2}, Ldefpackage/mm2;->I0(ILandroid/os/Bundle;)V

    .line 435
    .line 436
    .line 437
    return v1

    .line 438
    :pswitch_11
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 439
    .line 440
    .line 441
    move-result p1

    .line 442
    sget-object p3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 443
    .line 444
    invoke-static {p2, p3}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object p2

    .line 448
    check-cast p2, Landroid/os/Bundle;

    .line 449
    .line 450
    invoke-virtual {p0, p1, p2}, Ldefpackage/mm2;->r(ILandroid/os/Bundle;)V

    .line 451
    .line 452
    .line 453
    return v1

    .line 454
    :cond_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 455
    .line 456
    .line 457
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object p1

    .line 461
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 462
    .line 463
    .line 464
    move-result p3

    .line 465
    sget-object p4, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 466
    .line 467
    invoke-static {p2, p4}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object p2

    .line 471
    check-cast p2, Landroid/os/Bundle;

    .line 472
    .line 473
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 474
    .line 475
    .line 476
    move-result p4

    .line 477
    if-eqz p4, :cond_8

    .line 478
    .line 479
    const-string p0, "onSearchResultChanged(): Ignoring empty query"

    .line 480
    .line 481
    invoke-static {v3, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    goto :goto_2

    .line 485
    :cond_8
    if-gez p3, :cond_9

    .line 486
    .line 487
    const-string p0, "onSearchResultChanged(): Ignoring negative itemCount: "

    .line 488
    .line 489
    invoke-static {p3, p0, v3}, Ldefpackage/xa3;->m(ILjava/lang/String;Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    goto :goto_2

    .line 493
    :cond_9
    if-nez p2, :cond_a

    .line 494
    .line 495
    const/4 p2, 0x0

    .line 496
    goto :goto_1

    .line 497
    :cond_a
    :try_start_4
    invoke-static {p2}, Ldefpackage/jn2;->a(Landroid/os/Bundle;)Ldefpackage/jn2;

    .line 498
    .line 499
    .line 500
    move-result-object p2
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_4

    .line 501
    :goto_1
    new-instance p4, Ldefpackage/jm2;

    .line 502
    .line 503
    invoke-direct {p4, p1, p3, p2, v2}, Ldefpackage/jm2;-><init>(Ljava/lang/String;ILdefpackage/jn2;I)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {p0, p4}, Ldefpackage/mm2;->U(Ldefpackage/lm2;)V

    .line 507
    .line 508
    .line 509
    goto :goto_2

    .line 510
    :catch_4
    move-exception p0

    .line 511
    const-string p1, "Ignoring malformed Bundle for LibraryParams"

    .line 512
    .line 513
    invoke-static {v3, p1, p0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 514
    .line 515
    .line 516
    :cond_b
    :goto_2
    return v1

    .line 517
    :cond_c
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 518
    .line 519
    .line 520
    move-result p1

    .line 521
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object p3

    .line 525
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 526
    .line 527
    .line 528
    move-result p4

    .line 529
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 530
    .line 531
    invoke-static {p2, v0}, Ldefpackage/gh0;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object p2

    .line 535
    check-cast p2, Landroid/os/Bundle;

    .line 536
    .line 537
    invoke-virtual {p0, p1, p3, p4, p2}, Ldefpackage/mm2;->w0(ILjava/lang/String;ILandroid/os/Bundle;)V

    .line 538
    .line 539
    .line 540
    return v1

    .line 541
    :pswitch_data_0
    .packed-switch 0xbb9
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    invoke-static {p2}, Ldefpackage/oa0;->a(Landroid/os/Bundle;)Ldefpackage/oa0;

    .line 5
    .line 6
    .line 7
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    new-instance p2, Ldefpackage/cn;

    .line 9
    .line 10
    const/16 v0, 0x19

    .line 11
    .line 12
    invoke-direct {p2, v0, p1}, Ldefpackage/cn;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p2}, Ldefpackage/mm2;->U(Ldefpackage/lm2;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catch_0
    move-exception p1

    .line 20
    const-string p2, "MediaControllerStub"

    .line 21
    .line 22
    const-string v0, "Malformed Bundle for ConnectionResult. Disconnected from the session."

    .line 23
    .line 24
    invoke-static {p2, v0, p1}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ldefpackage/mm2;->c()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final s0(Ljava/util/List;I)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ldefpackage/mm2;->X()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, -0x1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    :goto_0
    return-void

    .line 12
    :cond_1
    invoke-static {}, Ldefpackage/yw1;->j()Ldefpackage/uw1;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-ge v2, v3, :cond_2

    .line 22
    .line 23
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Landroid/os/Bundle;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v3}, Ldefpackage/j60;->i(ILandroid/os/Bundle;)Ldefpackage/j60;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v1, v3}, Ldefpackage/pw1;->c(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-virtual {v1}, Ldefpackage/uw1;->f()Ldefpackage/gy3;

    .line 43
    .line 44
    .line 45
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    new-instance v0, Ldefpackage/q31;

    .line 47
    .line 48
    const/4 v1, 0x3

    .line 49
    invoke-direct {v0, p2, p1, v1}, Ldefpackage/q31;-><init>(ILdefpackage/gy3;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, Ldefpackage/mm2;->U(Ldefpackage/lm2;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catch_0
    move-exception p0

    .line 57
    const-string p1, "MediaControllerStub"

    .line 58
    .line 59
    const-string p2, "Ignoring malformed Bundle for CommandButton"

    .line 60
    .line 61
    invoke-static {p1, p2, p0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final u0(ILandroid/os/Bundle;Z)V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/jk3;

    .line 2
    .line 3
    new-instance v0, Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object v1, Ldefpackage/jk3;->d:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, p3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    sget-object p3, Ldefpackage/jk3;->e:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {v0, p3, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1, p2, v0}, Ldefpackage/mm2;->I(ILandroid/os/Bundle;Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final w0(ILjava/lang/String;ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const-string v0, "MediaControllerStub"

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const-string p0, "onChildrenChanged(): Ignoring empty parentId"

    .line 10
    .line 11
    invoke-static {v0, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    if-gez p3, :cond_1

    .line 16
    .line 17
    const-string p0, "onChildrenChanged(): Ignoring negative itemCount: "

    .line 18
    .line 19
    invoke-static {p3, p0, v0}, Ldefpackage/xa3;->m(ILjava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    if-nez p4, :cond_2

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    goto :goto_0

    .line 27
    :cond_2
    :try_start_0
    invoke-static {p4}, Ldefpackage/jn2;->a(Landroid/os/Bundle;)Ldefpackage/jn2;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    :goto_0
    new-instance p4, Ldefpackage/jm2;

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    invoke-direct {p4, p2, p3, p1, v0}, Ldefpackage/jm2;-><init>(Ljava/lang/String;ILdefpackage/jn2;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p4}, Ldefpackage/mm2;->U(Ldefpackage/lm2;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catch_0
    move-exception p0

    .line 42
    const-string p1, "Ignoring malformed Bundle for LibraryParams"

    .line 43
    .line 44
    invoke-static {v0, p1, p0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final z(ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    invoke-static {p2}, Ldefpackage/mi3;->b(Landroid/os/Bundle;)Ldefpackage/mi3;

    .line 5
    .line 6
    .line 7
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    new-instance p2, Ldefpackage/km2;

    .line 9
    .line 10
    invoke-direct {p2, p1}, Ldefpackage/km2;-><init>(Ldefpackage/mi3;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p2}, Ldefpackage/mm2;->U(Ldefpackage/lm2;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception p0

    .line 18
    const-string p1, "MediaControllerStub"

    .line 19
    .line 20
    const-string p2, "Ignoring malformed Bundle for Commands"

    .line 21
    .line 22
    invoke-static {p1, p2, p0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
