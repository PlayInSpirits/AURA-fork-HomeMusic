.class public abstract Ldefpackage/au0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final A:[B

.field public static final B:[B

.field public static final C:[B

.field public static final D:[B

.field public static final E:Ljava/lang/Object;

.field public static volatile F:Ldefpackage/jh5;

.field public static n:Ldefpackage/om1;

.field public static o:Ldefpackage/tk4;

.field public static p:Ljava/io/File;

.field public static q:Ljava/io/File;

.field public static r:Ldefpackage/se4;

.field public static s:Ldefpackage/se4;

.field public static t:Ldefpackage/lt0;

.field public static u:Ldefpackage/eu0;

.field public static final v:[F

.field public static w:Ldefpackage/b24;

.field public static final x:[B

.field public static final y:[B

.field public static final z:[B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x5b

    .line 2
    .line 3
    new-array v0, v0, [F

    .line 4
    .line 5
    sput-object v0, Ldefpackage/au0;->v:[F

    .line 6
    .line 7
    const/4 v0, 0x4

    .line 8
    new-array v1, v0, [B

    .line 9
    .line 10
    fill-array-data v1, :array_0

    .line 11
    .line 12
    .line 13
    sput-object v1, Ldefpackage/au0;->x:[B

    .line 14
    .line 15
    new-array v1, v0, [B

    .line 16
    .line 17
    fill-array-data v1, :array_1

    .line 18
    .line 19
    .line 20
    sput-object v1, Ldefpackage/au0;->y:[B

    .line 21
    .line 22
    new-array v1, v0, [B

    .line 23
    .line 24
    fill-array-data v1, :array_2

    .line 25
    .line 26
    .line 27
    sput-object v1, Ldefpackage/au0;->z:[B

    .line 28
    .line 29
    new-array v1, v0, [B

    .line 30
    .line 31
    fill-array-data v1, :array_3

    .line 32
    .line 33
    .line 34
    sput-object v1, Ldefpackage/au0;->A:[B

    .line 35
    .line 36
    new-array v1, v0, [B

    .line 37
    .line 38
    fill-array-data v1, :array_4

    .line 39
    .line 40
    .line 41
    sput-object v1, Ldefpackage/au0;->B:[B

    .line 42
    .line 43
    new-array v1, v0, [B

    .line 44
    .line 45
    fill-array-data v1, :array_5

    .line 46
    .line 47
    .line 48
    sput-object v1, Ldefpackage/au0;->C:[B

    .line 49
    .line 50
    new-array v0, v0, [B

    .line 51
    .line 52
    fill-array-data v0, :array_6

    .line 53
    .line 54
    .line 55
    sput-object v0, Ldefpackage/au0;->D:[B

    .line 56
    .line 57
    new-instance v0, Ljava/lang/Object;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    sput-object v0, Ldefpackage/au0;->E:Ljava/lang/Object;

    .line 63
    .line 64
    return-void

    .line 65
    :array_0
    .array-data 1
        0x30t
        0x31t
        0x35t
        0x0t
    .end array-data

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    :array_1
    .array-data 1
        0x30t
        0x31t
        0x30t
        0x0t
    .end array-data

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    :array_2
    .array-data 1
        0x30t
        0x30t
        0x39t
        0x0t
    .end array-data

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    :array_3
    .array-data 1
        0x30t
        0x30t
        0x35t
        0x0t
    .end array-data

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    :array_4
    .array-data 1
        0x30t
        0x30t
        0x31t
        0x0t
    .end array-data

    :array_5
    .array-data 1
        0x30t
        0x30t
        0x31t
        0x0t
    .end array-data

    :array_6
    .array-data 1
        0x30t
        0x30t
        0x32t
        0x0t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final A(Ldefpackage/ef2;)Ldefpackage/ef2;
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/ef2;->H:Ldefpackage/f63;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/f63;->H:Ldefpackage/c72;

    .line 4
    .line 5
    :goto_0
    invoke-virtual {p0}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Ldefpackage/c72;->u:Ldefpackage/c72;

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_1
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-virtual {p0}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v1, v0, Ldefpackage/c72;->u:Ldefpackage/c72;

    .line 25
    .line 26
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Ldefpackage/c72;->u:Ldefpackage/c72;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    iget-object p0, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 43
    .line 44
    iget-object p0, p0, Ldefpackage/w12;->e:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Ldefpackage/f63;

    .line 47
    .line 48
    invoke-virtual {p0}, Ldefpackage/f63;->y0()Ldefpackage/ef2;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    return-object p0
.end method

.method public static declared-synchronized B(Landroid/content/Context;)Ldefpackage/se4;
    .locals 8

    .line 1
    const-class v0, Ldefpackage/au0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ldefpackage/au0;->s:Ldefpackage/se4;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Ljava/io/File;

    .line 9
    .line 10
    invoke-static {p0}, Ldefpackage/au0;->C(Landroid/content/Context;)Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "streaming_cache"

    .line 15
    .line 16
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Ldefpackage/se4;

    .line 20
    .line 21
    new-instance v3, Ldefpackage/d92;

    .line 22
    .line 23
    invoke-static {}, Ldefpackage/ud3;->F()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    const-wide/32 v6, 0x100000

    .line 28
    .line 29
    .line 30
    mul-long/2addr v4, v6

    .line 31
    invoke-direct {v3, v4, v5}, Ldefpackage/d92;-><init>(J)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Ldefpackage/au0;->s(Landroid/content/Context;)Ldefpackage/tk4;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {v2, v1, v3, p0}, Ldefpackage/se4;-><init>(Ljava/io/File;Ldefpackage/mx;Ldefpackage/tk4;)V

    .line 39
    .line 40
    .line 41
    sput-object v2, Ldefpackage/au0;->s:Ldefpackage/se4;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    :goto_0
    sget-object p0, Ldefpackage/au0;->s:Ldefpackage/se4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    monitor-exit v0

    .line 49
    return-object p0

    .line 50
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    throw p0
.end method

.method public static declared-synchronized C(Landroid/content/Context;)Ljava/io/File;
    .locals 5

    .line 1
    const-class v0, Ldefpackage/au0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ldefpackage/au0;->p:Ljava/io/File;

    .line 5
    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    invoke-static {}, Ldefpackage/ud3;->G()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v3}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    aget-object v1, v1, v2

    .line 21
    .line 22
    sput-object v1, Ldefpackage/au0;->p:Ljava/io/File;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/io/File;->canWrite()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_2

    .line 35
    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    sput-object p0, Ldefpackage/au0;->p:Ljava/io/File;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    :try_start_1
    invoke-virtual {p0, v3}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const/4 v4, 0x1

    .line 47
    aget-object v1, v1, v4

    .line 48
    .line 49
    sput-object v1, Ldefpackage/au0;->p:Ljava/io/File;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catch_0
    :try_start_2
    invoke-virtual {p0, v3}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    aget-object p0, p0, v2

    .line 57
    .line 58
    sput-object p0, Ldefpackage/au0;->p:Ljava/io/File;

    .line 59
    .line 60
    invoke-static {v2}, Ldefpackage/ud3;->B0(I)V

    .line 61
    .line 62
    .line 63
    :cond_2
    :goto_1
    sget-object p0, Ldefpackage/au0;->p:Ljava/io/File;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    .line 65
    monitor-exit v0

    .line 66
    return-object p0

    .line 67
    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 68
    throw p0
.end method

.method public static declared-synchronized D(Landroid/content/Context;)Ldefpackage/se4;
    .locals 1

    .line 1
    const-class v0, Ldefpackage/au0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p0}, Ldefpackage/au0;->B(Landroid/content/Context;)Ldefpackage/se4;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit v0

    .line 9
    return-object p0

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw p0
.end method

.method public static declared-synchronized E(Lcom/eddyizm/tempus/service/MediaService;)Ldefpackage/kx;
    .locals 3

    .line 1
    const-class v0, Ldefpackage/au0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ldefpackage/rf2;

    .line 5
    .line 6
    invoke-static {}, Ldefpackage/au0;->x()Ldefpackage/bi0;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-direct {v1, p0, v2}, Ldefpackage/rf2;-><init>(Landroid/content/Context;Ldefpackage/bi0;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ldefpackage/au0;->u(Landroid/content/Context;)Ldefpackage/se4;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {v1, p0}, Ldefpackage/au0;->d(Ldefpackage/bi0;Ldefpackage/se4;)Ldefpackage/kx;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    monitor-exit v0

    .line 22
    return-object p0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw p0
.end method

.method public static final F(Ldefpackage/dx2;Ldefpackage/if1;)Ldefpackage/dx2;
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/et;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ldefpackage/et;-><init>(Ldefpackage/if1;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Ldefpackage/dx2;->c(Ldefpackage/dx2;)Ldefpackage/dx2;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static G(Ldefpackage/dx2;Ldefpackage/ac4;I)Ldefpackage/dx2;
    .locals 11

    .line 1
    and-int/lit8 v0, p2, 0x4

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    :goto_0
    move v2, v0

    .line 8
    goto :goto_1

    .line 9
    :cond_0
    const/high16 v0, 0x3f000000    # 0.5f

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :goto_1
    sget-wide v3, Ldefpackage/tw4;->a:J

    .line 13
    .line 14
    and-int/lit16 p2, p2, 0x800

    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    sget-object p1, Ldefpackage/kb4;->b:Ldefpackage/sp1;

    .line 19
    .line 20
    :cond_1
    move-object v5, p1

    .line 21
    sget-wide v6, Ldefpackage/wj1;->a:J

    .line 22
    .line 23
    sget-object v10, Ldefpackage/m62;->a:Ldefpackage/m62;

    .line 24
    .line 25
    new-instance v1, Ldefpackage/tj1;

    .line 26
    .line 27
    move-wide v8, v6

    .line 28
    invoke-direct/range {v1 .. v10}, Ldefpackage/tj1;-><init>(FJLdefpackage/ac4;JJLdefpackage/m62;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0, v1}, Ldefpackage/dx2;->c(Ldefpackage/dx2;)Ldefpackage/dx2;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static J()Z
    .locals 2

    .line 1
    const-string v0, "java.vm.name"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "Dalvik"

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public static declared-synchronized K(Ljava/io/File;Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    const-class v0, Ldefpackage/au0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_2

    .line 15
    .line 16
    array-length v1, p0

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v1, :cond_2

    .line 19
    .line 20
    aget-object v3, p0, v2

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const-string v5, ".exo"

    .line 37
    .line 38
    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto :goto_2

    .line 50
    :cond_0
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    invoke-static {v3, p1}, Ldefpackage/au0;->K(Ljava/io/File;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    monitor-exit v0

    .line 63
    return-void

    .line 64
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    throw p0
.end method

.method public static L(Ldefpackage/go4;)Ldefpackage/go4;
    .locals 1

    .line 1
    instance-of v0, p0, Ldefpackage/io4;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    instance-of v0, p0, Ldefpackage/ho4;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    instance-of v0, p0, Ljava/io/Serializable;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    new-instance v0, Ldefpackage/ho4;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Ldefpackage/ho4;-><init>(Ldefpackage/go4;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_1
    new-instance v0, Ldefpackage/io4;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Ldefpackage/io4;-><init>(Ldefpackage/go4;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_2
    return-object p0
.end method

.method public static O(Ldefpackage/tl1;)Ldefpackage/ix;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ldefpackage/tl1;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x1

    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, 0x0

    .line 14
    const/4 v10, 0x0

    .line 15
    const/4 v11, -0x1

    .line 16
    const/4 v12, -0x1

    .line 17
    const/4 v13, 0x0

    .line 18
    const/4 v14, 0x0

    .line 19
    const/4 v15, 0x0

    .line 20
    const/16 v16, -0x1

    .line 21
    .line 22
    const/16 v17, -0x1

    .line 23
    .line 24
    const/16 v18, 0x0

    .line 25
    .line 26
    const/16 v19, 0x0

    .line 27
    .line 28
    const/16 v20, 0x0

    .line 29
    .line 30
    :goto_0
    if-ge v6, v1, :cond_18

    .line 31
    .line 32
    invoke-virtual {v0, v6}, Ldefpackage/tl1;->b(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/16 v22, 0x1

    .line 37
    .line 38
    invoke-virtual {v0, v6}, Ldefpackage/tl1;->e(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    const-string v5, "Cache-Control"

    .line 43
    .line 44
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_1

    .line 49
    .line 50
    if-eqz v8, :cond_0

    .line 51
    .line 52
    :goto_1
    const/4 v7, 0x0

    .line 53
    goto :goto_2

    .line 54
    :cond_0
    move-object v8, v4

    .line 55
    goto :goto_2

    .line 56
    :cond_1
    const-string v5, "Pragma"

    .line 57
    .line 58
    invoke-virtual {v2, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_17

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :goto_2
    const/4 v2, 0x0

    .line 66
    :goto_3
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-ge v2, v5, :cond_17

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    move v3, v2

    .line 77
    :goto_4
    if-ge v3, v5, :cond_3

    .line 78
    .line 79
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    move/from16 v23, v1

    .line 84
    .line 85
    const-string v1, "=,;"

    .line 86
    .line 87
    invoke-static {v1, v0}, Ldefpackage/qm4;->n0(Ljava/lang/CharSequence;C)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    goto :goto_5

    .line 94
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    move-object/from16 v0, p0

    .line 97
    .line 98
    move/from16 v1, v23

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_3
    move/from16 v23, v1

    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    :goto_5
    invoke-virtual {v4, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v0}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eq v3, v1, :cond_a

    .line 124
    .line 125
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    const/16 v2, 0x2c

    .line 130
    .line 131
    if-eq v1, v2, :cond_a

    .line 132
    .line 133
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    const/16 v2, 0x3b

    .line 138
    .line 139
    if-ne v1, v2, :cond_4

    .line 140
    .line 141
    goto/16 :goto_a

    .line 142
    .line 143
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 144
    .line 145
    sget-object v1, Ldefpackage/xe5;->a:[B

    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    :goto_6
    if-ge v3, v1, :cond_6

    .line 152
    .line 153
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    const/16 v5, 0x20

    .line 158
    .line 159
    if-eq v2, v5, :cond_5

    .line 160
    .line 161
    const/16 v5, 0x9

    .line 162
    .line 163
    if-eq v2, v5, :cond_5

    .line 164
    .line 165
    goto :goto_7

    .line 166
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_6
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    :goto_7
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-ge v3, v1, :cond_7

    .line 178
    .line 179
    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    const/16 v2, 0x22

    .line 184
    .line 185
    if-ne v1, v2, :cond_7

    .line 186
    .line 187
    add-int/lit8 v3, v3, 0x1

    .line 188
    .line 189
    const/4 v1, 0x4

    .line 190
    invoke-static {v4, v2, v3, v1}, Ldefpackage/qm4;->r0(Ljava/lang/CharSequence;CII)I

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    invoke-virtual {v4, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    add-int/lit8 v1, v1, 0x1

    .line 199
    .line 200
    goto :goto_b

    .line 201
    :cond_7
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    move v2, v3

    .line 206
    :goto_8
    if-ge v2, v1, :cond_9

    .line 207
    .line 208
    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    move/from16 v24, v1

    .line 213
    .line 214
    const-string v1, ",;"

    .line 215
    .line 216
    invoke-static {v1, v5}, Ldefpackage/qm4;->n0(Ljava/lang/CharSequence;C)Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-eqz v1, :cond_8

    .line 221
    .line 222
    goto :goto_9

    .line 223
    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 224
    .line 225
    move/from16 v1, v24

    .line 226
    .line 227
    goto :goto_8

    .line 228
    :cond_9
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    :goto_9
    invoke-virtual {v4, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-static {v1}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    move/from16 v25, v2

    .line 245
    .line 246
    move-object v2, v1

    .line 247
    move/from16 v1, v25

    .line 248
    .line 249
    goto :goto_b

    .line 250
    :cond_a
    :goto_a
    add-int/lit8 v3, v3, 0x1

    .line 251
    .line 252
    move v1, v3

    .line 253
    const/4 v2, 0x0

    .line 254
    :goto_b
    const-string v3, "no-cache"

    .line 255
    .line 256
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    if-eqz v3, :cond_b

    .line 261
    .line 262
    move-object/from16 v0, p0

    .line 263
    .line 264
    move v2, v1

    .line 265
    move/from16 v9, v22

    .line 266
    .line 267
    :goto_c
    move/from16 v1, v23

    .line 268
    .line 269
    goto/16 :goto_3

    .line 270
    .line 271
    :cond_b
    const-string v3, "no-store"

    .line 272
    .line 273
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    if-eqz v3, :cond_c

    .line 278
    .line 279
    move-object/from16 v0, p0

    .line 280
    .line 281
    move v2, v1

    .line 282
    move/from16 v10, v22

    .line 283
    .line 284
    goto :goto_c

    .line 285
    :cond_c
    const-string v3, "max-age"

    .line 286
    .line 287
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    if-eqz v3, :cond_e

    .line 292
    .line 293
    const/4 v3, -0x1

    .line 294
    invoke-static {v3, v2}, Ldefpackage/xe5;->o(ILjava/lang/String;)I

    .line 295
    .line 296
    .line 297
    move-result v11

    .line 298
    :cond_d
    :goto_d
    move-object/from16 v0, p0

    .line 299
    .line 300
    move v2, v1

    .line 301
    goto :goto_c

    .line 302
    :cond_e
    const/4 v3, -0x1

    .line 303
    const-string v5, "s-maxage"

    .line 304
    .line 305
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 306
    .line 307
    .line 308
    move-result v5

    .line 309
    if-eqz v5, :cond_f

    .line 310
    .line 311
    invoke-static {v3, v2}, Ldefpackage/xe5;->o(ILjava/lang/String;)I

    .line 312
    .line 313
    .line 314
    move-result v12

    .line 315
    goto :goto_d

    .line 316
    :cond_f
    const-string v3, "private"

    .line 317
    .line 318
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    if-eqz v3, :cond_10

    .line 323
    .line 324
    move-object/from16 v0, p0

    .line 325
    .line 326
    move v2, v1

    .line 327
    move/from16 v13, v22

    .line 328
    .line 329
    goto :goto_c

    .line 330
    :cond_10
    const-string v3, "public"

    .line 331
    .line 332
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    if-eqz v3, :cond_11

    .line 337
    .line 338
    move-object/from16 v0, p0

    .line 339
    .line 340
    move v2, v1

    .line 341
    move/from16 v14, v22

    .line 342
    .line 343
    goto :goto_c

    .line 344
    :cond_11
    const-string v3, "must-revalidate"

    .line 345
    .line 346
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 347
    .line 348
    .line 349
    move-result v3

    .line 350
    if-eqz v3, :cond_12

    .line 351
    .line 352
    move-object/from16 v0, p0

    .line 353
    .line 354
    move v2, v1

    .line 355
    move/from16 v15, v22

    .line 356
    .line 357
    goto :goto_c

    .line 358
    :cond_12
    const-string v3, "max-stale"

    .line 359
    .line 360
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 361
    .line 362
    .line 363
    move-result v3

    .line 364
    if-eqz v3, :cond_13

    .line 365
    .line 366
    const v0, 0x7fffffff

    .line 367
    .line 368
    .line 369
    invoke-static {v0, v2}, Ldefpackage/xe5;->o(ILjava/lang/String;)I

    .line 370
    .line 371
    .line 372
    move-result v16

    .line 373
    goto :goto_d

    .line 374
    :cond_13
    const-string v3, "min-fresh"

    .line 375
    .line 376
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    if-eqz v3, :cond_14

    .line 381
    .line 382
    const/4 v3, -0x1

    .line 383
    invoke-static {v3, v2}, Ldefpackage/xe5;->o(ILjava/lang/String;)I

    .line 384
    .line 385
    .line 386
    move-result v17

    .line 387
    goto :goto_d

    .line 388
    :cond_14
    const/4 v3, -0x1

    .line 389
    const-string v2, "only-if-cached"

    .line 390
    .line 391
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 392
    .line 393
    .line 394
    move-result v2

    .line 395
    if-eqz v2, :cond_15

    .line 396
    .line 397
    move-object/from16 v0, p0

    .line 398
    .line 399
    move v2, v1

    .line 400
    move/from16 v18, v22

    .line 401
    .line 402
    goto/16 :goto_c

    .line 403
    .line 404
    :cond_15
    const-string v2, "no-transform"

    .line 405
    .line 406
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    if-eqz v2, :cond_16

    .line 411
    .line 412
    move-object/from16 v0, p0

    .line 413
    .line 414
    move v2, v1

    .line 415
    move/from16 v19, v22

    .line 416
    .line 417
    goto/16 :goto_c

    .line 418
    .line 419
    :cond_16
    const-string v2, "immutable"

    .line 420
    .line 421
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-eqz v0, :cond_d

    .line 426
    .line 427
    move-object/from16 v0, p0

    .line 428
    .line 429
    move v2, v1

    .line 430
    move/from16 v20, v22

    .line 431
    .line 432
    goto/16 :goto_c

    .line 433
    .line 434
    :cond_17
    move/from16 v23, v1

    .line 435
    .line 436
    const/4 v3, -0x1

    .line 437
    add-int/lit8 v6, v6, 0x1

    .line 438
    .line 439
    move-object/from16 v0, p0

    .line 440
    .line 441
    move/from16 v1, v23

    .line 442
    .line 443
    goto/16 :goto_0

    .line 444
    .line 445
    :cond_18
    if-nez v7, :cond_19

    .line 446
    .line 447
    const/16 v21, 0x0

    .line 448
    .line 449
    goto :goto_e

    .line 450
    :cond_19
    move-object/from16 v21, v8

    .line 451
    .line 452
    :goto_e
    new-instance v8, Ldefpackage/ix;

    .line 453
    .line 454
    invoke-direct/range {v8 .. v21}, Ldefpackage/ix;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    .line 455
    .line 456
    .line 457
    return-object v8
.end method

.method public static P(Ldefpackage/be3;II)J
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/be3;->N(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/be3;->a()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 v0, 0x5

    .line 9
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    if-ge p1, v0, :cond_0

    .line 15
    .line 16
    return-wide v1

    .line 17
    :cond_0
    invoke-virtual {p0}, Ldefpackage/be3;->m()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/high16 v0, 0x800000

    .line 22
    .line 23
    and-int/2addr v0, p1

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    return-wide v1

    .line 27
    :cond_1
    const v0, 0x1fff00

    .line 28
    .line 29
    .line 30
    and-int/2addr v0, p1

    .line 31
    shr-int/lit8 v0, v0, 0x8

    .line 32
    .line 33
    if-eq v0, p2, :cond_2

    .line 34
    .line 35
    return-wide v1

    .line 36
    :cond_2
    and-int/lit8 p1, p1, 0x20

    .line 37
    .line 38
    if-eqz p1, :cond_3

    .line 39
    .line 40
    invoke-virtual {p0}, Ldefpackage/be3;->A()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    const/4 p2, 0x7

    .line 45
    if-lt p1, p2, :cond_3

    .line 46
    .line 47
    invoke-virtual {p0}, Ldefpackage/be3;->a()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-lt p1, p2, :cond_3

    .line 52
    .line 53
    invoke-virtual {p0}, Ldefpackage/be3;->A()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    const/16 v0, 0x10

    .line 58
    .line 59
    and-int/2addr p1, v0

    .line 60
    if-ne p1, v0, :cond_3

    .line 61
    .line 62
    const/4 p1, 0x6

    .line 63
    new-array v0, p1, [B

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    invoke-virtual {p0, v0, v1, p1}, Ldefpackage/be3;->k([BII)V

    .line 67
    .line 68
    .line 69
    aget-byte p0, v0, v1

    .line 70
    .line 71
    int-to-long p0, p0

    .line 72
    const-wide/16 v1, 0xff

    .line 73
    .line 74
    and-long/2addr p0, v1

    .line 75
    const/16 v3, 0x19

    .line 76
    .line 77
    shl-long/2addr p0, v3

    .line 78
    const/4 v3, 0x1

    .line 79
    aget-byte v4, v0, v3

    .line 80
    .line 81
    int-to-long v4, v4

    .line 82
    and-long/2addr v4, v1

    .line 83
    const/16 v6, 0x11

    .line 84
    .line 85
    shl-long/2addr v4, v6

    .line 86
    or-long/2addr p0, v4

    .line 87
    const/4 v4, 0x2

    .line 88
    aget-byte v4, v0, v4

    .line 89
    .line 90
    int-to-long v4, v4

    .line 91
    and-long/2addr v4, v1

    .line 92
    const/16 v6, 0x9

    .line 93
    .line 94
    shl-long/2addr v4, v6

    .line 95
    or-long/2addr p0, v4

    .line 96
    const/4 v4, 0x3

    .line 97
    aget-byte v4, v0, v4

    .line 98
    .line 99
    int-to-long v4, v4

    .line 100
    and-long/2addr v4, v1

    .line 101
    shl-long v3, v4, v3

    .line 102
    .line 103
    or-long/2addr p0, v3

    .line 104
    const/4 v3, 0x4

    .line 105
    aget-byte v0, v0, v3

    .line 106
    .line 107
    int-to-long v3, v0

    .line 108
    and-long v0, v3, v1

    .line 109
    .line 110
    shr-long/2addr v0, p2

    .line 111
    or-long/2addr p0, v0

    .line 112
    return-wide p0

    .line 113
    :cond_3
    return-wide v1
.end method

.method public static Q(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getDrawableState()[I

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    array-length v2, p0

    .line 29
    array-length v3, p0

    .line 30
    array-length v4, v1

    .line 31
    add-int/2addr v3, v4

    .line 32
    invoke-static {p0, v3}, Ljava/util/Arrays;->copyOf([II)[I

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const/4 v3, 0x0

    .line 37
    array-length v4, v1

    .line 38
    invoke-static {v1, v3, p0, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {p2, p0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p2, p0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    :goto_0
    return-void
.end method

.method public static R(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V
    .locals 3

    .line 1
    sget-object v0, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->hasOnClickListeners()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    move p1, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move p1, v1

    .line 14
    :goto_0
    if-nez v0, :cond_1

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    :cond_1
    move v1, v2

    .line 19
    :cond_2
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/google/android/material/internal/CheckableImageButton;->setPressable(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Landroid/view/View;->setLongClickable(Z)V

    .line 29
    .line 30
    .line 31
    if-eqz v1, :cond_3

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_3
    const/4 v2, 0x2

    .line 35
    :goto_1
    invoke-virtual {p0, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static S(I)Ldefpackage/ck4;
    .locals 2

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    and-int/lit8 v1, p0, 0x2

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const v1, 0x44bb8000    # 1500.0f

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/high16 v1, 0x43c80000    # 400.0f

    .line 16
    .line 17
    :goto_0
    and-int/lit8 p0, p0, 0x4

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    :cond_1
    new-instance p0, Ldefpackage/ck4;

    .line 23
    .line 24
    invoke-direct {p0, v1, v0}, Ldefpackage/ck4;-><init>(FLjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public static T(ILdefpackage/ry0;I)Ldefpackage/yy4;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x4

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    sget-object p1, Ldefpackage/sy0;->a:Ldefpackage/gg0;

    .line 6
    .line 7
    :cond_0
    new-instance p2, Ldefpackage/yy4;

    .line 8
    .line 9
    invoke-direct {p2, p0, p1}, Ldefpackage/yy4;-><init>(ILdefpackage/ry0;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public static U(Ljava/util/ArrayList;IJ)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "Failed requirement."

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-gt v2, v0, :cond_6

    .line 9
    .line 10
    const/16 v3, 0x1f5

    .line 11
    .line 12
    if-ge v0, v3, :cond_6

    .line 13
    .line 14
    if-ltz p1, :cond_5

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-ge p1, v0, :cond_5

    .line 21
    .line 22
    const-wide/16 v3, 0x0

    .line 23
    .line 24
    cmp-long p1, p2, v3

    .line 25
    .line 26
    if-ltz p1, :cond_4

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    const/4 p2, 0x0

    .line 40
    :goto_0
    if-ge p2, p1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    add-int/lit8 p2, p2, 0x1

    .line 47
    .line 48
    check-cast p3, Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result p3

    .line 54
    if-gt v2, p3, :cond_1

    .line 55
    .line 56
    const/16 v0, 0x201

    .line 57
    .line 58
    if-ge p3, v0, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-static {v1}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    :goto_1
    invoke-static {p0}, Ldefpackage/q40;->t0(Ljava/util/ArrayList;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-ne p1, p0, :cond_3

    .line 78
    .line 79
    return-void

    .line 80
    :cond_3
    invoke-static {v1}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_4
    invoke-static {v1}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_5
    invoke-static {v1}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_6
    invoke-static {v1}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public static final V(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Bundle;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID"

    .line 10
    .line 11
    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string p0, "com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE"

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, p0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string p0, "com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER"

    .line 21
    .line 22
    invoke-virtual {v0, p0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string p0, "com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED"

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-virtual {v0, p0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    const-string p0, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE"

    .line 32
    .line 33
    const-string v1, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL"

    .line 34
    .line 35
    invoke-virtual {v0, p0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public static a(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v2, v1

    .line 24
    check-cast v2, Ldefpackage/pr3;

    .line 25
    .line 26
    sget-object v3, Ldefpackage/pr3;->p:Ldefpackage/pr3;

    .line 27
    .line 28
    if-eq v2, v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 35
    .line 36
    const/16 v1, 0xa

    .line 37
    .line 38
    invoke-static {v0, v1}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/4 v2, 0x0

    .line 50
    :goto_1
    if-ge v2, v1, :cond_2

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    check-cast v3, Ldefpackage/pr3;

    .line 59
    .line 60
    iget-object v3, v3, Ldefpackage/pr3;->n:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    return-object p0
.end method

.method public static b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getDrawableState()[I

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    array-length v2, p0

    .line 28
    array-length v3, p0

    .line 29
    array-length v4, v1

    .line 30
    add-int/2addr v3, v4

    .line 31
    invoke-static {p0, v3}, Ljava/util/Arrays;->copyOf([II)[I

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const/4 v3, 0x0

    .line 36
    array-length v4, v1

    .line 37
    invoke-static {v1, v3, p0, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {p2, p0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v0, p2}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    if-eqz p3, :cond_1

    .line 60
    .line 61
    invoke-virtual {v0, p3}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-eq p0, v0, :cond_2

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    return-void
.end method

.method public static d(Ldefpackage/bi0;Ldefpackage/se4;)Ldefpackage/kx;
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/kx;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/kx;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Ldefpackage/kx;->n:Ldefpackage/se4;

    .line 7
    .line 8
    iput-object p0, v0, Ldefpackage/kx;->r:Ldefpackage/bi0;

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    iput-boolean p0, v0, Ldefpackage/kx;->q:Z

    .line 12
    .line 13
    const/4 p0, 0x2

    .line 14
    iput p0, v0, Ldefpackage/kx;->s:I

    .line 15
    .line 16
    return-object v0
.end method

.method public static f(ILandroid/content/Context;Ljava/lang/String;)I
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1, p0}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_4

    .line 14
    .line 15
    array-length p1, p0

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    array-length p1, p0

    .line 20
    const/4 v1, 0x0

    .line 21
    move v2, v1

    .line 22
    :goto_0
    if-ge v2, p1, :cond_3

    .line 23
    .line 24
    aget-object v3, p0, v2

    .line 25
    .line 26
    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    return v1

    .line 33
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    return v0

    .line 37
    :cond_4
    :goto_1
    const/4 p0, 0x2

    .line 38
    return p0
.end method

.method public static g(Ljava/util/List;)[B
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/tv;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Ldefpackage/au0;->a(Ljava/util/List;)Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    check-cast v3, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-virtual {v0, v4}, Ldefpackage/tv;->Y(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v3}, Ldefpackage/tv;->d0(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iget-wide v1, v0, Ldefpackage/tv;->o:J

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Ldefpackage/tv;->F(J)[B

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public static h(I)Landroid/widget/ImageView$ScaleType;
    .locals 1

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_4

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p0, v0, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p0, v0, :cond_2

    .line 11
    .line 12
    const/4 v0, 0x5

    .line 13
    if-eq p0, v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x6

    .line 16
    if-eq p0, v0, :cond_0

    .line 17
    .line 18
    sget-object p0, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    sget-object p0, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    sget-object p0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_2
    sget-object p0, Landroid/widget/ImageView$ScaleType;->FIT_END:Landroid/widget/ImageView$ScaleType;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_3
    sget-object p0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_4
    sget-object p0, Landroid/widget/ImageView$ScaleType;->FIT_START:Landroid/widget/ImageView$ScaleType;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_5
    sget-object p0, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    .line 37
    .line 38
    return-object p0
.end method

.method public static final j(JLdefpackage/wd0;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Ldefpackage/cz;

    .line 9
    .line 10
    invoke-static {p2}, Ldefpackage/ya4;->x(Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, v1, p2}, Ldefpackage/cz;-><init>(ILdefpackage/vd0;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ldefpackage/cz;->u()V

    .line 19
    .line 20
    .line 21
    const-wide v1, 0x7fffffffffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmp-long p2, p0, v1

    .line 27
    .line 28
    if-gez p2, :cond_1

    .line 29
    .line 30
    iget-object p2, v0, Ldefpackage/cz;->r:Ldefpackage/ne0;

    .line 31
    .line 32
    invoke-static {p2}, Ldefpackage/au0;->t(Ldefpackage/ne0;)Ldefpackage/ao0;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-interface {p2, p0, p1, v0}, Ldefpackage/ao0;->H(JLdefpackage/cz;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {v0}, Ldefpackage/cz;->q()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    sget-object p1, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 44
    .line 45
    if-ne p0, p1, :cond_2

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_2
    :goto_0
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 49
    .line 50
    return-object p0
.end method

.method public static k(Ldefpackage/ju1;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-interface {p0}, Ldefpackage/ju1;->c()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    :cond_0
    return-void
.end method

.method public static l(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/util/function/IntConsumer;)V
    .locals 8

    .line 1
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    new-instance v6, Landroid/os/Handler;

    .line 35
    .line 36
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {v6, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Ldefpackage/ud3;->o()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    invoke-static {p0}, Ldefpackage/au0;->w(Landroid/content/Context;)Ldefpackage/eu0;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance v0, Ldefpackage/tj;

    .line 62
    .line 63
    const/4 v1, 0x2

    .line 64
    invoke-direct {v0, v1, p0}, Ldefpackage/tj;-><init>(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Ljava/util/List;

    .line 80
    .line 81
    invoke-static {p1}, Ldefpackage/gi1;->H(Ljava/util/List;)Ljava/util/ArrayList;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    new-instance v2, Ldefpackage/xt0;

    .line 90
    .line 91
    invoke-direct {v2, p2, p3}, Ldefpackage/xt0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    invoke-interface {p2, p3}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    check-cast p2, Ljava/util/List;

    .line 107
    .line 108
    invoke-virtual {p0, v0, p2, p4}, Ldefpackage/eu0;->a(Ljava/util/ArrayList;Ljava/util/List;Z)I

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    if-nez p0, :cond_1

    .line 113
    .line 114
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-nez p1, :cond_1

    .line 119
    .line 120
    const/4 p0, -0x1

    .line 121
    :cond_1
    invoke-interface {p5, p0}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_2
    new-instance p0, Ljava/lang/Thread;

    .line 126
    .line 127
    new-instance v0, Ldefpackage/yt0;

    .line 128
    .line 129
    move-object v3, p2

    .line 130
    move-object v4, p3

    .line 131
    move v5, p4

    .line 132
    move-object v7, p5

    .line 133
    invoke-direct/range {v0 .. v7}, Ldefpackage/yt0;-><init>(Ljava/util/LinkedHashMap;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLandroid/os/Handler;Ljava/util/function/IntConsumer;)V

    .line 134
    .line 135
    .line 136
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method public static declared-synchronized m(Landroid/content/Context;)V
    .locals 8

    .line 1
    const-class v1, Ldefpackage/au0;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    sget-object v0, Ldefpackage/au0;->t:Ldefpackage/lt0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    new-instance v2, Ldefpackage/lt0;

    .line 9
    .line 10
    invoke-static {p0}, Ldefpackage/au0;->s(Landroid/content/Context;)Ldefpackage/tk4;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    invoke-static {p0}, Ldefpackage/au0;->u(Landroid/content/Context;)Ldefpackage/se4;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    invoke-static {}, Ldefpackage/au0;->x()Ldefpackage/bi0;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    const/4 v0, 0x6

    .line 23
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    move-object v3, p0

    .line 28
    invoke-direct/range {v2 .. v7}, Ldefpackage/lt0;-><init>(Landroid/content/Context;Ldefpackage/tk4;Ldefpackage/se4;Ldefpackage/bi0;Ljava/util/concurrent/ExecutorService;)V

    .line 29
    .line 30
    .line 31
    sput-object v2, Ldefpackage/au0;->t:Ldefpackage/lt0;

    .line 32
    .line 33
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string v0, "download_wifi_only"

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-interface {p0, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_0

    .line 52
    .line 53
    sget-object p0, Ldefpackage/au0;->t:Ldefpackage/lt0;

    .line 54
    .line 55
    new-instance v0, Ldefpackage/h04;

    .line 56
    .line 57
    const/4 v2, 0x2

    .line 58
    invoke-direct {v0, v2}, Ldefpackage/h04;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, Ldefpackage/lt0;->d(Ldefpackage/h04;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    move-object p0, v0

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    :goto_0
    new-instance p0, Ldefpackage/eu0;

    .line 69
    .line 70
    invoke-static {}, Ldefpackage/au0;->x()Ldefpackage/bi0;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sget-object v2, Ldefpackage/au0;->t:Ldefpackage/lt0;

    .line 75
    .line 76
    invoke-direct {p0, v3, v0, v2}, Ldefpackage/eu0;-><init>(Landroid/content/Context;Ldefpackage/bi0;Ldefpackage/lt0;)V

    .line 77
    .line 78
    .line 79
    sput-object p0, Ldefpackage/au0;->u:Ldefpackage/eu0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    :cond_1
    monitor-exit v1

    .line 82
    return-void

    .line 83
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    throw p0
.end method

.method public static n(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, p1, :cond_1

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    return v1

    .line 15
    :cond_1
    return v0
.end method

.method public static final o(Landroid/view/View;I)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    const v2, 0x7fffffff

    .line 4
    .line 5
    .line 6
    move-object v3, v0

    .line 7
    :goto_0
    if-eqz p0, :cond_4

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    if-eqz v4, :cond_2

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    move-object v3, v4

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_1
    :goto_1
    move v2, v1

    .line 27
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    invoke-static {p0}, Ldefpackage/au0;->z(Landroid/view/View;)Landroid/view/ViewParent;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    instance-of v4, p0, Landroid/view/View;

    .line 34
    .line 35
    if-eqz v4, :cond_3

    .line 36
    .line 37
    check-cast p0, Landroid/view/View;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_3
    move-object p0, v0

    .line 41
    goto :goto_0

    .line 42
    :cond_4
    :goto_2
    return v2
.end method

.method public static final p(Landroid/view/View;)Landroid/view/View;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const v0, 0x7f0a0658

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v0}, Ldefpackage/au0;->o(Landroid/view/View;I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const v1, 0x7f0a065b

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v1}, Ldefpackage/au0;->o(Landroid/view/View;I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x0

    .line 27
    move-object v2, p0

    .line 28
    move v3, v1

    .line 29
    move-object v1, v2

    .line 30
    :goto_0
    if-eqz p0, :cond_5

    .line 31
    .line 32
    if-ne v3, v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    instance-of v0, v0, Landroid/view/ViewGroup;

    .line 39
    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    return-object v2

    .line 43
    :cond_1
    invoke-static {p0}, Ldefpackage/au0;->q(Landroid/view/View;)Ldefpackage/h80;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    :cond_2
    return-object p0

    .line 50
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    invoke-static {p0}, Ldefpackage/au0;->z(Landroid/view/View;)Landroid/view/ViewParent;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    instance-of v4, v1, Landroid/view/View;

    .line 57
    .line 58
    if-eqz v4, :cond_4

    .line 59
    .line 60
    check-cast v1, Landroid/view/View;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_4
    const/4 v1, 0x0

    .line 64
    :goto_1
    move-object v5, v2

    .line 65
    move-object v2, p0

    .line 66
    move-object p0, v1

    .line 67
    move-object v1, v5

    .line 68
    goto :goto_0

    .line 69
    :cond_5
    return-object v1
.end method

.method public static final q(Landroid/view/View;)Ldefpackage/h80;
    .locals 2

    .line 1
    const v0, 0x7f0a00cd

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    instance-of v0, p0, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object p0, v1

    .line 17
    :goto_0
    if-eqz p0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ldefpackage/h80;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    return-object v1
.end method

.method public static r(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move-object v3, v2

    .line 8
    move v2, v1

    .line 9
    :cond_0
    :goto_0
    if-ge v2, v0, :cond_4

    .line 10
    .line 11
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    add-int/lit8 v2, v2, 0x1

    .line 16
    .line 17
    check-cast v4, Ldefpackage/xv4;

    .line 18
    .line 19
    iget-object v4, v4, Ldefpackage/xv4;->a:Ldefpackage/pv4;

    .line 20
    .line 21
    iget-object v4, v4, Ldefpackage/pv4;->g:Ldefpackage/tb1;

    .line 22
    .line 23
    iget-object v4, v4, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v4}, Ldefpackage/lw2;->l(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_1

    .line 30
    .line 31
    const-string p0, "video/mp4"

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    invoke-static {v4}, Ldefpackage/lw2;->i(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static {v4}, Ldefpackage/lw2;->j(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_0

    .line 47
    .line 48
    const-string v5, "image/heic"

    .line 49
    .line 50
    invoke-static {v4, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_3

    .line 55
    .line 56
    const-string v3, "image/heif"

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    const-string v5, "image/avif"

    .line 60
    .line 61
    invoke-static {v4, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_0

    .line 66
    .line 67
    move-object v3, v5

    .line 68
    goto :goto_0

    .line 69
    :cond_4
    if-eqz v1, :cond_5

    .line 70
    .line 71
    const-string p0, "audio/mp4"

    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_5
    if-eqz v3, :cond_6

    .line 75
    .line 76
    return-object v3

    .line 77
    :cond_6
    const-string p0, "application/mp4"

    .line 78
    .line 79
    return-object p0
.end method

.method public static declared-synchronized s(Landroid/content/Context;)Ldefpackage/tk4;
    .locals 5

    .line 1
    const-class v0, Ldefpackage/au0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ldefpackage/au0;->o:Ldefpackage/tk4;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Ldefpackage/tk4;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v2, "exoplayer_internal.db"

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x1

    .line 18
    invoke-direct {v1, p0, v2, v3, v4}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Ldefpackage/au0;->o:Ldefpackage/tk4;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    sget-object p0, Ldefpackage/au0;->o:Ldefpackage/tk4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-object p0

    .line 30
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    throw p0
.end method

.method public static final t(Ldefpackage/ne0;)Ldefpackage/ao0;
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/fz0;->R:Ldefpackage/fz0;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ldefpackage/ne0;->K(Ldefpackage/me0;)Ldefpackage/le0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, Ldefpackage/ao0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, Ldefpackage/ao0;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    :goto_0
    if-nez p0, :cond_1

    .line 16
    .line 17
    sget-object p0, Ldefpackage/qk0;->a:Ldefpackage/ao0;

    .line 18
    .line 19
    :cond_1
    return-object p0
.end method

.method public static declared-synchronized u(Landroid/content/Context;)Ldefpackage/se4;
    .locals 4

    .line 1
    const-class v0, Ldefpackage/au0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ldefpackage/au0;->r:Ldefpackage/se4;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Ljava/io/File;

    .line 9
    .line 10
    invoke-static {p0}, Ldefpackage/au0;->v(Landroid/content/Context;)Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "downloads"

    .line 15
    .line 16
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Ldefpackage/se4;

    .line 20
    .line 21
    new-instance v3, Ldefpackage/y53;

    .line 22
    .line 23
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Ldefpackage/au0;->s(Landroid/content/Context;)Ldefpackage/tk4;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {v2, v1, v3, p0}, Ldefpackage/se4;-><init>(Ljava/io/File;Ldefpackage/mx;Ldefpackage/tk4;)V

    .line 31
    .line 32
    .line 33
    sput-object v2, Ldefpackage/au0;->r:Ldefpackage/se4;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    :goto_0
    sget-object p0, Ldefpackage/au0;->r:Ldefpackage/se4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    monitor-exit v0

    .line 41
    return-object p0

    .line 42
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    throw p0
.end method

.method public static declared-synchronized v(Landroid/content/Context;)Ljava/io/File;
    .locals 5

    .line 1
    const-class v0, Ldefpackage/au0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ldefpackage/au0;->q:Ljava/io/File;

    .line 5
    .line 6
    if-nez v1, :cond_3

    .line 7
    .line 8
    invoke-static {}, Ldefpackage/ud3;->p()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v3}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    aget-object v1, v1, v2

    .line 21
    .line 22
    sput-object v1, Ldefpackage/au0;->q:Ljava/io/File;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/io/File;->canWrite()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_2

    .line 35
    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    sput-object p0, Ldefpackage/au0;->q:Ljava/io/File;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/4 v4, 0x1

    .line 43
    if-ne v1, v4, :cond_2

    .line 44
    .line 45
    :try_start_1
    invoke-virtual {p0, v3}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    aget-object v1, v1, v4

    .line 50
    .line 51
    sput-object v1, Ldefpackage/au0;->q:Ljava/io/File;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :catch_0
    :try_start_2
    invoke-virtual {p0, v3}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    aget-object p0, p0, v2

    .line 59
    .line 60
    sput-object p0, Ldefpackage/au0;->q:Ljava/io/File;

    .line 61
    .line 62
    invoke-static {v2}, Ldefpackage/ud3;->j0(I)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    invoke-virtual {p0, v3}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    aget-object p0, p0, v2

    .line 71
    .line 72
    sput-object p0, Ldefpackage/au0;->q:Ljava/io/File;

    .line 73
    .line 74
    :cond_3
    :goto_1
    sget-object p0, Ldefpackage/au0;->q:Ljava/io/File;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 75
    .line 76
    monitor-exit v0

    .line 77
    return-object p0

    .line 78
    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 79
    throw p0
.end method

.method public static declared-synchronized w(Landroid/content/Context;)Ldefpackage/eu0;
    .locals 1

    .line 1
    const-class v0, Ldefpackage/au0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p0}, Ldefpackage/au0;->m(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    sget-object p0, Ldefpackage/au0;->u:Ldefpackage/eu0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-object p0

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw p0
.end method

.method public static declared-synchronized x()Ldefpackage/bi0;
    .locals 4

    .line 1
    const-class v0, Ldefpackage/au0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ldefpackage/au0;->n:Ldefpackage/om1;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Ljava/net/CookieManager;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/net/CookieManager;-><init>()V

    .line 11
    .line 12
    .line 13
    sget-object v2, Ljava/net/CookiePolicy;->ACCEPT_ORIGINAL_SERVER:Ljava/net/CookiePolicy;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/net/CookieManager;->setCookiePolicy(Ljava/net/CookiePolicy;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Ljava/net/CookieHandler;->setDefault(Ljava/net/CookieHandler;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ldefpackage/om1;

    .line 22
    .line 23
    new-instance v2, Ldefpackage/bl0;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-direct {v2, v3}, Ldefpackage/bl0;-><init>(I)V

    .line 27
    .line 28
    .line 29
    sget-object v3, Ldefpackage/lp1;->e:Ldefpackage/kp1;

    .line 30
    .line 31
    iput-object v3, v2, Ldefpackage/bl0;->r:Ljava/lang/Object;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    iput-boolean v3, v2, Ldefpackage/bl0;->p:Z

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-direct {v1, v3, v2}, Ldefpackage/om1;-><init>(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sput-object v1, Ldefpackage/au0;->n:Ldefpackage/om1;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v1

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    :goto_0
    sget-object v1, Ldefpackage/au0;->n:Ldefpackage/om1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    monitor-exit v0

    .line 48
    return-object v1

    .line 49
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    throw v1
.end method

.method public static declared-synchronized y()Ldefpackage/bl0;
    .locals 5

    .line 1
    const-class v0, Ldefpackage/au0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/net/CookieManager;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/net/CookieManager;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object v2, Ljava/net/CookiePolicy;->ACCEPT_ORIGINAL_SERVER:Ljava/net/CookiePolicy;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/net/CookieManager;->setCookiePolicy(Ljava/net/CookiePolicy;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Ljava/net/CookieHandler;->setDefault(Ljava/net/CookieHandler;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v2, "Icy-MetaData"

    .line 23
    .line 24
    const-string v3, "1"

    .line 25
    .line 26
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    const-string v2, "User-Agent"

    .line 30
    .line 31
    const-string v3, "Tempus/1.0"

    .line 32
    .line 33
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    new-instance v2, Ldefpackage/bl0;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-direct {v2, v3}, Ldefpackage/bl0;-><init>(I)V

    .line 40
    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    iput-boolean v3, v2, Ldefpackage/bl0;->p:Z

    .line 44
    .line 45
    iget-object v3, v2, Ldefpackage/bl0;->q:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v3, Ldefpackage/qr2;

    .line 48
    .line 49
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 50
    const/4 v4, 0x0

    .line 51
    :try_start_1
    iput-object v4, v3, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 52
    .line 53
    iget-object v4, v3, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v4, Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 58
    .line 59
    .line 60
    iget-object v4, v3, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v4, Ljava/util/HashMap;

    .line 63
    .line 64
    invoke-virtual {v4, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    .line 66
    .line 67
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 68
    monitor-exit v0

    .line 69
    return-object v2

    .line 70
    :catchall_0
    move-exception v1

    .line 71
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 72
    :try_start_4
    throw v1

    .line 73
    :catchall_1
    move-exception v1

    .line 74
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 75
    throw v1
.end method

.method public static final z(Landroid/view/View;)Landroid/view/ViewParent;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    const v0, 0x7f0a0657

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    instance-of v0, p0, Landroid/view/ViewParent;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    check-cast p0, Landroid/view/ViewParent;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method


# virtual methods
.method public H(Ldefpackage/x34;Ljava/lang/Iterable;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0}, Ldefpackage/au0;->i()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p1, v0}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :try_start_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, p1, v0}, Ldefpackage/au0;->c(Ldefpackage/z34;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1}, Ldefpackage/z34;->O()Z

    .line 35
    .line 36
    .line 37
    invoke-interface {p1}, Ldefpackage/z34;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    const/4 p0, 0x0

    .line 44
    invoke-static {p1, p0}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :goto_1
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 49
    :catchall_1
    move-exception p2

    .line 50
    invoke-static {p1, p0}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    throw p2
.end method

.method public I(Ldefpackage/x34;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0}, Ldefpackage/au0;->i()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p1, v0}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ldefpackage/au0;->c(Ldefpackage/z34;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ldefpackage/z34;->O()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    invoke-static {p1, p0}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    :catchall_1
    move-exception p2

    .line 29
    invoke-static {p1, p0}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    throw p2
.end method

.method public abstract M(I)V
.end method

.method public abstract N(Landroid/graphics/Typeface;)V
.end method

.method public abstract c(Ldefpackage/z34;Ljava/lang/Object;)V
.end method

.method public e(I)V
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ldefpackage/ul;

    .line 11
    .line 12
    const/4 v2, 0x5

    .line 13
    invoke-direct {v1, p1, v2, p0}, Ldefpackage/ul;-><init>(IILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public abstract i()Ljava/lang/String;
.end method
