.class public final Ldefpackage/kk0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/ww0;


# instance fields
.field public final b:Ljava/util/UUID;

.field public final c:Ldefpackage/mj0;

.field public final d:Ldefpackage/ll;

.field public final e:Ljava/util/HashMap;

.field public final f:Z

.field public final g:[I

.field public final h:Z

.field public final i:Ldefpackage/qr2;

.field public final j:Ldefpackage/i80;

.field public final k:Ldefpackage/d34;

.field public final l:J

.field public final m:Ljava/util/ArrayList;

.field public final n:Ljava/util/Set;

.field public final o:Ljava/util/Set;

.field public p:I

.field public q:Ldefpackage/m31;

.field public r:Ldefpackage/ik0;

.field public s:Ldefpackage/ik0;

.field public t:Landroid/os/Looper;

.field public u:Landroid/os/Handler;

.field public v:[B

.field public w:Ldefpackage/ik3;

.field public volatile x:Ldefpackage/zk;


# direct methods
.method public constructor <init>(Ljava/util/UUID;Ldefpackage/ll;Ljava/util/HashMap;Z[IZLdefpackage/i80;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Ldefpackage/ax;->b:Ljava/util/UUID;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    xor-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    const-string v1, "Use C.CLEARKEY_UUID instead"

    .line 16
    .line 17
    invoke-static {v1, v0}, Ldefpackage/rr2;->k(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Ldefpackage/kk0;->b:Ljava/util/UUID;

    .line 21
    .line 22
    sget-object p1, Ldefpackage/ue1;->r:Ldefpackage/mj0;

    .line 23
    .line 24
    iput-object p1, p0, Ldefpackage/kk0;->c:Ldefpackage/mj0;

    .line 25
    .line 26
    iput-object p2, p0, Ldefpackage/kk0;->d:Ldefpackage/ll;

    .line 27
    .line 28
    iput-object p3, p0, Ldefpackage/kk0;->e:Ljava/util/HashMap;

    .line 29
    .line 30
    iput-boolean p4, p0, Ldefpackage/kk0;->f:Z

    .line 31
    .line 32
    iput-object p5, p0, Ldefpackage/kk0;->g:[I

    .line 33
    .line 34
    iput-boolean p6, p0, Ldefpackage/kk0;->h:Z

    .line 35
    .line 36
    iput-object p7, p0, Ldefpackage/kk0;->j:Ldefpackage/i80;

    .line 37
    .line 38
    new-instance p1, Ldefpackage/qr2;

    .line 39
    .line 40
    const/4 p2, 0x6

    .line 41
    invoke-direct {p1, p2}, Ldefpackage/qr2;-><init>(I)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Ldefpackage/kk0;->i:Ldefpackage/qr2;

    .line 45
    .line 46
    new-instance p1, Ldefpackage/d34;

    .line 47
    .line 48
    const/16 p2, 0x13

    .line 49
    .line 50
    invoke-direct {p1, p2, p0}, Ldefpackage/d34;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Ldefpackage/kk0;->k:Ldefpackage/d34;

    .line 54
    .line 55
    new-instance p1, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Ldefpackage/kk0;->m:Ljava/util/ArrayList;

    .line 61
    .line 62
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, Ldefpackage/kk0;->n:Ljava/util/Set;

    .line 72
    .line 73
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 74
    .line 75
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iput-object p1, p0, Ldefpackage/kk0;->o:Ljava/util/Set;

    .line 83
    .line 84
    const-wide/32 p1, 0x493e0

    .line 85
    .line 86
    .line 87
    iput-wide p1, p0, Ldefpackage/kk0;->l:J

    .line 88
    .line 89
    return-void
.end method

.method public static h(Ldefpackage/ik0;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/ik0;->o()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Ldefpackage/ik0;->p:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ldefpackage/ik0;->g()Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    instance-of v0, p0, Landroid/media/ResourceBusyException;

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    invoke-static {p0}, Ldefpackage/gb;->N(Ljava/lang/Throwable;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_2
    :goto_1
    return v1
.end method

.method public static k(Ldefpackage/ow0;Ljava/util/UUID;Z)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget v1, p0, Ldefpackage/ow0;->q:I

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :goto_0
    iget v2, p0, Ldefpackage/ow0;->q:I

    .line 10
    .line 11
    if-ge v1, v2, :cond_3

    .line 12
    .line 13
    iget-object v2, p0, Ldefpackage/ow0;->n:[Ldefpackage/nw0;

    .line 14
    .line 15
    aget-object v2, v2, v1

    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ldefpackage/nw0;->a(Ljava/util/UUID;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    sget-object v3, Ldefpackage/ax;->c:Ljava/util/UUID;

    .line 24
    .line 25
    invoke-virtual {v3, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    sget-object v3, Ldefpackage/ax;->b:Ljava/util/UUID;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ldefpackage/nw0;->a(Ljava/util/UUID;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    :cond_0
    iget-object v3, v2, Ldefpackage/nw0;->r:[B

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    if-eqz p2, :cond_2

    .line 44
    .line 45
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Ldefpackage/kk0;->m(Z)V

    .line 3
    .line 4
    .line 5
    iget v1, p0, Ldefpackage/kk0;->p:I

    .line 6
    .line 7
    sub-int/2addr v1, v0

    .line 8
    iput v1, p0, Ldefpackage/kk0;->p:I

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-wide v0, p0, Ldefpackage/kk0;->l:J

    .line 14
    .line 15
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v0, v0, v2

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v1, p0, Ldefpackage/kk0;->m:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-ge v1, v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Ldefpackage/ik0;

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-virtual {v2, v3}, Ldefpackage/ik0;->d(Ldefpackage/sw0;)V

    .line 46
    .line 47
    .line 48
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iget-object v0, p0, Ldefpackage/kk0;->n:Ljava/util/Set;

    .line 52
    .line 53
    invoke-static {v0}, Ldefpackage/jx1;->k(Ljava/util/Collection;)Ldefpackage/jx1;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ldefpackage/rw1;->h()Ldefpackage/o15;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Ldefpackage/jk0;

    .line 72
    .line 73
    invoke-virtual {v1}, Ldefpackage/jk0;->a()V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    invoke-virtual {p0}, Ldefpackage/kk0;->l()V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Ldefpackage/kk0;->m(Z)V

    .line 3
    .line 4
    .line 5
    iget v0, p0, Ldefpackage/kk0;->p:I

    .line 6
    .line 7
    add-int/lit8 v1, v0, 0x1

    .line 8
    .line 9
    iput v1, p0, Ldefpackage/kk0;->p:I

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_4

    .line 14
    :cond_0
    iget-object v0, p0, Ldefpackage/kk0;->q:Ldefpackage/m31;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Ldefpackage/kk0;->b:Ljava/util/UUID;

    .line 19
    .line 20
    iget-object v1, p0, Ldefpackage/kk0;->c:Ldefpackage/mj0;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    :try_start_0
    new-instance v1, Ldefpackage/ue1;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Ldefpackage/ue1;-><init>(Ljava/util/UUID;)V
    :try_end_0
    .catch Landroid/media/UnsupportedSchemeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    goto :goto_2

    .line 31
    :catch_0
    move-exception v1

    .line 32
    goto :goto_0

    .line 33
    :catch_1
    move-exception v1

    .line 34
    goto :goto_1

    .line 35
    :goto_0
    :try_start_1
    new-instance v2, Landroidx/media3/exoplayer/drm/UnsupportedDrmException;

    .line 36
    .line 37
    invoke-direct {v2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    throw v2

    .line 41
    :goto_1
    new-instance v2, Landroidx/media3/exoplayer/drm/UnsupportedDrmException;

    .line 42
    .line 43
    invoke-direct {v2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    throw v2
    :try_end_1
    .catch Landroidx/media3/exoplayer/drm/UnsupportedDrmException; {:try_start_1 .. :try_end_1} :catch_2

    .line 47
    :catch_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v2, "Failed to instantiate a FrameworkMediaDrm for uuid: "

    .line 50
    .line 51
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v0, "."

    .line 58
    .line 59
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v1, "FrameworkMediaDrm"

    .line 67
    .line 68
    invoke-static {v1, v0}, Ldefpackage/l93;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance v1, Ldefpackage/om0;

    .line 72
    .line 73
    const/16 v0, 0xc

    .line 74
    .line 75
    invoke-direct {v1, v0}, Ldefpackage/om0;-><init>(I)V

    .line 76
    .line 77
    .line 78
    :goto_2
    iput-object v1, p0, Ldefpackage/kk0;->q:Ldefpackage/m31;

    .line 79
    .line 80
    new-instance v0, Ldefpackage/zg5;

    .line 81
    .line 82
    invoke-direct {v0, p0}, Ldefpackage/zg5;-><init>(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v1, v0}, Ldefpackage/m31;->D(Ldefpackage/zg5;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_1
    iget-wide v0, p0, Ldefpackage/kk0;->l:J

    .line 90
    .line 91
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    cmp-long v0, v0, v2

    .line 97
    .line 98
    if-eqz v0, :cond_2

    .line 99
    .line 100
    const/4 v0, 0x0

    .line 101
    :goto_3
    iget-object v1, p0, Ldefpackage/kk0;->m:Ljava/util/ArrayList;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-ge v0, v2, :cond_2

    .line 108
    .line 109
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, Ldefpackage/ik0;

    .line 114
    .line 115
    const/4 v2, 0x0

    .line 116
    invoke-virtual {v1, v2}, Ldefpackage/ik0;->e(Ldefpackage/sw0;)V

    .line 117
    .line 118
    .line 119
    add-int/lit8 v0, v0, 0x1

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_2
    :goto_4
    return-void
.end method

.method public final c(Ldefpackage/sw0;Ldefpackage/tb1;)Ldefpackage/pw0;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ldefpackage/kk0;->m(Z)V

    .line 3
    .line 4
    .line 5
    iget v1, p0, Ldefpackage/kk0;->p:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    move v0, v2

    .line 11
    :cond_0
    invoke-static {v0}, Ldefpackage/rr2;->w(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Ldefpackage/kk0;->t:Landroid/os/Looper;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Ldefpackage/kk0;->t:Landroid/os/Looper;

    .line 20
    .line 21
    invoke-virtual {p0, v0, p1, p2, v2}, Ldefpackage/kk0;->g(Landroid/os/Looper;Ldefpackage/sw0;Ldefpackage/tb1;Z)Ldefpackage/pw0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final d(Ldefpackage/sw0;Ldefpackage/tb1;)Ldefpackage/vw0;
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/kk0;->p:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, Ldefpackage/rr2;->w(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ldefpackage/kk0;->t:Landroid/os/Looper;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v0, Ldefpackage/jk0;

    .line 17
    .line 18
    invoke-direct {v0, p0, p1}, Ldefpackage/jk0;-><init>(Ldefpackage/kk0;Ldefpackage/sw0;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Ldefpackage/kk0;->u:Landroid/os/Handler;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance p1, Ldefpackage/k6;

    .line 27
    .line 28
    const/16 v1, 0x12

    .line 29
    .line 30
    invoke-direct {p1, v1, v0, p2}, Ldefpackage/k6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public final e(Landroid/os/Looper;Ldefpackage/ik3;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ldefpackage/kk0;->t:Landroid/os/Looper;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Ldefpackage/kk0;->t:Landroid/os/Looper;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Ldefpackage/kk0;->u:Landroid/os/Handler;

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_2

    .line 18
    :cond_0
    if-ne v0, p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    :goto_0
    invoke-static {p1}, Ldefpackage/rr2;->w(Z)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Ldefpackage/kk0;->u:Landroid/os/Handler;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    :goto_1
    monitor-exit p0

    .line 32
    iput-object p2, p0, Ldefpackage/kk0;->w:Ldefpackage/ik3;

    .line 33
    .line 34
    return-void

    .line 35
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    throw p1
.end method

.method public final f(Ldefpackage/tb1;)I
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Ldefpackage/kk0;->m(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/kk0;->q:Ldefpackage/m31;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-interface {v1}, Ldefpackage/m31;->P()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget-object v2, p1, Ldefpackage/tb1;->r:Ldefpackage/ow0;

    .line 15
    .line 16
    if-nez v2, :cond_3

    .line 17
    .line 18
    iget-object p1, p1, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p1}, Ldefpackage/lw2;->h(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    move v2, v0

    .line 25
    :goto_0
    iget-object v3, p0, Ldefpackage/kk0;->g:[I

    .line 26
    .line 27
    array-length v4, v3

    .line 28
    const/4 v5, -0x1

    .line 29
    if-ge v2, v4, :cond_1

    .line 30
    .line 31
    aget v3, v3, v2

    .line 32
    .line 33
    if-ne v3, p1, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v2, v5

    .line 40
    :goto_1
    if-eq v2, v5, :cond_2

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    return v0

    .line 44
    :cond_3
    iget-object p1, p0, Ldefpackage/kk0;->v:[B

    .line 45
    .line 46
    if-eqz p1, :cond_4

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_4
    iget-object p0, p0, Ldefpackage/kk0;->b:Ljava/util/UUID;

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    invoke-static {v2, p0, p1}, Ldefpackage/kk0;->k(Ldefpackage/ow0;Ljava/util/UUID;Z)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_5

    .line 61
    .line 62
    iget v3, v2, Ldefpackage/ow0;->q:I

    .line 63
    .line 64
    if-ne v3, p1, :cond_8

    .line 65
    .line 66
    iget-object v3, v2, Ldefpackage/ow0;->n:[Ldefpackage/nw0;

    .line 67
    .line 68
    aget-object v0, v3, v0

    .line 69
    .line 70
    sget-object v3, Ldefpackage/ax;->b:Ljava/util/UUID;

    .line 71
    .line 72
    invoke-virtual {v0, v3}, Ldefpackage/nw0;->a(Ljava/util/UUID;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_8

    .line 77
    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string v3, "DrmInitData only contains common PSSH SchemeData. Assuming support for: "

    .line 81
    .line 82
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    const-string v0, "DefaultDrmSessionMgr"

    .line 93
    .line 94
    invoke-static {v0, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_5
    iget-object p0, v2, Ldefpackage/ow0;->p:Ljava/lang/String;

    .line 98
    .line 99
    if-eqz p0, :cond_9

    .line 100
    .line 101
    const-string v0, "cenc"

    .line 102
    .line 103
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_6

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_6
    const-string v0, "cbcs"

    .line 111
    .line 112
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_7

    .line 117
    .line 118
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 119
    .line 120
    const/16 v0, 0x19

    .line 121
    .line 122
    if-lt p0, v0, :cond_8

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_7
    const-string v0, "cbc1"

    .line 126
    .line 127
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-nez v0, :cond_8

    .line 132
    .line 133
    const-string v0, "cens"

    .line 134
    .line 135
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-eqz p0, :cond_9

    .line 140
    .line 141
    :cond_8
    return p1

    .line 142
    :cond_9
    :goto_2
    return v1
.end method

.method public final g(Landroid/os/Looper;Ldefpackage/sw0;Ldefpackage/tb1;Z)Ldefpackage/pw0;
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/kk0;->x:Ldefpackage/zk;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Ldefpackage/zk;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1, v1}, Ldefpackage/zk;-><init>(Ljava/lang/Object;Landroid/os/Looper;I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ldefpackage/kk0;->x:Ldefpackage/zk;

    .line 12
    .line 13
    :cond_0
    iget-object p1, p3, Ldefpackage/tb1;->r:Ldefpackage/ow0;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    if-nez p1, :cond_7

    .line 18
    .line 19
    iget-object p1, p3, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p1}, Ldefpackage/lw2;->h(Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-object p2, p0, Ldefpackage/kk0;->q:Ldefpackage/m31;

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-interface {p2}, Ldefpackage/m31;->P()I

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    if-ne p3, v1, :cond_1

    .line 35
    .line 36
    sget-boolean p3, Ldefpackage/se1;->c:Z

    .line 37
    .line 38
    if-eqz p3, :cond_1

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_1
    iget-object p3, p0, Ldefpackage/kk0;->g:[I

    .line 42
    .line 43
    :goto_0
    array-length v1, p3

    .line 44
    const/4 v3, -0x1

    .line 45
    if-ge v0, v1, :cond_3

    .line 46
    .line 47
    aget v1, p3, v0

    .line 48
    .line 49
    if-ne v1, p1, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    move v0, v3

    .line 56
    :goto_1
    if-eq v0, v3, :cond_6

    .line 57
    .line 58
    invoke-interface {p2}, Ldefpackage/m31;->P()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    const/4 p2, 0x1

    .line 63
    if-ne p1, p2, :cond_4

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    iget-object p1, p0, Ldefpackage/kk0;->r:Ldefpackage/ik0;

    .line 67
    .line 68
    if-nez p1, :cond_5

    .line 69
    .line 70
    sget-object p1, Ldefpackage/yw1;->o:Ldefpackage/vw1;

    .line 71
    .line 72
    sget-object p1, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 73
    .line 74
    invoke-virtual {p0, p1, p2, v2, p4}, Ldefpackage/kk0;->j(Ljava/util/List;ZLdefpackage/sw0;Z)Ldefpackage/ik0;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object p2, p0, Ldefpackage/kk0;->m:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    iput-object p1, p0, Ldefpackage/kk0;->r:Ldefpackage/ik0;

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_5
    invoke-virtual {p1, v2}, Ldefpackage/ik0;->e(Ldefpackage/sw0;)V

    .line 87
    .line 88
    .line 89
    :goto_2
    iget-object p0, p0, Ldefpackage/kk0;->r:Ldefpackage/ik0;

    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_6
    :goto_3
    return-object v2

    .line 93
    :cond_7
    iget-object p3, p0, Ldefpackage/kk0;->v:[B

    .line 94
    .line 95
    if-nez p3, :cond_8

    .line 96
    .line 97
    iget-object p3, p0, Ldefpackage/kk0;->b:Ljava/util/UUID;

    .line 98
    .line 99
    invoke-static {p1, p3, v0}, Ldefpackage/kk0;->k(Ldefpackage/ow0;Ljava/util/UUID;Z)Ljava/util/ArrayList;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result p3

    .line 107
    if-eqz p3, :cond_9

    .line 108
    .line 109
    new-instance p1, Landroidx/media3/exoplayer/drm/DefaultDrmSessionManager$MissingSchemeDataException;

    .line 110
    .line 111
    iget-object p0, p0, Ldefpackage/kk0;->b:Ljava/util/UUID;

    .line 112
    .line 113
    new-instance p3, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    const-string p4, "Media does not support uuid: "

    .line 116
    .line 117
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    const-string p0, "DefaultDrmSessionMgr"

    .line 131
    .line 132
    const-string p3, "DRM error"

    .line 133
    .line 134
    invoke-static {p0, p3, p1}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2, p1}, Ldefpackage/sw0;->d(Ljava/lang/Exception;)V

    .line 138
    .line 139
    .line 140
    new-instance p0, Ldefpackage/f21;

    .line 141
    .line 142
    new-instance p2, Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    .line 143
    .line 144
    const/16 p3, 0x1773

    .line 145
    .line 146
    invoke-direct {p2, p1, p3}, Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;-><init>(Ljava/lang/Throwable;I)V

    .line 147
    .line 148
    .line 149
    invoke-direct {p0, p2}, Ldefpackage/f21;-><init>(Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;)V

    .line 150
    .line 151
    .line 152
    return-object p0

    .line 153
    :cond_8
    move-object p1, v2

    .line 154
    :cond_9
    iget-boolean p3, p0, Ldefpackage/kk0;->f:Z

    .line 155
    .line 156
    if-nez p3, :cond_a

    .line 157
    .line 158
    iget-object v2, p0, Ldefpackage/kk0;->s:Ldefpackage/ik0;

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_a
    iget-object p3, p0, Ldefpackage/kk0;->m:Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    move v3, v0

    .line 168
    :cond_b
    if-ge v3, v1, :cond_c

    .line 169
    .line 170
    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    add-int/lit8 v3, v3, 0x1

    .line 175
    .line 176
    check-cast v4, Ldefpackage/ik0;

    .line 177
    .line 178
    iget-object v5, v4, Ldefpackage/ik0;->a:Ljava/util/List;

    .line 179
    .line 180
    invoke-static {v5, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    if-eqz v5, :cond_b

    .line 185
    .line 186
    move-object v2, v4

    .line 187
    :cond_c
    :goto_4
    if-nez v2, :cond_e

    .line 188
    .line 189
    invoke-virtual {p0, p1, v0, p2, p4}, Ldefpackage/kk0;->j(Ljava/util/List;ZLdefpackage/sw0;Z)Ldefpackage/ik0;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    iget-boolean p2, p0, Ldefpackage/kk0;->f:Z

    .line 194
    .line 195
    if-nez p2, :cond_d

    .line 196
    .line 197
    iput-object p1, p0, Ldefpackage/kk0;->s:Ldefpackage/ik0;

    .line 198
    .line 199
    :cond_d
    iget-object p0, p0, Ldefpackage/kk0;->m:Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    return-object p1

    .line 205
    :cond_e
    invoke-virtual {v2, p2}, Ldefpackage/ik0;->e(Ldefpackage/sw0;)V

    .line 206
    .line 207
    .line 208
    return-object v2
.end method

.method public final i(Ljava/util/List;ZLdefpackage/sw0;)Ldefpackage/ik0;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/kk0;->q:Ldefpackage/m31;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-boolean v1, v0, Ldefpackage/kk0;->h:Z

    .line 9
    .line 10
    or-int v8, v1, p2

    .line 11
    .line 12
    new-instance v2, Ldefpackage/ik0;

    .line 13
    .line 14
    iget-object v4, v0, Ldefpackage/kk0;->q:Ldefpackage/m31;

    .line 15
    .line 16
    iget-object v10, v0, Ldefpackage/kk0;->v:[B

    .line 17
    .line 18
    iget-object v13, v0, Ldefpackage/kk0;->t:Landroid/os/Looper;

    .line 19
    .line 20
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v15, v0, Ldefpackage/kk0;->w:Ldefpackage/ik3;

    .line 24
    .line 25
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v3, v0, Ldefpackage/kk0;->b:Ljava/util/UUID;

    .line 29
    .line 30
    iget-object v5, v0, Ldefpackage/kk0;->i:Ldefpackage/qr2;

    .line 31
    .line 32
    iget-object v6, v0, Ldefpackage/kk0;->k:Ldefpackage/d34;

    .line 33
    .line 34
    iget-object v11, v0, Ldefpackage/kk0;->e:Ljava/util/HashMap;

    .line 35
    .line 36
    iget-object v12, v0, Ldefpackage/kk0;->d:Ldefpackage/ll;

    .line 37
    .line 38
    iget-object v14, v0, Ldefpackage/kk0;->j:Ldefpackage/i80;

    .line 39
    .line 40
    move-object/from16 v7, p1

    .line 41
    .line 42
    move/from16 v9, p2

    .line 43
    .line 44
    invoke-direct/range {v2 .. v15}, Ldefpackage/ik0;-><init>(Ljava/util/UUID;Ldefpackage/m31;Ldefpackage/qr2;Ldefpackage/d34;Ljava/util/List;ZZ[BLjava/util/HashMap;Ldefpackage/ll;Landroid/os/Looper;Ldefpackage/i80;Ldefpackage/ik3;)V

    .line 45
    .line 46
    .line 47
    move-object/from16 v1, p3

    .line 48
    .line 49
    invoke-virtual {v2, v1}, Ldefpackage/ik0;->e(Ldefpackage/sw0;)V

    .line 50
    .line 51
    .line 52
    iget-wide v0, v0, Ldefpackage/kk0;->l:J

    .line 53
    .line 54
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    cmp-long v0, v0, v3

    .line 60
    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    invoke-virtual {v2, v0}, Ldefpackage/ik0;->e(Ldefpackage/sw0;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    return-object v2
.end method

.method public final j(Ljava/util/List;ZLdefpackage/sw0;Z)Ldefpackage/ik0;
    .locals 9

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/kk0;->i(Ljava/util/List;ZLdefpackage/sw0;)Ldefpackage/ik0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ldefpackage/kk0;->h(Ldefpackage/ik0;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    iget-wide v4, p0, Ldefpackage/kk0;->l:J

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    iget-object v7, p0, Ldefpackage/kk0;->o:Ljava/util/Set;

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    invoke-interface {v7}, Ljava/util/Set;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    invoke-static {v7}, Ldefpackage/jx1;->k(Ljava/util/Collection;)Ldefpackage/jx1;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ldefpackage/rw1;->h()Ldefpackage/o15;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    if-eqz v8, :cond_0

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    check-cast v8, Ldefpackage/pw0;

    .line 46
    .line 47
    invoke-interface {v8, v6}, Ldefpackage/pw0;->d(Ldefpackage/sw0;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v0, p3}, Ldefpackage/ik0;->d(Ldefpackage/sw0;)V

    .line 52
    .line 53
    .line 54
    cmp-long v1, v4, v2

    .line 55
    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    invoke-virtual {v0, v6}, Ldefpackage/ik0;->d(Ldefpackage/sw0;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/kk0;->i(Ljava/util/List;ZLdefpackage/sw0;)Ldefpackage/ik0;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :cond_2
    invoke-static {v0}, Ldefpackage/kk0;->h(Ldefpackage/ik0;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_6

    .line 70
    .line 71
    if-eqz p4, :cond_6

    .line 72
    .line 73
    iget-object p4, p0, Ldefpackage/kk0;->n:Ljava/util/Set;

    .line 74
    .line 75
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_6

    .line 80
    .line 81
    invoke-static {p4}, Ldefpackage/jx1;->k(Ljava/util/Collection;)Ldefpackage/jx1;

    .line 82
    .line 83
    .line 84
    move-result-object p4

    .line 85
    invoke-virtual {p4}, Ldefpackage/rw1;->h()Ldefpackage/o15;

    .line 86
    .line 87
    .line 88
    move-result-object p4

    .line 89
    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_3

    .line 94
    .line 95
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Ldefpackage/jk0;

    .line 100
    .line 101
    invoke-virtual {v1}, Ldefpackage/jk0;->a()V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    invoke-interface {v7}, Ljava/util/Set;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result p4

    .line 109
    if-nez p4, :cond_4

    .line 110
    .line 111
    invoke-static {v7}, Ldefpackage/jx1;->k(Ljava/util/Collection;)Ldefpackage/jx1;

    .line 112
    .line 113
    .line 114
    move-result-object p4

    .line 115
    invoke-virtual {p4}, Ldefpackage/rw1;->h()Ldefpackage/o15;

    .line 116
    .line 117
    .line 118
    move-result-object p4

    .line 119
    :goto_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_4

    .line 124
    .line 125
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    check-cast v1, Ldefpackage/pw0;

    .line 130
    .line 131
    invoke-interface {v1, v6}, Ldefpackage/pw0;->d(Ldefpackage/sw0;)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_4
    invoke-virtual {v0, p3}, Ldefpackage/ik0;->d(Ldefpackage/sw0;)V

    .line 136
    .line 137
    .line 138
    cmp-long p4, v4, v2

    .line 139
    .line 140
    if-eqz p4, :cond_5

    .line 141
    .line 142
    invoke-virtual {v0, v6}, Ldefpackage/ik0;->d(Ldefpackage/sw0;)V

    .line 143
    .line 144
    .line 145
    :cond_5
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/kk0;->i(Ljava/util/List;ZLdefpackage/sw0;)Ldefpackage/ik0;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    return-object p0

    .line 150
    :cond_6
    return-object v0
.end method

.method public final l()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/kk0;->q:Ldefpackage/m31;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Ldefpackage/kk0;->p:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/kk0;->m:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Ldefpackage/kk0;->n:Ljava/util/Set;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Ldefpackage/kk0;->q:Ldefpackage/m31;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ldefpackage/m31;->a()V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    iput-object v0, p0, Ldefpackage/kk0;->q:Ldefpackage/m31;

    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public final m(Z)V
    .locals 2

    .line 1
    const-string v0, "DefaultDrmSessionMgr"

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Ldefpackage/kk0;->t:Landroid/os/Looper;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string p1, "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread."

    .line 15
    .line 16
    invoke-static {v0, p1, p0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object v1, p0, Ldefpackage/kk0;->t:Landroid/os/Looper;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eq p1, v1, :cond_1

    .line 34
    .line 35
    new-instance p1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: "

    .line 38
    .line 39
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, "\nExpected thread: "

    .line 54
    .line 55
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, Ldefpackage/kk0;->t:Landroid/os/Looper;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-static {v0, p0, p1}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    :cond_1
    return-void
.end method
