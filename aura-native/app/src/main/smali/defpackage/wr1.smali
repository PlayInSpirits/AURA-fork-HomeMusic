.class public abstract Ldefpackage/wr1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ldefpackage/z95;

.field public static final b:Ldefpackage/z95;

.field public static final c:Ldefpackage/z95;

.field public static final d:Ldefpackage/z95;

.field public static final e:[F

.field public static final f:Ldefpackage/wv3;

.field public static g:Ljava/lang/reflect/Field; = null

.field public static h:Z = false

.field public static i:Z = true


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/z95;

    .line 2
    .line 3
    const v1, 0x3e9ec02f    # 0.31006f

    .line 4
    .line 5
    .line 6
    const v2, 0x3ea1dfb9    # 0.31616f

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Ldefpackage/z95;-><init>(FF)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Ldefpackage/wr1;->a:Ldefpackage/z95;

    .line 13
    .line 14
    new-instance v0, Ldefpackage/z95;

    .line 15
    .line 16
    const v1, 0x3eb0fba9

    .line 17
    .line 18
    .line 19
    const v2, 0x3eb78d50    # 0.3585f

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, Ldefpackage/z95;-><init>(FF)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Ldefpackage/wr1;->b:Ldefpackage/z95;

    .line 26
    .line 27
    new-instance v0, Ldefpackage/z95;

    .line 28
    .line 29
    const v1, 0x3ea4b33e    # 0.32168f

    .line 30
    .line 31
    .line 32
    const v2, 0x3eace315    # 0.33767f

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v1, v2}, Ldefpackage/z95;-><init>(FF)V

    .line 36
    .line 37
    .line 38
    sput-object v0, Ldefpackage/wr1;->c:Ldefpackage/z95;

    .line 39
    .line 40
    new-instance v0, Ldefpackage/z95;

    .line 41
    .line 42
    const v1, 0x3ea01b86

    .line 43
    .line 44
    .line 45
    const v2, 0x3ea8754f    # 0.32902f

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1, v2}, Ldefpackage/z95;-><init>(FF)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Ldefpackage/wr1;->d:Ldefpackage/z95;

    .line 52
    .line 53
    const/4 v0, 0x3

    .line 54
    new-array v0, v0, [F

    .line 55
    .line 56
    fill-array-data v0, :array_0

    .line 57
    .line 58
    .line 59
    sput-object v0, Ldefpackage/wr1;->e:[F

    .line 60
    .line 61
    new-instance v0, Ldefpackage/wv3;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    const/high16 v2, 0x41200000    # 10.0f

    .line 65
    .line 66
    invoke-direct {v0, v1, v1, v2, v2}, Ldefpackage/wv3;-><init>(FFFF)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Ldefpackage/wr1;->f:Ldefpackage/wv3;

    .line 70
    .line 71
    return-void

    .line 72
    nop

    .line 73
    :array_0
    .array-data 4
        0x3f76d699    # 0.964212f
        0x3f800000    # 1.0f
        0x3f533f85
    .end array-data
.end method

.method public static final A(Landroid/view/View;)Ldefpackage/ho3;
    .locals 2

    .line 1
    const v0, 0x7f0a04e7

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Ldefpackage/ho3;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ldefpackage/ho3;

    .line 13
    .line 14
    invoke-direct {v1}, Ldefpackage/ho3;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-object v1
.end method

.method public static C(Landroid/content/Context;)Ljava/io/File;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v2, ".font"

    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, "-"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v2, 0x0

    .line 43
    :goto_0
    const/16 v3, 0x64

    .line 44
    .line 45
    if-ge v2, v3, :cond_2

    .line 46
    .line 47
    new-instance v3, Ljava/io/File;

    .line 48
    .line 49
    new-instance v4, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-direct {v3, p0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    .line 68
    .line 69
    .line 70
    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    if-eqz v4, :cond_1

    .line 72
    .line 73
    return-object v3

    .line 74
    :catch_0
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    return-object v0
.end method

.method public static final E(Ljava/lang/AssertionError;)Z
    .locals 2

    .line 1
    sget-object v0, Ldefpackage/p83;->a:Ljava/util/logging/Logger;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const-string v0, "getsockname failed"

    .line 17
    .line 18
    invoke-static {p0, v0}, Ldefpackage/qm4;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move p0, v1

    .line 24
    :goto_0
    if-eqz p0, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_1
    return v1
.end method

.method public static final F(Landroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ldefpackage/fh0;->a(I)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    sget-wide v2, Ldefpackage/g42;->h:J

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3}, Ldefpackage/g42;->a(JJ)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    sget-wide v2, Ldefpackage/g42;->k:J

    .line 18
    .line 19
    invoke-static {v0, v1, v2, v3}, Ldefpackage/g42;->a(JJ)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    sget-wide v2, Ldefpackage/g42;->o:J

    .line 26
    .line 27
    invoke-static {v0, v1, v2, v3}, Ldefpackage/g42;->a(JJ)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    sget-wide v2, Ldefpackage/g42;->j:J

    .line 34
    .line 35
    invoke-static {v0, v1, v2, v3}, Ldefpackage/g42;->a(JJ)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 p0, 0x0

    .line 43
    return p0

    .line 44
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 45
    return p0
.end method

.method public static final H(Ldefpackage/i94;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/i94;->d()Ldefpackage/f63;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Ldefpackage/i94;->d:Ldefpackage/e94;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/e94;->n:Ldefpackage/w03;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ldefpackage/f63;->J0()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v1

    .line 18
    :goto_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    sget-object v0, Ldefpackage/n94;->p:Ldefpackage/p94;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ldefpackage/w03;->c(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    sget-object v0, Ldefpackage/n94;->o:Ldefpackage/p94;

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ldefpackage/w03;->c(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_3

    .line 37
    .line 38
    :goto_1
    const/4 p0, 0x1

    .line 39
    return p0

    .line 40
    :cond_3
    return v1
.end method

.method public static final I(Ldefpackage/i94;)Z
    .locals 14

    .line 1
    invoke-static {p0}, Ldefpackage/wr1;->H(Ldefpackage/i94;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_3

    .line 9
    :cond_0
    iget-object p0, p0, Ldefpackage/i94;->d:Ldefpackage/e94;

    .line 10
    .line 11
    iget-boolean v0, p0, Ldefpackage/e94;->p:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_1
    iget-object p0, p0, Ldefpackage/e94;->n:Ldefpackage/w03;

    .line 17
    .line 18
    iget-object v0, p0, Ldefpackage/w03;->b:[Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v2, p0, Ldefpackage/w03;->c:[Ljava/lang/Object;

    .line 21
    .line 22
    iget-object p0, p0, Ldefpackage/w03;->a:[J

    .line 23
    .line 24
    array-length v3, p0

    .line 25
    add-int/lit8 v3, v3, -0x2

    .line 26
    .line 27
    if-ltz v3, :cond_5

    .line 28
    .line 29
    move v4, v1

    .line 30
    :goto_0
    aget-wide v5, p0, v4

    .line 31
    .line 32
    not-long v7, v5

    .line 33
    const/4 v9, 0x7

    .line 34
    shl-long/2addr v7, v9

    .line 35
    and-long/2addr v7, v5

    .line 36
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    and-long/2addr v7, v9

    .line 42
    cmp-long v7, v7, v9

    .line 43
    .line 44
    if-eqz v7, :cond_4

    .line 45
    .line 46
    sub-int v7, v4, v3

    .line 47
    .line 48
    not-int v7, v7

    .line 49
    ushr-int/lit8 v7, v7, 0x1f

    .line 50
    .line 51
    const/16 v8, 0x8

    .line 52
    .line 53
    rsub-int/lit8 v7, v7, 0x8

    .line 54
    .line 55
    move v9, v1

    .line 56
    :goto_1
    if-ge v9, v7, :cond_3

    .line 57
    .line 58
    const-wide/16 v10, 0xff

    .line 59
    .line 60
    and-long/2addr v10, v5

    .line 61
    const-wide/16 v12, 0x80

    .line 62
    .line 63
    cmp-long v10, v10, v12

    .line 64
    .line 65
    if-gez v10, :cond_2

    .line 66
    .line 67
    shl-int/lit8 v10, v4, 0x3

    .line 68
    .line 69
    add-int/2addr v10, v9

    .line 70
    aget-object v11, v0, v10

    .line 71
    .line 72
    aget-object v10, v2, v10

    .line 73
    .line 74
    check-cast v11, Ldefpackage/p94;

    .line 75
    .line 76
    iget-boolean v10, v11, Ldefpackage/p94;->c:Z

    .line 77
    .line 78
    if-eqz v10, :cond_2

    .line 79
    .line 80
    :goto_2
    const/4 p0, 0x1

    .line 81
    return p0

    .line 82
    :cond_2
    shr-long/2addr v5, v8

    .line 83
    add-int/lit8 v9, v9, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    if-ne v7, v8, :cond_5

    .line 87
    .line 88
    :cond_4
    if-eq v4, v3, :cond_5

    .line 89
    .line 90
    add-int/lit8 v4, v4, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    :goto_3
    return v1
.end method

.method public static final K(Ldefpackage/g34;)Z
    .locals 6

    .line 1
    iget-wide v0, p0, Ldefpackage/g34;->e:J

    .line 2
    .line 3
    const/16 v2, 0x20

    .line 4
    .line 5
    ushr-long v2, v0, v2

    .line 6
    .line 7
    const-wide v4, 0xffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    and-long/2addr v4, v0

    .line 13
    cmp-long v2, v2, v4

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    iget-wide v2, p0, Ldefpackage/g34;->f:J

    .line 18
    .line 19
    cmp-long v2, v0, v2

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget-wide v2, p0, Ldefpackage/g34;->g:J

    .line 24
    .line 25
    cmp-long v2, v0, v2

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    iget-wide v2, p0, Ldefpackage/g34;->h:J

    .line 30
    .line 31
    cmp-long p0, v0, v2

    .line 32
    .line 33
    if-nez p0, :cond_0

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public static M(Ljava/util/concurrent/ExecutorService;)Ldefpackage/mx2;
    .locals 1

    .line 1
    instance-of v0, p0, Ldefpackage/mx2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ldefpackage/mx2;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    new-instance v0, Ldefpackage/px2;

    .line 13
    .line 14
    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Ldefpackage/px2;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_1
    new-instance v0, Ldefpackage/mx2;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Ldefpackage/mx2;-><init>(Ljava/util/concurrent/ExecutorService;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public static N(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    const-string v0, "r"

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0, v1}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/FileInputStream;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    :try_start_2
    invoke-virtual {p1}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    .line 34
    .line 35
    .line 36
    move-result-wide v6

    .line 37
    sget-object v3, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;

    .line 38
    .line 39
    const-wide/16 v4, 0x0

    .line 40
    .line 41
    invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    .line 42
    .line 43
    .line 44
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 45
    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 46
    .line 47
    .line 48
    :try_start_4
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    move-object p1, v0

    .line 54
    goto :goto_1

    .line 55
    :catchall_1
    move-exception v0

    .line 56
    move-object v2, v0

    .line 57
    :try_start_5
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_2
    move-exception v0

    .line 62
    move-object p1, v0

    .line 63
    :try_start_6
    invoke-virtual {v2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 67
    :goto_1
    :try_start_7
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :catchall_3
    move-exception v0

    .line 72
    move-object p0, v0

    .line 73
    :try_start_8
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :goto_2
    throw p1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    .line 77
    :catch_0
    :cond_1
    return-object v1
.end method

.method public static O(Landroid/view/inputmethod/EditorInfo;Landroid/view/inputmethod/InputConnection;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Landroid/view/inputmethod/EditorInfo;->hintText:Ljava/lang/CharSequence;

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    instance-of p1, p0, Landroid/view/View;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void
.end method

.method public static final P(Ldefpackage/cz;Ldefpackage/vd0;Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/cz;->s()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Ldefpackage/cz;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    new-instance p0, Ldefpackage/s14;

    .line 12
    .line 13
    invoke-direct {p0, v1}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0, v0}, Ldefpackage/cz;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_0
    if-eqz p2, :cond_6

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast p1, Ldefpackage/mr0;

    .line 27
    .line 28
    iget-object p2, p1, Ldefpackage/mr0;->r:Ldefpackage/wd0;

    .line 29
    .line 30
    iget-object p1, p1, Ldefpackage/mr0;->t:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-interface {p2}, Ldefpackage/vd0;->getContext()Ldefpackage/ne0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0, p1}, Ldefpackage/te5;->R(Ldefpackage/ne0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    sget-object v1, Ldefpackage/te5;->b:Ldefpackage/f01;

    .line 41
    .line 42
    if-eq p1, v1, :cond_1

    .line 43
    .line 44
    invoke-static {p2, v0, p1}, Ldefpackage/jz4;->Q(Ldefpackage/vd0;Ldefpackage/ne0;Ljava/lang/Object;)Ldefpackage/f15;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const/4 v1, 0x0

    .line 50
    :goto_1
    :try_start_0
    invoke-interface {p2, p0}, Ldefpackage/vd0;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    invoke-virtual {v1}, Ldefpackage/f15;->m0()Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-eqz p0, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    return-void

    .line 63
    :cond_3
    :goto_2
    invoke-static {v0, p1}, Ldefpackage/te5;->K(Ldefpackage/ne0;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :catchall_0
    move-exception p0

    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    invoke-virtual {v1}, Ldefpackage/f15;->m0()Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-eqz p2, :cond_5

    .line 75
    .line 76
    :cond_4
    invoke-static {v0, p1}, Ldefpackage/te5;->K(Ldefpackage/ne0;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_5
    throw p0

    .line 80
    :cond_6
    invoke-interface {p1, p0}, Ldefpackage/vd0;->resumeWith(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public static final Q(Ldefpackage/b94;I)I
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/b94;->s:[I

    .line 2
    .line 3
    add-int/lit8 p1, p1, 0x1

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/b94;->r:[[B

    .line 6
    .line 7
    array-length p0, p0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    add-int/lit8 p0, p0, -0x1

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-gt v1, p0, :cond_1

    .line 15
    .line 16
    add-int v2, v1, p0

    .line 17
    .line 18
    ushr-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    aget v3, v0, v2

    .line 21
    .line 22
    if-ge v3, p1, :cond_0

    .line 23
    .line 24
    add-int/lit8 v1, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-le v3, p1, :cond_2

    .line 28
    .line 29
    add-int/lit8 p0, v2, -0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    neg-int p0, v1

    .line 33
    add-int/lit8 v2, p0, -0x1

    .line 34
    .line 35
    :cond_2
    if-ltz v2, :cond_3

    .line 36
    .line 37
    return v2

    .line 38
    :cond_3
    not-int p0, v2

    .line 39
    return p0
.end method

.method public static final a(FFFFJ)Ldefpackage/g34;
    .locals 17

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p4, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-wide v2, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    and-long v4, p4, v2

    .line 16
    .line 17
    long-to-int v4, v4

    .line 18
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    int-to-long v5, v1

    .line 27
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    int-to-long v7, v1

    .line 32
    shl-long v0, v5, v0

    .line 33
    .line 34
    and-long/2addr v2, v7

    .line 35
    or-long v9, v0, v2

    .line 36
    .line 37
    new-instance v4, Ldefpackage/g34;

    .line 38
    .line 39
    move-wide v11, v9

    .line 40
    move-wide v13, v9

    .line 41
    move-wide v15, v9

    .line 42
    move/from16 v5, p0

    .line 43
    .line 44
    move/from16 v6, p1

    .line 45
    .line 46
    move/from16 v7, p2

    .line 47
    .line 48
    move/from16 v8, p3

    .line 49
    .line 50
    invoke-direct/range {v4 .. v16}, Ldefpackage/g34;-><init>(FFFFJJJJ)V

    .line 51
    .line 52
    .line 53
    return-object v4
.end method

.method public static final b(Z)Ljava/util/concurrent/ExecutorService;
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/s90;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldefpackage/s90;-><init>(Z)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Runtime;->availableProcessors()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    add-int/lit8 p0, p0, -0x1

    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    invoke-static {p0, v1}, Ljava/lang/Math;->min(II)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    const/4 v1, 0x2

    .line 22
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {p0, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    return-object p0
.end method

.method public static final c(Ldefpackage/q62;)Ldefpackage/wv3;
    .locals 6

    .line 1
    invoke-interface {p0}, Ldefpackage/q62;->u()Ldefpackage/q62;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-interface {v0, p0, v1}, Ldefpackage/q62;->C(Ldefpackage/q62;Z)Ldefpackage/wv3;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v0, Ldefpackage/wv3;

    .line 14
    .line 15
    invoke-interface {p0}, Ldefpackage/q62;->k()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    const/16 v3, 0x20

    .line 20
    .line 21
    shr-long/2addr v1, v3

    .line 22
    long-to-int v1, v1

    .line 23
    int-to-float v1, v1

    .line 24
    invoke-interface {p0}, Ldefpackage/q62;->k()J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    const-wide v4, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v2, v4

    .line 34
    long-to-int p0, v2

    .line 35
    int-to-float p0, p0

    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-direct {v0, v2, v2, v1, p0}, Ldefpackage/wv3;-><init>(FFFF)V

    .line 38
    .line 39
    .line 40
    return-object v0
.end method

.method public static final d(Ldefpackage/q62;Z)Ldefpackage/wv3;
    .locals 14

    .line 1
    invoke-static {p0}, Ldefpackage/wr1;->n(Ldefpackage/q62;)Ldefpackage/q62;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ldefpackage/q62;->k()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    const/16 v3, 0x20

    .line 10
    .line 11
    shr-long/2addr v1, v3

    .line 12
    long-to-int v1, v1

    .line 13
    int-to-float v1, v1

    .line 14
    invoke-interface {v0}, Ldefpackage/q62;->k()J

    .line 15
    .line 16
    .line 17
    move-result-wide v4

    .line 18
    const-wide v6, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr v4, v6

    .line 24
    long-to-int v2, v4

    .line 25
    int-to-float v2, v2

    .line 26
    invoke-interface {v0, p0, p1}, Ldefpackage/q62;->C(Ldefpackage/q62;Z)Ldefpackage/wv3;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget v4, p0, Ldefpackage/wv3;->a:F

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    cmpg-float v8, v4, v5

    .line 36
    .line 37
    if-gez v8, :cond_0

    .line 38
    .line 39
    move v4, v5

    .line 40
    :cond_0
    cmpl-float v8, v4, v1

    .line 41
    .line 42
    if-lez v8, :cond_1

    .line 43
    .line 44
    move v4, v1

    .line 45
    :cond_1
    iget v8, p0, Ldefpackage/wv3;->b:F

    .line 46
    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    cmpg-float v9, v8, v5

    .line 50
    .line 51
    if-gez v9, :cond_2

    .line 52
    .line 53
    move v8, v5

    .line 54
    :cond_2
    cmpl-float v9, v8, v2

    .line 55
    .line 56
    if-lez v9, :cond_3

    .line 57
    .line 58
    move v8, v2

    .line 59
    :cond_3
    iget v9, p0, Ldefpackage/wv3;->c:F

    .line 60
    .line 61
    if-eqz p1, :cond_6

    .line 62
    .line 63
    cmpg-float v10, v9, v5

    .line 64
    .line 65
    if-gez v10, :cond_4

    .line 66
    .line 67
    move v9, v5

    .line 68
    :cond_4
    cmpl-float v10, v9, v1

    .line 69
    .line 70
    if-lez v10, :cond_5

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_5
    move v1, v9

    .line 74
    :goto_0
    move v9, v1

    .line 75
    :cond_6
    iget p0, p0, Ldefpackage/wv3;->d:F

    .line 76
    .line 77
    if-eqz p1, :cond_9

    .line 78
    .line 79
    cmpg-float p1, p0, v5

    .line 80
    .line 81
    if-gez p1, :cond_7

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_7
    move v5, p0

    .line 85
    :goto_1
    cmpl-float p0, v5, v2

    .line 86
    .line 87
    if-lez p0, :cond_8

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_8
    move v2, v5

    .line 91
    :goto_2
    move p0, v2

    .line 92
    :cond_9
    cmpg-float p1, v4, v9

    .line 93
    .line 94
    if-nez p1, :cond_a

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_a
    cmpg-float p1, v8, p0

    .line 98
    .line 99
    if-nez p1, :cond_b

    .line 100
    .line 101
    :goto_3
    sget-object p0, Ldefpackage/wv3;->e:Ldefpackage/wv3;

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_b
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    int-to-long v1, p1

    .line 109
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    int-to-long v10, p1

    .line 114
    shl-long/2addr v1, v3

    .line 115
    and-long/2addr v10, v6

    .line 116
    or-long/2addr v1, v10

    .line 117
    invoke-interface {v0, v1, v2}, Ldefpackage/q62;->b(J)J

    .line 118
    .line 119
    .line 120
    move-result-wide v1

    .line 121
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    int-to-long v10, p1

    .line 126
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    int-to-long v12, p1

    .line 131
    shl-long/2addr v10, v3

    .line 132
    and-long/2addr v12, v6

    .line 133
    or-long/2addr v10, v12

    .line 134
    invoke-interface {v0, v10, v11}, Ldefpackage/q62;->b(J)J

    .line 135
    .line 136
    .line 137
    move-result-wide v10

    .line 138
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    int-to-long v8, p1

    .line 143
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    int-to-long v12, p1

    .line 148
    shl-long/2addr v8, v3

    .line 149
    and-long/2addr v12, v6

    .line 150
    or-long/2addr v8, v12

    .line 151
    invoke-interface {v0, v8, v9}, Ldefpackage/q62;->b(J)J

    .line 152
    .line 153
    .line 154
    move-result-wide v8

    .line 155
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    int-to-long v4, p1

    .line 160
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    int-to-long p0, p0

    .line 165
    shl-long/2addr v4, v3

    .line 166
    and-long/2addr p0, v6

    .line 167
    or-long/2addr p0, v4

    .line 168
    invoke-interface {v0, p0, p1}, Ldefpackage/q62;->b(J)J

    .line 169
    .line 170
    .line 171
    move-result-wide p0

    .line 172
    shr-long v4, v1, v3

    .line 173
    .line 174
    long-to-int v0, v4

    .line 175
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    shr-long v4, v10, v3

    .line 180
    .line 181
    long-to-int v4, v4

    .line 182
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    shr-long v12, p0, v3

    .line 187
    .line 188
    long-to-int v5, v12

    .line 189
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    shr-long v12, v8, v3

    .line 194
    .line 195
    long-to-int v3, v12

    .line 196
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    invoke-static {v5, v3}, Ljava/lang/Math;->min(FF)F

    .line 201
    .line 202
    .line 203
    move-result v12

    .line 204
    invoke-static {v4, v12}, Ljava/lang/Math;->min(FF)F

    .line 205
    .line 206
    .line 207
    move-result v12

    .line 208
    invoke-static {v0, v12}, Ljava/lang/Math;->min(FF)F

    .line 209
    .line 210
    .line 211
    move-result v12

    .line 212
    invoke-static {v5, v3}, Ljava/lang/Math;->max(FF)F

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    and-long/2addr v1, v6

    .line 225
    long-to-int v1, v1

    .line 226
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    and-long v2, v10, v6

    .line 231
    .line 232
    long-to-int v2, v2

    .line 233
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    and-long/2addr p0, v6

    .line 238
    long-to-int p0, p0

    .line 239
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 240
    .line 241
    .line 242
    move-result p0

    .line 243
    and-long v3, v8, v6

    .line 244
    .line 245
    long-to-int p1, v3

    .line 246
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    invoke-static {p0, p1}, Ljava/lang/Math;->min(FF)F

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    invoke-static {p0, p1}, Ljava/lang/Math;->max(FF)F

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    invoke-static {v2, p0}, Ljava/lang/Math;->max(FF)F

    .line 267
    .line 268
    .line 269
    move-result p0

    .line 270
    invoke-static {v1, p0}, Ljava/lang/Math;->max(FF)F

    .line 271
    .line 272
    .line 273
    move-result p0

    .line 274
    new-instance p1, Ldefpackage/wv3;

    .line 275
    .line 276
    invoke-direct {p1, v12, v3, v0, p0}, Ldefpackage/wv3;-><init>(FFFF)V

    .line 277
    .line 278
    .line 279
    return-object p1
.end method

.method public static final g(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/sb;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, p0, v1, v2}, Ldefpackage/sb;-><init>(Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ldefpackage/si0;->C(Ldefpackage/wf1;)Ldefpackage/ba4;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_0
    invoke-virtual {p0}, Ldefpackage/ba4;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Ldefpackage/ba4;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/view/View;

    .line 26
    .line 27
    invoke-static {v0}, Ldefpackage/wr1;->A(Landroid/view/View;)Ldefpackage/ho3;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v0, v0, Ldefpackage/ho3;->a:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-static {v0}, Ldefpackage/gb;->E(Ljava/util/List;)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    :goto_0
    const/4 v2, -0x1

    .line 38
    if-ge v2, v1, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ldefpackage/k65;

    .line 45
    .line 46
    iget-object v2, v2, Ldefpackage/k65;->a:Ldefpackage/b0;

    .line 47
    .line 48
    invoke-virtual {v2}, Ldefpackage/b0;->d()V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v1, v1, -0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return-void
.end method

.method public static final h(Ldefpackage/sc5;Ljava/lang/String;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/sc5;->c:Landroidx/work/impl/WorkDatabase;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->A()Ldefpackage/fd5;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->v()Ldefpackage/wo0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    filled-new-array {p1}, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-static {v2}, Ldefpackage/gb;->Q([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, 0x1

    .line 27
    if-nez v3, :cond_1

    .line 28
    .line 29
    invoke-static {v2}, Ldefpackage/v40;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Ldefpackage/fd5;->g(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    const/4 v6, 0x3

    .line 40
    if-eq v5, v6, :cond_0

    .line 41
    .line 42
    const/4 v6, 0x4

    .line 43
    if-eq v5, v6, :cond_0

    .line 44
    .line 45
    iget-object v5, v1, Ldefpackage/fd5;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 46
    .line 47
    invoke-virtual {v5}, Ldefpackage/s24;->b()V

    .line 48
    .line 49
    .line 50
    iget-object v6, v1, Ldefpackage/fd5;->e:Ldefpackage/aq4;

    .line 51
    .line 52
    invoke-virtual {v6}, Ldefpackage/rx1;->a()Ldefpackage/df1;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-interface {v7, v4, v3}, Ldefpackage/vo4;->h(ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :try_start_0
    invoke-virtual {v5}, Ldefpackage/s24;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    :try_start_1
    invoke-virtual {v7}, Ldefpackage/df1;->b()I

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5}, Ldefpackage/s24;->t()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 66
    .line 67
    .line 68
    :try_start_2
    invoke-virtual {v5}, Ldefpackage/s24;->o()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6, v7}, Ldefpackage/rx1;->h(Ldefpackage/df1;)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :catchall_0
    move-exception p0

    .line 76
    goto :goto_1

    .line 77
    :catchall_1
    move-exception p0

    .line 78
    :try_start_3
    invoke-virtual {v5}, Ldefpackage/s24;->o()V

    .line 79
    .line 80
    .line 81
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 82
    :goto_1
    invoke-virtual {v6, v7}, Ldefpackage/rx1;->h(Ldefpackage/df1;)V

    .line 83
    .line 84
    .line 85
    throw p0

    .line 86
    :cond_0
    :goto_2
    invoke-virtual {v0, v3}, Ldefpackage/wo0;->w(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    iget-object v0, p0, Ldefpackage/sc5;->f:Ldefpackage/pq3;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    const-string v1, "Processor cancelling "

    .line 100
    .line 101
    iget-object v2, v0, Ldefpackage/pq3;->k:Ljava/lang/Object;

    .line 102
    .line 103
    monitor-enter v2

    .line 104
    :try_start_4
    invoke-static {}, Ldefpackage/cx;->f()Ldefpackage/cx;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    sget-object v5, Ldefpackage/pq3;->l:Ljava/lang/String;

    .line 109
    .line 110
    new-instance v6, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {v3, v5, v1}, Ldefpackage/cx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    iget-object v1, v0, Ldefpackage/pq3;->i:Ljava/util/HashSet;

    .line 126
    .line 127
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, p1}, Ldefpackage/pq3;->b(Ljava/lang/String;)Ldefpackage/td5;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 135
    invoke-static {p1, v0, v4}, Ldefpackage/pq3;->d(Ljava/lang/String;Ldefpackage/td5;I)Z

    .line 136
    .line 137
    .line 138
    iget-object p0, p0, Ldefpackage/sc5;->e:Ljava/util/List;

    .line 139
    .line 140
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_2

    .line 149
    .line 150
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Ldefpackage/a64;

    .line 155
    .line 156
    invoke-interface {v0, p1}, Ldefpackage/a64;->d(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_2
    return-void

    .line 161
    :catchall_2
    move-exception p0

    .line 162
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 163
    throw p0
.end method

.method public static i(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 p1, 0x0

    .line 5
    invoke-static {p1, p0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    throw p0
.end method

.method public static j(Ldefpackage/dx2;Ldefpackage/gf1;)Ldefpackage/dx2;
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/t30;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ldefpackage/t30;-><init>(Ldefpackage/gf1;)V

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

.method public static k(Ljava/io/File;Landroid/content/res/Resources;I)Z
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    invoke-static {p0, p1}, Ldefpackage/wr1;->l(Ljava/io/File;Ljava/io/InputStream;)Z

    .line 6
    .line 7
    .line 8
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 12
    .line 13
    .line 14
    :catch_0
    :cond_0
    return p0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    goto :goto_0

    .line 17
    :catchall_1
    move-exception p0

    .line 18
    const/4 p1, 0x0

    .line 19
    :goto_0
    if-eqz p1, :cond_1

    .line 20
    .line 21
    :try_start_3
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 22
    .line 23
    .line 24
    :catch_1
    :cond_1
    throw p0
.end method

.method public static l(Ljava/io/File;Ljava/io/InputStream;)Z
    .locals 5

    .line 1
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskWrites()Landroid/os/StrictMode$ThreadPolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    :try_start_0
    new-instance v3, Ljava/io/FileOutputStream;

    .line 8
    .line 9
    invoke-direct {v3, p0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    .line 11
    .line 12
    const/16 p0, 0x400

    .line 13
    .line 14
    :try_start_1
    new-array p0, p0, [B

    .line 15
    .line 16
    :goto_0
    invoke-virtual {p1, p0}, Ljava/io/InputStream;->read([B)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v4, -0x1

    .line 21
    if-eq v2, v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3, p0, v1, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    move-object v2, v3

    .line 29
    goto :goto_2

    .line 30
    :catch_0
    move-exception p0

    .line 31
    move-object v2, v3

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    :try_start_2
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 34
    .line 35
    .line 36
    :catch_1
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :catchall_1
    move-exception p0

    .line 42
    goto :goto_2

    .line 43
    :catch_2
    move-exception p0

    .line 44
    :goto_1
    :try_start_3
    const-string p1, "TypefaceCompatUtil"

    .line 45
    .line 46
    new-instance v3, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v4, "Error copying resource contents to temp file: "

    .line 52
    .line 53
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p1, p0}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 68
    .line 69
    .line 70
    if-eqz v2, :cond_1

    .line 71
    .line 72
    :try_start_4
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 73
    .line 74
    .line 75
    :catch_3
    :cond_1
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 76
    .line 77
    .line 78
    return v1

    .line 79
    :goto_2
    if-eqz v2, :cond_2

    .line 80
    .line 81
    :try_start_5
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 82
    .line 83
    .line 84
    :catch_4
    :cond_2
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 85
    .line 86
    .line 87
    throw p0
.end method

.method public static m(Landroid/os/Looper;)Landroid/os/Handler;
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Ldefpackage/ne;->b(Landroid/os/Looper;)Landroid/os/Handler;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :try_start_0
    const-class v1, Landroid/os/Handler;

    .line 14
    .line 15
    const-class v2, Landroid/os/Looper;

    .line 16
    .line 17
    const-class v3, Landroid/os/Handler$Callback;

    .line 18
    .line 19
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    filled-new-array {v2, v3, v4}, [Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    .line 31
    filled-new-array {p0, v0, v2}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Landroid/os/Handler;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    return-object v1

    .line 42
    :catch_0
    move-exception p0

    .line 43
    goto :goto_0

    .line 44
    :catch_1
    move-exception v0

    .line 45
    goto :goto_1

    .line 46
    :catch_2
    move-exception v0

    .line 47
    goto :goto_1

    .line 48
    :catch_3
    move-exception v0

    .line 49
    goto :goto_1

    .line 50
    :goto_0
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    instance-of v1, p0, Ljava/lang/RuntimeException;

    .line 55
    .line 56
    if-nez v1, :cond_2

    .line 57
    .line 58
    instance-of v1, p0, Ljava/lang/Error;

    .line 59
    .line 60
    if-nez v1, :cond_1

    .line 61
    .line 62
    invoke-static {p0}, Ldefpackage/er1;->m(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_1
    check-cast p0, Ljava/lang/Error;

    .line 67
    .line 68
    throw p0

    .line 69
    :cond_2
    check-cast p0, Ljava/lang/RuntimeException;

    .line 70
    .line 71
    throw p0

    .line 72
    :goto_1
    const-string v1, "HandlerCompat"

    .line 73
    .line 74
    const-string v2, "Unable to invoke Handler(Looper, Callback, boolean) constructor"

    .line 75
    .line 76
    invoke-static {v1, v2, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 77
    .line 78
    .line 79
    new-instance v0, Landroid/os/Handler;

    .line 80
    .line 81
    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 82
    .line 83
    .line 84
    return-object v0
.end method

.method public static final n(Ldefpackage/q62;)Ldefpackage/q62;
    .locals 2

    .line 1
    invoke-interface {p0}, Ldefpackage/q62;->u()Ldefpackage/q62;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    move-object v1, v0

    .line 6
    move-object v0, p0

    .line 7
    move-object p0, v1

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0}, Ldefpackage/q62;->u()Ldefpackage/q62;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of p0, v0, Ldefpackage/f63;

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    move-object p0, v0

    .line 20
    check-cast p0, Ldefpackage/f63;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    :goto_1
    if-nez p0, :cond_2

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_2
    iget-object v0, p0, Ldefpackage/f63;->J:Ldefpackage/f63;

    .line 28
    .line 29
    :goto_2
    move-object v1, v0

    .line 30
    move-object v0, p0

    .line 31
    move-object p0, v1

    .line 32
    if-eqz p0, :cond_3

    .line 33
    .line 34
    iget-object v0, p0, Ldefpackage/f63;->J:Ldefpackage/f63;

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    return-object v0
.end method

.method public static final o(Ldefpackage/l94;Ldefpackage/if1;)Ldefpackage/i03;
    .locals 7

    .line 1
    const-string v0, "getAllUncoveredSemanticsNodesToIntObjectMap"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Ldefpackage/l94;->a()Ldefpackage/i94;

    .line 7
    .line 8
    .line 9
    move-result-object v5

    .line 10
    iget-object p0, v5, Ldefpackage/i94;->c:Ldefpackage/c72;

    .line 11
    .line 12
    invoke-virtual {p0}, Ldefpackage/c72;->H()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Ldefpackage/c72;->G()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v5}, Ldefpackage/i94;->g()Ldefpackage/wv3;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v4, Ldefpackage/i03;

    .line 30
    .line 31
    const/16 v0, 0x30

    .line 32
    .line 33
    invoke-direct {v4, v0}, Ldefpackage/i03;-><init>(I)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Ldefpackage/si1;

    .line 37
    .line 38
    const/16 v0, 0x17

    .line 39
    .line 40
    invoke-direct {v3, v0}, Ldefpackage/si1;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0}, Ldefpackage/rr2;->Q(Ldefpackage/wv3;)Ldefpackage/k02;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {v3, p0}, Ldefpackage/si1;->L(Ldefpackage/k02;)V

    .line 48
    .line 49
    .line 50
    new-instance v2, Ldefpackage/si1;

    .line 51
    .line 52
    invoke-direct {v2, v0}, Ldefpackage/si1;-><init>(I)V

    .line 53
    .line 54
    .line 55
    move-object v6, v5

    .line 56
    move-object v1, p1

    .line 57
    invoke-static/range {v1 .. v6}, Ldefpackage/wr1;->r(Ldefpackage/if1;Ldefpackage/si1;Ldefpackage/si1;Ldefpackage/i03;Ldefpackage/i94;Ldefpackage/i94;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 61
    .line 62
    .line 63
    return-object v4

    .line 64
    :cond_1
    :goto_0
    :try_start_1
    sget-object p0, Ldefpackage/f02;->a:Ldefpackage/i03;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    .line 68
    .line 69
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 70
    .line 71
    .line 72
    return-object p0

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    move-object p0, v0

    .line 75
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 76
    .line 77
    .line 78
    throw p0
.end method

.method public static final p(Ldefpackage/if1;Ldefpackage/si1;Ldefpackage/si1;Ldefpackage/i03;Ldefpackage/i94;Ldefpackage/i94;)V
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v6, p5

    .line 4
    .line 5
    iget-object v0, v1, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/graphics/Region;

    .line 8
    .line 9
    move-object/from16 v2, p2

    .line 10
    .line 11
    iget-object v3, v2, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v7, v3

    .line 14
    check-cast v7, Landroid/graphics/Region;

    .line 15
    .line 16
    iget-object v3, v6, Ldefpackage/i94;->c:Ldefpackage/c72;

    .line 17
    .line 18
    iget-object v4, v6, Ldefpackage/i94;->c:Ldefpackage/c72;

    .line 19
    .line 20
    invoke-virtual {v3}, Ldefpackage/c72;->H()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_8

    .line 25
    .line 26
    invoke-virtual {v4}, Ldefpackage/c72;->G()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_8

    .line 31
    .line 32
    invoke-virtual {v7}, Landroid/graphics/Region;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_0
    invoke-virtual {v6}, Ldefpackage/i94;->m()Ldefpackage/wv3;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3}, Ldefpackage/wv3;->d()Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    const/4 v8, 0x1

    .line 49
    if-eqz v5, :cond_4

    .line 50
    .line 51
    invoke-virtual {v6}, Ldefpackage/i94;->f()Ldefpackage/g94;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const/4 v5, 0x0

    .line 56
    if-nez v3, :cond_1

    .line 57
    .line 58
    iget-object v3, v4, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 59
    .line 60
    iget-object v3, v3, Ldefpackage/w12;->d:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v3, Ldefpackage/iz1;

    .line 63
    .line 64
    invoke-static {v3}, Ldefpackage/wr1;->n(Ldefpackage/q62;)Ldefpackage/q62;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-interface {v4, v3, v5}, Ldefpackage/q62;->C(Ldefpackage/q62;Z)Ldefpackage/wv3;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    check-cast v3, Ldefpackage/cx2;

    .line 74
    .line 75
    iget-object v3, v3, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 76
    .line 77
    iget-object v4, v6, Ldefpackage/i94;->d:Ldefpackage/e94;

    .line 78
    .line 79
    sget-object v9, Ldefpackage/d94;->b:Ldefpackage/p94;

    .line 80
    .line 81
    iget-object v4, v4, Ldefpackage/e94;->n:Ldefpackage/w03;

    .line 82
    .line 83
    invoke-virtual {v4, v9}, Ldefpackage/w03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    if-nez v4, :cond_2

    .line 88
    .line 89
    const/4 v4, 0x0

    .line 90
    :cond_2
    if-eqz v4, :cond_3

    .line 91
    .line 92
    move v4, v8

    .line 93
    goto :goto_0

    .line 94
    :cond_3
    move v4, v5

    .line 95
    :goto_0
    invoke-static {v3, v4, v5}, Ldefpackage/fu;->s(Ldefpackage/cx2;ZZ)Ldefpackage/wv3;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    :cond_4
    :goto_1
    invoke-static {v3}, Ldefpackage/rr2;->Q(Ldefpackage/wv3;)Ldefpackage/k02;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    invoke-virtual {v1, v9}, Ldefpackage/si1;->L(Ldefpackage/k02;)V

    .line 104
    .line 105
    .line 106
    sget-object v3, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    .line 107
    .line 108
    invoke-virtual {v0, v7, v3}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_9

    .line 113
    .line 114
    iget v3, v6, Ldefpackage/i94;->f:I

    .line 115
    .line 116
    move-object/from16 v4, p4

    .line 117
    .line 118
    iget v5, v4, Ldefpackage/i94;->f:I

    .line 119
    .line 120
    const/4 v10, -0x1

    .line 121
    if-ne v3, v5, :cond_5

    .line 122
    .line 123
    move v3, v10

    .line 124
    :cond_5
    new-instance v5, Ldefpackage/k94;

    .line 125
    .line 126
    invoke-virtual {v0}, Landroid/graphics/Region;->getBounds()Landroid/graphics/Rect;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    new-instance v11, Ldefpackage/k02;

    .line 131
    .line 132
    iget v12, v0, Landroid/graphics/Rect;->left:I

    .line 133
    .line 134
    iget v13, v0, Landroid/graphics/Rect;->top:I

    .line 135
    .line 136
    iget v14, v0, Landroid/graphics/Rect;->right:I

    .line 137
    .line 138
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 139
    .line 140
    invoke-direct {v11, v12, v13, v14, v0}, Ldefpackage/k02;-><init>(IIII)V

    .line 141
    .line 142
    .line 143
    invoke-direct {v5, v6, v11}, Ldefpackage/k94;-><init>(Ldefpackage/i94;Ldefpackage/k02;)V

    .line 144
    .line 145
    .line 146
    move-object/from16 v0, p3

    .line 147
    .line 148
    invoke-virtual {v0, v3, v5}, Ldefpackage/i03;->i(ILjava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    const/4 v3, 0x4

    .line 152
    invoke-static {v3, v6}, Ldefpackage/i94;->j(ILdefpackage/i94;)Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v11

    .line 156
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    sub-int/2addr v3, v8

    .line 161
    move v8, v3

    .line 162
    :goto_2
    if-ge v10, v8, :cond_7

    .line 163
    .line 164
    invoke-interface {v11, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    move-object/from16 v5, p0

    .line 169
    .line 170
    invoke-interface {v5, v3}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    check-cast v3, Ljava/lang/Boolean;

    .line 175
    .line 176
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-eqz v3, :cond_6

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_6
    invoke-interface {v11, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    check-cast v3, Ldefpackage/i94;

    .line 188
    .line 189
    move-object v15, v3

    .line 190
    move-object v3, v0

    .line 191
    move-object v0, v5

    .line 192
    move-object v5, v15

    .line 193
    invoke-static/range {v0 .. v5}, Ldefpackage/wr1;->p(Ldefpackage/if1;Ldefpackage/si1;Ldefpackage/si1;Ldefpackage/i03;Ldefpackage/i94;Ldefpackage/i94;)V

    .line 194
    .line 195
    .line 196
    :goto_3
    add-int/lit8 v8, v8, -0x1

    .line 197
    .line 198
    move-object/from16 v1, p1

    .line 199
    .line 200
    move-object/from16 v2, p2

    .line 201
    .line 202
    move-object/from16 v0, p3

    .line 203
    .line 204
    move-object/from16 v4, p4

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_7
    invoke-static {v6}, Ldefpackage/wr1;->I(Ldefpackage/i94;)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_9

    .line 212
    .line 213
    iget v0, v9, Ldefpackage/k02;->a:I

    .line 214
    .line 215
    iget v1, v9, Ldefpackage/k02;->b:I

    .line 216
    .line 217
    iget v2, v9, Ldefpackage/k02;->c:I

    .line 218
    .line 219
    iget v3, v9, Ldefpackage/k02;->d:I

    .line 220
    .line 221
    sget-object v4, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 222
    .line 223
    move/from16 p1, v0

    .line 224
    .line 225
    move/from16 p2, v1

    .line 226
    .line 227
    move/from16 p3, v2

    .line 228
    .line 229
    move/from16 p4, v3

    .line 230
    .line 231
    move-object/from16 p5, v4

    .line 232
    .line 233
    move-object/from16 p0, v7

    .line 234
    .line 235
    invoke-virtual/range {p0 .. p5}, Landroid/graphics/Region;->op(IIIILandroid/graphics/Region$Op;)Z

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :cond_8
    :goto_4
    invoke-virtual {v6}, Ldefpackage/i94;->o()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_9

    .line 244
    .line 245
    invoke-static/range {p3 .. p5}, Ldefpackage/wr1;->q(Ldefpackage/i03;Ldefpackage/i94;Ldefpackage/i94;)V

    .line 246
    .line 247
    .line 248
    :cond_9
    return-void
.end method

.method public static final q(Ldefpackage/i03;Ldefpackage/i94;Ldefpackage/i94;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ldefpackage/i94;->l()Ldefpackage/i94;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, v0, Ldefpackage/i94;->c:Ldefpackage/c72;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Ldefpackage/c72;->H()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Ldefpackage/i94;->g()Ldefpackage/wv3;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object v0, Ldefpackage/wr1;->f:Ldefpackage/wv3;

    .line 24
    .line 25
    :goto_0
    iget v1, p2, Ldefpackage/i94;->f:I

    .line 26
    .line 27
    iget p1, p1, Ldefpackage/i94;->f:I

    .line 28
    .line 29
    if-ne v1, p1, :cond_1

    .line 30
    .line 31
    const/4 v1, -0x1

    .line 32
    :cond_1
    new-instance p1, Ldefpackage/k94;

    .line 33
    .line 34
    invoke-static {v0}, Ldefpackage/rr2;->Q(Ldefpackage/wv3;)Ldefpackage/k02;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-direct {p1, p2, v0}, Ldefpackage/k94;-><init>(Ldefpackage/i94;Ldefpackage/k02;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v1, p1}, Ldefpackage/i03;->i(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static final r(Ldefpackage/if1;Ldefpackage/si1;Ldefpackage/si1;Ldefpackage/i03;Ldefpackage/i94;Ldefpackage/i94;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v4, p4

    .line 8
    .line 9
    move-object/from16 v6, p5

    .line 10
    .line 11
    iget v2, v4, Ldefpackage/i94;->f:I

    .line 12
    .line 13
    iget-object v5, v1, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v5, Landroid/graphics/Region;

    .line 16
    .line 17
    move-object/from16 v7, p2

    .line 18
    .line 19
    iget-object v8, v7, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v8, Landroid/graphics/Region;

    .line 22
    .line 23
    iget-object v9, v6, Ldefpackage/i94;->c:Ldefpackage/c72;

    .line 24
    .line 25
    iget-object v10, v6, Ldefpackage/i94;->d:Ldefpackage/e94;

    .line 26
    .line 27
    iget-object v11, v6, Ldefpackage/i94;->c:Ldefpackage/c72;

    .line 28
    .line 29
    iget v12, v6, Ldefpackage/i94;->f:I

    .line 30
    .line 31
    invoke-virtual {v9}, Ldefpackage/c72;->H()Z

    .line 32
    .line 33
    .line 34
    move-result v9

    .line 35
    if-eqz v9, :cond_1

    .line 36
    .line 37
    invoke-virtual {v11}, Ldefpackage/c72;->G()Z

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    if-nez v9, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v9, 0x0

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    const/4 v9, 0x1

    .line 47
    :goto_1
    invoke-virtual {v8}, Landroid/graphics/Region;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v15

    .line 51
    if-eqz v15, :cond_2

    .line 52
    .line 53
    if-ne v12, v2, :cond_17

    .line 54
    .line 55
    :cond_2
    if-eqz v9, :cond_3

    .line 56
    .line 57
    invoke-virtual {v6}, Ldefpackage/i94;->o()Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-nez v9, :cond_3

    .line 62
    .line 63
    goto/16 :goto_12

    .line 64
    .line 65
    :cond_3
    invoke-virtual {v6}, Ldefpackage/i94;->m()Ldefpackage/wv3;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    invoke-static {v9}, Ldefpackage/rr2;->Q(Ldefpackage/wv3;)Ldefpackage/k02;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    invoke-virtual {v1, v9}, Ldefpackage/si1;->L(Ldefpackage/k02;)V

    .line 74
    .line 75
    .line 76
    if-ne v12, v2, :cond_4

    .line 77
    .line 78
    const/4 v12, -0x1

    .line 79
    :cond_4
    sget-object v2, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    .line 80
    .line 81
    invoke-virtual {v5, v8, v2}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_15

    .line 86
    .line 87
    new-instance v2, Ldefpackage/k94;

    .line 88
    .line 89
    invoke-virtual {v5}, Landroid/graphics/Region;->getBounds()Landroid/graphics/Rect;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    const/16 v16, 0x1

    .line 94
    .line 95
    new-instance v14, Ldefpackage/k02;

    .line 96
    .line 97
    iget v15, v5, Landroid/graphics/Rect;->left:I

    .line 98
    .line 99
    iget v13, v5, Landroid/graphics/Rect;->top:I

    .line 100
    .line 101
    iget v1, v5, Landroid/graphics/Rect;->right:I

    .line 102
    .line 103
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 104
    .line 105
    invoke-direct {v14, v15, v13, v1, v5}, Ldefpackage/k02;-><init>(IIII)V

    .line 106
    .line 107
    .line 108
    invoke-direct {v2, v6, v14}, Ldefpackage/k94;-><init>(Ldefpackage/i94;Ldefpackage/k02;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v12, v2}, Ldefpackage/i03;->i(ILjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    const/4 v1, 0x4

    .line 115
    invoke-static {v1, v6}, Ldefpackage/i94;->j(ILdefpackage/i94;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v12

    .line 119
    iget-boolean v1, v10, Ldefpackage/e94;->p:Z

    .line 120
    .line 121
    if-eqz v1, :cond_12

    .line 122
    .line 123
    invoke-virtual {v6}, Ldefpackage/i94;->l()Ldefpackage/i94;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    :goto_2
    if-eqz v1, :cond_6

    .line 128
    .line 129
    iget-object v5, v1, Ldefpackage/i94;->d:Ldefpackage/e94;

    .line 130
    .line 131
    iget-object v5, v5, Ldefpackage/e94;->n:Ldefpackage/w03;

    .line 132
    .line 133
    sget-object v13, Ldefpackage/n94;->v:Ldefpackage/p94;

    .line 134
    .line 135
    invoke-virtual {v5, v13}, Ldefpackage/w03;->c(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v13

    .line 139
    if-nez v13, :cond_7

    .line 140
    .line 141
    sget-object v13, Ldefpackage/n94;->u:Ldefpackage/p94;

    .line 142
    .line 143
    invoke-virtual {v5, v13}, Ldefpackage/w03;->c(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-eqz v5, :cond_5

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_5
    invoke-virtual {v1}, Ldefpackage/i94;->l()Ldefpackage/i94;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    goto :goto_2

    .line 155
    :cond_6
    const/4 v1, 0x0

    .line 156
    :cond_7
    :goto_3
    if-eqz v1, :cond_d

    .line 157
    .line 158
    invoke-virtual {v6}, Ldefpackage/i94;->d()Ldefpackage/f63;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    if-eqz v5, :cond_9

    .line 163
    .line 164
    invoke-virtual {v5}, Ldefpackage/f63;->A0()Ldefpackage/cx2;

    .line 165
    .line 166
    .line 167
    move-result-object v13

    .line 168
    iget-boolean v13, v13, Ldefpackage/cx2;->A:Z

    .line 169
    .line 170
    if-eqz v13, :cond_8

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_8
    const/4 v5, 0x0

    .line 174
    :goto_4
    if-eqz v5, :cond_9

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_9
    const/4 v5, 0x0

    .line 178
    :goto_5
    invoke-virtual {v1}, Ldefpackage/i94;->d()Ldefpackage/f63;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    if-eqz v1, :cond_b

    .line 183
    .line 184
    invoke-virtual {v1}, Ldefpackage/f63;->A0()Ldefpackage/cx2;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    iget-boolean v13, v13, Ldefpackage/cx2;->A:Z

    .line 189
    .line 190
    if-eqz v13, :cond_a

    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_a
    const/4 v1, 0x0

    .line 194
    :goto_6
    if-eqz v1, :cond_b

    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_b
    const/4 v1, 0x0

    .line 198
    :goto_7
    if-eqz v5, :cond_d

    .line 199
    .line 200
    if-nez v1, :cond_c

    .line 201
    .line 202
    goto :goto_8

    .line 203
    :cond_c
    const/4 v13, 0x0

    .line 204
    invoke-virtual {v1, v5, v13}, Ldefpackage/f63;->C(Ldefpackage/q62;Z)Ldefpackage/wv3;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    iget-wide v13, v1, Ldefpackage/jg3;->p:J

    .line 209
    .line 210
    invoke-static {v13, v14}, Ldefpackage/l93;->o0(J)J

    .line 211
    .line 212
    .line 213
    move-result-wide v13

    .line 214
    const-wide/16 v2, 0x0

    .line 215
    .line 216
    invoke-static {v2, v3, v13, v14}, Ldefpackage/bu;->d(JJ)Ldefpackage/wv3;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-virtual {v5, v2}, Ldefpackage/wv3;->c(Ldefpackage/wv3;)Ldefpackage/wv3;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-virtual {v5, v2}, Ldefpackage/wv3;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    xor-int/lit8 v2, v2, 0x1

    .line 229
    .line 230
    goto :goto_9

    .line 231
    :cond_d
    :goto_8
    const/4 v2, 0x0

    .line 232
    :goto_9
    if-eqz v2, :cond_12

    .line 233
    .line 234
    new-instance v2, Ldefpackage/si1;

    .line 235
    .line 236
    const/16 v7, 0x17

    .line 237
    .line 238
    invoke-direct {v2, v7}, Ldefpackage/si1;-><init>(I)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v6}, Ldefpackage/i94;->f()Ldefpackage/g94;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    if-nez v3, :cond_e

    .line 246
    .line 247
    iget-object v1, v11, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 248
    .line 249
    iget-object v1, v1, Ldefpackage/w12;->d:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v1, Ldefpackage/iz1;

    .line 252
    .line 253
    invoke-static {v1}, Ldefpackage/wr1;->n(Ldefpackage/q62;)Ldefpackage/q62;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    const/4 v13, 0x0

    .line 258
    invoke-interface {v3, v1, v13}, Ldefpackage/q62;->C(Ldefpackage/q62;Z)Ldefpackage/wv3;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    goto :goto_d

    .line 263
    :cond_e
    check-cast v3, Ldefpackage/cx2;

    .line 264
    .line 265
    iget-object v3, v3, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 266
    .line 267
    sget-object v5, Ldefpackage/d94;->b:Ldefpackage/p94;

    .line 268
    .line 269
    iget-object v10, v10, Ldefpackage/e94;->n:Ldefpackage/w03;

    .line 270
    .line 271
    invoke-virtual {v10, v5}, Ldefpackage/w03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    if-nez v5, :cond_f

    .line 276
    .line 277
    const/4 v1, 0x0

    .line 278
    goto :goto_a

    .line 279
    :cond_f
    move-object v1, v5

    .line 280
    :goto_a
    if-eqz v1, :cond_10

    .line 281
    .line 282
    move/from16 v13, v16

    .line 283
    .line 284
    :goto_b
    const/4 v1, 0x0

    .line 285
    goto :goto_c

    .line 286
    :cond_10
    const/4 v13, 0x0

    .line 287
    goto :goto_b

    .line 288
    :goto_c
    invoke-static {v3, v13, v1}, Ldefpackage/fu;->s(Ldefpackage/cx2;ZZ)Ldefpackage/wv3;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    :goto_d
    invoke-static {v1}, Ldefpackage/rr2;->Q(Ldefpackage/wv3;)Ldefpackage/k02;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-virtual {v2, v1}, Ldefpackage/si1;->L(Ldefpackage/k02;)V

    .line 297
    .line 298
    .line 299
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    add-int/lit8 v1, v1, -0x1

    .line 304
    .line 305
    move v10, v1

    .line 306
    :goto_e
    const/4 v1, -0x1

    .line 307
    if-ge v1, v10, :cond_14

    .line 308
    .line 309
    invoke-interface {v12, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-interface {v0, v1}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    check-cast v1, Ljava/lang/Boolean;

    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    if-eqz v1, :cond_11

    .line 324
    .line 325
    goto :goto_f

    .line 326
    :cond_11
    invoke-interface {v12, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    move-object v5, v1

    .line 331
    check-cast v5, Ldefpackage/i94;

    .line 332
    .line 333
    new-instance v1, Ldefpackage/si1;

    .line 334
    .line 335
    invoke-direct {v1, v7}, Ldefpackage/si1;-><init>(I)V

    .line 336
    .line 337
    .line 338
    move-object/from16 v3, p3

    .line 339
    .line 340
    invoke-static/range {v0 .. v5}, Ldefpackage/wr1;->p(Ldefpackage/if1;Ldefpackage/si1;Ldefpackage/si1;Ldefpackage/i03;Ldefpackage/i94;Ldefpackage/i94;)V

    .line 341
    .line 342
    .line 343
    :goto_f
    add-int/lit8 v10, v10, -0x1

    .line 344
    .line 345
    move-object/from16 v4, p4

    .line 346
    .line 347
    goto :goto_e

    .line 348
    :cond_12
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 349
    .line 350
    .line 351
    move-result v1

    .line 352
    add-int/lit8 v1, v1, -0x1

    .line 353
    .line 354
    move v10, v1

    .line 355
    :goto_10
    const/4 v1, -0x1

    .line 356
    if-ge v1, v10, :cond_14

    .line 357
    .line 358
    invoke-interface {v12, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    invoke-interface {v0, v1}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    check-cast v1, Ljava/lang/Boolean;

    .line 367
    .line 368
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    if-eqz v1, :cond_13

    .line 373
    .line 374
    move-object/from16 v3, p3

    .line 375
    .line 376
    goto :goto_11

    .line 377
    :cond_13
    invoke-interface {v12, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    move-object v5, v1

    .line 382
    check-cast v5, Ldefpackage/i94;

    .line 383
    .line 384
    move-object/from16 v1, p1

    .line 385
    .line 386
    move-object/from16 v3, p3

    .line 387
    .line 388
    move-object/from16 v4, p4

    .line 389
    .line 390
    move-object v2, v7

    .line 391
    invoke-static/range {v0 .. v5}, Ldefpackage/wr1;->r(Ldefpackage/if1;Ldefpackage/si1;Ldefpackage/si1;Ldefpackage/i03;Ldefpackage/i94;Ldefpackage/i94;)V

    .line 392
    .line 393
    .line 394
    :goto_11
    add-int/lit8 v10, v10, -0x1

    .line 395
    .line 396
    move-object/from16 v0, p0

    .line 397
    .line 398
    move-object/from16 v7, p2

    .line 399
    .line 400
    goto :goto_10

    .line 401
    :cond_14
    invoke-static {v6}, Ldefpackage/wr1;->I(Ldefpackage/i94;)Z

    .line 402
    .line 403
    .line 404
    move-result v0

    .line 405
    if-eqz v0, :cond_17

    .line 406
    .line 407
    iget v0, v9, Ldefpackage/k02;->a:I

    .line 408
    .line 409
    iget v1, v9, Ldefpackage/k02;->b:I

    .line 410
    .line 411
    iget v2, v9, Ldefpackage/k02;->c:I

    .line 412
    .line 413
    iget v3, v9, Ldefpackage/k02;->d:I

    .line 414
    .line 415
    sget-object v4, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 416
    .line 417
    move/from16 p1, v0

    .line 418
    .line 419
    move/from16 p2, v1

    .line 420
    .line 421
    move/from16 p3, v2

    .line 422
    .line 423
    move/from16 p4, v3

    .line 424
    .line 425
    move-object/from16 p5, v4

    .line 426
    .line 427
    move-object/from16 p0, v8

    .line 428
    .line 429
    invoke-virtual/range {p0 .. p5}, Landroid/graphics/Region;->op(IIIILandroid/graphics/Region$Op;)Z

    .line 430
    .line 431
    .line 432
    return-void

    .line 433
    :cond_15
    invoke-virtual {v6}, Ldefpackage/i94;->o()Z

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    if-eqz v0, :cond_16

    .line 438
    .line 439
    invoke-static/range {p3 .. p5}, Ldefpackage/wr1;->q(Ldefpackage/i03;Ldefpackage/i94;Ldefpackage/i94;)V

    .line 440
    .line 441
    .line 442
    return-void

    .line 443
    :cond_16
    const/4 v1, -0x1

    .line 444
    if-ne v12, v1, :cond_17

    .line 445
    .line 446
    new-instance v0, Ldefpackage/k94;

    .line 447
    .line 448
    invoke-virtual {v5}, Landroid/graphics/Region;->getBounds()Landroid/graphics/Rect;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    new-instance v2, Ldefpackage/k02;

    .line 453
    .line 454
    iget v4, v1, Landroid/graphics/Rect;->left:I

    .line 455
    .line 456
    iget v5, v1, Landroid/graphics/Rect;->top:I

    .line 457
    .line 458
    iget v7, v1, Landroid/graphics/Rect;->right:I

    .line 459
    .line 460
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 461
    .line 462
    invoke-direct {v2, v4, v5, v7, v1}, Ldefpackage/k02;-><init>(IIII)V

    .line 463
    .line 464
    .line 465
    invoke-direct {v0, v6, v2}, Ldefpackage/k94;-><init>(Ldefpackage/i94;Ldefpackage/k02;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v3, v12, v0}, Ldefpackage/i03;->i(ILjava/lang/Object;)V

    .line 469
    .line 470
    .line 471
    :cond_17
    :goto_12
    return-void
.end method

.method public static w(I)I
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    if-eq p0, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x1e

    .line 6
    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    packed-switch p0, :pswitch_data_1

    .line 13
    .line 14
    .line 15
    const p0, -0x7fffffff

    .line 16
    .line 17
    .line 18
    return p0

    .line 19
    :pswitch_0
    const p0, 0x52080

    .line 20
    .line 21
    .line 22
    return p0

    .line 23
    :pswitch_1
    const p0, 0x3e800

    .line 24
    .line 25
    .line 26
    return p0

    .line 27
    :pswitch_2
    const/16 p0, 0x1f40

    .line 28
    .line 29
    return p0

    .line 30
    :pswitch_3
    const p0, 0x2ebae4

    .line 31
    .line 32
    .line 33
    return p0

    .line 34
    :pswitch_4
    const/16 p0, 0x1b58

    .line 35
    .line 36
    return p0

    .line 37
    :pswitch_5
    const/16 p0, 0x3e80

    .line 38
    .line 39
    return p0

    .line 40
    :pswitch_6
    const p0, 0x186a0

    .line 41
    .line 42
    .line 43
    return p0

    .line 44
    :pswitch_7
    const p0, 0x9c40

    .line 45
    .line 46
    .line 47
    return p0

    .line 48
    :pswitch_8
    const p0, 0x2ee00

    .line 49
    .line 50
    .line 51
    return p0

    .line 52
    :pswitch_9
    const p0, 0xbb800

    .line 53
    .line 54
    .line 55
    return p0

    .line 56
    :pswitch_a
    const p0, 0x13880

    .line 57
    .line 58
    .line 59
    return p0

    .line 60
    :cond_0
    :pswitch_b
    const p0, 0x225510

    .line 61
    .line 62
    .line 63
    return p0

    .line 64
    :cond_1
    const p0, 0xf906

    .line 65
    .line 66
    .line 67
    return p0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_b
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_9
    .end packed-switch
.end method


# virtual methods
.method public abstract B()I
.end method

.method public D(Landroid/view/View;)F
    .locals 0

    .line 1
    sget-boolean p0, Ldefpackage/wr1;->i:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-static {p1}, Ldefpackage/lm4;->a(Landroid/view/View;)F

    .line 6
    .line 7
    .line 8
    move-result p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return p0

    .line 10
    :catch_0
    const/4 p0, 0x0

    .line 11
    sput-boolean p0, Ldefpackage/wr1;->i:Z

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public abstract G(F)Z
.end method

.method public abstract J(Landroid/view/View;)Z
.end method

.method public abstract L(FF)Z
.end method

.method public R(Landroid/view/View;F)V
    .locals 0

    .line 1
    sget-boolean p0, Ldefpackage/wr1;->i:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-static {p1, p2}, Ldefpackage/lm4;->r(Landroid/view/View;F)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    const/4 p0, 0x0

    .line 10
    sput-boolean p0, Ldefpackage/wr1;->i:Z

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public abstract S(Landroid/view/View;F)Z
.end method

.method public abstract T(Landroid/view/ViewGroup$MarginLayoutParams;I)V
.end method

.method public abstract U(Landroid/view/ViewGroup$MarginLayoutParams;II)V
.end method

.method public abstract e(Landroid/view/ViewGroup$MarginLayoutParams;)I
.end method

.method public abstract f(I)F
.end method

.method public abstract s(Landroid/view/ViewGroup$MarginLayoutParams;)I
.end method

.method public abstract t()I
.end method

.method public abstract u()I
.end method

.method public abstract v()I
.end method

.method public abstract x()I
.end method

.method public abstract y(Landroid/view/View;)I
.end method

.method public abstract z(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)I
.end method
